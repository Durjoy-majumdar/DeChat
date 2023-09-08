package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.c3 */
public class C71140c3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsRingtoneUI f205931d;

    public C71140c3(SettingsRingtoneUI settingsRingtoneUI) {
        this.f205931d = settingsRingtoneUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f205931d.hideVKB();
        this.f205931d.finish();
        return true;
    }
}
