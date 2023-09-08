package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.j1 */
public class C71147j1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBoxPreference f205943d;

    /* renamed from: e */
    public final /* synthetic */ boolean f205944e;

    /* renamed from: f */
    public final /* synthetic */ SettingsAboutSystemUI f205945f;

    public C71147j1(SettingsAboutSystemUI settingsAboutSystemUI, CheckBoxPreference checkBoxPreference, boolean z) {
        this.f205945f = settingsAboutSystemUI;
        this.f205943d = checkBoxPreference;
        this.f205944e = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f205943d.mo6805K(this.f205944e);
        this.f205945f.f205662d.notifyDataSetChanged();
    }
}
