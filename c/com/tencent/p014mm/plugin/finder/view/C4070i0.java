package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.finder.view.i0 */
public final class C4070i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderBaseMediaBanner<View> f18198d;

    public C4070i0(FinderBaseMediaBanner<View> finderBaseMediaBanner) {
        this.f18198d = finderBaseMediaBanner;
    }

    public final void run() {
        TextView textView = this.f18198d.f17629j;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
