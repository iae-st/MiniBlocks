package me.EzCoins.MiniBlocks.Core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.EzCoins.MiniBlocks.Abstract.AbstractMachineBlock;
import me.EzCoins.MiniBlocks.ItemSetup.ItemSetup;
import me.EzCoins.MiniBlocks.Utils.CustomHeads;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Locale;

import static me.EzCoins.MiniBlocks.MiniBlocks.plugin;

public final class miniblock  {


    public static SlimefunItemStack setup(String name, CustomHeads customHeads) {
        return new SlimefunItemStack(
                name.toUpperCase(Locale.ROOT).replace(" ", "_") + "MINIBLOCK",
                customHeads.getPlayerHead(),
                "&9" + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase().replace("_", " ") +" &8(MiniBlock)"
        );
    }

    public static void craftable(Material material, String name, CustomHeads customHeads) {
        new SlimefunItem(Groups.BLOCKS, setup(name, customHeads), MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(material)})
                .register(plugin);

    }



}
