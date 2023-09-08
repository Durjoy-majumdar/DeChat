package p257w;

/* renamed from: w.n */
public final class C111669n extends C37919o {

    /* renamed from: a */
    public float f334277a;

    /* renamed from: b */
    public float f334278b;

    /* renamed from: c */
    public float f334279c;

    /* renamed from: d */
    public float f334280d;

    /* renamed from: e */
    public final int f334281e = 4;

    public C111669n(float f, float f2, float f3, float f4) {
        this.f334277a = f;
        this.f334278b = f2;
        this.f334279c = f3;
        this.f334280d = f4;
    }

    /* renamed from: a */
    public float mo61401a(int i) {
        if (i == 0) {
            return this.f334277a;
        }
        if (i == 1) {
            return this.f334278b;
        }
        if (i == 2) {
            return this.f334279c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f334280d;
    }

    /* renamed from: b */
    public int mo61402b() {
        return this.f334281e;
    }

    /* renamed from: c */
    public C37919o mo61403c() {
        return new C111669n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: d */
    public void mo61404d() {
        this.f334277a = 0.0f;
        this.f334278b = 0.0f;
        this.f334279c = 0.0f;
        this.f334280d = 0.0f;
    }

    /* renamed from: e */
    public void mo61405e(int i, float f) {
        if (i == 0) {
            this.f334277a = f;
        } else if (i == 1) {
            this.f334278b = f;
        } else if (i == 2) {
            this.f334279c = f;
        } else if (i == 3) {
            this.f334280d = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C111669n) {
            C111669n nVar = (C111669n) obj;
            if (nVar.f334277a == this.f334277a) {
                if (nVar.f334278b == this.f334278b) {
                    if (nVar.f334279c == this.f334279c) {
                        if (nVar.f334280d == this.f334280d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f334277a) * 31) + Float.floatToIntBits(this.f334278b)) * 31) + Float.floatToIntBits(this.f334279c)) * 31) + Float.floatToIntBits(this.f334280d);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f334277a + ", v2 = " + this.f334278b + ", v3 = " + this.f334279c + ", v4 = " + this.f334280d;
    }
}
