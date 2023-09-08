package p342gf;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import p338ff.C20707b;
import p338ff.C20708c;

/* renamed from: gf.a */
public final class C20831a {
    /* renamed from: a */
    public static int m22845a(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public static long m22846b(InputStream inputStream) {
        byte[] bArr = new byte[8];
        m22848d(inputStream, bArr, 0, 8);
        return (((long) bArr[0]) << 56) + (((long) (bArr[1] & ExifInterface.MARKER)) << 48) + (((long) (bArr[2] & ExifInterface.MARKER)) << 40) + (((long) (bArr[3] & ExifInterface.MARKER)) << 32) + (((long) (bArr[4] & ExifInterface.MARKER)) << 24) + ((long) ((bArr[5] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2)) + ((long) ((bArr[6] & ExifInterface.MARKER) << 8)) + ((long) (bArr[7] & ExifInterface.MARKER));
    }

    /* renamed from: c */
    public static short m22847c(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return (short) (read2 | (read << 8));
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public static void m22848d(InputStream inputStream, byte[] bArr, int i, long j) {
        int i2 = 0;
        while (true) {
            long j2 = (long) i2;
            if (j2 < j) {
                int read = inputStream.read(bArr, i2, (int) (j - j2));
                if (read >= 0) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static C20707b m22849e(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        m22848d(inputStream, bArr, 0, (long) i);
        return new C20707b(bArr);
    }

    /* renamed from: f */
    public static Object m22850f(InputStream inputStream, C20708c cVar, int i) {
        switch (cVar.ordinal()) {
            case 0:
                return m22849e(inputStream, i);
            case 1:
                return Boolean.valueOf(inputStream.read() != 0);
            case 2:
                return Character.valueOf((char) m22847c(inputStream));
            case 3:
                return Float.valueOf(Float.intBitsToFloat(m22845a(inputStream)));
            case 4:
                return Double.valueOf(Double.longBitsToDouble(m22846b(inputStream)));
            case 5:
                return Byte.valueOf((byte) inputStream.read());
            case 6:
                return Short.valueOf(m22847c(inputStream));
            case 7:
                return Integer.valueOf(m22845a(inputStream));
            case 8:
                return Long.valueOf(m22846b(inputStream));
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static void m22851g(InputStream inputStream, long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = inputStream.skip(j - j2);
            if (skip >= 0) {
                j2 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: h */
    public static void m22852h(OutputStream outputStream, long j) {
        byte[] bArr = new byte[4096];
        for (int i = 0; ((long) i) < (j >> 12); i++) {
            outputStream.write(bArr);
        }
        outputStream.write(bArr, 0, (int) (j & 4095));
    }

    /* renamed from: i */
    public static void m22853i(OutputStream outputStream, int i) {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* renamed from: j */
    public static void m22854j(OutputStream outputStream, long j) {
        outputStream.write(new byte[]{(byte) ((int) (j >>> 56)), (byte) ((int) (j >>> 48)), (byte) ((int) (j >>> 40)), (byte) ((int) (j >>> 32)), (byte) ((int) (j >>> 24)), (byte) ((int) (j >>> 16)), (byte) ((int) (j >>> 8)), (byte) ((int) j)}, 0, 8);
    }

    /* renamed from: k */
    public static void m22855k(OutputStream outputStream, int i) {
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* renamed from: l */
    public static void m22856l(OutputStream outputStream, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("value is null.");
        } else if (obj instanceof C20707b) {
            outputStream.write(((C20707b) obj).f58556a);
        } else if ((obj instanceof Boolean) || Boolean.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if ((obj instanceof Character) || Character.TYPE.isAssignableFrom(obj.getClass())) {
            m22855k(outputStream, ((Character) obj).charValue());
        } else if ((obj instanceof Float) || Float.TYPE.isAssignableFrom(obj.getClass())) {
            m22853i(outputStream, Float.floatToRawIntBits(((Float) obj).floatValue()));
        } else if ((obj instanceof Double) || Double.TYPE.isAssignableFrom(obj.getClass())) {
            m22854j(outputStream, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        } else if ((obj instanceof Byte) || Byte.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((Byte) obj).byteValue());
        } else if ((obj instanceof Short) || Short.TYPE.isAssignableFrom(obj.getClass())) {
            m22855k(outputStream, ((Short) obj).shortValue());
        } else if ((obj instanceof Integer) || Integer.TYPE.isAssignableFrom(obj.getClass())) {
            m22853i(outputStream, ((Integer) obj).intValue());
        } else if ((obj instanceof Long) || Long.TYPE.isAssignableFrom(obj.getClass())) {
            m22854j(outputStream, ((Long) obj).longValue());
        } else {
            throw new IllegalArgumentException("bad value type: " + obj.getClass().getName());
        }
    }
}
