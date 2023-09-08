package com.tencent.p014mm.plugin.appbrand.jsapi.container;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import cl0.C80072u;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView */
public class AppBrandNativeContainerView extends FrameLayout implements C80072u {

    /* renamed from: d */
    public boolean f241362d;

    public AppBrandNativeContainerView(Context context) {
        super(context);
    }

    public void setFullscreenWithChild(boolean z) {
        this.f241362d = z;
    }

    public AppBrandNativeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppBrandNativeContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
