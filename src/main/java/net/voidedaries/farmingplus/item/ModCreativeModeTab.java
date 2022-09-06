package net.voidedaries.farmingplus.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FARMING_PLUS_TAB = new CreativeModeTab("farming_plus_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PINEAPPLE.get());
        }
    };


}
