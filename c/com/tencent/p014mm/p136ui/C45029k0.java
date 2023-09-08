package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.autogen.events.QueryGameMessageEvent;

/* renamed from: com.tencent.mm.ui.k0 */
public class C45029k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ QueryGameMessageEvent f122125d;

    /* renamed from: e */
    public final /* synthetic */ String f122126e;

    /* renamed from: f */
    public final /* synthetic */ FindMoreFriendsUI f122127f;

    public C45029k0(FindMoreFriendsUI findMoreFriendsUI, QueryGameMessageEvent queryGameMessageEvent, String str) {
        this.f122127f = findMoreFriendsUI;
        this.f122125d = queryGameMessageEvent;
        this.f122126e = str;
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r31 = this;
            r0 = r31
            java.lang.Class<ym.l> r1 = p763ym.C79138l.class
            com.tencent.mm.ui.FindMoreFriendsUI r11 = r0.f122127f
            com.tencent.mm.autogen.events.QueryGameMessageEvent r12 = r0.f122125d
            java.lang.String r13 = r0.f122126e
            com.tencent.mm.ui.base.preference.a r2 = r11.f55702t
            java.lang.String r3 = "more_tab_game_recommend"
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r3)
            r14 = r2
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference r14 = (com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference) r14
            if (r14 != 0) goto L_0x0019
            goto L_0x02ad
        L_0x0019:
            r14.mo96252c0()
            r15 = 0
            r11.f55669D = r15
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r12.f107710d
            long r9 = r2.f107719i
            r8 = 2
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2[r15] = r3
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r3 = r12.f107710d
            int r3 = r3.f107711a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7 = 1
            r2[r7] = r3
            java.lang.String r6 = "MicroMsg.FindMoreFriendsUI"
            java.lang.String r3 = "gamelog.reddot, finder, update, gamemsg | msgid:%d | showType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r2)
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r12.f107710d
            int r2 = r2.f107711a
            r3 = 5
            r4 = 4
            r5 = 3
            if (r2 == r7) goto L_0x0052
            if (r2 == r8) goto L_0x0052
            if (r2 == r5) goto L_0x0052
            if (r2 == r4) goto L_0x0052
            if (r2 != r3) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r2 = 0
            goto L_0x0053
        L_0x0052:
            r2 = 1
        L_0x0053:
            boolean r2 = r14.mo64138m(r2)
            if (r2 == 0) goto L_0x005b
            goto L_0x02ad
        L_0x005b:
            java.lang.Boolean r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45380n()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0091
            java.lang.Class<sw1.p> r1 = sw1.C48483p.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sw1.p r1 = (sw1.C48483p) r1
            com.tencent.mm.plugin.game.model.a0 r1 = r1.mo66079ar()
            com.tencent.mm.plugin.game.model.a0$a r2 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_EXPOSURE_SILENT
            r1.mo65977f(r2)
            r4 = 8
            r5 = 8
            r1 = 8
            r7 = 0
            r8 = 8
            r9 = 8
            r10 = 8
            r2 = r11
            r3 = r14
            r11 = r6
            r6 = r1
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = "gamelog.reddot, finder, update, gamemsg handleUpdateGame but in silenceMode."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            goto L_0x02ad
        L_0x0091:
            r2 = 8
            r14.mo96250V(r2)
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r12.f107710d
            int r5 = r2.f107711a
            if (r5 != r7) goto L_0x00e0
            r1 = 2131821611(0x7f11042b, float:1.927597E38)
            java.lang.String r1 = r11.getString(r1)
            r2 = 2131234251(0x7f080dcb, float:1.8084662E38)
            r14.f215054P = r1
            r14.f215055Q = r2
            r4 = 0
            r5 = 8
            r1 = 8
            r16 = 0
            r17 = 8
            r18 = 8
            r19 = 8
            r2 = r11
            r3 = r14
            r15 = 3
            r20 = r6
            r6 = r1
            r1 = 1
            r7 = r16
            r15 = 2
            r8 = r17
            r21 = r9
            r9 = r18
            r10 = r19
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r12.f107710d
            int r2 = r2.f107711a
            r9 = r21
            r11.mo25930z0(r9, r2, r13)
            r11.mo25926v0(r1)
            com.tencent.mm.plugin.newtips.model.n r2 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_NEW
            r14.mo64136k(r2, r1)
            r15 = 1
            goto L_0x024a
        L_0x00e0:
            r20 = r6
            r8 = 1
            r15 = 2
            java.lang.String r6 = "#8c8c8c"
            r7 = -1
            if (r5 != r15) goto L_0x0135
            java.lang.String r3 = r2.f107713c
            java.lang.String r2 = r2.f107712b
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x00f4
            goto L_0x0102
        L_0x00f4:
            di3.d r1 = di3.C86312j.m106911c(r1)
            ym.l r1 = (p763ym.C79138l) r1
            android.app.Activity r3 = r11.getContext()
            java.lang.String r3 = r1.mo74012l5(r3, r2)
        L_0x0102:
            int r1 = android.graphics.Color.parseColor(r6)
            r14.mo101939Y(r3, r7, r1)
            r4 = 8
            r5 = 8
            r6 = 0
            r7 = 1
            r1 = 8
            r16 = 8
            r17 = 8
            r2 = r11
            r3 = r14
            r15 = 1
            r8 = r1
            r23 = r9
            r9 = r16
            r10 = r17
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r12.f107710d
            int r1 = r1.f107711a
            r9 = r23
            r11.mo25930z0(r9, r1, r13)
            r11.mo25926v0(r15)
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE
            r14.mo64136k(r1, r15)
            goto L_0x024a
        L_0x0135:
            r8 = 3
            r15 = 1
            if (r5 != r8) goto L_0x0186
            java.lang.String r2 = r2.f107714d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x016e
            di3.d r1 = di3.C86312j.m106911c(r1)
            ym.l r1 = (p763ym.C79138l) r1
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r12.f107710d
            java.lang.String r2 = r2.f107712b
            android.app.Activity r3 = r11.getContext()
            float r3 = kg3.C76577a.m92156g(r3)
            android.graphics.Bitmap r1 = r1.mo74018ub(r2, r15, r3)
            r14.mo101930L(r1)
            r4 = 8
            r5 = 8
            r6 = 8
            r7 = 0
            r8 = 0
            r1 = 0
            r13 = 0
            r2 = r11
            r3 = r14
            r25 = r9
            r9 = r1
            r10 = r13
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x017a
        L_0x016e:
            r25 = r9
            java.lang.String r6 = ""
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r12
            r7 = r13
            r2.mo25900d0(r3, r4, r5, r6, r7)
        L_0x017a:
            r11.mo25926v0(r15)
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON
            r14.mo64136k(r1, r15)
            r9 = r25
            goto L_0x024a
        L_0x0186:
            r25 = r9
            if (r5 != r4) goto L_0x0222
            java.lang.String r3 = r2.f107713c
            java.lang.String r2 = r2.f107712b
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0196
            r8 = r3
            goto L_0x01a5
        L_0x0196:
            di3.d r3 = di3.C86312j.m106911c(r1)
            ym.l r3 = (p763ym.C79138l) r3
            android.app.Activity r4 = r11.getContext()
            java.lang.String r2 = r3.mo74012l5(r4, r2)
            r8 = r2
        L_0x01a5:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r2 != 0) goto L_0x01ff
            int r2 = android.graphics.Color.parseColor(r6)
            r14.mo101939Y(r8, r7, r2)
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r12.f107710d
            java.lang.String r2 = r2.f107714d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x01ed
            di3.d r1 = di3.C86312j.m106911c(r1)
            ym.l r1 = (p763ym.C79138l) r1
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r12.f107710d
            java.lang.String r2 = r2.f107712b
            android.app.Activity r3 = r11.getContext()
            float r3 = kg3.C76577a.m92156g(r3)
            android.graphics.Bitmap r1 = r1.mo74018ub(r2, r15, r3)
            r14.mo101930L(r1)
            r4 = 8
            r5 = 8
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r11
            r3 = r14
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r12.f107710d
            int r1 = r1.f107711a
            r9 = r25
            r11.mo25930z0(r9, r1, r13)
            goto L_0x01f8
        L_0x01ed:
            r9 = r25
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r12
            r6 = r8
            r7 = r13
            r2.mo25900d0(r3, r4, r5, r6, r7)
        L_0x01f8:
            r11.mo25926v0(r15)
            r27 = r9
            r7 = 1
            goto L_0x021a
        L_0x01ff:
            r9 = r25
            r11.f55667B = r15
            r4 = 8
            r5 = 8
            r6 = 8
            r7 = 0
            r8 = 8
            r1 = 8
            r13 = 8
            r2 = r11
            r3 = r14
            r27 = r9
            r9 = r1
            r10 = r13
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            r7 = 0
        L_0x021a:
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON
            r14.mo64136k(r1, r15)
            r29 = r27
            goto L_0x026d
        L_0x0222:
            r27 = r25
            if (r5 != r3) goto L_0x024e
            r11.f55667B = r15
            r4 = 8
            r5 = 0
            r6 = 8
            r7 = 0
            r8 = 8
            r9 = 8
            r10 = 8
            r2 = r11
            r3 = r14
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r12.f107710d
            int r1 = r1.f107711a
            r9 = r27
            r11.mo25930z0(r9, r1, r13)
            r11.mo25926v0(r15)
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT
            r14.mo64136k(r1, r15)
        L_0x024a:
            r29 = r9
            r7 = 1
            goto L_0x026d
        L_0x024e:
            r9 = r27
            r11.f55667B = r15
            r4 = 8
            r5 = 8
            r6 = 8
            r7 = 0
            r8 = 8
            r1 = 8
            r13 = 8
            r2 = r11
            r3 = r14
            r29 = r9
            r9 = r1
            r10 = r13
            r2.mo25872C0(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.mo25926v0(r1)
            r7 = 0
        L_0x026d:
            if (r7 == 0) goto L_0x02ad
            com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent r1 = new com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent
            r1.<init>()
            com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent$a r2 = r1.f107753d
            r3 = r29
            r2.f107754a = r3
            r2.f107755b = r15
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r5 = r12.f107710d
            int r5 = r5.f107724n
            r2.f107756c = r5
            boolean r5 = r11.f55673H
            r2.f107757d = r5
            r1.publish()
            r1 = 0
            r11.f55673H = r1
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r1] = r3
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r12.f107710d
            int r1 = r1.f107711a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r15] = r1
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r12.f107710d
            java.lang.String r1 = r1.f107713c
            r3 = 2
            r2[r3] = r1
            java.lang.String r1 = "gamelog.reddot, finder, update, gamemsg finish | msgid:%d | showType:%d | title:%s"
            r3 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C45029k0.run():void");
    }
}
