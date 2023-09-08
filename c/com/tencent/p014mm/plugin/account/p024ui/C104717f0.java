package com.tencent.p014mm.plugin.account.p024ui;

import android.view.MenuItem;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.account.ui.f0 */
public class C104717f0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f310967d;

    public C104717f0(LoginHistoryUI loginHistoryUI) {
        this.f310967d = loginHistoryUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        LoginHistoryUI loginHistoryUI = this.f310967d;
        int itemId = menuItem.getItemId();
        int i2 = LoginHistoryUI.f344496X;
        loginHistoryUI.mo174617N7(itemId);
    }
}
