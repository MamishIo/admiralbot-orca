package com.admiralbot.orca.model.discord.interactionresponse;

import com.admiralbot.orca.model.discord.NumberBitfield;
import com.admiralbot.orca.model.discord.components.MessageComponent;
import com.admiralbot.orca.model.discord.embed.Embed;
import com.admiralbot.orca.model.discord.message.Attachment;
import com.admiralbot.orca.model.discord.message.MessageFlag;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record InteractionCallbackMessageData(
        @JsonProperty("tts") Boolean isTts,
        @JsonProperty("content") String content,
        @JsonProperty("embeds") List<Embed> embeds, // Currently max 10
        @JsonProperty("allowed_mentions") AllowedMentions allowedMentions,
        @JsonProperty("flags") NumberBitfield<MessageFlag> flags,
        @JsonProperty("components") List<MessageComponent> components,
        @JsonProperty("attachments") List<Attachment> attachments
) implements InteractionCallbackData {}
