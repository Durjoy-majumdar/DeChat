package sp3;

import gy3.C8480h;
import gy3.C87412m;
import rr3.C110625c0;

/* renamed from: sp3.h */
public final class C110805h {

    /* renamed from: a */
    public String f331493a;

    /* renamed from: b */
    public C110625c0 f331494b;

    /* renamed from: c */
    public long f331495c;

    public C110805h(String str, C110625c0 c0Var, long j, int i, C8480h hVar) {
        str = (i & 1) != 0 ? "" : str;
        c0Var = (i & 2) != 0 ? null : c0Var;
        j = (i & 4) != 0 ? 1000 : j;
        C87412m.m108595h(str, "path");
        this.f331493a = str;
        this.f331494b = c0Var;
        this.f331495c = j;
    }

    /* renamed from: a */
    public final long mo162375a() {
        return this.f331495c;
    }

    /* renamed from: b */
    public final boolean mo162376b() {
        return this.f331493a.length() > 0;
    }
}
