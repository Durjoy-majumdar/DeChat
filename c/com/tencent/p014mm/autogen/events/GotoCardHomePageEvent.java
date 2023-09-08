package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GotoCardHomePageEvent */
public final class GotoCardHomePageEvent extends IEvent {

    /* renamed from: d */
    public C40126a f107606d = new C40126a();

    /* renamed from: e */
    public C40127b f107607e = new C40127b();

    /* renamed from: com.tencent.mm.autogen.events.GotoCardHomePageEvent$a */
    public static final class C40126a {

        /* renamed from: a */
        public Context f107608a;

        /* renamed from: b */
        public int f107609b = 0;

        /* renamed from: c */
        public int f107610c = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.GotoCardHomePageEvent$b */
    public static final class C40127b {

        /* renamed from: a */
        public String f107611a;
    }

    public GotoCardHomePageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GotoCardHomePageEvent)) {
            return false;
        }
        GotoCardHomePageEvent gotoCardHomePageEvent = (GotoCardHomePageEvent) iEvent;
        C40126a aVar = gotoCardHomePageEvent.f107606d;
        if (!C46238a.m51546a(this.f107606d.f107608a, aVar.f107608a) || !C46238a.m51546a(Integer.valueOf(this.f107606d.f107609b), Integer.valueOf(aVar.f107609b)) || !C46238a.m51546a(Integer.valueOf(this.f107606d.f107610c), Integer.valueOf(aVar.f107610c))) {
            return false;
        }
        return C46238a.m51546a(this.f107607e.f107611a, gotoCardHomePageEvent.f107607e.f107611a);
    }
}
