package com.tencent.p014mm.plugin.game.luggage.page;

import android.view.View;
import di3.C86312j;
import e51.C45547h;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.h */
public class C4564h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f19307d;

    /* renamed from: e */
    public final /* synthetic */ C41954g f19308e;

    public C4564h(C41954g gVar, boolean z) {
        this.f19308e = gVar;
        this.f19307d = z;
    }

    public void run() {
        if (this.f19307d) {
            this.f19308e.mo65850m();
            return;
        }
        C41954g gVar = this.f19308e;
        synchronized (gVar) {
            View view = gVar.f113013J;
            if (!(view == null || view.getParent() == null)) {
                gVar.f117999o.removeView(gVar.f113013J);
            }
            gVar.f113013J = null;
            ((C45547h) C86312j.m106911c(C45547h.class)).mo70796in(gVar.f113016M);
        }
    }
}
