package p330d7;

import androidx.exifinterface.media.ExifInterface;
import p294b7.C16738b;
import p294b7.C16742f;
import p333e8.C20541m;

/* renamed from: d7.e */
public final class C20444e {

    /* renamed from: a */
    public final C20541m f57459a = new C20541m(8);

    /* renamed from: b */
    public int f57460b;

    /* renamed from: a */
    public final long mo31985a(C16742f fVar) {
        int i = 0;
        ((C16738b) fVar).mo17734b(this.f57459a.f57809a, 0, 1, false);
        byte b = this.f57459a.f57809a[0] & ExifInterface.MARKER;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        ((C16738b) fVar).mo17734b(this.f57459a.f57809a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f57459a.f57809a[i] & ExifInterface.MARKER) + (i4 << 8);
        }
        this.f57460b += i3 + 1;
        return (long) i4;
    }
}
