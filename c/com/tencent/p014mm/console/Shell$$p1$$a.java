package com.tencent.p014mm.console;

/* renamed from: com.tencent.mm.console.Shell$$p1$$a */
public final /* synthetic */ class Shell$$p1$$a implements Runnable {
    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:2|(1:4))|5|(1:7)(1:8)|(2:10|(1:12))|13|(1:15)|16|17|20|(1:22)|23|24|25|26|(4:27|28|29|30)|38|39|(3:40|41|(1:43)(1:44))|45|55|56|(2:(1:52)|(1:37))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00fe */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112 A[Catch:{ all -> 0x011a, all -> 0x011f, IOException -> 0x0124 }, LOOP:0: B:40:0x010c->B:43:0x0112, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0116 A[EDGE_INSN: B:44:0x0116->B:45:? ?: BREAK  , SYNTHETIC, Splitter:B:44:0x0116] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "MicroMsg.OPENGL_HOOK_DUMP"
            java.lang.String r3 = "OPENGL_HOOK_DUMP begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r4 = r4.getExternalCacheDir()
            r3.append(r4)
            java.lang.String r4 = "/"
            r3.append(r4)
            java.lang.String r5 = "Diagnostic"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            int r4 = android.os.Process.myPid()
            r5.append(r4)
            java.lang.String r4 = "_opengl_dump.txt"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            r5 = 0
            java.lang.String r6 = r3.getPath()
            r7 = 0
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r7, r7)
            java.lang.String r8 = r3.getPath()
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x006a
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r6)
            android.net.Uri r3 = r3.build()
        L_0x006a:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            r6.<init>((java.lang.String) r4)
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r8.mo177799l(r3, r5)
            boolean r9 = r5.mo177810a()
            if (r9 != 0) goto L_0x007d
            r9 = 0
            goto L_0x0085
        L_0x007d:
            com.tencent.mm.vfs.FileSystem$c r9 = r5.f348991a
            java.lang.String r10 = r5.f348992b
            boolean r9 = r9.mo119948x(r10)
        L_0x0085:
            if (r9 != 0) goto L_0x0099
            com.tencent.mm.vfs.f0$h r3 = r8.mo177799l(r3, r5)
            boolean r5 = r3.mo177810a()
            if (r5 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            com.tencent.mm.vfs.FileSystem$c r5 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            r5.mo119937g(r3)
        L_0x0099:
            boolean r3 = r6.mo119967g()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.mo119966f()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "delete openGL dumpFile result = "
            r5.append(r8)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
        L_0x00b7:
            r6.mo119964e()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00c4
        L_0x00bb:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r6 = "openGL dumpFile createNewFile failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r6, r5)
        L_0x00c4:
            ue.e r3 = p1046ue.C90652e.f260459f
            r3.getClass()
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x00d7
            r5.delete()
        L_0x00d7:
            r5.createNewFile()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00fe }
            java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00fe }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00fe }
            r9.<init>(r5)     // Catch:{ IOException -> 0x00fe }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00fe }
            r6.<init>(r8)     // Catch:{ IOException -> 0x00fe }
            java.lang.String r3 = r3.mo124794b()     // Catch:{ all -> 0x00f4 }
            r6.write(r3)     // Catch:{ all -> 0x00f4 }
            r6.close()     // Catch:{ IOException -> 0x00fe }
            goto L_0x00fe
        L_0x00f4:
            r3 = move-exception
            r6.close()     // Catch:{ all -> 0x00f9 }
            goto L_0x00fd
        L_0x00f9:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch:{ IOException -> 0x00fe }
        L_0x00fd:
            throw r3     // Catch:{ IOException -> 0x00fe }
        L_0x00fe:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0124 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0124 }
            java.io.InputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106423E(r4)     // Catch:{ IOException -> 0x0124 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0124 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0124 }
        L_0x010c:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x011a }
            if (r5 == 0) goto L_0x0116
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ all -> 0x011a }
            goto L_0x010c
        L_0x0116:
            r3.close()     // Catch:{ IOException -> 0x0124 }
            goto L_0x012e
        L_0x011a:
            r5 = move-exception
            r3.close()     // Catch:{ all -> 0x011f }
            goto L_0x0123
        L_0x011f:
            r3 = move-exception
            r5.addSuppressed(r3)     // Catch:{ IOException -> 0x0124 }
        L_0x0123:
            throw r5     // Catch:{ IOException -> 0x0124 }
        L_0x0124:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r6 = "MicroMsg.Shell"
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r3, r7, r5)
        L_0x012e:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OPENGL_HOOK_DUMP success: file path = "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", cost = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.console.Shell$$p1$$a.run():void");
    }
}
