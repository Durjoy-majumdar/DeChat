package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;

public final /* synthetic */ class Camera2CameraImpl$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f43997d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f43998e;

    public /* synthetic */ Camera2CameraImpl$$f(Surface surface, SurfaceTexture surfaceTexture) {
        this.f43997d = surface;
        this.f43998e = surfaceTexture;
    }

    public final void run() {
        Camera2CameraImpl.lambda$configAndClose$0(this.f43997d, this.f43998e);
    }
}
