package su3;

import java.io.EOFException;

/* renamed from: su3.g */
public final class C26229g extends C26223a {

    /* renamed from: c */
    public final short[] f73131c;

    public C26229g(short[] sArr) {
        if (sArr != null) {
            this.f73131c = sArr;
            return;
        }
        throw new NullPointerException("array == null");
    }

    /* renamed from: b */
    public int mo53111b() {
        try {
            short[] sArr = this.f73131c;
            int i = this.f73123b;
            short s = sArr[i];
            this.f73123b = i + 1;
            return s & 65535;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public int mo53112c() {
        return mo53111b() | (mo53111b() << 16);
    }

    /* renamed from: d */
    public long mo53113d() {
        return ((long) mo53111b()) | (((long) mo53111b()) << 16) | (((long) mo53111b()) << 32) | (((long) mo53111b()) << 48);
    }
}
