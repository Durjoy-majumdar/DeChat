package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.ga */
public final class C113746ga {

    /* renamed from: a */
    public C113747gc f340319a;

    /* renamed from: b */
    public C113747gc f340320b;

    /* renamed from: c */
    public C113747gc f340321c;

    /* renamed from: d */
    private C113748gd f340322d;

    public C113746ga() {
        this.f340322d = new C113748gd();
    }

    /* renamed from: a */
    private void m156915a(C113747gc gcVar, C113747gc gcVar2, C113747gc gcVar3) {
        this.f340319a = gcVar;
        this.f340320b = gcVar2;
        this.f340321c = gcVar3;
        this.f340322d.mo172123a(gcVar);
        this.f340322d.mo172123a(gcVar2);
        this.f340322d.mo172123a(gcVar3);
    }

    /* renamed from: b */
    private float[] m156917b() {
        return this.f340322d.mo172124a();
    }

    public C113746ga(C113747gc gcVar, C113747gc gcVar2, C113747gc gcVar3) {
        this();
        m156915a(gcVar, gcVar2, gcVar3);
    }

    public C113746ga(float[] fArr) {
        this();
        m156915a(new C113747gc(fArr[0], fArr[1], fArr[2]), new C113747gc(fArr[3], fArr[4], fArr[5]), new C113747gc(fArr[6], fArr[7], fArr[8]));
    }

    /* renamed from: a */
    private boolean m156916a(float[] fArr) {
        C113747gc gcVar = new C113747gc(fArr[0], fArr[1], fArr[2]);
        return ((double) Math.abs(mo172120a() - ((new C113746ga(gcVar, this.f340319a, this.f340320b).mo172120a() + new C113746ga(gcVar, this.f340319a, this.f340321c).mo172120a()) + new C113746ga(gcVar, this.f340320b, this.f340321c).mo172120a()))) < 0.001d;
    }

    /* renamed from: a */
    public final float mo172120a() {
        float[] a = this.f340322d.mo172124a();
        float a2 = m156914a(a[0], a[1], a[2], a[3], a[4], a[5]);
        float a3 = m156914a(a[3], a[4], a[5], a[6], a[7], a[8]);
        float a4 = m156914a(a[0], a[1], a[2], a[6], a[7], a[8]);
        float f = ((a2 + a3) + a4) / 2.0f;
        return (float) Math.sqrt((double) ((f - a2) * f * (f - a3) * (f - a4)));
    }

    /* renamed from: a */
    private static float m156914a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f - f4;
        float f8 = f2 - f5;
        float f9 = f3 - f6;
        return (float) Math.sqrt((double) ((f7 * f7) + (f8 * f8) + (f9 * f9)));
    }
}
