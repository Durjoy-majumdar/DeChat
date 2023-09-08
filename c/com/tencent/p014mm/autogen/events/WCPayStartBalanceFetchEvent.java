package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent */
public final class WCPayStartBalanceFetchEvent extends IEvent {

    /* renamed from: d */
    public C67820a f194030d = new C67820a();

    /* renamed from: com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent$a */
    public static final class C67820a {

        /* renamed from: a */
        public Context f194031a;
    }

    public WCPayStartBalanceFetchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WCPayStartBalanceFetchEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f194030d.f194031a, ((WCPayStartBalanceFetchEvent) iEvent).f194030d.f194031a);
    }
}
