package com.tencent.p014mm.plugin.finder.extension.reddot;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.g0 */
public final class C55713g0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderRedDotExpiredHandler f158577d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55713g0(FinderRedDotExpiredHandler finderRedDotExpiredHandler) {
        super(0);
        this.f158577d = finderRedDotExpiredHandler;
    }

    public Object invoke() {
        C2479n0.f12957c.observeForever(new C55712f0(this.f158577d));
        return C13598b0.f38549a;
    }
}
