package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;

/* renamed from: com.tencent.mm.plugin.appbrand.page.b5 */
public final class C83769b5 {
    /* renamed from: a */
    public static final void m102908a(View view) {
        SwipeBackLayout swipeBackLayout = view instanceof SwipeBackLayout ? (SwipeBackLayout) view : null;
        if (swipeBackLayout != null) {
            float f = swipeBackLayout.getResources().getDisplayMetrics().density;
            swipeBackLayout.setMinVelocity(((float) 100) * f);
            swipeBackLayout.setMaxVelocity(((float) 300) * f);
            swipeBackLayout.setEdgeTrackingEnabled(1);
            swipeBackLayout.setEdgeSize((int) ((((float) 20) * f) + 0.5f));
            swipeBackLayout.setEdgeTrackingEnabled(1);
            swipeBackLayout.setScrimColor(0);
        }
    }
}
