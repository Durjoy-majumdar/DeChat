package jl1;

import cm1.C0740i2;
import gy3.C87412m;
import te3.C49486fy0;
import te3.C50477n10;
import tf1.C13914m;

/* renamed from: jl1.c */
public final class C9468c implements C0740i2 {

    /* renamed from: d */
    public final C49486fy0 f29538d;

    /* renamed from: e */
    public final C50477n10 f29539e;

    public C9468c(C49486fy0 fy02, C50477n10 n102) {
        C87412m.m108594g(fy02, "gift");
        this.f29538d = fy02;
        this.f29539e = n102;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return -1;
    }

    public long getItemId() {
        String str = this.f29538d.f133734d;
        if (str != null) {
            return (long) str.hashCode();
        }
        return 0;
    }
}
