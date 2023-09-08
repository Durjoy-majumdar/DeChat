package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletQueryHbStatusEvent */
public final class WalletQueryHbStatusEvent extends IEvent {

    /* renamed from: d */
    public C55176a f154903d = new C55176a();

    /* renamed from: e */
    public C55177b f154904e = new C55177b();

    /* renamed from: com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$a */
    public static final class C55176a {

        /* renamed from: a */
        public String f154905a;
    }

    /* renamed from: com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b */
    public static final class C55177b {

        /* renamed from: a */
        public int f154906a = -1;

        /* renamed from: b */
        public int f154907b = -1;

        /* renamed from: c */
        public int f154908c = -1;
    }

    public WalletQueryHbStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletQueryHbStatusEvent)) {
            return false;
        }
        WalletQueryHbStatusEvent walletQueryHbStatusEvent = (WalletQueryHbStatusEvent) iEvent;
        if (!C46238a.m51546a(this.f154903d.f154905a, walletQueryHbStatusEvent.f154903d.f154905a)) {
            return false;
        }
        C55177b bVar = walletQueryHbStatusEvent.f154904e;
        return C46238a.m51546a(Integer.valueOf(this.f154904e.f154906a), Integer.valueOf(bVar.f154906a)) && C46238a.m51546a(Integer.valueOf(this.f154904e.f154907b), Integer.valueOf(bVar.f154907b)) && C46238a.m51546a(Integer.valueOf(this.f154904e.f154908c), Integer.valueOf(bVar.f154908c));
    }
}
