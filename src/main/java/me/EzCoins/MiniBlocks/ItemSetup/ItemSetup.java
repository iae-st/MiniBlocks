package me.EzCoins.MiniBlocks.ItemSetup;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.EzCoins.MiniBlocks.Core.Groups;
import me.EzCoins.MiniBlocks.Core.MiniRecipeType;
import me.EzCoins.MiniBlocks.Machines.BlockReducer;
import me.EzCoins.MiniBlocks.MiniBlocks;
import me.EzCoins.MiniBlocks.Utils.CustomHeads;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemSetup {

    public static final SlimefunItemStack BlockReducer = new SlimefunItemStack("BLOCKREDUCER",
            Material.STONECUTTER,
            "&6BlockReducer",
            "",
            "&7Turns the desired block into a",
            "&7smaller version of itself.",
            "",
            MachineLore.energyPerSecond(me.EzCoins.MiniBlocks.Machines.BlockReducer.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack STONE = new SlimefunItemStack("STONE",
            CustomHeads.STONE.getPlayerHead(),
            "&9Stone &8(MiniBlock)"
    );

    public static final SlimefunItemStack GRANITE = new SlimefunItemStack("GRANITE",
            CustomHeads.GRANITE.getPlayerHead(),
            "&9Granite &8(MiniBlock)"
    );

    public static final SlimefunItemStack POLISHED_GRANITE = new SlimefunItemStack("POLISHED_GRANITE",
            CustomHeads.POLISHED_GRANITE.getPlayerHead(),
            "&9Polished Granite &8(MiniBlock)"
    );

    public static final SlimefunItemStack DIORITE = new SlimefunItemStack("DIORITE",
            CustomHeads.DIORITE.getPlayerHead(),
            "&9Diorite &8(MiniBlock)"
    );

    public static final SlimefunItemStack POLISHED_DIORITE = new SlimefunItemStack("POLISHED_DIORITE",
            CustomHeads.POLISHED_DIORITE.getPlayerHead(),
            "&9Polished Diorite &8(MiniBlock)"
    );

    public static final SlimefunItemStack ANDESITE = new SlimefunItemStack("ANDESITE",
            CustomHeads.ANDESITE.getPlayerHead(),
            "&9Andesite &8(MiniBlock)"
    );

    public static final SlimefunItemStack POLISHED_ANDESITE = new SlimefunItemStack("POLISHED_ANDESITE",
            CustomHeads.POLISHED_ANDESITE.getPlayerHead(),
            "&9Polished Andesite &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE = new SlimefunItemStack("DEEPSLATE",
            CustomHeads.DEEPSLATE.getPlayerHead(),
            "&9Deepslate &8(MiniBlock)"
    );

    public static final SlimefunItemStack COBBLED_DEEPSLATE = new SlimefunItemStack("COBBLED_DEEPSLATE",
            CustomHeads.COBBLED_DEEPSLATE.getPlayerHead(),
            "&9Cobbled Deepslate &8(MiniBlock)"
    );

    public static final SlimefunItemStack POLISHED_DEEPSLATE = new SlimefunItemStack("POLISHED_DEEPSLATE",
            CustomHeads.POLISHED_DEEPSLATE.getPlayerHead(),
            "&9Polished Deepslate &8(MiniBlock)"
    );

    public static final SlimefunItemStack CALCITE = new SlimefunItemStack("CALCITE",
            CustomHeads.CALCITE.getPlayerHead(),
            "&9Calcite &8(MiniBlock)"
    );

    public static final SlimefunItemStack TUFF = new SlimefunItemStack("TUFF",
            CustomHeads.TUFF.getPlayerHead(),
            "&9Tuff &8(MiniBlock)"
    );

    public static final SlimefunItemStack DRIPSTONE_BLOCK = new SlimefunItemStack("DRIPSTONE_BLOCK",
            CustomHeads.DRIPSTONE_BLOCK.getPlayerHead(),
            "&9Dripstone Block &8(MiniBlock)"
    );

    public static final SlimefunItemStack GRASS_BLOCK = new SlimefunItemStack("GRASS_BLOCK",
            CustomHeads.GRASS_BLOCK.getPlayerHead(),
            "&9Grass Block &8(MiniBlock)"
    );

    public static final SlimefunItemStack DIRT = new SlimefunItemStack("DIRT",
            CustomHeads.DIRT.getPlayerHead(),
            "&9Dirt &8(MiniBlock)"
    );

    public static final SlimefunItemStack COARSE_DIRT = new SlimefunItemStack("COARSE_DIRT",
            CustomHeads.COARSE_DIRT.getPlayerHead(),
            "&9Coarse Dirt &8(MiniBlock)"
    );

    public static final SlimefunItemStack PODZOL = new SlimefunItemStack("PODZOL",
            CustomHeads.PODZOL.getPlayerHead(),
            "&9Podzol Dirt &8(MiniBlock)"
    );

    public static final SlimefunItemStack ROOTED_DIRT = new SlimefunItemStack("ROOTED_DIRT",
            CustomHeads.ROOTED_DIRT.getPlayerHead(),
            "&9Rooted Dirt &8(MiniBlock)"
    );

    public static final SlimefunItemStack CRIMSON_NYLIUM = new SlimefunItemStack("CRIMSON_NYLIUM",
            CustomHeads.CRIMSON_NYLIUM.getPlayerHead(),
            "&9Crimson Nylium &8(MiniBlock)"
    );

    public static final SlimefunItemStack WARPED_NYLIUM = new SlimefunItemStack("WARPED_NYLIUM",
            CustomHeads.WARPED_NYLIUM.getPlayerHead(),
            "&9Warped Nylium &8(MiniBlock)"
    );

    public static final SlimefunItemStack COBBLESTONE = new SlimefunItemStack("COBBLESTONE",
            CustomHeads.COBBLESTONE.getPlayerHead(),
            "&9Cobblestone &8(MiniBlock)"
    );

    public static final SlimefunItemStack OAK_PLANKS = new SlimefunItemStack("OAK_PLANKS",
            CustomHeads.OAK_PLANKS.getPlayerHead(),
            "&9Oak Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack SPRUCE_PLANKS = new SlimefunItemStack("SPRUCE_PLANKS",
            CustomHeads.SPRUCE_PLANKS.getPlayerHead(),
            "&9Spruce Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack BIRCH_PLANKS = new SlimefunItemStack("BIRCH_PLANKS",
            CustomHeads.BIRCH_PLANKS.getPlayerHead(),
            "&9Birch Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack JUNGLE_PLANKS = new SlimefunItemStack("JUNGLE_PLANKS",
            CustomHeads.JUNGLE_PLANKS.getPlayerHead(),
            "&9Jungle Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack ACACIA_PLANKS = new SlimefunItemStack("ACACIA_PLANKS",
            CustomHeads.ACACIA_PLANKS.getPlayerHead(),
            "&9Acacia Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack DARK_OAK_PLANKS = new SlimefunItemStack("DARK_OAK_PLANKS",
            CustomHeads.DARK_OAK_PLANKS.getPlayerHead(),
            "&9Dark Oak Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack CRIMSON_PLANKS = new SlimefunItemStack("CRIMSON_PLANKS",
            CustomHeads.CRIMSON_PLANKS.getPlayerHead(),
            "&9Crimson Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack WARPED_PLANKS = new SlimefunItemStack("WARPED_PLANKS",
            CustomHeads.WARPED_PLANKS.getPlayerHead(),
            "&9Warped Planks &8(MiniBlock)"
    );

    public static final SlimefunItemStack BEDROCK = new SlimefunItemStack("BEDROCK",
            CustomHeads.BEDROCK.getPlayerHead(),
            "&9Bedrock &8(MiniBlock)",
            "",
            "&7&oHow did we get here?"
    );

    public static final SlimefunItemStack SAND = new SlimefunItemStack("SAND",
            CustomHeads.SAND.getPlayerHead(),
            "&9Sand &8(MiniBlock)"
    );

    public static final SlimefunItemStack RED_SAND = new SlimefunItemStack("RED_SAND",
            CustomHeads.RED_SAND.getPlayerHead(),
            "&9Red Sand &8(MiniBlock)"
    );

    public static final SlimefunItemStack GRAVEL = new SlimefunItemStack("GRAVEL",
            CustomHeads.GRAVEL.getPlayerHead(),
            "&9Gravel &8(MiniBlock)"
    );

    public static final SlimefunItemStack COAL_ORE = new SlimefunItemStack("COAL_ORE",
            CustomHeads.COAL_ORE.getPlayerHead(),
            "&9Coal Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_COAL_ORE = new SlimefunItemStack("DEEPSLATE_COAL_ORE",
            CustomHeads.DEEPSLATE_COAL_ORE.getPlayerHead(),
            "&9Deepslate Coal Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack IRON_ORE = new SlimefunItemStack("IRON_ORE",
            CustomHeads.IRON_ORE.getPlayerHead(),
            "&9Iron Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_IRON_ORE = new SlimefunItemStack("DEEPSLATE_IRON_ORE",
            CustomHeads.DEEPSLATE_IRON_ORE.getPlayerHead(),
            "&9Deepslate Iron Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack COPPER_ORE = new SlimefunItemStack("COPPER_ORE",
            CustomHeads.COPPER_ORE.getPlayerHead(),
            "&9Copper Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_COPPER_ORE = new SlimefunItemStack("DEEPSLATE_COPPER_ORE",
            CustomHeads.DEEPSLATE_COPPER_ORE.getPlayerHead(),
            "&9Deepslate Copper Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack GOLD_ORE = new SlimefunItemStack("GOLD_ORE",
            CustomHeads.GOLD_ORE.getPlayerHead(),
            "&9Gold Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_GOLD_ORE = new SlimefunItemStack("DEEPSLATE_GOLD_ORE",
            CustomHeads.DEEPSLATE_GOLD_ORE.getPlayerHead(),
            "&9Deepslate Gold Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack REDSTONE_ORE = new SlimefunItemStack("REDSTONE_ORE",
            CustomHeads.REDSTONE_ORE.getPlayerHead(),
            "&9Redstone Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_REDSTONE_ORE = new SlimefunItemStack("DEEPSLATE_REDSTONE_ORE",
            CustomHeads.DEEPSLATE_REDSTONE_ORE.getPlayerHead(),
            "&9Deepslate Redstone Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack EMERALD_ORE = new SlimefunItemStack("EMERALD_ORE",
            CustomHeads.EMERALD_ORE.getPlayerHead(),
            "&9Emerald Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_EMERALD_ORE = new SlimefunItemStack("DEEPSLATE_EMERALD_ORE",
            CustomHeads.DEEPSLATE_EMERALD_ORE.getPlayerHead(),
            "&9Deepslate Emerald Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack LAPIS_LAZULI_ORE = new SlimefunItemStack("LAPIS_LAZULI_ORE",
            CustomHeads.LAPIS_LAZULI_ORE.getPlayerHead(),
            "&9Lapis Lazuli Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_LAPIS_LAZULI_ORE = new SlimefunItemStack("DEEPSLATE_LAPIS_LAZULI_ORE",
            CustomHeads.DEEPSLATE_LAPIS_LAZULI_ORE.getPlayerHead(),
            "&9Deepslate Lapis Lazuli Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DIAMOND_ORE = new SlimefunItemStack("DIAMOND_ORE",
            CustomHeads.DIAMOND_ORE.getPlayerHead(),
            "&9Diamond Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEEPSLATE_DIAMOND_ORE = new SlimefunItemStack("DEEPSLATE_DIAMOND_ORE",
            CustomHeads.DEEPSLATE_DIAMOND_ORE.getPlayerHead(),
            "&9Deepslate Diamond Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack NETHER_GOLD_ORE = new SlimefunItemStack("NETHER_GOLD_ORE",
            CustomHeads.NETHER_GOLD_ORE.getPlayerHead(),
            "&9Nether Gold Ore &8(MiniBlock)"
    );

    public static final SlimefunItemStack NETHER_QUARTZ_ORE = new SlimefunItemStack("NETHER_QUARTZ_ORE",
            CustomHeads.NETHER_QUARTZ_ORE.getPlayerHead(),
            "&9Nether Quartz Ore &8(MiniBlock)"
    );
    public static final SlimefunItemStack ANCIENT_DEBRIS = new SlimefunItemStack("ANCIENT_DEBRIS",
            CustomHeads.ANCIENT_DEBRIS.getPlayerHead(),
            "&9Ancient Debris &8(MiniBlock)"
    );

    public static final SlimefunItemStack BLOCK_OF_COAL = new SlimefunItemStack("BLOCK_OF_COAL",
            CustomHeads.BLOCK_OF_COAL.getPlayerHead(),
            "&9Block Of Coal &8(MiniBlock)"
    );

    public static final SlimefunItemStack BLOCK_OF_RAW_IRON = new SlimefunItemStack("BLOCK_OF_RAW_IRON",
            CustomHeads.BLOCK_OF_RAW_IRON.getPlayerHead(),
            "&9Block Of Raw Iron &8(MiniBlock)"
    );

    public static final SlimefunItemStack BLOCK_OF_RAW_COPPER = new SlimefunItemStack("BLOCK_OF_RAW_COPPER",
            CustomHeads.BLOCK_OF_RAW_COPPER.getPlayerHead(),
            "&9Block Of Raw Copper &8(MiniBlock)"
    );

    public static final SlimefunItemStack BLOCK_OF_RAW_GOLD = new SlimefunItemStack("BLOCK_OF_RAW_GOLD",
            CustomHeads.BLOCK_OF_RAW_GOLD.getPlayerHead(),
            "&9Block Of Raw Gold &8(MiniBlock)"
    );

    public static final SlimefunItemStack BLOCK_OF_AMETHYST = new SlimefunItemStack("BLOCK_OF_AMETHYST",
            CustomHeads.BLOCK_OF_AMETHYST.getPlayerHead(),
            "&9Block Of Amethyst &8(MiniBlock)"
    );

    public static final SlimefunItemStack BUDDING_AMETHYST = new SlimefunItemStack("BUDDING_AMETHYST",
            CustomHeads.BUDDING_AMETHYST.getPlayerHead(),
            "&9Budding Amethyst &8(MiniBlock)"
    );

    public static final SlimefunItemStack BEACON = new SlimefunItemStack("BEACON",
            CustomHeads.BEACON.getPlayerHead(),
            "&9Beacon &8(MiniBlock)"
    );

    public static final SlimefunItemStack STRUCTURE_VOID = new SlimefunItemStack("STRUCTURE_VOID",
            CustomHeads.STRUCTURE_VOID.getPlayerHead(),
            "&9Structure void &8(MiniBlock)"
    );

    public static final SlimefunItemStack BARRIER = new SlimefunItemStack("BARRIER",
            CustomHeads.BARRIER.getPlayerHead(),
            "&9Barrier &8(MiniBlock)"
    );

    public static final SlimefunItemStack GLOWSTONE = new SlimefunItemStack("GLOWSTONE",
            CustomHeads.GLOWSTONE.getPlayerHead(),
            "&9Glowstone &8(MiniBlock)"
    );

    public static final SlimefunItemStack SOUL_SAND = new SlimefunItemStack("SOUL_SAND",
            CustomHeads.SOUL_SAND.getPlayerHead(),
            "&9Soul Sand &8(MiniBlock)"
    );

    public static final SlimefunItemStack SOUL_SOIL = new SlimefunItemStack("SOUL_SOIL",
            CustomHeads.SOUL_SOIL.getPlayerHead(),
            "&9Soul Soil &8(MiniBlock)"
    );

    public static final SlimefunItemStack HONEY_BLOCK = new SlimefunItemStack("HONEY_BLOCK",
            CustomHeads.HONEY_BLOCK.getPlayerHead(),
            "&9Honey Block &8(MiniBlock)"
    );

    public static final SlimefunItemStack BONE_BLOCK = new SlimefunItemStack("BONE_BLOCK",
            CustomHeads.BONE_BLOCK.getPlayerHead(),
            "&9Bone Block &8(MiniBlock)"
    );

    public static final SlimefunItemStack SLIME_BLOCK = new SlimefunItemStack("SLIME_BLOCK",
            CustomHeads.SLIME_BLOCK.getPlayerHead(),
            "&9Slime Block &8(MiniBlock)"
    );

    public static final SlimefunItemStack SOUL_CAMPFIRE = new SlimefunItemStack("SOUL_CAMPFIRE",
            CustomHeads.SOUL_CAMPFIRE.getPlayerHead(),
            "&9Soul Campfire &8(MiniBlock)"
    );

    public static final SlimefunItemStack CAMPFIRE = new SlimefunItemStack("CAMPFIRE",
            CustomHeads.CAMPFIRE.getPlayerHead(),
            "&9Campfire &8(MiniBlock)"
    );

    public static final SlimefunItemStack BEE_NEST = new SlimefunItemStack("BEE_NEST",
            CustomHeads.BEE_NEST.getPlayerHead(),
            "&9Bee Nest &8(MiniBlock)"
    );

    public static final SlimefunItemStack LODESTONE = new SlimefunItemStack("LODESTONE",
            CustomHeads.LODESTONE.getPlayerHead(),
            "&9Lodestone &8(MiniBlock)"
    );

    public static final SlimefunItemStack CRYING_OBSIDIAN = new SlimefunItemStack("CRYING_OBSIDIAN",
            CustomHeads.CRYING_OBSIDIAN.getPlayerHead(),
            "&9Crying Obsidian &8(MiniBlock)"
    );

    public static final SlimefunItemStack SOUL_FIRE_LANTERN = new SlimefunItemStack("SOUL_FIRE_LANTERN",
            CustomHeads.SOUL_FIRE_LANTERN.getPlayerHead(),
            "&9Soul Fire Lantern &8(MiniBlock)"
    );

    public static final SlimefunItemStack LANTERN = new SlimefunItemStack("LANTERN",
            CustomHeads.LANTERN.getPlayerHead(),
            "&9Lantern &8(MiniBlock)"
    );

    public static final SlimefunItemStack SHROOMLIGHT = new SlimefunItemStack("SHROOMLIGHT",
            CustomHeads.SHROOMLIGHT.getPlayerHead(),
            "&9Shroomlight &8(MiniBlock)"
    );

    public static final SlimefunItemStack REDSTONE_LAMP = new SlimefunItemStack("REDSTONE_LAMP",
            CustomHeads.REDSTONE_LAMP.getPlayerHead(),
            "&9Redstone Lamp &8(MiniBlock)"
    );

    public static final SlimefunItemStack PUMPKIN_LANTERN = new SlimefunItemStack("PUMPKIN_LANTERN",
            CustomHeads.PUMPKIN_LANTERN.getPlayerHead(),
            "&9Pumpkin Lantern &8(MiniBlock)"
    );

    public static final SlimefunItemStack DEAD_BUSH = new SlimefunItemStack("DEAD_BUSH",
            CustomHeads.DEAD_BUSH.getPlayerHead(),
            "&9Dead Bush &8(MiniBlock)"
    );




    public static void setup(MiniBlocks plugin) {


        new BlockReducer(Groups.MACHINES, BlockReducer, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        null, new ItemStack(Material.STONECUTTER), null,
                        SlimefunItems.STEEL_PLATE, SlimefunItems.BIG_CAPACITOR, SlimefunItems.STEEL_PLATE})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, STONE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.STONE)})
                .register(plugin);


        new SlimefunItem(Groups.BLOCKS, GRANITE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.GRANITE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, POLISHED_GRANITE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.POLISHED_GRANITE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DIORITE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DIORITE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, POLISHED_DIORITE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.POLISHED_DIORITE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, ANDESITE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.ANDESITE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, POLISHED_ANDESITE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.POLISHED_ANDESITE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, COBBLED_DEEPSLATE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.COBBLED_DEEPSLATE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, POLISHED_DEEPSLATE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.POLISHED_DEEPSLATE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, CALCITE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.CALCITE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, TUFF, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.TUFF)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DRIPSTONE_BLOCK, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DRIPSTONE_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, GRASS_BLOCK, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.GRASS_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DIRT, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DIRT)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, COARSE_DIRT, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.COARSE_DIRT)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, PODZOL, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.PODZOL)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, ROOTED_DIRT, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.ROOTED_DIRT)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, CRIMSON_NYLIUM, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.CRIMSON_NYLIUM)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, WARPED_NYLIUM, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.WARPED_NYLIUM)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, COBBLESTONE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.COBBLESTONE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, OAK_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.OAK_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, SPRUCE_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SPRUCE_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BIRCH_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.BIRCH_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, JUNGLE_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.JUNGLE_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, ACACIA_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.ACACIA_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DARK_OAK_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DARK_OAK_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, CRIMSON_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.CRIMSON_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, WARPED_PLANKS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.WARPED_PLANKS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BEDROCK, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.BEDROCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, SAND, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SAND)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, RED_SAND, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.RED_SAND)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, GRAVEL, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.GRAVEL)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, COAL_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.COAL_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_COAL_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_COAL_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, IRON_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.IRON_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_IRON_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_IRON_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, COPPER_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.COPPER_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_COPPER_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_COPPER_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, GOLD_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.GOLD_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_GOLD_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_GOLD_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, REDSTONE_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.REDSTONE_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_REDSTONE_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_REDSTONE_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, EMERALD_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.EMERALD_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_EMERALD_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_EMERALD_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, LAPIS_LAZULI_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.LAPIS_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_LAPIS_LAZULI_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_LAPIS_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DIAMOND_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DIAMOND_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEEPSLATE_DIAMOND_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEEPSLATE_DIAMOND_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, NETHER_GOLD_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.NETHER_GOLD_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, NETHER_QUARTZ_ORE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.NETHER_QUARTZ_ORE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, ANCIENT_DEBRIS, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.ANCIENT_DEBRIS)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BLOCK_OF_COAL, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.COAL_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BLOCK_OF_RAW_IRON, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.RAW_IRON_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BLOCK_OF_RAW_COPPER, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.RAW_COPPER_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BLOCK_OF_RAW_GOLD, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.RAW_GOLD_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BLOCK_OF_AMETHYST, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.AMETHYST_BLOCK)})
                .register(plugin);


        new SlimefunItem(Groups.BLOCKS, BUDDING_AMETHYST, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.BUDDING_AMETHYST)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BEACON, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.BEACON)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, STRUCTURE_VOID, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.STRUCTURE_VOID)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BARRIER, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.BARRIER)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, GLOWSTONE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.GLOWSTONE)})
                .register(plugin);


        new SlimefunItem(Groups.BLOCKS, SOUL_SAND, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SOUL_SAND)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, SOUL_SOIL, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SOUL_SOIL)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, HONEY_BLOCK, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.HONEY_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BONE_BLOCK, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.BONE_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, SLIME_BLOCK, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SLIME_BLOCK)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, SOUL_CAMPFIRE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SOUL_CAMPFIRE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, CAMPFIRE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.CAMPFIRE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, BEE_NEST, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.BEE_NEST)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, LODESTONE, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.LODESTONE)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, CRYING_OBSIDIAN, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.CRYING_OBSIDIAN)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, SOUL_FIRE_LANTERN, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SOUL_LANTERN)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, LANTERN, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.LANTERN)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, SHROOMLIGHT, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.SHROOMLIGHT)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, REDSTONE_LAMP, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.REDSTONE_LAMP)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, PUMPKIN_LANTERN, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.JACK_O_LANTERN)})
                .register(plugin);

        new SlimefunItem(Groups.BLOCKS, DEAD_BUSH, MiniRecipeType.BlockReducer,
                new ItemStack[]{
                        null, null, null,
                        null, new ItemStack(Material.DEAD_BUSH)})
                .register(plugin);

    }
}
