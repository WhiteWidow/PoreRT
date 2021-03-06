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

import blue.lapis.pore.converter.type.entity.EntityConverter;
import blue.lapis.pore.event.PoreEvent;
import blue.lapis.pore.event.RegisterEvent;
import blue.lapis.pore.impl.entity.PoreEntity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityCombustEvent;
import org.spongepowered.api.event.entity.IgniteEntityEvent;

@RegisterEvent
public final class PoreEntityCombustEvent extends EntityCombustEvent implements PoreEvent<IgniteEntityEvent> {

    private final IgniteEntityEvent handle;

    public PoreEntityCombustEvent(IgniteEntityEvent handle) {
        super(null, -1);
        this.handle = checkNotNull(handle, "handle");
    }

    public IgniteEntityEvent getHandle() {
        return this.handle;
    }

    @Override
    public Entity getEntity() {
        return PoreEntity.of(this.getHandle().getTargetEntity());
    }

    @Override
    public EntityType getEntityType() {
        return EntityConverter.of(this.getHandle().getTargetEntity().getType());
    }

    @Override
    public int getDuration() {
        return this.getHandle().getFireTicks();
    }

    @Override
    public void setDuration(int duration) {
        this.getHandle().setFireTicks(duration);
    }

    @Override
    public boolean isCancelled() {
        return this.getHandle().isCancelled();
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.getHandle().setCancelled(cancel);
    }

    @Override
    public String toString() {
        return toStringHelper().toString();
    }
}
