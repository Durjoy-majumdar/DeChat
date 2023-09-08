package p378r;

import androidx.camera.camera2.interop.Camera2CameraControl;

/* renamed from: r.a$$b */
public final /* synthetic */ class a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControl f62792d;

    /* renamed from: e */
    public final /* synthetic */ boolean f62793e;

    public /* synthetic */ a$$b(Camera2CameraControl camera2CameraControl, boolean z) {
        this.f62792d = camera2CameraControl;
        this.f62793e = z;
    }

    public final void run() {
        this.f62792d.lambda$setActive$7(this.f62793e);
    }
}
