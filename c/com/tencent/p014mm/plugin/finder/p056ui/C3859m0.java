package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.m0 */
public final class C3859m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17400d;

    public C3859m0(FinderCreateContactUI finderCreateContactUI) {
        this.f17400d = finderCreateContactUI;
    }

    public final void run() {
        FinderCreateContactUI finderCreateContactUI = this.f17400d;
        View view = finderCreateContactUI.f16840p;
        if (view != null) {
            finderCreateContactUI.f16835W = view.getMeasuredHeight();
        } else {
            C87412m.m108603p("scrollContainer");
            throw null;
        }
    }
}
