package ky3;

import gy3.C8480h;
import gy3.C87412m;
import java.io.Serializable;
import my3.C61594j;
import zx3.C91945b;

/* renamed from: ky3.c */
public abstract class C88334c {

    /* renamed from: d */
    public static final C88335a f255322d = new C88335a((C8480h) null);

    /* renamed from: e */
    public static final C88334c f255323e = C91945b.f263216a.mo110032b();

    /* renamed from: ky3.c$a */
    public static final class C88335a extends C88334c implements Serializable {
        public C88335a(C8480h hVar) {
        }

        /* renamed from: a */
        public int mo122713a(int i) {
            return C88334c.f255323e.mo122713a(i);
        }

        /* renamed from: b */
        public byte[] mo122714b(byte[] bArr) {
            C87412m.m108594g(bArr, "array");
            return C88334c.f255323e.mo122714b(bArr);
        }

        /* renamed from: c */
        public byte[] mo122722c(byte[] bArr, int i, int i2) {
            C87412m.m108594g(bArr, "array");
            return C88334c.f255323e.mo122722c(bArr, i, i2);
        }

        /* renamed from: d */
        public double mo122715d() {
            return C88334c.f255323e.mo122715d();
        }

        /* renamed from: e */
        public float mo122716e() {
            return C88334c.f255323e.mo122716e();
        }

        /* renamed from: f */
        public int mo122717f() {
            return C88334c.f255323e.mo122717f();
        }

        /* renamed from: g */
        public int mo122718g(int i) {
            return C88334c.f255323e.mo122718g(i);
        }

        /* renamed from: h */
        public int mo122723h(int i, int i2) {
            return C88334c.f255323e.mo122723h(i, i2);
        }

        /* renamed from: i */
        public long mo122719i() {
            return C88334c.f255323e.mo122719i();
        }
    }

    /* renamed from: a */
    public abstract int mo122713a(int i);

    /* renamed from: b */
    public byte[] mo122714b(byte[] bArr) {
        C87412m.m108594g(bArr, "array");
        return mo122722c(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public byte[] mo122722c(byte[] bArr, int i, int i2) {
        C87412m.m108594g(bArr, "array");
        boolean z = true;
        if (new C61594j(0, bArr.length).mo86532k(i) && new C61594j(0, bArr.length).mo86532k(i2)) {
            if (i > i2) {
                z = false;
            }
            if (z) {
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int f = mo122717f();
                    bArr[i] = (byte) f;
                    bArr[i + 1] = (byte) (f >>> 8);
                    bArr[i + 2] = (byte) (f >>> 16);
                    bArr[i + 3] = (byte) (f >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int a = mo122713a(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i + i6] = (byte) (a >>> (i6 * 8));
                }
                return bArr;
            }
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        throw new IllegalArgumentException(("fromIndex (" + i + ") or toIndex (" + i2 + ") are out of range: 0.." + bArr.length + '.').toString());
    }

    /* renamed from: d */
    public double mo122715d() {
        return ((double) ((((long) mo122713a(26)) << 27) + ((long) mo122713a(27)))) / 9.007199254740992E15d;
    }

    /* renamed from: e */
    public float mo122716e() {
        return ((float) mo122713a(24)) / 1.6777216E7f;
    }

    /* renamed from: f */
    public abstract int mo122717f();

    /* renamed from: g */
    public int mo122718g(int i) {
        return mo122723h(0, i);
    }

    /* renamed from: h */
    public int mo122723h(int i, int i2) {
        int i3;
        int f;
        int i4;
        int f2;
        boolean z;
        if (i2 > i) {
            int i5 = i2 - i;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i3 = mo122713a(31 - Integer.numberOfLeadingZeros(i5));
                } else {
                    do {
                        f = mo122717f() >>> 1;
                        i4 = f % i5;
                    } while ((f - i4) + (i5 - 1) < 0);
                    i3 = i4;
                }
                return i + i3;
            }
            do {
                f2 = mo122717f();
                if (i > f2 || f2 >= i2) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } while (!z);
            return f2;
        }
        throw new IllegalArgumentException(C88336d.m110137b(Integer.valueOf(i), Integer.valueOf(i2)).toString());
    }

    /* renamed from: i */
    public long mo122719i() {
        return (((long) mo122717f()) << 32) + ((long) mo122717f());
    }
}
