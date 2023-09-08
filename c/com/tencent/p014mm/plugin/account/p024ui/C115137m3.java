package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.account.ui.m3 */
public class C115137m3 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ WelcomeActivity f345173d;

    public C115137m3(WelcomeActivity welcomeActivity) {
        this.f345173d = welcomeActivity;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1001) {
            Intent intent = new Intent(this.f345173d, RegByMobileRegAIOUI.class);
            WelcomeActivity welcomeActivity = this.f345173d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WelcomeActivity welcomeActivity2 = welcomeActivity;
            C117292a.m165358d(welcomeActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            welcomeActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(welcomeActivity2, "com/tencent/mm/plugin/account/ui/WelcomeActivity$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (itemId == 1002) {
            ThirdAppRegisterStruct thirdAppRegisterStruct = this.f345173d.f345075f;
            thirdAppRegisterStruct.f343856d = 1;
            thirdAppRegisterStruct.f343857e = 2;
            thirdAppRegisterStruct.mo86054n();
            WelcomeActivity welcomeActivity3 = this.f345173d;
            welcomeActivity3.getClass();
            C116102h hVar = new C116102h();
            welcomeActivity3.f345074e = hVar;
            hVar.mo177418a(welcomeActivity3, WelcomeActivity.f345072h, new C115178r3(welcomeActivity3));
        }
    }
}
