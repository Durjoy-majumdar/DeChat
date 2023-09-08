package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FreeWifiThreeOneEntryEvent */
public final class FreeWifiThreeOneEntryEvent extends IEvent {

    /* renamed from: d */
    public C80721a f236211d = new C80721a();

    /* renamed from: e */
    public C80722b f236212e = new C80722b();

    /* renamed from: com.tencent.mm.autogen.events.FreeWifiThreeOneEntryEvent$a */
    public static final class C80721a {

        /* renamed from: a */
        public Intent f236213a;
    }

    /* renamed from: com.tencent.mm.autogen.events.FreeWifiThreeOneEntryEvent$b */
    public static final class C80722b {
    }

    public FreeWifiThreeOneEntryEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FreeWifiThreeOneEntryEvent)) {
            return false;
        }
        FreeWifiThreeOneEntryEvent freeWifiThreeOneEntryEvent = (FreeWifiThreeOneEntryEvent) iEvent;
        if (!C46238a.m51546a(this.f236211d.f236213a, freeWifiThreeOneEntryEvent.f236211d.f236213a)) {
            return false;
        }
        C80722b bVar = freeWifiThreeOneEntryEvent.f236212e;
        this.f236212e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
