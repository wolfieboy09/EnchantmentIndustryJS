package dev.wolfieboy09.eijs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import plus.dragons.createenchantmentindustry.api.PrintEntryRegisterEvent;

public class EventHandler {
    public static void init() {
        MinecraftForge.EVENT_BUS.addListener(EventHandler::registerPrinterEntries);
    }

    @SubscribeEvent
    public static void registerPrinterEntries(PrintEntryRegisterEvent event) {
        System.out.println("ENTRY EVENT");
    }
}
