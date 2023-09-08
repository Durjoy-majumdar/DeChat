package com.tencent.p014mm.console;

/* renamed from: com.tencent.mm.console.Shell$$p0 */
public class Shell$$p0 implements Shell$$t1 {
    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|(2:8|(1:10))(2:11|(2:13|14)(2:15|(1:17)))|18|(1:20)|21|(3:22|23|(6:24|25|(3:26|27|(1:29)(1:63))|30|31|32))|33|34|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00cd */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7 A[SYNTHETIC, Splitter:B:48:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f3 A[SYNTHETIC, Splitter:B:55:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa A[SYNTHETIC, Splitter:B:59:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56303a(android.content.Intent r7) {
        /*
            r6 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            java.lang.String r1 = "MicroMsg.Shell"
            if (r0 != 0) goto L_0x0014
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isMonkeyEnv()
            if (r0 != 0) goto L_0x0014
            java.lang.String r7 = "not coolassist or monkey env, disable dump maps cmd."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
            return
        L_0x0014:
            java.lang.String r0 = "process_suffix"
            java.lang.String r0 = r7.getStringExtra(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0029
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r0 != 0) goto L_0x0046
            return
        L_0x0029:
            java.lang.String r2 = ":"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x003b
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r0
            java.lang.String r0 = "DUMP_MAPS bad process suffix: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r7)
            return
        L_0x003b:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.String r0 = "dump_maps_file_name"
            java.lang.String r7 = r7.getStringExtra(r0)
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = a70.C112760b.m154195C()
            r2.append(r5)
            java.lang.String r5 = "hprofs"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2)
            boolean r2 = r0.mo119967g()
            if (r2 != 0) goto L_0x006f
            r0.mo119987x()
        L_0x006f:
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r0
            r5[r3] = r7
            java.lang.String r7 = "%s/%s"
            java.lang.String r7 = java.lang.String.format(r7, r5)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r5 = android.os.Process.myPid()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r5 = "/proc/%s/maps"
            java.lang.String r0 = java.lang.String.format(r5, r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r0
            r2[r3] = r7
            java.lang.String r3 = "dumpmaps input:%s , out:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            r2 = 0
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106429K(r7, r4)     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d7 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d7 }
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x00d7 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00d7 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x00d7 }
        L_0x00b6:
            java.lang.String r0 = r7.readLine()     // Catch:{ Exception -> 0x00d4, all -> 0x00d1 }
            if (r0 == 0) goto L_0x00c7
            int r2 = r0.length()     // Catch:{ Exception -> 0x00d4, all -> 0x00d1 }
            r3.write(r0, r4, r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00d1 }
            r3.newLine()     // Catch:{ Exception -> 0x00d4, all -> 0x00d1 }
            goto L_0x00b6
        L_0x00c7:
            r3.flush()     // Catch:{ Exception -> 0x00d4, all -> 0x00d1 }
            r7.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r3.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x00ef
        L_0x00d1:
            r0 = move-exception
            r2 = r7
            goto L_0x00f1
        L_0x00d4:
            r0 = move-exception
            r2 = r7
            goto L_0x00de
        L_0x00d7:
            r0 = move-exception
            goto L_0x00de
        L_0x00d9:
            r0 = move-exception
            r3 = r2
            goto L_0x00f1
        L_0x00dc:
            r0 = move-exception
            r3 = r2
        L_0x00de:
            java.lang.String r7 = "ERROR when reading maps"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r7, r4)     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x00ec
            r2.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00ec
        L_0x00eb:
        L_0x00ec:
            if (r3 == 0) goto L_0x00ef
            goto L_0x00cd
        L_0x00ef:
            return
        L_0x00f0:
            r0 = move-exception
        L_0x00f1:
            if (r2 == 0) goto L_0x00f8
            r2.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00f8
        L_0x00f7:
        L_0x00f8:
            if (r3 == 0) goto L_0x00fd
            r3.close()     // Catch:{ IOException -> 0x00fd }
        L_0x00fd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.console.Shell$$p0.mo56303a(android.content.Intent):void");
    }
}
