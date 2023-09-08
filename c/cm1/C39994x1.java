package cm1;

import gy3.C87412m;
import te3.C51238sg0;
import tf1.C13914m;

/* renamed from: cm1.x1 */
public final class C39994x1 implements C0740i2 {

    /* renamed from: d */
    public final C51238sg0 f107216d;

    /* renamed from: e */
    public final int f107217e;

    /* renamed from: f */
    public int f107218f;

    public C39994x1(C51238sg0 sg02, int i, int i2) {
        C87412m.m108594g(sg02, "info");
        this.f107216d = sg02;
        this.f107217e = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f107217e;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C39994x1 x1Var = mVar instanceof C39994x1 ? (C39994x1) mVar : null;
        return (x1Var == null || !C87412m.m108589b(x1Var.f107216d.f141491e, this.f107216d.f141491e)) ? -1 : 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
