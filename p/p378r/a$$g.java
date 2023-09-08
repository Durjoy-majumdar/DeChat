package p378r;

import androidx.camera.camera2.interop.Camera2CameraControl;
import p202m2.C117512b;

/* renamed from: r.a$$g */
public final /* synthetic */ class a$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControl f62798d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f62799e;

    public /* synthetic */ a$$g(Camera2CameraControl camera2CameraControl, C117512b.C117513a aVar) {
        this.f62798d = camera2CameraControl;
        this.f62799e = aVar;
    }

    public final void run() {
        this.f62798d.lambda$clearCaptureRequestOptions$5(this.f62799e);
    }
}
