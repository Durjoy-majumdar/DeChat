package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.account.ui.o2 */
public class C115148o2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RegAffiliateAccountUI f345185d;

    public C115148o2(RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f345185d = regAffiliateAccountUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$7"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r11
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 23530(0x5bea, float:3.2973E-41)
            r1 = 8
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI r3 = r11.f345185d
            java.lang.String r3 = r3.f344799q
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = p156gj.C87203t.m108273i()
            r5 = 1
            r2[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r6 = 2
            r2[r6] = r3
            r3 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r3] = r6
            r3 = 4
            r6 = 1006(0x3ee, float:1.41E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r3] = r6
            r3 = 5
            r6 = 10601(0x2969, float:1.4855E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r3] = r6
            r3 = 6
            r6 = 0
            r2[r3] = r6
            r3 = 7
            com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI r6 = r11.f345185d
            int r6 = r6.f344797o
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r3] = r6
            r12.mo160131h(r0, r2)
            com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI r12 = r11.f345185d
            com.tencent.mm.ui.widget.MMClearEditText r0 = r12.f344791f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.tencent.mm.ui.widget.MMClearEditText r2 = r12.f344792g
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x0081
        L_0x007f:
            r12 = 0
            goto L_0x00cd
        L_0x0081:
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x008d
            qg0.a$a r0 = qg0.C12215a.C12216a.TwoPasswordsNotMatch
            r12.mo174735I7(r0)
            goto L_0x007f
        L_0x008d:
            int r2 = r0.length()
            r3 = 16
            if (r2 <= r3) goto L_0x009b
            qg0.a$a r0 = qg0.C12215a.C12216a.BeyondMaximumLength
            r12.mo174735I7(r0)
            goto L_0x007f
        L_0x009b:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isChinese((java.lang.String) r0)
            if (r2 == 0) goto L_0x00ab
            r0 = 2131834557(0x7f1136bd, float:1.9302228E38)
            r1 = 2131834594(0x7f1136e2, float:1.9302303E38)
            nj3.C76879j.m92738i(r12, r0, r1)
            goto L_0x007f
        L_0x00ab:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isValidPassword(r0)
            if (r2 != 0) goto L_0x00c9
            int r2 = r0.length()
            if (r2 < r1) goto L_0x00c3
            int r0 = r0.length()
            if (r0 >= r3) goto L_0x00c3
            qg0.a$a r0 = qg0.C12215a.C12216a.DisallowShortNumericPassword
            r12.mo174735I7(r0)
            goto L_0x007f
        L_0x00c3:
            qg0.a$a r0 = qg0.C12215a.C12216a.NotReachMinimumLength
            r12.mo174735I7(r0)
            goto L_0x007f
        L_0x00c9:
            r12.hideVKB()
            r12 = 1
        L_0x00cd:
            if (r12 == 0) goto L_0x0148
            com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI r12 = r11.f345185d
            r12.getClass()
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r1 = 6413(0x190d, float:8.987E-42)
            r0.f127069d = r1
            java.lang.String r1 = "/cgi-bin/micromsg-bin/regaffiliatedacct"
            r0.f127068c = r1
            te3.fq3 r1 = new te3.fq3
            r1.<init>()
            java.lang.String r2 = r12.f344800r
            r1.f183204d = r2
            java.lang.String r2 = "CN"
            r1.f183209i = r2
            com.tencent.mm.ui.widget.MMClearEditText r2 = r12.f344791f
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
            r1.f183205e = r2
            java.lang.String r2 = r12.f344801s
            if (r2 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r5 = 0
        L_0x0108:
            r1.f183206f = r5
            r1.f183207g = r2
            java.lang.String r2 = r12.f344802t
            r1.f183208h = r2
            java.lang.String r2 = r12.f344798p
            r1.f183210j = r2
            int r2 = r12.f344797o
            r1.f183212o = r2
            r0.f127066a = r1
            te3.gq3 r2 = new te3.gq3
            r2.<init>()
            r0.f127067b = r2
            androidx.appcompat.app.AppCompatActivity r5 = r12.getContext()
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r6 = r12.getString(r2)
            r2 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r7 = r12.getString(r2)
            r8 = 1
            r9 = 1
            r10 = 0
            qo3.i0 r2 = nj3.C76879j.m92723Q(r5, r6, r7, r8, r9, r10)
            r12.f344796n = r2
            ob0.c r0 = r0.mo72403a()
            com.tencent.mm.plugin.account.ui.p2 r2 = new com.tencent.mm.plugin.account.ui.p2
            r2.<init>(r12, r1)
            ob0.C89144l0.m111429e(r0, r2, r4)
        L_0x0148:
            java.lang.String r12 = "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$7"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r11, r12, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C115148o2.onClick(android.view.View):void");
    }
}
