package com.tencent.p014mm.plugin.appbrand.launching;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.c */
public final class C83297c {

    /* renamed from: a */
    public static final C83297c f243433a = new C83297c();

    /* renamed from: b */
    public static final CopyOnWriteArrayList<C83302d> f243434b = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final C83302d mo115594a(int i, String str) {
        C87412m.m108594g(str, "instanceId");
        CopyOnWriteArrayList<C83302d> copyOnWriteArrayList = f243434b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C83302d dVar = (C83302d) next;
            if (dVar.f243452b != i || !C87412m.m108589b(dVar.f243451a, str)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return (C83302d) arrayList.get(0);
        }
        return null;
    }
}
