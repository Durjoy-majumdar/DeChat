package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent */
public final class GameDownloadReport4WebViewEvent extends IEvent {

    /* renamed from: d */
    public C1075a f9278d = new C1075a();

    /* renamed from: com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent$a */
    public static final class C1075a {

        /* renamed from: a */
        public String f9279a;

        /* renamed from: b */
        public String f9280b;

        /* renamed from: c */
        public String f9281c;

        /* renamed from: d */
        public String f9282d;

        /* renamed from: e */
        public int f9283e;
    }

    public GameDownloadReport4WebViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameDownloadReport4WebViewEvent)) {
            return false;
        }
        C1075a aVar = ((GameDownloadReport4WebViewEvent) iEvent).f9278d;
        return C46238a.m51546a(this.f9278d.f9279a, aVar.f9279a) && C46238a.m51546a(this.f9278d.f9280b, aVar.f9280b) && C46238a.m51546a(this.f9278d.f9281c, aVar.f9281c) && C46238a.m51546a(this.f9278d.f9282d, aVar.f9282d) && C46238a.m51546a(Integer.valueOf(this.f9278d.f9283e), Integer.valueOf(aVar.f9283e));
    }
}
