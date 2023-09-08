package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.capture.C17405ah;

/* renamed from: com.tencent.liteav.videoproducer.capture.an */
final /* synthetic */ class C17413an implements Runnable {

    /* renamed from: a */
    private final C17405ah f47261a;

    private C17413an(C17405ah ahVar) {
        this.f47261a = ahVar;
    }

    /* renamed from: a */
    public static Runnable m17463a(C17405ah ahVar) {
        return new C17413an(ahVar);
    }

    public final void run() {
        C17405ah ahVar = this.f47261a;
        C17405ah.C17407a aVar = ahVar.f47239k;
        C17405ah.C17407a aVar2 = C17405ah.C17407a.STOPED;
        if (aVar == aVar2) {
            LiteavLog.m16905w("CaptureController", "Stop capture but mStatus is stoped");
            return;
        }
        ahVar.f47239k = aVar2;
        CaptureSourceInterface captureSourceInterface = ahVar.f47231c;
        if (captureSourceInterface != null) {
            captureSourceInterface.stop();
            ahVar.f47231c = null;
        }
        VirtualCamera virtualCamera = ahVar.f47229a;
        if (virtualCamera != null) {
            virtualCamera.stop();
            ahVar.f47229a = null;
        }
        ahVar.f47240l = false;
        ahVar.f47241m.mo20223b();
    }
}
