package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.v1 */
public final class C5404v1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsAuthUI f21090d;

    public C5404v1(SettingsAuthUI settingsAuthUI) {
        this.f21090d = settingsAuthUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107140d(1, this.f21090d.getResources().getColor(C0966R.color.a_3), this.f21090d.getResources().getString(C0966R.string.iq7));
    }
}
