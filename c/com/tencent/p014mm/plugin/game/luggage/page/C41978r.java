package com.tencent.p014mm.plugin.game.luggage.page;

import w93.C15055c;
import w93.C53091f;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.r */
public class C41978r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C41979s f113080d;

    public C41978r(C41979s sVar) {
        this.f113080d = sVar;
    }

    public void run() {
        C41978r.super.mo65802j();
        GameWebPage gameWebPage = this.f113080d.f113082b;
        if (!gameWebPage.f148261n.getBoolean("from_bag", false) && !gameWebPage.f112971q1) {
            C15055c.m14224b(gameWebPage.mo65796d0(), gameWebPage);
        }
        if (!gameWebPage.f112971q1) {
            C53091f remove = C53091f.f148164t.remove(gameWebPage.mo67941t());
        }
    }
}
