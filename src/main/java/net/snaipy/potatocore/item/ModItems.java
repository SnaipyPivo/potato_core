package net.snaipy.potatocore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snaipy.potatocore.PotatoCore;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PotatoCore.MOD_ID);

    public static final RegistryObject<Item> STONE_APPLE = ITEMS.register("stone_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.STONE_APPLE)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }





}
