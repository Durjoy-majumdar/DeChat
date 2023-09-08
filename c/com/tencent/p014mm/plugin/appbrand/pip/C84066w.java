package com.tencent.p014mm.plugin.appbrand.pip;

import android.graphics.Point;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.w */
public class C84066w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Point f245447d;

    /* renamed from: e */
    public final /* synthetic */ C84059t.C84062c f245448e;

    public C84066w(C84059t.C84062c cVar, Point point) {
        this.f245448e = cVar;
        this.f245447d = point;
    }

    public void run() {
        AppBrandPipContainerView appBrandPipContainerView = C84059t.this.f245419e;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.setStablePos(this.f245447d);
        }
    }
}
