package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtGetWifiListEvent */
public final class ExtGetWifiListEvent extends IEvent {

    /* renamed from: d */
    public C92496a f264769d = new C92496a();

    /* renamed from: e */
    public C92497b f264770e = new C92497b();

    /* renamed from: com.tencent.mm.autogen.events.ExtGetWifiListEvent$a */
    public static final class C92496a {

        /* renamed from: a */
        public String[] f264771a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtGetWifiListEvent$b */
    public static final class C92497b {
    }

    public ExtGetWifiListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtGetWifiListEvent)) {
            return false;
        }
        ExtGetWifiListEvent extGetWifiListEvent = (ExtGetWifiListEvent) iEvent;
        if (!C46238a.m51546a(this.f264769d.f264771a, extGetWifiListEvent.f264769d.f264771a)) {
            return false;
        }
        C92497b bVar = extGetWifiListEvent.f264770e;
        this.f264770e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f264770e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
