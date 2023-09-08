package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletOfflineSetCardSerialEvent */
public final class WalletOfflineSetCardSerialEvent extends IEvent {

    /* renamed from: d */
    public C28849a f79051d = new C28849a();

    /* renamed from: com.tencent.mm.autogen.events.WalletOfflineSetCardSerialEvent$a */
    public static final class C28849a {

        /* renamed from: a */
        public String f79052a;
    }

    public WalletOfflineSetCardSerialEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletOfflineSetCardSerialEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f79051d.f79052a, ((WalletOfflineSetCardSerialEvent) iEvent).f79051d.f79052a);
    }
}
