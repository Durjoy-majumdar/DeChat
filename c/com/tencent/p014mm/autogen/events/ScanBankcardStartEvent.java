package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanBankcardStartEvent */
public final class ScanBankcardStartEvent extends IEvent {

    /* renamed from: d */
    public C55160a f154868d = new C55160a();

    /* renamed from: e */
    public C55161b f154869e = new C55161b();

    /* renamed from: com.tencent.mm.autogen.events.ScanBankcardStartEvent$a */
    public static final class C55160a {
    }

    /* renamed from: com.tencent.mm.autogen.events.ScanBankcardStartEvent$b */
    public static final class C55161b {
    }

    public ScanBankcardStartEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanBankcardStartEvent)) {
            return false;
        }
        ScanBankcardStartEvent scanBankcardStartEvent = (ScanBankcardStartEvent) iEvent;
        C55160a aVar = scanBankcardStartEvent.f154868d;
        this.f154868d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154868d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154868d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        C55161b bVar = scanBankcardStartEvent.f154869e;
        this.f154869e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
