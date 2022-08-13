package me.EzCoins.MiniBlocks.itemsetup;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.EzCoins.MiniBlocks.core.Groups;
import me.EzCoins.MiniBlocks.core.MiniBlock;
import me.EzCoins.MiniBlocks.machines.BlockExpander;
import me.EzCoins.MiniBlocks.machines.BlockReducer;
import me.EzCoins.MiniBlocks.MiniBlocks;
import me.EzCoins.MiniBlocks.utils.CustomHead;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemSetup {

    public static final SlimefunItemStack BLOCK_REDUCER = new SlimefunItemStack(
            "BLOCKREDUCER",
            Material.STONECUTTER,
            "&6Block Reducer",
            "",
            "&7Turns the desired block into a",
            "&7smaller version of itself.",
            "",
            MachineLore.energyPerSecond(me.EzCoins.MiniBlocks.machines.BlockReducer.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack BLOCK_EXPANDER = new SlimefunItemStack(
            "BLOCKEXPANDER",
            Material.SMITHING_TABLE,
            "&6Block Expander",
            "",
            "&7Turns the desired MiniBlock into",
            "&7its original form.",
            "",
            MachineLore.energyPerSecond(me.EzCoins.MiniBlocks.machines.BlockReducer.ENERGY_CONSUMPTION)
    );


    public static final SlimefunItemStack SYNTHETIC_BOOK = new SlimefunItemStack(
            "SYNTHETICBOOK",
            Material.ENCHANTED_BOOK,
            "&aSynthetic Enchanted Book"
    );

    public static void setup(MiniBlocks plugin) {

        new BlockReducer(Groups.MACHINES, BLOCK_REDUCER, RecipeType.ENHANCED_CRAFTING_TABLE,
                         new ItemStack[]{
                        null, new ItemStack(Material.STONECUTTER), null,
                        SlimefunItems.STEEL_PLATE, SlimefunItems.BIG_CAPACITOR, SlimefunItems.STEEL_PLATE})
                .register(plugin);

        new BlockExpander(Groups.MACHINES, BLOCK_EXPANDER, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        null, new ItemStack(Material.SMITHING_TABLE), null,
                        SlimefunItems.STEEL_PLATE, SlimefunItems.BIG_CAPACITOR, SlimefunItems.STEEL_PLATE})
                .register(plugin);

        new SlimefunItem(Groups.SYNTHETIC, SYNTHETIC_BOOK, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, null, null,
                        new ItemStack(Material.BOOK), new ItemStack(Material.BOOK), new ItemStack(Material.BOOK)},
                new ItemStack(Material.ENCHANTED_BOOK))
                .register(plugin);



        for(CustomHead head : CustomHead.getCachedValues())  {
            MiniBlock.craftable(Material.valueOf(head.name()), head);
        }
    }
}
