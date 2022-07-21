package me.EzCoins.MiniBlocks.utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;

public class GUIBuilder {

    public static final CustomItemStack MENU_BACKGROUND_INPUT = new CustomItemStack(
            Material.LIGHT_BLUE_STAINED_GLASS_PANE,
            ChatColor.BLUE + "Input"
    );

    public static final CustomItemStack MENU_BACKGROUND_OUTPUT = new CustomItemStack(
            Material.ORANGE_STAINED_GLASS_PANE,
            ChatColor.GOLD + "Output"
    );

}