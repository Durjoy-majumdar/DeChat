package com.tencent.p014mm.plugin.card.p031ui;

import cc0.C92411b;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p702ts.C78085c;

/* renamed from: com.tencent.mm.plugin.card.ui.r */
public class C40870r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageUI f109910d;

    public C40870r(CardHomePageUI cardHomePageUI) {
        this.f109910d = cardHomePageUI;
    }

    public void run() {
        Class cls = C78085c.class;
        CardHomePageUI cardHomePageUI = this.f109910d;
        int i = CardHomePageUI.f109757P;
        cardHomePageUI.getClass();
        cardHomePageUI.f109709q = ((C78085c) C86312j.m106911c(cls)).mo108056ms();
        CardHomePageUI cardHomePageUI2 = this.f109910d;
        if (cardHomePageUI2.f109709q == null) {
            cardHomePageUI2.f109709q = ((C78085c) C86312j.m106911c(cls)).mo108056ms();
        }
        C92411b bVar = cardHomePageUI2.f109709q;
        if (bVar != null) {
            bVar.mo126407a(cardHomePageUI2.f109713u, true);
            C5139t.m5183e(22, 10);
        }
        this.f109910d.f109771N = true;
        Log.m105918d("MicroMsg.CardHomePageUI", "initLocation end");
    }
}
