package com.dasik.betterprogression

import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory

object BetterVanillaProgressionClient : ClientModInitializer {
    private val logger = LoggerFactory.getLogger(BetterVanillaProgression.MOD_ID)

    override fun onInitializeClient() {
        logger.info("Better Vanilla Progression client initialized!")
    }
}
