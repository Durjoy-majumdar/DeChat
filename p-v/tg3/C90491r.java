package tg3;

import te3.C49335eu3;

/* renamed from: tg3.r */
public class C90491r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49335eu3 f260078d;

    /* renamed from: e */
    public final /* synthetic */ C90485q f260079e;

    public C90491r(C90485q qVar, C49335eu3 eu32) {
        this.f260079e = qVar;
        this.f260078d = eu32;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "MicroMsg.NetSceneGetUpdatePackFromCDN"
            java.lang.String r2 = "updateByPatch start"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            android.os.Message r2 = android.os.Message.obtain()
            r3 = 1
            r2.what = r3
            te3.eu3 r4 = r0.f260078d
            r2.obj = r4
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            tg3.q r6 = r0.f260079e
            java.lang.String r6 = r6.mo119309f()
            tg3.q r7 = r0.f260079e
            java.lang.String r7 = r7.mo119308c()
            tg3.q r8 = r0.f260079e
            java.lang.String r8 = r8.f260058m
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.platformtools.C6666h.m6947b(r5)
            java.lang.String r9 = "MicroMsg.UpdateUtil"
            r11 = -1
            r12 = 0
            if (r5 == 0) goto L_0x00ed
            if (r6 == 0) goto L_0x00ed
            if (r7 == 0) goto L_0x00ed
            java.io.File r13 = new java.io.File     // Catch:{ Exception -> 0x00e8 }
            r13.<init>(r5)     // Catch:{ Exception -> 0x00e8 }
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r15 = "r"
            r14.<init>(r13, r15)     // Catch:{ Exception -> 0x00e8 }
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x00e8 }
            r15.<init>(r7)     // Catch:{ Exception -> 0x00e8 }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x00e8 }
            r10.<init>(r6)     // Catch:{ Exception -> 0x00e8 }
            boolean r6 = r13.exists()     // Catch:{ Exception -> 0x00e8 }
            if (r6 == 0) goto L_0x00b4
            boolean r6 = r10.exists()     // Catch:{ Exception -> 0x00e8 }
            if (r6 == 0) goto L_0x00b4
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00e8 }
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()     // Catch:{ Exception -> 0x00e8 }
            int r6 = r6.targetSdkVersion     // Catch:{ Exception -> 0x00e8 }
            r13 = 29
            if (r6 > r13) goto L_0x008c
            vg.a r5 = p1054vg.C90793a.m113861b(r5)     // Catch:{ Exception -> 0x00e8 }
            if (r5 == 0) goto L_0x008c
            vg.a$a r5 = r5.f260723a     // Catch:{ Exception -> 0x00e8 }
            if (r5 == 0) goto L_0x008c
            int r5 = r5.f260726a     // Catch:{ Exception -> 0x00e8 }
            int r5 = r5 + 8
            java.lang.String r6 = "MicroMsg.MergePatchApk:extLen = %d"
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00e8 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00e8 }
            r13[r12] = r16     // Catch:{ Exception -> 0x00e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r13)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            if (r5 == 0) goto L_0x0094
            int r5 = p1054vg.C90799d.m113871a(r14, r15, r10, r5)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x0098
        L_0x0094:
            int r5 = vu3.C90873a.m113986a(r14, r15, r10, r12)     // Catch:{ Exception -> 0x00e8 }
        L_0x0098:
            if (r5 == r3) goto L_0x00a3
            java.lang.String r3 = "MicroMsg.MergePatchApk:merge failed in patchLessMemory()"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)     // Catch:{ Exception -> 0x00e8 }
            r14.close()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00ed
        L_0x00a3:
            r14.close()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = p1054vg.C90801g.m113874b(r7)     // Catch:{ Exception -> 0x00e8 }
            boolean r3 = r8.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x00e8 }
            if (r3 != 0) goto L_0x00b2
            r3 = -2
            goto L_0x00ee
        L_0x00b2:
            r3 = 0
            goto L_0x00ee
        L_0x00b4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8 }
            r3.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()="
            r3.append(r5)     // Catch:{ Exception -> 0x00e8 }
            boolean r5 = r13.exists()     // Catch:{ Exception -> 0x00e8 }
            r3.append(r5)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = ", newFile.exists()="
            r3.append(r5)     // Catch:{ Exception -> 0x00e8 }
            boolean r5 = r15.exists()     // Catch:{ Exception -> 0x00e8 }
            r3.append(r5)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = ", patch.exists()="
            r3.append(r5)     // Catch:{ Exception -> 0x00e8 }
            boolean r5 = r10.exists()     // Catch:{ Exception -> 0x00e8 }
            r3.append(r5)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)     // Catch:{ Exception -> 0x00e8 }
            r14.close()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00ed
        L_0x00e8:
            java.lang.String r3 = "MicroMsg.MergePatchApk:Exception in merge()"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)
        L_0x00ed:
            r3 = -1
        L_0x00ee:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "gen new apk finish, time cost = "
            r5.append(r6)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r4.longValue()
            long r6 = r6 - r8
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            if (r3 != 0) goto L_0x011d
            java.lang.String r3 = "updateByPatch ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            r2.arg1 = r12
            tg3.q r1 = r0.f260079e
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f260060o
            r1.sendMessage(r2)
            return
        L_0x011d:
            java.lang.String r4 = "updateByPatch error in genNewAPKInNewThread()"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
            tg3.q r4 = r0.f260079e
            java.lang.String r4 = r4.mo119308c()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r4)
            if (r3 != r11) goto L_0x013e
            java.lang.String r3 = "RET_GEN_APK_ERR"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            r1 = 3
            r2.arg1 = r1
            tg3.q r1 = r0.f260079e
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f260060o
            r1.sendMessage(r2)
            return
        L_0x013e:
            r4 = -2
            if (r3 != r4) goto L_0x0150
            java.lang.String r3 = "RET_APK_MD5_ERR"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            r1 = 4
            r2.arg1 = r1
            tg3.q r1 = r0.f260079e
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f260060o
            r1.sendMessage(r2)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg3.C90491r.run():void");
    }
}
