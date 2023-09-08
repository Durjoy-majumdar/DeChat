package com.tencent.p014mm.plugin.account.p024ui;

import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.account.ui.e1 */
public class C40421e1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f108642d;

    public C40421e1(C115132k1 k1Var, List list) {
        this.f108642d = list;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.size() == 0) {
            for (C76875f0 t : this.f108642d) {
                e0Var.mo107174t(t);
            }
        }
    }
}
