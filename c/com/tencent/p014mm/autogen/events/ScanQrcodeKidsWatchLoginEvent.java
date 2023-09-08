package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanQrcodeKidsWatchLoginEvent */
public final class ScanQrcodeKidsWatchLoginEvent extends IEvent {

    /* renamed from: d */
    public C28820a f78969d = new C28820a();

    /* renamed from: com.tencent.mm.autogen.events.ScanQrcodeKidsWatchLoginEvent$a */
    public static final class C28820a {

        /* renamed from: a */
        public String f78970a;

        /* renamed from: b */
        public String f78971b;
    }

    public ScanQrcodeKidsWatchLoginEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanQrcodeKidsWatchLoginEvent)) {
            return false;
        }
        C28820a aVar = ((ScanQrcodeKidsWatchLoginEvent) iEvent).f78969d;
        return C46238a.m51546a(this.f78969d.f78970a, aVar.f78970a) && C46238a.m51546a(this.f78969d.f78971b, aVar.f78971b);
    }
}
