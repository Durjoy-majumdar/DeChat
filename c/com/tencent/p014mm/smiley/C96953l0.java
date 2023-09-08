package com.tencent.p014mm.smiley;

import gy3.C8478d0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.smiley.l0 */
public final class C96953l0 implements C96975y {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f284029a;

    /* renamed from: b */
    public final /* synthetic */ String f284030b;

    /* renamed from: c */
    public final /* synthetic */ C8478d0 f284031c;

    /* renamed from: d */
    public final /* synthetic */ String f284032d;

    public C96953l0(StringBuilder sb, String str, C8478d0 d0Var, String str2) {
        this.f284029a = sb;
        this.f284030b = str;
        this.f284031c = d0Var;
        this.f284032d = str2;
    }

    /* renamed from: a */
    public boolean mo135526a(C96974x xVar, int i, int i2) {
        C87412m.m108594g(xVar, "item");
        if (!(xVar instanceof C96932e0)) {
            return false;
        }
        this.f284029a.append(this.f284030b, this.f284031c.f27483d, i);
        this.f284029a.append(this.f284032d);
        this.f284031c.f27483d = i2;
        return false;
    }
}
