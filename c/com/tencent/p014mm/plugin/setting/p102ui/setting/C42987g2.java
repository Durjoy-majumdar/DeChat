package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.g2 */
public final class C42987g2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsDelAuthUI f116397d;

    public C42987g2(SettingsDelAuthUI settingsDelAuthUI) {
        this.f116397d = settingsDelAuthUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107140d(1, this.f116397d.getResources().getColor(C0966R.color.a_3), this.f116397d.getResources().getString(C0966R.string.iq7));
    }
}
