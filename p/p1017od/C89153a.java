package p1017od;

import gy3.C87412m;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: od.a */
public final class C89153a {

    /* renamed from: a */
    public float f256873a = 0.0f;

    /* renamed from: b */
    public float f256874b = 0.0f;

    /* renamed from: c */
    public int f256875c = 0;

    /* renamed from: d */
    public int f256876d = 0;

    /* renamed from: e */
    public float f256877e = 0.0f;

    /* renamed from: f */
    public int f256878f = 0;

    /* renamed from: g */
    public int f256879g = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89153a)) {
            return false;
        }
        C89153a aVar = (C89153a) obj;
        return C87412m.m108589b(Float.valueOf(this.f256873a), Float.valueOf(aVar.f256873a)) && C87412m.m108589b(Float.valueOf(this.f256874b), Float.valueOf(aVar.f256874b)) && this.f256875c == aVar.f256875c && this.f256876d == aVar.f256876d && C87412m.m108589b(Float.valueOf(this.f256877e), Float.valueOf(aVar.f256877e)) && this.f256878f == aVar.f256878f && this.f256879g == aVar.f256879g;
    }

    public int hashCode() {
        return (((((((((((Float.floatToIntBits(this.f256873a) * 31) + Float.floatToIntBits(this.f256874b)) * 31) + this.f256875c) * 31) + this.f256876d) * 31) + Float.floatToIntBits(this.f256877e)) * 31) + this.f256878f) * 31) + this.f256879g;
    }

    public String toString() {
        String format = String.format(Locale.ENGLISH, "fps(%.2f, %.2f, %d, %d, %.2f%%)", Arrays.copyOf(new Object[]{Float.valueOf(this.f256873a), Float.valueOf(this.f256874b), Integer.valueOf(this.f256875c), Integer.valueOf(this.f256876d), Float.valueOf(this.f256877e * ((float) 100))}, 5));
        C87412m.m108593f(format, "format(locale, this, *args)");
        return format;
    }
}
