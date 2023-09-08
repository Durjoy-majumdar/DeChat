package com.tencent.p014mm.plugin.gamelive.playgame;

import hl0.j$$b;
import kz1.C88349l;
import qo3.w$$d;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.a$$a */
public final /* synthetic */ class a$$a implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ C85232a f248316a;

    public /* synthetic */ a$$a(C85232a aVar) {
        this.f248316a = aVar;
    }

    public final void onDismiss() {
        C88349l.C88350a aVar = this.f248316a.f248314o;
        if (aVar != null) {
            ((j$$b) aVar).mo122013a(0, 0, true);
        }
    }
}
