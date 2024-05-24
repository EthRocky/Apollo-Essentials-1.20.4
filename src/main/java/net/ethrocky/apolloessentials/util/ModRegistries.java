package net.ethrocky.apolloessentials.util;

import net.ethrocky.apolloessentials.command.ReturnHomeCommand;
import net.ethrocky.apolloessentials.command.SetHomeCommand;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.command.CommandRegistryAccess;

public class ModRegistries {
    public static void registerModStuffs() {
        registerCommands();
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }
}
