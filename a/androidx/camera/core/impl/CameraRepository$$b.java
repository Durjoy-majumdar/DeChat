package androidx.camera.core.impl;

public final /* synthetic */ class CameraRepository$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraRepository f44332d;

    /* renamed from: e */
    public final /* synthetic */ CameraInternal f44333e;

    public /* synthetic */ CameraRepository$$b(CameraRepository cameraRepository, CameraInternal cameraInternal) {
        this.f44332d = cameraRepository;
        this.f44333e = cameraInternal;
    }

    public final void run() {
        this.f44332d.lambda$deinit$1(this.f44333e);
    }
}
