package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent */
public final class ExDeviceConnectStrategyActionEvent extends IEvent {

    /* renamed from: d */
    public C40064a f107440d = new C40064a();

    /* renamed from: e */
    public C40065b f107441e = new C40065b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent$a */
    public static final class C40064a {

        /* renamed from: a */
        public String f107442a;

        /* renamed from: b */
        public String f107443b;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent$b */
    public static final class C40065b {

        /* renamed from: a */
        public boolean f107444a;
    }

    public ExDeviceConnectStrategyActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceConnectStrategyActionEvent)) {
            return false;
        }
        ExDeviceConnectStrategyActionEvent exDeviceConnectStrategyActionEvent = (ExDeviceConnectStrategyActionEvent) iEvent;
        C40064a aVar = exDeviceConnectStrategyActionEvent.f107440d;
        if (!C46238a.m51546a(this.f107440d.f107442a, aVar.f107442a) || !C46238a.m51546a(this.f107440d.f107443b, aVar.f107443b)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107441e.f107444a), Boolean.valueOf(exDeviceConnectStrategyActionEvent.f107441e.f107444a));
    }
}
