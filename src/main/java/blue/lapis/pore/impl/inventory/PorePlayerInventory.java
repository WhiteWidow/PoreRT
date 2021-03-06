/*
 * Pore
 * Copyright (c) 2014-2016, Lapis <https://github.com/LapisBlue>
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package blue.lapis.pore.impl.inventory;

import blue.lapis.pore.converter.type.material.DurabilityConverter;
import blue.lapis.pore.converter.type.material.ItemStackConverter;
import blue.lapis.pore.converter.type.material.MaterialConverter;
import blue.lapis.pore.converter.wrapper.WrapperConverter;
import blue.lapis.pore.impl.entity.PorePlayer;

import com.google.common.collect.Iterables;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spongepowered.api.item.inventory.Slot;
import org.spongepowered.api.item.inventory.entity.Hotbar;
import org.spongepowered.api.item.inventory.entity.PlayerInventory;
import org.spongepowered.api.item.inventory.equipment.EquipmentTypes;
import org.spongepowered.api.item.inventory.property.SlotIndex;

import java.util.Optional;

public class PorePlayerInventory extends PoreInventory implements org.bukkit.inventory.PlayerInventory {

    public static PorePlayerInventory of(PlayerInventory handle) {
        return WrapperConverter.of(PorePlayerInventory.class, handle);
    }

    protected PorePlayerInventory(PlayerInventory handle) {
        super(handle);
    }

    @Override
    public PlayerInventory getHandle() {
        return (PlayerInventory) super.getHandle();
    }

    @Override
    public ItemStack[] getArmorContents() {
        return new ItemStack[]{this.getHelmet(), this.getChestplate(), this.getLeggings(), this.getBoots()};
    }

    @Override
    public ItemStack getHelmet() {
        return ItemStackConverter.of(getHandle().getCarrier().orElse(null).getHelmet().orElse(null));
    }

    @Override
    public ItemStack getChestplate() {
        return ItemStackConverter.of(getHandle().getCarrier().orElse(null).getChestplate().orElse(null));
    }

    @Override
    public ItemStack getLeggings() {
        return ItemStackConverter.of(getHandle().getCarrier().orElse(null).getLeggings().orElse(null));
    }

    @Override
    public ItemStack getBoots() {
        return ItemStackConverter.of(getHandle().getCarrier().orElse(null).getBoots().orElse(null));
    }

    @Override
    public void setArmorContents(ItemStack[] items) {
        final int length = items.length;
        if (length > 0) {
            this.setHelmet(items[0]);
        }
        if (length > 1) {
            this.setChestplate(items[1]);
        }
        if (length > 2) {
            this.setLeggings(items[2]);
        }
        if (length > 3) {
            this.setBoots(items[3]);
        }
    }

    @Override
    public void setHelmet(ItemStack helmet) {
        // this code relies on the notion that Mojang won't implement hydra-people or something
        Iterables.get(this.getHandle().query(EquipmentTypes.HEADWEAR).<Slot>slots(), 0)
                .set(ItemStackConverter.of(helmet));
    }

    @Override
    public void setChestplate(ItemStack chestplate) {
        Iterables.get(this.getHandle().query(EquipmentTypes.CHESTPLATE).<Slot>slots(), 0)
                .set(ItemStackConverter.of(chestplate));
    }

    @Override
    public void setLeggings(ItemStack leggings) {
        Iterables.get(this.getHandle().query(EquipmentTypes.LEGGINGS).<Slot>slots(), 0)
                .set(ItemStackConverter.of(leggings));
    }

    @Override
    public void setBoots(ItemStack boots) {
        Iterables.get(this.getHandle().query(EquipmentTypes.BOOTS).<Slot>slots(), 0)
                .set(ItemStackConverter.of(boots));
    }

    @Override
    public ItemStack getItemInHand() {
        Hotbar hotbar = this.getHandle().getHotbar();
        Optional<Slot> slot = hotbar.getSlot(new SlotIndex(hotbar.getSelectedSlotIndex()));
        if (slot.isPresent()) {
            Optional<org.spongepowered.api.item.inventory.ItemStack> stack = slot.get().peek();
            if (stack.isPresent()) {
                return ItemStackConverter.of(stack.get());
            }
        }
        return null;
    }

    @Override
    public void setItemInHand(ItemStack stack) {
        Hotbar hotbar = this.getHandle().getHotbar();
        Optional<Slot> slot = hotbar.getSlot(new SlotIndex(hotbar.getSelectedSlotIndex()));
        if (slot.isPresent()) {
            slot.get().set(ItemStackConverter.of(stack));
        }
    }

    @Override
    public int getHeldItemSlot() {
        return this.getHandle().getHotbar().getSelectedSlotIndex();
    }

    @Override
    public void setHeldItemSlot(int slot) {
        Validate.isTrue(slot >= 0 || slot <= 8, "Invalid hotbar slot index");
        this.getHandle().getHotbar().setSelectedSlotIndex(slot);
    }

    @Override
    @SuppressWarnings("deprecation")
    public int clear(int id, int data) {
        int removed = 0;
        for (Slot slot : this.getHandle().<Slot>slots()) {
            Optional<org.spongepowered.api.item.inventory.ItemStack> stackOptional = slot.peek();
            if (stackOptional.isPresent()) {
                org.spongepowered.api.item.inventory.ItemStack stack = stackOptional.get();
                if (id == -1 || stack.getItem() == MaterialConverter.asItem(Material.getMaterial(id))) {
                    int damage = DurabilityConverter.getDamageValue(stack.getContainers());
                    if (data == -1 || damage == data) {
                        removed += stack.getQuantity();
                        slot.clear();
                    }
                }
            }
        }
        return removed;
    }

    @Override
    public Player getHolder() {
        if (this.getHandle().getCarrier().isPresent()) {
            if (this.getHandle().getCarrier().get() instanceof org.spongepowered.api.entity.living.player.Player) {
                return PorePlayer.of(this.getHandle().getCarrier().get());
            }
        }
        return null;
    }

    @Override
    public ItemStack[] getExtraContents() {
        // TODO Auto-generated method stub
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setExtraContents(ItemStack[] items) {
        // TODO Auto-generated method stub
        throw new NotImplementedException("TODO");
    }

    @Override
    public ItemStack getItemInMainHand() {
        org.spongepowered.api.item.inventory.ItemStack item = null;
        Hotbar hotbar = getHandle().getHotbar();
        Optional<Slot> mainHand = hotbar.getSlot(SlotIndex.of(hotbar.getSelectedSlotIndex()));
        if (mainHand.isPresent()) {
            Optional<org.spongepowered.api.item.inventory.ItemStack> optitem = mainHand.get().peek();
            if (optitem.isPresent()) {
                item = optitem.get();
            }
        }
        return ItemStackConverter.of(item);
    }

    @Override
    public void setItemInMainHand(ItemStack item) {
        Hotbar hotbar = getHandle().getHotbar();
        Optional<Slot> mainHand = hotbar.getSlot(SlotIndex.of(hotbar.getSelectedSlotIndex()));
        mainHand.get().offer(ItemStackConverter.of(item));
    }

    @Override
    public ItemStack getItemInOffHand() {
        return ItemStackConverter.of(getHandle().getOffhand().peek().get());
    }

    @Override
    public void setItemInOffHand(ItemStack item) {
        getHandle().getOffhand().set(ItemStackConverter.of(item));
    }
}
