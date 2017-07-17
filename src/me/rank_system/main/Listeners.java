package me.rank_system.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;



/**
 * Created by luguco on 13.05.2017.
 */
public class Listeners implements Listener {

    private Main plugin;

    public Listeners(Main main) {
        this.plugin = main;
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void chat(AsyncPlayerChatEvent e) {

        Player p = e.getPlayer();
        Player[] onlinePlayers = Bukkit.getOnlinePlayers().toArray(new Player[Bukkit.getOnlinePlayers().size()]);
        String message = e.getMessage();


        if (p.hasPermission("group." + plugin.getConfig().getString("Groups.1"))) {
            setTag(p, plugin.getConfig().getString("Tags.1"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.1");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.2"))) {
            setTag(p, plugin.getConfig().getString("Tags.2"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.2");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.3"))) {
            setTag(p, plugin.getConfig().getString("Tags.3"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.3");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.4"))) {
            setTag(p, plugin.getConfig().getString("Tags.4"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.4");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.5"))) {
            setTag(p, plugin.getConfig().getString("Tags.5"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.5");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.6"))) {
            setTag(p, plugin.getConfig().getString("Tags.6"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.6");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        }else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.7"))) {
            setTag(p, plugin.getConfig().getString("Tags.7"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.7");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.8"))) {
            setTag(p, plugin.getConfig().getString("Tags.8"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.8");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        }else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.9"))) {
            setTag(p, plugin.getConfig().getString("Tags.9"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.9");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.10"))) {
            setTag(p, plugin.getConfig().getString("Tags.10"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.10");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        }else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.11"))) {
            setTag(p, plugin.getConfig().getString("Tags.11"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.11");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            e.setFormat(cfgmsg);

        } else {
            setTag(p, plugin.getConfig().getString("Tags.default"), onlinePlayers);
            String cfgmsg = plugin.getConfig().getString("Chat.default");
            cfgmsg = cfgmsg.replace("&player", p.getName());
            cfgmsg = cfgmsg + message;
            ChatColor.translateAlternateColorCodes('§', cfgmsg);
            e.setFormat(cfgmsg);
        }

    }

    @EventHandler
    public void join(PlayerLoginEvent e){
        Player p = e.getPlayer();
        Player[] onlinePlayers = Bukkit.getOnlinePlayers().toArray(new Player[Bukkit.getOnlinePlayers().size()]);



        if (p.hasPermission("group." + plugin.getConfig().getString("Groups.1"))) {
            setTag(p, plugin.getConfig().getString("Tags.1"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.2"))) {
            setTag(p, plugin.getConfig().getString("Tags.2"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.3"))) {
            setTag(p, plugin.getConfig().getString("Tags.3"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.4"))) {
            setTag(p, plugin.getConfig().getString("Tags.4"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.5"))) {
            setTag(p, plugin.getConfig().getString("Tags.5"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.6"))) {
            setTag(p, plugin.getConfig().getString("Tags.6"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.7"))) {
            setTag(p, plugin.getConfig().getString("Tags.7"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.8"))) {
            setTag(p, plugin.getConfig().getString("Tags.8"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.9"))) {
            setTag(p, plugin.getConfig().getString("Tags.9"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.10"))) {
            setTag(p, plugin.getConfig().getString("Tags.10"), onlinePlayers);

        } else if (p.hasPermission("group." + plugin.getConfig().getString("Groups.11"))) {
            setTag(p, plugin.getConfig().getString("Tags.11"), onlinePlayers);

        }  else {
            setTag(p, plugin.getConfig().getString("Tags.default"), onlinePlayers);
        }

    }


    public void setTag(Player player, String tag, Player[] toSet) {

        Scoreboard board = Bukkit.getScoreboardManager().getMainScoreboard();
        Team team = board.getTeam(player.getName());
        if (team == null) {
            team = board.registerNewTeam(player.getName());
        }
        team.setPrefix(tag);
        team.addPlayer(player);
        for (Player players : toSet) {
            players.setScoreboard(board);
        }
    }



}



