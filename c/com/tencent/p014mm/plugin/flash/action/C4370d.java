package com.tencent.p014mm.plugin.flash.action;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.action.d */
public class C4370d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashActionPreviewLayout f18996d;

    public C4370d(FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f18996d = faceFlashActionPreviewLayout;
    }

    public void run() {
        Log.m105925i("MicroMsg.FaceFlashActionPreviewLayout", "faceReflectMask.post faceTipTextViewBefore.getHeight():%s", Integer.valueOf(this.f18996d.f18929g.getTop()));
        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f18996d;
        faceFlashActionPreviewLayout.f18927e.setCircleMarginY((float) (faceFlashActionPreviewLayout.f18929g.getTop() + this.f18996d.f18929g.getHeight() + C76577a.m92151b(MMApplicationContext.getContext(), 48)));
        this.f18996d.f18927e.invalidate();
        this.f18996d.mo5249c();
    }
}
