package androidx.camera.camera2.internal;

import androidx.camera.core.impl.DeferrableSurface;

public final /* synthetic */ class ProcessingCaptureSession$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DeferrableSurface f44073d;

    public /* synthetic */ ProcessingCaptureSession$$b(DeferrableSurface deferrableSurface) {
        this.f44073d = deferrableSurface;
    }

    public final void run() {
        ProcessingCaptureSession.sHeldProcessorSurfaces.remove(this.f44073d);
    }
}
