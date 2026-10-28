package io.github.carlaun12.lookthatclouds;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LookThatCloudsClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("lookthatclouds");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Look That Clouds initialized (scaffold only).");
    }
}
