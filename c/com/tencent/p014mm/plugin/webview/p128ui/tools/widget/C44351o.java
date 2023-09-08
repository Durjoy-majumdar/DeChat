package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.o */
public final class C44351o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ HalfScreenWebView f120205d;

    /* renamed from: e */
    public final /* synthetic */ Configuration f120206e;

    public C44351o(HalfScreenWebView halfScreenWebView, Configuration configuration) {
        this.f120205d = halfScreenWebView;
        this.f120206e = configuration;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        this.f120205d.f119789J.onConfigurationChanged(this.f120206e);
        HalfScreenWebView halfScreenWebView = this.f120205d;
        View view = halfScreenWebView.f126904h;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            layoutParams.height = halfScreenWebView.mo23875F();
            View view2 = halfScreenWebView.f126904h;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
        }
        this.f120205d.mo68882P();
        View view3 = this.f120205d.f126903g;
        if (view3 != null) {
            view3.requestLayout();
        }
    }
}
