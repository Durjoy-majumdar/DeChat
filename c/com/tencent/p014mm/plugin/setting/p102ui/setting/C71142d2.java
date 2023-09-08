package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.d2 */
public class C71142d2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ boolean f205934a;

    /* renamed from: b */
    public final /* synthetic */ CheckBoxPreference f205935b;

    /* renamed from: c */
    public final /* synthetic */ SettingsChattingUI f205936c;

    public C71142d2(SettingsChattingUI settingsChattingUI, boolean z, CheckBoxPreference checkBoxPreference) {
        this.f205936c = settingsChattingUI;
        this.f205934a = z;
        this.f205935b = checkBoxPreference;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        if (z) {
            Log.m105919d("MicroMsg.SettingsChattingUI", "set enter button send : %s", Boolean.valueOf(this.f205934a));
            C86709a0.m107535s().mo121142i().mo119676J(66832, Boolean.valueOf(this.f205934a));
            return;
        }
        this.f205935b.mo6805K(false);
        this.f205936c.f205711d.notifyDataSetChanged();
    }
}
