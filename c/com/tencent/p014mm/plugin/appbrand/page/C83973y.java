package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.page.y */
public class C83973y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83966x f245160d;

    public C83973y(C83966x xVar) {
        this.f245160d = xVar;
    }

    public void run() {
        C83966x xVar = this.f245160d;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(xVar) && (this.f245160d.f245122P.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && ((ViewGroup.MarginLayoutParams) this.f245160d.f245122P.getLayoutParams()).topMargin != this.f245160d.f245122P.getTop()) {
            this.f245160d.f245122P.requestLayout();
        }
    }
}
