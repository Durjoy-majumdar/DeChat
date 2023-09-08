package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.m */
public final class C18463m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotView f51241d;

    /* renamed from: e */
    public final /* synthetic */ C18468r f51242e;

    public C18463m(BizTimeLineHotView bizTimeLineHotView, C18468r rVar) {
        this.f51241d = bizTimeLineHotView;
        this.f51242e = rVar;
    }

    public final void run() {
        BizTimeLineHotListView bizTimeLineHotListView = this.f51241d.f51166e;
        if (bizTimeLineHotListView != null) {
            bizTimeLineHotListView.mo23004K1(this.f51242e);
        }
    }
}
