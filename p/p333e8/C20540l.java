package p333e8;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: e8.l */
public final class C20540l {

    /* renamed from: a */
    public byte[] f57805a;

    /* renamed from: b */
    public int f57806b;

    /* renamed from: c */
    public int f57807c;

    /* renamed from: d */
    public int f57808d;

    public C20540l() {
    }

    public C20540l(byte[] bArr, int i) {
        this.f57805a = bArr;
        this.f57808d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f57808d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32084a() {
        /*
            r2 = this;
            int r0 = r2.f57806b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f57808d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f57807c
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
        throw new UnsupportedOperationException("Method not decompiled: p333e8.C20540l.mo32084a():void");
    }

    /* renamed from: b */
    public int mo32085b() {
        return ((this.f57808d - this.f57806b) * 8) - this.f57807c;
    }

    /* renamed from: c */
    public boolean mo32086c() {
        byte[] bArr = this.f57805a;
        int i = this.f57806b;
        byte b = bArr[i];
        int i2 = this.f57807c;
        boolean z = (b & (128 >> i2)) != 0;
        int i3 = i2 + 1;
        this.f57807c = i3;
        if (i3 == 8) {
            this.f57807c = 0;
            this.f57806b = i + 1;
        }
        mo32084a();
        return z;
    }

    /* renamed from: d */
    public int mo32087d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f57807c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f57807c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f57807c = i4;
            byte[] bArr = this.f57805a;
            int i5 = this.f57806b;
            this.f57806b = i5 + 1;
            i3 |= (bArr[i5] & ExifInterface.MARKER) << i4;
        }
        byte[] bArr2 = this.f57805a;
        int i6 = this.f57806b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & ExifInterface.MARKER) >> (8 - i2)));
        if (i2 == 8) {
            this.f57807c = 0;
            this.f57806b = i6 + 1;
        }
        mo32084a();
        return i7;
    }

    /* renamed from: e */
    public void mo32088e(int i) {
        int i2 = i / 8;
        this.f57806b = i2;
        this.f57807c = i - (i2 * 8);
        mo32084a();
    }

    /* renamed from: f */
    public void mo32089f(int i) {
        int i2 = i / 8;
        int i3 = this.f57806b + i2;
        this.f57806b = i3;
        int i4 = this.f57807c + (i - (i2 * 8));
        this.f57807c = i4;
        if (i4 > 7) {
            this.f57806b = i3 + 1;
            this.f57807c = i4 - 8;
        }
        mo32084a();
    }
}
