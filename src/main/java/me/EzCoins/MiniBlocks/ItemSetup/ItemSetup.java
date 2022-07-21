package me.EzCoins.MiniBlocks.ItemSetup;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.EzCoins.MiniBlocks.Core.Groups;
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
    public static final SlimefunItemStack COARSE_DIRT = miniblock.setup("COARSE_DIRT", CustomHeads.COARSE_DIRT);
    public static final SlimefunItemStack PODZOL = miniblock.setup("PODZOL", CustomHeads.PODZOL);
    public static final SlimefunItemStack ROOTED_DIRT = miniblock.setup("ROOTED_DIRT", CustomHeads.ROOTED_DIRT);
    public static final SlimefunItemStack CRIMSON_NYLIUM = miniblock.setup("CRIMSON_NYLIUM", CustomHeads.CRIMSON_NYLIUM);
    public static final SlimefunItemStack WARPED_NYLIUM = miniblock.setup("WARPED_NYLIUM", CustomHeads.WARPED_NYLIUM);
    public static final SlimefunItemStack COBBLESTONE = miniblock.setup("COBBLESTONE", CustomHeads.COBBLESTONE);
    public static final SlimefunItemStack OAK_PLANKS = miniblock.setup("OAK_PLANKS", CustomHeads.OAK_PLANKS);
    public static final SlimefunItemStack SPRUCE_PLANKS = miniblock.setup("SPRUCE_PLANKS", CustomHeads.SPRUCE_PLANKS);
    public static final SlimefunItemStack BIRCH_PLANKS = miniblock.setup("BIRCH_PLANKS", CustomHeads.BIRCH_PLANKS);
    public static final SlimefunItemStack JUNGLE_PLANKS = miniblock.setup("JUNGLE_PLANKS", CustomHeads.JUNGLE_PLANKS);
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
    public static final SlimefunItemStack LAPIS_LAZULI_ORE = miniblock.setup("LAPIS_LAZULI_ORE", CustomHeads.LAPIS_ORE);
    public static final SlimefunItemStack DEEPSLATE_LAPIS_LAZULI_ORE = miniblock.setup("DEEPSLATE_LAPIS_LAZULI_ORE", CustomHeads.DEEPSLATE_LAPIS_ORE);
    public static final SlimefunItemStack DIAMOND_ORE = miniblock.setup("DIAMOND_ORE", CustomHeads.DIAMOND_ORE);
    public static final SlimefunItemStack DEEPSLATE_DIAMOND_ORE = miniblock.setup("DEEPSLATE_DIAMOND_ORE", CustomHeads.DEEPSLATE_DIAMOND_ORE);
    public static final SlimefunItemStack NETHER_GOLD_ORE = miniblock.setup("NETHER_GOLD_ORE", CustomHeads.NETHER_GOLD_ORE);
    public static final SlimefunItemStack NETHER_QUARTZ_ORE = miniblock.setup("NETHER_QUARTZ_ORE", CustomHeads.NETHER_QUARTZ_ORE);
    public static final SlimefunItemStack ANCIENT_DEBRIS = miniblock.setup("ANCIENT_DEBRIS", CustomHeads.ANCIENT_DEBRIS);
    public static final SlimefunItemStack BLOCK_OF_COAL = miniblock.setup("BLOCK_OF_COAL", CustomHeads.COAL_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_RAW_IRON = miniblock.setup("BLOCK_OF_RAW_IRON", CustomHeads.RAW_IRON_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_RAW_COPPER = miniblock.setup("BLOCK_OF_RAW_COPPER", CustomHeads.RAW_COPPER_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_RAW_GOLD = miniblock.setup("BLOCK_OF_RAW_GOLD", CustomHeads.RAW_GOLD_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_AMETHYST = miniblock.setup("BLOCK_OF_AMETHYST", CustomHeads.AMETHYST_BLOCK);
    public static final SlimefunItemStack BUDDING_AMETHYST = miniblock.setup("BUDDING_AMETHYST", CustomHeads.BUDDING_AMETHYST);
    public static final SlimefunItemStack IRON_BLOCK = miniblock.setup("IRON_BLOCK", CustomHeads.IRON_BLOCK);
    public static final SlimefunItemStack COPPER_BLOCK = miniblock.setup("COPPER_BLOCK", CustomHeads.COPPER_BLOCK);
    public static final SlimefunItemStack GOLD_BLOCK = miniblock.setup("GOLD_BLOCK", CustomHeads.GOLD_BLOCK);
    public static final SlimefunItemStack DIAMOND_BLOCK = miniblock.setup("DIAMOND_BLOCK", CustomHeads.DIAMOND_BLOCK);
    public static final SlimefunItemStack NETHERITE_BLOCK = miniblock.setup("NETHERITE_BLOCK", CustomHeads.NETHERITE_BLOCK);
    public static final SlimefunItemStack EXPOSED_COPPER = miniblock.setup("EXPOSED_COPPER", CustomHeads.EXPOSED_COPPER);
    public static final SlimefunItemStack WEATHERED_COPPER = miniblock.setup("WEATHERED_COPPER", CustomHeads.WEATHERED_COPPER);
    public static final SlimefunItemStack OXIDIZED_COPPER = miniblock.setup("OXIDIZED_COPPER", CustomHeads.OXIDIZED_COPPER);
    public static final SlimefunItemStack CUT_COPPER = miniblock.setup("CUT_COPPER", CustomHeads.CUT_COPPER);
    public static final SlimefunItemStack EXPOSED_CUT_COPPER = miniblock.setup("EXPOSED_CUT_COPPER", CustomHeads.EXPOSED_CUT_COPPER);
    public static final SlimefunItemStack WEATHERED_CUT_COPPER = miniblock.setup("WEATHERED_CUT_COPPER", CustomHeads.WEATHERED_CUT_COPPER);
    public static final SlimefunItemStack OXIDIZED_CUT_COPPER = miniblock.setup("OXIDIZED_CUT_COPPER", CustomHeads.OXIDIZED_CUT_COPPER);
    public static final SlimefunItemStack OAK_LOG = miniblock.setup("OAK_LOG", CustomHeads.OAK_LOG);
    public static final SlimefunItemStack SPRUCE_LOG = miniblock.setup("SPRUCE_LOG", CustomHeads.SPRUCE_LOG);
    public static final SlimefunItemStack BIRCH_LOG = miniblock.setup("BIRCH_LOG", CustomHeads.BIRCH_LOG);
    public static final SlimefunItemStack JUNGLE_LOG = miniblock.setup("JUNGLE_LOG", CustomHeads.JUNGLE_LOG);
    public static final SlimefunItemStack ACACIA_LOG = miniblock.setup("ACACIA_LOG", CustomHeads.ACACIA_LOG);
    public static final SlimefunItemStack DARK_OAK_LOG = miniblock.setup("DARK_OAK_LOG", CustomHeads.DARK_OAK_LOG);
    public static final SlimefunItemStack CRIMSON_STEM = miniblock.setup("CRIMSON_STEM", CustomHeads.CRIMSON_STEM);
    public static final SlimefunItemStack WARPED_STEM = miniblock.setup("WARPED_STEM", CustomHeads.WARPED_STEM);



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
    public static final SlimefunItemStack SOUL_FIRE_LANTERN = miniblock.setup("SOUL_FIRE_LANTERN", CustomHeads.SOUL_LANTERN);
    public static final SlimefunItemStack LANTERN = miniblock.setup("LANTERN", CustomHeads.LANTERN);
    public static final SlimefunItemStack SHROOMLIGHT = miniblock.setup("SHROOMLIGHT", CustomHeads.SHROOMLIGHT);
    public static final SlimefunItemStack REDSTONE_LAMP = miniblock.setup("REDSTONE_LAMP", CustomHeads.REDSTONE_LAMP);
    public static final SlimefunItemStack PUMPKIN_LANTERN = miniblock.setup("PUMPKIN_LANTERN", CustomHeads.JACK_O_LANTERN);
    public static final SlimefunItemStack DEAD_BUSH = miniblock.setup("DEAD_BUSH", CustomHeads.DEAD_BUSH);
    public static final SlimefunItemStack TOTEM_OF_UNDYING = miniblock.setup("TOTEM_OF_UNDYING", CustomHeads.TOTEM_OF_UNDYING);
    public static final SlimefunItemStack SCULK_SENSOR = miniblock.setup("SCULK_SENSOR", CustomHeads.SCULK_SENSOR);
    public static final SlimefunItemStack SCAFFOLDING = miniblock.setup("SCAFFOLDING", CustomHeads.SCAFFOLDING);
    public static final SlimefunItemStack LAVA_BUCKET = miniblock.setup("LAVA_BUCKET", CustomHeads.LAVA_BUCKET);
    public static final SlimefunItemStack WATER_BUCKET = miniblock.setup("WATER_BUCKET", CustomHeads.WATER_BUCKET);
    public static final SlimefunItemStack MILK_BUCKET = miniblock.setup("MILK_BUCKET", CustomHeads.MILK_BUCKET);
    public static final SlimefunItemStack POWDER_SNOW_BUCKET = miniblock.setup("POWDER_SNOW_BUCKET", CustomHeads.POWDER_SNOW_BUCKET);
    public static final SlimefunItemStack BUCKET = miniblock.setup("BUCKET", CustomHeads.BUCKET);
    public static final SlimefunItemStack ROSE = miniblock.setup("ROSE", CustomHeads.ROSE_BUSH);
    public static final SlimefunItemStack CHEST = miniblock.setup("CHEST", CustomHeads.CHEST);
    public static final SlimefunItemStack COCOA_BEAN = miniblock.setup("COCOA_BEAN", CustomHeads.COCOA_BEANS);
    public static final SlimefunItemStack SPYGLASS = miniblock.setup("SPYGLASS", CustomHeads.SPYGLASS);
    public static final SlimefunItemStack BRICKS = miniblock.setup("BRICKS", CustomHeads.BRICKS);
    public static final SlimefunItemStack JUKEBOX = miniblock.setup("JUKEBOX", CustomHeads.JUKEBOX);
    public static final SlimefunItemStack COMMAND_BLOCK = miniblock.setup("COMMAND_BLOCK", CustomHeads.COMMAND_BLOCK);
    public static final SlimefunItemStack CHAIN_COMMAND_BLOCK = miniblock.setup("CHAIN_COMMAND_BLOCK", CustomHeads.CHAIN_COMMAND_BLOCK);
    public static final SlimefunItemStack REPEAT_COMMAND_BLOCK = miniblock.setup("REPEAT_COMMAND_BLOCK", CustomHeads.REPEATING_COMMAND_BLOCK);
    public static final SlimefunItemStack CACTUS = miniblock.setup("CACTUS", CustomHeads.CACTUS);
    public static final SlimefunItemStack OBSERVER = miniblock.setup("OBSERVER", CustomHeads.OBSERVER);
    public static final SlimefunItemStack SLIME_BALL = miniblock.setup("SLIME_BALL", CustomHeads.SLIME_BALL);
    public static final SlimefunItemStack MAGMA_CREAM = miniblock.setup("MAGMA_CREAM", CustomHeads.MAGMA_CREAM);
    public static final SlimefunItemStack PISTON = miniblock.setup("PISTON", CustomHeads.PISTON);
    public static final SlimefunItemStack STICKY_PISTON = miniblock.setup("STICKY_PISTON", CustomHeads.STICKY_PISTON);
    public static final SlimefunItemStack TARGET_BLOCK = miniblock.setup("TARGET_BLOCK", CustomHeads.TARGET);
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

        for(CustomHeads items : CustomHeads.values())  {
            miniblock.craftable(Material.valueOf(items.name()), items.name(), CustomHeads.valueOf(items.name()));
        }







    }
}
