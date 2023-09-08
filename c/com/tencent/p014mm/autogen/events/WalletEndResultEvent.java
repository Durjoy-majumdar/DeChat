package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletEndResultEvent */
public final class WalletEndResultEvent extends IEvent {

    /* renamed from: d */
    public C67822a f194034d = new C67822a();

    /* renamed from: com.tencent.mm.autogen.events.WalletEndResultEvent$a */
    public static final class C67822a {

        /* renamed from: a */
        public int f194035a = 0;
    }

    public WalletEndResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletEndResultEvent)) {
            return false;
        }
        C67822a aVar = ((WalletEndResultEvent) iEvent).f194034d;
        this.f194034d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(Integer.valueOf(this.f194034d.f194035a), Integer.valueOf(aVar.f194035a));
    }
}
