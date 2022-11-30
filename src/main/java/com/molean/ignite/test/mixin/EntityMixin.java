package com.molean.ignite.test.mixin;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin
{
    @Shadow
    private float yRot;
    
    @Shadow
    public float yRotO;

    @Shadow public @Nullable abstract Entity getControllingPassenger();

    @Shadow public Level level;

    public float getMainYaw(float partialTicks)
    {
        return partialTicks == 1.0F ? this.yRot : Mth.lerp(partialTicks, this.yRotO, this.yRot);
    }

    @Inject(method = "isControlledByLocalInstance", at = @At("HEAD"))
    private void isFakePlayer(CallbackInfoReturnable<Boolean> cir)
    {
        System.out.println("qwq");

    }
}
