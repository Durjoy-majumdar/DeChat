package wp0;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: wp0.a */
public final class C91053a {

    /* renamed from: d */
    public static final C91054a f261213d = new C91054a((C8480h) null);

    /* renamed from: a */
    public final byte[] f261214a;

    /* renamed from: b */
    public final int f261215b;

    /* renamed from: c */
    public final int f261216c;

    /* renamed from: wp0.a$a */
    public static final class C91054a {
        public C91054a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C91053a mo125115a(byte[] bArr, int i, int i2) {
            C87412m.m108594g(bArr, "data");
            int length = bArr.length;
            boolean z = true;
            if (i >= 0 && i < length) {
                int i3 = i + i2;
                if (i3 < 0 || i3 > length) {
                    z = false;
                }
                if (z) {
                    return new C91053a(bArr, i, i2, (C8480h) null);
                }
                throw new IllegalArgumentException("endPos is illegal, since endPos is " + i3 + ", dataSize is " + length);
            }
            throw new IllegalArgumentException("startPos is illegal, since startPos is " + i + ", dataSize is " + length);
        }
    }

    public C91053a(byte[] bArr, int i, int i2, C8480h hVar) {
        this.f261214a = bArr;
        this.f261215b = i;
        this.f261216c = i2;
    }

    /* renamed from: a */
    public final byte mo125113a(int i) {
        if (i < this.f261216c) {
            return this.f261214a[this.f261215b + i];
        }
        throw new ArrayIndexOutOfBoundsException("index: " + i + ", size: " + this.f261216c);
    }

    public String toString() {
        int i = this.f261216c - 1;
        if (-1 == i) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int i2 = 0;
        if (i >= 0) {
            while (true) {
                sb.append(Byte.valueOf(mo125113a(i2)));
                if (i != i2) {
                    sb.append(", ");
                } else {
                    sb.append(']');
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
