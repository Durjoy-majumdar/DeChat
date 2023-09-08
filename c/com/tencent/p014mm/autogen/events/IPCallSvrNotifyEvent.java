package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.IPCallSvrNotifyEvent */
public final class IPCallSvrNotifyEvent extends IEvent {

    /* renamed from: d */
    public C55142a f154827d = new C55142a();

    /* renamed from: com.tencent.mm.autogen.events.IPCallSvrNotifyEvent$a */
    public static final class C55142a {

        /* renamed from: a */
        public byte[] f154828a;
    }

    public IPCallSvrNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof IPCallSvrNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f154827d.f154828a, ((IPCallSvrNotifyEvent) iEvent).f154827d.f154828a);
    }
}
