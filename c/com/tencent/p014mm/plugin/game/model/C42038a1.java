package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.plugin.game.luggage.page.C41962j;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.game.model.a1 */
public class C42038a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53133t f113247d;

    public C42038a1(C53133t tVar) {
        this.f113247d = tVar;
    }

    public void run() {
        ((C41962j) this.f113247d.mo73819g()).onResume();
        ((C41962j) this.f113247d.mo73819g()).setBlockNetworkImage(false);
    }
}
