package com.andrei1058.bedwars.upgrades.menu;

import com.andrei1058.bedwars.upgrades.UpgradesManager;
import org.bukkit.entity.Player;

public interface UpgradesIndex {

    /**
     * Get menu name.
     */
    String getName();

    /**
     * Open this menu to a player.
     * Make sure to use {@link UpgradesManager#setWatchingUpgrades}
     *
     * @param player target player.
     */
    void open(Player player);

    /**
     * Add content to a menu.
     *
     * @param content content instance.
     * @param slot    where to put the content in the menu.
     * @return false if te given slot is in use.
     */
    boolean addContent(MenuContent content, int slot);
}