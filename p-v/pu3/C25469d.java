package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.d */
public class C25469d extends C25499u.C25500a.C25501a<C25469d> {

    /* renamed from: e */
    public int f72086e;

    /* renamed from: f */
    public int[][] f72087f;

    /* renamed from: g */
    public int[][] f72088g;

    /* renamed from: h */
    public int[][] f72089h;

    public C25469d(int i, int i2, int[][] iArr, int[][] iArr2, int[][] iArr3) {
        super(i);
        this.f72086e = i2;
        this.f72087f = iArr;
        this.f72088g = iArr2;
        this.f72089h = iArr3;
    }

    /* renamed from: a */
    public int compareTo(C25469d dVar) {
        int i = this.f72086e;
        int i2 = dVar.f72086e;
        if (i != i2) {
            return C26118c.m33548f(i, i2);
        }
        int length = this.f72087f.length;
        int length2 = this.f72088g.length;
        int length3 = this.f72089h.length;
        int length4 = dVar.f72087f.length;
        int length5 = dVar.f72088g.length;
        int length6 = dVar.f72089h.length;
        if (length != length4) {
            return C26118c.m33545c(length, length4);
        }
        if (length2 != length5) {
            return C26118c.m33545c(length2, length5);
        }
        if (length3 != length6) {
            return C26118c.m33545c(length3, length6);
        }
        for (int i3 = 0; i3 < length; i3++) {
            int[] iArr = this.f72087f[i3];
            int i4 = iArr[0];
            int i5 = iArr[1];
            int[] iArr2 = dVar.f72087f[i3];
            int i6 = iArr2[0];
            int i7 = iArr2[1];
            if (i4 != i6) {
                return C26118c.m33548f(i4, i6);
            }
            if (i5 != i7) {
                return C26118c.m33545c(i5, i7);
            }
        }
        for (int i8 = 0; i8 < length2; i8++) {
            int[] iArr3 = this.f72088g[i8];
            int i9 = iArr3[0];
            int i15 = iArr3[1];
            int[] iArr4 = dVar.f72088g[i8];
            int i16 = iArr4[0];
            int i17 = iArr4[1];
            if (i9 != i16) {
                return C26118c.m33548f(i9, i16);
            }
            if (i15 != i17) {
                return C26118c.m33545c(i15, i17);
            }
        }
        for (int i18 = 0; i18 < length3; i18++) {
            int[] iArr5 = this.f72089h[i18];
            int i19 = iArr5[0];
            int i25 = iArr5[1];
            int[] iArr6 = dVar.f72089h[i18];
            int i26 = iArr6[0];
            int i27 = iArr6[1];
            if (i19 != i26) {
                return C26118c.m33548f(i19, i26);
            }
            if (i25 != i27) {
                return C26118c.m33545c(i25, i27);
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25469d) && compareTo((C25469d) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Integer.valueOf(this.f72086e), this.f72087f, this.f72088g, this.f72089h);
    }
}
