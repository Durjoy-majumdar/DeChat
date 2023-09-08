package ud3;

/* renamed from: ud3.c */
public class C90645c {

    /* renamed from: a */
    public static boolean[] f260410a = new boolean[21];

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.DataOutputStream} */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0125 A[SYNTHETIC, Splitter:B:55:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0131 A[SYNTHETIC, Splitter:B:60:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015a A[SYNTHETIC, Splitter:B:69:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0166 A[SYNTHETIC, Splitter:B:74:0x0166] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113611a(java.lang.String r10) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.SdcardCheckUtil"
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            r3 = 1
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r4 = "test_writable"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            r5 = 0
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            if (r6 == 0) goto L_0x0042
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106447h(r2)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            if (r6 != 0) goto L_0x0042
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r6.<init>()     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            java.lang.String r7 = "can not delete existing file, path = "
            r6.append(r7)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r6.append(r2)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r6 = 0
            goto L_0x0043
        L_0x0042:
            r6 = 1
        L_0x0043:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106444e(r2)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            if (r7 != 0) goto L_0x005e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r6.<init>()     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            java.lang.String r7 = "can not create new file, path = "
            r6.append(r7)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r6.append(r2)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r6 = 0
        L_0x005e:
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106429K(r2, r5)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            java.io.DataOutputStream r8 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x010a, all -> 0x0107 }
            r8.writeInt(r3)     // Catch:{ IOException -> 0x0103, all -> 0x00ff }
            r8.flush()     // Catch:{ IOException -> 0x0103, all -> 0x00ff }
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0103, all -> 0x00ff }
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106423E(r2)     // Catch:{ IOException -> 0x0103, all -> 0x00ff }
            r7.<init>(r9)     // Catch:{ IOException -> 0x0103, all -> 0x00ff }
            int r4 = r7.readInt()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r3, (int) r4)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            if (r3 != 0) goto L_0x0096
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            r3.<init>()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.lang.String r6 = "reading value mismatch, newValue = "
            r3.append(r6)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            r3.append(r4)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            r6 = 0
        L_0x0096:
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106447h(r2)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            if (r3 != 0) goto L_0x00e3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            r3.<init>()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.lang.String r4 = "can not delete existing file after io, path = "
            r3.append(r4)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            r3.append(r2)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            r4 = 30
            if (r3 != r4) goto L_0x00e2
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.lang.String r4 = "xiaomi"
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            boolean r3 = r3.contains(r4)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            if (r3 == 0) goto L_0x00e2
            java.lang.String r3 = "check test file exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            if (r4 == 0) goto L_0x00e3
            boolean r6 = r3.delete()     // Catch:{ IOException -> 0x00fc, all -> 0x00f9 }
            goto L_0x00e3
        L_0x00e2:
            r6 = 0
        L_0x00e3:
            r8.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00ed
        L_0x00e7:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x00ed:
            r7.close()     // Catch:{ IOException -> 0x00f1 }
            goto L_0x00f7
        L_0x00f1:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x00f7:
            r5 = r6
            goto L_0x013b
        L_0x00f9:
            r10 = move-exception
            r4 = r7
            goto L_0x0100
        L_0x00fc:
            r3 = move-exception
            r4 = r7
            goto L_0x0104
        L_0x00ff:
            r10 = move-exception
        L_0x0100:
            r6 = r4
            r4 = r8
            goto L_0x0158
        L_0x0103:
            r3 = move-exception
        L_0x0104:
            r6 = r4
            r4 = r8
            goto L_0x010c
        L_0x0107:
            r10 = move-exception
            r6 = r4
            goto L_0x0158
        L_0x010a:
            r3 = move-exception
            r6 = r4
        L_0x010c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0157 }
            r7.<init>()     // Catch:{ all -> 0x0157 }
            java.lang.String r8 = "try writable fail, path = "
            r7.append(r8)     // Catch:{ all -> 0x0157 }
            r7.append(r2)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0157 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0157 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r2, r7)     // Catch:{ all -> 0x0157 }
            if (r4 == 0) goto L_0x012f
            r4.close()     // Catch:{ IOException -> 0x0129 }
            goto L_0x012f
        L_0x0129:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x012f:
            if (r6 == 0) goto L_0x013b
            r6.close()     // Catch:{ IOException -> 0x0135 }
            goto L_0x013b
        L_0x0135:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x013b:
            if (r5 != 0) goto L_0x0156
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " dir: "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = " Unusable; "
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r10)
        L_0x0156:
            return r5
        L_0x0157:
            r10 = move-exception
        L_0x0158:
            if (r4 == 0) goto L_0x0164
            r4.close()     // Catch:{ IOException -> 0x015e }
            goto L_0x0164
        L_0x015e:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x0164:
            if (r6 == 0) goto L_0x0170
            r6.close()     // Catch:{ IOException -> 0x016a }
            goto L_0x0170
        L_0x016a:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x0170:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ud3.C90645c.m113611a(java.lang.String):boolean");
    }
}
