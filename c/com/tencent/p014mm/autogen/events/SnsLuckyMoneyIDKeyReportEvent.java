package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent */
public final class SnsLuckyMoneyIDKeyReportEvent extends IEvent {

    /* renamed from: d */
    public C28828a f78993d = new C28828a();

    /* renamed from: com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent$a */
    public static final class C28828a {

        /* renamed from: a */
        public int f78994a;

        /* renamed from: b */
        public int f78995b;

        /* renamed from: c */
        public boolean f78996c;
    }

    public SnsLuckyMoneyIDKeyReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsLuckyMoneyIDKeyReportEvent)) {
            return false;
        }
        C28828a aVar = ((SnsLuckyMoneyIDKeyReportEvent) iEvent).f78993d;
        return C46238a.m51546a(Integer.valueOf(this.f78993d.f78994a), Integer.valueOf(aVar.f78994a)) && C46238a.m51546a(Integer.valueOf(this.f78993d.f78995b), Integer.valueOf(aVar.f78995b)) && C46238a.m51546a(Boolean.valueOf(this.f78993d.f78996c), Boolean.valueOf(aVar.f78996c));
    }
}
