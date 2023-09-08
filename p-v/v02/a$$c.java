package v02;

public class a$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ a$$d f260620d;

    /* renamed from: e */
    public final /* synthetic */ String f260621e;

    public a$$c(a$$d a__d, String str) {
        this.f260620d = a__d;
        this.f260621e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            long r2 = v02.C90734a.f260612c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            boolean r2 = v02.C90734a.f260613d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.Tinker.CTinkerInstaller"
            java.lang.String r5 = "currentTime = %s, buildDelatOldFileSuccess = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            boolean r1 = v02.C90734a.f260613d
            if (r1 == 0) goto L_0x0034
            long r5 = eb0.C31543z5.m39451a()
            long r7 = v02.C90734a.f260612c
            long r5 = r5 - r7
            r7 = 120000(0x1d4c0, double:5.9288E-319)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0034
            v02.a$$d r0 = r12.f260620d
            r0.mo123260a(r4)
            return
        L_0x0034:
            long r5 = eb0.C31543z5.m39451a()
            v02.C90734a.f260612c = r5
            java.util.concurrent.atomic.AtomicBoolean r1 = v02.C90734a.f260611b
            boolean r1 = r1.compareAndSet(r3, r4)
            if (r1 != 0) goto L_0x004a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "MergeHdiffApkService doApplyPatch is running by another runner."
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r2, r1, r0)
            return
        L_0x004a:
            r1 = 0
            r5 = -100
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r7 = r12.f260621e     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r6.<init>(r7)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r7 = b12.C79645d.m96733i(r7)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            boolean r8 = v02.C90734a.m113785b()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            if (r8 == 0) goto L_0x0078
            boolean r8 = v02.C90737d.m113795c()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            if (r8 == 0) goto L_0x0078
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = "user old apk"
            android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r7, (java.lang.CharSequence) r8, (int) r4)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r7.show()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r7 = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/tmp/old.apk"
        L_0x0078:
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r9 = r12.f260621e     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r8.<init>(r9)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = r8.getParent()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r9 = java.io.File.separator     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            boolean r10 = r8.endsWith(r9)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            if (r10 != 0) goto L_0x009a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r10.<init>()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r10.append(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r10.append(r9)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
        L_0x009a:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r10.<init>()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r10.append(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = "deltaFriendlyOldFile_headinfo"
            r10.append(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r9.<init>(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            com.tencent.p014mm.vfs.C86013q1.m106444e(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r10 = "update_old_delata_file_head_infor_tmp"
            java.lang.String r11 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r8.putString(r10, r11)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r8 = 4194304(0x400000, float:5.877472E-39)
            ff0.C86864a.m107872d(r6, r9, r3, r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = r12.f260621e     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r8 = v02.C90734a.m113787d(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            r6.<init>(r8)     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            java.lang.String r1 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r1 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            com.tencent.p014mm.vfs.C86013q1.m106444e(r1)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r8 = "update_old_delata_file_tmp"
            java.lang.String r10 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r1.putString(r8, r10)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r1 = "start buildOldDeltaFriendFile oldApk: %s, \n, patchHeadInfoPatch:  %s, \n, deltaFriendlyOldFile:  %s,"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r8[r3] = r7     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r10 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r8[r4] = r10     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r10 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            r8[r0] = r10     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r8)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r1 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r8 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            int r1 = ff0.C86864a.m107873e(r7, r1, r8)     // Catch:{ Exception -> 0x0148, all -> 0x0146 }
            java.lang.String r7 = "hdiffApk, buildOldDeltaFriendFile start buildOldDeltaFriendFilemake old deltaFile. code = %s, success = %s."
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0144 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0144 }
            r8[r3] = r9     // Catch:{ Exception -> 0x0144 }
            if (r1 != r5) goto L_0x0131
            r9 = 1
            goto L_0x0132
        L_0x0131:
            r9 = 0
        L_0x0132:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0144 }
            r8[r4] = r9     // Catch:{ Exception -> 0x0144 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r8)     // Catch:{ Exception -> 0x0144 }
            if (r1 == r5) goto L_0x0141
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r6)
            goto L_0x016a
        L_0x0141:
            v02.C90734a.f260613d = r4
            goto L_0x016a
        L_0x0144:
            r7 = move-exception
            goto L_0x0153
        L_0x0146:
            r0 = move-exception
            goto L_0x014d
        L_0x0148:
            r1 = move-exception
            r7 = r1
            goto L_0x0152
        L_0x014b:
            r0 = move-exception
            r6 = r1
        L_0x014d:
            r1 = 0
            goto L_0x0179
        L_0x014f:
            r6 = move-exception
            r7 = r6
            r6 = r1
        L_0x0152:
            r1 = 0
        L_0x0153:
            java.lang.String r8 = "hdiffApk, buildOldDeltaFriendFile Exception. code = %s, e = %s."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0178 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0178 }
            r0[r3] = r9     // Catch:{ all -> 0x0178 }
            r0[r4] = r7     // Catch:{ all -> 0x0178 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r0)     // Catch:{ all -> 0x0178 }
            if (r1 == r5) goto L_0x0168
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r6)
            goto L_0x016a
        L_0x0168:
            v02.C90734a.f260613d = r4
        L_0x016a:
            java.util.concurrent.atomic.AtomicBoolean r0 = v02.C90734a.f260611b
            r0.set(r3)
            v02.a$$d r0 = r12.f260620d
            if (r1 != r5) goto L_0x0174
            r3 = 1
        L_0x0174:
            r0.mo123260a(r3)
            return
        L_0x0178:
            r0 = move-exception
        L_0x0179:
            if (r1 == r5) goto L_0x017f
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r6)
            goto L_0x0181
        L_0x017f:
            v02.C90734a.f260613d = r4
        L_0x0181:
            java.util.concurrent.atomic.AtomicBoolean r1 = v02.C90734a.f260611b
            r1.set(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v02.a$$c.run():void");
    }
}
