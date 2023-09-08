package com.tencent.p014mm.plugin.appbrand.page;

import android.view.ViewGroup;
import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x$$d */
public class x$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83966x f245137d;

    public x$$d(C83966x xVar) {
        this.f245137d = xVar;
    }

    public void run() {
        C83966x xVar = this.f245137d;
        if (!xVar.f245129W && xVar.getCurrentPageView() != null && !xVar.f245128V && "top".equals(xVar.f245122P.getPosition()) && (xVar.f245122P.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xVar.f245122P.getLayoutParams();
            C79808b bVar = xVar.getCurrentPageView().f244554F;
            int top = bVar.getTop() + bVar.getMeasuredHeight();
            if (marginLayoutParams.topMargin != top) {
                marginLayoutParams.topMargin = top;
                xVar.f245122P.setLayoutParams(marginLayoutParams);
                xVar.post(new C83973y(xVar));
            }
            C83780d1 currentPageView = xVar.getCurrentPageView();
            int measuredHeight = xVar.f245122P.getMeasuredHeight();
            if (!currentPageView.f244575V0 && (currentPageView.f244553E.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) currentPageView.f244553E.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != measuredHeight) {
                    marginLayoutParams2.bottomMargin = measuredHeight;
                    currentPageView.f244553E.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }
}
