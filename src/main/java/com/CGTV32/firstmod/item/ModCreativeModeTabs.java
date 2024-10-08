package com.CGTV32.firstmod.item;

import com.CGTV32.firstmod.FirstMod;
import com.CGTV32.firstmod.blocks.ModBlocks;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OPP_TAB = CREATIVE_MODE_TABS.register("opp_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OPPITE.get()))
                    .title(Component.translatable("creativetab.firstmod.opptab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OPPITE.get());
                        output.accept(ModItems.RAW_OPPITE.get());

                        output.accept(ModItems.OBAMIUM.get());
                        output.accept(ModItems.RAW_OBAMIUM.get());

                        output.accept(ModItems.BLICKY.get());

                        output.accept(ModItems.OBAMIUM_SWORD.get());
                        output.accept(ModItems.OBAMIUM_PICKAXE.get());
                        output.accept(ModItems.OBAMIUM_AXE.get());
                        output.accept(ModItems.OBAMIUM_SHOVEL.get());
                        output.accept(ModItems.OBAMIUM_HOE.get());

                        output.accept(ModItems.RAW_SIGMITE.get());
                        output.accept(ModItems.SIGMITE.get());

                        output.accept(ModItems.SKIBIDI_ORE.get());
                        output.accept(ModItems.SKIBIDI_INGOT.get());

                        output.accept(ModItems.CUM.get());
                    }).build());


    public static final RegistryObject<CreativeModeTab> OPP_TAB_BLOCKS = CREATIVE_MODE_TABS.register("opp_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OPPITE_BLOCK.get()))
                    .withTabsBefore(OPP_TAB.getId())
                    .title(Component.translatable("creativetab.firstmod.oppblockstab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.OPPITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_OPPITE_BLOCK.get());

                        output.accept(ModBlocks.OPPITE_ORE.get());
                        output.accept(ModBlocks.OBAMIUM_BLOCK.get());

                        output.accept(ModBlocks.JOSHBLOCK.get());
                        output.accept(ModBlocks.LACHYBLOCK.get());
                        output.accept(ModBlocks.OSAMABLOCK.get());
                        output.accept(ModBlocks.CAMBLOCK.get());
                        output.accept(ModBlocks.BLOCKMAKER.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
