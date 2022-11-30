package com.molean.ignite.test;

import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import space.vectrix.ignite.api.Platform;
import space.vectrix.ignite.api.event.Subscribe;
import space.vectrix.ignite.api.event.platform.PlatformInitializeEvent;

public class Test {

    private final Logger logger;
    private final Platform platform;

    @Inject
    public Test(Logger logger, Platform platform) {
        this.logger = logger;
        this.platform = platform;this.logger.info("Hello World!");System.out.println(net.minecraft.world.entity.player.Player.class);
    }

    @Subscribe
    public void onInitialize(PlatformInitializeEvent event) {
        System.out.println(net.minecraft.world.entity.player.Player.class);

    }


}