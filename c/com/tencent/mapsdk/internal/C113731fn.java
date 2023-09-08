package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.fn */
public final class C113731fn {

    /* renamed from: a */
    public final double f340209a;

    /* renamed from: b */
    public final double f340210b;

    /* renamed from: c */
    public final double f340211c;

    /* renamed from: d */
    public final double f340212d;

    /* renamed from: e */
    public final double f340213e;

    /* renamed from: f */
    public final double f340214f;

    public C113731fn(double d, double d2, double d3, double d4) {
        this.f340209a = d;
        this.f340210b = d3;
        this.f340211c = d2;
        this.f340212d = d4;
        this.f340213e = (d + d2) / 2.0d;
        this.f340214f = (d3 + d4) / 2.0d;
    }

    /* renamed from: b */
    private boolean m156826b(C113731fn fnVar) {
        return fnVar.f340209a >= this.f340209a && fnVar.f340211c <= this.f340211c && fnVar.f340210b >= this.f340210b && fnVar.f340212d <= this.f340212d;
    }

    /* renamed from: a */
    public final boolean mo172081a(double d, double d2) {
        return this.f340209a <= d && d <= this.f340211c && this.f340210b <= d2 && d2 <= this.f340212d;
    }

    /* renamed from: a */
    private boolean m156825a(C113732fo foVar) {
        return mo172081a(foVar.f340215a, foVar.f340216b);
    }

    /* renamed from: a */
    private boolean m156824a(double d, double d2, double d3, double d4) {
        return d < this.f340211c && this.f340209a < d2 && d3 < this.f340212d && this.f340210b < d4;
    }

    /* renamed from: a */
    public final boolean mo172082a(C113731fn fnVar) {
        return m156824a(fnVar.f340209a, fnVar.f340211c, fnVar.f340210b, fnVar.f340212d);
    }
}
