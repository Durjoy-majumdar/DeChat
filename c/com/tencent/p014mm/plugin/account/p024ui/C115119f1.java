package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.account.ui.f1 */
public class C115119f1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C115132k1 f345147d;

    public C115119f1(C115132k1 k1Var) {
        this.f345147d = k1Var;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 2001) {
            this.f345147d.mo174897c();
        } else if (itemId == 2002) {
            C115132k1 k1Var = this.f345147d;
            ThirdAppRegisterStruct thirdAppRegisterStruct = k1Var.f345158e;
            thirdAppRegisterStruct.f343856d = 1;
            thirdAppRegisterStruct.f343857e = 10;
            thirdAppRegisterStruct.mo86054n();
            Intent intent = new Intent(k1Var.f345157d, MMFBLoginUI.class);
            MobileInputUI mobileInputUI = k1Var.f345157d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MobileInputUI mobileInputUI2 = mobileInputUI;
            C117292a.m165358d(mobileInputUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginFacebook", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileInputUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mobileInputUI2, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginFacebook", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
