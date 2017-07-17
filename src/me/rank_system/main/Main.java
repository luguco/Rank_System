package me.rank_system.main;

import org.bukkit.plugin.java.JavaPlugin;


/**
 * Created by luguco on 13.05.2017.
 */

public class Main extends JavaPlugin{

    @Override
    public void onEnable(){
        System.out.println("[Rank_System] enabled!");
        new Listeners(this);
        defaultcfg();
    }

    @Override
    public void onDisable(){

        System.out.println("[Rank_System] disabled!");
    }


    public void defaultcfg(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
