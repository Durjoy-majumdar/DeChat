package p441aq;

import f40.C31896o0;

/* renamed from: aq.p0 */
public final class C39632p0 implements C31896o0.C31897a {
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* renamed from: aJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58416aJ(int r13) {
        /*
            r12 = this;
            int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r1 = 0
            r2 = 1
            if (r0 == r13) goto L_0x0008
            r13 = 1
            goto L_0x0009
        L_0x0008:
            r13 = 0
        L_0x0009:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = zb0.C53767d.m60278b()
            r0.<init>((java.lang.String) r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.vfs.m1 r4 = r0.mo119969h()
            r3[r1] = r4
            java.lang.String r4 = "MicroMsg.emoji.EmojiStoreExportLogic"
            java.lang.String r5 = "copy search template file to path: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            boolean r3 = qe3.C89625d.f257845k
            if (r3 != 0) goto L_0x00fe
            int r3 = zb0.C53767d.m60277a()
            zb0.C53767d.f150915a = r3
            if (r13 == 0) goto L_0x00e4
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.AssetManager r13 = r13.getAssets()
            r3 = 0
            r5 = 2
            java.lang.String r6 = "emoji_config.conf"
            java.io.InputStream r13 = r13.open(r6)     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0092, all -> 0x008d }
            r6.<init>(r13)     // Catch:{ Exception -> 0x0092, all -> 0x008d }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r3 = ""
        L_0x0049:
            java.lang.String r8 = r7.readLine()     // Catch:{ Exception -> 0x0083 }
            if (r8 == 0) goto L_0x005f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083 }
            r9.<init>()     // Catch:{ Exception -> 0x0083 }
            r9.append(r3)     // Catch:{ Exception -> 0x0083 }
            r9.append(r8)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0049
        L_0x005f:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0083 }
            r8.<init>(r3)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r9 = "version"
            int r8 = r8.getInt(r9)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r9 = "config file content:%s version:%d"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0083 }
            r10[r1] = r3     // Catch:{ Exception -> 0x0083 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0083 }
            r10[r2] = r3     // Catch:{ Exception -> 0x0083 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r9, r10)     // Catch:{ Exception -> 0x0083 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r13)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            goto L_0x00b3
        L_0x0083:
            r3 = move-exception
            goto L_0x00a0
        L_0x0085:
            r0 = move-exception
            r7 = r3
            goto L_0x0090
        L_0x0088:
            r7 = move-exception
            r11 = r7
            r7 = r3
            r3 = r11
            goto L_0x00a0
        L_0x008d:
            r0 = move-exception
            r6 = r3
            r7 = r6
        L_0x0090:
            r3 = r13
            goto L_0x00d9
        L_0x0092:
            r6 = move-exception
            r7 = r3
            r3 = r6
            r6 = r7
            goto L_0x00a0
        L_0x0097:
            r13 = move-exception
            r6 = r3
            r7 = r6
            goto L_0x00da
        L_0x009b:
            r13 = move-exception
            r6 = r3
            r7 = r6
            r3 = r13
            r13 = r7
        L_0x00a0:
            java.lang.String r8 = r3.getMessage()     // Catch:{ all -> 0x00d7 }
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d7 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r8, r9)     // Catch:{ all -> 0x00d7 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r13)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            r8 = 1
        L_0x00b3:
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r13[r1] = r3
            int r1 = zb0.C53767d.f150915a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13[r2] = r1
            java.lang.String r1 = "need update assetVersion=%d currentVersion=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r13)
            int r13 = zb0.C53767d.f150915a
            if (r13 >= r8) goto L_0x0115
            java.lang.String r13 = r0.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r13)
            zb0.C53767d.m60279c(r0)
            goto L_0x0115
        L_0x00d7:
            r0 = move-exception
            goto L_0x0090
        L_0x00d9:
            r13 = r0
        L_0x00da:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            throw r13
        L_0x00e4:
            if (r3 != r2) goto L_0x0115
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r13[r1] = r2
            java.lang.String r1 = "no need update currentVersion=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r13)
            java.lang.String r13 = r0.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r13)
            zb0.C53767d.m60279c(r0)
            goto L_0x0115
        L_0x00fe:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r2[r1] = r13
            java.lang.String r13 = "need to init search template folder %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r2)
            java.lang.String r13 = r0.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r13)
            zb0.C53767d.m60279c(r0)
        L_0x0115:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = a70.C112760b.m154195C()
            r13.append(r0)
            java.lang.String r0 = "emoji"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p441aq.C39632p0.mo58416aJ(int):void");
    }
}
