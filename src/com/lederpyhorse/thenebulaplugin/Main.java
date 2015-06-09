package com.lederpyhorse.thenebulaplugin;
//package declaration
import org.bukkit.plugin.java.JavaPlugin;
//imports
public final class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Plugin Enabled!");
	}
	//what the plugin says when it is initialized
	@Override
	public void onDisable() {
		getLogger().info("Plugin Disabled!");
	}
	//add all commands to plugin.yml. NO TABS. use 2 spaces instead.
}
