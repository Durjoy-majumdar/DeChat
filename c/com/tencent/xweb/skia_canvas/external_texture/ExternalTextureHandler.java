package com.tencent.xweb.skia_canvas.external_texture;

import android.graphics.SurfaceTexture;

public class ExternalTextureHandler implements ISkiaCanvasExternalTextureHandler {
    private volatile boolean mIsDestroyed;
    private volatile long mNativePeer;

    private ExternalTextureHandler(long j) {
        this.mNativePeer = j;
    }

    public static ExternalTextureHandler create(long j) {
        return new ExternalTextureHandler(j);
    }

    private boolean isValid() {
        return !this.mIsDestroyed;
    }

    private boolean load(String str, int i, String str2) {
        return SkiaCanvasExternalTextureManager.getInstance().load(this, str, i, str2);
    }

    private native void nativeOnFrameAvailable(long j);

    private native void nativeOnLoad(long j, SurfaceTexture surfaceTexture, int i, int i2);

    private synchronized void notifyDestroyed(String str, int i, String str2) {
        onDestroy(str, i, str2);
        this.mIsDestroyed = true;
    }

    private void onDestroy(String str, int i, String str2) {
        SkiaCanvasExternalTextureManager.getInstance().onDestroy(this, str, i, str2);
    }

    private float[] updateImage(int i, String str, int i2, String str2) {
        return SkiaCanvasExternalTextureManager.getInstance().updateImage(this, i, str, i2, str2);
    }

    public synchronized void onFrameAvailable() {
        if (isValid()) {
            nativeOnFrameAvailable(this.mNativePeer);
        }
    }

    public void onLoad(SurfaceTexture surfaceTexture, int i, int i2) {
        if (isValid()) {
            nativeOnLoad(this.mNativePeer, surfaceTexture, i, i2);
        }
    }
}
