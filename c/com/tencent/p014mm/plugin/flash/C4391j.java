package com.tencent.p014mm.plugin.flash;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.flash.j */
public class C4391j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashUI f19037d;

    public C4391j(FaceFlashUI faceFlashUI) {
        this.f19037d = faceFlashUI;
    }

    public void run() {
        FaceFlashProcessLayout faceFlashProcessLayout = this.f19037d.f18900e;
        faceFlashProcessLayout.f18896n.cancel();
        faceFlashProcessLayout.f18897o.cancel();
        faceFlashProcessLayout.f18898p.cancel();
        FaceFlashPreviewLayout faceFlashPreviewLayout = this.f19037d.f18899d;
        faceFlashPreviewLayout.getClass();
        Log.m105924i("MicroMsg.FaceFlashManager", "release");
        faceFlashPreviewLayout.f18871t.release();
        faceFlashPreviewLayout.f18857J.cancel();
        this.f19037d.f18906n.dead();
        this.f19037d.f18907o.dead();
    }
}
