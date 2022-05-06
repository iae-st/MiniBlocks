package me.EzCoins.MiniBlocks.ItemSetup;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.EzCoins.MiniBlocks.Core.Groups;
import me.EzCoins.MiniBlocks.Core.MiniRecipeType;
import me.EzCoins.MiniBlocks.Core.miniblock;
import me.EzCoins.MiniBlocks.Machines.BlockReducer;
import me.EzCoins.MiniBlocks.MiniBlocks;
import me.EzCoins.MiniBlocks.Utils.CustomHeads;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemSetup {

    public static final SlimefunItemStack BlockReducer = new SlimefunItemStack("BLOCKREDUCER",
            Material.STONECUTTER,
            "&6Block Reducer",
            "",
            "&7Turns the desired block into a",
            "&7smaller version of itself.",
            "",
            MachineLore.energyPerSecond(me.EzCoins.MiniBlocks.Machines.BlockReducer.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack STONE = miniblock.setup("STONE", CustomHeads.STONE);
    public static final SlimefunItemStack GRANITE = miniblock.setup("GRANITE", CustomHeads.GRANITE);
    public static final SlimefunItemStack POLISHED_GRANITE = miniblock.setup("POLISHED_GRANITE", CustomHeads.POLISHED_GRANITE);
    public static final SlimefunItemStack DIORITE = miniblock.setup("DIORITE", CustomHeads.DIORITE);
    public static final SlimefunItemStack POLISHED_DIORITE = miniblock.setup("POLISHED_DIORITE", CustomHeads.POLISHED_DIORITE);
    public static final SlimefunItemStack ANDESITE = miniblock.setup("ANDESITE", CustomHeads.ANDESITE);
    public static final SlimefunItemStack POLISHED_ANDESITE = miniblock.setup("POLISHED_ANDESITE", CustomHeads.POLISHED_ANDESITE);
    public static final SlimefunItemStack DEEPSLATE = miniblock.setup("DEEPSLATE", CustomHeads.DEEPSLATE);
    public static final SlimefunItemStack COBBLED_DEEPSLATE = miniblock.setup("COBBLED_DEEPSLATE", CustomHeads.COBBLED_DEEPSLATE);
    public static final SlimefunItemStack POLISHED_DEEPSLATE = miniblock.setup("POLISHED_DEEPSLATE", CustomHeads.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack CALCITE = miniblock.setup("CALCITE", CustomHeads.CALCITE);
    public static final SlimefunItemStack TUFF = miniblock.setup("TUFF", CustomHeads.TUFF);
    public static final SlimefunItemStack DRIPSTONE_BLOCK = miniblock.setup("DRIPSTONE_BLOCK", CustomHeads.DRIPSTONE_BLOCK);
    public static final SlimefunItemStack GRASS_BLOCK = miniblock.setup("GRASS_BLOCK", CustomHeads.GRASS_BLOCK);
    public static final SlimefunItemStack DIRT = miniblock.setup("DIRT", CustomHeads.DIRT);
    public static final SlimefunItemStack COARSE_DIRT = miniblock.setup("COARSE_DIRT", CustomHeads.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack PODZOL = miniblock.setup("PODZOL", CustomHeads.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack ROOTED_DIRT = miniblock.setup("ROOTED_DIRT", CustomHeads.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack CRIMSON_NYLIUM = miniblock.setup("CRIMSON_NYLIUM", CustomHeads.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack WARPED_NYLIUM = miniblock.setup("WARPED_NYLIUM", CustomHeads.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack COBBLESTONE = miniblock.setup("COBBLESTONE", CustomHeads.COBBLESTONE);
    public static final SlimefunItemStack OAK_PLANKS = miniblock.setup("OAK_PLANKS", CustomHeads.OAK_PLANKS);
    public static final SlimefunItemStack SPRUCE_PLANKS = miniblock.setup("SPRUCE_PLANKS", CustomHeads.SPRUCE_PLANKS);
    public static final SlimefunItemStack BIRCH_PLANKS = miniblock.setup("BIRCH_PLANKS", CustomHeads.BIRCH_PLANKS);
    public static final SlimefunItemStack JUNGLE_PLANKS = miniblock.setup("JUNGLE_PLANKS", CustomHeads.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack ACACIA_PLANKS = miniblock.setup("ACACIA_PLANKS", CustomHeads.ACACIA_PLANKS);
    public static final SlimefunItemStack DARK_OAK_PLANKS = miniblock.setup("DARK_OAK_PLANKS", CustomHeads.DARK_OAK_PLANKS);
    public static final SlimefunItemStack CRIMSON_PLANKS = miniblock.setup("CRIMSON_PLANKS", CustomHeads.CRIMSON_PLANKS);
    public static final SlimefunItemStack WARPED_PLANKS = miniblock.setup("WARPED_PLANKS", CustomHeads.WARPED_PLANKS);
    public static final SlimefunItemStack BEDROCK = miniblock.setup("BEDROCK", CustomHeads.BEDROCK);
    public static final SlimefunItemStack SAND = miniblock.setup("SAND", CustomHeads.SAND);
    public static final SlimefunItemStack RED_SAND = miniblock.setup("RED_SAND", CustomHeads.RED_SAND);
    public static final SlimefunItemStack GRAVEL = miniblock.setup("GRAVEL", CustomHeads.GRAVEL);
    public static final SlimefunItemStack COAL_ORE = miniblock.setup("COAL_ORE", CustomHeads.COAL_ORE);
    public static final SlimefunItemStack DEEPSLATE_COAL_ORE = miniblock.setup("DEEPSLATE_COAL_ORE", CustomHeads.DEEPSLATE_COAL_ORE);
    public static final SlimefunItemStack IRON_ORE = miniblock.setup("IRON_ORE", CustomHeads.IRON_ORE);
    public static final SlimefunItemStack DEEPSLATE_IRON_ORE = miniblock.setup("DEEPSLATE_IRON_ORE", CustomHeads.DEEPSLATE_IRON_ORE);
    public static final SlimefunItemStack COPPER_ORE = miniblock.setup("COPPER_ORE", CustomHeads.COPPER_ORE);
    public static final SlimefunItemStack DEEPSLATE_COPPER_ORE = miniblock.setup("DEEPSLATE_COPPER_ORE", CustomHeads.DEEPSLATE_COPPER_ORE);
    public static final SlimefunItemStack GOLD_ORE = miniblock.setup("GOLD_ORE", CustomHeads.GOLD_ORE);
    public static final SlimefunItemStack DEEPSLATE_GOLD_ORE = miniblock.setup("DEEPSLATE_GOLD_ORE", CustomHeads.DEEPSLATE_GOLD_ORE);
    public static final SlimefunItemStack REDSTONE_ORE = miniblock.setup("REDSTONE_ORE", CustomHeads.REDSTONE_ORE);
    public static final SlimefunItemStack DEEPSLATE_REDSTONE_ORE = miniblock.setup("DEEPSLATE_REDSTONE_ORE", CustomHeads.DEEPSLATE_REDSTONE_ORE);
    public static final SlimefunItemStack EMERALD_ORE = miniblock.setup("EMERALD_ORE", CustomHeads.EMERALD_ORE);
    public static final SlimefunItemStack DEEPSLATE_EMERALD_ORE = miniblock.setup("DEEPSLATE_EMERALD_ORE", CustomHeads.DEEPSLATE_EMERALD_ORE);
    public static final SlimefunItemStack LAPIS_LAZULI_ORE = miniblock.setup("LAPIS_LAZULI_ORE", CustomHeads.LAPIS_LAZULI_ORE);
    public static final SlimefunItemStack DEEPSLATE_LAPIS_LAZULI_ORE = miniblock.setup("DEEPSLATE_LAPIS_LAZULI_ORE", CustomHeads.DEEPSLATE_LAPIS_LAZULI_ORE);
    public static final SlimefunItemStack DIAMOND_ORE = miniblock.setup("DIAMOND_ORE", CustomHeads.DIAMOND_ORE);
    public static final SlimefunItemStack DEEPSLATE_DIAMOND_ORE = miniblock.setup("DEEPSLATE_DIAMOND_ORE", CustomHeads.DEEPSLATE_DIAMOND_ORE);
    public static final SlimefunItemStack NETHER_GOLD_ORE = miniblock.setup("NETHER_GOLD_ORE", CustomHeads.NETHER_GOLD_ORE);
    public static final SlimefunItemStack NETHER_QUARTZ_ORE = miniblock.setup("NETHER_QUARTZ_ORE", CustomHeads.NETHER_QUARTZ_ORE);
    public static final SlimefunItemStack ANCIENT_DEBRIS = miniblock.setup("ANCIENT_DEBRIS", CustomHeads.ANCIENT_DEBRIS);
    public static final SlimefunItemStack BLOCK_OF_COAL = miniblock.setup("BLOCK_OF_COAL", CustomHeads.BLOCK_OF_COAL);
    public static final SlimefunItemStack BLOCK_OF_RAW_IRON = miniblock.setup("BLOCK_OF_RAW_IRON", CustomHeads.BLOCK_OF_RAW_IRON);
    public static final SlimefunItemStack BLOCK_OF_RAW_COPPER = miniblock.setup("BLOCK_OF_RAW_COPPER", CustomHeads.BLOCK_OF_RAW_COPPER);
    public static final SlimefunItemStack BLOCK_OF_RAW_GOLD = miniblock.setup("BLOCK_OF_RAW_GOLD", CustomHeads.BLOCK_OF_RAW_GOLD);
    public static final SlimefunItemStack BLOCK_OF_AMETHYST = miniblock.setup("BLOCK_OF_AMETHYST", CustomHeads.BLOCK_OF_AMETHYST);
    public static final SlimefunItemStack BUDDING_AMETHYST = miniblock.setup("BUDDING_AMETHYST", CustomHeads.BUDDING_AMETHYST);
    public static final SlimefunItemStack BEACON = miniblock.setup("BEACON", CustomHeads.BEACON);
    public static final SlimefunItemStack STRUCTURE_VOID = miniblock.setup("STRUCTURE_VOID", CustomHeads.STRUCTURE_VOID);
    public static final SlimefunItemStack BARRIER = miniblock.setup("BARRIER", CustomHeads.BARRIER);
    public static final SlimefunItemStack GLOWSTONE = miniblock.setup("GLOWSTONE", CustomHeads.GLOWSTONE);
    public static final SlimefunItemStack SOUL_SAND = miniblock.setup("SOUL_SAND", CustomHeads.SOUL_SAND);
    public static final SlimefunItemStack SOUL_SOIL = miniblock.setup("SOUL_SOIL", CustomHeads.SOUL_SOIL);
    public static final SlimefunItemStack HONEY_BLOCK = miniblock.setup("HONEY_BLOCK", CustomHeads.HONEY_BLOCK);
    public static final SlimefunItemStack BONE_BLOCK = miniblock.setup("BONE_BLOCK", CustomHeads.BONE_BLOCK);
    public static final SlimefunItemStack SLIME_BLOCK = miniblock.setup("SLIME_BLOCK", CustomHeads.SLIME_BLOCK);
    public static final SlimefunItemStack SOUL_CAMPFIRE = miniblock.setup("SOUL_CAMPFIRE", CustomHeads.SOUL_CAMPFIRE);
    public static final SlimefunItemStack CAMPFIRE = miniblock.setup("CAMPFIRE", CustomHeads.CAMPFIRE);
    public static final SlimefunItemStack BEE_NEST = miniblock.setup("BEE_NEST", CustomHeads.BEE_NEST);
    public static final SlimefunItemStack LODESTONE = miniblock.setup("LODESTONE", CustomHeads.LODESTONE);
    public static final SlimefunItemStack CRYING_OBSIDIAN = miniblock.setup("CRYING_OBSIDIAN", CustomHeads.CRYING_OBSIDIAN);
    public static final SlimefunItemStack SOUL_FIRE_LANTERN = miniblock.setup("SOUL_FIRE_LANTERN", CustomHeads.SOUL_FIRE_LANTERN);
    public static final SlimefunItemStack LANTERN = miniblock.setup("LANTERN", CustomHeads.LANTERN);
    public static final SlimefunItemStack SHROOMLIGHT = miniblock.setup("SHROOMLIGHT", CustomHeads.SHROOMLIGHT);
    public static final SlimefunItemStack REDSTONE_LAMP = miniblock.setup("REDSTONE_LAMP", CustomHeads.REDSTONE_LAMP);
    public static final SlimefunItemStack PUMPKIN_LANTERN = miniblock.setup("PUMPKIN_LANTERN", CustomHeads.PUMPKIN_LANTERN);
    public static final SlimefunItemStack DEAD_BUSH = miniblock.setup("DEAD_BUSH", CustomHeads.DEAD_BUSH);
    public static final SlimefunItemStack TOTEM_OF_UNDYING = miniblock.setup("TOTEM_OF_UNDYING", CustomHeads.TOTEM_OF_UNDYING);
    public static final SlimefunItemStack SCULK_SENSOR = miniblock.setup("SCULK_SENSOR", CustomHeads.SCULK_SENSOR);
    public static final SlimefunItemStack SCAFFOLDING = miniblock.setup("SCAFFOLDING", CustomHeads.SCAFFOLDING);
    public static final SlimefunItemStack LAVA_BUCKET = miniblock.setup("LAVA_BUCKET", CustomHeads.LAVA_BUCKET);
    public static final SlimefunItemStack WATER_BUCKET = miniblock.setup("WATER_BUCKET", CustomHeads.WATER_BUCKET);
    public static final SlimefunItemStack MILK_BUCKET = miniblock.setup("MILK_BUCKET", CustomHeads.MILK_BUCKET);
    public static final SlimefunItemStack POWDER_SNOW_BUCKET = miniblock.setup("POWDER_SNOW_BUCKET", CustomHeads.POWDER_SNOW_BUCKET);
    public static final SlimefunItemStack BUCKET = miniblock.setup("BUCKET", CustomHeads.BUCKET);
    public static final SlimefunItemStack ROSE = miniblock.setup("ROSE", CustomHeads.ROSE);
    public static final SlimefunItemStack CHEST = miniblock.setup("CHEST", CustomHeads.CHEST);
    public static final SlimefunItemStack COCOA_BEAN = miniblock.setup("COCOA_BEAN", CustomHeads.COCOA_BEAN);
    public static final SlimefunItemStack SPYGLASS = miniblock.setup("SPYGLASS", CustomHeads.SPYGLASS);
    public static final SlimefunItemStack BRICKS = miniblock.setup("BRICKS", CustomHeads.BRICKS);
    public static final SlimefunItemStack JUKEBOX = miniblock.setup("JUKEBOX", CustomHeads.JUKEBOX);
    public static final SlimefunItemStack COMMAND_BLOCK = miniblock.setup("COMMAND_BLOCK", CustomHeads.COMMAND_BLOCK);
    public static final SlimefunItemStack CHAIN_COMMAND_BLOCK = miniblock.setup("CHAIN_COMMAND_BLOCK", CustomHeads.CHAIN_COMMAND_BLOCK);
    public static final SlimefunItemStack REPEAT_COMMAND_BLOCK = miniblock.setup("REPEAT_COMMAND_BLOCK", CustomHeads.REPEAT_COMMAND_BLOCK);
    public static final SlimefunItemStack CACTUS = miniblock.setup("CACTUS", CustomHeads.CACTUS);
    public static final SlimefunItemStack OBSERVER = miniblock.setup("OBSERVER", CustomHeads.OBSERVER);
    public static final SlimefunItemStack SLIME_BALL = miniblock.setup("SLIME_BALL", CustomHeads.SLIME_BALL);
    public static final SlimefunItemStack MAGMA_CREAM = miniblock.setup("MAGMA_CREAM", CustomHeads.MAGMA_CREAM);
    public static final SlimefunItemStack PISTON = miniblock.setup("PISTON", CustomHeads.PISTON);
    public static final SlimefunItemStack STICKY_PISTON = miniblock.setup("STICKY_PISTON", CustomHeads.STICKY_PISTON);
    public static final SlimefunItemStack TARGET_BLOCK = miniblock.setup("TARGET_BLOCK", CustomHeads.TARGET_BLOCK);
    public static final SlimefunItemStack CRAFTING_TABLE = miniblock.setup("CRAFTING_TABLE", CustomHeads.CRAFTING_TABLE);
    public static final SlimefunItemStack STONECUTTER = miniblock.setup("STONECUTTER", CustomHeads.STONECUTTER);
    public static final SlimefunItemStack GRINDSTONE = miniblock.setup("GRINDSTONE", CustomHeads.GRINDSTONE);
    public static final SlimefunItemStack FLETCHING_TABLE = miniblock.setup("FLETCHING_TABLE", CustomHeads.FLETCHING_TABLE);
    public static final SlimefunItemStack SMITHING_TABLE = miniblock.setup("SMITHING_TABLE", CustomHeads.SMITHING_TABLE);
    public static final SlimefunItemStack CARTOGRAPHY_TABLE = miniblock.setup("CARTOGRAPHY_TABLE", CustomHeads.CARTOGRAPHY_TABLE);
    public static final SlimefunItemStack ENCHANTING_TABLE = miniblock.setup("ENCHANTING_TABLE", CustomHeads.ENCHANTING_TABLE);
    public static final SlimefunItemStack ENCHANTED_BOOK = miniblock.setup("ENCHANTED_BOOK", CustomHeads.ENCHANTED_BOOK);
    public static final SlimefunItemStack LOOM = miniblock.setup("LOOM", CustomHeads.LOOM);
    public static final SlimefunItemStack LECTERN = miniblock.setup("LECTERN", CustomHeads.LECTERN);
    public static final SlimefunItemStack CAULDRON = miniblock.setup("CAULDRON", CustomHeads.CAULDRON);
    public static final SlimefunItemStack FURNACE = miniblock.setup("FURNACE", CustomHeads.FURNACE);
    public static final SlimefunItemStack BLAST_FURNACE = miniblock.setup("BLAST_FURNACE", CustomHeads.BLAST_FURNACE);
    public static final SlimefunItemStack SMOKER = miniblock.setup("SMOKER", CustomHeads.SMOKER);
    public static final SlimefunItemStack ANVIL = miniblock.setup("ANVIL", CustomHeads.ANVIL);
    public static final SlimefunItemStack CHIPPED_ANVIL = miniblock.setup("CHIPPED_ANVIL", CustomHeads.CHIPPED_ANVIL);
    public static final SlimefunItemStack DAMAGED_ANVIL = miniblock.setup("DAMAGED_ANVIL", CustomHeads.DAMAGED_ANVIL);
    public static final SlimefunItemStack END_CRYSTAL = miniblock.setup("END_CRYSTAL", CustomHeads.END_CRYSTAL);
    public static final SlimefunItemStack SPONGE = miniblock.setup("SPONGE", CustomHeads.SPONGE);
    public static final SlimefunItemStack WET_SPONGE = miniblock.setup("WET_SPONGE", CustomHeads.WET_SPONGE);
    public static final SlimefunItemStack CAKE = miniblock.setup("CAKE", CustomHeads.CAKE);
    public static final SlimefunItemStack COOKIE = miniblock.setup("COOKIE", CustomHeads.DAMAGED_ANVIL);
    public static final SlimefunItemStack PUMPKIN_PIE = miniblock.setup("PUMPKIN_PIE", CustomHeads.PUMPKIN_PIE);
    public static final SlimefunItemStack SUGAR_CANE = miniblock.setup("SUGAR_CANE", CustomHeads.SUGAR_CANE);
    public static final SlimefunItemStack PUMPKIN = miniblock.setup("PUMPKIN", CustomHeads.PUMPKIN);
    public static final SlimefunItemStack CARVED_PUMPKIN = miniblock.setup("CARVED_PUMPKIN", CustomHeads.CARVED_PUMPKIN);
    public static final SlimefunItemStack MELON = miniblock.setup("MELON", CustomHeads.MELON);
    public static final SlimefunItemStack TNT = miniblock.setup("TNT", CustomHeads.TNT);




    public static void setup(MiniBlocks plugin) {


        new BlockReducer(Groups.MACHINES, BlockReducer, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        null, new ItemStack(Material.STONECUTTER), null,
                        SlimefunItems.STEEL_PLATE, SlimefunItems.BIG_CAPACITOR, SlimefunItems.STEEL_PLATE})
                .register(plugin);

        miniblock.craftable(Material.STONE, "STONE", CustomHeads.STONE);
        miniblock.craftable(Material.GRANITE, "GRANITE", CustomHeads.GRANITE);
        miniblock.craftable(Material.POLISHED_GRANITE, "POLISHED_GRANITE", CustomHeads.POLISHED_GRANITE);
        miniblock.craftable(Material.DIORITE, "DIORITE", CustomHeads.DIORITE);
        miniblock.craftable(Material.POLISHED_DIORITE, "POLISHED_DIORITE", CustomHeads.POLISHED_DIORITE);
        miniblock.craftable(Material.ANDESITE, "ANDESITE", CustomHeads.ANDESITE);
        miniblock.craftable(Material.POLISHED_ANDESITE, "POLISHED_ANDESITE", CustomHeads.POLISHED_ANDESITE);
        miniblock.craftable(Material.DEEPSLATE, "DEEPSLATE", CustomHeads.DEEPSLATE);
        miniblock.craftable(Material.COBBLED_DEEPSLATE, "COBBLED_DEEPSLATE", CustomHeads.COBBLED_DEEPSLATE);
        miniblock.craftable(Material.POLISHED_DEEPSLATE, "POLISHED_DEEPSLATE", CustomHeads.POLISHED_DEEPSLATE);
        miniblock.craftable(Material.CALCITE, "CALCITE", CustomHeads.CALCITE);
        miniblock.craftable(Material.TUFF, "TUFF", CustomHeads.TUFF);
        miniblock.craftable(Material.DRIPSTONE_BLOCK, "DRIPSTONE_BLOCK", CustomHeads.DRIPSTONE_BLOCK);
        miniblock.craftable(Material.GRASS_BLOCK, "GRASS_BLOCK", CustomHeads.GRASS_BLOCK);
        miniblock.craftable(Material.DIRT, "DIRT", CustomHeads.DIRT);
        miniblock.craftable(Material.COARSE_DIRT, "COARSE_DIRT", CustomHeads.COARSE_DIRT);
        miniblock.craftable(Material.PODZOL, "PODZOL", CustomHeads.PODZOL);
        miniblock.craftable(Material.ROOTED_DIRT, "ROOTED_DIRT", CustomHeads.ROOTED_DIRT);
        miniblock.craftable(Material.CRIMSON_NYLIUM, "CRIMSON_NYLIUM", CustomHeads.CRIMSON_NYLIUM);
        miniblock.craftable(Material.WARPED_NYLIUM, "WARPED_NYLIUM", CustomHeads.WARPED_NYLIUM);
        miniblock.craftable(Material.COBBLESTONE, "COBBLESTONE", CustomHeads.COBBLESTONE);
        miniblock.craftable(Material.OAK_PLANKS, "OAK_PLANKS", CustomHeads.OAK_PLANKS);
        miniblock.craftable(Material.SPRUCE_PLANKS, "SPRUCE_PLANKS", CustomHeads.SPRUCE_PLANKS);
        miniblock.craftable(Material.BIRCH_PLANKS, "BIRCH_PLANKS", CustomHeads.BIRCH_PLANKS);
        miniblock.craftable(Material.JUNGLE_PLANKS, "JUNGLE_PLANKS", CustomHeads.JUNGLE_PLANKS);
        miniblock.craftable(Material.ACACIA_PLANKS, "ACACIA_PLANKS", CustomHeads.ACACIA_PLANKS);
        miniblock.craftable(Material.DARK_OAK_PLANKS, "DARK_OAK_PLANKS", CustomHeads.DARK_OAK_PLANKS);
        miniblock.craftable(Material.CRIMSON_PLANKS, "CRIMSON_PLANKS", CustomHeads.CRIMSON_PLANKS);
        miniblock.craftable(Material.WARPED_PLANKS, "WARPED_PLANKS", CustomHeads.WARPED_PLANKS);
        miniblock.craftable(Material.BEDROCK, "BEDROCK", CustomHeads.BEDROCK);
        miniblock.craftable(Material.SAND, "SAND", CustomHeads.SAND);
        miniblock.craftable(Material.RED_SAND, "RED_SAND", CustomHeads.RED_SAND);
        miniblock.craftable(Material.GRAVEL, "GRAVEL", CustomHeads.GRAVEL);
        miniblock.craftable(Material.COAL_ORE, "COAL_ORE", CustomHeads.COAL_ORE);
        miniblock.craftable(Material.DEEPSLATE_COAL_ORE, "DEEPSLATE_COAL_ORE", CustomHeads.DEEPSLATE_COAL_ORE);
        miniblock.craftable(Material.IRON_ORE, "IRON_ORE", CustomHeads.IRON_ORE);
        miniblock.craftable(Material.DEEPSLATE_IRON_ORE, "DEEPSLATE_IRON_ORE", CustomHeads.DEEPSLATE_IRON_ORE);
        miniblock.craftable(Material.COPPER_ORE, "COPPER_ORE", CustomHeads.COPPER_ORE);
        miniblock.craftable(Material.DEEPSLATE_COPPER_ORE, "DEEPSLATE_COPPER_ORE", CustomHeads.DEEPSLATE_COPPER_ORE);
        miniblock.craftable(Material.GOLD_ORE, "GOLD_ORE", CustomHeads.GOLD_ORE);
        miniblock.craftable(Material.DEEPSLATE_GOLD_ORE, "DEEPSLATE_GOLD_ORE", CustomHeads.DEEPSLATE_GOLD_ORE);
        miniblock.craftable(Material.REDSTONE_ORE, "REDSTONE_ORE", CustomHeads.REDSTONE_ORE);
        miniblock.craftable(Material.DEEPSLATE_REDSTONE_ORE, "DEEPSLATE_REDSTONE_ORE", CustomHeads.DEEPSLATE_REDSTONE_ORE);
        miniblock.craftable(Material.EMERALD_ORE, "EMERALD_ORE", CustomHeads.EMERALD_ORE);
        miniblock.craftable(Material.DEEPSLATE_EMERALD_ORE, "DEEPSLATE_EMERALD_ORE", CustomHeads.DEEPSLATE_EMERALD_ORE);
        miniblock.craftable(Material.LAPIS_ORE, "LAPIS_LAZULI_ORE", CustomHeads.LAPIS_LAZULI_ORE);
        miniblock.craftable(Material.DEEPSLATE_LAPIS_ORE, "DEEPSLATE_LAPIS_LAZULI_ORE", CustomHeads.DEEPSLATE_LAPIS_LAZULI_ORE);
        miniblock.craftable(Material.DIAMOND_ORE, "DIAMOND_ORE", CustomHeads.DIAMOND_ORE);
        miniblock.craftable(Material.DEEPSLATE_DIAMOND_ORE, "DEEPSLATE_DIAMOND_ORE", CustomHeads.DEEPSLATE_DIAMOND_ORE);
        miniblock.craftable(Material.NETHER_GOLD_ORE, "NETHER_GOLD_ORE", CustomHeads.NETHER_GOLD_ORE);
        miniblock.craftable(Material.NETHER_QUARTZ_ORE, "NETHER_QUARTZ_ORE", CustomHeads.NETHER_QUARTZ_ORE);
        miniblock.craftable(Material.ANCIENT_DEBRIS, "ANCIENT_DEBRIS", CustomHeads.ANCIENT_DEBRIS);
        miniblock.craftable(Material.COAL_BLOCK, "BLOCK_OF_COAL", CustomHeads.BLOCK_OF_COAL);
        miniblock.craftable(Material.RAW_IRON_BLOCK, "BLOCK_OF_RAW_IRON", CustomHeads.BLOCK_OF_RAW_IRON);
        miniblock.craftable(Material.RAW_COPPER_BLOCK, "BLOCK_OF_RAW_COPPER", CustomHeads.BLOCK_OF_RAW_COPPER);
        miniblock.craftable(Material.RAW_GOLD_BLOCK, "BLOCK_OF_RAW_GOLD", CustomHeads.BLOCK_OF_RAW_GOLD);
        miniblock.craftable(Material.AMETHYST_BLOCK, "BLOCK_OF_AMETHYST", CustomHeads.BLOCK_OF_AMETHYST);
        miniblock.craftable(Material.BUDDING_AMETHYST, "BUDDING_AMETHYST", CustomHeads.BUDDING_AMETHYST);
        miniblock.craftable(Material.BEACON, "BEACON", CustomHeads.BEACON);
        miniblock.craftable(Material.STRUCTURE_VOID, "STRUCTURE_VOID", CustomHeads.STRUCTURE_VOID);
        miniblock.craftable(Material.BARRIER, "BARRIER", CustomHeads.BARRIER);
        miniblock.craftable(Material.GLOWSTONE, "GLOWSTONE", CustomHeads.GLOWSTONE);
        miniblock.craftable(Material.SOUL_SAND, "SOUL_SAND", CustomHeads.SOUL_SAND);
        miniblock.craftable(Material.SOUL_SOIL, "SOUL_SOIL", CustomHeads.SOUL_SOIL);
        miniblock.craftable(Material.HONEY_BLOCK, "HONEY_BLOCK", CustomHeads.HONEY_BLOCK);
        miniblock.craftable(Material.BONE_BLOCK, "BONE_BLOCK", CustomHeads.BONE_BLOCK);
        miniblock.craftable(Material.SLIME_BLOCK, "SLIME_BLOCK", CustomHeads.SLIME_BLOCK);
        miniblock.craftable(Material.SOUL_CAMPFIRE, "SOUL_CAMPFIRE", CustomHeads.SOUL_CAMPFIRE);
        miniblock.craftable(Material.CAMPFIRE, "CAMPFIRE", CustomHeads.CAMPFIRE);
        miniblock.craftable(Material.BEE_NEST, "BEE_NEST", CustomHeads.BEE_NEST);
        miniblock.craftable(Material.LODESTONE, "LODESTONE", CustomHeads.LODESTONE);
        miniblock.craftable(Material.CRYING_OBSIDIAN, "CRYING_OBSIDIAN", CustomHeads.CRYING_OBSIDIAN);
        miniblock.craftable(Material.SOUL_LANTERN, "SOUL_FIRE_LANTERN", CustomHeads.SOUL_FIRE_LANTERN);
        miniblock.craftable(Material.LANTERN, "LANTERN", CustomHeads.LANTERN);
        miniblock.craftable(Material.SHROOMLIGHT, "SHROOMLIGHT", CustomHeads.SHROOMLIGHT);
        miniblock.craftable(Material.REDSTONE_LAMP, "REDSTONE_LAMP", CustomHeads.REDSTONE_LAMP);
        miniblock.craftable(Material.JACK_O_LANTERN, "PUMPKIN_LANTERN", CustomHeads.PUMPKIN_LANTERN);
        miniblock.craftable(Material.DEAD_BUSH, "DEAD_BUSH", CustomHeads.DEAD_BUSH);
        miniblock.craftable(Material.TOTEM_OF_UNDYING, "TOTEM_OF_UNDYING", CustomHeads.TOTEM_OF_UNDYING);
        miniblock.craftable(Material.SCULK_SENSOR, "SCULK_SENSOR", CustomHeads.SCULK_SENSOR);
        miniblock.craftable(Material.SCAFFOLDING, "SCAFFOLDING", CustomHeads.SCAFFOLDING);
        miniblock.craftable(Material.LAVA_BUCKET, "LAVA_BUCKET", CustomHeads.LAVA_BUCKET);
        miniblock.craftable(Material.WATER_BUCKET, "WATER_BUCKET", CustomHeads.WATER_BUCKET);
        miniblock.craftable(Material.MILK_BUCKET, "MILK_BUCKET", CustomHeads.MILK_BUCKET);
        miniblock.craftable(Material.POWDER_SNOW_BUCKET, "POWDER_SNOW_BUCKET", CustomHeads.POWDER_SNOW_BUCKET);
        miniblock.craftable(Material.BUCKET, "BUCKET", CustomHeads.BUCKET);
        miniblock.craftable(Material.POPPY, "ROSE", CustomHeads.ROSE);
        miniblock.craftable(Material.CHEST, "CHEST", CustomHeads.CHEST);
        miniblock.craftable(Material.COCOA_BEANS, "COCOA_BEAN", CustomHeads.COCOA_BEAN);
        miniblock.craftable(Material.SPYGLASS, "SPYGLASS", CustomHeads.SPYGLASS);
        miniblock.craftable(Material.BRICKS, "BRICKS", CustomHeads.BRICKS);
        miniblock.craftable(Material.JUKEBOX, "JUKEBOX", CustomHeads.JUKEBOX);
        miniblock.craftable(Material.COMMAND_BLOCK, "COMMAND_BLOCK", CustomHeads.COMMAND_BLOCK);
        miniblock.craftable(Material.CHAIN_COMMAND_BLOCK, "CHAIN_COMMAND_BLOCK", CustomHeads.CHAIN_COMMAND_BLOCK);
        miniblock.craftable(Material.REPEATING_COMMAND_BLOCK, "REPEAT_COMMAND_BLOCK", CustomHeads.REPEAT_COMMAND_BLOCK);
        miniblock.craftable(Material.CACTUS, "CACTUS", CustomHeads.CACTUS);
        miniblock.craftable(Material.OBSERVER, "OBSERVER", CustomHeads.OBSERVER);
        miniblock.craftable(Material.SLIME_BALL, "SLIME_BALL", CustomHeads.SLIME_BALL);
        miniblock.craftable(Material.MAGMA_CREAM, "MAGMA_CREAM", CustomHeads.MAGMA_CREAM);
        miniblock.craftable(Material.PISTON, "PISTON", CustomHeads.PISTON);
        miniblock.craftable(Material.STICKY_PISTON, "STICKY_PISTON", CustomHeads.STICKY_PISTON);
        miniblock.craftable(Material.TARGET, "TARGET_BLOCK", CustomHeads.TARGET_BLOCK);
        miniblock.craftable(Material.CRAFTING_TABLE, "CRAFTING_TABLE", CustomHeads.CRAFTING_TABLE);
        miniblock.craftable(Material.STONECUTTER, "STONECUTTER", CustomHeads.STONECUTTER);
        miniblock.craftable(Material.GRINDSTONE, "GRINDSTONE", CustomHeads.GRINDSTONE);
        miniblock.craftable(Material.FLETCHING_TABLE, "FLETCHING_TABLE", CustomHeads.FLETCHING_TABLE);
        miniblock.craftable(Material.SMITHING_TABLE, "SMITHING_TABLE", CustomHeads.SMITHING_TABLE);
        miniblock.craftable(Material.CARTOGRAPHY_TABLE, "CARTOGRAPHY_TABLE", CustomHeads.CARTOGRAPHY_TABLE);
        miniblock.craftable(Material.ENCHANTING_TABLE, "ENCHANTING_TABLE", CustomHeads.ENCHANTING_TABLE);
        miniblock.craftable(Material.ENCHANTED_BOOK, "ENCHANTED_BOOK", CustomHeads.ENCHANTED_BOOK);
        miniblock.craftable(Material.LOOM, "LOOM", CustomHeads.LOOM);
        miniblock.craftable(Material.LECTERN, "LECTERN", CustomHeads.LECTERN);
        miniblock.craftable(Material.CAULDRON, "CAULDRON", CustomHeads.CAULDRON);
        miniblock.craftable(Material.FURNACE, "FURNACE", CustomHeads.FURNACE);
        miniblock.craftable(Material.BLAST_FURNACE, "BLAST_FURNACE", CustomHeads.BLAST_FURNACE);
        miniblock.craftable(Material.SMOKER, "SMOKER", CustomHeads.SMOKER);
        miniblock.craftable(Material.ANVIL, "ANVIL", CustomHeads.ANVIL);
        miniblock.craftable(Material.CHIPPED_ANVIL, "CHIPPED_ANVIL", CustomHeads.CHIPPED_ANVIL);
        miniblock.craftable(Material.DAMAGED_ANVIL, "DAMAGED_ANVIL", CustomHeads.DAMAGED_ANVIL);
        miniblock.craftable(Material.END_CRYSTAL, "END_CRYSTAL", CustomHeads.END_CRYSTAL);
        miniblock.craftable(Material.SPONGE, "SPONGE", CustomHeads.SPONGE);
        miniblock.craftable(Material.WET_SPONGE, "WET_SPONGE", CustomHeads.WET_SPONGE);
        miniblock.craftable(Material.CAKE, "CAKE", CustomHeads.CAKE);
        miniblock.craftable(Material.COOKIE, "COOKIE", CustomHeads.COOKIE);
        miniblock.craftable(Material.PUMPKIN_PIE, "PUMPKIN_PIE", CustomHeads.PUMPKIN_PIE);
        miniblock.craftable(Material.SUGAR_CANE, "SUGAR_CANE", CustomHeads.SUGAR_CANE);
        miniblock.craftable(Material.PUMPKIN, "PUMPKIN", CustomHeads.PUMPKIN);
        miniblock.craftable(Material.CARVED_PUMPKIN, "CARVED_PUMPKIN", CustomHeads.CARVED_PUMPKIN);
        miniblock.craftable(Material.MELON, "MELON", CustomHeads.MELON);
        miniblock.craftable(Material.MELON, "TNT", CustomHeads.TNT);







    }
}
