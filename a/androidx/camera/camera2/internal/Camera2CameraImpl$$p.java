package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;

public final /* synthetic */ class Camera2CameraImpl$$p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f44020d;

    /* renamed from: e */
    public final /* synthetic */ String f44021e;

    /* renamed from: f */
    public final /* synthetic */ SessionConfig f44022f;

    public /* synthetic */ Camera2CameraImpl$$p(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig) {
        this.f44020d = camera2CameraImpl;
        this.f44021e = str;
        this.f44022f = sessionConfig;
    }

    public final void run() {
        this.f44020d.lambda$onUseCaseUpdated$7(this.f44021e, this.f44022f);
    }
}
