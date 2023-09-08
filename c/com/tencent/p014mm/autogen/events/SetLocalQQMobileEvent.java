package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SetLocalQQMobileEvent */
public final class SetLocalQQMobileEvent extends IEvent {

    /* renamed from: d */
    public C1133a f9501d = new C1133a();

    /* renamed from: e */
    public C1134b f9502e = new C1134b();

    /* renamed from: com.tencent.mm.autogen.events.SetLocalQQMobileEvent$a */
    public static final class C1133a {

        /* renamed from: a */
        public Intent f9503a;

        /* renamed from: b */
        public String f9504b;
    }

    /* renamed from: com.tencent.mm.autogen.events.SetLocalQQMobileEvent$b */
    public static final class C1134b {
    }

    public SetLocalQQMobileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SetLocalQQMobileEvent)) {
            return false;
        }
        SetLocalQQMobileEvent setLocalQQMobileEvent = (SetLocalQQMobileEvent) iEvent;
        C1133a aVar = setLocalQQMobileEvent.f9501d;
        if (!C46238a.m51546a(this.f9501d.f9503a, aVar.f9503a) || !C46238a.m51546a(this.f9501d.f9504b, aVar.f9504b)) {
            return false;
        }
        C1134b bVar = setLocalQQMobileEvent.f9502e;
        this.f9502e.getClass();
        bVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
