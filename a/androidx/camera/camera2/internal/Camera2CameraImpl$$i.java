package androidx.camera.camera2.internal;

public final /* synthetic */ class Camera2CameraImpl$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f44006d;

    /* renamed from: e */
    public final /* synthetic */ boolean f44007e;

    public /* synthetic */ Camera2CameraImpl$$i(Camera2CameraImpl camera2CameraImpl, boolean z) {
        this.f44006d = camera2CameraImpl;
        this.f44007e = z;
    }

    public final void run() {
        this.f44006d.lambda$setActiveResumingMode$13(this.f44007e);
    }
}
