package p436a1;

import gy3.C8480h;

/* renamed from: a1.z */
public final class C103278z implements Comparable<C103278z> {

    /* renamed from: d */
    public static final C103279a f304522d = new C103279a((C8480h) null);

    /* renamed from: e */
    public static final float f304523e = Float.intBitsToFloat(1056964608);

    /* renamed from: a1.z$a */
    public static final class C103279a {
        public C103279a(C8480h hVar) {
        }
    }

    static {
        m136798a(1.0f);
        m136798a(-1.0f);
    }

    /* renamed from: a */
    public static short m136798a(float f) {
        int i;
        int i2;
        f304522d.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i3 = floatToRawIntBits >>> 31;
        int i4 = (floatToRawIntBits >>> 23) & 255;
        int i5 = floatToRawIntBits & 8388607;
        int i6 = 0;
        if (i4 == 255) {
            if (i5 != 0) {
                i6 = 512;
            }
            i = i6;
            i6 = 31;
        } else {
            int i7 = (i4 - 127) + 15;
            if (i7 >= 31) {
                i = 0;
                i6 = 49;
            } else if (i7 > 0) {
                int i8 = i5 >> 13;
                if ((i5 & 4096) != 0) {
                    i = ((i7 << 10) | i8) + 1;
                    i2 = i3 << 15;
                    return (short) (i | i2);
                }
                i = i8;
                i6 = i7;
            } else if (i7 >= -10) {
                int i9 = (i5 | 8388608) >> (1 - i7);
                if ((i9 & 4096) != 0) {
                    i9 += 8192;
                }
                i = i9 >> 13;
            } else {
                i = 0;
            }
        }
        i2 = (i3 << 15) | (i6 << 10);
        return (short) (i | i2);
    }

    /* renamed from: b */
    public static final float m136799b(short s) {
        int i;
        short s2 = s & 65535;
        short s3 = 32768 & s2;
        int i2 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        int i3 = 0;
        if (i2 != 0) {
            int i4 = s4 << 13;
            if (i2 == 31) {
                if (i4 != 0) {
                    i4 |= 4194304;
                }
                i = i4;
                i3 = 255;
            } else {
                int i5 = i4;
                i3 = (i2 - 15) + 127;
                i = i5;
            }
        } else if (s4 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s4 + 1056964608) - f304523e;
            return s3 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (s3 << 16) | (i3 << 23));
    }
}
