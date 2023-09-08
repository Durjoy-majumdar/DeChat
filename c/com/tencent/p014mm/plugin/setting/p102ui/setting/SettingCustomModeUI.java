package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import lg3.C76695c;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingCustomModeUI */
public class SettingCustomModeUI extends MMPreference {

    /* renamed from: d */
    public C47511g f20791d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingCustomModeUI$a */
    public class C5256a implements MenuItem.OnMenuItemClickListener {
        public C5256a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingCustomModeUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8947c3;
    }

    public void initView() {
        setMMTitle(getString(C0966R.string.ire));
        this.f20791d = getPreferenceScreen();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        Log.m105919d("MicroMsg.SettingCustomModeUI", "hide care mode:%s", Boolean.valueOf(C76695c.m92342c()));
        setBackBtn(new C5256a());
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str.equals("settings_teen_mode")) {
            return true;
        }
        if (!str.equals("settings_care_mode")) {
            return false;
        }
        Intent intent = new Intent(this, SettingsCareModeIntro.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingCustomModeUI", "goToCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingCustomModeUI", "goToCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public void onResume() {
        super.onResume();
        Preference a = this.f20791d.mo72519a("settings_care_mode");
        if (C76695c.m92341b()) {
            a.mo7741E(getString(C0966R.string.ini));
        } else {
            a.mo7741E(getString(C0966R.string.iot));
        }
    }
}
