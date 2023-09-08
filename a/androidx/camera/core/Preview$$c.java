package androidx.camera.core;

import androidx.camera.core.Preview;

public final /* synthetic */ class Preview$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Preview.SurfaceProvider f44276d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceRequest f44277e;

    public /* synthetic */ Preview$$c(Preview.SurfaceProvider surfaceProvider, SurfaceRequest surfaceRequest) {
        this.f44276d = surfaceProvider;
        this.f44277e = surfaceRequest;
    }

    public final void run() {
        this.f44276d.onSurfaceRequested(this.f44277e);
    }
}
