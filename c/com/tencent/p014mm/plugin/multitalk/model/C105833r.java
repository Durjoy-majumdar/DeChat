package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.model.r */
public final class C105833r implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public static final C105833r f314769d = new C105833r();

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        try {
            surfaceTexture.updateTexImage();
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MultiTalkCameraManager", "updateTexImage error");
        }
    }
}
