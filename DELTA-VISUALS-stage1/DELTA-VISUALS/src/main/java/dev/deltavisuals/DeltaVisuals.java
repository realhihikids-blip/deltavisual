package dev.deltavisuals;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entrypoint. Feature registration will be added in the next stages.
 */
public final class DeltaVisuals implements ModInitializer {
    public static final String MOD_ID = "delta_visuals";
    public static final Logger LOGGER = LoggerFactory.getLogger("DELTA VISUALS");

    @Override
    public void onInitialize() {
        LOGGER.info("DELTA VISUALS foundation initialized.");
    }
}
