package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.modelsimple.BindWordingContent;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobileUI;

/* renamed from: com.tencent.mm.ui.s0 */
public class C74814s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GlobalAlertMgr f219945d;

    /* renamed from: com.tencent.mm.ui.s0$a */
    public class C74815a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f219946d;

        public C74815a(String str) {
            this.f219946d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setClass(C74814s0.this.f219945d.f214221a, BindMobileUI.class);
            intent.putExtra("kstyle_bind_wording", new BindWordingContent(this.f219946d, ""));
            MMWizardActivity.m7017L7(C74814s0.this.f219945d.f214221a, intent);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.s0$b */
    public class C74816b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f219948d;

        public C74816b(String str) {
            this.f219948d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setClass(C74814s0.this.f219945d.f214221a, BindMobileUI.class);
            intent.putExtra("kstyle_bind_wording", new BindWordingContent(this.f219948d, ""));
            MMWizardActivity.m7017L7(C74814s0.this.f219945d.f214221a, intent);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.s0$c */
    public class C74817c implements DialogInterface.OnClickListener {
        public C74817c(C74814s0 s0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public C74814s0(GlobalAlertMgr globalAlertMgr) {
        this.f219945d = globalAlertMgr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r31 = this;
            r0 = r31
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BIND_MOBILE_XML_WORDING_STRING
            android.content.SharedPreferences r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r3 = "show_sdcard_full_time"
            r4 = 0
            long r4 = r2.getLong(r3, r4)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r6 - r4
            r10 = 0
            r11 = 1
            r12 = 10800000(0xa4cb80, double:5.335909E-317)
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x0026
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r4 = 0
            goto L_0x0027
        L_0x0026:
            r4 = 1
        L_0x0027:
            com.tencent.mm.ui.GlobalAlertMgr r5 = r0.f219945d
            r5.getClass()
            int r8 = p983ik.C87743a.m109162a()
            boolean r9 = p206nj.C88955f.m111057a()
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r13 = r5.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r12[r11] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)
            r14 = 2
            r12[r14] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            r15 = 3
            r12[r15] = r13
            int r13 = r5.f214232l
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 4
            r12[r15] = r13
            java.lang.String r13 = "MicroMsg.LauncherUI.GlobalAlertMgr"
            java.lang.String r10 = "%d check mobile available space _dataRet[%d] checkSdIsFull[%b] needShowAlert[%b] testCode[%d] "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r10, r12)
            int r10 = r5.f214232l
            if (r10 != r11) goto L_0x006e
            r5.f214232l = r15
            r4 = 1
            r8 = 1
            goto L_0x0089
        L_0x006e:
            if (r10 != r14) goto L_0x0076
            r12 = 0
            r5.f214232l = r12
            r4 = 1
            r8 = 2
            goto L_0x0089
        L_0x0076:
            r11 = 3
            r12 = 0
            if (r10 != r11) goto L_0x0080
            r5.f214232l = r12
            r4 = 1
            r8 = 0
            r9 = 1
            goto L_0x0089
        L_0x0080:
            if (r10 != r15) goto L_0x0087
            r5.f214232l = r12
            r8 = 0
            goto L_0x0170
        L_0x0087:
            r5.f214232l = r12
        L_0x0089:
            if (r9 == 0) goto L_0x00c7
            if (r4 == 0) goto L_0x0122
            com.tencent.mm.ui.MMFragmentActivity r4 = r5.f214221a
            r8 = 2131835363(0x7f1139e3, float:1.9303862E38)
            java.lang.String r17 = r5.mo101297a(r8)
            r8 = 2131835364(0x7f1139e4, float:1.9303864E38)
            java.lang.String r18 = r5.mo101297a(r8)
            r8 = 2131821433(0x7f110379, float:1.927561E38)
            java.lang.String r19 = r5.mo101297a(r8)
            r8 = 2131821559(0x7f1103f7, float:1.9275865E38)
            java.lang.String r20 = r5.mo101297a(r8)
            com.tencent.mm.ui.q0 r8 = new com.tencent.mm.ui.q0
            r8.<init>(r5)
            r22 = 0
            r16 = r4
            r21 = r8
            nj3.C76879j.m92707A(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.report.service.n r23 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r24 = 282(0x11a, double:1.393E-321)
            r26 = 0
            r28 = 1
            r30 = 0
            r23.idkeyStat(r24, r26, r28, r30)
            goto L_0x011f
        L_0x00c7:
            if (r8 != r14) goto L_0x0124
            if (r4 == 0) goto L_0x0122
            f40.C86718e.m107550n()
            com.tencent.mm.ui.MMFragmentActivity r4 = r5.f214221a
            qo3.a r8 = new qo3.a
            r8.<init>()
            r9 = 2131823708(0x7f110c5c, float:1.9280223E38)
            android.content.res.Resources r10 = al3.C0086a.m38a(r4)
            java.lang.String r9 = r10.getString(r9)
            r8.f225644a = r9
            com.tencent.mm.ui.MMFragmentActivity r9 = r5.f214221a
            r10 = 2131823707(0x7f110c5b, float:1.9280221E38)
            java.lang.String r9 = r9.getString(r10)
            r8.f225660q = r9
            r9 = 0
            r8.f225668y = r9
            r9 = 2131823705(0x7f110c59, float:1.9280217E38)
            android.content.res.Resources r10 = al3.C0086a.m38a(r4)
            java.lang.String r9 = r10.getString(r9)
            r8.f225663t = r9
            com.tencent.mm.ui.r0 r9 = new com.tencent.mm.ui.r0
            r9.<init>(r5)
            r8.f225620C = r9
            qo3.g r9 = new qo3.g
            r10 = 2131887328(0x7f1204e0, float:1.940926E38)
            r9.<init>(r4, r10)
            r9.mo107525e(r8)
            r9.show()
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 282(0x11a, double:1.393E-321)
            r19 = 2
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x011f:
            r4 = 1
            r8 = 1
            goto L_0x0158
        L_0x0122:
            r4 = 1
            goto L_0x0157
        L_0x0124:
            r4 = 3
            java.lang.Object[] r8 = new java.lang.Object[r4]
            int r4 = r5.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r8[r9] = r4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r9 = 1
            r8[r9] = r4
            boolean r4 = r5.f214230j
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8[r14] = r4
            java.lang.String r4 = "%d cancel no space notification isShowLackSpaceNotification[%b] hadCheckNotification[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r4, r8)
            boolean r4 = r5.f214230j
            if (r4 == 0) goto L_0x0149
            goto L_0x0154
        L_0x0149:
            eb0.u2 r4 = eb0.C97625j3.m125816f()
            r8 = 45
            com.tencent.mm.booter.notification.MMNotification r4 = (com.tencent.p014mm.booter.notification.MMNotification) r4
            r4.mo93207e(r8)
        L_0x0154:
            r4 = 1
            r5.f214230j = r4
        L_0x0157:
            r8 = 0
        L_0x0158:
            java.lang.Object[] r9 = new java.lang.Object[r14]
            int r5 = r5.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10 = 0
            r9[r10] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            r9[r4] = r5
            java.lang.String r4 = "%d check mobile available space isShowAlert[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r9)
        L_0x0170:
            if (r8 == 0) goto L_0x017d
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r6)
            r2.commit()
        L_0x017d:
            if (r8 != 0) goto L_0x0276
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BIND_MOBILE_XML_TIP_BOOLEAN
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.mo119685f(r3, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0276
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            r6 = 6
            java.lang.String r7 = ""
            java.lang.Object r5 = r5.mo119684e(r6, r7)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x0248
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r6 = r6.mo105906u()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BIND_MOBILE_XML_FORCE_BIND_BOOLEAN
            java.lang.Object r6 = r6.mo119685f(r8, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r8 = r8.mo105906u()
            com.tencent.mm.ui.GlobalAlertMgr r9 = r0.f219945d
            r10 = 2131822505(0x7f1107a9, float:1.9277783E38)
            java.lang.String r9 = r9.mo101297a(r10)
            java.lang.Object r8 = r8.mo119685f(r1, r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object[] r9 = new java.lang.Object[r15]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r10 = 0
            r9[r10] = r2
            r2 = 1
            r9[r2] = r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r9[r14] = r2
            r2 = 3
            r9[r2] = r8
            java.lang.String r2 = "summerbindmobile tip[%b], bindMobile[%s], force[%b], wording[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r9)
            r2 = 2131821617(0x7f110431, float:1.9275982E38)
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r6 == 0) goto L_0x021b
            com.tencent.mm.ui.GlobalAlertMgr r6 = r0.f219945d
            com.tencent.mm.ui.MMFragmentActivity r9 = r6.f214221a
            java.lang.String r18 = r6.mo101297a(r5)
            com.tencent.mm.ui.GlobalAlertMgr r5 = r0.f219945d
            java.lang.String r19 = r5.mo101297a(r2)
            r20 = 0
            com.tencent.mm.ui.s0$a r2 = new com.tencent.mm.ui.s0$a
            r2.<init>(r8)
            r16 = r9
            r17 = r8
            r21 = r2
            nj3.C76879j.m92711E(r16, r17, r18, r19, r20, r21)
            goto L_0x0254
        L_0x021b:
            com.tencent.mm.ui.GlobalAlertMgr r6 = r0.f219945d
            com.tencent.mm.ui.MMFragmentActivity r9 = r6.f214221a
            java.lang.String r18 = r6.mo101297a(r5)
            com.tencent.mm.ui.GlobalAlertMgr r5 = r0.f219945d
            java.lang.String r19 = r5.mo101297a(r2)
            com.tencent.mm.ui.GlobalAlertMgr r2 = r0.f219945d
            r5 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r20 = r2.mo101297a(r5)
            com.tencent.mm.ui.s0$b r2 = new com.tencent.mm.ui.s0$b
            r2.<init>(r8)
            com.tencent.mm.ui.s0$c r5 = new com.tencent.mm.ui.s0$c
            r5.<init>(r0)
            r16 = r9
            r17 = r8
            r21 = r2
            r22 = r5
            nj3.C76879j.m92707A(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0254
        L_0x0248:
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r2 = 0
            r6[r2] = r5
            java.lang.String r2 = "summerbindmobile has bind[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r6)
        L_0x0254:
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r2.mo119677K(r3, r4)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r2.mo119677K(r1, r7)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 1
            r1.mo119681a(r2)
        L_0x0276:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C74814s0.run():void");
    }

    public String toString() {
        return super.toString() + "|doOnResumeCheck";
    }
}
