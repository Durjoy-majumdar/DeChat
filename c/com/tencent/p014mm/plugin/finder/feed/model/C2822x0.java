package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import gy3.C87412m;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.x0 */
public final class C2822x0 {

    /* renamed from: a */
    public final int f14086a;

    /* renamed from: b */
    public final List<C0740i2> f14087b;

    /* renamed from: c */
    public final String f14088c = "Finder.LoaderCacheData";

    public C2822x0(int i, List<? extends C0740i2> list) {
        C87412m.m108594g(list, "feedList");
        this.f14086a = i;
        this.f14087b = list;
    }

    public String toString() {
        return "position:" + this.f14086a + ",feed size:" + this.f14087b.size();
    }
}
