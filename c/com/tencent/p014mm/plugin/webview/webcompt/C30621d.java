package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.d */
public final class C30621d implements C86011o1 {

    /* renamed from: a */
    public static final C30621d f82442a = new C30621d();

    public final boolean accept(C86009m1 m1Var) {
        C87412m.m108594g(m1Var, "filter");
        if (!m1Var.mo119978p()) {
            return false;
        }
        String name = m1Var.getName();
        C87412m.m108593f(name, "filter.name");
        if (!C112551y.m153808h(name, ".js", false, 2, (Object) null)) {
            String name2 = m1Var.getName();
            C87412m.m108593f(name2, "filter.name");
            return C112551y.m153808h(name2, ".json", false, 2, (Object) null);
        }
    }
}
