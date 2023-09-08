package org.webrtc;

public final /* synthetic */ class SurfaceTextureHelper$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SurfaceTextureHelper f61839d;

    /* renamed from: e */
    public final /* synthetic */ int f61840e;

    /* renamed from: f */
    public final /* synthetic */ int f61841f;

    public /* synthetic */ SurfaceTextureHelper$$c(SurfaceTextureHelper surfaceTextureHelper, int i, int i2) {
        this.f61839d = surfaceTextureHelper;
        this.f61840e = i;
        this.f61841f = i2;
    }

    public final void run() {
        this.f61839d.lambda$setTextureSize$2(this.f61840e, this.f61841f);
    }
}
