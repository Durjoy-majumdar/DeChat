package com.tencent.liteav.base.system;

import com.tencent.liteav.base.Log;
import java.security.MessageDigest;

/* renamed from: com.tencent.liteav.base.system.o */
final class C80204o {

    /* renamed from: a */
    private static final char[] f234753a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ca, code lost:
        if (r3 != null) goto L_0x01a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b A[SYNTHETIC, Splitter:B:29:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0175 A[Catch:{ Exception -> 0x01b0, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0196 A[Catch:{ Exception -> 0x01b0, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e3 A[SYNTHETIC, Splitter:B:85:0x01e3] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb A[SYNTHETIC, Splitter:B:92:0x01eb] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m97553a(java.lang.String r23) {
        /*
            java.lang.String r1 = "/liteav/spuid"
            android.content.Context r0 = com.tencent.liteav.base.ContextUtils.getApplicationContext()
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            r3 = 0
            java.io.File r4 = r0.getExternalFilesDir(r3)
            java.lang.String r5 = "UUID"
            r6 = 0
            if (r4 != 0) goto L_0x001d
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = "getDeviceUuid: sdcardDir is null."
            com.tencent.liteav.base.Log.m97546e(r5, r1, r0)
            return r2
        L_0x001d:
            java.lang.String r7 = "com.tencent.liteav.dev_uuid"
            android.content.SharedPreferences r7 = r0.getSharedPreferences(r7, r6)
            java.lang.String r8 = "com.tencent.liteav.key_dev_uuid"
            java.lang.String r9 = r7.getString(r8, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            r0.<init>()     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            java.lang.String r10 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            r0.append(r10)     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            r0.append(r1)     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            r10.<init>(r0)     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            boolean r0 = r10.exists()     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            if (r0 == 0) goto L_0x0063
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0070, all -> 0x006d }
            int r0 = r11.available()     // Catch:{ Exception -> 0x0061 }
            if (r0 <= 0) goto L_0x005f
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0061 }
            r11.read(r0)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x0061 }
            java.lang.String r12 = "UTF-8"
            r10.<init>(r0, r12)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0065
        L_0x005f:
            r10 = r3
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            goto L_0x0072
        L_0x0063:
            r10 = r3
            r11 = r10
        L_0x0065:
            if (r11 == 0) goto L_0x0091
            r11.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x0091
        L_0x006b:
            goto L_0x0091
        L_0x006d:
            r0 = move-exception
            goto L_0x01e9
        L_0x0070:
            r0 = move-exception
            r11 = r3
        L_0x0072:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            java.lang.String r12 = "Read UUID from file failed."
            r10.<init>(r12)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01e7 }
            r10.append(r0)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x01e7 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e7 }
            com.tencent.liteav.base.Log.m97546e(r5, r0, r10)     // Catch:{ all -> 0x01e7 }
            if (r11 == 0) goto L_0x0090
            r11.close()     // Catch:{ Exception -> 0x008f }
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            r10 = r3
        L_0x0091:
            if (r9 == 0) goto L_0x009b
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x009b
            r0 = r9
            goto L_0x00a6
        L_0x009b:
            if (r10 == 0) goto L_0x00a5
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x00a5
            r0 = r10
            goto L_0x00a6
        L_0x00a5:
            r0 = r3
        L_0x00a6:
            if (r0 == 0) goto L_0x00b3
            int r11 = r0.length()
            if (r11 != 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            r2 = r0
            r12 = r4
            goto L_0x014d
        L_0x00b3:
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = android.os.SystemClock.uptimeMillis()
            r0 = 5
        L_0x00bc:
            r3 = 1
            java.lang.String r6 = "%02x"
            if (r0 < 0) goto L_0x00f0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            int r3 = r0 * 8
            long r19 = r11 >> r3
            r21 = r11
            r17 = 255(0xff, double:1.26E-321)
            long r11 = r19 & r17
            int r3 = (int) r11
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r11 = 0
            r2[r11] = r3
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            int r0 = r0 + -1
            r11 = r21
            r3 = 0
            r6 = 0
            goto L_0x00bc
        L_0x00f0:
            r0 = 3
        L_0x00f1:
            if (r0 < 0) goto L_0x011f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            int r12 = r0 * 8
            long r15 = r13 >> r12
            r12 = r4
            r17 = 255(0xff, double:1.26E-321)
            long r3 = r15 & r17
            int r4 = (int) r3
            byte r3 = (byte) r4
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            int r0 = r0 + -1
            r4 = r12
            r3 = 1
            goto L_0x00f1
        L_0x011f:
            r12 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r23
            r2.append(r3)
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = m97554b(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = r0
        L_0x014d:
            if (r10 == 0) goto L_0x0155
            boolean r0 = r10.equals(r2)
            if (r0 != 0) goto L_0x01cd
        L_0x0155:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r0.<init>()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r3 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r0.append(r3)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r3 = "/liteav"
            r0.append(r3)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r0 = r3.exists()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r0 != 0) goto L_0x0178
            r3.mkdir()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x0178:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r0.<init>()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r3 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r0.append(r3)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r0.append(r1)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r0 != 0) goto L_0x0199
            r1.createNewFile()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x0199:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r3.<init>(r1)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            byte[] r0 = r2.getBytes()     // Catch:{ Exception -> 0x01ab }
            r3.write(r0)     // Catch:{ Exception -> 0x01ab }
        L_0x01a5:
            r3.close()     // Catch:{ Exception -> 0x01a9 }
            goto L_0x01cd
        L_0x01a9:
            goto L_0x01cd
        L_0x01ab:
            r0 = move-exception
            goto L_0x01b2
        L_0x01ad:
            r0 = move-exception
            r3 = 0
            goto L_0x01e1
        L_0x01b0:
            r0 = move-exception
            r3 = 0
        L_0x01b2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e0 }
            java.lang.String r4 = "Write UUID to file failed."
            r1.<init>(r4)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01e0 }
            r1.append(r0)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01e0 }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x01e0 }
            com.tencent.liteav.base.Log.m97546e(r5, r0, r1)     // Catch:{ all -> 0x01e0 }
            if (r3 == 0) goto L_0x01cd
            goto L_0x01a5
        L_0x01cd:
            if (r9 == 0) goto L_0x01d5
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L_0x01df
        L_0x01d5:
            android.content.SharedPreferences$Editor r0 = r7.edit()
            r0.putString(r8, r2)
            r0.commit()
        L_0x01df:
            return r2
        L_0x01e0:
            r0 = move-exception
        L_0x01e1:
            if (r3 == 0) goto L_0x01e6
            r3.close()     // Catch:{ Exception -> 0x01e6 }
        L_0x01e6:
            throw r0
        L_0x01e7:
            r0 = move-exception
            r3 = r11
        L_0x01e9:
            if (r3 == 0) goto L_0x01ee
            r3.close()     // Catch:{ Exception -> 0x01ee }
        L_0x01ee:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.system.C80204o.m97553a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private static String m97554b(String str) {
        if (str == null) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            char[] cArr = new char[(digest.length << 1)];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                char[] cArr2 = f234753a;
                cArr[i] = cArr2[(b & 240) >>> 4];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            Log.m97546e("UUID", "stringToMd5 failed.", e);
            return "";
        }
    }
}
