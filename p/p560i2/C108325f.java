package p560i2;

import gy3.C87412m;

/* renamed from: i2.f */
public final class C108325f implements Comparable<C108325f> {

    /* renamed from: d */
    public final float f324346d;

    public /* synthetic */ C108325f(float f) {
        this.f324346d = f;
    }

    /* renamed from: a */
    public static final boolean m146734a(float f, float f2) {
        return C87412m.m108589b(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: b */
    public static String m146735b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public int compareTo(Object obj) {
        return Float.compare(this.f324346d, ((C108325f) obj).f324346d);
    }

    public boolean equals(Object obj) {
        float f = this.f324346d;
        if (!(obj instanceof C108325f)) {
            return false;
        }
        return C87412m.m108589b(Float.valueOf(f), Float.valueOf(((C108325f) obj).f324346d));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f324346d);
    }

    public String toString() {
        return m146735b(this.f324346d);
    }
}
