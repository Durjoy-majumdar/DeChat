package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import fy3.C32224a;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.card.ui.v3.a */
public final class C18683a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageV3UI f52240d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f52241e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f52242f;

    public C18683a(CardHomePageV3UI cardHomePageV3UI, C60905o oVar, C32224a<C13598b0> aVar) {
        this.f52240d = cardHomePageV3UI;
        this.f52241e = oVar;
        this.f52242f = aVar;
    }

    public final void run() {
        this.f52240d.f52099w = this.f52241e.f44854d.getHeight();
        this.f52240d.f52100x = this.f52241e.f44854d.getWidth();
        this.f52242f.invoke();
    }
}
