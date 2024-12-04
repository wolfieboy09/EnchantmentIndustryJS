package dev.wolfieboy09.eijs;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(EnchantmentIndustryJS.MOD_ID)
public class EnchantmentIndustryJS {

    public static final String MOD_ID = "enchantmentindustryjs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EnchantmentIndustryJS() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.register(this);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(Events::init);
    }
}
