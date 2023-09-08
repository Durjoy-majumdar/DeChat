package androidx.camera.core.impl;

import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: androidx.camera.core.impl.e */
public final /* synthetic */ class C16534e {
    /* renamed from: a */
    public static CameraControl m15546a(CameraInternal cameraInternal) {
        return cameraInternal.getCameraControlInternal();
    }

    /* renamed from: b */
    public static CameraInfo m15547b(CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfoInternal();
    }

    /* renamed from: c */
    public static LinkedHashSet m15548c(CameraInternal cameraInternal) {
        return new LinkedHashSet(Collections.singleton(cameraInternal));
    }

    /* renamed from: d */
    public static CameraConfig m15549d(CameraInternal cameraInternal) {
        return CameraConfigs.emptyConfig();
    }

    /* renamed from: e */
    public static void m15550e(CameraInternal cameraInternal, boolean z) {
    }

    /* renamed from: f */
    public static void m15551f(CameraInternal cameraInternal, CameraConfig cameraConfig) {
    }
}
