package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p;
import com.tencent.p014mm.sdk.event.IEvent;
import ei0.C86516a;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent */
public final class WxaPkgCDNDownloaderEventEvent extends IEvent {

    /* renamed from: d */
    public C80748a f236311d = new C80748a();

    /* renamed from: com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent$a */
    public static final class C80748a {

        /* renamed from: a */
        public int f236312a = 0;

        /* renamed from: b */
        public C86516a f236313b;

        /* renamed from: c */
        public C85639p f236314c;
    }

    public WxaPkgCDNDownloaderEventEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxaPkgCDNDownloaderEventEvent)) {
            return false;
        }
        C80748a aVar = ((WxaPkgCDNDownloaderEventEvent) iEvent).f236311d;
        return C46238a.m51546a(Integer.valueOf(this.f236311d.f236312a), Integer.valueOf(aVar.f236312a)) && C46238a.m51546a(this.f236311d.f236313b, aVar.f236313b) && C46238a.m51546a(this.f236311d.f236314c, aVar.f236314c);
    }
}
