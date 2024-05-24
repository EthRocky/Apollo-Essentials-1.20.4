package net.ethrocky.apolloessentials.util;

import net.minecraft.nbt.NbtCompound;


public interface IEntityDataSaver {
    NbtCompound getPersistentData();
}