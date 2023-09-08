package st1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import k20.C9556a;
import rt1.C22249a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: st1.i0 */
public class C77762i0 extends C86301e implements C77781t {

    /* renamed from: st1.i0$a */
    public class C77763a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f226594d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f226595e;

        public C77763a(C77762i0 i0Var, MMActivity mMActivity, Bundle bundle) {
            this.f226594d = mMActivity;
            this.f226595e = bundle;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(this.f226594d, WalletFaceIdAuthUI.class);
            intent.putExtra("pwd", this.f226595e.getString("key_pwd1"));
            intent.putExtra("key_scene", 1);
            MMActivity mMActivity = this.f226594d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MMActivity mMActivity2 = mMActivity;
            C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: st1.i0$b */
    public class C77764b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CheckBox f226596d;

        public C77764b(C77762i0 i0Var, CheckBox checkBox) {
            this.f226596d = checkBox;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f226596d.isChecked()) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, Boolean.TRUE);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* renamed from: LJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo107897LJ(com.tencent.p014mm.p136ui.MMActivity r21) {
        /*
            r20 = this;
            r6 = r20
            r15 = r21
            java.lang.Class<com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI> r0 = com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.class
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.mo119685f(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "MicroMsg.WalletSoterService"
            r3 = 0
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = "has show the finger print auth guide!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x0027:
            yq3.e r4 = yq3.C79143a.m95768g(r21)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r4 == 0) goto L_0x0034
            android.os.Bundle r1 = r4.f232423c
        L_0x0034:
            java.lang.String r5 = "kindaPayPwd"
            java.lang.String r7 = "isFromKinda"
            java.lang.String r8 = "key_pwd1"
            if (r15 == 0) goto L_0x005a
            android.content.Intent r10 = r21.getIntent()
            if (r10 == 0) goto L_0x005a
            android.content.Intent r10 = r21.getIntent()
            boolean r10 = r10.getBooleanExtra(r7, r3)
            if (r10 == 0) goto L_0x005b
            android.content.Intent r11 = r21.getIntent()
            java.lang.String r11 = r11.getStringExtra(r5)
            if (r11 == 0) goto L_0x005c
            r1.putString(r8, r11)
            goto L_0x005c
        L_0x005a:
            r10 = 0
        L_0x005b:
            r11 = 0
        L_0x005c:
            java.lang.String r12 = r1.getString(r8)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x006c
            java.lang.String r0 = "pwd is empty, not show the finger print auth guide!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x006c:
            java.lang.Class<vt1.a> r12 = vt1.C78473a.class
            k40.a r12 = f40.C86709a0.m107533q(r12)
            vt1.a r12 = (vt1.C78473a) r12
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            boolean r14 = l53.C76670a.m92324b()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r13[r3] = r14
            boolean r14 = r12.iw0()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r9 = 1
            r13[r9] = r14
            boolean r14 = l53.C76670a.m92323a()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r9 = 2
            r13[r9] = r14
            r14 = 3
            boolean r16 = r12.mo107913l3()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)
            r13[r14] = r16
            java.lang.String r14 = "fingerprint: %s has fingerprint: %s, faceid: %s has faceid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r14, r13)
            boolean r13 = r12.mo107880J3()
            if (r13 != 0) goto L_0x0302
            boolean r13 = r12.mo107883Zi()
            if (r13 != 0) goto L_0x0302
            boolean r13 = l53.C76670a.m92324b()
            java.lang.String r14 = ".ui.WalletOpenTouchPayApi31UI"
            java.lang.String r9 = "key_scene"
            java.lang.String r3 = "pwd"
            r17 = r8
            java.lang.String r8 = "key_enter_scene"
            r18 = r11
            java.lang.String r11 = "key_show_guide"
            r19 = r1
            java.lang.String r1 = ".ui.FingerPrintAuthTransparentUI"
            java.lang.String r6 = "fingerprint"
            if (r13 == 0) goto L_0x020c
            boolean r13 = r12.iw0()
            if (r13 == 0) goto L_0x020c
            boolean r13 = l53.C76670a.m92323a()
            if (r13 == 0) goto L_0x020c
            boolean r13 = r12.mo107913l3()
            if (r13 == 0) goto L_0x020c
            if (r10 == 0) goto L_0x01a3
            if (r15 == 0) goto L_0x0111
            android.content.Intent r4 = r21.getIntent()
            if (r4 == 0) goto L_0x0111
            android.content.Intent r4 = r21.getIntent()
            r10 = 0
            boolean r4 = r4.getBooleanExtra(r7, r10)
            android.content.Intent r12 = r21.getIntent()
            java.lang.String r13 = "bSupportFaceAndTouch"
            boolean r12 = r12.getBooleanExtra(r13, r10)
            android.content.Intent r13 = r21.getIntent()
            r17 = r4
            java.lang.String r4 = "selectBioType"
            int r4 = r13.getIntExtra(r4, r10)
            android.content.Intent r10 = r21.getIntent()
            java.lang.String r10 = r10.getStringExtra(r5)
            goto L_0x0116
        L_0x0111:
            r4 = 0
            r10 = 0
            r12 = 0
            r17 = 0
        L_0x0116:
            if (r17 == 0) goto L_0x019e
            if (r12 == 0) goto L_0x019e
            if (r10 != 0) goto L_0x011e
            goto L_0x019e
        L_0x011e:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            r13 = 1
            if (r4 != r13) goto L_0x0150
            java.lang.String r0 = "click fingerprint btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 0
            r12.putBoolean(r11, r0)
            r12.putBoolean(r7, r13)
            r12.putString(r5, r10)
            r12.putInt(r8, r13)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtras(r12)
            boolean r2 = r20.vx0()
            if (r2 == 0) goto L_0x014b
            r2 = 0
            ke3.C88144b.m109791i(r15, r6, r14, r0, r2)
            goto L_0x019e
        L_0x014b:
            r2 = 0
            ke3.C88144b.m109791i(r15, r6, r1, r0, r2)
            goto L_0x019e
        L_0x0150:
            r1 = 2
            if (r4 != r1) goto L_0x019e
            java.lang.String r1 = "click faceid btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r15, r0)
            r1.putExtra(r3, r10)
            r0 = 1
            r1.putExtra(r9, r0)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r1)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl"
            java.lang.String r10 = "kindaHandleOpenBiometricPay"
            java.lang.String r11 = "(Landroid/app/Activity;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r21
            r6 = 1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 0
            java.lang.Object r0 = r2.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r15.startActivity(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl"
            java.lang.String r9 = "kindaHandleOpenBiometricPay"
            java.lang.String r10 = "(Landroid/app/Activity;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x019f
        L_0x019e:
            r6 = 1
        L_0x019f:
            r2 = r20
            goto L_0x0304
        L_0x01a3:
            r6 = 1
            qo3.c0 r7 = new qo3.c0
            r0 = 2131887328(0x7f1204e0, float:1.940926E38)
            r7.<init>(r15, r0)
            r0 = 2131493288(0x7f0c01a8, float:1.8610052E38)
            r7.setContentView(r0)
            r0 = 2131298297(0x7f0907f9, float:1.8214563E38)
            android.view.View r0 = r7.findViewById(r0)
            r8 = r0
            android.widget.CheckBox r8 = (android.widget.CheckBox) r8
            r0 = 2131298298(0x7f0907fa, float:1.8214565E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131298299(0x7f0907fb, float:1.8214567E38)
            android.view.View r1 = r7.findViewById(r1)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131298296(0x7f0907f8, float:1.8214561E38)
            android.view.View r1 = r7.findViewById(r1)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r4 == 0) goto L_0x01e2
            android.os.Bundle r1 = r4.f232423c
        L_0x01e2:
            r3 = r1
            st1.j0 r1 = new st1.j0
            r13 = r20
            r1.<init>(r13, r15, r3, r7)
            r0.setOnClickListener(r1)
            st1.k0 r11 = new st1.k0
            r0 = r11
            r1 = r20
            r2 = r4
            r4 = r21
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnClickListener(r11)
            st1.l0 r0 = new st1.l0
            r0.<init>(r13, r8, r7)
            r10.setOnClickListener(r0)
            r7.show()
            r15.addDialog(r7)
            goto L_0x0300
        L_0x020c:
            r13 = r20
            r2 = r6
            r6 = 1
            boolean r4 = l53.C76670a.m92324b()
            if (r4 == 0) goto L_0x0255
            boolean r4 = r12.iw0()
            if (r4 == 0) goto L_0x0255
            boolean r4 = r12.mo107880J3()
            if (r4 != 0) goto L_0x0255
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r4 = r19
            r0.putExtras(r4)
            if (r10 == 0) goto L_0x024f
            r0.putExtra(r7, r10)
            r9 = r18
            r0.putExtra(r5, r9)
            r3 = 0
            r0.putExtra(r11, r3)
            boolean r3 = r20.vx0()
            if (r3 == 0) goto L_0x0249
            r0.putExtra(r8, r6)
            r3 = 0
            ke3.C88144b.m109791i(r15, r2, r14, r0, r3)
            goto L_0x0300
        L_0x0249:
            r3 = 0
            ke3.C88144b.m109791i(r15, r2, r1, r0, r3)
            goto L_0x0300
        L_0x024f:
            r3 = 0
            ke3.C88144b.m109791i(r15, r2, r1, r0, r3)
            goto L_0x0300
        L_0x0255:
            r4 = r19
            boolean r1 = l53.C76670a.m92323a()
            if (r1 == 0) goto L_0x0300
            boolean r1 = r12.mo107913l3()
            if (r1 == 0) goto L_0x0300
            boolean r1 = r12.mo107883Zi()
            if (r1 != 0) goto L_0x0300
            if (r10 == 0) goto L_0x02b7
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r15, r0)
            r0 = r17
            java.lang.String r0 = r4.getString(r0)
            r1.putExtra(r3, r0)
            r1.putExtra(r9, r6)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r1)
            java.lang.Object[] r8 = r0.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl"
            java.lang.String r10 = "showOpenGuideAfterPaySucc"
            java.lang.String r11 = "(Lcom/tencent/mm/ui/MMActivity;)Z"
            java.lang.String r12 = "Undefined"
            java.lang.String r1 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r21
            r2 = r13
            r13 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r15.startActivity(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl"
            java.lang.String r9 = "showOpenGuideAfterPaySucc"
            java.lang.String r10 = "(Lcom/tencent/mm/ui/MMActivity;)Z"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            return r6
        L_0x02b7:
            r2 = r13
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r21)
            r1 = 2131495616(0x7f0c0ac0, float:1.8614774E38)
            r3 = 0
            android.view.View r10 = r0.inflate(r1, r3)
            r0 = 2131302362(0x7f0917da, float:1.8222808E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131304897(0x7f0921c1, float:1.822795E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r3 = 2131825570(0x7f1113a2, float:1.9284E38)
            java.lang.String r3 = r15.getString(r3)
            r0.setText(r3)
            r8 = 0
            r9 = 0
            r0 = 2131822908(0x7f11093c, float:1.92786E38)
            java.lang.String r11 = r15.getString(r0)
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r12 = r15.getString(r0)
            st1.i0$a r13 = new st1.i0$a
            r13.<init>(r2, r15, r4)
            st1.i0$b r14 = new st1.i0$b
            r14.<init>(r2, r1)
            r7 = r21
            nj3.C76879j.m92715I(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0304
        L_0x0300:
            r2 = r13
            goto L_0x0304
        L_0x0302:
            r2 = r6
            r6 = 1
        L_0x0304:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: st1.C77762i0.mo107897LJ(com.tencent.mm.ui.MMActivity):boolean");
    }

    public void d60(MMActivity mMActivity, C22249a aVar, Bundle bundle) {
        WalletFaceIdDialog walletFaceIdDialog = new WalletFaceIdDialog(mMActivity, aVar, bundle);
        walletFaceIdDialog.setCancelable(false);
        mMActivity.getLifecycle().addObserver(walletFaceIdDialog);
        walletFaceIdDialog.show();
    }

    public final boolean vx0() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
        Log.m105925i("MicroMsg.WalletSoterService", "use biometric prompt: %s", Boolean.valueOf(z));
        return z;
    }
}
