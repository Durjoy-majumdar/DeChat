package com.tencent.p014mm.loader.cache.memory;

import gy3.C87412m;
import s60.C101535a;
import w60.C65941g;
import x60.C102564a;

/* renamed from: com.tencent.mm.loader.cache.memory.b */
public abstract class C92699b<T, R> {
    /* renamed from: a */
    public abstract C65941g<R> mo126884a(C102564a<T> aVar, C101535a<R> aVar2);

    /* renamed from: b */
    public String mo126887b(C102564a<T> aVar, C101535a<R> aVar2) {
        if (aVar == null) {
            return null;
        }
        if (!(aVar.f301995a != null)) {
            return null;
        }
        if (aVar2 != null) {
            String aVar3 = aVar.toString();
            C87412m.m108593f(aVar3, "uriValue.toString()");
            String b = aVar2.mo139548b(aVar3);
            if (b != null) {
                return b;
            }
        }
        String aVar4 = aVar.toString();
        C87412m.m108593f(aVar4, "uriValue.toString()");
        return aVar4;
    }

    /* renamed from: c */
    public abstract void mo126885c(C102564a<T> aVar, C101535a<R> aVar2, R r);

    /* renamed from: d */
    public abstract void mo126886d(C102564a<T> aVar, C101535a<R> aVar2);

    /* renamed from: e */
    public void mo126888e(C65941g<R> gVar, C102564a<T> aVar, C101535a<R> aVar2) {
    }
}
