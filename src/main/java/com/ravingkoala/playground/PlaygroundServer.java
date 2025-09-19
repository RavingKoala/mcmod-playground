package com.ravingkoala.playground;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.neoforged.neoforge.server.console.TerminalHandler;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = Playground.MOD_ID, dist = Dist.DEDICATED_SERVER)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = Playground.MOD_ID, value = Dist.DEDICATED_SERVER)
public class PlaygroundServer {
    public PlaygroundServer(ModContainer container) {

    }

    @SubscribeEvent
    static void onServerSetup(FMLDedicatedServerSetupEvent event) {
        // Some server setup code
        Playground.LOGGER.info("HELLO FROM SERVER SETUP");

    }
}
