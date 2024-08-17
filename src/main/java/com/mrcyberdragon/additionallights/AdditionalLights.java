package com.mrcyberdragon.additionallights;

import com.mojang.logging.LogUtils;
import com.mrcyberdragon.additionallights.init.ModBlockEntities;
import com.mrcyberdragon.additionallights.init.ModBlocks;
import com.mrcyberdragon.additionallights.init.ModCreativeTab;
import com.mrcyberdragon.additionallights.init.ModItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AdditionalLights.MODID)
public class AdditionalLights
{
    public static final String MODID = "morelights";

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(AdditionalLights.MODID);
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public AdditionalLights()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        REGISTRATE.registerEventListeners(modEventBus);
        ModCreativeTab.register(modEventBus);
        ModBlocks.register();
        ModItems.register();
        ModBlockEntities.register();
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

    }
}
