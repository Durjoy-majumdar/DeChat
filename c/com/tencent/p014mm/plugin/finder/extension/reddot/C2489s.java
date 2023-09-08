package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.s */
public final class C2489s extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ FinderObject f13004d;

    /* renamed from: e */
    public final /* synthetic */ int f13005e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2489s(FinderObject finderObject, int i) {
        super(0);
        this.f13004d = finderObject;
        this.f13005e = i;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("redDotFeedId = ");
        C2490t.f13006a.getClass();
        sb.append(C61926c.m72691p(C2490t.f13008c));
        sb.append(", realShowFeedId=");
        sb.append(C61926c.m72691p(this.f13004d.f164794id));
        sb.append(", tabType = ");
        sb.append(this.f13005e);
        sb.append(", redDotTipsId = ");
        sb.append(C2490t.f13009d);
        return sb.toString();
    }
}
