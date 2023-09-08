package org.webrtc;

public final /* synthetic */ class SurfaceTextureHelper$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SurfaceTextureHelper f61843d;

    /* renamed from: e */
    public final /* synthetic */ int f61844e;

    public /* synthetic */ SurfaceTextureHelper$$e(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.f61843d = surfaceTextureHelper;
        this.f61844e = i;
    }

    public final void run() {
        this.f61843d.lambda$setFrameRotation$4(this.f61844e);
    }
}
