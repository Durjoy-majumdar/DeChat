package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.m3 */
public final class C4103m3 extends C87413o implements C32224a<FinderImageBanner> {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaLayout f18257d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4103m3(FinderMediaLayout finderMediaLayout) {
        super(0);
        this.f18257d = finderMediaLayout;
    }

    public Object invoke() {
        this.f18257d.getMediaType();
        Context context = this.f18257d.getContext();
        C87412m.m108593f(context, "context");
        return new FinderImageBanner(context);
    }
}
