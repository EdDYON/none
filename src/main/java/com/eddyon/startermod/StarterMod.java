package com.eddyon.startermod;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(StarterMod.MODID)
public final class StarterMod {
    public static final String MODID = "startermod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public StarterMod(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Starter Mod is ready.");
    }
}
