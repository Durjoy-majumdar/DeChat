package p820q9;

import com.tencent.tav.core.ExportErrorStatus;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: q9.f */
public final class C89579f {

    /* renamed from: a */
    public boolean f257777a = false;

    /* renamed from: b */
    public String f257778b = null;

    /* renamed from: b */
    public static boolean m112005b(String str, String str2) {
        return new File(String.valueOf(str2) + "/" + str).exists();
    }

    /* renamed from: c */
    public static boolean m112006c(String str, String[] strArr) {
        for (String compareTo : strArr) {
            if (str.compareTo(compareTo) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0051 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m112007d(java.lang.String r7, java.lang.String r8) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r1.<init>(r8)
            java.lang.String r8 = "/"
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r7.<init>(r0)
            java.nio.channels.FileChannel r1 = r7.getChannel()     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            r3 = 0
            long r5 = r0.length()     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            r0.update(r8)     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            java.math.BigInteger r8 = new java.math.BigInteger     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            r1 = 1
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            r0 = 16
            java.lang.String r8 = r8.toString(r0)     // Catch:{ Exception -> 0x0051, all -> 0x004c }
            r7.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0055
        L_0x004c:
            r8 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r8
        L_0x0051:
            r7.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r8 = 0
        L_0x0055:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p820q9.C89579f.m112007d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r9v11, types: [java.nio.channels.spi.AbstractInterruptibleChannel, java.nio.channels.FileChannel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m112008e(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r1.<init>(r10)
            java.lang.String r10 = "/"
            r1.append(r10)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r2.<init>(r11)
            r2.append(r10)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.<init>(r9)
            r9 = 0
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0087, all -> 0x0076 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x0087, all -> 0x0076 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0071, all -> 0x006b }
            r11.<init>(r1)     // Catch:{ IOException -> 0x0071, all -> 0x006b }
            java.nio.channels.FileChannel r0 = r10.getChannel()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.nio.channels.FileChannel r9 = r11.getChannel()     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r3 = 0
            long r5 = r0.size()     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r2 = r0
            r7 = r9
            r2.transferTo(r3, r5, r7)     // Catch:{ IOException -> 0x0062, all -> 0x005d }
            r10.close()     // Catch:{ IOException -> 0x005c }
            r0.close()     // Catch:{ IOException -> 0x005c }
            r11.close()     // Catch:{ IOException -> 0x005c }
            r9.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            return
        L_0x005d:
            r1 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x007a
        L_0x0062:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x008a
        L_0x0066:
            r1 = move-exception
            r0 = r9
            goto L_0x006e
        L_0x0069:
            r0 = r9
            goto L_0x0073
        L_0x006b:
            r1 = move-exception
            r11 = r9
            r0 = r11
        L_0x006e:
            r9 = r10
            r10 = r0
            goto L_0x007a
        L_0x0071:
            r11 = r9
            r0 = r11
        L_0x0073:
            r9 = r10
            r10 = r0
            goto L_0x008a
        L_0x0076:
            r1 = move-exception
            r10 = r9
            r11 = r10
            r0 = r11
        L_0x007a:
            r9.close()     // Catch:{ IOException -> 0x0086 }
            r0.close()     // Catch:{ IOException -> 0x0086 }
            r11.close()     // Catch:{ IOException -> 0x0086 }
            r10.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            throw r1
        L_0x0087:
            r10 = r9
            r11 = r10
            r0 = r11
        L_0x008a:
            r9.close()     // Catch:{ IOException -> 0x0096 }
            r0.close()     // Catch:{ IOException -> 0x0096 }
            r11.close()     // Catch:{ IOException -> 0x0096 }
            r10.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p820q9.C89579f.m112008e(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final int mo123888a(String str, String str2, String str3) {
        if (this.f257777a) {
            return 0;
        }
        if (!m112005b("libwxvoiceembed.so", str)) {
            return -201;
        }
        if (!m112005b("libwxvoiceembed.bin", str)) {
            return -202;
        }
        try {
            if (!m112006c(m112007d("libwxvoiceembed.so", str), str2.split(";"))) {
                return -203;
            }
            try {
                if (!m112006c(m112007d("libwxvoiceembed.bin", str), str3.split(";"))) {
                    return ExportErrorStatus.AUDIO_FRAME_HANDLE_TIMEOUT;
                }
                this.f257778b = str;
                this.f257777a = true;
                return 0;
            } catch (FileNotFoundException unused) {
                return ExportErrorStatus.AUDIO_FRAME_HANDLE_TIMEOUT;
            }
        } catch (FileNotFoundException unused2) {
            return -203;
        }
    }
}
