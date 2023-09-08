package com.tencent.p014mm.wallet_core.p137ui;

import gy3.C87412m;
import java.util.Comparator;

/* renamed from: com.tencent.mm.wallet_core.ui.f0 */
public final class C75203f0<T> implements Comparator {

    /* renamed from: d */
    public static final C75203f0<T> f221246d = new C75203f0<>();

    public int compare(Object obj, Object obj2) {
        C75216g0 g0Var = (C75216g0) obj;
        C75216g0 g0Var2 = (C75216g0) obj2;
        int i = C87412m.m108596i(g0Var.f221315a.f225223a, g0Var2.f221315a.f225223a);
        return i != 0 ? i : g0Var.f221315a.f225224b.compareTo(g0Var2.f221315a.f225224b);
    }
}
