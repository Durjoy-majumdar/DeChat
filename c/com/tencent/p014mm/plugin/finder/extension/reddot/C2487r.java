package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import gy3.C87413o;
import je1.C9342n1;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.r */
public final class C2487r extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ C9342n1.C9346d f13001d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f13002e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2487r(C9342n1.C9346d dVar, BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f13001d = dVar;
        this.f13002e = baseFinderFeed;
    }

    public Object invoke() {
        return "requestRedDotId = " + C61926c.m72691p(this.f13001d.mo10088b().f145380r) + ", respFeedId=" + C61926c.m72691p(this.f13002e.mo3513o().getFeedObject().f164794id) + ", tabType = " + this.f13001d.mo10088b().f145379q + ", requestRedDotTipsId = " + this.f13001d.mo10088b().f29203Q;
    }
}
