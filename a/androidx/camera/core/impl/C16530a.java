package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.ExifData;

/* renamed from: androidx.camera.core.impl.a */
public final /* synthetic */ class C16530a {
    /* renamed from: a */
    public static CaptureResult m15536a(CameraCaptureResult cameraCaptureResult) {
        return CameraCaptureResult.EmptyCameraCaptureResult.create().getCaptureResult();
    }

    /* renamed from: b */
    public static void m15537b(CameraCaptureResult cameraCaptureResult, ExifData.Builder builder) {
        builder.setFlashState(cameraCaptureResult.getFlashState());
    }
}
