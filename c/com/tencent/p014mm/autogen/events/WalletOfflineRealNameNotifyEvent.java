package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import id2.C76313t;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent */
public final class WalletOfflineRealNameNotifyEvent extends IEvent {

    /* renamed from: d */
    public C67826a f194081d = new C67826a();

    /* renamed from: com.tencent.mm.autogen.events.WalletOfflineRealNameNotifyEvent$a */
    public static final class C67826a {

        /* renamed from: a */
        public C76313t.C76322j f194082a;
    }

    public WalletOfflineRealNameNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletOfflineRealNameNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f194081d.f194082a, ((WalletOfflineRealNameNotifyEvent) iEvent).f194081d.f194082a);
    }
}
