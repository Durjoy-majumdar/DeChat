package p341g7;

import androidx.exifinterface.media.ExifInterface;
import p333e8.C20528a;

/* renamed from: g7.i */
public final class C20804i {

    /* renamed from: a */
    public final byte[] f58791a;

    /* renamed from: b */
    public final int f58792b;

    /* renamed from: c */
    public int f58793c;

    /* renamed from: d */
    public int f58794d;

    public C20804i(byte[] bArr) {
        this.f58791a = bArr;
        this.f58792b = bArr.length;
    }

    /* renamed from: a */
    public boolean mo32502a() {
        boolean z = (((this.f58791a[this.f58793c] & ExifInterface.MARKER) >> this.f58794d) & 1) == 1;
        mo32504c(1);
        return z;
    }

    /* renamed from: b */
    public int mo32503b(int i) {
        int i2 = this.f58793c;
        int min = Math.min(i, 8 - this.f58794d);
        int i3 = i2 + 1;
        int i4 = ((this.f58791a[i2] & ExifInterface.MARKER) >> this.f58794d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f58791a[i3] & ExifInterface.MARKER) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo32504c(i);
        return i5;
    }

    /* renamed from: c */
    public void mo32504c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f58793c + i3;
        this.f58793c = i4;
        int i5 = this.f58794d + (i - (i3 * 8));
        this.f58794d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f58793c = i4 + 1;
            this.f58794d = i5 - 8;
        }
        int i6 = this.f58793c;
        if (i6 < 0 || (i6 >= (i2 = this.f58792b) && !(i6 == i2 && this.f58794d == 0))) {
            z = false;
        }
        C20528a.m22240d(z);
    }
}
