package me.EzCoins.MiniBlocks.utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

public enum GUIHeads {
    MAIN_GROUP("879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85"),
    BLOCKS_GROUP("16bb9fb97ba87cb727cd0ff477f769370bea19ccbfafb581629cd5639f2fec2b");




    @Getter
    private static final GUIHeads[] cachedValues = values();

    @Getter
    private final String ID;

    @ParametersAreNonnullByDefault
    GUIHeads(String ID) {
        this.ID = ID;
    }


    public ItemStack getPlayerHead() {
        return PlayerHead.getItemStack(PlayerSkin.fromHashCode(ID));
    }
}
