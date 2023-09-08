package androidx.camera.camera2.internal;

import java.util.List;

public final /* synthetic */ class Camera2CameraImpl$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f43992d;

    /* renamed from: e */
    public final /* synthetic */ List f43993e;

    public /* synthetic */ Camera2CameraImpl$$c(Camera2CameraImpl camera2CameraImpl, List list) {
        this.f43992d = camera2CameraImpl;
        this.f43993e = list;
    }

    public final void run() {
        this.f43992d.lambda$detachUseCases$12(this.f43993e);
    }
}
