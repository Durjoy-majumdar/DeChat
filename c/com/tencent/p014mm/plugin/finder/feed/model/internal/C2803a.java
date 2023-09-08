package com.tencent.p014mm.plugin.finder.feed.model.internal;

import gy3.C87412m;
import tf1.C13910j;
import tf1.C13914m;
import tf1.C13915n;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.a */
public final class C2803a implements C13910j<C13914m> {

    /* renamed from: d */
    public final /* synthetic */ BaseFeedLoader<C13914m> f14030d;

    /* renamed from: e */
    public final /* synthetic */ C13910j<C13914m> f14031e;

    public C2803a(BaseFeedLoader<C13914m> baseFeedLoader, C13910j<C13914m> jVar) {
        this.f14030d = baseFeedLoader;
        this.f14031e = jVar;
    }

    public void onFetchDone(IResponse<C13914m> iResponse) {
        C87412m.m108594g(iResponse, "response");
        C13915n access$getPreload$p = this.f14030d.preload;
        if (access$getPreload$p != null) {
            access$getPreload$p.mo13387c(iResponse);
        }
        C13910j<C13914m> jVar = this.f14031e;
        if (jVar != null) {
            jVar.onFetchDone(iResponse);
        }
    }
}
