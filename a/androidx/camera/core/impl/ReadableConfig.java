package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Set;

public interface ReadableConfig extends Config {
    boolean containsOption(Config.Option<?> option);

    void findOptions(String str, Config.OptionMatcher optionMatcher);

    Config getConfig();

    Config.OptionPriority getOptionPriority(Config.Option<?> option);

    Set<Config.OptionPriority> getPriorities(Config.Option<?> option);

    Set<Config.Option<?>> listOptions();

    <ValueT> ValueT retrieveOption(Config.Option<ValueT> option);

    <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, ValueT valuet);

    <ValueT> ValueT retrieveOptionWithPriority(Config.Option<ValueT> option, Config.OptionPriority optionPriority);
}
