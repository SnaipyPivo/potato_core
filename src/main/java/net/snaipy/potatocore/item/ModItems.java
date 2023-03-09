package net.snaipy.potatocore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snaipy.potatocore.PotatoCore;
import net.snaipy.potatocore.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PotatoCore.MOD_ID);

    public static final RegistryObject<Item> STONE_APPLE = ITEMS.register("stone_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.STONE_APPLE)));

    public static final RegistryObject<Item> FNAF_SECRET_ENDING_RECORD = ITEMS.register("fnaf_secret_ending_record",
            () -> new RecordItem(4, ModSounds.FNAF_SECRET_ENDING,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }





}
