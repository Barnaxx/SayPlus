package fr.barnaxx.sayplus;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin
{
  static final Logger log = Logger.getLogger("Minecraft");

  public void onDisable()
  {
    info("has been Disabled!");
  }

public void onEnable()
  {
    if (getConfig().getBoolean("autoupdate")) {
	Updater updater = new Updater(this, 64664, getFile(), Updater.UpdateType.DEFAULT, true);
    }
    info("has been Enabled!");
    saveDefaultConfig();
  }

  public void info(String msg) {
    Logger.getLogger("Minecraft").info("[" + getDescription().getName() + " v" + getDescription().getVersion() + "] " + msg);
  }

  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    if (cmd.getName().equalsIgnoreCase("say")) {
      if (args.length == 0) {
        sender.sendMessage(ChatColor.RED + "Wrong syntax, use '/sayplus' if you want some help");
        return true;
      }
      String msg = "";
      String msgcolor = getConfig().getString("msgcolor");
      String prefix = getConfig().getString("prefix").replaceAll("%S%", sender.getName());
      String configsound = getConfig().getString("sound");
      for (String s : args) {
        msg = msg + s + " ";
      }
      getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + ChatColor.RESET + " " + ChatColor.valueOf(msgcolor) + msg + ChatColor.RESET));
      if (getConfig().getBoolean("enablesound")) {
        for (Player p : Bukkit.getOnlinePlayers()) {
          p.playSound(p.getLocation(), Sound.valueOf(configsound), 1.0F, 0.0F);
        }
      }
      return true;
    }
    if (cmd.getName().equalsIgnoreCase("sayplus")) {
      sender.sendMessage(ChatColor.GOLD + "-------------------");
      sender.sendMessage(ChatColor.GREEN + "SayPlus v" + ChatColor.GOLD + getDescription().getVersion() + " ");
      sender.sendMessage(ChatColor.GREEN + "Author: " + ChatColor.GOLD + "Barnaxx");
      sender.sendMessage(ChatColor.GREEN + " ");
      sender.sendMessage(ChatColor.GOLD + "Commands List:");
      sender.sendMessage(ChatColor.GREEN + "/say <message>" + ChatColor.GOLD + " - Send a custom say");
      sender.sendMessage(ChatColor.GREEN + "/sayplus" + ChatColor.GOLD + " - Show this dialog");
      sender.sendMessage(ChatColor.GREEN + "/sayplusreload" + ChatColor.GOLD + " - Reload the configuration");
      sender.sendMessage(ChatColor.GREEN + "/saypluscolors" + ChatColor.GOLD + " - Show the color codes");
      sender.sendMessage(ChatColor.GOLD + "-------------------");
      return true;
    }
    if (cmd.getName().equalsIgnoreCase("saypluscolors")) {
      sender.sendMessage(ChatColor.GREEN + "[SayPlus] " + "§cC§6o§el§ao§br§9C§5o§cd§6e§es");
      sender.sendMessage("§f&0 - §0Text        §r§f&b - §bText");
      sender.sendMessage("§f&1 - §1Text        §r§f&c - §cText");
      sender.sendMessage("§f&2 - §2Text        §r§f&d - §dText");
      sender.sendMessage("§f&3 - §3Text        §r§f&e - §eText");
      sender.sendMessage("§f&4 - §4Text        §r§f&f - §fText");
      sender.sendMessage("§f&5 - §5Text        §r§f&k - §kText");
      sender.sendMessage("§f&6 - §6Text        §r§f&l - §lText");
      sender.sendMessage("§f&7 - §7Text        §r§f&m - §mText");
      sender.sendMessage("§f&8 - §8Text        §r§f&n - §nText");
      sender.sendMessage("§f&9 - §9Text        §r§f&o - §oText");
      sender.sendMessage("§f&a - §aText        §r§f&r - Resets...");
      sender.sendMessage("§fCombinations are possible but &r will reset all formatting.");
      sender.sendMessage("No colors can be mixed either.");
      return true;
    }
    if (cmd.getName().equalsIgnoreCase("sayplusreload")) {
      reloadConfig();
      sender.sendMessage(ChatColor.GREEN + "SayPlus v" + ChatColor.GOLD + getDescription().getVersion() + ChatColor.GREEN + " reloaded!");
      return true;
    }
    return false;
  }
}