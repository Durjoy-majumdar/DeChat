package com.tencent.p014mm.plugin.finder.extension.reddot;

import fy3.C32224a;
import gy3.C87413o;
import je1.C9342n1;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.q */
public final class C2486q extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ long f12997d;

    /* renamed from: e */
    public final /* synthetic */ C9342n1.C9345c f12998e;

    /* renamed from: f */
    public final /* synthetic */ int f12999f;

    /* renamed from: g */
    public final /* synthetic */ C55718s0 f13000g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2486q(long j, C9342n1.C9345c cVar, int i, C55718s0 s0Var) {
        super(0);
        this.f12997d = j;
        this.f12998e = cVar;
        this.f12999f = i;
        this.f13000g = s0Var;
    }

    public Object invoke() {
        return "redDotFeedId = " + C61926c.m72691p(this.f12997d) + ", requestFeedId=" + C61926c.m72691p(this.f12998e.f145380r) + ", tabType = " + this.f12999f + ", findPageRedDotTipsId = " + this.f13000g.field_tipsId + ", requestRedDotTipsId = " + this.f12998e.f29203Q;
    }
}
