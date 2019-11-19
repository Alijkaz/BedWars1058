package com.andrei1058.bedwars.upgrades.menu;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public class MenuSeparator implements MenuContent {

    private ItemStack displayItem;
    private String name;

    /**
     * Create a separator.
     *
     * @param displayItem display item.
     */
    public MenuSeparator(String name, ItemStack displayItem) {
        this.displayItem = displayItem;
        this.name = name;
    }

    @Override
    public ItemStack getDisplayItem() {
        return displayItem;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void onClick(ClickType clickType) {

    }
}