package com.tencent.p014mm.plugin.finder.webview;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zs1.C53815m;

/* renamed from: com.tencent.mm.plugin.finder.webview.t */
public final class C41644t extends C87413o implements C32226l<C53815m.C39445a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderWebViewScrollViewWrapper f112089d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41644t(FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper) {
        super(1);
        this.f112089d = finderWebViewScrollViewWrapper;
    }

    public Object invoke(Object obj) {
        C53815m.C39445a aVar = (C53815m.C39445a) obj;
        C87412m.m108594g(aVar, "debugInfo");
        C41647w wVar = this.f112089d.f111993k;
        FinderWebViewHelper finderWebViewHelper = wVar instanceof FinderWebViewHelper ? (FinderWebViewHelper) wVar : null;
        if (finderWebViewHelper == null) {
            return null;
        }
        finderWebViewHelper.reloadUrl(aVar.f105951a);
        return C13598b0.f38549a;
    }
}
