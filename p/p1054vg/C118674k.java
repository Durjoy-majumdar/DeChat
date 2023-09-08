package p1054vg;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: vg.k */
public final class C118674k implements Cloneable {

    /* renamed from: d */
    public int f355107d;

    public C118674k(byte[] bArr) {
        this.f355107d = ((bArr[1] << 8) & 65280) + (bArr[0] & ExifInterface.MARKER);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C118674k) && this.f355107d == ((C118674k) obj).f355107d;
    }

    public int hashCode() {
        return this.f355107d;
    }

    public C118674k(int i) {
        this.f355107d = i;
    }
}
