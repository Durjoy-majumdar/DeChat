package com.tencent.map.lib;

public interface JNIInterfaceCallback {
    Object callback(int i, int i2, String str, byte[] bArr, Object obj);

    int callbackGetGLContext();

    boolean onJniCallbackRenderMapFrame(int i);

    void onMapCameraChangeStopped();

    void onMapCameraChanged();

    void onMapLoaded();

    void onVisualLayerClickResult(float f, float f2, long j, String str, String str2);
}
