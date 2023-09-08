package androidx.camera.camera2.internal;

import p202m2.C117512b;

public final /* synthetic */ class Camera2CameraControlImpl$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControlImpl f43978d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f43979e;

    public /* synthetic */ Camera2CameraControlImpl$$j(Camera2CameraControlImpl camera2CameraControlImpl, C117512b.C117513a aVar) {
        this.f43978d = camera2CameraControlImpl;
        this.f43979e = aVar;
    }

    public final void run() {
        this.f43978d.lambda$updateSessionConfigAsync$6(this.f43979e);
    }
}
