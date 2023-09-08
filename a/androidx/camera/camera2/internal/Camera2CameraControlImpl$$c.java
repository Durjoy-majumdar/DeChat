package androidx.camera.camera2.internal;

public final /* synthetic */ class Camera2CameraControlImpl$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControlImpl f43964d;

    public /* synthetic */ Camera2CameraControlImpl$$c(Camera2CameraControlImpl camera2CameraControlImpl) {
        this.f43964d = camera2CameraControlImpl;
    }

    public final void run() {
        this.f43964d.updateSessionConfigSynchronous();
    }
}
