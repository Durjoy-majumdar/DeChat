package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import fy3.C32224a;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q */
public final class C18333q<T> {

    /* renamed from: a */
    public final LinkedList<T> f50740a = new LinkedList<>();

    /* renamed from: b */
    public C32224a<? extends T> f50741b;

    public C18333q(C32224a<? extends T> aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f50741b = aVar;
    }

    /* renamed from: a */
    public final T mo22904a() {
        return this.f50740a.size() > 0 ? this.f50740a.remove(0) : this.f50741b.invoke();
    }

    /* renamed from: b */
    public final boolean mo22905b(T t) {
        return this.f50740a.add(t);
    }
}
