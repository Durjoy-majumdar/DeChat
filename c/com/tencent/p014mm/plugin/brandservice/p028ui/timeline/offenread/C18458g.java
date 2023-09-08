package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.g */
public class C18458g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotListView.C18434e f51233d;

    /* renamed from: e */
    public final /* synthetic */ C18469s f51234e;

    /* renamed from: f */
    public final /* synthetic */ BizTimeLineHotListView f51235f;

    public C18458g(BizTimeLineHotListView bizTimeLineHotListView, BizTimeLineHotListView.C18434e eVar, C18469s sVar) {
        this.f51235f = bizTimeLineHotListView;
        this.f51233d = eVar;
        this.f51234e = sVar;
    }

    public void run() {
        BizTimeLineHotListView.m19042E1(this.f51235f, this.f51233d, this.f51234e);
    }
}
