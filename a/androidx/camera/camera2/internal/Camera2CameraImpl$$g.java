package androidx.camera.camera2.internal;

import androidx.camera.core.impl.DeferrableSurface;

public final /* synthetic */ class Camera2CameraImpl$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f43999d;

    /* renamed from: e */
    public final /* synthetic */ CaptureSession f44000e;

    /* renamed from: f */
    public final /* synthetic */ DeferrableSurface f44001f;

    /* renamed from: g */
    public final /* synthetic */ Runnable f44002g;

    public /* synthetic */ Camera2CameraImpl$$g(Camera2CameraImpl camera2CameraImpl, CaptureSession captureSession, DeferrableSurface deferrableSurface, Runnable runnable) {
        this.f43999d = camera2CameraImpl;
        this.f44000e = captureSession;
        this.f44001f = deferrableSurface;
        this.f44002g = runnable;
    }

    public final void run() {
        this.f43999d.lambda$configAndClose$1(this.f44000e, this.f44001f, this.f44002g);
    }
}
