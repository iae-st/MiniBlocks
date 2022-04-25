package me.EzCoins.MiniBlocks;


import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.EzCoins.MiniBlocks.Core.Groups;
import me.EzCoins.MiniBlocks.ItemSetup.ItemSetup;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public final class MiniBlocks extends AbstractAddon implements SlimefunAddon {

    public static MiniBlocks plugin;

    public static MiniBlocks getInstance() {
        return plugin;
    }

    public MiniBlocks(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "TheRealEzCoins", "MiniBlocks", "master", "auto-update");
    }


    public MiniBlocks() {
        super("TheRealEzCoins", "MiniBlocks", "master", "auto-update");
    }





    @Override
    protected void enable() {

        getLogger().info("------------------------");
        getLogger().info("|         MiniBlocks ~ EzCoins          |");
        getLogger().info("------------------------");




        plugin = this;

        Groups.setup(this);
        ItemSetup.setup(this);


    }


    @Override
    public void disable () {

        getLogger().info("Now Shutting down...");
    }

}


