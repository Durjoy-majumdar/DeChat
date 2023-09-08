package com.tencent.p014mm.plugin.flash.action;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.action.c */
public class C4369c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashActionPreviewLayout f18995d;

    public C4369c(FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f18995d = faceFlashActionPreviewLayout;
    }

    public void run() {
        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f18995d;
        faceFlashActionPreviewLayout.f18927e.setCircleMarginY((float) (faceFlashActionPreviewLayout.f18929g.getTop() + this.f18995d.f18929g.getHeight() + C76577a.m92151b(MMApplicationContext.getContext(), 48)));
        this.f18995d.f18927e.invalidate();
        this.f18995d.mo5249c();
    }
}
