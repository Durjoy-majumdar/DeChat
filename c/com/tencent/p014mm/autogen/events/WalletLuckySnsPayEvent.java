package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletLuckySnsPayEvent */
public final class WalletLuckySnsPayEvent extends IEvent {

    /* renamed from: d */
    public C1162a f9602d = new C1162a();

    /* renamed from: com.tencent.mm.autogen.events.WalletLuckySnsPayEvent$a */
    public static final class C1162a {
    }

    public WalletLuckySnsPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletLuckySnsPayEvent)) {
            return false;
        }
        C1162a aVar = ((WalletLuckySnsPayEvent) iEvent).f9602d;
        this.f9602d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9602d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9602d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9602d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
