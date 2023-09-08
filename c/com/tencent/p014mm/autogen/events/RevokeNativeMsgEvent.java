package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RevokeNativeMsgEvent */
public final class RevokeNativeMsgEvent extends IEvent {

    /* renamed from: d */
    public C28811a f78950d = new C28811a();

    /* renamed from: com.tencent.mm.autogen.events.RevokeNativeMsgEvent$a */
    public static final class C28811a {

        /* renamed from: a */
        public long f78951a = 0;

        /* renamed from: b */
        public String f78952b;
    }

    public RevokeNativeMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RevokeNativeMsgEvent)) {
            return false;
        }
        C28811a aVar = ((RevokeNativeMsgEvent) iEvent).f78950d;
        return C46238a.m51546a(Long.valueOf(this.f78950d.f78951a), Long.valueOf(aVar.f78951a)) && C46238a.m51546a(this.f78950d.f78952b, aVar.f78952b);
    }
}
