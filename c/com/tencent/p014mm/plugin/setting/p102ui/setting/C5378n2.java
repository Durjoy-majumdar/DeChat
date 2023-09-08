package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.n2 */
public class C5378n2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsModifyAliasUI f21027d;

    public C5378n2(SettingsModifyAliasUI settingsModifyAliasUI) {
        this.f21027d = settingsModifyAliasUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f21027d.f20859n);
    }
}
