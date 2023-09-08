package p544h2;

/* renamed from: h2.i */
public final class C32661i {

    /* renamed from: c */
    public static final C32661i f86672c = new C32661i(1.0f, 0.0f);

    /* renamed from: a */
    public final float f86673a;

    /* renamed from: b */
    public final float f86674b;

    public C32661i(float f, float f2) {
        this.f86673a = f;
        this.f86674b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32661i)) {
            return false;
        }
        C32661i iVar = (C32661i) obj;
        if (!(this.f86673a == iVar.f86673a)) {
            return false;
        }
        return (this.f86674b > iVar.f86674b ? 1 : (this.f86674b == iVar.f86674b ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f86673a) * 31) + Float.floatToIntBits(this.f86674b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f86673a + ", skewX=" + this.f86674b + ')';
    }

    public C32661i() {
        this(1.0f, 0.0f);
    }
}
