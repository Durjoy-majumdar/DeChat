package com.tencent.p014mm.smiley;

import android.text.Spannable;
import gy3.C87412m;

/* renamed from: com.tencent.mm.smiley.k0 */
public final class C96950k0 implements C96975y {

    /* renamed from: a */
    public final /* synthetic */ C96945j0 f284021a;

    /* renamed from: b */
    public final /* synthetic */ Spannable f284022b;

    public C96950k0(C96945j0 j0Var, Spannable spannable) {
        this.f284021a = j0Var;
        this.f284022b = spannable;
    }

    /* renamed from: a */
    public boolean mo135526a(C96974x xVar, int i, int i2) {
        C87412m.m108594g(xVar, "item");
        if (!(xVar instanceof C96932e0)) {
            return false;
        }
        C96931e.m124499a().mo135524d(this.f284022b, this.f284021a.mo135534f((C96932e0) xVar), i, i2, true);
        return false;
    }
}
