package com.tencent.p014mm.plugin.finder.activity.uic;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.activity.uic.a */
public final class C2313a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderActivityParticipateUIC f12531d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2313a(FinderActivityParticipateUIC finderActivityParticipateUIC) {
        super(0);
        this.f12531d = finderActivityParticipateUIC;
    }

    public Object invoke() {
        FinderActivityParticipateUIC finderActivityParticipateUIC = this.f12531d;
        int i = finderActivityParticipateUIC.f12496q;
        if (i > 0) {
            int i2 = i - 1;
            finderActivityParticipateUIC.f12496q = i2;
            finderActivityParticipateUIC.mo2217G3(i2);
            Log.m105924i("FinderActivityParticipateUIC", "activityParticipateCount minus: " + this.f12531d.f12496q);
        }
        return C13598b0.f38549a;
    }
}
