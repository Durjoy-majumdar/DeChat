package com.tencent.p014mm.plugin.account.p024ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$b */
public class LoginUI$$b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f10700d;

    public LoginUI$$b(LoginUI loginUI) {
        this.f10700d = loginUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 5001) {
            LoginUI.m161847I7(this.f10700d);
        } else if (itemId == 5002) {
            LoginUI loginUI = this.f10700d;
            LoginUI.m161848L7(loginUI, this.f10700d.getString(C0966R.string.liq) + LocaleUtil.getApplicationLanguage());
        }
    }
}
