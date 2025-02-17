package me.SuperRonanCraft.BetterRTP.references.rtpinfo.worlds;

import lombok.NonNull;
import me.SuperRonanCraft.BetterRTP.BetterRTP;
import me.SuperRonanCraft.BetterRTP.player.rtp.RTP_SHAPE;
import org.bukkit.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface RTPWorld {

    boolean getUseWorldborder();

    int getCenterX();

    int getCenterZ();

    int getMaxRadius();

    int getMinRadius();

    int getPrice();

    List<String> getBiomes();

    @NonNull World getWorld();

    RTP_SHAPE getShape();

    int getMinY();

    int getMaxY();

    @Nullable
    default String getID() {
        return null;
    }

    default long getCooldown() {
        return BetterRTP.getInstance().getCooldowns().getCooldownTime();
    }
}
