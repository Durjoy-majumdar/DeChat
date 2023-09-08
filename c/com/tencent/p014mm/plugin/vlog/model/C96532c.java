package com.tencent.p014mm.plugin.vlog.model;

import gy3.C87412m;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.vlog.model.c */
public final class C96532c<T> implements Comparator {

    /* renamed from: d */
    public static final C96532c<T> f282488d = new C96532c<>();

    public int compare(Object obj, Object obj2) {
        C96529a aVar = (C96529a) obj;
        C96529a aVar2 = (C96529a) obj2;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ABAResult");
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ABAResult");
        int i = aVar.f282485d;
        int i2 = aVar2.f282485d;
        if (i2 < i) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
