package com.tencent.xweb;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;

public interface ExtendPluginClient {
    void onPluginDestroy(String str, int i);

    void onPluginManagerDestroy();

    void onPluginReady(String str, int i, SurfaceTexture surfaceTexture);

    void onPluginReadyForGPUProcess(String str, int i, Surface surface);

    void onPluginScreenshotTaken(String str, int i, Bitmap bitmap);

    void onPluginSizeChanged(String str, int i, int i2, int i3, SurfaceTexture surfaceTexture);

    void onPluginSizeChangedForGPUProcess(String str, int i, int i2, int i3, Surface surface);

    void onPluginTouch(String str, int i, MotionEvent motionEvent);
}
