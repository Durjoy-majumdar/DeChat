package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import lg3.C88504k;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p910lj.C76701a;
import qe3.C89625d;
import qo3.C89779i0;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.d1 */
public class C115098d1 implements MobileInputUI$$u, C11385n {

    /* renamed from: d */
    public MobileInputUI f345094d;

    /* renamed from: e */
    public String f345095e;

    /* renamed from: f */
    public String f345096f;

    /* renamed from: g */
    public int f345097g = 0;

    /* renamed from: com.tencent.mm.plugin.account.ui.d1$a */
    public class C115099a implements DialogInterface.OnClickListener {
        public C115099a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115098d1.this.mo174869c();
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115099a.class.getName());
            sb.append(",");
            sb.append("F200_200");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("F200_200"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, true, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d1$b */
    public class C115100b implements DialogInterface.OnClickListener {
        public C115100b(C115098d1 d1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115100b.class.getName());
            sb.append(",");
            sb.append("F200_200");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("F200_200"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, true, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d1$c */
    public class C115101c implements DialogInterface.OnCancelListener {
        public C115101c(C115098d1 d1Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        r2 = r10.f345096f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo174715a(com.tencent.p014mm.plugin.account.p024ui.MobileInputUI$$t r11) {
        /*
            r10 = this;
            int r11 = r11.ordinal()
            r0 = 1
            if (r11 == r0) goto L_0x0009
            goto L_0x00d1
        L_0x0009:
            com.tencent.mm.plugin.account.ui.MobileInputUI r11 = r10.f345094d
            java.lang.String r1 = r11.f344677H
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.PhoneFormater.countryCodeWithPlus(r1)
            r11.f344673D = r1
            com.tencent.mm.plugin.account.ui.MobileInputUI r11 = r10.f345094d
            com.tencent.mm.ui.base.MMFormInputView r1 = r11.f344691e
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r11.f344674E = r1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            com.tencent.mm.plugin.account.ui.MobileInputUI r1 = r10.f345094d
            java.lang.String r1 = r1.f344673D
            r11.append(r1)
            com.tencent.mm.plugin.account.ui.MobileInputUI r1 = r10.f345094d
            java.lang.String r1 = r1.f344674E
            r11.append(r1)
            java.lang.String r3 = r11.toString()
            com.tencent.mm.plugin.account.ui.MobileInputUI r11 = r10.f345094d
            qo3.i0 r1 = r11.f344697n
            if (r1 == 0) goto L_0x0047
            java.lang.String r11 = "MicroMsg.MobileInputForgetPwdLogic"
            java.lang.String r0 = "already checking "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            goto L_0x00d1
        L_0x0047:
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r5 = r11.getString(r1)
            com.tencent.mm.plugin.account.ui.MobileInputUI r1 = r10.f345094d
            r2 = 2131834558(0x7f1136be, float:1.930223E38)
            java.lang.String r6 = r1.getString(r2)
            r7 = 1
            com.tencent.mm.plugin.account.ui.c1 r9 = new com.tencent.mm.plugin.account.ui.c1
            r9.<init>(r10)
            r8 = 1
            r4 = r11
            qo3.i0 r1 = nj3.C76879j.m92723Q(r4, r5, r6, r7, r8, r9)
            r11.f344697n = r1
            com.tencent.mm.plugin.account.ui.MobileInputUI r11 = r10.f345094d
            com.tencent.mm.ui.base.MMFormInputView r11 = r11.f344691e
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = r10.f345095e
            if (r1 == 0) goto L_0x0089
            java.lang.String r2 = r10.f345096f
            if (r2 == 0) goto L_0x0089
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0089
            java.lang.String r1 = r10.f345096f
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0089
            r11 = 1
            goto L_0x00a2
        L_0x0089:
            java.lang.String r1 = r10.f345095e
            if (r1 == 0) goto L_0x00a1
            java.lang.String r2 = r10.f345096f
            if (r2 == 0) goto L_0x00a1
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = r10.f345096f
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x00a1
            r11 = 2
            goto L_0x00a2
        L_0x00a1:
            r11 = 0
        L_0x00a2:
            bc0.a r1 = new bc0.a
            r4 = 12
            r6 = 0
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            int r2 = r10.f345097g
            r1.mo91364O(r2)
            r1.mo91370g0(r11)
            ob0.b0 r11 = f40.C86709a0.m107524d()
            r11.mo123460f(r1)
            com.tencent.mm.plugin.account.ui.MobileInputUI r11 = r10.f345094d
            com.tencent.mm.ui.base.MMFormInputView r11 = r11.f344691e
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            r10.f345095e = r11
            int r11 = r10.f345097g
            int r11 = r11 + r0
            r10.f345097g = r11
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C115098d1.mo174715a(com.tencent.mm.plugin.account.ui.MobileInputUI$$t):void");
    }

    /* renamed from: b */
    public void mo174716b(MobileInputUI mobileInputUI) {
        this.f345094d = mobileInputUI;
        mobileInputUI.f344692f.requestFocus();
        mobileInputUI.showVKB();
        String string = mobileInputUI.getString(C0966R.string.hy9);
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            string = string + C88504k.m110376b(mobileInputUI);
        }
        mobileInputUI.setMMTitle(string);
        mobileInputUI.f344695i.setVisibility(0);
        mobileInputUI.f344691e.setVisibility(0);
        mobileInputUI.f344692f.requestFocus();
        mobileInputUI.f344701r.setText(C0966R.string.f360089a13);
        mobileInputUI.f344701r.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo174869c() {
        MobileInputUI mobileInputUI = this.f345094d;
        mobileInputUI.f344697n = C76879j.m92723Q(mobileInputUI, mobileInputUI.getString(C0966R.string.a3h), this.f345094d.getString(C0966R.string.hwo), true, true, new C115101c(this));
        C86709a0.m107524d().mo123460f(new C67216a(this.f345094d.f344673D + this.f345094d.f344674E, 8, "", 0, ""));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        Class<C115098d1> cls = C115098d1.class;
        Log.m105924i("MicroMsg.MobileInputForgetPwdLogic", "onSceneEnd: errType = " + i + " errCode = " + i3 + " errMsg = " + str);
        C89779i0 i0Var = this.f345094d.f344697n;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f345094d.f344697n = null;
        }
        if (i3 == -75) {
            C76879j.m92738i(this.f345094d, C0966R.string.f7561jo, C0966R.string.hvq);
        } else if (i3 == -41 || i3 == -59) {
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(this.f345094d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92738i(this.f345094d, C0966R.string.hx6, C0966R.string.hx7);
            }
        } else if (yVar.getType() == 145) {
            C67216a aVar = (C67216a) yVar;
            int f = aVar.mo91368f();
            if (f == 12) {
                if (i3 == -36 || i3 == -35 || i3 == -3) {
                    String K0 = aVar.mo91363K0();
                    if (!Util.isNullOrNil(K0)) {
                        this.f345094d.f344674E = K0.trim();
                    }
                    MobileInputUI mobileInputUI = this.f345094d;
                    mobileInputUI.f344674E = PhoneFormater.pureNumber(mobileInputUI.f344674E);
                    this.f345096f = this.f345094d.f344673D + this.f345094d.f344674E;
                    StringBuilder sb = new StringBuilder();
                    C86709a0.m107523b();
                    sb.append(C86718e.m107547e());
                    sb.append(",");
                    sb.append(cls.getName());
                    sb.append(",");
                    sb.append("F200_200");
                    sb.append(",");
                    C86709a0.m107523b();
                    sb.append(C86718e.m107548f("F200_200"));
                    sb.append(",");
                    sb.append(1);
                    C78595a.m94983c(10645, true, sb.toString());
                    C7660a a2 = C7660a.m7782a(str);
                    if (a2 != null) {
                        a2.mo8792b(this.f345094d, new C115099a(), new C115100b(this));
                        return;
                    }
                    mo174869c();
                    StringBuilder sb4 = new StringBuilder();
                    C86709a0.m107523b();
                    sb4.append(C86718e.m107547e());
                    sb4.append(",");
                    sb4.append(cls.getName());
                    sb4.append(",");
                    sb4.append("F200_200");
                    sb4.append(",");
                    C86709a0.m107523b();
                    sb4.append(C86718e.m107548f("F200_200"));
                    sb4.append(",");
                    sb4.append(2);
                    C78595a.m94983c(10645, true, sb4.toString());
                    return;
                } else if (i3 == -34) {
                    MobileInputUI mobileInputUI2 = this.f345094d;
                    C76879j.m92748s(mobileInputUI2, mobileInputUI2.getString(C0966R.string.ajx), "");
                    return;
                } else {
                    MobileInputUI mobileInputUI3 = this.f345094d;
                    C76701a.makeText((Context) mobileInputUI3, (CharSequence) mobileInputUI3.getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            }
            if (f == 8 && i3 == 0) {
                Intent intent = new Intent();
                intent.putExtra("bindmcontact_mobile", this.f345094d.f344673D + " " + this.f345094d.f344691e.getText().toString());
                intent.putExtra("bindmcontact_shortmobile", this.f345094d.f344674E);
                intent.putExtra("country_name", this.f345094d.f344676G);
                intent.putExtra("couttry_code", this.f345094d.f344677H);
                intent.putExtra("mobileverify_countdownsec", aVar.mo91373k1());
                intent.putExtra("mobileverify_countdownstyle", aVar.mo91374l1());
                intent.putExtra("mobileverify_fb", aVar.mo91375m1());
                intent.putExtra("mobileverify_reg_qq", aVar.mo91378p1());
                intent.putExtra("mobile_verify_purpose", 3);
                intent.setClass(this.f345094d, MobileVerifyUI.class);
                MobileInputUI mobileInputUI4 = this.f345094d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                MobileInputUI mobileInputUI5 = mobileInputUI4;
                C117292a.m165358d(mobileInputUI5, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputForgetPwdLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mobileInputUI4.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(mobileInputUI5, "com/tencent/mm/plugin/account/ui/MobileInputForgetPwdLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public void start() {
        C86709a0.m107524d().mo123455a(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115098d1.class.getName());
        sb.append(",");
        sb.append("F200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("F200_100"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("F200_100");
        this.f345097g = 0;
    }

    public void stop() {
        C86709a0.m107524d().mo123470p(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115098d1.class.getName());
        sb.append(",");
        sb.append("F200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("F200_100"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }
}
