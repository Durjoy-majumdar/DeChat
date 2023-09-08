package androidx.camera.camera2.internal;

public final /* synthetic */ class Camera2CameraImpl$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f43994d;

    public /* synthetic */ Camera2CameraImpl$$d(Camera2CameraImpl camera2CameraImpl) {
        this.f43994d = camera2CameraImpl;
    }

    public final void run() {
        this.f43994d.closeInternal();
    }
}
