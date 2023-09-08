package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import di3.C86312j;
import f40.C86709a0;
import hg0.C76170j0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lg3.C88504k;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import qe3.C89625d;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.ui.m1 */
public class C115136m1 implements MobileInputUI$$u, C11385n {

    /* renamed from: d */
    public MobileInputUI f345169d;

    /* renamed from: e */
    public String f345170e = null;

    /* renamed from: f */
    public String f345171f = "";

    /* renamed from: g */
    public int f345172g = 2;

    /* renamed from: a */
    public void mo174715a(MobileInputUI$$t mobileInputUI$$t) {
        if (mobileInputUI$$t.ordinal() == 1) {
            MobileInputUI mobileInputUI = this.f345169d;
            mobileInputUI.f344673D = PhoneFormater.countryCodeWithPlus(mobileInputUI.f344677H);
            MobileInputUI mobileInputUI2 = this.f345169d;
            mobileInputUI2.f344674E = mobileInputUI2.f344691e.getText().toString();
            String str = this.f345169d.f344673D + this.f345169d.f344674E;
            MobileInputUI mobileInputUI3 = this.f345169d;
            if (mobileInputUI3.f344697n != null) {
                Log.m105918d("MicroMsg.MobileInputRegLogic", "already checking ");
                return;
            }
            mobileInputUI3.f344697n = C76879j.m92723Q(mobileInputUI3, mobileInputUI3.getString(C0966R.string.a3h), this.f345169d.getString(C0966R.string.hwo), true, true, new C115134l1(this));
            C86709a0.m107524d().mo123460f(new C76170j0(str, 1, "", 0, "", ""));
        }
    }

    /* renamed from: b */
    public void mo174716b(MobileInputUI mobileInputUI) {
        this.f345169d = mobileInputUI;
        mobileInputUI.f344692f.requestFocus();
        mobileInputUI.showVKB();
        this.f345170e = mobileInputUI.getIntent().getStringExtra("regsetinfo_ticket");
        this.f345171f = mobileInputUI.getIntent().getStringExtra("regsetinfo_NextStep");
        this.f345172g = mobileInputUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        String string = mobileInputUI.getString(C0966R.string.hy9);
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            string = string + C88504k.m110376b(mobileInputUI);
        }
        mobileInputUI.setMMTitle(string);
        mobileInputUI.f344695i.setVisibility(0);
        mobileInputUI.f344691e.setVisibility(0);
        mobileInputUI.f344692f.requestFocus();
        View view = mobileInputUI.f344698o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputQQRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/MobileInputQQRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mobileInputUI.f344701r.setVisibility(0);
        mobileInputUI.f344701r.setText(C0966R.string.gdv);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C89779i0 i0Var = this.f345169d.f344697n;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f345169d.f344697n = null;
        }
        if (yVar.getType() != 132) {
            return;
        }
        if (i == 0 && i2 == 0) {
            if (((C76170j0) yVar).mo106407f() == 1) {
                Intent intent = new Intent();
                intent.putExtra("bindmcontact_mobile", this.f345169d.f344673D + " " + this.f345169d.f344691e.getText().toString());
                intent.putExtra("bindmcontact_shortmobile", this.f345169d.f344691e.getText().toString());
                intent.putExtra("country_name", this.f345169d.f344676G);
                intent.putExtra("couttry_code", this.f345169d.f344677H);
                intent.putExtra("mobile_verify_purpose", 4);
                intent.putExtra("regsetinfo_ticket", this.f345170e);
                intent.putExtra("regsetinfo_NextStep", this.f345171f);
                intent.putExtra("regsetinfo_NextStyle", this.f345172g);
                intent.setClass(this.f345169d, MobileVerifyUI.class);
                MobileInputUI mobileInputUI = this.f345169d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                MobileInputUI mobileInputUI2 = mobileInputUI;
                C117292a.m165358d(mobileInputUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputQQRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mobileInputUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mobileInputUI2, "com/tencent/mm/plugin/account/ui/MobileInputQQRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f345169d.finish();
            }
        } else if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this.f345169d, i, i2, str)) {
            MobileInputUI mobileInputUI3 = this.f345169d;
            C76701a.makeText((Context) mobileInputUI3, (CharSequence) mobileInputUI3.getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }

    public void start() {
        C86709a0.m107524d().mo123455a(132, this);
    }

    public void stop() {
        C86709a0.m107524d().mo123470p(132, this);
    }
}
