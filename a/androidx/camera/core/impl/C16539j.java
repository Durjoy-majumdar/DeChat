package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.j */
public final /* synthetic */ class C16539j {
    /* renamed from: a */
    public static boolean m15570a(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().containsOption(option);
    }

    /* renamed from: b */
    public static void m15571b(ReadableConfig readableConfig, String str, Config.OptionMatcher optionMatcher) {
        readableConfig.getConfig().findOptions(str, optionMatcher);
    }

    /* renamed from: c */
    public static Config.OptionPriority m15572c(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().getOptionPriority(option);
    }

    /* renamed from: d */
    public static Set m15573d(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().getPriorities(option);
    }

    /* renamed from: e */
    public static Set m15574e(ReadableConfig readableConfig) {
        return readableConfig.getConfig().listOptions();
    }

    /* renamed from: f */
    public static Object m15575f(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().retrieveOption(option);
    }

    /* renamed from: g */
    public static Object m15576g(ReadableConfig readableConfig, Config.Option option, Object obj) {
        return readableConfig.getConfig().retrieveOption(option, obj);
    }

    /* renamed from: h */
    public static Object m15577h(ReadableConfig readableConfig, Config.Option option, Config.OptionPriority optionPriority) {
        return readableConfig.getConfig().retrieveOptionWithPriority(option, optionPriority);
    }
}
