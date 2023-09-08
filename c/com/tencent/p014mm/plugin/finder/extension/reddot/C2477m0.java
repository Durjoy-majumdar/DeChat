package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.google.android.gms.common.internal.ImagesContract;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.m0 */
public final class C2477m0 extends C87413o implements C32226l<C55718s0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderRedDotManager f12943d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2477m0(FinderRedDotManager finderRedDotManager) {
        super(1);
        this.f12943d = finderRedDotManager;
    }

    public Object invoke(Object obj) {
        C55718s0 s0Var = (C55718s0) obj;
        C87412m.m108594g(s0Var, ImagesContract.LOCAL);
        this.f12943d.mo77234K(s0Var);
        return C13598b0.f38549a;
    }
}
