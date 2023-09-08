package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanFlashSwitchEvent */
public final class ScanFlashSwitchEvent extends IEvent {

    /* renamed from: d */
    public C17689a f48122d = new C17689a();

    /* renamed from: com.tencent.mm.autogen.events.ScanFlashSwitchEvent$a */
    public static final class C17689a {

        /* renamed from: a */
        public int f48123a;
    }

    public ScanFlashSwitchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanFlashSwitchEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f48122d.f48123a), Integer.valueOf(((ScanFlashSwitchEvent) iEvent).f48122d.f48123a));
    }
}
