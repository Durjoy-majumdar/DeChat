package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p645pj.C77091b;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI */
public class SettingsSpecialSceneNotificationUI extends MMPreference {

    /* renamed from: d */
    public C47511g f205813d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI$a */
    public class C71088a implements MenuItem.OnMenuItemClickListener {
        public C71088a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSpecialSceneNotificationUI.this.hideVKB();
            SettingsSpecialSceneNotificationUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8964cj;
    }

    public void initView() {
        C47511g preferenceScreen = getPreferenceScreen();
        this.f205813d = preferenceScreen;
        preferenceScreen.removeAll();
        this.f205813d.mo72520b(getResourceId());
        this.f205813d.mo72529n("settings_specail_scene_sound", false);
        SharedPreferences s = C77091b.m93037s();
        ((CheckBoxPreference) this.f205813d.mo72519a("settings_specail_scene_sound")).mo6805K(s.getBoolean("settings_special_scene_sound", s.getBoolean("settings_sound", true)));
        this.f205813d.mo72529n("settings_specail_scene_shake", false);
        SharedPreferences s2 = C77091b.m93037s();
        ((CheckBoxPreference) this.f205813d.mo72519a("settings_specail_scene_shake")).mo6805K(s2.getBoolean("settings_special_scene_shake", s2.getBoolean("settings_shake", true)));
        setBackBtn(new C71088a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.izi);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str.equals("settings_specail_scene_sound")) {
            boolean J = ((CheckBoxPreference) preference).mo6804J();
            C77091b.m93037s().edit().putBoolean("settings_special_scene_sound", J).commit();
            Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsSoundInSpecialScene: %B", Boolean.valueOf(J));
            initView();
            return true;
        } else if (!str.equals("settings_specail_scene_shake")) {
            return false;
        } else {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
            boolean J2 = checkBoxPreference.mo6804J();
            C77091b.m93037s().edit().putBoolean("settings_special_scene_shake", J2).commit();
            Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShakeInSpecialScene: %B", Boolean.valueOf(J2));
            initView();
            Util.shake(this, checkBoxPreference.mo6804J());
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        initView();
    }
}
