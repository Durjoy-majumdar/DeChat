package com.tencent.p014mm.plugin.finder.feed.model;

import gy3.C87412m;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.x */
public final class C2820x {

    /* renamed from: a */
    public final int f14083a;

    /* renamed from: b */
    public final HashMap<BaseFinderFeedLoader, C2821a> f14084b = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.x$a */
    public static final class C2821a {

        /* renamed from: a */
        public final List<Integer> f14085a;

        public C2821a(BaseFinderFeedLoader baseFinderFeedLoader, List<Integer> list) {
            C87412m.m108594g(baseFinderFeedLoader, "loader");
            C87412m.m108594g(list, "opList");
            this.f14085a = list;
        }
    }

    public C2820x(int i) {
        this.f14083a = i;
    }
}
