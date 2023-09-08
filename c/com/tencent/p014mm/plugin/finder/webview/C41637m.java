package com.tencent.p014mm.plugin.finder.webview;

import android.content.Context;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ExpandableScrollFrameLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import gy3.C87412m;
import pf1.C11920q;
import rs1.C13351o4;
import rs1.C13363p4;
import rs1.C48085q4;
import zs1.C39444l;
import zs1.C53810h;

/* renamed from: com.tencent.mm.plugin.finder.webview.m */
public final class C41637m {
    /* renamed from: a */
    public static final void m44984a(Context context, String str, C11920q qVar, RecyclerViewDrawerSquares.C45117c cVar, C39444l lVar, int i, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(lVar, "scConfig");
        C48085q4 q4Var = (C48085q4) C39818r.f106831a.mo62443b(context).mo75002a(C48085q4.class);
        q4Var.getClass();
        if (!FinderWebViewScrollViewWrapper.f111982m) {
            C13363p4 p4Var = new C13363p4(context, qVar);
            C53810h hVar = new C53810h(context, lVar);
            hVar.setListener(cVar);
            FinderWebViewScrollViewWrapper finderWebViewScrollViewWrapper = new FinderWebViewScrollViewWrapper(context, str, hVar, i, str2);
            finderWebViewScrollViewWrapper.f111991i = p4Var;
            finderWebViewScrollViewWrapper.f111988f = false;
            C13351o4 o4Var = new C13351o4(context, qVar);
            ScrollFrameLayout scrollFrameLayout = finderWebViewScrollViewWrapper.f111992j.f151029l;
            ExpandableScrollFrameLayout expandableScrollFrameLayout = scrollFrameLayout instanceof ExpandableScrollFrameLayout ? (ExpandableScrollFrameLayout) scrollFrameLayout : null;
            if (expandableScrollFrameLayout != null) {
                expandableScrollFrameLayout.setScrollToTopListener(o4Var);
            }
            finderWebViewScrollViewWrapper.mo64759c();
            q4Var.f128939d = finderWebViewScrollViewWrapper;
        }
    }
}
