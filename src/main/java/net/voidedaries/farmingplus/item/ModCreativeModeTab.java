package net.voidedaries.farmingplus.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FARMING_PLUS_TAB = new CreativeModeTab("farming_plus_tab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PINEAPPLE.get());
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }

        public int getSearchbarWidth() {
            return 89;
        }

        public net.minecraft.resources.ResourceLocation getBackgroundImage() {
            return new ResourceLocation("textures/gui/container/creative_inventory/tab_item_search.png");
        }

    };

}
