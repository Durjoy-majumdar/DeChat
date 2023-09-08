package p378r;

import androidx.camera.camera2.interop.Camera2CameraControl;
import p202m2.C117512b;

/* renamed from: r.a$$h */
public final /* synthetic */ class a$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControl f62800d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f62801e;

    public /* synthetic */ a$$h(Camera2CameraControl camera2CameraControl, C117512b.C117513a aVar) {
        this.f62800d = camera2CameraControl;
        this.f62801e = aVar;
    }

    public final void run() {
        this.f62800d.lambda$setCaptureRequestOptions$1(this.f62801e);
    }
}
