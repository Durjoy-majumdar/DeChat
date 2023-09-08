package com.tencent.p014mm.plugin.collect.reward.p037ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.b */
public class C68827b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ QrRewardMainUI f197746d;

    public C68827b(QrRewardMainUI qrRewardMainUI) {
        this.f197746d = qrRewardMainUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        String string = this.f197746d.getString(C0966R.string.hpk);
        QrRewardMainUI qrRewardMainUI = this.f197746d;
        int i = QrRewardMainUI.f197698I;
        String str = "";
        e0Var.mo107154n(1, string, qrRewardMainUI.mo94657I7() ? this.f197746d.getString(C0966R.string.hpq) : str, 0);
        String string2 = this.f197746d.getString(C0966R.string.hpl);
        if (!this.f197746d.mo94657I7()) {
            str = this.f197746d.getString(C0966R.string.hpq);
        }
        e0Var.mo107154n(2, string2, str, 0);
    }
}
