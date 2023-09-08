package com.tencent.p014mm.plugin.finder.p056ui;

import gy3.C87412m;
import java.util.Comparator;
import z20.C112579f;

/* renamed from: com.tencent.mm.plugin.finder.ui.r2 */
public final class C56418r2<T> implements Comparator {

    /* renamed from: d */
    public static final C56418r2<T> f161281d = new C56418r2<>();

    public int compare(Object obj, Object obj2) {
        C112579f fVar = (C112579f) obj;
        C112579f fVar2 = (C112579f) obj2;
        C87412m.m108594g(fVar, "o1");
        C87412m.m108594g(fVar2, "o2");
        int compare = Float.compare(fVar.f337069i.y, fVar2.f337069i.y);
        return compare == 0 ? Float.compare(fVar.f337069i.x, fVar2.f337069i.x) : compare;
    }
}
