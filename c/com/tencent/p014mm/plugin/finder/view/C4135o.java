package com.tencent.p014mm.plugin.finder.view;

import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.o */
public final class C4135o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CollapsibleTextView f18356d;

    /* renamed from: e */
    public final /* synthetic */ boolean f18357e;

    public C4135o(CollapsibleTextView collapsibleTextView, boolean z) {
        this.f18356d = collapsibleTextView;
        this.f18357e = z;
    }

    public final void run() {
        C32227p<Boolean, Boolean, C13598b0> onExpandStateChangeListener = this.f18356d.getOnExpandStateChangeListener();
        if (onExpandStateChangeListener != null) {
            onExpandStateChangeListener.invoke(Boolean.valueOf(this.f18357e), Boolean.valueOf(this.f18356d.f17601o.getVisibility() == 0));
        }
    }
}
