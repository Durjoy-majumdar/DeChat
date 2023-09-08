package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p1167z8.C112608f;

public final /* synthetic */ class CaptureSession$$b implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ CaptureSession f44041a;

    /* renamed from: b */
    public final /* synthetic */ SessionConfig f44042b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f44043c;

    public /* synthetic */ CaptureSession$$b(CaptureSession captureSession, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        this.f44041a = captureSession;
        this.f44042b = sessionConfig;
        this.f44043c = cameraDevice;
    }

    public final C112608f apply(Object obj) {
        return this.f44041a.lambda$open$0(this.f44042b, this.f44043c, (List) obj);
    }
}
