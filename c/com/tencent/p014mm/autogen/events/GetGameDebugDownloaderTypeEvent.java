package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetGameDebugDownloaderTypeEvent */
public final class GetGameDebugDownloaderTypeEvent extends IEvent {

    /* renamed from: d */
    public C40122a f107595d = new C40122a();

    /* renamed from: com.tencent.mm.autogen.events.GetGameDebugDownloaderTypeEvent$a */
    public static final class C40122a {

        /* renamed from: a */
        public int f107596a;
    }

    public GetGameDebugDownloaderTypeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetGameDebugDownloaderTypeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107595d.f107596a), Integer.valueOf(((GetGameDebugDownloaderTypeEvent) iEvent).f107595d.f107596a));
    }
}
