package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent */
public final class ReceiveHoneyPayAppMsgEvent extends IEvent {

    /* renamed from: d */
    public C28795a f78908d = new C28795a();

    /* renamed from: com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent$a */
    public static final class C28795a {

        /* renamed from: a */
        public long f78909a;

        /* renamed from: b */
        public String f78910b;

        /* renamed from: c */
        public String f78911c;

        /* renamed from: d */
        public String f78912d;
    }

    public ReceiveHoneyPayAppMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReceiveHoneyPayAppMsgEvent)) {
            return false;
        }
        C28795a aVar = ((ReceiveHoneyPayAppMsgEvent) iEvent).f78908d;
        return C46238a.m51546a(Long.valueOf(this.f78908d.f78909a), Long.valueOf(aVar.f78909a)) && C46238a.m51546a(this.f78908d.f78910b, aVar.f78910b) && C46238a.m51546a(this.f78908d.f78911c, aVar.f78911c) && C46238a.m51546a(this.f78908d.f78912d, aVar.f78912d);
    }
}
