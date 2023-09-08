package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsLuckyMoneyQunZhongKVReportEvent */
public final class SnsLuckyMoneyQunZhongKVReportEvent extends IEvent {

    /* renamed from: d */
    public C1141a f9521d = new C1141a();

    /* renamed from: com.tencent.mm.autogen.events.SnsLuckyMoneyQunZhongKVReportEvent$a */
    public static final class C1141a {
    }

    public SnsLuckyMoneyQunZhongKVReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsLuckyMoneyQunZhongKVReportEvent)) {
            return false;
        }
        C1141a aVar = ((SnsLuckyMoneyQunZhongKVReportEvent) iEvent).f9521d;
        this.f9521d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
