package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.core.impl.k */
public final /* synthetic */ class C16540k<T extends UseCase> {
    /* renamed from: a */
    public static CameraSelector m15578a(UseCaseConfig useCaseConfig) {
        return (CameraSelector) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAMERA_SELECTOR);
    }

    /* renamed from: b */
    public static CameraSelector m15579b(UseCaseConfig useCaseConfig, CameraSelector cameraSelector) {
        return (CameraSelector) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
    }

    /* renamed from: c */
    public static CaptureConfig.OptionUnpacker m15580c(UseCaseConfig useCaseConfig) {
        return (CaptureConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    /* renamed from: d */
    public static CaptureConfig.OptionUnpacker m15581d(UseCaseConfig useCaseConfig, CaptureConfig.OptionUnpacker optionUnpacker) {
        return (CaptureConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    /* renamed from: e */
    public static CaptureConfig m15582e(UseCaseConfig useCaseConfig) {
        return (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    /* renamed from: f */
    public static CaptureConfig m15583f(UseCaseConfig useCaseConfig, CaptureConfig captureConfig) {
        return (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    /* renamed from: g */
    public static SessionConfig m15584g(UseCaseConfig useCaseConfig) {
        return (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
    }

    /* renamed from: h */
    public static SessionConfig m15585h(UseCaseConfig useCaseConfig, SessionConfig sessionConfig) {
        return (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    /* renamed from: i */
    public static SessionConfig.OptionUnpacker m15586i(UseCaseConfig useCaseConfig) {
        return (SessionConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
    }

    /* renamed from: j */
    public static SessionConfig.OptionUnpacker m15587j(UseCaseConfig useCaseConfig, SessionConfig.OptionUnpacker optionUnpacker) {
        return (SessionConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    /* renamed from: k */
    public static int m15588k(UseCaseConfig useCaseConfig) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    /* renamed from: l */
    public static int m15589l(UseCaseConfig useCaseConfig, int i) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i))).intValue();
    }

    /* renamed from: m */
    public static Range m15590m(UseCaseConfig useCaseConfig) {
        return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE);
    }

    /* renamed from: n */
    public static Range m15591n(UseCaseConfig useCaseConfig, Range range) {
        return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
    }
}
