package com.tencent.p014mm.plugin.account.p024ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$q */
public class MobileInputUI$$q implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f10743d;

    public MobileInputUI$$q(MobileInputUI mobileInputUI) {
        this.f10743d = mobileInputUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 5001) {
            MobileInputUI.m161864H7(this.f10743d);
        } else if (itemId == 5002) {
            MobileInputUI mobileInputUI = this.f10743d;
            MobileInputUI.m161865M7(mobileInputUI, this.f10743d.getString(C0966R.string.liq) + LocaleUtil.getApplicationLanguage());
        }
    }
}
