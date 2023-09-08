package p333e8;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: e8.n */
public final class C20542n {

    /* renamed from: a */
    public byte[] f57812a;

    /* renamed from: b */
    public int f57813b;

    /* renamed from: c */
    public int f57814c;

    /* renamed from: d */
    public int f57815d = 0;

    public C20542n(byte[] bArr, int i, int i2) {
        this.f57812a = bArr;
        this.f57814c = i;
        this.f57813b = i2;
        mo32115a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f57813b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32115a() {
        /*
            r2 = this;
            int r0 = r2.f57814c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f57813b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f57815d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p333e8.C20528a.m22240d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p333e8.C20542n.mo32115a():void");
    }

    /* renamed from: b */
    public boolean mo32116b(int i) {
        int i2 = this.f57814c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f57815d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f57813b) {
                int i6 = this.f57813b;
            } else if (mo32122h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i64 = this.f57813b;
        if (i4 >= i64) {
            return i4 == i64 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo32117c() {
        int i = this.f57814c;
        int i2 = this.f57815d;
        int i3 = 0;
        while (this.f57814c < this.f57813b && !mo32118d()) {
            i3++;
        }
        boolean z = this.f57814c == this.f57813b;
        this.f57814c = i;
        this.f57815d = i2;
        return !z && mo32116b((i3 * 2) + 1);
    }

    /* renamed from: d */
    public boolean mo32118d() {
        boolean z = (this.f57812a[this.f57814c] & (128 >> this.f57815d)) != 0;
        mo32123i();
        return z;
    }

    /* renamed from: e */
    public int mo32119e(int i) {
        int i2;
        int i3;
        this.f57815d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f57815d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f57815d = i5;
            byte[] bArr = this.f57812a;
            int i6 = this.f57814c;
            i4 |= (bArr[i6] & ExifInterface.MARKER) << i5;
            if (!mo32122h(i6 + 1)) {
                i3 = 1;
            }
            this.f57814c = i6 + i3;
        }
        byte[] bArr2 = this.f57812a;
        int i7 = this.f57814c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & ExifInterface.MARKER) >> (8 - i2)));
        if (i2 == 8) {
            this.f57815d = 0;
            if (!mo32122h(i7 + 1)) {
                i3 = 1;
            }
            this.f57814c = i7 + i3;
        }
        mo32115a();
        return i8;
    }

    /* renamed from: f */
    public final int mo32120f() {
        int i = 0;
        int i2 = 0;
        while (!mo32118d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo32119e(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    public int mo32121g() {
        int f = mo32120f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: h */
    public final boolean mo32122h(int i) {
        if (2 <= i && i < this.f57813b) {
            byte[] bArr = this.f57812a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: i */
    public void mo32123i() {
        int i = 1;
        int i2 = this.f57815d + 1;
        this.f57815d = i2;
        if (i2 == 8) {
            this.f57815d = 0;
            int i3 = this.f57814c;
            if (mo32122h(i3 + 1)) {
                i = 2;
            }
            this.f57814c = i3 + i;
        }
        mo32115a();
    }

    /* renamed from: j */
    public void mo32124j(int i) {
        int i2 = this.f57814c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f57814c = i4;
        int i5 = this.f57815d + (i - (i3 * 8));
        this.f57815d = i5;
        if (i5 > 7) {
            this.f57814c = i4 + 1;
            this.f57815d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f57814c) {
                mo32115a();
                return;
            } else if (mo32122h(i2)) {
                this.f57814c++;
                i2 += 2;
            }
        }
    }
}
