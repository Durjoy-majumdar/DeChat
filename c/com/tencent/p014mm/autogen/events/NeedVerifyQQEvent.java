package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NeedVerifyQQEvent */
public final class NeedVerifyQQEvent extends IEvent {

    /* renamed from: d */
    public C80730a f236243d = new C80730a();

    /* renamed from: e */
    public C80731b f236244e = new C80731b();

    /* renamed from: com.tencent.mm.autogen.events.NeedVerifyQQEvent$a */
    public static final class C80730a {

        /* renamed from: a */
        public Activity f236245a;

        /* renamed from: b */
        public Runnable f236246b;
    }

    /* renamed from: com.tencent.mm.autogen.events.NeedVerifyQQEvent$b */
    public static final class C80731b {

        /* renamed from: a */
        public boolean f236247a = false;
    }

    public NeedVerifyQQEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NeedVerifyQQEvent)) {
            return false;
        }
        NeedVerifyQQEvent needVerifyQQEvent = (NeedVerifyQQEvent) iEvent;
        C80730a aVar = needVerifyQQEvent.f236243d;
        if (!C46238a.m51546a(this.f236243d.f236245a, aVar.f236245a) || !C46238a.m51546a(this.f236243d.f236246b, aVar.f236246b)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f236244e.f236247a), Boolean.valueOf(needVerifyQQEvent.f236244e.f236247a));
    }
}
