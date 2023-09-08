package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RequestEnterWalletEvent */
public final class RequestEnterWalletEvent extends IEvent {

    /* renamed from: d */
    public C1116a f9428d = new C1116a();

    /* renamed from: com.tencent.mm.autogen.events.RequestEnterWalletEvent$a */
    public static final class C1116a {

        /* renamed from: a */
        public Context f9429a;

        /* renamed from: b */
        public Intent f9430b;
    }

    public RequestEnterWalletEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RequestEnterWalletEvent)) {
            return false;
        }
        C1116a aVar = ((RequestEnterWalletEvent) iEvent).f9428d;
        return C46238a.m51546a(this.f9428d.f9429a, aVar.f9429a) && C46238a.m51546a(this.f9428d.f9430b, aVar.f9430b);
    }
}
