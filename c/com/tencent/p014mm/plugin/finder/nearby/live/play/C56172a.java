package com.tencent.p014mm.plugin.finder.nearby.live.play;

import cm1.C0797z;
import fy3.C32224a;
import gy3.C87413o;
import pm1.C62378a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.a */
public final class C56172a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f160245d;

    /* renamed from: e */
    public final /* synthetic */ NearbyLivePreviewView f160246e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56172a(boolean z, NearbyLivePreviewView nearbyLivePreviewView) {
        super(0);
        this.f160245d = z;
        this.f160246e = nearbyLivePreviewView;
    }

    public Object invoke() {
        C0797z zVar;
        float f = this.f160245d ? 1.0f : 0.0f;
        if (!(this.f160246e.getAlpha() == f)) {
            NearbyLivePreviewView nearbyLivePreviewView = this.f160246e;
            StringBuilder sb = new StringBuilder();
            sb.append("set alpha:");
            sb.append(f);
            sb.append(" feedId: ");
            C62378a aVar = this.f160246e.f160228i;
            sb.append((aVar == null || (zVar = aVar.f177278c) == null) ? null : Long.valueOf(zVar.getItemId()));
            nearbyLivePreviewView.mo78387f(sb.toString());
            this.f160246e.setAlpha(f);
        }
        return C13598b0.f38549a;
    }
}
