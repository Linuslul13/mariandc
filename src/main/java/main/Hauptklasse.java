package main;

import commands.Join;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;


public class Hauptklasse {

    public static void main(String[] args) throws LoginException {

        String prefix = "!";

        String status;
        status = "Marian zuschauen auf Twitch";

        int zahl = 12;
        double kommzahl = 1.45;

        shutdown = true;
        String token = "OTk3MTc1Mzk4NTY5ODc3NTc0.GUMuAR.7Jo3IeeCQBmriuqfWsXshaB0WbSemjIYUOqnoo";

        JDABuilder bauplan = JDABuilder.createDefault(token);

        bauplan.setStatus(OnlineStatus.ONLINE);
        bauplan.setActivity(Activity.playing(status));

        bauplan.setChunkingFilter(ChunkingFilter.ALL);
        bauplan.setMemberCachePolicy(MemberCachePolicy.ALL);
        bauplan.enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_VOICE_STATES, GatewayIntent.DIRECT_MESSAGE_TYPING, GatewayIntent.DIRECT_MESSAGES);

        EnumSet<CacheFlag> enumSet = EnumSet.of(CacheFlag.ONLINE_STATUS, CacheFlag.CLIENT_STATUS, CacheFlag.VOICE_STATE, CacheFlag.EMOJI);

        bauplan.addEventListeners(new Join());

        JDA bot = bauplan.build();

        System.out.println("Der Bot ist nun an!");
        System.out.println("Der Prefix des Bots lautet:" + prefix);
    }

    public static boolean shutdown = false;
}

