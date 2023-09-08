package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SDKOpenOfflinePayEvent */
public final class SDKOpenOfflinePayEvent extends IEvent {

    /* renamed from: d */
    public C80738a f236277d = new C80738a();

    /* renamed from: com.tencent.mm.autogen.events.SDKOpenOfflinePayEvent$a */
    public static final class C80738a {

        /* renamed from: a */
        public String[] f236278a;

        /* renamed from: b */
        public String[] f236279b;

        /* renamed from: c */
        public Context f236280c;
    }

    public SDKOpenOfflinePayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SDKOpenOfflinePayEvent)) {
            return false;
        }
        C80738a aVar = ((SDKOpenOfflinePayEvent) iEvent).f236277d;
        return C46238a.m51546a(this.f236277d.f236278a, aVar.f236278a) && C46238a.m51546a(this.f236277d.f236279b, aVar.f236279b) && C46238a.m51546a(this.f236277d.f236280c, aVar.f236280c);
    }
}
