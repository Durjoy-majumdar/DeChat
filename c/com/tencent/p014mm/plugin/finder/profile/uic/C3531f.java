package com.tencent.p014mm.plugin.finder.profile.uic;

import com.tencent.p014mm.plugin.report.service.C115669n;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C51270sn1;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.f */
public final class C3531f extends C87413o implements C32227p<C51270sn1, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileFeedUIC f16385d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3531f(FinderProfileFeedUIC finderProfileFeedUIC) {
        super(2);
        this.f16385d = finderProfileFeedUIC;
    }

    public Object invoke(Object obj, Object obj2) {
        C51270sn1 sn12 = (C51270sn1) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C87412m.m108594g(sn12, "item");
        if (booleanValue) {
            this.f16385d.getFeedLoader().switchToTopic(sn12.f141618e);
            C115669n nVar = C115669n.INSTANCE;
            nVar.kvStat(21570, this.f16385d.getUsername() + ",2," + C61926c.m72691p(sn12.f141618e));
        } else {
            this.f16385d.getFeedLoader().switchToTopic(0);
        }
        return C13598b0.f38549a;
    }
}
