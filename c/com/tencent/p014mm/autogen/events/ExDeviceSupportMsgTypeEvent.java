package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSupportMsgTypeEvent */
public final class ExDeviceSupportMsgTypeEvent extends IEvent {

    /* renamed from: d */
    public C40091a f107509d = new C40091a();

    /* renamed from: e */
    public C40092b f107510e = new C40092b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSupportMsgTypeEvent$a */
    public static final class C40091a {
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSupportMsgTypeEvent$b */
    public static final class C40092b {

        /* renamed from: a */
        public boolean f107511a;
    }

    public ExDeviceSupportMsgTypeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSupportMsgTypeEvent)) {
            return false;
        }
        ExDeviceSupportMsgTypeEvent exDeviceSupportMsgTypeEvent = (ExDeviceSupportMsgTypeEvent) iEvent;
        C40091a aVar = exDeviceSupportMsgTypeEvent.f107509d;
        this.f107509d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        this.f107509d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107509d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107510e.f107511a), Boolean.valueOf(exDeviceSupportMsgTypeEvent.f107510e.f107511a));
    }
}
