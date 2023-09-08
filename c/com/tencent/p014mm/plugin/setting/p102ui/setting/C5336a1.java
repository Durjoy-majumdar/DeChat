package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.a1 */
public class C5336a1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsAboutMicroMsgUI f20969d;

    public C5336a1(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f20969d = settingsAboutMicroMsgUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f20969d;
        if (settingsAboutMicroMsgUI.f248980u) {
            e0Var.mo107142f(0, settingsAboutMicroMsgUI.getString(C0966R.string.ipl));
        }
        SettingsAboutMicroMsgUI settingsAboutMicroMsgUI2 = this.f20969d;
        if (settingsAboutMicroMsgUI2.f248981v) {
            e0Var.mo107142f(1, settingsAboutMicroMsgUI2.getString(C0966R.string.ipk));
        }
    }
}
