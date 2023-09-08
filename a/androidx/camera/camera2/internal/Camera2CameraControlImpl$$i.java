package androidx.camera.camera2.internal;

import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p1167z8.C112608f;

public final /* synthetic */ class Camera2CameraControlImpl$$i implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraControlImpl f43973a;

    /* renamed from: b */
    public final /* synthetic */ List f43974b;

    /* renamed from: c */
    public final /* synthetic */ int f43975c;

    /* renamed from: d */
    public final /* synthetic */ int f43976d;

    /* renamed from: e */
    public final /* synthetic */ int f43977e;

    public /* synthetic */ Camera2CameraControlImpl$$i(Camera2CameraControlImpl camera2CameraControlImpl, List list, int i, int i2, int i3) {
        this.f43973a = camera2CameraControlImpl;
        this.f43974b = list;
        this.f43975c = i;
        this.f43976d = i2;
        this.f43977e = i3;
    }

    public final C112608f apply(Object obj) {
        return this.f43973a.lambda$submitStillCaptureRequests$5(this.f43974b, this.f43975c, this.f43976d, this.f43977e, (Void) obj);
    }
}
