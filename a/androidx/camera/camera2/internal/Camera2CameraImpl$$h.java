package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;

public final /* synthetic */ class Camera2CameraImpl$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f44003d;

    /* renamed from: e */
    public final /* synthetic */ String f44004e;

    /* renamed from: f */
    public final /* synthetic */ SessionConfig f44005f;

    public /* synthetic */ Camera2CameraImpl$$h(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig) {
        this.f44003d = camera2CameraImpl;
        this.f44004e = str;
        this.f44005f = sessionConfig;
    }

    public final void run() {
        this.f44003d.lambda$onUseCaseReset$8(this.f44004e, this.f44005f);
    }
}
