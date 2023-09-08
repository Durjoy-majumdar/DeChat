package p257w;

/* renamed from: w.l */
public final class C37907l extends C37919o {

    /* renamed from: a */
    public float f100321a;

    /* renamed from: b */
    public final int f100322b = 1;

    public C37907l(float f) {
        this.f100321a = f;
    }

    /* renamed from: a */
    public float mo61401a(int i) {
        if (i == 0) {
            return this.f100321a;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public int mo61402b() {
        return this.f100322b;
    }

    /* renamed from: c */
    public C37919o mo61403c() {
        return new C37907l(0.0f);
    }

    /* renamed from: d */
    public void mo61404d() {
        this.f100321a = 0.0f;
    }

    /* renamed from: e */
    public void mo61405e(int i, float f) {
        if (i == 0) {
            this.f100321a = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C37907l) {
            if (((C37907l) obj).f100321a == this.f100321a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f100321a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f100321a;
    }
}
