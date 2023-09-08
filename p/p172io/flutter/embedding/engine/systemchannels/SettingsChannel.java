package p172io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import java.util.Map;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.JSONMessageCodec;

/* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel */
public class SettingsChannel {
    private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
    public static final String CHANNEL_NAME = "flutter/settings";
    private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
    private static final String TAG = "SettingsChannel";
    private static final String TEXT_SCALE_FACTOR = "textScaleFactor";
    public final BasicMessageChannel<Object> channel;

    /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder */
    public static class MessageBuilder {
        private final BasicMessageChannel<Object> channel;
        private Map<String, Object> message = new HashMap();

        public MessageBuilder(BasicMessageChannel<Object> basicMessageChannel) {
            this.channel = basicMessageChannel;
        }

        public void send() {
            Log.m165290v(SettingsChannel.TAG, "Sending message: \ntextScaleFactor: " + this.message.get(SettingsChannel.TEXT_SCALE_FACTOR) + "\nalwaysUse24HourFormat: " + this.message.get(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT) + "\nplatformBrightness: " + this.message.get(SettingsChannel.PLATFORM_BRIGHTNESS));
            this.channel.send(this.message);
        }

        public MessageBuilder setPlatformBrightness(PlatformBrightness platformBrightness) {
            this.message.put(SettingsChannel.PLATFORM_BRIGHTNESS, platformBrightness.name);
            return this;
        }

        public MessageBuilder setTextScaleFactor(float f) {
            this.message.put(SettingsChannel.TEXT_SCALE_FACTOR, Float.valueOf(f));
            return this;
        }

        public MessageBuilder setUse24HourFormat(boolean z) {
            this.message.put(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness */
    public enum PlatformBrightness {
        light("light"),
        dark("dark");
        
        public String name;

        private PlatformBrightness(String str) {
            this.name = str;
        }
    }

    public SettingsChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, CHANNEL_NAME, JSONMessageCodec.INSTANCE);
    }

    public MessageBuilder startMessage() {
        return new MessageBuilder(this.channel);
    }
}
