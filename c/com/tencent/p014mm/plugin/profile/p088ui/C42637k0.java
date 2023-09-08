package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.C0966R;
import eb0.C45628s0;
import nj3.C11182m0;
import nj3.C76874e0;
import p248ug.C52558c;

/* renamed from: com.tencent.mm.plugin.profile.ui.k0 */
public class C42637k0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C42660o0 f115415d;

    public C42637k0(C42660o0 o0Var) {
        this.f115415d = o0Var;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C52558c cVar = this.f115415d.f115490g;
        if (cVar == null || !cVar.mo72811g1()) {
            C52558c cVar2 = this.f115415d.f115490g;
            if (cVar2 == null || !cVar2.mo73502t2()) {
                e0Var.mo107125a(1, C0966R.string.bqj);
                e0Var.mo107125a(2, C0966R.string.bk5);
                if (!C45628s0.m50757V(this.f115415d.f115489f.getUsername())) {
                    e0Var.mo107125a(3, C0966R.string.anx);
                    e0Var.mo107125a(4, C0966R.string.bl6);
                }
                e0Var.mo107125a(5, C0966R.string.bjn);
                return;
            }
            e0Var.mo107125a(5, C0966R.string.bjn);
            return;
        }
        e0Var.mo107125a(1, C0966R.string.bqj);
        e0Var.mo107125a(4, C0966R.string.bl6);
        e0Var.mo107125a(5, C0966R.string.bjn);
    }
}
