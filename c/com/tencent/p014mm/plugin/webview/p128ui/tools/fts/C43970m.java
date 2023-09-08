package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import u73.C52466o0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.m */
public class C43970m implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f119108d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f119109e;

    public C43970m(C43973p pVar, List list, C77407n nVar) {
        this.f119108d = list;
        this.f119109e = nVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        for (int i = 0; i < this.f119108d.size(); i++) {
            C52466o0 o0Var = (C52466o0) this.f119108d.get(i);
            e0Var.mo107154n(i, o0Var.f146601b, o0Var.f146602c, 0);
            if (o0Var.f146603d) {
                this.f119109e.f225786q1 = i;
            }
        }
    }
}
