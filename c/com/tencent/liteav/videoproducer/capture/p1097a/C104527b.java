package com.tencent.liteav.videoproducer.capture.p1097a;

import android.hardware.Camera;
import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoproducer.capture.a.b */
final /* synthetic */ class C104527b implements Camera.AutoFocusCallback {

    /* renamed from: a */
    private static final C104527b f309840a = new C104527b();

    private C104527b() {
    }

    /* renamed from: a */
    public static Camera.AutoFocusCallback m139867a() {
        return f309840a;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        LiteavLog.m16897d("CameraController", "onAutoFocus success: %b", Boolean.valueOf(z));
    }
}
