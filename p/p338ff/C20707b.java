package p338ff;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* renamed from: ff.b */
public final class C20707b {

    /* renamed from: a */
    public final byte[] f58556a;

    public C20707b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.f58556a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C20707b)) {
            return false;
        }
        return Arrays.equals(this.f58556a, ((C20707b) obj).f58556a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f58556a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        for (byte b : this.f58556a) {
            sb.append(Integer.toHexString(b & ExifInterface.MARKER));
        }
        return sb.toString();
    }
}
