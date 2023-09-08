package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CloseWalletLockEvent */
public final class CloseWalletLockEvent extends IEvent {

    /* renamed from: d */
    public C55114a f154741d = new C55114a();

    /* renamed from: e */
    public C55115b f154742e = new C55115b();

    /* renamed from: com.tencent.mm.autogen.events.CloseWalletLockEvent$a */
    public static final class C55114a {
    }

    /* renamed from: com.tencent.mm.autogen.events.CloseWalletLockEvent$b */
    public static final class C55115b {
    }

    public CloseWalletLockEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CloseWalletLockEvent)) {
            return false;
        }
        CloseWalletLockEvent closeWalletLockEvent = (CloseWalletLockEvent) iEvent;
        C55114a aVar = closeWalletLockEvent.f154741d;
        this.f154741d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f154741d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C55115b bVar = closeWalletLockEvent.f154742e;
        this.f154742e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154742e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
