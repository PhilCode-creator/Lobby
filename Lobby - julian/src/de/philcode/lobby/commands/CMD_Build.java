package de.philcode.lobby.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.philcode.lobby.items.Funktionen;
import de.philcode.lobby.utils.Utils;

public class CMD_Build implements CommandExecutor{

	public List<String> build = new ArrayList<String>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(Utils.checkIfPlayer(sender) == true) {	
			if(Utils.checkPlayerPermssion(p, "lobby.build", true, "lobby.*", Utils.NO_PERMS) == true) {
				if(this.build.contains(p.getName())) {
					this.build.remove(p.getName());
					p.setGameMode(GameMode.ADVENTURE);
					p.getInventory().clear();
					Funktionen.giveItems(p);
					p.sendMessage(Utils.PREFIX + "§eDu hast den BauModus verlassen");
				} else {
					this.build.add(p.getName());
					p.setGameMode(GameMode.CREATIVE);
					p.getInventory().clear();
					p.getInventory().setArmorContents(null);
					p.sendMessage(Utils.PREFIX + "§eDu hast den BauModus betreten");
				}
			}
		}
		
		return false;
	}
	
}
