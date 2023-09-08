package com.tencent.p014mm.plugin.finder.view;

import android.view.ContextMenu;
import android.view.View;
import cj1.C0581o5;
import fj1.C45795b;
import gy3.C87412m;
import nj3.C76874e0;
import nj3.C76891l0;

/* renamed from: com.tencent.mm.plugin.finder.view.e7 */
public final class C56600e7 implements C76891l0 {

    /* renamed from: a */
    public final /* synthetic */ C0581o5 f162269a;

    /* renamed from: b */
    public final /* synthetic */ C45795b f162270b;

    public C56600e7(C0581o5 o5Var, C45795b bVar) {
        this.f162269a = o5Var;
        this.f162270b = bVar;
    }

    /* renamed from: a */
    public final void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C56608f7 f7Var = C56608f7.f162301a;
        C87412m.m108593f(e0Var, "menu");
        f7Var.mo79955d(e0Var, this.f162269a);
        if (e0Var.findItem(154) == null) {
            f7Var.mo79956e(e0Var);
        }
        f7Var.mo79954c(e0Var);
        f7Var.mo79957f(this.f162270b, e0Var, this.f162269a);
    }
}
