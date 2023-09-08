package com.tencent.thumbplayer.tmediacodec.hook;

import android.graphics.SurfaceTexture;

public interface SurfaceCallback {
    void onDestroy(SurfaceTexture surfaceTexture);
}
