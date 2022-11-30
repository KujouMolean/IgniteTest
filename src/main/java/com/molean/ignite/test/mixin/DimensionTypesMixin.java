package com.molean.ignite.test.mixin;

import net.minecraft.data.worldgen.DimensionTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(DimensionTypes.class)
public class DimensionTypesMixin {
    @ModifyArg(method = "bootstrap",at=@At(value = "INVOKE",
            target = "Lnet/minecraft/world/level/dimension/DimensionType;<init>(Ljava/util/OptionalLong;" +
                    "ZZZZDZZIIILnet/minecraft/tags/TagKey;" +
                    "Lnet/minecraft/resources/ResourceLocation;" +
                    "FLnet/minecraft/world/level/dimension/DimensionType$MonsterSettings;)V",ordinal = 1),index = 5)
    private static double on(double var5) {
        return 1.0;
    }
}
