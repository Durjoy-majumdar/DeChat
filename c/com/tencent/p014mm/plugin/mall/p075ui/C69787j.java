package com.tencent.p014mm.plugin.mall.p075ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75592q0;
import ie3.C76331i;
import nj3.C76879j;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.mall.ui.j */
public class C69787j implements C76879j.C76888o {

    /* renamed from: a */
    public final /* synthetic */ MallIndexBaseUI f201394a;

    public C69787j(MallIndexBaseUI mallIndexBaseUI) {
        this.f201394a = mallIndexBaseUI;
    }

    /* renamed from: a */
    public void mo5759a(int i, int i2) {
        if (i2 == 0) {
            C115669n.INSTANCE.mo160131h(11458, 2);
            if (C75592q0.m90763K()) {
                C79143a.m95772k(this.f201394a.getContext(), "wallet_payu", "PayURemittanceProcess", (Bundle) null, (C79148e.C79149a) null);
            } else {
                C79143a.m95772k(this.f201394a.getContext(), "remittance", "RemittanceProcess", (Bundle) null, (C79148e.C79149a) null);
            }
        } else if (i2 == 1) {
            C115669n.INSTANCE.mo160131h(11458, 3);
            C76331i.m91765i(this.f201394a, 2);
        }
    }
}
