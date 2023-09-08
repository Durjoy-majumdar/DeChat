package com.tencent.p014mm.sandbox.monitor;

import java.io.File;

/* renamed from: com.tencent.mm.sandbox.monitor.i */
public class C85706i {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a A[SYNTHETIC, Splitter:B:24:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5 A[SYNTHETIC, Splitter:B:30:0x00a5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m105865a(java.lang.String r14, byte[] r15) {
        /*
            java.lang.String r0 = "file op appendToFile close e type:%s, e msg:%s, fileName:%s, buf len:%d"
            java.lang.String r1 = ""
            java.lang.String r2 = "MicroMsg.CrashFileOperatioin"
            if (r15 == 0) goto L_0x00ce
            int r3 = r15.length
            if (r3 != 0) goto L_0x000d
            goto L_0x00ce
        L_0x000d:
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            r9.<init>(r14, r7)     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            int r3 = r15.length     // Catch:{ Exception -> 0x0047 }
            r9.write(r15, r8, r3)     // Catch:{ Exception -> 0x0047 }
            r9.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0044
        L_0x0020:
            r3 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r1, r9)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1[r8] = r6
            java.lang.String r3 = r3.getMessage()
            r1[r7] = r3
            r1[r5] = r14
            int r14 = r15.length
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1[r4] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r1)
        L_0x0044:
            return r8
        L_0x0045:
            r3 = move-exception
            goto L_0x00a3
        L_0x0047:
            r3 = move-exception
            goto L_0x0052
        L_0x0049:
            r9 = move-exception
            r13 = r9
            r9 = r3
            r3 = r13
            goto L_0x00a3
        L_0x004e:
            r9 = move-exception
            r13 = r9
            r9 = r3
            r3 = r13
        L_0x0052:
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0045 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r1, r10)     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = "file op appendToFile e type:%s, e msg:%s, fileName:%s, buf len:%d"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0045 }
            java.lang.Class r12 = r3.getClass()     // Catch:{ all -> 0x0045 }
            java.lang.String r12 = r12.getSimpleName()     // Catch:{ all -> 0x0045 }
            r11[r8] = r12     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0045 }
            r11[r7] = r3     // Catch:{ all -> 0x0045 }
            r11[r5] = r14     // Catch:{ all -> 0x0045 }
            int r3 = r15.length     // Catch:{ all -> 0x0045 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0045 }
            r11[r4] = r3     // Catch:{ all -> 0x0045 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r10, r11)     // Catch:{ all -> 0x0045 }
            r3 = -1
            if (r9 == 0) goto L_0x00a2
            r9.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x00a2
        L_0x007e:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r1, r10)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Class r6 = r9.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1[r8] = r6
            java.lang.String r6 = r9.getMessage()
            r1[r7] = r6
            r1[r5] = r14
            int r14 = r15.length
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1[r4] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r1)
        L_0x00a2:
            return r3
        L_0x00a3:
            if (r9 == 0) goto L_0x00cd
            r9.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00cd
        L_0x00a9:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r1, r10)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Class r6 = r9.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1[r8] = r6
            java.lang.String r6 = r9.getMessage()
            r1[r7] = r6
            r1[r5] = r14
            int r14 = r15.length
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1[r4] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r1)
        L_0x00cd:
            throw r3
        L_0x00ce:
            r14 = -2
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sandbox.monitor.C85706i.m105865a(java.lang.String, byte[]):int");
    }

    /* renamed from: b */
    public static boolean m105866b(String str) {
        if (str == null) {
            return true;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m105867c(String str) {
        return str != null && new File(str).exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[SYNTHETIC, Splitter:B:25:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0049 A[SYNTHETIC, Splitter:B:32:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m105868d(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L_0x004c
            r7 = 102400(0x19000, float:1.43493E-40)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0019
            goto L_0x004c
        L_0x0019:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x003e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x003e }
            long r3 = (long) r7
            long r5 = r1.length()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            long r3 = r1.length()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
        L_0x002c:
            int r7 = (int) r3     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.String r7 = p823sg.C90193h.m112874b(r2, r7)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r0 = r7
            goto L_0x004c
        L_0x0039:
            r7 = move-exception
            r0 = r2
            goto L_0x003f
        L_0x003c:
            goto L_0x0047
        L_0x003e:
            r7 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            throw r7
        L_0x0045:
            r2 = r0
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sandbox.monitor.C85706i.m105868d(java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static int m105869e(String str) {
        if (str == null) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        return (int) file.length();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb A[SYNTHETIC, Splitter:B:44:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0100 A[SYNTHETIC, Splitter:B:51:0x0100] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m105870f(java.lang.String r17, int r18, int r19) {
        /*
            r1 = r17
            r2 = r18
            java.lang.String r3 = "file op readFromFileV2 close e type:%s, e msg:%s, fileName:%s, offset:%d, maxLen:%d"
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.CrashFileOperatioin"
            r6 = 0
            if (r1 != 0) goto L_0x000e
            return r6
        L_0x000e:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L_0x001a
            return r6
        L_0x001a:
            r7 = -1
            r8 = r19
            if (r8 != r7) goto L_0x0024
            long r7 = r0.length()
            int r8 = (int) r7
        L_0x0024:
            if (r2 >= 0) goto L_0x0027
            return r6
        L_0x0027:
            if (r8 > 0) goto L_0x002a
            return r6
        L_0x002a:
            int r7 = r2 + r8
            long r9 = r0.length()
            int r10 = (int) r9
            if (r7 <= r10) goto L_0x003a
            long r7 = r0.length()
            int r0 = (int) r7
            int r8 = r0 - r2
        L_0x003a:
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 5
            r13 = 0
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            java.lang.String r0 = "r"
            r14.<init>(r1, r0)     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            byte[] r6 = new byte[r8]     // Catch:{ Exception -> 0x008f, all -> 0x0088 }
            r19 = r8
            long r7 = (long) r2
            r14.seek(r7)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r14.readFully(r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r14.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x00fb
        L_0x0057:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r7, r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Class r4 = r7.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r0[r13] = r4
            java.lang.String r4 = r7.getMessage()
            r0[r11] = r4
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2 = 4
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r3, r0)
            goto L_0x00fb
        L_0x0084:
            r0 = move-exception
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            goto L_0x0092
        L_0x0088:
            r0 = move-exception
            r19 = r8
        L_0x008b:
            r7 = r0
            r6 = r14
            goto L_0x00fe
        L_0x008f:
            r0 = move-exception
            r19 = r8
        L_0x0092:
            r7 = r6
            r6 = r14
            goto L_0x009e
        L_0x0095:
            r0 = move-exception
            r19 = r8
        L_0x0098:
            r7 = r0
            goto L_0x00fe
        L_0x009a:
            r0 = move-exception
            r19 = r8
            r7 = r6
        L_0x009e:
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r4, r8)     // Catch:{ all -> 0x00fc }
            java.lang.String r8 = "file op readFromFileV2 e type:%s, e msg:%s, fileName:%s, offset:%d, maxLen:%d"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x00fc }
            java.lang.Class r16 = r0.getClass()     // Catch:{ all -> 0x00fc }
            java.lang.String r16 = r16.getSimpleName()     // Catch:{ all -> 0x00fc }
            r14[r13] = r16     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00fc }
            r14[r11] = r0     // Catch:{ all -> 0x00fc }
            r14[r10] = r1     // Catch:{ all -> 0x00fc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x00fc }
            r14[r9] = r0     // Catch:{ all -> 0x00fc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x00fc }
            r15 = 4
            r14[r15] = r0     // Catch:{ all -> 0x00fc }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r8, r14)     // Catch:{ all -> 0x00fc }
            if (r6 == 0) goto L_0x00fa
            r6.close()     // Catch:{ IOException -> 0x00cf }
            goto L_0x00fa
        L_0x00cf:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r6, r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r0[r13] = r4
            java.lang.String r4 = r6.getMessage()
            r0[r11] = r4
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2 = 4
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r3, r0)
        L_0x00fa:
            r6 = r7
        L_0x00fb:
            return r6
        L_0x00fc:
            r0 = move-exception
            goto L_0x0098
        L_0x00fe:
            if (r6 == 0) goto L_0x012f
            r6.close()     // Catch:{ IOException -> 0x0104 }
            goto L_0x012f
        L_0x0104:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r6, r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r0[r13] = r4
            java.lang.String r4 = r6.getMessage()
            r0[r11] = r4
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2 = 4
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r3, r0)
        L_0x012f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sandbox.monitor.C85706i.m105870f(java.lang.String, int, int):byte[]");
    }
}
