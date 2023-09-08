package androidx.camera.core.impl;

import android.util.Size;
import java.util.List;

/* renamed from: androidx.camera.core.impl.i */
public final /* synthetic */ class C16538i {
    /* renamed from: a */
    public static int m15557a(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_APP_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    /* renamed from: b */
    public static Size m15558b(ImageOutputConfig imageOutputConfig) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION);
    }

    /* renamed from: c */
    public static Size m15559c(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
    }

    /* renamed from: d */
    public static Size m15560d(ImageOutputConfig imageOutputConfig) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION);
    }

    /* renamed from: e */
    public static Size m15561e(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
    }

    /* renamed from: f */
    public static List m15562f(ImageOutputConfig imageOutputConfig) {
        return (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS);
    }

    /* renamed from: g */
    public static List m15563g(ImageOutputConfig imageOutputConfig, List list) {
        return (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
    }

    /* renamed from: h */
    public static int m15564h(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO)).intValue();
    }

    /* renamed from: i */
    public static Size m15565i(ImageOutputConfig imageOutputConfig) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION);
    }

    /* renamed from: j */
    public static Size m15566j(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
    }

    /* renamed from: k */
    public static int m15567k(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION)).intValue();
    }

    /* renamed from: l */
    public static int m15568l(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    /* renamed from: m */
    public static boolean m15569m(ImageOutputConfig imageOutputConfig) {
        return imageOutputConfig.containsOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
    }
}
