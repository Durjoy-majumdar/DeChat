package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportAdH5LoadEvent */
public final class ReportAdH5LoadEvent extends IEvent {

    /* renamed from: d */
    public C40160a f107740d = new C40160a();

    /* renamed from: com.tencent.mm.autogen.events.ReportAdH5LoadEvent$a */
    public static final class C40160a {

        /* renamed from: a */
        public SnsAdClick f107741a;

        /* renamed from: b */
        public String f107742b;

        /* renamed from: c */
        public int f107743c;

        /* renamed from: d */
        public int f107744d;

        /* renamed from: e */
        public long f107745e;

        /* renamed from: f */
        public String f107746f;
    }

    public ReportAdH5LoadEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportAdH5LoadEvent)) {
            return false;
        }
        C40160a aVar = ((ReportAdH5LoadEvent) iEvent).f107740d;
        return C46238a.m51546a(this.f107740d.f107741a, aVar.f107741a) && C46238a.m51546a(this.f107740d.f107742b, aVar.f107742b) && C46238a.m51546a(Integer.valueOf(this.f107740d.f107743c), Integer.valueOf(aVar.f107743c)) && C46238a.m51546a(Integer.valueOf(this.f107740d.f107744d), Integer.valueOf(aVar.f107744d)) && C46238a.m51546a(Long.valueOf(this.f107740d.f107745e), Long.valueOf(aVar.f107745e)) && C46238a.m51546a(this.f107740d.f107746f, aVar.f107746f);
    }
}
