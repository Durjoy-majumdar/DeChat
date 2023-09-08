package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.n1 */
public class C71149n1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsAboutSystemUI f205946d;

    public C71149n1(SettingsAboutSystemUI settingsAboutSystemUI) {
        this.f205946d = settingsAboutSystemUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f205946d.getDefaultSharedPreferences().edit().putBoolean("settings_voicerecorder_mode", true).commit();
        ((CheckBoxPreference) this.f205946d.f205662d.mo72519a("settings_voicerecorder_mode")).mo6805K(true);
        this.f205946d.f205662d.notifyDataSetChanged();
    }
}
