package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;

public final /* synthetic */ class Camera2CameraImpl$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f44013d;

    /* renamed from: e */
    public final /* synthetic */ String f44014e;

    /* renamed from: f */
    public final /* synthetic */ SessionConfig f44015f;

    public /* synthetic */ Camera2CameraImpl$$m(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig) {
        this.f44013d = camera2CameraImpl;
        this.f44014e = str;
        this.f44015f = sessionConfig;
    }

    public final void run() {
        this.f44013d.lambda$onUseCaseActive$5(this.f44014e, this.f44015f);
    }
}
