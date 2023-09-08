package my3;

import gy3.C87412m;
import java.util.NoSuchElementException;
import ky3.C88334c;
import ky3.C88336d;

/* renamed from: my3.o */
public class C61595o extends C34692n {
    /* renamed from: c */
    public static final double m72295c(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* renamed from: d */
    public static final float m72296d(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* renamed from: e */
    public static final int m72297e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: f */
    public static final long m72298f(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* renamed from: g */
    public static final int m72299g(C61594j jVar, C88334c cVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(cVar, "random");
        try {
            return C88336d.m110138c(cVar, jVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: h */
    public static final C61593h m72300h(C61593h hVar, int i) {
        C87412m.m108594g(hVar, "<this>");
        C34692n.m40449a(i > 0, Integer.valueOf(i));
        int i2 = hVar.f175174d;
        int i3 = hVar.f175175e;
        if (hVar.f175176f <= 0) {
            i = -i;
        }
        return new C61593h(i2, i3, i);
    }

    /* renamed from: i */
    public static final C61594j m72301i(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C61594j(i, i2 - 1);
        }
        C61594j jVar = C61594j.f175177g;
        return C61594j.f175177g;
    }
}
