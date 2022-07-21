package me.EzCoins.MiniBlocks.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.EzCoins.MiniBlocks.abstracts.AbstractMachineBlock;
import me.EzCoins.MiniBlocks.itemsetup.ItemSetup;
import me.EzCoins.MiniBlocks.utils.CustomHead;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.block.data.type.TNT;
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
        for (CustomHead head : CustomHead.getCachedValues()) {
            registerRecipe(1, new ItemStack(head.getMaterial()), head.getSlimefunItemStack());
        }
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