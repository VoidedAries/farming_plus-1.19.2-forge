package net.voidedaries.farmingplus.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voidedaries.farmingplus.FarmingPlus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FarmingPlus.MOD_ID);

    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARMING_PLUS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
