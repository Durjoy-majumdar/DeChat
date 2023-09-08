package p330d7;

import androidx.exifinterface.media.ExifInterface;
import p294b7.C16738b;
import p294b7.C16742f;

/* renamed from: d7.f */
public final class C20445f {

    /* renamed from: d */
    public static final long[] f57461d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f57462a = new byte[8];

    /* renamed from: b */
    public int f57463b;

    /* renamed from: c */
    public int f57464c;

    /* renamed from: a */
    public static long m22038a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f57461d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: b */
    public long mo31986b(C16742f fVar, boolean z, boolean z2, int i) {
        int i2;
        if (this.f57463b == 0) {
            if (!((C16738b) fVar).mo17737e(this.f57462a, 0, 1, z)) {
                return -1;
            }
            byte b = this.f57462a[0] & ExifInterface.MARKER;
            int i3 = 0;
            while (true) {
                long[] jArr = f57461d;
                if (i3 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((((long) b) & jArr[i3]) != 0) {
                    i2 = i3 + 1;
                    break;
                }
                i3++;
            }
            this.f57464c = i2;
            if (i2 != -1) {
                this.f57463b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i4 = this.f57464c;
        if (i4 > i) {
            this.f57463b = 0;
            return -2;
        }
        if (i4 != 1) {
            ((C16738b) fVar).mo17737e(this.f57462a, 1, i4 - 1, false);
        }
        this.f57463b = 0;
        return m22038a(this.f57462a, this.f57464c, z2);
    }
}
