package com.tencent.p014mm.plugin.flash;

import android.hardware.Camera;

/* renamed from: com.tencent.mm.plugin.flash.m */
public class C4397m implements Camera.PreviewCallback {

    /* renamed from: d */
    public final /* synthetic */ Camera.PreviewCallback f19046d;

    public C4397m(C105349l lVar, Camera.PreviewCallback previewCallback) {
        this.f19046d = previewCallback;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.PreviewCallback previewCallback = this.f19046d;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        camera.addCallbackBuffer(bArr);
    }
}
