package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.g1 */
public class C72389g1 implements EditHintPasswdView.C75206c {

    /* renamed from: a */
    public final /* synthetic */ C72379f1 f210596a;

    public C72389g1(C72379f1 f1Var) {
        this.f210596a = f1Var;
    }

    public void onInputValidChange(boolean z) {
        if (z) {
            this.f210596a.mo99740d();
            C115669n.INSTANCE.mo160131h(11977, 0, 0, 0, 0, 0, 0);
        }
    }
}
