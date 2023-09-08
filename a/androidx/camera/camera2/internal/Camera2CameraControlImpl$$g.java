package androidx.camera.camera2.internal;

import p202m2.C117512b;

public final /* synthetic */ class Camera2CameraControlImpl$$g implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraControlImpl f43969a;

    /* renamed from: b */
    public final /* synthetic */ long f43970b;

    public /* synthetic */ Camera2CameraControlImpl$$g(Camera2CameraControlImpl camera2CameraControlImpl, long j) {
        this.f43969a = camera2CameraControlImpl;
        this.f43970b = j;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f43969a.lambda$waitForSessionUpdateId$4(this.f43970b, aVar);
    }
}
