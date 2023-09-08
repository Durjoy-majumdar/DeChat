package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent */
public final class WalletQueryRemittanceStatusEvent extends IEvent {

    /* renamed from: d */
    public C55178a f154909d = new C55178a();

    /* renamed from: e */
    public C55179b f154910e = new C55179b();

    /* renamed from: com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$a */
    public static final class C55178a {

        /* renamed from: a */
        public String f154911a;
    }

    /* renamed from: com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b */
    public static final class C55179b {

        /* renamed from: a */
        public int f154912a;

        /* renamed from: b */
        public boolean f154913b;

        /* renamed from: c */
        public boolean f154914c;
    }

    public WalletQueryRemittanceStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletQueryRemittanceStatusEvent)) {
            return false;
        }
        WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = (WalletQueryRemittanceStatusEvent) iEvent;
        if (!C46238a.m51546a(this.f154909d.f154911a, walletQueryRemittanceStatusEvent.f154909d.f154911a)) {
            return false;
        }
        C55179b bVar = walletQueryRemittanceStatusEvent.f154910e;
        return C46238a.m51546a(Integer.valueOf(this.f154910e.f154912a), Integer.valueOf(bVar.f154912a)) && C46238a.m51546a(Boolean.valueOf(this.f154910e.f154913b), Boolean.valueOf(bVar.f154913b)) && C46238a.m51546a(Boolean.valueOf(this.f154910e.f154914c), Boolean.valueOf(bVar.f154914c));
    }
}
