package com.qwinstii.mod.item;

import com.qwinstii.mod.AddictCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AddictCraft.MOD_ID);

    public static final DeferredItem<Item> TEST = ITEMS.register("test", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TEST2 = ITEMS.register("test2", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}