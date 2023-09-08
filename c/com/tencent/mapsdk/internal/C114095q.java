package com.tencent.mapsdk.internal;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.q */
public final class C114095q {

    /* renamed from: a */
    private static final int f341451a = 37;

    /* renamed from: b */
    private static final int f341452b = 17;

    /* renamed from: c */
    private static final byte[] f341453c;

    /* renamed from: d */
    private static final byte[] f341454d;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
        f341453c = bArr2;
        f341454d = bArr3;
    }

    /* renamed from: a */
    private static int m158956a(byte b) {
        return b + 629;
    }

    /* renamed from: a */
    private static int m158957a(char c) {
        return c + 629;
    }

    /* renamed from: a */
    private static int m158960a(int i) {
        return i + 629;
    }

    /* renamed from: a */
    private static int m158961a(long j) {
        return ((int) (j ^ (j >> 32))) + 629;
    }

    /* renamed from: a */
    private static int m158965a(short s) {
        return s + 629;
    }

    /* renamed from: a */
    private static int m158966a(boolean z) {
        return (z ^ true ? 1 : 0) + true;
    }

    /* renamed from: a */
    public static boolean m158985a(byte b, byte b2) {
        return b == b2;
    }

    /* renamed from: a */
    private static boolean m158986a(char c, char c2) {
        return c == c2;
    }

    /* renamed from: a */
    private static boolean m158987a(double d, double d2) {
        return d == d2;
    }

    /* renamed from: a */
    private static boolean m158988a(float f, float f2) {
        return f == f2;
    }

    /* renamed from: a */
    public static boolean m158989a(int i, int i2) {
        return i == i2;
    }

    /* renamed from: a */
    public static boolean m158990a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: a */
    public static boolean m158991a(Object obj, Object obj2) {
        if (obj == null) {
            return obj == obj2;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m158992a(short s, short s2) {
        return s == s2;
    }

    /* renamed from: a */
    private static boolean m158993a(boolean z, boolean z2) {
        return z == z2;
    }

    /* renamed from: b */
    private static int m158995b(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b > b2 ? 1 : 0;
    }

    /* renamed from: b */
    private static int m158996b(char c, char c2) {
        if (c < c2) {
            return -1;
        }
        return c > c2 ? 1 : 0;
    }

    /* renamed from: b */
    private static int m158997b(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d > d2 ? 1 : 0;
    }

    /* renamed from: b */
    private static int m158998b(float f, float f2) {
        if (f < f2) {
            return -1;
        }
        return f > f2 ? 1 : 0;
    }

    /* renamed from: b */
    private static int m158999b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    private static int m159000b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: b */
    private static int m159001b(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s > s2 ? 1 : 0;
    }

    /* renamed from: b */
    private static int m159002b(boolean z, boolean z2) {
        return (z ? 1 : 0) - (z2 ? 1 : 0);
    }

    /* renamed from: b */
    private static String m159004b(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        if (remaining == 0) {
            return "empty";
        }
        StringBuffer stringBuffer = new StringBuffer((wrap.remaining() * 3) - 1);
        int position = wrap.position();
        byte b = wrap.get() & ExifInterface.MARKER;
        stringBuffer.append((char) f341453c[b]);
        stringBuffer.append((char) f341454d[b]);
        while (true) {
            remaining--;
            if (remaining > 0) {
                stringBuffer.append(' ');
                byte b2 = wrap.get() & ExifInterface.MARKER;
                stringBuffer.append((char) f341453c[b2]);
                stringBuffer.append((char) f341454d[b2]);
            } else {
                wrap.position(position);
                return stringBuffer.toString();
            }
        }
    }

    /* renamed from: a */
    private static <T extends Comparable<T>> int m158962a(T t, T t2) {
        return t.compareTo(t2);
    }

    /* renamed from: a */
    private static <T extends Comparable<T>> int m158964a(List<T> list, List<T> list2) {
        Iterator<T> it = list.iterator();
        Iterator<T> it4 = list2.iterator();
        while (it.hasNext() && it4.hasNext()) {
            int compareTo = ((Comparable) it.next()).compareTo(it4.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return m159002b(it.hasNext(), it4.hasNext());
    }

    /* renamed from: a */
    private static <T extends Comparable<T>> int m158980a(T[] tArr, T[] tArr2) {
        int i = 0;
        int i2 = 0;
        while (i < tArr.length && i2 < tArr2.length) {
            int compareTo = tArr[i].compareTo(tArr2[i2]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
            i2++;
        }
        return m158999b(tArr.length, tArr2.length);
    }

    /* renamed from: a */
    private static int m158984a(boolean[] zArr, boolean[] zArr2) {
        int i = 0;
        int i2 = 0;
        while (i < zArr.length && i2 < zArr2.length) {
            int b = m159002b(zArr[i], zArr2[i2]);
            if (b != 0) {
                return b;
            }
            i++;
            i2++;
        }
        return m158999b(zArr.length, zArr2.length);
    }

    /* renamed from: a */
    private static int m158968a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length && i2 < bArr2.length) {
            byte b = bArr[i];
            byte b2 = bArr2[i2];
            int i3 = b < b2 ? -1 : b > b2 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
            i2++;
        }
        return m158999b(bArr.length, bArr2.length);
    }

    /* renamed from: b */
    private static String m159003b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return "empty";
        }
        StringBuffer stringBuffer = new StringBuffer((byteBuffer.remaining() * 3) - 1);
        int position = byteBuffer.position();
        byte b = byteBuffer.get() & ExifInterface.MARKER;
        stringBuffer.append((char) f341453c[b]);
        stringBuffer.append((char) f341454d[b]);
        while (true) {
            remaining--;
            if (remaining > 0) {
                stringBuffer.append(' ');
                byte b2 = byteBuffer.get() & ExifInterface.MARKER;
                stringBuffer.append((char) f341453c[b2]);
                stringBuffer.append((char) f341454d[b2]);
            } else {
                byteBuffer.position(position);
                return stringBuffer.toString();
            }
        }
    }

    /* renamed from: a */
    private static int m158970a(char[] cArr, char[] cArr2) {
        int i = 0;
        int i2 = 0;
        while (i < cArr.length && i2 < cArr2.length) {
            char c = cArr[i];
            char c2 = cArr2[i2];
            int i3 = c < c2 ? -1 : c > c2 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
            i2++;
        }
        return m158999b(cArr.length, cArr2.length);
    }

    /* renamed from: a */
    private static int m158982a(short[] sArr, short[] sArr2) {
        int i = 0;
        int i2 = 0;
        while (i < sArr.length && i2 < sArr2.length) {
            short s = sArr[i];
            short s2 = sArr2[i2];
            int i3 = s < s2 ? -1 : s > s2 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
            i2++;
        }
        return m158999b(sArr.length, sArr2.length);
    }

    /* renamed from: a */
    private static int m158976a(int[] iArr, int[] iArr2) {
        int i = 0;
        int i2 = 0;
        while (i < iArr.length && i2 < iArr2.length) {
            int b = m158999b(iArr[i], iArr2[i2]);
            if (b != 0) {
                return b;
            }
            i++;
            i2++;
        }
        return m158999b(iArr.length, iArr2.length);
    }

    /* renamed from: a */
    private static int m158978a(long[] jArr, long[] jArr2) {
        int i = 0;
        int i2 = 0;
        while (i < jArr.length && i2 < jArr2.length) {
            int i3 = (jArr[i] > jArr2[i2] ? 1 : (jArr[i] == jArr2[i2] ? 0 : -1));
            int i4 = i3 < 0 ? -1 : i3 > 0 ? 1 : 0;
            if (i4 != 0) {
                return i4;
            }
            i++;
            i2++;
        }
        return m158999b(jArr.length, jArr2.length);
    }

    /* renamed from: a */
    private static int m158974a(float[] fArr, float[] fArr2) {
        int i = 0;
        int i2 = 0;
        while (i < fArr.length && i2 < fArr2.length) {
            float f = fArr[i];
            float f2 = fArr2[i2];
            int i3 = f < f2 ? -1 : f > f2 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
            i2++;
        }
        return m158999b(fArr.length, fArr2.length);
    }

    /* renamed from: a */
    private static int m158972a(double[] dArr, double[] dArr2) {
        int i = 0;
        int i2 = 0;
        while (i < dArr.length && i2 < dArr2.length) {
            double d = dArr[i];
            double d2 = dArr2[i2];
            int i3 = d < d2 ? -1 : d > d2 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
            i2++;
        }
        return m158999b(dArr.length, dArr2.length);
    }

    /* renamed from: a */
    private static int m158983a(boolean[] zArr) {
        if (zArr == null) {
            return 629;
        }
        int i = 17;
        for (boolean z : zArr) {
            i = (i * 37) + (z ^ true ? 1 : 0);
        }
        return i;
    }

    /* renamed from: a */
    private static int m158967a(byte[] bArr) {
        if (bArr == null) {
            return 629;
        }
        int i = 17;
        for (byte b : bArr) {
            i = (i * 37) + b;
        }
        return i;
    }

    /* renamed from: a */
    private static int m158969a(char[] cArr) {
        if (cArr == null) {
            return 629;
        }
        int i = 17;
        for (char c : cArr) {
            i = (i * 37) + c;
        }
        return i;
    }

    /* renamed from: a */
    private static int m158958a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return ((int) (doubleToLongBits ^ (doubleToLongBits >> 32))) + 629;
    }

    /* renamed from: a */
    private static int m158971a(double[] dArr) {
        if (dArr == null) {
            return 629;
        }
        int i = 17;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            i = (i * 37) + ((int) (Double.doubleToLongBits(dArr[i2]) ^ (Double.doubleToLongBits(dArr[i2]) >> 32)));
        }
        return i;
    }

    /* renamed from: a */
    private static int m158959a(float f) {
        return Float.floatToIntBits(f) + 629;
    }

    /* renamed from: a */
    private static int m158973a(float[] fArr) {
        if (fArr == null) {
            return 629;
        }
        int i = 17;
        for (float floatToIntBits : fArr) {
            i = (i * 37) + Float.floatToIntBits(floatToIntBits);
        }
        return i;
    }

    /* renamed from: a */
    private static int m158981a(short[] sArr) {
        if (sArr == null) {
            return 629;
        }
        int i = 17;
        for (short s : sArr) {
            i = (i * 37) + s;
        }
        return i;
    }

    /* renamed from: a */
    private static int m158975a(int[] iArr) {
        if (iArr == null) {
            return 629;
        }
        int i = 17;
        for (int i2 : iArr) {
            i = (i * 37) + i2;
        }
        return i;
    }

    /* renamed from: a */
    private static int m158977a(long[] jArr) {
        if (jArr == null) {
            return 629;
        }
        int i = 17;
        for (long j : jArr) {
            i = (i * 37) + ((int) (j ^ (j >> 32)));
        }
        return i;
    }

    /* renamed from: a */
    private static int m158979a(C114029p[] pVarArr) {
        if (pVarArr == null) {
            return 629;
        }
        int i = 17;
        for (C114029p hashCode : pVarArr) {
            i = (i * 37) + hashCode.hashCode();
        }
        return i;
    }

    /* renamed from: a */
    private static int m158963a(Object obj) {
        while (obj != null) {
            if (!obj.getClass().isArray()) {
                return obj.hashCode() + 629;
            }
            if (obj instanceof C114029p[]) {
                C114029p[] pVarArr = (C114029p[]) obj;
                int i = 17;
                for (C114029p hashCode : pVarArr) {
                    i = (i * 37) + hashCode.hashCode();
                }
                return i;
            }
            obj = (Object[]) obj;
        }
        return 629;
    }

    /* renamed from: a */
    public static byte[] m158994a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }
}
