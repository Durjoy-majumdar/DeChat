package com.tencent.p014mm.plugin.finder.p056ui;

import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.finder.ui.k4 */
public final class C3853k4 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List<String> f17391d;

    /* renamed from: e */
    public final /* synthetic */ List<Integer> f17392e;

    public C3853k4(List<String> list, List<Integer> list2) {
        this.f17391d = list;
        this.f17392e = list2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        int size = this.f17391d.size();
        for (int i = 0; i < size; i++) {
            e0Var.mo107142f(this.f17392e.get(i).intValue(), this.f17391d.get(i));
        }
    }
}
