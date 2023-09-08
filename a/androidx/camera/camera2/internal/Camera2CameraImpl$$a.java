package androidx.camera.camera2.internal;

public final /* synthetic */ class Camera2CameraImpl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f43989d;

    /* renamed from: e */
    public final /* synthetic */ String f43990e;

    public /* synthetic */ Camera2CameraImpl$$a(Camera2CameraImpl camera2CameraImpl, String str) {
        this.f43989d = camera2CameraImpl;
        this.f43990e = str;
    }

    public final void run() {
        this.f43989d.lambda$onUseCaseInactive$6(this.f43990e);
    }
}
