package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.e2 */
public class C5349e2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsCreateAliasUI f20984d;

    public C5349e2(SettingsCreateAliasUI settingsCreateAliasUI) {
        this.f20984d = settingsCreateAliasUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f20984d.f20834f != null) {
            C86709a0.m107524d().mo123458d(this.f20984d.f20834f);
        }
    }
}
