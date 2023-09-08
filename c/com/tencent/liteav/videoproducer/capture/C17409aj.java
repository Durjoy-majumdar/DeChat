package com.tencent.liteav.videoproducer.capture;

import android.graphics.Bitmap;
import com.tencent.liteav.videoproducer.capture.VirtualCamera;

/* renamed from: com.tencent.liteav.videoproducer.capture.aj */
final /* synthetic */ class C17409aj implements Runnable {

    /* renamed from: a */
    private final C17405ah f47250a;

    /* renamed from: b */
    private final Bitmap f47251b;

    /* renamed from: c */
    private final int f47252c;

    /* renamed from: d */
    private final int f47253d;

    /* renamed from: e */
    private final int f47254e;

    private C17409aj(C17405ah ahVar, Bitmap bitmap, int i, int i2, int i3) {
        this.f47250a = ahVar;
        this.f47251b = bitmap;
        this.f47252c = i;
        this.f47253d = i2;
        this.f47254e = i3;
    }

    /* renamed from: a */
    public static Runnable m17459a(C17405ah ahVar, Bitmap bitmap, int i, int i2, int i3) {
        return new C17409aj(ahVar, bitmap, i, i2, i3);
    }

    public final void run() {
        C17405ah ahVar = this.f47250a;
        Bitmap bitmap = this.f47251b;
        int i = this.f47252c;
        int i2 = this.f47253d;
        int i3 = this.f47254e;
        VirtualCamera.VirtualCameraParams virtualCameraParams = new VirtualCamera.VirtualCameraParams();
        ahVar.f47230b = virtualCameraParams;
        virtualCameraParams.f47223a = bitmap;
        virtualCameraParams.f47183b = i;
        virtualCameraParams.f47185d = i2;
        virtualCameraParams.f47184c = i3;
        VirtualCamera virtualCamera = ahVar.f47229a;
        if (virtualCamera != null) {
            virtualCamera.stop();
        }
        ahVar.f47229a = new VirtualCamera(ahVar.f47234f, ahVar.f47236h);
        ahVar.f47238j = true;
    }
}
