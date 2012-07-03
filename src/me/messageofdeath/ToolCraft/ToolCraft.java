package me.messageofdeath.ToolCraft;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ToolCraft extends JavaPlugin {
	
	public String lprefix;
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		lprefix = "[" + pdfFile.getName() + "] v" + pdfFile.getVersion() + ": ";
		log("is now enabling...");
		log("loading recipes...");
		loadHoes();
		loadPickAxes();
		loadAxes();
		loadShovels();
		loadSwords();
		log("loaded recipes!");
		log("is now enabled!");
	}
	
	public void log(String log) {
		Bukkit.getLogger().info(lprefix + log);
	}
	
	public void loadHoes() {
		
	}
	
	public void loadPickAxes() {
		
	}
	
	public void loadAxes() {
		
	}
	
	public void loadShovels() {
		
	}
	
	public void loadSwords() {
		
	}
}
