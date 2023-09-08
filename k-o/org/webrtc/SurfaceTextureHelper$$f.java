package org.webrtc;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class SurfaceTextureHelper$$f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ SurfaceTextureHelper f61845d;

    public /* synthetic */ SurfaceTextureHelper$$f(SurfaceTextureHelper surfaceTextureHelper) {
        this.f61845d = surfaceTextureHelper;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f61845d.lambda$new$0(surfaceTexture);
    }
}
