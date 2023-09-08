package com.tencent.p014mm.plugin.finder.view;

import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import eb0.C75592q0;
import er1.C58784w3;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.view.q */
public final class C56646q implements C11182m0 {

    /* renamed from: d */
    public C55033u f162374d;

    /* renamed from: e */
    public final String f162375e;

    public C56646q(C55033u uVar, String str) {
        C87412m.m108594g(uVar, "commentItem");
        C87412m.m108594g(str, "feedUsername");
        this.f162374d = uVar;
        this.f162375e = str;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C87412m.m108594g(e0Var, "menu");
        C58784w3 w3Var = C58784w3.f168295a;
        if (w3Var.mo83899R0(this.f162375e)) {
            boolean z = false;
            e0Var.mo107125a(0, C0966R.string.f7936wt);
            if (!C87412m.m108589b(this.f162374d.f154492d.getUsername(), C66785b.f191882e.mo90662O5()) && !C87412m.m108589b(this.f162374d.f154492d.getUsername(), C75592q0.m90789s())) {
                z = true;
            }
            if (z) {
                e0Var.mo107125a(2, C0966R.string.f7968xs);
            }
            e0Var.mo107125a(1, C0966R.string.f7944x1);
            if (z && w3Var.mo83899R0(this.f162375e)) {
                if (this.f162374d.f154492d.mo89529l2() == 0) {
                    if (!this.f162374d.f154492d.mo89522A2()) {
                        e0Var.mo107125a(3, C0966R.string.d0c);
                    } else if (C37521f.f99374d.mo61180f()) {
                        e0Var.mo107125a(3, C0966R.string.d0c);
                    }
                } else if (this.f162374d.f154492d.mo89529l2() != 1) {
                } else {
                    if (!this.f162374d.f154492d.mo89522A2()) {
                        e0Var.mo107125a(4, C0966R.string.loe);
                    } else if (C37521f.f99374d.mo61180f()) {
                        e0Var.mo107125a(4, C0966R.string.loe);
                    }
                }
            }
        }
    }
}
