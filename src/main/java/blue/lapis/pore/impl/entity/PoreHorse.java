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

package blue.lapis.pore.impl.entity;

import blue.lapis.pore.converter.type.entity.HorseConverter;
import blue.lapis.pore.converter.wrapper.WrapperConverter;
import blue.lapis.pore.impl.inventory.PoreHorseInventory;

import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.HorseInventory;
import org.spongepowered.api.entity.living.animal.Horse;

@SuppressWarnings("deprecation")
public class PoreHorse extends PoreTameable implements org.bukkit.entity.Horse {

    public static PoreHorse of(Horse handle) {
        return WrapperConverter.of(PoreHorse.class, handle);
    }

    protected PoreHorse(Horse handle) {
        super(handle);
    }

    @Override
    public Horse getHandle() {
        return (Horse) super.getHandle();
    }

    @Override
    public EntityType getType() {
        return EntityType.HORSE;
    }

    @Override
    public Variant getVariant() {
        return HorseConverter.of(getHandle().getHorseData().variant().get());
    }

    @Override
    public void setVariant(Variant variant) {
        getHandle().getHorseData().variant().set(HorseConverter.of(variant));
    }

    @Override
    public Color getColor() {
        return HorseConverter.of(getHandle().getHorseData().color().get());
    }

    @Override
    public void setColor(Color color) {
        getHandle().getHorseData().color().set(HorseConverter.of(color));
    }

    @Override
    public Style getStyle() {
        return HorseConverter.of(getHandle().getHorseData().style().get());
    }

    @Override
    public void setStyle(Style style) {
        getHandle().getHorseData().style().set(HorseConverter.of(style));
    }

    @Override
    public boolean isCarryingChest() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setCarryingChest(boolean chest) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public int getDomestication() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setDomestication(int level) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public int getMaxDomestication() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setMaxDomestication(int level) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public double getJumpStrength() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setJumpStrength(double strength) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public HorseInventory getInventory() {
        return PoreHorseInventory.of(getHandle().getInventory());
    }

}
