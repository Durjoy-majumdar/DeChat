package com.tencent.thumbplayer.tmediacodec.hook;

import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class PreloadSurface extends Surface {
    private final SurfaceTexture mSurfaceTexture;

    public PreloadSurface(SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.mSurfaceTexture = surfaceTexture;
    }

    public final SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }
}
