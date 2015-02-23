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
package blue.lapis.pore.impl.event.entity;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import blue.lapis.pore.converter.type.EntityConverter;
import blue.lapis.pore.impl.entity.PoreCreeper;

import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.spongepowered.api.event.entity.EntityEvent;

//TODO: we could wrap a LightningStrikeEvent, but that could encase multiple entities
public class PoreCreeperPowerEvent extends CreeperPowerEvent {

    private final EntityEvent handle;

    public PoreCreeperPowerEvent(EntityEvent handle) {
        super(null, null);
        this.handle = checkNotNull(handle, "handle");
        checkState(handle.getEntity() instanceof org.spongepowered.api.entity.living.monster.Creeper,
                "Bad entity type");
    }

    public EntityEvent getHandle() {
        return this.handle;
    }

    @Override
    public Creeper getEntity() {
        return (Creeper) PoreCreeper.of(this.getHandle().getEntity());
    }

    @Override
    public EntityType getEntityType() {
        return EntityConverter.of(this.getHandle().getEntity().getType());
    }

    @Override
    public LightningStrike getLightning() {
        throw new NotImplementedException();
    }

    @Override
    public PowerCause getCause() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isCancelled() {
        throw new NotImplementedException();
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new NotImplementedException();
    }
}
