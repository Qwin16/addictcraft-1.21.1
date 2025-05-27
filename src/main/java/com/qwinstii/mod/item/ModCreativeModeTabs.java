package com.qwinstii.mod.item;

import com.qwinstii.mod.AddictCraft;
import com.qwinstii.mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AddictCraft.MOD_ID);
    public static final Supplier<CreativeModeTab> ADDICTCRAFT_CREATIVE_TAB = CREATIVE_MODE_TAB.register("addictcraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TEST.get()))
                    .title(Component.translatable("creativetab.addictcraft.addictcraft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // ITEMS
                        output.accept(ModItems.TEST);
                        output.accept(ModItems.TEST2);

                        // BLOCKS
                        output.accept(ModBlocks.TEST_BLOCK);
                        output.accept(ModBlocks.TEST_BLOCK2);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}