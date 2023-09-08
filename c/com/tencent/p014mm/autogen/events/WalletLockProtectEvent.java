package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletLockProtectEvent */
public final class WalletLockProtectEvent extends IEvent {

    /* renamed from: d */
    public C104598a f310017d = new C104598a();

    /* renamed from: e */
    public C104599b f310018e = new C104599b();

    /* renamed from: com.tencent.mm.autogen.events.WalletLockProtectEvent$a */
    public static final class C104598a {

        /* renamed from: a */
        public int f310019a;

        /* renamed from: b */
        public Activity f310020b;
    }

    /* renamed from: com.tencent.mm.autogen.events.WalletLockProtectEvent$b */
    public static final class C104599b {

        /* renamed from: a */
        public Object f310021a = 0;
    }

    public WalletLockProtectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletLockProtectEvent)) {
            return false;
        }
        WalletLockProtectEvent walletLockProtectEvent = (WalletLockProtectEvent) iEvent;
        C104598a aVar = walletLockProtectEvent.f310017d;
        if (!C46238a.m51546a(Integer.valueOf(this.f310017d.f310019a), Integer.valueOf(aVar.f310019a)) || !C46238a.m51546a(this.f310017d.f310020b, aVar.f310020b)) {
            return false;
        }
        return C46238a.m51546a(this.f310018e.f310021a, walletLockProtectEvent.f310018e.f310021a);
    }
}
