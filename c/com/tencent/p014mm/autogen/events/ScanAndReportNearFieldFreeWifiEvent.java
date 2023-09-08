package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanAndReportNearFieldFreeWifiEvent */
public final class ScanAndReportNearFieldFreeWifiEvent extends IEvent {

    /* renamed from: d */
    public C40162a f107748d = new C40162a();

    /* renamed from: e */
    public C40163b f107749e = new C40163b();

    /* renamed from: com.tencent.mm.autogen.events.ScanAndReportNearFieldFreeWifiEvent$a */
    public static final class C40162a {

        /* renamed from: a */
        public String f107750a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ScanAndReportNearFieldFreeWifiEvent$b */
    public static final class C40163b {
    }

    public ScanAndReportNearFieldFreeWifiEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanAndReportNearFieldFreeWifiEvent)) {
            return false;
        }
        ScanAndReportNearFieldFreeWifiEvent scanAndReportNearFieldFreeWifiEvent = (ScanAndReportNearFieldFreeWifiEvent) iEvent;
        if (!C46238a.m51546a(this.f107748d.f107750a, scanAndReportNearFieldFreeWifiEvent.f107748d.f107750a)) {
            return false;
        }
        C40163b bVar = scanAndReportNearFieldFreeWifiEvent.f107749e;
        this.f107749e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
