package me.EzCoins.MiniBlocks.Machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.EzCoins.MiniBlocks.Abstract.AbstractMachineBlock;
import me.EzCoins.MiniBlocks.ItemSetup.ItemSetup;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class BlockReducer extends AbstractMachineBlock  implements RecipeDisplayItem {
    public static final int ENERGY_CONSUMPTION = 64;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;
    public static final int SPEED = 1;



    public BlockReducer(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);


    }

    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(1, new ItemStack(Material.STONE), ItemSetup.STONE);
        registerRecipe(1, new ItemStack(Material.GRANITE), ItemSetup.GRANITE);
        registerRecipe(1, new ItemStack(Material.POLISHED_GRANITE), ItemSetup.POLISHED_GRANITE);
        registerRecipe(1, new ItemStack(Material.DIORITE), ItemSetup.DIORITE);
        registerRecipe(1, new ItemStack(Material.POLISHED_DIORITE), ItemSetup.POLISHED_DIORITE);
        registerRecipe(1, new ItemStack(Material.ANDESITE), ItemSetup.ANDESITE);
        registerRecipe(1, new ItemStack(Material.POLISHED_ANDESITE), ItemSetup.POLISHED_ANDESITE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE), ItemSetup.DEEPSLATE);
        registerRecipe(1, new ItemStack(Material.COBBLED_DEEPSLATE), ItemSetup.COBBLED_DEEPSLATE);
        registerRecipe(1, new ItemStack(Material.POLISHED_DEEPSLATE), ItemSetup.POLISHED_DEEPSLATE);
        registerRecipe(1, new ItemStack(Material.CALCITE), ItemSetup.CALCITE);
        registerRecipe(1, new ItemStack(Material.TUFF), ItemSetup.TUFF);
        registerRecipe(1, new ItemStack(Material.DRIPSTONE_BLOCK), ItemSetup.DRIPSTONE_BLOCK);
        registerRecipe(1, new ItemStack(Material.GRASS_BLOCK), ItemSetup.GRASS_BLOCK);
        registerRecipe(1, new ItemStack(Material.DIRT), ItemSetup.DIRT);
        registerRecipe(1, new ItemStack(Material.COARSE_DIRT), ItemSetup.COARSE_DIRT);
        registerRecipe(1, new ItemStack(Material.PODZOL), ItemSetup.PODZOL);
        registerRecipe(1, new ItemStack(Material.ROOTED_DIRT), ItemSetup.ROOTED_DIRT);
        registerRecipe(1, new ItemStack(Material.CRIMSON_NYLIUM), ItemSetup.CRIMSON_NYLIUM);
        registerRecipe(1, new ItemStack(Material.WARPED_NYLIUM), ItemSetup.WARPED_NYLIUM);
        registerRecipe(1, new ItemStack(Material.COBBLESTONE), ItemSetup.COBBLESTONE);
        registerRecipe(1, new ItemStack(Material.OAK_PLANKS), ItemSetup.OAK_PLANKS);
        registerRecipe(1, new ItemStack(Material.SPRUCE_PLANKS), ItemSetup.SPRUCE_PLANKS);
        registerRecipe(1, new ItemStack(Material.BIRCH_PLANKS), ItemSetup.BIRCH_PLANKS);
        registerRecipe(1, new ItemStack(Material.JUNGLE_PLANKS), ItemSetup.JUNGLE_PLANKS);
        registerRecipe(1, new ItemStack(Material.ACACIA_PLANKS), ItemSetup.ACACIA_PLANKS);
        registerRecipe(1, new ItemStack(Material.DARK_OAK_PLANKS), ItemSetup.DARK_OAK_PLANKS);
        registerRecipe(1, new ItemStack(Material.CRIMSON_PLANKS), ItemSetup.CRIMSON_PLANKS);
        registerRecipe(1, new ItemStack(Material.WARPED_PLANKS), ItemSetup.WARPED_PLANKS);
        registerRecipe(1, new ItemStack(Material.BEDROCK), ItemSetup.BEDROCK);
        registerRecipe(1, new ItemStack(Material.SAND), ItemSetup.SAND);
        registerRecipe(1, new ItemStack(Material.RED_SAND), ItemSetup.RED_SAND);
        registerRecipe(1, new ItemStack(Material.GRAVEL), ItemSetup.GRAVEL);
        registerRecipe(1, new ItemStack(Material.COAL_ORE), ItemSetup.COAL_ORE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE_COAL_ORE), ItemSetup.DEEPSLATE_COAL_ORE);
        registerRecipe(1, new ItemStack(Material.IRON_ORE), ItemSetup.IRON_ORE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE_IRON_ORE), ItemSetup.DEEPSLATE_IRON_ORE);
        registerRecipe(1, new ItemStack(Material.COPPER_ORE), ItemSetup.COPPER_ORE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE_COPPER_ORE), ItemSetup.DEEPSLATE_COPPER_ORE);
        registerRecipe(1, new ItemStack(Material.GOLD_ORE), ItemSetup.GOLD_ORE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE_GOLD_ORE), ItemSetup.DEEPSLATE_GOLD_ORE);
        registerRecipe(1, new ItemStack(Material.REDSTONE_ORE), ItemSetup.REDSTONE_ORE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE_REDSTONE_ORE), ItemSetup.DEEPSLATE_REDSTONE_ORE);
        registerRecipe(1, new ItemStack(Material.EMERALD_ORE), ItemSetup.EMERALD_ORE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE_EMERALD_ORE), ItemSetup.DEEPSLATE_EMERALD_ORE);
        registerRecipe(1, new ItemStack(Material.LAPIS_ORE), ItemSetup.LAPIS_LAZULI_ORE);
        registerRecipe(1, new ItemStack(Material.DEEPSLATE_LAPIS_ORE), ItemSetup.DEEPSLATE_LAPIS_LAZULI_ORE);
        registerRecipe(1, new ItemStack(Material.DIAMOND_ORE), ItemSetup.DEEPSLATE_DIAMOND_ORE);
        registerRecipe(1, new ItemStack(Material.NETHER_GOLD_ORE), ItemSetup.NETHER_GOLD_ORE);
        registerRecipe(1, new ItemStack(Material.NETHER_QUARTZ_ORE), ItemSetup.NETHER_QUARTZ_ORE);
        registerRecipe(1, new ItemStack(Material.ANCIENT_DEBRIS), ItemSetup.ANCIENT_DEBRIS);
        registerRecipe(1, new ItemStack(Material.COAL_BLOCK), ItemSetup.BLOCK_OF_COAL);
        registerRecipe(1, new ItemStack(Material.RAW_IRON_BLOCK), ItemSetup.BLOCK_OF_RAW_IRON);
        registerRecipe(1, new ItemStack(Material.RAW_COPPER_BLOCK), ItemSetup.BLOCK_OF_RAW_COPPER);
        registerRecipe(1, new ItemStack(Material.AMETHYST_BLOCK), ItemSetup.BLOCK_OF_AMETHYST);
        registerRecipe(1, new ItemStack(Material.BUDDING_AMETHYST), ItemSetup.BUDDING_AMETHYST);
        registerRecipe(1, new ItemStack(Material.BEACON), ItemSetup.BEACON);
        registerRecipe(1, new ItemStack(Material.STRUCTURE_VOID), ItemSetup.STRUCTURE_VOID);
        registerRecipe(1, new ItemStack(Material.BARRIER), ItemSetup.BARRIER);
        registerRecipe(1, new ItemStack(Material.GLOWSTONE), ItemSetup.GLOWSTONE);
        registerRecipe(1, new ItemStack(Material.SOUL_SAND), ItemSetup.SOUL_SAND);
        registerRecipe(1, new ItemStack(Material.SOUL_SOIL), ItemSetup.SOUL_SOIL);
        registerRecipe(1, new ItemStack(Material.HONEY_BLOCK), ItemSetup.HONEY_BLOCK);
        registerRecipe(1, new ItemStack(Material.BONE_BLOCK), ItemSetup.BONE_BLOCK);
        registerRecipe(1, new ItemStack(Material.SLIME_BLOCK), ItemSetup.SLIME_BLOCK);
        registerRecipe(1, new ItemStack(Material.SOUL_CAMPFIRE), ItemSetup.SOUL_CAMPFIRE);
        registerRecipe(1, new ItemStack(Material.CAMPFIRE), ItemSetup.CAMPFIRE);
        registerRecipe(1, new ItemStack(Material.BEE_NEST), ItemSetup.BEE_NEST);
        registerRecipe(1, new ItemStack(Material.LODESTONE), ItemSetup.LODESTONE);
        registerRecipe(1, new ItemStack(Material.CRYING_OBSIDIAN), ItemSetup.CRYING_OBSIDIAN);
        registerRecipe(1, new ItemStack(Material.SOUL_LANTERN), ItemSetup.SOUL_FIRE_LANTERN);
        registerRecipe(1, new ItemStack(Material.LANTERN), ItemSetup.LANTERN);
        registerRecipe(1, new ItemStack(Material.SHROOMLIGHT), ItemSetup.SHROOMLIGHT);
        registerRecipe(1, new ItemStack(Material.REDSTONE_LAMP), ItemSetup.REDSTONE_LAMP);
        registerRecipe(1, new ItemStack(Material.JACK_O_LANTERN), ItemSetup.PUMPKIN_LANTERN);
        registerRecipe(1, new ItemStack(Material.DEAD_BUSH), ItemSetup.DEAD_BUSH);
        registerRecipe(1, new ItemStack(Material.TOTEM_OF_UNDYING), ItemSetup.TOTEM_OF_UNDYING);
        registerRecipe(1, new ItemStack(Material.SCULK_SENSOR), ItemSetup.SCULK_SENSOR);
        registerRecipe(1, new ItemStack(Material.SCAFFOLDING), ItemSetup.SCAFFOLDING);
        registerRecipe(1, new ItemStack(Material.LAVA_BUCKET), ItemSetup.LAVA_BUCKET);
        registerRecipe(1, new ItemStack(Material.WATER_BUCKET), ItemSetup.WATER_BUCKET);
        registerRecipe(1, new ItemStack(Material.MILK_BUCKET), ItemSetup.MILK_BUCKET);
        registerRecipe(1, new ItemStack(Material.POWDER_SNOW_BUCKET), ItemSetup.POWDER_SNOW_BUCKET);
        registerRecipe(1, new ItemStack(Material.BUCKET), ItemSetup.BUCKET);
        registerRecipe(1, new ItemStack(Material.POPPY), ItemSetup.ROSE);
        registerRecipe(1, new ItemStack(Material.CHEST), ItemSetup.CHEST);
        registerRecipe(1, new ItemStack(Material.COCOA_BEANS), ItemSetup.COCOA_BEAN);
        registerRecipe(1, new ItemStack(Material.SPYGLASS), ItemSetup.SPYGLASS);
        registerRecipe(1, new ItemStack(Material.BRICKS), ItemSetup.BRICKS);
        registerRecipe(1, new ItemStack(Material.JUKEBOX), ItemSetup.JUKEBOX);
        registerRecipe(1, new ItemStack(Material.COMMAND_BLOCK), ItemSetup.COMMAND_BLOCK);
        registerRecipe(1, new ItemStack(Material.CHAIN_COMMAND_BLOCK), ItemSetup.CHAIN_COMMAND_BLOCK);
        registerRecipe(1, new ItemStack(Material.REPEATING_COMMAND_BLOCK), ItemSetup.REPEAT_COMMAND_BLOCK);
        registerRecipe(1, new ItemStack(Material.CACTUS), ItemSetup.CACTUS);
        registerRecipe(1, new ItemStack(Material.OBSERVER), ItemSetup.OBSERVER);
        registerRecipe(1, new ItemStack(Material.SLIME_BALL), ItemSetup.SLIME_BALL);
        registerRecipe(1, new ItemStack(Material.MAGMA_CREAM), ItemSetup.MAGMA_CREAM);
        registerRecipe(1, new ItemStack(Material.PISTON), ItemSetup.PISTON);
        registerRecipe(1, new ItemStack(Material.STICKY_PISTON), ItemSetup.STICKY_PISTON);
        registerRecipe(1, new ItemStack(Material.TARGET), ItemSetup.TARGET_BLOCK);
        registerRecipe(1, new ItemStack(Material.CRAFTING_TABLE), ItemSetup.CRAFTING_TABLE);
        registerRecipe(1, new ItemStack(Material.STONECUTTER), ItemSetup.STONECUTTER);
        registerRecipe(1, new ItemStack(Material.GRINDSTONE), ItemSetup.GRINDSTONE);
        registerRecipe(1, new ItemStack(Material.FLETCHING_TABLE), ItemSetup.FLETCHING_TABLE);
        registerRecipe(1, new ItemStack(Material.SMITHING_TABLE), ItemSetup.SMITHING_TABLE);
        registerRecipe(1, new ItemStack(Material.CARTOGRAPHY_TABLE), ItemSetup.CARTOGRAPHY_TABLE);
        registerRecipe(1, new ItemStack(Material.ENCHANTING_TABLE), ItemSetup.ENCHANTING_TABLE);
        registerRecipe(1, new ItemStack(Material.ENCHANTED_BOOK), ItemSetup.ENCHANTED_BOOK);
        registerRecipe(1, new ItemStack(Material.LOOM), ItemSetup.LOOM);
        registerRecipe(1, new ItemStack(Material.LECTERN), ItemSetup.LECTERN);
        registerRecipe(1, new ItemStack(Material.CAULDRON), ItemSetup.CAULDRON);
        registerRecipe(1, new ItemStack(Material.FURNACE), ItemSetup.FURNACE);
        registerRecipe(1, new ItemStack(Material.BLAST_FURNACE), ItemSetup.BLAST_FURNACE);
        registerRecipe(1, new ItemStack(Material.SMOKER), ItemSetup.SMOKER);
        registerRecipe(1, new ItemStack(Material.ANVIL), ItemSetup.ANVIL);
        registerRecipe(1, new ItemStack(Material.CHIPPED_ANVIL), ItemSetup.CHIPPED_ANVIL);
        registerRecipe(1, new ItemStack(Material.DAMAGED_ANVIL), ItemSetup.DAMAGED_ANVIL);
        registerRecipe(1, new ItemStack(Material.END_CRYSTAL), ItemSetup.END_CRYSTAL);
        registerRecipe(1, new ItemStack(Material.SPONGE), ItemSetup.SPONGE);
        registerRecipe(1, new ItemStack(Material.WET_SPONGE), ItemSetup.WET_SPONGE);
        registerRecipe(1, new ItemStack(Material.CAKE), ItemSetup.CAKE);
        registerRecipe(1, new ItemStack(Material.COOKIE), ItemSetup.COOKIE);
        registerRecipe(1, new ItemStack(Material.PUMPKIN_PIE), ItemSetup.PUMPKIN_PIE);
        registerRecipe(1, new ItemStack(Material.SUGAR_CANE), ItemSetup.SUGAR_CANE);
        registerRecipe(1, new ItemStack(Material.PUMPKIN), ItemSetup.PUMPKIN);
        registerRecipe(1, new ItemStack(Material.CARVED_PUMPKIN), ItemSetup.CARVED_PUMPKIN);
        registerRecipe(1, new ItemStack(Material.MELON), ItemSetup.MELON);
        registerRecipe(1, new ItemStack(Material.TNT), ItemSetup.TNT);








    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);


        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return new CustomItemStack(Material.DIAMOND_AXE, "&bReducing...");
    }

    @Override
    public String getMachineIdentifier() {
        return "BLOCKREDUCER";
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }

    @Override
    public int getEnergyConsumption() {return ENERGY_CONSUMPTION;
    }

    @Override
    public int getSpeed() {
        return SPEED;
    }
}

