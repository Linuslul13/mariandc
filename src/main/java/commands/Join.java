package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Join extends ListenerAdapter {
    public void onGuildMemberJoin (GuildMemberJoinEvent ereignis) {



        User nutzer = ereignis.getUser();
        EmbedBuilder bauplan = new EmbedBuilder();

        bauplan.setTitle("Willkommen auf Marians Discord!");
        bauplan.setColor(Color.white);
        bauplan.setDescription("Danke " + nutzer.getAsMention() + " , dass du dich dazu entschlossen hast meinem Server beizutreten!");
        bauplan.setThumbnail(nutzer.getAvatarUrl());
        bauplan.setFooter("Powerd by Marians Discord^^");


        ereignis.getGuild().getTextChannelById("973132077904060437").sendMessageEmbeds(bauplan.build()).queue();

    }
}
