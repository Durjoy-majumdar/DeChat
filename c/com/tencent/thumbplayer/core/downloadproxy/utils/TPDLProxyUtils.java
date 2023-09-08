package com.tencent.thumbplayer.core.downloadproxy.utils;

import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TPDLProxyUtils {
    private static final String FILE_NAME = "TPDLProxyUtils";

    public static String byteArrayToString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "byteArrayToString failed, error:" + th.toString());
            return "";
        }
    }

    public static String losePackageCheck(int i) {
        String str;
        String str2 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ping -c " + i + " www.qq.com").getInputStream()));
            str = str2;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.contains(" packet loss")) {
                        str2 = readLine.substring(10 + readLine.indexOf("received, "), readLine.indexOf("%") + 1);
                    }
                    if (readLine.contains("avg")) {
                        int indexOf = readLine.indexOf("/", 20);
                        str = readLine.substring(indexOf + 1, readLine.indexOf(".", indexOf));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            str = str2;
        }
        return str2 + ";" + str;
    }

    public static int objectToInt(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "object to int failed, error:" + th.toString());
            return i;
        }
    }

    public static long objectToLong(Object obj, long j) {
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "object to long failed, error:" + th.toString());
            return j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[SYNTHETIC, Splitter:B:24:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String serialize(java.lang.Object r9) {
        /*
            java.lang.String r0 = "obj serialize to string byteArrayOutputStream close, error:"
            java.lang.String r1 = "obj serialize to string  objectOutputStream close, error:"
            java.lang.String r2 = "tpdlnative"
            java.lang.String r3 = "TPDLProxyUtils"
            r4 = 0
            r5 = 0
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0059 }
            r6.<init>()     // Catch:{ all -> 0x0059 }
            java.io.ObjectOutputStream r7 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0057 }
            r7.<init>(r6)     // Catch:{ all -> 0x0057 }
            r7.writeObject(r9)     // Catch:{ all -> 0x0054 }
            java.lang.String r9 = "ISO-8859-1"
            java.lang.String r9 = r6.toString(r9)     // Catch:{ all -> 0x0054 }
            r7.close()     // Catch:{ all -> 0x0021 }
            goto L_0x0038
        L_0x0021:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r1 = r4.toString()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r1)
        L_0x0038:
            r6.close()     // Catch:{ all -> 0x003c }
            goto L_0x0053
        L_0x003c:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r1.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r0)
        L_0x0053:
            return r9
        L_0x0054:
            r9 = move-exception
            r4 = r7
            goto L_0x005b
        L_0x0057:
            r9 = move-exception
            goto L_0x005b
        L_0x0059:
            r9 = move-exception
            r6 = r4
        L_0x005b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r7.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = "serialize obj, error:"
            r7.append(r8)     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00ae }
            r7.append(r9)     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x00ae }
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r9)     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0090
            r4.close()     // Catch:{ all -> 0x0079 }
            goto L_0x0090
        L_0x0079:
            r9 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r9 = r9.toString()
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r9)
        L_0x0090:
            r6.close()     // Catch:{ all -> 0x0094 }
            goto L_0x00ab
        L_0x0094:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r9 = r9.toString()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r9)
        L_0x00ab:
            java.lang.String r9 = ""
            return r9
        L_0x00ae:
            r9 = move-exception
            if (r4 == 0) goto L_0x00cc
            r4.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00cc
        L_0x00b5:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r1 = r4.toString()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r1)
        L_0x00cc:
            r6.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00e7
        L_0x00d0:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r1.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r0)
        L_0x00e7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.serialize(java.lang.Object):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[SYNTHETIC, Splitter:B:24:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[SYNTHETIC, Splitter:B:29:0x0094] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object serializeToObject(java.lang.String r10) {
        /*
            java.lang.String r0 = "serialize to obj byteArrayInputStream close, error:"
            java.lang.String r1 = "serialize to obj objectInputStream close, error:"
            java.lang.String r2 = "tpdlnative"
            java.lang.String r3 = "TPDLProxyUtils"
            r4 = 0
            r5 = 0
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x005a }
            java.lang.String r7 = "ISO-8859-1"
            byte[] r10 = r10.getBytes(r7)     // Catch:{ all -> 0x005a }
            r6.<init>(r10)     // Catch:{ all -> 0x005a }
            java.io.ObjectInputStream r10 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0057 }
            r10.<init>(r6)     // Catch:{ all -> 0x0057 }
            java.lang.Object r4 = r10.readObject()     // Catch:{ all -> 0x0055 }
            r10.close()     // Catch:{ all -> 0x0022 }
            goto L_0x0039
        L_0x0022:
            r10 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r10 = r10.toString()
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r10)
        L_0x0039:
            r6.close()     // Catch:{ all -> 0x003d }
            goto L_0x0054
        L_0x003d:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = r10.toString()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r10)
        L_0x0054:
            return r4
        L_0x0055:
            r7 = move-exception
            goto L_0x005d
        L_0x0057:
            r7 = move-exception
            r10 = r4
            goto L_0x005d
        L_0x005a:
            r7 = move-exception
            r10 = r4
            r6 = r10
        L_0x005d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r8.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r9 = "serialize to obj , error:"
            r8.append(r9)     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b0 }
            r8.append(r7)     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x00b0 }
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r7)     // Catch:{ all -> 0x00b0 }
            if (r10 == 0) goto L_0x0092
            r10.close()     // Catch:{ all -> 0x007b }
            goto L_0x0092
        L_0x007b:
            r10 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r10 = r10.toString()
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r10)
        L_0x0092:
            if (r6 == 0) goto L_0x00af
            r6.close()     // Catch:{ all -> 0x0098 }
            goto L_0x00af
        L_0x0098:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = r10.toString()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r10)
        L_0x00af:
            return r4
        L_0x00b0:
            r4 = move-exception
            if (r10 == 0) goto L_0x00ce
            r10.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00ce
        L_0x00b7:
            r10 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r10 = r10.toString()
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r10)
        L_0x00ce:
            if (r6 == 0) goto L_0x00eb
            r6.close()     // Catch:{ all -> 0x00d4 }
            goto L_0x00eb
        L_0x00d4:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r10 = r10.toString()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.m21865e(r3, r5, r2, r10)
        L_0x00eb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.serializeToObject(java.lang.String):java.lang.Object");
    }
}
