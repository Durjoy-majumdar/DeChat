package p241t0;

import sx3.C110821n;

/* renamed from: t0.j */
public final class C110857j {

    /* renamed from: a */
    public int f331620a;

    /* renamed from: b */
    public int[] f331621b = new int[16];

    /* renamed from: c */
    public int[] f331622c = new int[16];

    /* renamed from: d */
    public int[] f331623d;

    /* renamed from: e */
    public int f331624e;

    public C110857j() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f331623d = iArr;
    }

    /* renamed from: a */
    public final int mo162470a(int i) {
        int i2 = this.f331620a + 1;
        int[] iArr = this.f331621b;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            C110821n.m150965l(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            C110821n.m150965l(this.f331622c, iArr3, 0, 0, 0, 14, (Object) null);
            this.f331621b = iArr2;
            this.f331622c = iArr3;
        }
        int i4 = this.f331620a;
        this.f331620a = i4 + 1;
        int length2 = this.f331623d.length;
        if (this.f331624e >= length2) {
            int i5 = 0;
            int i6 = length2 * 2;
            int[] iArr4 = new int[i6];
            while (i5 < i6) {
                int i7 = i5 + 1;
                iArr4[i5] = i7;
                i5 = i7;
            }
            C110821n.m150965l(this.f331623d, iArr4, 0, 0, 0, 14, (Object) null);
            this.f331623d = iArr4;
        }
        int i8 = this.f331624e;
        int[] iArr5 = this.f331623d;
        this.f331624e = iArr5[i8];
        int[] iArr6 = this.f331621b;
        iArr6[i4] = i;
        this.f331622c[i4] = i8;
        iArr5[i8] = i4;
        int i9 = iArr6[i4];
        while (i4 > 0) {
            int i15 = ((i4 + 1) >> 1) - 1;
            if (iArr6[i15] <= i9) {
                break;
            }
            mo162471b(i15, i4);
            i4 = i15;
        }
        return i8;
    }

    /* renamed from: b */
    public final void mo162471b(int i, int i2) {
        int[] iArr = this.f331621b;
        int[] iArr2 = this.f331622c;
        int[] iArr3 = this.f331623d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
