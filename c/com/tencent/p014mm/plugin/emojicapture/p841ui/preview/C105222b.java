package com.tencent.p014mm.plugin.emojicapture.p841ui.preview;

import android.graphics.Rect;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108597q;
import j71.C108598r;
import o40.C61926c;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111139a;

/* renamed from: com.tencent.mm.plugin.emojicapture.ui.preview.b */
public final class C105222b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StickerPreviewView f312579d;

    /* renamed from: e */
    public final /* synthetic */ int f312580e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105222b(StickerPreviewView stickerPreviewView, int i) {
        super(0);
        this.f312579d = stickerPreviewView;
        this.f312580e = i;
    }

    public Object invoke() {
        StickerPreviewView stickerPreviewView = this.f312579d;
        C108598r rVar = stickerPreviewView.f269379E;
        int i = this.f312580e;
        Rect rect = stickerPreviewView.f269382H;
        rVar.getClass();
        C87412m.m108594g(rect, "previewRect");
        if (rVar.f325140t != i) {
            rVar.f325140t = i;
            rVar.f325139B.set(rect);
            C111139a aVar = rVar.f325141u;
            if (aVar != null) {
                aVar.mo158471l();
            }
            C108597q qVar = rVar.f325142v;
            if (qVar != null) {
                qVar.mo158471l();
            }
            C110194c cVar = rVar.f325145y;
            if (cVar != null) {
                cVar.close();
            }
            rVar.mo159594w();
            rVar.f331382g = rVar.mo157952f();
            C111139a aVar2 = rVar.f325141u;
            if (aVar2 != null) {
                aVar2.mo143263u(rVar.f331376a, rVar.f331377b);
            }
            C111139a aVar3 = rVar.f325141u;
            if (aVar3 != null) {
                aVar3.mo158522s(rVar.f325146z, rVar.f325138A);
            }
            C111139a aVar4 = rVar.f325141u;
            if (aVar4 != null) {
                aVar4.f332758m = rVar.f331389n;
            }
            if (aVar4 != null) {
                aVar4.f332760o = rVar.f331390o;
            }
            C108597q qVar2 = rVar.f325142v;
            if (qVar2 != null) {
                qVar2.mo143263u(rVar.f325146z, rVar.f325138A);
            }
            C108597q qVar3 = rVar.f325142v;
            if (qVar3 != null) {
                qVar3.mo158522s(rVar.f331378c, rVar.f331379d);
            }
            rVar.mo159593v();
        }
        C61926c.m72668M(new C68880a(this.f312579d));
        return C13598b0.f38549a;
    }
}
