package androidx.camera.camera2.internal;

import p202m2.C117512b;

public final /* synthetic */ class Camera2CameraImpl$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f44009d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44010e;

    /* renamed from: f */
    public final /* synthetic */ String f44011f;

    public /* synthetic */ Camera2CameraImpl$$k(Camera2CameraImpl camera2CameraImpl, C117512b.C117513a aVar, String str) {
        this.f44009d = camera2CameraImpl;
        this.f44010e = aVar;
        this.f44011f = str;
    }

    public final void run() {
        this.f44009d.lambda$isUseCaseAttached$9(this.f44010e, this.f44011f);
    }
}
