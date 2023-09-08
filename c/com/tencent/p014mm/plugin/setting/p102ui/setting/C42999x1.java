package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import j20.C117292a;
import k20.C9556a;
import nj3.C88990b;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.x1 */
public final class C42999x1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsAuthUI f116416d;

    public C42999x1(SettingsAuthUI settingsAuthUI) {
        this.f116416d = settingsAuthUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent(this.f116416d, SettingsSearchAuthUI.class);
        SettingsAuthUI settingsAuthUI = this.f116416d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        SettingsAuthUI settingsAuthUI2 = settingsAuthUI;
        C117292a.m165358d(settingsAuthUI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$updateOptionMenu$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsAuthUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(settingsAuthUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$updateOptionMenu$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C88990b.m111198g(this.f116416d);
        return true;
    }
}
