package com.andrei1058.bedwars.commands.main.subcmds.regular;

import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.spectator.TeleporterGUI;
import com.andrei1058.bedwars.commands.ParentCommand;
import com.andrei1058.bedwars.commands.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Teleporter extends SubCommand {
    /**
     * Create a sub-command for a bedWars command
     * Make sure you return true or it will say command not found
     *
     * @param parent parent command
     * @param name   sub-command name
     * @since 0.6.1 api v6
     */
    public Teleporter(ParentCommand parent, String name) {
        super(parent, name);
        showInList(false);
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        Arena a = Arena.getArenaByPlayer(p);
        if (a == null) return false;
        if (!a.isSpectator(p)) return false;
        TeleporterGUI.openGUI(p);
        return true;
    }
}