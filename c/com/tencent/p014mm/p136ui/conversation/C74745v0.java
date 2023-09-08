package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.p136ui.conversation.MainUI;

/* renamed from: com.tencent.mm.ui.conversation.v0 */
public class C74745v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Integer f219791d;

    /* renamed from: e */
    public final /* synthetic */ MainUI.C74661j f219792e;

    public C74745v0(MainUI.C74661j jVar, Integer num) {
        this.f219792e = jVar;
        this.f219791d = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        r8 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.conversation.MainUI$j r2 = r14.f219792e
            long r3 = r2.f219499d
            long r3 = r0 - r3
            r6 = 1
            r7 = 3000(0xbb8, double:1.482E-320)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0016
            int r3 = r2.f219500e
            if (r3 < 0) goto L_0x0016
            goto L_0x002e
        L_0x0016:
            com.tencent.mm.ui.conversation.MainUI r2 = com.tencent.p014mm.p136ui.conversation.MainUI.this
            com.tencent.mm.ui.conversation.ConversationListView r2 = r2.f219476o
            int r2 = r2.getFirstVisiblePosition()
            com.tencent.mm.ui.conversation.MainUI$j r3 = r14.f219792e
            com.tencent.mm.ui.conversation.MainUI r3 = com.tencent.p014mm.p136ui.conversation.MainUI.this
            com.tencent.mm.ui.conversation.ConversationListView r3 = r3.f219476o
            int r3 = r3.getHeaderViewsCount()
            int r2 = r2 - r3
            int r3 = r2 + 1
            if (r3 >= 0) goto L_0x002e
            r3 = 0
        L_0x002e:
            com.tencent.mm.ui.conversation.MainUI$j r2 = r14.f219792e
            com.tencent.mm.ui.conversation.MainUI r2 = com.tencent.p014mm.p136ui.conversation.MainUI.this
            com.tencent.mm.ui.conversation.p r2 = r2.f219483v
            int r4 = com.tencent.p014mm.p136ui.conversation.ConversationUnreadHelper.m89354b()
            if (r4 <= 0) goto L_0x003c
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            int r7 = r2.getCount()
            r8 = -1
            r9 = 2
            if (r7 > 0) goto L_0x0046
            goto L_0x0071
        L_0x0046:
            int r10 = r3 + 1
            int r10 = r10 % r7
            int r10 = java.lang.Math.abs(r10)
        L_0x004d:
            if (r10 == r3) goto L_0x0071
            ai3.a r11 = r2.getItem(r10)
            com.tencent.mm.storage.h2 r11 = (com.tencent.p014mm.storage.C72976h2) r11
            if (r11 == 0) goto L_0x006d
            int r12 = r11.mo108786G2()
            if (r12 > 0) goto L_0x0063
            int r12 = r11.mo108788I2()
            if (r12 <= 0) goto L_0x006d
        L_0x0063:
            if (r4 == 0) goto L_0x006b
            int r11 = r2.mo103883J(r11)
            if (r11 != r9) goto L_0x006d
        L_0x006b:
            r8 = r10
            goto L_0x0071
        L_0x006d:
            int r10 = r10 + 1
            int r10 = r10 % r7
            goto L_0x004d
        L_0x0071:
            if (r8 >= 0) goto L_0x0081
            com.tencent.mm.ui.conversation.MainUI$j r2 = r14.f219792e
            com.tencent.mm.ui.conversation.MainUI r4 = com.tencent.p014mm.p136ui.conversation.MainUI.this
            com.tencent.mm.ui.conversation.ConversationListView r4 = r4.f219476o
            int r4 = r4.getHeaderViewsCount()
            com.tencent.p014mm.p136ui.conversation.MainUI.C74661j.m89410a(r2, r4)
            goto L_0x008f
        L_0x0081:
            com.tencent.mm.ui.conversation.MainUI$j r2 = r14.f219792e
            com.tencent.mm.ui.conversation.MainUI r4 = com.tencent.p014mm.p136ui.conversation.MainUI.this
            com.tencent.mm.ui.conversation.ConversationListView r4 = r4.f219476o
            int r4 = r4.getHeaderViewsCount()
            int r4 = r4 + r8
            com.tencent.p014mm.p136ui.conversation.MainUI.C74661j.m89410a(r2, r4)
        L_0x008f:
            com.tencent.mm.ui.conversation.MainUI$j r2 = r14.f219792e
            r2.f219499d = r0
            if (r8 >= 0) goto L_0x0097
            r0 = 0
            goto L_0x0098
        L_0x0097:
            r0 = r8
        L_0x0098:
            r2.f219500e = r0
            com.tencent.mm.ui.conversation.MainUI r0 = com.tencent.p014mm.p136ui.conversation.MainUI.this
            com.tencent.mm.ui.conversation.p r0 = r0.f219483v
            ai3.a r0 = r0.getItem(r8)
            com.tencent.mm.storage.h2 r0 = (com.tencent.p014mm.storage.C72976h2) r0
            java.lang.String r1 = ""
            r10 = 8
            r12 = 2
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = r0.getUsername()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x00b8
            goto L_0x011f
        L_0x00b8:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85841l5(r0)
            if (r2 == 0) goto L_0x00c1
            r10 = 3
            goto L_0x011f
        L_0x00c1:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85840k5(r0)
            if (r2 == 0) goto L_0x00ca
            r10 = 5
            goto L_0x011f
        L_0x00ca:
            boolean r2 = eb0.C45628s0.m50751P(r0)
            if (r2 != 0) goto L_0x011b
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85795C5(r0)
            if (r2 != 0) goto L_0x011b
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85826X5(r0)
            if (r2 != 0) goto L_0x011b
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_minishop_plugin_enabled
            int r2 = r2.mo58779Qe(r4, r6)
            if (r6 != r2) goto L_0x00f3
            boolean r2 = eb0.C45628s0.m50744I(r0)
            if (r2 == 0) goto L_0x00f3
            goto L_0x011b
        L_0x00f3:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85806K4(r0)
            if (r2 == 0) goto L_0x00fc
            r10 = 6
            goto L_0x011f
        L_0x00fc:
            java.lang.String r2 = "gh_"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0107
            r10 = 7
            goto L_0x011f
        L_0x0107:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85845p5(r0)
            if (r2 == 0) goto L_0x0110
            r10 = 9
            goto L_0x011f
        L_0x0110:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r2 == 0) goto L_0x0118
            r10 = r12
            goto L_0x011f
        L_0x0118:
            r10 = 1
            goto L_0x011f
        L_0x011b:
            r10 = 4
            goto L_0x011f
        L_0x011e:
            r0 = r1
        L_0x011f:
            java.lang.Integer r2 = r14.f219791d
            int r2 = r2.intValue()
            long r5 = (long) r2
            com.tencent.mm.autogen.mmdata.rpt.DoubleClickWechatReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.DoubleClickWechatReportStruct
            r2.<init>()
            r2.f194195d = r12
            r2.f194196e = r5
            r2.f194197f = r10
            java.lang.String r5 = "UserName"
            r6 = 1
            java.lang.String r5 = r2.mo86045b(r5, r0, r6)
            r2.f194198g = r5
            r2.mo86054n()
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mm.ui.conversation.MainUI$j r5 = r14.f219792e
            com.tencent.mm.ui.conversation.MainUI r5 = com.tencent.p014mm.p136ui.conversation.MainUI.this
            com.tencent.mm.ui.conversation.ConversationListView r5 = r5.f219476o
            int r5 = r5.getHeaderViewsCount()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r2[r4] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2[r9] = r3
            r3 = 3
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r2[r3] = r4
            r3 = 4
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)
            r2[r3] = r0
            java.lang.String r0 = "MicroMsg.MainUI"
            java.lang.String r1 = "headerCount %d, scroll from %d to %d, type:%s, usr:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C74745v0.run():void");
    }
}
