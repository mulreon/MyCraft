package io.github.mulreon.mycraft

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class MyCraft: ModInitializer {
    private val modId = "mycraft"
    private val logger: Logger = LoggerFactory.getLogger(modId)
    override fun onInitialize() {
        logger.info("The MyCraft Mod is Loading...")
    }
}