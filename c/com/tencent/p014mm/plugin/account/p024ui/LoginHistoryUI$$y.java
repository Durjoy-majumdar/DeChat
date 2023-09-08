package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$y */
public class LoginHistoryUI$$y implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f10693d;

    public LoginHistoryUI$$y(LoginHistoryUI loginHistoryUI) {
        this.f10693d = loginHistoryUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId != 7009) {
            switch (itemId) {
                case 7002:
                    LoginHistoryUI loginHistoryUI = this.f10693d;
                    loginHistoryUI.f344516U[4] = 1;
                    Intent intent = new Intent(loginHistoryUI, MobileInputUI.class);
                    intent.putExtra("mobile_input_purpose", 1);
                    int[] iArr = new int[5];
                    iArr[4] = 1;
                    intent.putExtra("kv_report_login_method_data", iArr);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    LoginHistoryUI loginHistoryUI2 = loginHistoryUI;
                    C117292a.m165358d(loginHistoryUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    loginHistoryUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(loginHistoryUI2, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                case 7003:
                    LoginHistoryUI loginHistoryUI3 = this.f10693d;
                    int i2 = LoginHistoryUI.f344496X;
                    loginHistoryUI3.getClass();
                    Intent intent2 = new Intent(loginHistoryUI3, RegByMobileRegAIOUI.class);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    C117292a.m165358d(loginHistoryUI3, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "register", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    loginHistoryUI3.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(loginHistoryUI3, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "register", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                case 7004:
                    LoginHistoryUI.m161828H7(this.f10693d);
                    return;
                default:
                    return;
            }
        } else {
            LoginHistoryUI loginHistoryUI4 = this.f10693d;
            LoginHistoryUI.m161830R7(loginHistoryUI4, this.f10693d.getString(C0966R.string.liq) + LocaleUtil.getApplicationLanguage());
        }
    }
}
