package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.impl.g */
public final /* synthetic */ class C16536g {
    /* renamed from: a */
    public static boolean m15554a(Config.OptionPriority optionPriority, Config.OptionPriority optionPriority2) {
        Config.OptionPriority optionPriority3 = Config.OptionPriority.ALWAYS_OVERRIDE;
        if (optionPriority == optionPriority3 && optionPriority2 == optionPriority3) {
            return true;
        }
        Config.OptionPriority optionPriority4 = Config.OptionPriority.REQUIRED;
        return optionPriority == optionPriority4 && optionPriority2 == optionPriority4;
    }

    /* renamed from: b */
    public static Config m15555b(Config config, Config config2) {
        if (config == null && config2 == null) {
            return OptionsBundle.emptyBundle();
        }
        MutableOptionsBundle from = config2 != null ? MutableOptionsBundle.from(config2) : MutableOptionsBundle.create();
        if (config != null) {
            for (Config.Option next : config.listOptions()) {
                from.insertOption(next, config.getOptionPriority(next), config.retrieveOption(next));
            }
        }
        return OptionsBundle.from(from);
    }
}
