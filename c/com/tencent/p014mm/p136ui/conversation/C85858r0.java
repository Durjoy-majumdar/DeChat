package com.tencent.p014mm.p136ui.conversation;

/* renamed from: com.tencent.mm.ui.conversation.r0 */
public class C85858r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ InitHelper f250074d;

    public C85858r0(InitHelper initHelper) {
        this.f250074d = initHelper;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r26 = this;
            r1 = r26
            com.tencent.mm.ui.conversation.InitHelper r2 = r1.f250074d
            r2.getClass()
            java.lang.Class<m13.b> r0 = m13.C88689b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            m13.b r0 = (m13.C88689b) r0
            r0.mo122763ta()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "tinker_patch_share_config"
            r4 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r4)
            java.lang.String r5 = "tinker-boots-install-info"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.getString(r5, r6)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r7 = 0
            java.lang.String r8 = "MicroMsg.UpdateUtil"
            if (r5 != 0) goto L_0x004e
            te3.rg4 r5 = new te3.rg4     // Catch:{ Exception -> 0x0042 }
            r5.<init>()     // Catch:{ Exception -> 0x0042 }
            byte[] r0 = android.util.Base64.decode(r0, r7)     // Catch:{ Exception -> 0x0040 }
            pe3.a r0 = r5.parseFrom(r0)     // Catch:{ Exception -> 0x0040 }
            te3.rg4 r0 = (te3.rg4) r0     // Catch:{ Exception -> 0x0040 }
            goto L_0x004f
        L_0x0040:
            r0 = move-exception
            goto L_0x0044
        L_0x0042:
            r0 = move-exception
            r5 = 0
        L_0x0044:
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r10 = "parse tinker install failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r10, r9)
            r0 = r5
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            goto L_0x0059
        L_0x0052:
            java.lang.String r0 = "update info is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r0 = 0
        L_0x0059:
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.SharedPreferences r3 = r9.getSharedPreferences(r3, r4)
            java.lang.String r9 = "tinker-boots-last-show"
            r10 = 0
            long r12 = r3.getLong(r9, r10)
            java.lang.String r9 = "tinker-boots-show-time"
            int r3 = r3.getInt(r9, r7)
            long r14 = java.lang.System.currentTimeMillis()
            di3.d r9 = di3.C86312j.m106911c(r5)
            h81.h r9 = (h81.C32735h) r9
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_upgrade_interval_show_time
            r11 = 1
            int r9 = r9.mo58779Qe(r10, r11)
            r10 = 6
            if (r0 == 0) goto L_0x00a5
            int r6 = r0.f259813x
            if (r6 <= r11) goto L_0x00a5
            if (r6 >= r10) goto L_0x00a5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "isNeedShowTinkerDialog, dialogInfo.showDialogMaxTimes = "
            r6.append(r9)
            int r9 = r0.f259813x
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            int r9 = r0.f259813x
        L_0x00a5:
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_upgrade_dialog_interval_hour
            int r5 = r5.mo58779Qe(r6, r10)
            long r5 = (long) r5
            r16 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 * r16
            r4 = 2
            if (r0 == 0) goto L_0x0102
            int r11 = r0.f259814y
            if (r11 <= r10) goto L_0x0102
            r10 = 72
            if (r11 >= r10) goto L_0x0102
            java.lang.Class<xn.i> r5 = p271xn.C91295i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            xn.i r5 = (p271xn.C91295i) r5
            boolean r5 = r5.mc0()
            if (r5 == 0) goto L_0x00e0
            java.lang.Class<xn.n> r5 = p271xn.C91298n.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            xn.n r5 = (p271xn.C91298n) r5
            boolean r5 = r5.mo125106Yz()
            if (r5 == 0) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r10 = r0.f259814y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r7] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            r11 = 1
            r6[r11] = r10
            java.lang.String r10 = "isNeedShowTinkerDialog, dialogInfo.showDialogIntervalTime = %s, isForceDialogShowTobeMinute = %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r6)
            int r6 = r0.f259814y
            long r10 = (long) r6
            if (r5 != 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r16 = 60000(0xea60, double:2.9644E-319)
        L_0x0100:
            long r5 = r10 * r16
        L_0x0102:
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r10[r7] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            r16 = 1
            r10[r16] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r10[r4] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r7 = 3
            r10[r7] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r17 = 4
            r10[r17] = r11
            java.lang.String r11 = "isNeedShowTinkerDialog now:%d last:%d time:%d showTimes:%d, next_time_show: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r11, r10)
            long r14 = r14 - r12
            int r10 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0136
            if (r3 >= r9) goto L_0x0136
            r3 = 1
            goto L_0x0137
        L_0x0136:
            r3 = 0
        L_0x0137:
            java.lang.String r5 = "MicroMsg.InitHelper"
            if (r3 == 0) goto L_0x0150
            if (r0 == 0) goto L_0x0150
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.ui.conversation.q0 r4 = new com.tencent.mm.ui.conversation.q0
            r4.<init>(r2, r0)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183875f(r4)
            java.lang.String r0 = "have tinker update."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0265
        L_0x0150:
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.ui.f2 r6 = new com.tencent.mm.ui.f2
            r6.<init>(r0)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r0 = "Thread-checkHasUpdateApkForReset"
            r3.mo183876g(r6, r0)
            android.app.Activity r0 = r2.f219447o
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "update_config_prefs"
            r9 = 4
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r6, r9)
            java.lang.String r10 = "update_downloaded_pack_md5_key"
            r11 = 0
            java.lang.String r3 = r3.getString(r10, r11)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r6, r9)
            java.lang.String r9 = "update_downloaded_pack_update_type"
            int r7 = r10.getInt(r9, r7)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r10 = 0
            r9[r10] = r3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r11 = 1
            r9[r11] = r10
            java.lang.String r10 = "MicroMsg.MMErrorProcessor"
            java.lang.String r11 = "installRequired %s, updateType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r9 != 0) goto L_0x0218
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 4
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r6, r11)
            java.lang.String r11 = "update_downloaded_cancel_ts"
            r12 = 0
            long r14 = r9.getLong(r11, r12)
            java.lang.String r11 = "update_downloaded_cancel_times"
            r12 = 0
            int r9 = r9.getInt(r11, r12)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r11[r12] = r13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r13 = 1
            r11[r13] = r12
            java.lang.String r12 = "checkIgnoreDownloadedPack last: %s times: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r11)
            long[] r11 = com.tencent.p014mm.pluginsdk.platformtools.C30689g.f82581a
            if (r9 <= r4) goto L_0x01cf
            goto L_0x0207
        L_0x01cf:
            r12 = r11[r9]
            long r18 = java.lang.System.currentTimeMillis()
            long r18 = r18 - r14
            int r4 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x01dd
            r11 = 0
            goto L_0x0208
        L_0x01dd:
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r14
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0207
            java.lang.String r4 = "user modify mobile time. we just remove the config."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r4)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 4
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r6, r9)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            android.content.SharedPreferences$Editor r4 = r4.clear()
            r4.commit()
            java.lang.String r4 = "clearUpdateConfigPrefs"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
        L_0x0207:
            r11 = 1
        L_0x0208:
            if (r11 != 0) goto L_0x0218
            com.tencent.mm.sdk.platformtools.MMHandlerThread r4 = f40.C86709a0.m107525e()
            com.tencent.mm.ui.h2 r6 = new com.tencent.mm.ui.h2
            r6.<init>(r7, r3, r0)
            r4.postToWorker(r6)
            r11 = 1
            goto L_0x0219
        L_0x0218:
            r11 = 0
        L_0x0219:
            if (r11 == 0) goto L_0x022f
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 405(0x195, double:2.0E-321)
            r21 = 41
            r23 = 1
            r25 = 1
            r18.idkeyStat(r19, r21, r23, r25)
            java.lang.String r0 = "we got a install"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            goto L_0x0265
        L_0x022f:
            android.app.Activity r0 = r2.f219447o
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.ui.e2 r4 = new com.tencent.mm.ui.e2
            r4.<init>(r0)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r0 = "Thread-checkUnfinishSilenceDownload"
            r3.mo183876g(r4, r0)
            android.app.Activity r0 = r2.f219447o
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r3 = com.tencent.p014mm.p136ui.C74785j2.f219907a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "checkXkeyUpdateUrl, hasShownXkeyUrlUpdateDialog = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            boolean r2 = com.tencent.p014mm.p136ui.C74785j2.f219907a
            if (r2 == 0) goto L_0x0257
            goto L_0x0265
        L_0x0257:
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.ui.g2 r3 = new com.tencent.mm.ui.g2
            r3.<init>(r0)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r0 = "Thread-checkXkeyUpdateUrl"
            r2.mo183876g(r3, r0)
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C85858r0.run():void");
    }
}
