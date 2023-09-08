package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.gb */
public final class C92454gb {

    /* renamed from: a */
    private float f264614a;

    /* renamed from: b */
    private float f264615b;

    /* renamed from: c */
    private float f264616c;

    public C92454gb(float f, float f2, float f3) {
        this.f264614a = f;
        this.f264615b = f2;
        this.f264616c = f3;
        double e = m116297e();
        if (e != 0.0d) {
            this.f264614a = (float) (((double) this.f264614a) / e);
            this.f264615b = (float) (((double) this.f264615b) / e);
            this.f264616c = (float) (((double) this.f264616c) / e);
        }
    }

    /* renamed from: b */
    private static C92454gb m116293b(C92454gb gbVar) {
        return new C92454gb(-gbVar.f264614a, -gbVar.f264615b, -gbVar.f264616c);
    }

    /* renamed from: c */
    private float m116295c() {
        return this.f264615b;
    }

    /* renamed from: d */
    private float m116296d() {
        return this.f264616c;
    }

    /* renamed from: e */
    private double m116297e() {
        float f = this.f264614a;
        float f2 = this.f264615b;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f264616c;
        return Math.sqrt((double) (f3 + (f4 * f4)));
    }

    /* renamed from: f */
    private void m116298f() {
        double e = m116297e();
        if (e != 0.0d) {
            this.f264614a = (float) (((double) this.f264614a) / e);
            this.f264615b = (float) (((double) this.f264615b) / e);
            this.f264616c = (float) (((double) this.f264616c) / e);
        }
    }

    /* renamed from: a */
    public final float[] mo126459a() {
        return new float[]{this.f264614a, this.f264615b, this.f264616c};
    }

    public final String toString() {
        return this.f264614a + "," + this.f264615b + "," + this.f264616c;
    }

    /* renamed from: a */
    private static C92454gb m116291a(C92454gb gbVar, C92454gb gbVar2) {
        return new C92454gb(gbVar.f264614a + gbVar2.f264614a, gbVar.f264615b + gbVar2.f264615b, gbVar.f264616c + gbVar2.f264616c);
    }

    /* renamed from: b */
    private float m116292b() {
        return this.f264614a;
    }

    /* renamed from: c */
    private double m116294c(C92454gb gbVar) {
        return (Math.acos(((double) (((this.f264614a * gbVar.f264614a) + (this.f264615b * gbVar.f264615b)) + (this.f264616c * gbVar.f264616c))) / (m116297e() * gbVar.m116297e())) * 180.0d) / 3.141592653589793d;
    }

    /* renamed from: a */
    private static C92454gb m116290a(C92454gb gbVar) {
        float f = gbVar.f264614a;
        float f2 = gbVar.f264615b;
        float e = (float) (((double) f) / gbVar.m116297e());
        float e2 = (float) (((double) (-f2)) / gbVar.m116297e());
        C92454gb gbVar2 = new C92454gb(e, e2, 0.0f);
        return (Math.acos(((double) (((gbVar2.f264614a * gbVar.f264614a) + (gbVar2.f264615b * gbVar.f264615b)) + (gbVar2.f264616c * gbVar.f264616c))) / (gbVar2.m116297e() * gbVar.m116297e())) * 180.0d) / 3.141592653589793d != 90.0d ? new C92454gb(-e, -e2, 0.0f) : gbVar2;
    }
}
