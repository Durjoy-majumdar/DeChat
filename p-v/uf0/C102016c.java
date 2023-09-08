package uf0;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2encoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: uf0.c */
public class C102016c {
    /* renamed from: a */
    public static boolean m134339a(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        InputStream inputStream = null;
        try {
            inputStream = C86013q1.m106423E(str);
            byte[] bArr = new byte[8];
            if (inputStream.read(bArr, 0, 8) < 8) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.AtomUtil", e, "", new Object[0]);
                }
                return false;
            }
            int e2 = m134343e(bArr, 0);
            if (m134343e(bArr, 4) != C102014a.f300375e || e2 <= 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace("MicroMsg.AtomUtil", e3, "", new Object[0]);
                }
                return false;
            }
            try {
                inputStream.close();
            } catch (IOException e4) {
                Log.printErrStackTrace("MicroMsg.AtomUtil", e4, "", new Object[0]);
            }
            return true;
        } catch (Exception e5) {
            Log.printErrStackTrace("MicroMsg.AtomUtil", e5, "", new Object[0]);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    Log.printErrStackTrace("MicroMsg.AtomUtil", e6, "", new Object[0]);
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    Log.printErrStackTrace("MicroMsg.AtomUtil", e7, "", new Object[0]);
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static C102014a m134340b(RandomAccessFile randomAccessFile, byte[] bArr, int i) {
        try {
            int read = randomAccessFile.read(bArr);
            while (read >= 8) {
                int e = m134343e(bArr, 0);
                int e2 = m134343e(bArr, 4);
                if (e2 == i) {
                    return C102019h.m134349a(e, e2, randomAccessFile.getFilePointer() - ((long) read), 0);
                }
                if (e2 != C102014a.f300376f) {
                    if (e2 != C102014a.f300380j) {
                        if (!m134346h(randomAccessFile, (long) (e - 8))) {
                            return null;
                        }
                        read = randomAccessFile.read(bArr);
                    }
                }
                read = randomAccessFile.read(bArr);
            }
            return null;
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.AtomUtil", e3, "", new Object[0]);
            Log.m105920e("MicroMsg.AtomUtil", "find Atom error: " + e3.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static C102014a m134341c(RandomAccessFile randomAccessFile, byte[] bArr, int i, long j) {
        int i2;
        byte[] bArr2 = bArr;
        try {
            int read = randomAccessFile.read(bArr);
            int i3 = read;
            while (read >= 8) {
                if (j > 0 && j <= ((long) i3)) {
                    return null;
                }
                int e = m134343e(bArr, 0);
                int e2 = m134343e(bArr, 4);
                if (e2 == i) {
                    return C102019h.m134349a(e, e2, randomAccessFile.getFilePointer() - ((long) read), 0);
                }
                if (e2 != C102014a.f300376f) {
                    if (e2 != C102014a.f300380j) {
                        int i4 = e - 8;
                        RandomAccessFile randomAccessFile2 = randomAccessFile;
                        if (!m134346h(randomAccessFile, (long) i4)) {
                            return null;
                        }
                        i3 += i4;
                        i2 = randomAccessFile.read(bArr);
                        i3 += i2;
                        read = i2;
                    }
                }
                RandomAccessFile randomAccessFile3 = randomAccessFile;
                i2 = randomAccessFile.read(bArr);
                i3 += i2;
                read = i2;
            }
            return null;
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.AtomUtil", e3, "", new Object[0]);
            Log.m105920e("MicroMsg.AtomUtil", "find Atom error: " + e3.toString());
            return null;
        }
    }

    /* renamed from: d */
    public static int m134342d(String str) {
        int length = str.length();
        char c = 0;
        for (int i = 0; i < length; i++) {
            c = (c << 8) | str.charAt(i);
        }
        return c;
    }

    /* renamed from: e */
    public static int m134343e(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
        return (bArr[i3 + 1] & ExifInterface.MARKER) | b | ((bArr[i3] & ExifInterface.MARKER) << 8);
    }

    /* renamed from: f */
    public static long m134344f(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (((long) bArr[i7 + 1]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    /* renamed from: g */
    public static long m134345g(byte[] bArr, int i) {
        byte[] bArr2 = new byte[8];
        Arrays.fill(bArr2, (byte) 0);
        System.arraycopy(bArr, i, bArr2, 4, 4);
        return m134344f(bArr2, 0);
    }

    /* renamed from: h */
    public static boolean m134346h(RandomAccessFile randomAccessFile, long j) {
        long j2 = 0;
        while (j > 2147483647L) {
            j2 += (long) randomAccessFile.skipBytes(Integer.MAX_VALUE);
            j -= 2147483647L;
        }
        return j2 + ((long) randomAccessFile.skipBytes((int) j)) == j;
    }
}
