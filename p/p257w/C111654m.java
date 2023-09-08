package p257w;

/* renamed from: w.m */
public final class C111654m extends C37919o {

    /* renamed from: a */
    public float f334250a;

    /* renamed from: b */
    public float f334251b;

    /* renamed from: c */
    public final int f334252c = 2;

    public C111654m(float f, float f2) {
        this.f334250a = f;
        this.f334251b = f2;
    }

    /* renamed from: a */
    public float mo61401a(int i) {
        if (i == 0) {
            return this.f334250a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f334251b;
    }

    /* renamed from: b */
    public int mo61402b() {
        return this.f334252c;
    }

    /* renamed from: c */
    public C37919o mo61403c() {
        return new C111654m(0.0f, 0.0f);
    }

    /* renamed from: d */
    public void mo61404d() {
        this.f334250a = 0.0f;
        this.f334251b = 0.0f;
    }

    /* renamed from: e */
    public void mo61405e(int i, float f) {
        if (i == 0) {
            this.f334250a = f;
        } else if (i == 1) {
            this.f334251b = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C111654m) {
            C111654m mVar = (C111654m) obj;
            if (mVar.f334250a == this.f334250a) {
                if (mVar.f334251b == this.f334251b) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f334250a) * 31) + Float.floatToIntBits(this.f334251b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f334250a + ", v2 = " + this.f334251b;
    }
}
