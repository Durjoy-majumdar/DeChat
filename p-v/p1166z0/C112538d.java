package p1166z0;

/* renamed from: z0.d */
public final class C112538d {

    /* renamed from: a */
    public float f336951a;

    /* renamed from: b */
    public float f336952b;

    /* renamed from: c */
    public float f336953c;

    /* renamed from: d */
    public float f336954d;

    public C112538d(float f, float f2, float f3, float f4) {
        this.f336951a = f;
        this.f336952b = f2;
        this.f336953c = f3;
        this.f336954d = f4;
    }

    /* renamed from: a */
    public final void mo164254a(float f, float f2, float f3, float f4) {
        this.f336951a = Math.max(f, this.f336951a);
        this.f336952b = Math.max(f2, this.f336952b);
        this.f336953c = Math.min(f3, this.f336953c);
        this.f336954d = Math.min(f4, this.f336954d);
    }

    /* renamed from: b */
    public final boolean mo164255b() {
        return this.f336951a >= this.f336953c || this.f336952b >= this.f336954d;
    }

    public String toString() {
        return "MutableRect(" + C112537c.m153733a(this.f336951a, 1) + ", " + C112537c.m153733a(this.f336952b, 1) + ", " + C112537c.m153733a(this.f336953c, 1) + ", " + C112537c.m153733a(this.f336954d, 1) + ')';
    }
}
