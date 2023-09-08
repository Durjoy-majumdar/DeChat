package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletPayResultForAppbrandGameEvent */
public final class WalletPayResultForAppbrandGameEvent extends IEvent {

    /* renamed from: d */
    public C67829a f194093d = new C67829a();

    /* renamed from: com.tencent.mm.autogen.events.WalletPayResultForAppbrandGameEvent$a */
    public static final class C67829a {

        /* renamed from: a */
        public Intent f194094a;

        /* renamed from: b */
        public int f194095b = 0;

        /* renamed from: c */
        public String f194096c;

        /* renamed from: d */
        public int f194097d = 0;

        /* renamed from: e */
        public int f194098e = 0;
    }

    public WalletPayResultForAppbrandGameEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletPayResultForAppbrandGameEvent)) {
            return false;
        }
        C67829a aVar = ((WalletPayResultForAppbrandGameEvent) iEvent).f194093d;
        return C46238a.m51546a(this.f194093d.f194094a, aVar.f194094a) && C46238a.m51546a(Integer.valueOf(this.f194093d.f194095b), Integer.valueOf(aVar.f194095b)) && C46238a.m51546a(this.f194093d.f194096c, aVar.f194096c) && C46238a.m51546a(Integer.valueOf(this.f194093d.f194097d), Integer.valueOf(aVar.f194097d)) && C46238a.m51546a(Integer.valueOf(this.f194093d.f194098e), Integer.valueOf(aVar.f194098e));
    }
}
