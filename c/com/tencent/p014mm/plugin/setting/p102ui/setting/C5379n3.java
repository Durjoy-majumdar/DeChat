package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import f40.C86709a0;
import xm2.C15861n;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.n3 */
public class C5379n3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C15861n f21028d;

    public C5379n3(SettingsTrustFriendUI settingsTrustFriendUI, C15861n nVar) {
        this.f21028d = nVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f21028d);
    }
}
