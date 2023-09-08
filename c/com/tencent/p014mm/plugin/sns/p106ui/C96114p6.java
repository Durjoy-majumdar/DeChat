package com.tencent.p014mm.plugin.sns.p106ui;

import nj3.C11182m0;

/* renamed from: com.tencent.mm.plugin.sns.ui.p6 */
public class C96114p6 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f280725d;

    public C96114p6(SnsTimeLineUI snsTimeLineUI) {
        this.f280725d = snsTimeLineUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a9, code lost:
        if (r12 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bb, code lost:
        if (((ht1.C60200t1) di3.C86312j.m106911c(ht1.C60200t1.class)).mo76879tO() != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
        r8 = new nj3.C76875f0(r3, 6, 0);
        r12 = com.tencent.p014mm.C0966R.string.c39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c8, code lost:
        if (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278612U1 != 1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ca, code lost:
        r12 = com.tencent.p014mm.C0966R.string.c38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cd, code lost:
        r8.f224717i = r3.getString(r12);
        r7.add(r8);
        com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278613V1 = 1;
        r3.f278652R1 = eb0.C31543z5.m39453c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e0, code lost:
        if (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278612U1 != 2) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e2, code lost:
        r8 = f40.C86709a0.m107535s().mo121142i();
        r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_JUMP_FINDER_POST_EXPOSE_COUNT_INT_SYNC;
        f40.C86709a0.m107535s().mo121142i().mo119677K(r12, java.lang.Integer.valueOf(((java.lang.Integer) r8.mo119685f(r12, 0)).intValue() + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateMMMenu(nj3.C76874e0 r18) {
        /*
            r17 = this;
            java.lang.String r0 = "onCreateMMMenu"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$66"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r18.clear()
            r2 = r17
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r3 = r2.f280725d
            java.lang.Boolean r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278611T1
            java.lang.String r4 = "access$5400"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r3.getClass()
            java.lang.String r6 = "initMenuItems"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r8 = sf0.C90188n0.f258933a
            nj3.f0 r8 = new nj3.f0
            r9 = 3
            r10 = 0
            r8.<init>(r3, r9, r10)
            r9 = 2131821498(0x7f1103ba, float:1.927574E38)
            java.lang.String r9 = r3.getString(r9)
            r8.f224717i = r9
            androidx.appcompat.app.AppCompatActivity r9 = r3.getContext()
            r11 = 2131821504(0x7f1103c0, float:1.9275753E38)
            java.lang.String r9 = r9.getString(r11)
            r8.f224721p = r9
            r7.add(r8)
            nj3.f0 r8 = new nj3.f0
            r9 = 1
            r8.<init>(r3, r9, r10)
            r11 = 2131821508(0x7f1103c4, float:1.9275761E38)
            java.lang.String r11 = r3.getString(r11)
            r8.f224717i = r11
            r7.add(r8)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r8 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MomentChannels
            boolean r8 = r8.banned()
            r11 = 2
            if (r8 != 0) goto L_0x010a
            int r8 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278612U1
            if (r8 != r9) goto L_0x00ab
            java.lang.String r8 = "checkFinderExposeCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            int r12 = r3.mo132955r8()
            f40.C86709a0.m107528h()
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_FINDER_EXPOSE_COUNT_INT_SYNC
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            java.lang.Object r13 = r13.mo119685f(r14, r15)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 < r12) goto L_0x0092
            r15 = -1
            if (r12 != r15) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r12 = 0
            goto L_0x00a6
        L_0x0092:
            f40.C86709a0.m107528h()
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            int r13 = r13 + r9
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.mo119677K(r14, r13)
            r12 = 1
        L_0x00a6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            if (r12 != 0) goto L_0x00bd
        L_0x00ab:
            int r8 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278612U1
            if (r8 != r11) goto L_0x010a
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ht1.t1 r8 = (ht1.C60200t1) r8
            boolean r8 = r8.mo76879tO()
            if (r8 == 0) goto L_0x010a
        L_0x00bd:
            nj3.f0 r8 = new nj3.f0
            r12 = 6
            r8.<init>(r3, r12, r10)
            r12 = 2131824804(0x7f1110a4, float:1.9282446E38)
            int r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278612U1
            if (r13 != r9) goto L_0x00cd
            r12 = 2131824803(0x7f1110a3, float:1.9282444E38)
        L_0x00cd:
            java.lang.String r12 = r3.getString(r12)
            r8.f224717i = r12
            r7.add(r8)
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278613V1 = r9
            long r12 = eb0.C31543z5.m39453c()
            r3.f278652R1 = r12
            int r8 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278612U1
            if (r8 != r11) goto L_0x010a
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_JUMP_FINDER_POST_EXPOSE_COUNT_INT_SYNC
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            java.lang.Object r8 = r8.mo119685f(r12, r13)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            int r8 = r8 + r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.mo119677K(r12, r8)
        L_0x010a:
            int r8 = com.tencent.p014mm.plugin.sns.model.C5431p1.f21134a
            java.lang.String r8 = "checkWeishiExposeCount"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.model.SnsLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r12)
            f40.C86709a0.m107528h()
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEISHI_EXPOSE_COUNT_INT_SYNC
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            java.lang.Object r13 = r13.mo119685f(r14, r15)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            r11[r10] = r15
            int r15 = com.tencent.p014mm.plugin.sns.model.C5431p1.f21134a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r11[r9] = r16
            java.lang.String r10 = "MicroMsg.SnsLogic"
            java.lang.String r9 = "checkWeishiExposeCount now=%d limit=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r11)
            if (r13 >= r15) goto L_0x015d
            f40.C86709a0.m107528h()
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            r10 = 1
            int r13 = r13 + r10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r9.mo119677K(r14, r11)
            r9 = 1
            goto L_0x015f
        L_0x015d:
            r10 = 1
            r9 = 0
        L_0x015f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r12)
            if (r9 == 0) goto L_0x0189
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r8 = r3.f278668Z
            r8.f278723a = r10
            nj3.f0 r8 = new nj3.f0
            r9 = 4
            r10 = 0
            r8.<init>(r3, r9, r10)
            r9 = 2131821527(0x7f1103d7, float:1.92758E38)
            java.lang.String r9 = r3.getString(r9)
            r8.f224717i = r9
            androidx.appcompat.app.AppCompatActivity r9 = r3.getContext()
            r11 = 2131821528(0x7f1103d8, float:1.9275802E38)
            java.lang.String r9 = r9.getString(r11)
            r8.f224721p = r9
            r7.add(r8)
            goto L_0x018e
        L_0x0189:
            r10 = 0
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r8 = r3.f278668Z
            r8.f278723a = r10
        L_0x018e:
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_home_to_ponenix_enable
            boolean r8 = r8.mo58784wf(r9, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "SecondCutEntrance: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.SecondCutConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            if (r8 == 0) goto L_0x01ca
            r8 = 1
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278614W1 = r8
            nj3.f0 r8 = new nj3.f0
            r9 = 7
            r10 = 0
            r8.<init>(r3, r9, r10)
            r9 = 2131824815(0x7f1110af, float:1.9282469E38)
            java.lang.String r3 = r3.getString(r9)
            r8.f224717i = r3
            r7.add(r8)
        L_0x01ca:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.util.Iterator r3 = r7.iterator()
        L_0x01d4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e6
            java.lang.Object r4 = r3.next()
            nj3.f0 r4 = (nj3.C76875f0) r4
            r5 = r18
            r5.mo107174t(r4)
            goto L_0x01d4
        L_0x01e6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96114p6.onCreateMMMenu(nj3.e0):void");
    }
}
