package me.EzCoins.MiniBlocks.itemsetup;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.EzCoins.MiniBlocks.core.Groups;
import me.EzCoins.MiniBlocks.core.MiniBlock;
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

    public static final SlimefunItemStack STONE = MiniBlock.setup(CustomHead.STONE);
    public static final SlimefunItemStack GRANITE = MiniBlock.setup(CustomHead.GRANITE);
    public static final SlimefunItemStack POLISHED_GRANITE = MiniBlock.setup(CustomHead.POLISHED_GRANITE);
    public static final SlimefunItemStack DIORITE = MiniBlock.setup(CustomHead.DIORITE);
    public static final SlimefunItemStack POLISHED_DIORITE = MiniBlock.setup(CustomHead.POLISHED_DIORITE);
    public static final SlimefunItemStack ANDESITE = MiniBlock.setup(CustomHead.ANDESITE);
    public static final SlimefunItemStack POLISHED_ANDESITE = MiniBlock.setup(CustomHead.POLISHED_ANDESITE);
    public static final SlimefunItemStack DEEPSLATE = MiniBlock.setup(CustomHead.DEEPSLATE);
    public static final SlimefunItemStack COBBLED_DEEPSLATE = MiniBlock.setup(CustomHead.COBBLED_DEEPSLATE);
    public static final SlimefunItemStack POLISHED_DEEPSLATE = MiniBlock.setup(CustomHead.POLISHED_DEEPSLATE);
    public static final SlimefunItemStack CALCITE = MiniBlock.setup(CustomHead.CALCITE);
    public static final SlimefunItemStack TUFF = MiniBlock.setup(CustomHead.TUFF);
    public static final SlimefunItemStack DRIPSTONE_BLOCK = MiniBlock.setup(CustomHead.DRIPSTONE_BLOCK);
    public static final SlimefunItemStack GRASS_BLOCK = MiniBlock.setup(CustomHead.GRASS_BLOCK);
    public static final SlimefunItemStack DIRT = MiniBlock.setup(CustomHead.DIRT);
    public static final SlimefunItemStack COARSE_DIRT = MiniBlock.setup(CustomHead.COARSE_DIRT);
    public static final SlimefunItemStack PODZOL = MiniBlock.setup(CustomHead.PODZOL);
    public static final SlimefunItemStack ROOTED_DIRT = MiniBlock.setup(CustomHead.ROOTED_DIRT);
    public static final SlimefunItemStack CRIMSON_NYLIUM = MiniBlock.setup(CustomHead.CRIMSON_NYLIUM);
    public static final SlimefunItemStack WARPED_NYLIUM = MiniBlock.setup(CustomHead.WARPED_NYLIUM);
    public static final SlimefunItemStack COBBLESTONE = MiniBlock.setup(CustomHead.COBBLESTONE);
    public static final SlimefunItemStack OAK_PLANKS = MiniBlock.setup(CustomHead.OAK_PLANKS);
    public static final SlimefunItemStack SPRUCE_PLANKS = MiniBlock.setup(CustomHead.SPRUCE_PLANKS);
    public static final SlimefunItemStack BIRCH_PLANKS = MiniBlock.setup(CustomHead.BIRCH_PLANKS);
    public static final SlimefunItemStack JUNGLE_PLANKS = MiniBlock.setup(CustomHead.JUNGLE_PLANKS);
    public static final SlimefunItemStack ACACIA_PLANKS = MiniBlock.setup(CustomHead.ACACIA_PLANKS);
    public static final SlimefunItemStack DARK_OAK_PLANKS = MiniBlock.setup(CustomHead.DARK_OAK_PLANKS);
    public static final SlimefunItemStack CRIMSON_PLANKS = MiniBlock.setup(CustomHead.CRIMSON_PLANKS);
    public static final SlimefunItemStack WARPED_PLANKS = MiniBlock.setup(CustomHead.WARPED_PLANKS);
    public static final SlimefunItemStack BEDROCK = MiniBlock.setup(CustomHead.BEDROCK);
    public static final SlimefunItemStack SAND = MiniBlock.setup(CustomHead.SAND);
    public static final SlimefunItemStack RED_SAND = MiniBlock.setup(CustomHead.RED_SAND);
    public static final SlimefunItemStack GRAVEL = MiniBlock.setup(CustomHead.GRAVEL);
    public static final SlimefunItemStack COAL_ORE = MiniBlock.setup(CustomHead.COAL_ORE);
    public static final SlimefunItemStack DEEPSLATE_COAL_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_COAL_ORE);
    public static final SlimefunItemStack IRON_ORE = MiniBlock.setup(CustomHead.IRON_ORE);
    public static final SlimefunItemStack DEEPSLATE_IRON_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_IRON_ORE);
    public static final SlimefunItemStack COPPER_ORE = MiniBlock.setup(CustomHead.COPPER_ORE);
    public static final SlimefunItemStack DEEPSLATE_COPPER_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_COPPER_ORE);
    public static final SlimefunItemStack GOLD_ORE = MiniBlock.setup(CustomHead.GOLD_ORE);
    public static final SlimefunItemStack DEEPSLATE_GOLD_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_GOLD_ORE);
    public static final SlimefunItemStack REDSTONE_ORE = MiniBlock.setup(CustomHead.REDSTONE_ORE);
    public static final SlimefunItemStack DEEPSLATE_REDSTONE_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_REDSTONE_ORE);
    public static final SlimefunItemStack EMERALD_ORE = MiniBlock.setup(CustomHead.EMERALD_ORE);
    public static final SlimefunItemStack DEEPSLATE_EMERALD_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_EMERALD_ORE);
    public static final SlimefunItemStack LAPIS_LAZULI_ORE = MiniBlock.setup(CustomHead.LAPIS_ORE);
    public static final SlimefunItemStack DEEPSLATE_LAPIS_LAZULI_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_LAPIS_ORE);
    public static final SlimefunItemStack DIAMOND_ORE = MiniBlock.setup(CustomHead.DIAMOND_ORE);
    public static final SlimefunItemStack DEEPSLATE_DIAMOND_ORE = MiniBlock.setup(CustomHead.DEEPSLATE_DIAMOND_ORE);
    public static final SlimefunItemStack NETHER_GOLD_ORE = MiniBlock.setup(CustomHead.NETHER_GOLD_ORE);
    public static final SlimefunItemStack NETHER_QUARTZ_ORE = MiniBlock.setup(CustomHead.NETHER_QUARTZ_ORE);
    public static final SlimefunItemStack ANCIENT_DEBRIS = MiniBlock.setup(CustomHead.ANCIENT_DEBRIS);
    public static final SlimefunItemStack BLOCK_OF_COAL = MiniBlock.setup(CustomHead.COAL_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_RAW_IRON = MiniBlock.setup(CustomHead.RAW_IRON_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_RAW_COPPER = MiniBlock.setup(CustomHead.RAW_COPPER_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_RAW_GOLD = MiniBlock.setup(CustomHead.RAW_GOLD_BLOCK);
    public static final SlimefunItemStack BLOCK_OF_AMETHYST = MiniBlock.setup(CustomHead.AMETHYST_BLOCK);
    public static final SlimefunItemStack BUDDING_AMETHYST = MiniBlock.setup(CustomHead.BUDDING_AMETHYST);
    public static final SlimefunItemStack IRON_BLOCK = MiniBlock.setup(CustomHead.IRON_BLOCK);
    public static final SlimefunItemStack COPPER_BLOCK = MiniBlock.setup(CustomHead.COPPER_BLOCK);
    public static final SlimefunItemStack GOLD_BLOCK = MiniBlock.setup(CustomHead.GOLD_BLOCK);
    public static final SlimefunItemStack DIAMOND_BLOCK = MiniBlock.setup(CustomHead.DIAMOND_BLOCK);
    public static final SlimefunItemStack NETHERITE_BLOCK = MiniBlock.setup(CustomHead.NETHERITE_BLOCK);
    public static final SlimefunItemStack EXPOSED_COPPER = MiniBlock.setup(CustomHead.EXPOSED_COPPER);
    public static final SlimefunItemStack WEATHERED_COPPER = MiniBlock.setup(CustomHead.WEATHERED_COPPER);
    public static final SlimefunItemStack OXIDIZED_COPPER = MiniBlock.setup(CustomHead.OXIDIZED_COPPER);
    public static final SlimefunItemStack CUT_COPPER = MiniBlock.setup(CustomHead.CUT_COPPER);
    public static final SlimefunItemStack EXPOSED_CUT_COPPER = MiniBlock.setup(CustomHead.EXPOSED_CUT_COPPER);
    public static final SlimefunItemStack WEATHERED_CUT_COPPER = MiniBlock.setup(CustomHead.WEATHERED_CUT_COPPER);
    public static final SlimefunItemStack OXIDIZED_CUT_COPPER = MiniBlock.setup(CustomHead.OXIDIZED_CUT_COPPER);
    public static final SlimefunItemStack OAK_LOG = MiniBlock.setup(CustomHead.OAK_LOG);
    public static final SlimefunItemStack SPRUCE_LOG = MiniBlock.setup(CustomHead.SPRUCE_LOG);
    public static final SlimefunItemStack BIRCH_LOG = MiniBlock.setup(CustomHead.BIRCH_LOG);
    public static final SlimefunItemStack JUNGLE_LOG = MiniBlock.setup(CustomHead.JUNGLE_LOG);
    public static final SlimefunItemStack ACACIA_LOG = MiniBlock.setup(CustomHead.ACACIA_LOG);
    public static final SlimefunItemStack DARK_OAK_LOG = MiniBlock.setup(CustomHead.DARK_OAK_LOG);
    public static final SlimefunItemStack CRIMSON_STEM = MiniBlock.setup(CustomHead.CRIMSON_STEM);
    public static final SlimefunItemStack WARPED_STEM = MiniBlock.setup(CustomHead.WARPED_STEM);

    public static final SlimefunItemStack BEACON = MiniBlock.setup(CustomHead.BEACON);
    public static final SlimefunItemStack STRUCTURE_VOID = MiniBlock.setup(CustomHead.STRUCTURE_VOID);
    public static final SlimefunItemStack BARRIER = MiniBlock.setup(CustomHead.BARRIER);
    public static final SlimefunItemStack GLOWSTONE = MiniBlock.setup(CustomHead.GLOWSTONE);
    public static final SlimefunItemStack SOUL_SAND = MiniBlock.setup(CustomHead.SOUL_SAND);
    public static final SlimefunItemStack SOUL_SOIL = MiniBlock.setup(CustomHead.SOUL_SOIL);
    public static final SlimefunItemStack HONEY_BLOCK = MiniBlock.setup(CustomHead.HONEY_BLOCK);
    public static final SlimefunItemStack BONE_BLOCK = MiniBlock.setup(CustomHead.BONE_BLOCK);
    public static final SlimefunItemStack SLIME_BLOCK = MiniBlock.setup(CustomHead.SLIME_BLOCK);
    public static final SlimefunItemStack SOUL_CAMPFIRE = MiniBlock.setup(CustomHead.SOUL_CAMPFIRE);
    public static final SlimefunItemStack CAMPFIRE = MiniBlock.setup(CustomHead.CAMPFIRE);
    public static final SlimefunItemStack BEE_NEST = MiniBlock.setup(CustomHead.BEE_NEST);
    public static final SlimefunItemStack LODESTONE = MiniBlock.setup(CustomHead.LODESTONE);
    public static final SlimefunItemStack CRYING_OBSIDIAN = MiniBlock.setup(CustomHead.CRYING_OBSIDIAN);
    public static final SlimefunItemStack SOUL_FIRE_LANTERN = MiniBlock.setup(CustomHead.SOUL_LANTERN);
    public static final SlimefunItemStack LANTERN = MiniBlock.setup(CustomHead.LANTERN);
    public static final SlimefunItemStack SHROOMLIGHT = MiniBlock.setup(CustomHead.SHROOMLIGHT);
    public static final SlimefunItemStack REDSTONE_LAMP = MiniBlock.setup(CustomHead.REDSTONE_LAMP);
    public static final SlimefunItemStack PUMPKIN_LANTERN = MiniBlock.setup(CustomHead.JACK_O_LANTERN);
    public static final SlimefunItemStack DEAD_BUSH = MiniBlock.setup(CustomHead.DEAD_BUSH);
    public static final SlimefunItemStack TOTEM_OF_UNDYING = MiniBlock.setup(CustomHead.TOTEM_OF_UNDYING);
    public static final SlimefunItemStack SCULK_SENSOR = MiniBlock.setup(CustomHead.SCULK_SENSOR);
    public static final SlimefunItemStack SCAFFOLDING = MiniBlock.setup(CustomHead.SCAFFOLDING);
    public static final SlimefunItemStack LAVA_BUCKET = MiniBlock.setup(CustomHead.LAVA_BUCKET);
    public static final SlimefunItemStack WATER_BUCKET = MiniBlock.setup(CustomHead.WATER_BUCKET);
    public static final SlimefunItemStack MILK_BUCKET = MiniBlock.setup(CustomHead.MILK_BUCKET);
    public static final SlimefunItemStack POWDER_SNOW_BUCKET = MiniBlock.setup(CustomHead.POWDER_SNOW_BUCKET);
    public static final SlimefunItemStack BUCKET = MiniBlock.setup(CustomHead.BUCKET);
    public static final SlimefunItemStack ROSE = MiniBlock.setup(CustomHead.ROSE_BUSH);
    public static final SlimefunItemStack CHEST = MiniBlock.setup(CustomHead.CHEST);
    public static final SlimefunItemStack COCOA_BEAN = MiniBlock.setup(CustomHead.COCOA_BEANS);
    public static final SlimefunItemStack SPYGLASS = MiniBlock.setup(CustomHead.SPYGLASS);
    public static final SlimefunItemStack BRICKS = MiniBlock.setup(CustomHead.BRICKS);
    public static final SlimefunItemStack JUKEBOX = MiniBlock.setup(CustomHead.JUKEBOX);
    public static final SlimefunItemStack COMMAND_BLOCK = MiniBlock.setup(CustomHead.COMMAND_BLOCK);
    public static final SlimefunItemStack CHAIN_COMMAND_BLOCK = MiniBlock.setup(CustomHead.CHAIN_COMMAND_BLOCK);
    public static final SlimefunItemStack REPEAT_COMMAND_BLOCK = MiniBlock.setup(CustomHead.REPEATING_COMMAND_BLOCK);
    public static final SlimefunItemStack CACTUS = MiniBlock.setup(CustomHead.CACTUS);
    public static final SlimefunItemStack OBSERVER = MiniBlock.setup(CustomHead.OBSERVER);
    public static final SlimefunItemStack SLIME_BALL = MiniBlock.setup(CustomHead.SLIME_BALL);
    public static final SlimefunItemStack MAGMA_CREAM = MiniBlock.setup(CustomHead.MAGMA_CREAM);
    public static final SlimefunItemStack PISTON = MiniBlock.setup(CustomHead.PISTON);
    public static final SlimefunItemStack STICKY_PISTON = MiniBlock.setup(CustomHead.STICKY_PISTON);
    public static final SlimefunItemStack TARGET_BLOCK = MiniBlock.setup(CustomHead.TARGET);
    public static final SlimefunItemStack CRAFTING_TABLE = MiniBlock.setup(CustomHead.CRAFTING_TABLE);
    public static final SlimefunItemStack STONECUTTER = MiniBlock.setup(CustomHead.STONECUTTER);
    public static final SlimefunItemStack GRINDSTONE = MiniBlock.setup(CustomHead.GRINDSTONE);
    public static final SlimefunItemStack FLETCHING_TABLE = MiniBlock.setup(CustomHead.FLETCHING_TABLE);
    public static final SlimefunItemStack SMITHING_TABLE = MiniBlock.setup(CustomHead.SMITHING_TABLE);
    public static final SlimefunItemStack CARTOGRAPHY_TABLE = MiniBlock.setup(CustomHead.CARTOGRAPHY_TABLE);
    public static final SlimefunItemStack ENCHANTING_TABLE = MiniBlock.setup(CustomHead.ENCHANTING_TABLE);
    public static final SlimefunItemStack ENCHANTED_BOOK = MiniBlock.setup(CustomHead.ENCHANTED_BOOK);
    public static final SlimefunItemStack LOOM = MiniBlock.setup(CustomHead.LOOM);
    public static final SlimefunItemStack LECTERN = MiniBlock.setup(CustomHead.LECTERN);
    public static final SlimefunItemStack CAULDRON = MiniBlock.setup(CustomHead.CAULDRON);
    public static final SlimefunItemStack FURNACE = MiniBlock.setup(CustomHead.FURNACE);
    public static final SlimefunItemStack BLAST_FURNACE = MiniBlock.setup(CustomHead.BLAST_FURNACE);
    public static final SlimefunItemStack SMOKER = MiniBlock.setup(CustomHead.SMOKER);
    public static final SlimefunItemStack ANVIL = MiniBlock.setup(CustomHead.ANVIL);
    public static final SlimefunItemStack CHIPPED_ANVIL = MiniBlock.setup(CustomHead.CHIPPED_ANVIL);
    public static final SlimefunItemStack DAMAGED_ANVIL = MiniBlock.setup(CustomHead.DAMAGED_ANVIL);
    public static final SlimefunItemStack END_CRYSTAL = MiniBlock.setup(CustomHead.END_CRYSTAL);
    public static final SlimefunItemStack SPONGE = MiniBlock.setup(CustomHead.SPONGE);
    public static final SlimefunItemStack WET_SPONGE = MiniBlock.setup(CustomHead.WET_SPONGE);
    public static final SlimefunItemStack CAKE = MiniBlock.setup(CustomHead.CAKE);
    public static final SlimefunItemStack COOKIE = MiniBlock.setup(CustomHead.COOKIE);
    public static final SlimefunItemStack PUMPKIN_PIE = MiniBlock.setup(CustomHead.PUMPKIN_PIE);
    public static final SlimefunItemStack SUGAR_CANE = MiniBlock.setup(CustomHead.SUGAR_CANE);
    public static final SlimefunItemStack PUMPKIN = MiniBlock.setup(CustomHead.PUMPKIN);
    public static final SlimefunItemStack CARVED_PUMPKIN = MiniBlock.setup(CustomHead.CARVED_PUMPKIN);
    public static final SlimefunItemStack MELON = MiniBlock.setup(CustomHead.MELON);
    public static final SlimefunItemStack TNT = MiniBlock.setup(CustomHead.TNT);

    public static void setup(MiniBlocks plugin) {
        new BlockReducer(Groups.MACHINES, BLOCK_REDUCER, RecipeType.ENHANCED_CRAFTING_TABLE,
                         new ItemStack[]{
                        null, new ItemStack(Material.STONECUTTER), null,
                        SlimefunItems.STEEL_PLATE, SlimefunItems.BIG_CAPACITOR, SlimefunItems.STEEL_PLATE})
                .register(plugin);

        for(CustomHead head : CustomHead.getCachedValues())  {
            MiniBlock.craftable(Material.valueOf(head.name()), head);
        }
    }
}
