package com.tencent.p014mm.plugin.expansions;

import android.content.res.AssetManager;
import fy3.C32226l;
import gy3.C87412m;
import p564iq.C87789a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.expansions.k */
public final class C85175k implements C87789a {

    /* renamed from: a */
    public final /* synthetic */ C85177m f248167a;

    public C85175k(C85177m mVar) {
        this.f248167a = mVar;
    }

    /* renamed from: a */
    public void mo118204a(AssetManager assetManager) {
        C87412m.m108594g(assetManager, "assetManager");
        C32226l<? super AssetManager, C13598b0> lVar = this.f248167a.f248170b;
        if (lVar != null) {
            lVar.invoke(assetManager);
        }
    }
}
