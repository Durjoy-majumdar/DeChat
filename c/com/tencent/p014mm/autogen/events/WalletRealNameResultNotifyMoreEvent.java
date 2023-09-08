package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletRealNameResultNotifyMoreEvent */
public final class WalletRealNameResultNotifyMoreEvent extends IEvent {

    /* renamed from: d */
    public C1164a f9605d = new C1164a();

    /* renamed from: com.tencent.mm.autogen.events.WalletRealNameResultNotifyMoreEvent$a */
    public static final class C1164a {

        /* renamed from: a */
        public int f9606a;
    }

    public WalletRealNameResultNotifyMoreEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletRealNameResultNotifyMoreEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9605d.f9606a), Integer.valueOf(((WalletRealNameResultNotifyMoreEvent) iEvent).f9605d.f9606a));
    }
}
