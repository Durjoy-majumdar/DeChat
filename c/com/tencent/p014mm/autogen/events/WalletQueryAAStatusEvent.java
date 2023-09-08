package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletQueryAAStatusEvent */
public final class WalletQueryAAStatusEvent extends IEvent {

    /* renamed from: d */
    public C28850a f79053d = new C28850a();

    /* renamed from: e */
    public C28851b f79054e = new C28851b();

    /* renamed from: com.tencent.mm.autogen.events.WalletQueryAAStatusEvent$a */
    public static final class C28850a {

        /* renamed from: a */
        public String f79055a;
    }

    /* renamed from: com.tencent.mm.autogen.events.WalletQueryAAStatusEvent$b */
    public static final class C28851b {

        /* renamed from: a */
        public int f79056a = -1;
    }

    public WalletQueryAAStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletQueryAAStatusEvent)) {
            return false;
        }
        WalletQueryAAStatusEvent walletQueryAAStatusEvent = (WalletQueryAAStatusEvent) iEvent;
        if (!C46238a.m51546a(this.f79053d.f79055a, walletQueryAAStatusEvent.f79053d.f79055a)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f79054e.f79056a), Integer.valueOf(walletQueryAAStatusEvent.f79054e.f79056a));
    }
}
