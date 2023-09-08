package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e */
public class C18456e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C18468r f51230d;

    /* renamed from: e */
    public final /* synthetic */ BizTimeLineHotListView f51231e;

    public C18456e(BizTimeLineHotListView bizTimeLineHotListView, C18468r rVar) {
        this.f51231e = bizTimeLineHotListView;
        this.f51230d = rVar;
    }

    public void run() {
        C19428d dVar = C19428d.f54856a;
        dVar.mo25158K(this.f51230d.f354229d);
        if (Util.isNullOrNil(dVar.mo25172f(this.f51230d.f354229d))) {
            this.f51231e.mo23003J1(this.f51230d);
        }
    }
}
