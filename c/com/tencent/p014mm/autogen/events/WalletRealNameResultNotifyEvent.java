package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent */
public final class WalletRealNameResultNotifyEvent extends IEvent {

    /* renamed from: d */
    public C1163a f9603d = new C1163a();

    /* renamed from: com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent$a */
    public static final class C1163a {

        /* renamed from: a */
        public int f9604a;
    }

    public WalletRealNameResultNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletRealNameResultNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9603d.f9604a), Integer.valueOf(((WalletRealNameResultNotifyEvent) iEvent).f9603d.f9604a));
    }
}
