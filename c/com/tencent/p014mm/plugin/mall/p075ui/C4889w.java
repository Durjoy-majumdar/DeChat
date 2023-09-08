package com.tencent.p014mm.plugin.mall.p075ui;

import b63.C0248u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.mall.ui.w */
public class C4889w implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ MallIndexUIv2 f19975d;

    public C4889w(MallIndexUIv2 mallIndexUIv2) {
        this.f19975d = mallIndexUIv2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        for (int i = 0; i < this.f19975d.f201289K.size(); i++) {
            C0248u uVar = this.f19975d.f201289K.get(i);
            e0Var.mo107142f(i, uVar.f786a);
            int i2 = uVar.f787b;
            if (i2 == 9) {
                C115669n.INSTANCE.mo160131h(23388, 1, 1);
            } else if (i2 == 5) {
                C115669n.INSTANCE.mo160131h(23388, 1, 2);
            }
        }
    }
}
