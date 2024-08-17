package com.mrcyberdragon.additionallights.init;

import com.mrcyberdragon.additionallights.AdditionalLights;
import com.tterrag.registrate.util.entry.RegistryEntry;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdditionalLights.MODID);

    public static final RegistryObject<CreativeModeTab> ADDITIONAL_LIGHTS_TAB = TABS.register("morelightstab", ()-> CreativeModeTab.builder()
            .icon(()-> new ItemStack(ModBlocks.SMALL_LIGHT_WITH_REFLECTOR.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("tab.morelightstab"))
            .displayItems(new RegistrateDisplayItemsGenerator())
            .build());
    public static void register(IEventBus eventBus){
        TABS.register(eventBus);
    }

    public static class RegistrateDisplayItemsGenerator implements CreativeModeTab.DisplayItemsGenerator {

        private List<Item> collectBlocks(RegistryObject<CreativeModeTab> tab) {
            List<Item> items = new ReferenceArrayList<>();
            for (RegistryEntry<Block> entry : AdditionalLights.REGISTRATE.getAll(Registries.BLOCK)) {
                if (AdditionalLights.REGISTRATE.isInCreativeTab(entry, tab)) {
                    Item item = entry.get().asItem();
                    if (item!=Items.AIR) items.add(item);
                }
            }
            items = new ReferenceArrayList<>(new ReferenceLinkedOpenHashSet<>(items));
            return items;
        }

        private List<Item> collectItems(RegistryObject<CreativeModeTab> tab) {
            List<Item> items = new ReferenceArrayList<>();
            for (RegistryEntry<Item> entry : AdditionalLights.REGISTRATE.getAll(Registries.ITEM)) {
                if (AdditionalLights.REGISTRATE.isInCreativeTab(entry, tab)) {
                    Item item = entry.get();
                    if (!(item instanceof BlockItem)) items.add(item);
                }
            }
            return items;
        }

        private static void outputAll(CreativeModeTab.Output output, List<Item> items) {
            for (Item item : items) {
                output.accept(item);
            }
        }

        public void accept(CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output output) {
            List<Item> items = new LinkedList<>();
            items.addAll(collectBlocks(ADDITIONAL_LIGHTS_TAB));
            items.addAll(collectItems(ADDITIONAL_LIGHTS_TAB));
            outputAll(output, items);
        }
    }
}
