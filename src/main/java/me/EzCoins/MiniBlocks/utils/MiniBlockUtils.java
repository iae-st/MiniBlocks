package me.EzCoins.MiniBlocks.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Locale;

public final class MiniBlockUtils {

    private MiniBlockUtils() {
        throw new IllegalStateException("Utility class");
    }

    @Nullable
    public static SlimefunItem getMiniBlock(@Nonnull ItemStack itemStack) {
        return getMiniBlock(itemStack.getType());
    }

    @Nullable
    public static SlimefunItem getMiniBlock(@Nonnull Material material) {
        CustomHead head = CustomHead.fromMaterial(material);
        if (head == null) {
            return null;
        } else {
            return getMiniBlock(head);
        }
    }

    @Nullable
    public static SlimefunItem getMiniBlock(@Nonnull CustomHead head) {
        return SlimefunItem.getById(getMiniBlockID(head));
    }

    @Nonnull
    public static String getMiniBlockID(@Nonnull CustomHead head) {
        return head.name().toUpperCase(Locale.ROOT).replace(" ", "_") + "MINIBLOCK";
    }

    @Nonnull
    public static String getMiniBlockDisplayName(@Nonnull CustomHead head) {
        return "&9" + head.name().substring(0, 1).toUpperCase() + head.name().substring(1).toLowerCase().replace("_", " ") +" &8(MiniBlock)";
    }
}
