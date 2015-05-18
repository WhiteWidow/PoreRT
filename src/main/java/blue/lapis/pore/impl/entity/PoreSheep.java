/*
 * Pore
 * Copyright (c) 2014-2015, Lapis <https://github.com/LapisBlue>
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

import blue.lapis.pore.converter.type.material.DyeColorConverter;
import blue.lapis.pore.converter.wrapper.WrapperConverter;

import org.bukkit.DyeColor;
import org.bukkit.entity.EntityType;
import org.spongepowered.api.data.manipulator.DyeableData;
import org.spongepowered.api.data.manipulator.entity.ShearedData;
import org.spongepowered.api.entity.living.animal.Sheep;

public class PoreSheep extends PoreAnimals implements org.bukkit.entity.Sheep {

    public static PoreSheep of(Sheep handle) {
        return WrapperConverter.of(PoreSheep.class, handle);
    }

    protected PoreSheep(Sheep handle) {
        super(handle);
    }

    @Override
    public Sheep getHandle() {
        return (Sheep) super.getHandle();
    }

    @Override
    public EntityType getType() {
        return EntityType.SHEEP;
    }

    @Override
    public boolean isSheared() {
        return has(ShearedData.class);
    }

    @Override
    public void setSheared(boolean flag) {
        if (flag != isSheared()) {
            if (flag) {
                set(getOrCreate(ShearedData.class));
            } else {
                remove(ShearedData.class);
            }
        }
    }

    @Override
    public DyeColor getColor() {
        return DyeColorConverter.of(get(DyeableData.class).getValue());
    }

    @Override
    public void setColor(DyeColor color) {
        DyeableData dyeable = getOrCreate(DyeableData.class);
        dyeable.setValue(DyeColorConverter.of(color));
        set(dyeable);
    }
}
