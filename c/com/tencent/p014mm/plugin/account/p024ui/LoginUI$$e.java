package com.tencent.p014mm.plugin.account.p024ui;

import android.view.MenuItem;
import com.tencent.p014mm.pluginsdk.model.app.C85606b2;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$e */
public class LoginUI$$e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f344629d;

    public LoginUI$$e(LoginUI loginUI) {
        this.f344629d = loginUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        LoginUI loginUI = this.f344629d;
        int i = LoginUI.f344598K;
        loginUI.hideVKB();
        C78595a.m94985e(loginUI.f344621s);
        C85606b2.f249526h = null;
        C85606b2.f249527i = -1;
        loginUI.finish();
        return true;
    }
}
