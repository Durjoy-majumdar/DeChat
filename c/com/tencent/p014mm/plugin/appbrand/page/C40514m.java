package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import gy3.C87412m;
import uq0.C52602a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m */
public final class C40514m extends C40502j2 {

    /* renamed from: w */
    public final C52602a f108843w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40514m(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f108843w = new C52602a(new MutableContextWrapper(context));
        setFixSizeEnable(false);
    }

    /* renamed from: f */
    public void mo63312f(Context context) {
        C87412m.m108594g(context, "context");
        super.mo63312f(context);
        Context context2 = this.f108843w.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.content.MutableContextWrapper");
        ((MutableContextWrapper) context2).setBaseContext(context);
    }

    public View getWrapperView() {
        View wrapperView = super.getWrapperView();
        if (this.f108843w.getChildAt(0) != wrapperView) {
            this.f108843w.removeAllViews();
            this.f108843w.addView(wrapperView);
            this.f108843w.setLayoutParams(new SlidingPaneLayout.LayoutParams(-1, -1));
        }
        return this.f108843w;
    }

    public final void setFixSizeEnable(boolean z) {
        if (supportSetWebContentsSize()) {
            this.f108843w.setEnableFixSize(z);
        }
    }
}
