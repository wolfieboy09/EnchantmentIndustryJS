package dev.wolfieboy09.eijs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import plus.dragons.createenchantmentindustry.api.PrintEntryRegisterEvent;

public class Events {
    public static void init() {
        MinecraftForge.EVENT_BUS.addListener(Events::registerPrinterEntries);
    }

    public static void registerPrinterEntries(PrintEntryRegisterEvent event) {
        // test
        System.out.println("ENTRY CALLED");
    }
}
