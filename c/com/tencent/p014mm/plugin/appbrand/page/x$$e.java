package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x$$e */
public class x$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83966x f245138d;

    public x$$e(C83966x xVar) {
        this.f245138d = xVar;
    }

    public void run() {
        C83780d1 currentPageView;
        C79808b bVar;
        C83966x xVar = this.f245138d;
        if (!xVar.f245129W && (currentPageView = xVar.getCurrentPageView()) != null && (bVar = currentPageView.f244554F) != null) {
            currentPageView.f244570T.mo125170d(bVar.getTop() + bVar.getMeasuredHeight());
        }
    }
}
