package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import gy3.C87412m;
import tf1.C13910j;
import u60.C14121l;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.p0 */
public final class C2813p0 implements C13910j<C0740i2> {

    /* renamed from: d */
    public final /* synthetic */ C13910j<C0740i2> f14050d;

    /* renamed from: e */
    public final /* synthetic */ C14121l f14051e;

    public C2813p0(C13910j<C0740i2> jVar, C14121l lVar) {
        this.f14050d = jVar;
        this.f14051e = lVar;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        this.f14050d.onFetchDone(iResponse);
        this.f14051e.mo11853b(C65234n.OK);
    }
}
