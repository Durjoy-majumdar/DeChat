package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import fy3.C32224a;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.card.ui.v3.g */
public final class C18687g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VipCardListUI f52252d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f52253e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f52254f;

    public C18687g(VipCardListUI vipCardListUI, C60905o oVar, C32224a<C13598b0> aVar) {
        this.f52252d = vipCardListUI;
        this.f52253e = oVar;
        this.f52254f = aVar;
    }

    public final void run() {
        this.f52252d.f52197M = this.f52253e.f44854d.getHeight();
        this.f52252d.f52198N = this.f52253e.f44854d.getWidth();
        this.f52254f.invoke();
    }
}
