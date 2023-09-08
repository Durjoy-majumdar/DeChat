package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C77933g43;

/* renamed from: com.tencent.mm.autogen.events.WalletGetBulletinEvent */
public final class WalletGetBulletinEvent extends IEvent {

    /* renamed from: d */
    public C28847a f79042d = new C28847a();

    /* renamed from: e */
    public C28848b f79043e = new C28848b();

    /* renamed from: com.tencent.mm.autogen.events.WalletGetBulletinEvent$a */
    public static final class C28847a {

        /* renamed from: a */
        public String f79044a;

        /* renamed from: b */
        public Runnable f79045b;
    }

    /* renamed from: com.tencent.mm.autogen.events.WalletGetBulletinEvent$b */
    public static final class C28848b {

        /* renamed from: a */
        public String f79046a;

        /* renamed from: b */
        public String f79047b;

        /* renamed from: c */
        public String f79048c;

        /* renamed from: d */
        public int f79049d;

        /* renamed from: e */
        public C77933g43 f79050e;
    }

    public WalletGetBulletinEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletGetBulletinEvent)) {
            return false;
        }
        WalletGetBulletinEvent walletGetBulletinEvent = (WalletGetBulletinEvent) iEvent;
        C28847a aVar = walletGetBulletinEvent.f79042d;
        if (!C46238a.m51546a(this.f79042d.f79044a, aVar.f79044a) || !C46238a.m51546a(this.f79042d.f79045b, aVar.f79045b)) {
            return false;
        }
        C28848b bVar = walletGetBulletinEvent.f79043e;
        return C46238a.m51546a(this.f79043e.f79046a, bVar.f79046a) && C46238a.m51546a(this.f79043e.f79047b, bVar.f79047b) && C46238a.m51546a(this.f79043e.f79048c, bVar.f79048c) && C46238a.m51546a(Integer.valueOf(this.f79043e.f79049d), Integer.valueOf(bVar.f79049d)) && C46238a.m51546a(this.f79043e.f79050e, bVar.f79050e);
    }
}
