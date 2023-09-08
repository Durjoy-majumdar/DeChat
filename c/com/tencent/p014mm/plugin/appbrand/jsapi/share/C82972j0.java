package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import gy3.C87412m;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.j0 */
public final class C82972j0 {

    /* renamed from: a */
    public static final C101611g<String, C82970i0> f242606a = new C100308d(100);

    /* renamed from: a */
    public static final C82970i0 m101771a(String str) {
        C82970i0 i0Var;
        if (str == null || str.length() == 0) {
            return null;
        }
        C101611g<String, C82970i0> gVar = f242606a;
        synchronized (gVar) {
            i0Var = (C82970i0) ((C101062d) gVar).get(str);
        }
        return i0Var;
    }

    /* renamed from: b */
    public static final void m101772b(String str, C82970i0 i0Var) {
        C87412m.m108594g(str, "shareActionId");
        C87412m.m108594g(i0Var, "details");
        i0Var.f242600a = str;
        C101611g<String, C82970i0> gVar = f242606a;
        synchronized (gVar) {
            C82970i0 i0Var2 = (C82970i0) ((C101062d) gVar).put(str, i0Var);
        }
    }
}
