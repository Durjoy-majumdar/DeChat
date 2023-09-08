package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;

/* renamed from: com.tencent.mapsdk.internal.fo */
public final class C113732fo implements Coordinate {

    /* renamed from: a */
    public double f340215a;

    /* renamed from: b */
    public double f340216b;

    public C113732fo() {
    }

    /* renamed from: b */
    private C113732fo m156836b(double d, double d2) {
        return new C113732fo(this.f340215a + d, this.f340216b + d2);
    }

    /* renamed from: c */
    private C113732fo m156840c(double d, double d2) {
        return new C113732fo(this.f340215a - d, this.f340216b - d2);
    }

    /* renamed from: d */
    private C113732fo m156842d(double d, double d2) {
        return new C113732fo(this.f340215a * d, this.f340216b * d2);
    }

    /* renamed from: e */
    private static boolean m156843e(double d, double d2) {
        return Double.compare(d, d2) != 0 && Math.abs(d - d2) > 1.0E-6d;
    }

    /* renamed from: a */
    public final void mo172083a(double d, double d2) {
        this.f340215a = d;
        this.f340216b = d2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113732fo) {
            C113732fo foVar = (C113732fo) obj;
            return !m156843e(this.f340215a, foVar.f340215a) && !m156843e(this.f340216b, foVar.f340216b);
        }
    }

    public final void setX(double d) {
        this.f340215a = d;
    }

    public final void setY(double d) {
        this.f340216b = d;
    }

    public final void setZ(double d) {
    }

    public final String toString() {
        return this.f340215a + "," + this.f340216b;
    }

    /* renamed from: x */
    public final double mo172089x() {
        return this.f340215a;
    }

    /* renamed from: y */
    public final double mo172090y() {
        return this.f340216b;
    }

    /* renamed from: z */
    public final double mo172091z() {
        return 0.0d;
    }

    public C113732fo(double d, double d2) {
        this.f340215a = d;
        this.f340216b = d2;
    }

    /* renamed from: b */
    private C113732fo m156837b(C113732fo foVar) {
        return new C113732fo(this.f340215a - foVar.f340215a, this.f340216b - foVar.f340216b);
    }

    /* renamed from: c */
    private float m156838c(C113732fo foVar) {
        return foVar.m156837b(this).m156835b();
    }

    /* renamed from: d */
    private C113732fo m156841d() {
        double b = 1.0d / ((double) m156835b());
        return new C113732fo(this.f340215a * b, this.f340216b * b);
    }

    /* renamed from: a */
    private boolean m156834a() {
        double d = this.f340215a;
        if (d < 0.0d || d > 1.0d) {
            return false;
        }
        double d2 = this.f340216b;
        return d2 >= 0.0d && d2 <= 1.0d;
    }

    /* renamed from: c */
    private C113732fo m156839c() {
        double b = 1.0d / ((double) m156835b());
        return new C113732fo(this.f340215a * b, this.f340216b * b);
    }

    /* renamed from: a */
    private C113732fo m156832a(C113732fo foVar) {
        return new C113732fo(this.f340215a + foVar.f340215a, this.f340216b + foVar.f340216b);
    }

    /* renamed from: b */
    private float m156835b() {
        return (float) Math.hypot(this.f340215a, this.f340216b);
    }

    /* renamed from: a */
    private C113732fo m156829a(double d) {
        return new C113732fo(this.f340215a * d, this.f340216b * d);
    }

    /* renamed from: a */
    private C113732fo m156831a(int i) {
        double d = this.f340215a;
        double d2 = this.f340216b;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            double d3 = -d;
            d = d2;
            d2 = d3;
        }
        return new C113732fo(d, d2);
    }

    /* renamed from: a */
    private C113732fo m156830a(float f) {
        double d = (double) f;
        return new C113732fo((double) ((float) ((Math.cos(d) * this.f340215a) - (Math.sin(d) * this.f340216b))), (double) ((float) ((Math.sin(d) * this.f340215a) + (Math.cos(d) * this.f340216b))));
    }

    /* renamed from: a */
    private C113732fo m156833a(C113732fo foVar, float f) {
        C113732fo b = m156837b(foVar);
        double d = (double) f;
        C113732fo foVar2 = new C113732fo((double) ((float) ((Math.cos(d) * b.f340215a) - (Math.sin(d) * b.f340216b))), (double) ((float) ((Math.sin(d) * b.f340215a) + (Math.cos(d) * b.f340216b))));
        return new C113732fo(foVar2.f340215a + foVar.f340215a, foVar2.f340216b + foVar.f340216b);
    }
}
