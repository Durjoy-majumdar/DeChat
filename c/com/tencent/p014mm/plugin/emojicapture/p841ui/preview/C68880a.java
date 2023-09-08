package com.tencent.p014mm.plugin.emojicapture.p841ui.preview;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.a */
public final class C68880a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StickerPreviewView f197899d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68880a(StickerPreviewView stickerPreviewView) {
        super(0);
        this.f197899d = stickerPreviewView;
    }

    public Object invoke() {
        this.f197899d.f269387w.requestLayout();
        return C13598b0.f38549a;
    }
}
