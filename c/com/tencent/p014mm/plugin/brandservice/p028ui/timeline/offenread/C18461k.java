package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.autogen.events.BizDeleteContactEvent;
import gy3.C87412m;
import java.util.Iterator;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.k */
public final class C18461k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotView f51238d;

    /* renamed from: e */
    public final /* synthetic */ BizDeleteContactEvent f51239e;

    public C18461k(BizTimeLineHotView bizTimeLineHotView, BizDeleteContactEvent bizDeleteContactEvent) {
        this.f51238d = bizTimeLineHotView;
        this.f51239e = bizDeleteContactEvent;
    }

    public final void run() {
        C18468r rVar;
        Iterator<C18468r> it = this.f51238d.f51172n.iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = it.next();
            String str = this.f51239e.f107367d.f107368a;
            C87412m.m108591d(rVar);
            if (C87412m.m108589b(str, rVar.f354229d)) {
                break;
            }
        }
        if (rVar != null) {
            this.f51238d.f51172n.remove(rVar);
        }
        BizTimeLineHotView bizTimeLineHotView = this.f51238d;
        bizTimeLineHotView.getClass();
        C61926c.m72668M(new C18462l(bizTimeLineHotView));
    }
}
