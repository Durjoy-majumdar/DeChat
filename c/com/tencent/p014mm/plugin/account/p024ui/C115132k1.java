package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nc0.C76850a;
import nj3.C76875f0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.k1 */
public class C115132k1 implements MobileInputUI$$u, C11385n {

    /* renamed from: d */
    public MobileInputUI f345157d;

    /* renamed from: e */
    public ThirdAppRegisterStruct f345158e = new ThirdAppRegisterStruct();

    /* renamed from: f */
    public boolean f345159f = false;

    /* renamed from: a */
    public void mo174715a(MobileInputUI$$t mobileInputUI$$t) {
        int ordinal = mobileInputUI$$t.ordinal();
        if (ordinal == 1) {
            MobileInputUI mobileInputUI = this.f345157d;
            mobileInputUI.f344673D = PhoneFormater.countryCodeWithPlus(mobileInputUI.f344677H);
            MobileInputUI mobileInputUI2 = this.f345157d;
            mobileInputUI2.f344674E = mobileInputUI2.f344692f.getText().toString();
            String pureNumber = PhoneFormater.pureNumber(this.f345157d.f344673D + this.f345157d.f344674E);
            MobileInputUI mobileInputUI3 = this.f345157d;
            mobileInputUI3.f344697n = C76879j.m92723Q(mobileInputUI3, mobileInputUI3.getString(C0966R.string.a3h), this.f345157d.getString(C0966R.string.hwo), true, true, new C115129j1(this));
            C86709a0.m107524d().mo123460f(new C67216a(pureNumber, 13, "", 0, ""));
        } else if (ordinal == 2 && this.f345159f) {
            this.f345159f = false;
            mo174897c();
        }
    }

    /* renamed from: b */
    public void mo174716b(MobileInputUI mobileInputUI) {
        this.f345157d = mobileInputUI;
        mobileInputUI.f344695i.setVisibility(0);
        mobileInputUI.f344691e.setVisibility(0);
        mobileInputUI.f344692f.requestFocus();
        mobileInputUI.f344701r.setText(C0966R.string.gbw);
        mobileInputUI.f344701r.setVisibility(0);
        mobileInputUI.f344702s.setVisibility(0);
        mobileInputUI.f344704u.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        C76875f0 f0Var = new C76875f0(this.f345157d, 2001, 0);
        if (WeChatBrands.AppInfo.current().isMainland()) {
            f0Var.f224723r = C0966R.string.gcb;
        } else {
            f0Var.f224723r = C0966R.string.gcd;
        }
        arrayList.add(f0Var);
        C76875f0 f0Var2 = new C76875f0(this.f345157d, 2002, 0);
        if (C76850a.m92636h()) {
            f0Var2.f224723r = C0966R.string.gc8;
            arrayList.add(f0Var2);
        }
        if (arrayList.size() > 1) {
            C77407n nVar = new C77407n((Context) this.f345157d, 1, false);
            nVar.f225771i = new C40421e1(this, arrayList);
            nVar.f225782p = new C115119f1(this);
            nVar.f225761d = new C115123g1(this);
            this.f345157d.f344705v.setText(C0966R.string.gcc);
            this.f345157d.f344705v.setOnClickListener(new C115126h1(this, nVar, arrayList, f0Var2));
        } else {
            if (WeChatBrands.AppInfo.current().isMainland()) {
                this.f345157d.f344705v.setText(C0966R.string.gcb);
            } else {
                this.f345157d.f344705v.setText(C0966R.string.gcd);
            }
            this.f345157d.f344705v.setOnClickListener(new C104720i1(this));
        }
        this.f345157d.f344705v.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo174897c() {
        this.f345157d.f344683N[0] = 1;
        Intent intent = new Intent();
        intent.putExtra("from_switch_account", this.f345157d.f344685Q);
        intent.setClass(this.f345157d, LoginUI.class);
        MobileInputUI mobileInputUI = this.f345157d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MobileInputUI mobileInputUI2 = mobileInputUI;
        C117292a.m165358d(mobileInputUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginWeXinQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileInputUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mobileInputUI2, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginWeXinQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f345157d.finish();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.MobileInputLoginLogic", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C89779i0 i0Var = this.f345157d.f344697n;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f345157d.f344697n = null;
        }
        if (yVar.getType() != 252) {
            int type = yVar.getType();
        }
        if (yVar.getType() != 145 || ((C67216a) yVar).mo91368f() != 13) {
            return;
        }
        if (i2 == -41) {
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(this.f345157d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92738i(this.f345157d, C0966R.string.hx6, C0966R.string.hx7);
            }
        } else if (i2 == -1) {
            MobileInputUI mobileInputUI = this.f345157d;
            C76701a.makeText((Context) mobileInputUI, (CharSequence) mobileInputUI.getString(C0966R.string.ey_, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        } else if (i2 == -34) {
            MobileInputUI mobileInputUI2 = this.f345157d;
            C76879j.m92748s(mobileInputUI2, mobileInputUI2.getString(C0966R.string.ajx), "");
        } else {
            this.f345157d.hideVKB();
            Intent intent = new Intent(this.f345157d, MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", -1);
            intent.putExtra("mobile_auth_type", 7);
            intent.putExtra("from_switch_account", this.f345157d.f344685Q);
            intent.putExtra("couttry_code", this.f345157d.f344677H);
            intent.putExtra("input_mobile_number", this.f345157d.f344674E);
            MobileInputUI mobileInputUI3 = this.f345157d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MobileInputUI mobileInputUI4 = mobileInputUI3;
            C117292a.m165358d(mobileInputUI4, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileInputUI3.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mobileInputUI4, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void start() {
        C86709a0.m107524d().mo123455a(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115132k1.class.getName());
        sb.append(",");
        sb.append("L200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L200_100"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("L200_100");
    }

    public void stop() {
        C86709a0.m107524d().mo123470p(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115132k1.class.getName());
        sb.append(",");
        sb.append("L200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L200_100"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }
}
