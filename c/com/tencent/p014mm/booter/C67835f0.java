package com.tencent.p014mm.booter;

/* renamed from: com.tencent.mm.booter.f0 */
public class C67835f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C28866g0 f194713d;

    public C67835f0(C28866g0 g0Var) {
        this.f194713d = g0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00bc A[SYNTHETIC, Splitter:B:12:0x00bc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r1 = r16
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.tencent.mm.booter.g0 r0 = r1.f194713d
            r0.getClass()
            int r4 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId
            java.lang.String r5 = p156gj.C87203t.m108273i()
            int r6 = qe3.C89625d.f257841g
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            android.content.Context r8 = r0.f79263a
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r10 = 0
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r9, r10)
            java.lang.String r9 = "last_reportdevice_channel"
            int r8 = r8.getInt(r9, r10)
            android.content.Context r0 = r0.f79263a
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r10)
            java.lang.String r11 = "last_reportdevice_clientversion"
            int r0 = r0.getInt(r11, r10)
            r12 = 0
            r13 = 1
            if (r8 != 0) goto L_0x0045
            if (r0 != 0) goto L_0x0045
            r0 = 0
            goto L_0x004c
        L_0x0045:
            if (r8 != r4) goto L_0x004b
            if (r0 != r6) goto L_0x004b
            r4 = r12
            goto L_0x008f
        L_0x004b:
            r0 = 1
        L_0x004c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = com.tencent.p014mm.booter.C28866g0.f79262b
            r4.append(r8)
            java.lang.String r8 = "?channel="
            r4.append(r8)
            int r8 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId
            r4.append(r8)
            java.lang.String r8 = "&deviceid="
            r4.append(r8)
            r4.append(r5)
            java.lang.String r5 = "&clientversion="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "&platform="
            r4.append(r5)
            java.lang.String r5 = "0"
            r4.append(r5)
            java.lang.String r5 = "&lang="
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = "&installtype="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r4 = r0
        L_0x008f:
            r0 = 3
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5[r10] = r6
            int r6 = android.os.Process.myTid()
            int r6 = android.os.Process.getThreadPriority(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r13] = r6
            r6 = 2
            r5[r6] = r4
            java.lang.String r7 = "MicroMsg.StartupReport"
            java.lang.String r8 = "tryReport thread:%s pri:%d  Url[%s] "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x00bc
            return
        L_0x00bc:
            com.tencent.mm.network.b0 r12 = com.tencent.p014mm.network.C81035d.m98963d(r4, r12)     // Catch:{ Exception -> 0x0114 }
            r5 = 10000(0x2710, float:1.4013E-41)
            r12.mo112919d(r5)     // Catch:{ Exception -> 0x0114 }
            r12.mo112923g(r5)     // Catch:{ Exception -> 0x0114 }
            r12.mo112926h()     // Catch:{ Exception -> 0x0114 }
            int r5 = r12.mo112916a()     // Catch:{ Exception -> 0x0114 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r5 != r8) goto L_0x00f9
            com.tencent.mm.booter.g0 r8 = r1.f194713d     // Catch:{ Exception -> 0x0114 }
            int r14 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId     // Catch:{ Exception -> 0x0114 }
            int r15 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x0114 }
            android.content.Context r8 = r8.f79263a     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ Exception -> 0x0114 }
            android.content.SharedPreferences r6 = r8.getSharedPreferences(r6, r10)     // Catch:{ Exception -> 0x0114 }
            android.content.SharedPreferences$Editor r8 = r6.edit()     // Catch:{ Exception -> 0x0114 }
            android.content.SharedPreferences$Editor r8 = r8.putInt(r9, r14)     // Catch:{ Exception -> 0x0114 }
            r8.commit()     // Catch:{ Exception -> 0x0114 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ Exception -> 0x0114 }
            android.content.SharedPreferences$Editor r6 = r6.putInt(r11, r15)     // Catch:{ Exception -> 0x0114 }
            r6.commit()     // Catch:{ Exception -> 0x0114 }
        L_0x00f9:
            java.lang.String r6 = "report FIN time:%d resp:%d url[%s]"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0114 }
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0114 }
            r0[r10] = r2     // Catch:{ Exception -> 0x0114 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0114 }
            r0[r13] = r2     // Catch:{ Exception -> 0x0114 }
            r2 = 2
            r0[r2] = r4     // Catch:{ Exception -> 0x0114 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r0)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0126
        L_0x0114:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r3, r2)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r10] = r4
            java.lang.String r2 = "tryReport error url[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r0)
        L_0x0126:
            if (r12 == 0) goto L_0x012b
            r12.disconnect()
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.C67835f0.run():void");
    }
}
