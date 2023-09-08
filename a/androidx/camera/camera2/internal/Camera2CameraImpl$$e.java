package androidx.camera.camera2.internal;

import java.util.List;

public final /* synthetic */ class Camera2CameraImpl$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraImpl f43995d;

    /* renamed from: e */
    public final /* synthetic */ List f43996e;

    public /* synthetic */ Camera2CameraImpl$$e(Camera2CameraImpl camera2CameraImpl, List list) {
        this.f43995d = camera2CameraImpl;
        this.f43996e = list;
    }

    public final void run() {
        this.f43995d.lambda$attachUseCases$11(this.f43996e);
    }
}
