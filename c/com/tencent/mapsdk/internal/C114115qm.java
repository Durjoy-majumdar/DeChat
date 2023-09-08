package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.mapsdk.core.utils.cache.DiskCache;
import com.tencent.wxmm.v2encoder;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.tencent.mapsdk.internal.qm */
public final class C114115qm implements DiskCache.C113489a {

    /* renamed from: a */
    private final int f341577a = 128;

    /* renamed from: b */
    private String f341578b;

    public C114115qm(String str) {
        this.f341578b = str;
    }

    /* renamed from: a */
    private static byte[] m159204a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & -16777216) >> 24)};
    }

    /* renamed from: b */
    private static int m159207b(byte[] bArr) {
        return ((bArr[3] << 24) & -16777216) | (bArr[0] & ExifInterface.MARKER) | ((bArr[1] << 8) & 65280) | ((bArr[2] << v2encoder.enumCODEC_vcodec2) & 16711680);
    }

    /* renamed from: a */
    public final File mo170959a(String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(this.f341578b)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf >= 0) {
            String substring = str.substring(0, lastIndexOf);
            if (!TextUtils.isEmpty(substring)) {
                str2 = str2 + File.separator + substring;
            }
            str = str.substring(lastIndexOf + 1);
        }
        int[] a = m159206a(str);
        if (a == null) {
            return new File(str2, str);
        }
        String str3 = str2 + m159201a(a[0], a[1], a[2]);
        if (!m159203a(str3, a[0], a[1], bArr)) {
            return new File(str2, str);
        }
        return new File(str3 + ".dat");
    }

    /* renamed from: a */
    public final byte[] mo170961a(String str, File file) {
        String str2 = this.f341578b;
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf >= 0) {
            String substring = str.substring(0, lastIndexOf);
            if (!TextUtils.isEmpty(substring)) {
                str2 = str2 + File.separator + substring;
            }
            str = str.substring(lastIndexOf + 1);
        }
        int[] a = m159206a(str);
        if (a == null) {
            return null;
        }
        return m159205a(str2 + m159201a(a[0], a[1], a[2]), a[0], a[1]);
    }

    /* renamed from: a */
    public final boolean mo170960a(File file) {
        return C113884kf.m157500b(new File(this.f341578b));
    }

    /* renamed from: a */
    private static int[] m159206a(String str) {
        String[] split = str.split("-");
        if (split.length < 3) {
            return null;
        }
        int[] iArr = new int[3];
        int i = 0;
        while (i < 3) {
            try {
                iArr[i] = Integer.parseInt(split[i]);
                i++;
            } catch (NumberFormatException e) {
                C113889km.m157537a(Log.getStackTraceString(e));
                return null;
            }
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[ExcHandler: all (r11v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:19:0x005d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m159203a(java.lang.String r11, int r12, int r13, byte[] r14) {
        /*
            java.lang.String r0 = "rws"
            r1 = 0
            if (r14 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r14.length
            if (r2 > 0) goto L_0x000a
            return r1
        L_0x000a:
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r5 = ".idx"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3[r1] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r11 = ".dat"
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            r4 = 1
            r3[r4] = r11
            java.io.File r11 = new java.io.File
            r5 = r3[r4]
            r11.<init>(r5)
            boolean r5 = r11.exists()
            if (r5 != 0) goto L_0x0048
            boolean r5 = com.tencent.mapsdk.internal.C113884kf.m157489a((java.io.File) r11)
            if (r5 != 0) goto L_0x0048
            return r1
        L_0x0048:
            r5 = 0
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x004f }
            r6.<init>(r11, r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x0051
        L_0x004f:
            r6 = r5
        L_0x0051:
            if (r6 != 0) goto L_0x0054
            return r1
        L_0x0054:
            byte[] r11 = m159204a((int) r2)
            m159202a((byte[]) r11)
            r7 = 0
            long r9 = r6.length()     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            r6.seek(r9)     // Catch:{ Exception -> 0x0071, all -> 0x006b }
            r6.write(r11)     // Catch:{ Exception -> 0x0071, all -> 0x006b }
            r6.write(r14)     // Catch:{ Exception -> 0x0071, all -> 0x006b }
            goto L_0x0071
        L_0x006b:
            r11 = move-exception
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r6)
            throw r11
        L_0x0070:
            r9 = r7
        L_0x0071:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r6)
            java.io.File r11 = new java.io.File
            r14 = r3[r1]
            r11.<init>(r14)
            boolean r14 = r11.exists()
            if (r14 != 0) goto L_0x0088
            boolean r14 = com.tencent.mapsdk.internal.C113884kf.m157489a((java.io.File) r11)
            if (r14 != 0) goto L_0x0088
            return r1
        L_0x0088:
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x008f }
            r14.<init>(r11, r0)     // Catch:{ Exception -> 0x008f }
            r5 = r14
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            if (r5 != 0) goto L_0x0093
            return r1
        L_0x0093:
            long r2 = r5.length()     // Catch:{ Exception -> 0x0098 }
            goto L_0x009a
        L_0x0098:
            r2 = r7
        L_0x009a:
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x00ab
            r11 = 65536(0x10000, float:9.18355E-41)
            byte[] r11 = new byte[r11]
            r14 = -1
            java.util.Arrays.fill(r11, r14)
            r5.write(r11)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00ab
        L_0x00aa:
        L_0x00ab:
            long r11 = m159200a((int) r12, (int) r13)
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b7
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            return r1
        L_0x00b7:
            r13 = 4
            long r11 = r11 * r13
            r5.seek(r11)     // Catch:{ Exception -> 0x00be }
        L_0x00be:
            int r11 = (int) r9
            byte[] r11 = m159204a((int) r11)
            m159202a((byte[]) r11)
            r5.write(r11)     // Catch:{ Exception -> 0x00c9, all -> 0x00cd }
        L_0x00c9:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            goto L_0x00d2
        L_0x00cd:
            r11 = move-exception
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r5)
            throw r11
        L_0x00d2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114115qm.m159203a(java.lang.String, int, int, byte[]):boolean");
    }

    /* renamed from: a */
    private static byte[] m159205a(String str, int i, int i2) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        String[] strArr = {str + ".idx", str + ".dat"};
        File file = new File(strArr[0]);
        RandomAccessFile randomAccessFile3 = null;
        if (file.exists() && file.length() != 0) {
            long a = m159200a(i, i2);
            if (a < 0) {
                return null;
            }
            byte[] bArr = new byte[4];
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(a * 4);
                    randomAccessFile.read(bArr, 0, 4);
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    m159202a(bArr);
                    int b = m159207b(bArr);
                    if (b < 0) {
                        return null;
                    }
                    File file2 = new File(strArr[1]);
                    if (!file2.exists()) {
                        return null;
                    }
                    try {
                        randomAccessFile2 = new RandomAccessFile(file2, "r");
                        try {
                            randomAccessFile2.seek((long) b);
                            randomAccessFile2.read(bArr, 0, 4);
                            m159202a(bArr);
                            int b2 = m159207b(bArr);
                            if (b2 <= 0) {
                                C113886kg.m157515a((Closeable) randomAccessFile2);
                                return null;
                            }
                            try {
                                byte[] bArr2 = new byte[b2];
                                randomAccessFile2.read(bArr2, 0, b2);
                                return bArr2;
                            } catch (Throwable th) {
                                C113889km.m157547b("读取瓦片缓存的大小异常", th);
                                return null;
                            } finally {
                                C113886kg.m157515a((Closeable) randomAccessFile2);
                            }
                        } catch (Exception unused) {
                            C113886kg.m157515a((Closeable) randomAccessFile2);
                            return null;
                        }
                    } catch (Exception unused2) {
                        randomAccessFile2 = null;
                        C113886kg.m157515a((Closeable) randomAccessFile2);
                        return null;
                    }
                } catch (Exception unused3) {
                    C113886kg.m157515a((Closeable) randomAccessFile);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile3 = randomAccessFile;
                    C113886kg.m157515a((Closeable) randomAccessFile3);
                    throw th;
                }
            } catch (Exception unused4) {
                randomAccessFile = null;
                C113886kg.m157515a((Closeable) randomAccessFile);
                return null;
            } catch (Throwable th5) {
                th = th5;
                C113886kg.m157515a((Closeable) randomAccessFile3);
                throw th;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m159201a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        int i4 = i / 128;
        int i5 = i2 / 128;
        sb.append(File.separatorChar);
        sb.append("glGrid");
        sb.append(File.separatorChar);
        sb.append(i3);
        sb.append(File.separatorChar);
        sb.append(i4 / 10);
        sb.append(File.separatorChar);
        sb.append(i5 / 10);
        sb.append(File.separatorChar);
        sb.append(i3);
        sb.append("_");
        sb.append(i4);
        sb.append("_");
        sb.append(i5);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m159202a(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            byte b = bArr[0];
            bArr[0] = bArr[3];
            bArr[3] = b;
            byte b2 = bArr[1];
            bArr[1] = bArr[2];
            bArr[2] = b2;
        }
    }

    /* renamed from: a */
    private static long m159200a(int i, int i2) {
        return (((long) (i % 128)) * 128) + ((long) (i2 % 128));
    }
}
