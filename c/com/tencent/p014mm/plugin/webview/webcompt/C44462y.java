package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.y */
public final class C44462y {

    /* renamed from: a */
    public final ConcurrentLinkedDeque<Long> f120570a = new ConcurrentLinkedDeque<>();

    /* renamed from: a */
    public final void mo69224a(C44406b bVar) {
        C87412m.m108594g(bVar, "key");
        C115669n.INSTANCE.idkeyStat(1147, (long) bVar.f120393d, 1, false);
        ConcurrentLinkedDeque<Long> concurrentLinkedDeque = this.f120570a;
        ArrayList<Long> arrayList = new ArrayList<>();
        for (T next : concurrentLinkedDeque) {
            Long l = (Long) next;
            C87412m.m108593f(l, LocaleUtil.ITALIAN);
            if (l.longValue() > 0) {
                arrayList.add(next);
            }
        }
        for (Long l2 : arrayList) {
            C115669n nVar = C115669n.INSTANCE;
            C87412m.m108593f(l2, LocaleUtil.ITALIAN);
            nVar.idkeyStat(l2.longValue(), (long) bVar.f120393d, 1, false);
        }
    }
}
