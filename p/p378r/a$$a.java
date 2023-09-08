package p378r;

import androidx.camera.camera2.interop.Camera2CameraControl;
import p202m2.C117512b;

/* renamed from: r.a$$a */
public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControl f62790d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f62791e;

    public /* synthetic */ a$$a(Camera2CameraControl camera2CameraControl, C117512b.C117513a aVar) {
        this.f62790d = camera2CameraControl;
        this.f62791e = aVar;
    }

    public final void run() {
        this.f62790d.lambda$addCaptureRequestOptions$3(this.f62791e);
    }
}
