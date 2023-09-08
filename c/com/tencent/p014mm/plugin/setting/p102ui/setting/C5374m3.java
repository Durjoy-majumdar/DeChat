package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import f40.C86709a0;
import xm2.C15859h;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.m3 */
public class C5374m3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C15859h f21017d;

    public C5374m3(SettingsTrustFriendUI settingsTrustFriendUI, C15859h hVar) {
        this.f21017d = hVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f21017d);
    }
}
