package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import pj3.C47510b;
import yl3.C53534a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.a3 */
public class C42982a3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f116386d;

    /* renamed from: e */
    public final /* synthetic */ SettingsPrivacyUI f116387e;

    public C42982a3(SettingsPrivacyUI settingsPrivacyUI, int i) {
        this.f116387e = settingsPrivacyUI;
        this.f116386d = i;
    }

    public void run() {
        SettingsPrivacyUI settingsPrivacyUI = this.f116387e;
        View v = ((C47510b) settingsPrivacyUI.f205770d).mo72518v(this.f116386d, settingsPrivacyUI.getListView());
        if (v != null) {
            C53534a.m60078a(this.f116387e.getContext(), v);
        }
    }
}
