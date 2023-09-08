package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.model.g */
public final class C19445g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f54935d;

    /* renamed from: e */
    public final /* synthetic */ int f54936e;

    public C19445g(C19623o0 o0Var, int i) {
        this.f54935d = o0Var;
        this.f54936e = i;
    }

    public final void run() {
        C19428d dVar = C19428d.f54856a;
        C19623o0 o0Var = this.f54935d;
        int i = this.f54936e;
        C87412m.m108594g(o0Var, "info");
        long j = dVar.mo25175j(o0Var);
        boolean z = o0Var.f55527l1;
        o0Var.f55527l1 = false;
        int h = dVar.mo25174h(o0Var.field_talker);
        String f = dVar.mo25172f(o0Var.field_talker);
        Log.m105926v("MicroMsg.BizFinderLiveLogic", "reportCardTitleLive talker = " + o0Var.field_talker + " exportId = " + f);
        if (!(f == null || C112551y.m153811k(f))) {
            C115669n.INSTANCE.mo160131h(23056, o0Var.field_talker, Long.valueOf(j), Long.valueOf(o0Var.f55526k1), Integer.valueOf(i), f, Integer.valueOf(z ? 1 : 0), Integer.valueOf(h));
        }
    }
}
