package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WatchAppIdRegEvent */
public final class WatchAppIdRegEvent extends IEvent {

    /* renamed from: d */
    public C80745a f236300d = new C80745a();

    /* renamed from: e */
    public C80746b f236301e = new C80746b();

    /* renamed from: com.tencent.mm.autogen.events.WatchAppIdRegEvent$a */
    public static final class C80745a {

        /* renamed from: a */
        public int f236302a = 0;

        /* renamed from: b */
        public Context f236303b;

        /* renamed from: c */
        public String f236304c;

        /* renamed from: d */
        public Uri f236305d;
    }

    /* renamed from: com.tencent.mm.autogen.events.WatchAppIdRegEvent$b */
    public static final class C80746b {
    }

    public WatchAppIdRegEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WatchAppIdRegEvent)) {
            return false;
        }
        WatchAppIdRegEvent watchAppIdRegEvent = (WatchAppIdRegEvent) iEvent;
        C80745a aVar = watchAppIdRegEvent.f236300d;
        if (!C46238a.m51546a(Integer.valueOf(this.f236300d.f236302a), Integer.valueOf(aVar.f236302a)) || !C46238a.m51546a(this.f236300d.f236303b, aVar.f236303b) || !C46238a.m51546a(this.f236300d.f236304c, aVar.f236304c) || !C46238a.m51546a(this.f236300d.f236305d, aVar.f236305d)) {
            return false;
        }
        C80746b bVar = watchAppIdRegEvent.f236301e;
        this.f236301e.getClass();
        bVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
