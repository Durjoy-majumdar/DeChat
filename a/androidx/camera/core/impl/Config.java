package androidx.camera.core.impl;

import java.util.Set;

public interface Config {

    public static abstract class Option<T> {
        public static <T> Option<T> create(String str, Class<?> cls) {
            return create(str, cls, (Object) null);
        }

        public abstract String getId();

        public abstract Object getToken();

        public abstract Class<T> getValueClass();

        public static <T> Option<T> create(String str, Class<?> cls, Object obj) {
            return new AutoValue_Config_Option(str, cls, obj);
        }
    }

    public interface OptionMatcher {
        boolean onOptionMatched(Option<?> option);
    }

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    boolean containsOption(Option<?> option);

    void findOptions(String str, OptionMatcher optionMatcher);

    OptionPriority getOptionPriority(Option<?> option);

    Set<OptionPriority> getPriorities(Option<?> option);

    Set<Option<?>> listOptions();

    <ValueT> ValueT retrieveOption(Option<ValueT> option);

    <ValueT> ValueT retrieveOption(Option<ValueT> option, ValueT valuet);

    <ValueT> ValueT retrieveOptionWithPriority(Option<ValueT> option, OptionPriority optionPriority);
}
