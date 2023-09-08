package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.z0 */
public class C72480z0 implements EditHintPasswdView.C75206c {

    /* renamed from: a */
    public final /* synthetic */ C72338c1 f210838a;

    public C72480z0(C72338c1 c1Var) {
        this.f210838a = c1Var;
    }

    public void onInputValidChange(boolean z) {
        if (z) {
            this.f210838a.mo99672d();
            C115669n.INSTANCE.mo160131h(11977, 0, 0, 0, 0, 0, 0);
        }
    }
}
