package net.voidedaries.farmingplus.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voidedaries.farmingplus.FarmingPlus;
import net.voidedaries.farmingplus.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FarmingPlus.MOD_ID);

    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple",
            () -> new ItemNameBlockItem(ModBlocks.PINEAPPLE_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.FARMING_PLUS_TAB)
                            .food(new FoodProperties.Builder().nutrition(4).saturationMod(4f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
