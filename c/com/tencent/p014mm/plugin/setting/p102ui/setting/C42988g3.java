package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import pj3.C47510b;
import yl3.C53534a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.g3 */
public class C42988g3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f116398d;

    /* renamed from: e */
    public final /* synthetic */ SettingsSnsPrivacyUI f116399e;

    public C42988g3(SettingsSnsPrivacyUI settingsSnsPrivacyUI, int i) {
        this.f116399e = settingsSnsPrivacyUI;
        this.f116398d = i;
    }

    public void run() {
        SettingsSnsPrivacyUI settingsSnsPrivacyUI = this.f116399e;
        View v = ((C47510b) settingsSnsPrivacyUI.f205798d).mo72518v(this.f116398d, settingsSnsPrivacyUI.getListView());
        if (v != null) {
            C53534a.m60078a(this.f116399e.getContext(), v);
        }
    }
}
