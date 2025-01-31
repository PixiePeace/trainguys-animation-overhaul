package com.trainguy9512.animationoverhaul.access;

import com.trainguy9512.animationoverhaul.util.animation.LocatorSkeleton;
import net.minecraft.core.BlockPos;

public interface LivingEntityAccess {
    //float getAnimationVariable(String animationVariable);
    //void setAnimationVariable(String animationVariable, float newValue);
    void setRecordPlayerNearbyValues(String songName, boolean songPlaying, BlockPos songOrigin);
    boolean getIsSongPlaying();
    BlockPos getSongOrigin();
    String getSongName();
    String getPreviousEquippedArmor();
    void setEquippedArmor(String currentArmor);

    boolean getUseInventoryRenderer();
    void setUseInventoryRenderer(boolean bool);

    LocatorSkeleton getLocatorRig();
    void storeLocatorRig(LocatorSkeleton locatorRig);
}
