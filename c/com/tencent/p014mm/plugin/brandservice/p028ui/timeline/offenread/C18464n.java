package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import te3.mg4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.n */
public final class C18464n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotView f51243d;

    public C18464n(BizTimeLineHotView bizTimeLineHotView) {
        this.f51243d = bizTimeLineHotView;
    }

    public final void run() {
        mg4 a = C29763t.m38870a();
        a.f184323d.clear();
        a.f184323d.addAll(this.f51243d.f51172n);
        C29763t.m38872c(a);
    }
}
