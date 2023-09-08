package p415q0;

import gy3.C87412m;

/* renamed from: q0.d */
public final class C110262d {

    /* renamed from: a */
    public final int f329810a;

    /* renamed from: b */
    public final long[] f329811b;

    /* renamed from: c */
    public final Object[] f329812c;

    public C110262d(int i, long[] jArr, Object[] objArr) {
        C87412m.m108594g(jArr, "keys");
        C87412m.m108594g(objArr, "values");
        this.f329810a = i;
        this.f329811b = jArr;
        this.f329812c = objArr;
    }

    /* renamed from: a */
    public final int mo161673a(long j) {
        int i = this.f329810a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.f329811b[i3] - j) > 0 ? 1 : ((this.f329811b[i3] - j) == 0 ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 <= 0) {
                    return i3;
                } else {
                    i = i3 - 1;
                }
            }
            return -(i2 + 1);
        }
        long j2 = this.f329811b[0];
        if (j2 == j) {
            return 0;
        }
        return j2 > j ? -2 : -1;
    }

    /* renamed from: b */
    public final C110262d mo161674b(long j, Object obj) {
        int i = this.f329810a;
        Object[] objArr = this.f329812c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] == null) {
                z = false;
            }
            if (z) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.f329811b[i6];
                Object obj2 = this.f329812c[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f329811b[i6];
                    Object obj3 = this.f329812c[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new C110262d(i5, jArr, objArr2);
    }
}
