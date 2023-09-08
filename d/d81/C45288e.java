package d81;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;

/* renamed from: d81.e */
public class C45288e {
    /* renamed from: a */
    public static String m50130a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return m50131b(bArr, bArr.length);
    }

    /* renamed from: b */
    public static String m50131b(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (bArr.length < i) {
            Log.m105928w("MicroMsg.exdevice.Util", "data length is shorter then print command length");
            i = bArr.length;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2] & ExifInterface.MARKER;
            if (b < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    /* renamed from: c */
    public static boolean m50132c(byte[] bArr, int i, byte[] bArr2) {
        if (Util.isNullOrNil(bArr) || Util.isNullOrNil(bArr2) || bArr2.length + i > bArr.length || i < 0 || i >= bArr.length) {
            return false;
        }
        int i2 = 0;
        while (i2 < bArr2.length && bArr2[i2] == bArr[i2 + i]) {
            i2++;
        }
        return i2 == bArr2.length;
    }

    /* renamed from: d */
    public static int m50133d(Context context, int i) {
        int i2 = 0;
        if (context != null) {
            try {
                Rect rect = new Rect();
                ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int height = ((Activity) context).getWindow().getDecorView().getHeight();
                i2 = height - rect.height() >= 0 ? height - rect.height() : rect.top;
            } catch (Exception e) {
                Log.m105925i("MicroMsg.exdevice.Util", "getStatusHeight err: %s", e.toString());
            } catch (Throwable unused) {
            }
        }
        return i2 <= 0 ? i : i2;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m50134e() {
        /*
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r1 = "DeviceAutoSyncDuration"
            java.lang.String r0 = r0.mo107405c(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 0
            r3 = 1
            java.lang.String r4 = "MicroMsg.exdevice.Util"
            r5 = 60000(0xea60, double:2.9644E-319)
            if (r1 != 0) goto L_0x0037
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0028 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            goto L_0x0038
        L_0x0028:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r1[r2] = r0
            java.lang.String r0 = "parse string to time out long failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
        L_0x0037:
            r0 = r5
        L_0x0038:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r3[r2] = r7
            java.lang.String r2 = "now sync time out is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r5 = r0
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d81.C45288e.m50134e():long");
    }

    /* renamed from: f */
    public static String m50135f(long j) {
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr[i] = (byte) ((int) (j >> (40 - (i << 3))));
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            if (i2 != 0) {
                sb.append(XVFSFile.PATH_SEPARATOR);
            }
            byte b = bArr[i2] & ExifInterface.MARKER;
            if (b < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    /* renamed from: g */
    public static String m50136g(long j) {
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr[i] = (byte) ((int) (j >> (40 - (i << 3))));
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            byte b = bArr[i2] & ExifInterface.MARKER;
            if (b < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    /* renamed from: h */
    public static long m50137h(String str) {
        long j = 0;
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.exdevice.Util", "mac string is null or nil");
            return 0;
        }
        String[] split = str.toUpperCase(Locale.US).split(XVFSFile.PATH_SEPARATOR);
        int length = split.length;
        Byte[] bArr = new Byte[length];
        int i = 0;
        for (String str2 : split) {
            if (str2.length() == 0) {
                Log.m105920e("MicroMsg.exdevice.Util", "mac string parse fail");
                return 0;
            }
            int charAt = (((byte) str2.charAt(0)) >= 65 ? (str2.charAt(0) - 'A') + 10 : str2.charAt(0) - '0') << 4;
            byte charAt2 = (byte) str2.charAt(1);
            char charAt3 = str2.charAt(1);
            bArr[i] = Byte.valueOf((byte) ((charAt2 >= 65 ? (charAt3 - 'A') + 10 : charAt3 - '0') | charAt));
            i++;
        }
        int length2 = split.length - 1;
        for (int i2 = 0; i2 < length; i2++) {
            j |= (bArr[i2].longValue() & 255) << (length2 << 3);
            length2--;
        }
        return j;
    }

    /* renamed from: i */
    public static LinkedList<Integer> m50138i(String str) {
        String[] split;
        if (str == null || str.length() <= 0 || (split = str.split(",")) == null || split.length <= 0) {
            return null;
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            try {
                linkedList.add(Integer.valueOf(Integer.parseInt(split[i])));
            } catch (Exception unused) {
            }
        }
        return linkedList;
    }

    /* renamed from: j */
    public static UUID m50139j(byte[] bArr) {
        Log.m105919d("MicroMsg.exdevice.Util", "parseUUIDFromByteArray, uuid byte array = %s", m50130a(bArr));
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.exdevice.Util", "aUUIDByteArray is null or nil");
            return null;
        } else if (16 != bArr.length) {
            Log.m105921e("MicroMsg.exdevice.Util", "the length (%d) of this byte array is not 16", Integer.valueOf(bArr.length));
            return null;
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            try {
                allocate.put(bArr, 0, 8);
                allocate.flip();
                allocate2.put(bArr, 8, 8);
                allocate2.flip();
                UUID uuid = new UUID(allocate.getLong(), allocate2.getLong());
                Log.m105919d("MicroMsg.exdevice.Util", "parse successful, string of uuid = %s", uuid.toString());
                return uuid;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.exdevice.Util", "%s", e.getMessage());
                return null;
            }
        }
    }

    /* renamed from: k */
    public static String m50140k(String str) {
        if (str == null || 12 != str.length()) {
            Log.m105921e("MicroMsg.exdevice.Util", "%s is not server string mac", str);
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i % 2 != 0 && i < str.length() - 1) {
                sb.append(XVFSFile.PATH_SEPARATOR);
            }
        }
        Log.m105925i("MicroMsg.exdevice.Util", "%s to %s is ok", str, sb.toString());
        return sb.toString();
    }
}
