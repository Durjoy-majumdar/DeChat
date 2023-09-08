package androidx.camera.core.internal;

/* renamed from: androidx.camera.core.internal.b */
public final /* synthetic */ class C16559b<T> {
    /* renamed from: a */
    public static Class m15598a(TargetConfig targetConfig) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
    }

    /* renamed from: b */
    public static Class m15599b(TargetConfig targetConfig, Class cls) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
    }

    /* renamed from: c */
    public static String m15600c(TargetConfig targetConfig) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME);
    }

    /* renamed from: d */
    public static String m15601d(TargetConfig targetConfig, String str) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
    }
}
