package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.autogen.events.FinderLiveSwitchEvent;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.d */
public class C18455d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSwitchEvent f51228d;

    /* renamed from: e */
    public final /* synthetic */ BizTimeLineHotListView.C184252 f51229e;

    public C18455d(BizTimeLineHotListView.C184252 r1, FinderLiveSwitchEvent finderLiveSwitchEvent) {
        this.f51229e = r1;
        this.f51228d = finderLiveSwitchEvent;
    }

    public void run() {
        BizTimeLineHotListView.this.mo23001H1((String) null, this.f51228d.f154791d.f154793b);
    }
}
