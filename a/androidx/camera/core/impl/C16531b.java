package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.b */
public final /* synthetic */ class C16531b {
    /* renamed from: a */
    public static SessionProcessor m15538a(CameraConfig cameraConfig) {
        return (SessionProcessor) cameraConfig.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR);
    }

    /* renamed from: b */
    public static SessionProcessor m15539b(CameraConfig cameraConfig, SessionProcessor sessionProcessor) {
        return (SessionProcessor) cameraConfig.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
    }

    /* renamed from: c */
    public static int m15540c(CameraConfig cameraConfig) {
        return ((Integer) cameraConfig.retrieveOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
    }

    /* renamed from: d */
    public static UseCaseConfigFactory m15541d(CameraConfig cameraConfig) {
        return (UseCaseConfigFactory) cameraConfig.retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE);
    }

    /* renamed from: e */
    public static Boolean m15542e(CameraConfig cameraConfig) {
        return (Boolean) cameraConfig.retrieveOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.FALSE);
    }
}
