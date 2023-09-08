package androidx.camera.camera2.internal;

public final /* synthetic */ class Camera2CameraImpl$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f43991d;

    public /* synthetic */ Camera2CameraImpl$$b(Camera2CameraImpl camera2CameraImpl) {
        this.f43991d = camera2CameraImpl;
    }

    public final void run() {
        this.f43991d.openInternal();
    }
}
