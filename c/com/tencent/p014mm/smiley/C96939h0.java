package com.tencent.p014mm.smiley;

import gy3.C8478d0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.smiley.h0 */
public final class C96939h0 implements C96975y {

    /* renamed from: a */
    public final /* synthetic */ int f283988a;

    /* renamed from: b */
    public final /* synthetic */ C8478d0 f283989b;

    public C96939h0(int i, C8478d0 d0Var) {
        this.f283988a = i;
        this.f283989b = d0Var;
    }

    /* renamed from: a */
    public boolean mo135526a(C96974x xVar, int i, int i2) {
        C87412m.m108594g(xVar, "item");
        int i3 = this.f283988a;
        if (i2 <= i3) {
            return false;
        }
        if (i >= i3) {
            return true;
        }
        this.f283989b.f27483d = i2;
        return true;
    }
}
