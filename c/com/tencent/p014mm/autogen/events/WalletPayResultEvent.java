package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletPayResultEvent */
public final class WalletPayResultEvent extends IEvent {

    /* renamed from: d */
    public C67828a f194085d = new C67828a();

    /* renamed from: com.tencent.mm.autogen.events.WalletPayResultEvent$a */
    public static final class C67828a {

        /* renamed from: a */
        public Intent f194086a;

        /* renamed from: b */
        public int f194087b = 0;

        /* renamed from: c */
        public int f194088c = 0;

        /* renamed from: d */
        public String f194089d;

        /* renamed from: e */
        public String f194090e;

        /* renamed from: f */
        public boolean f194091f = false;

        /* renamed from: g */
        public int f194092g = 0;
    }

    public WalletPayResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletPayResultEvent)) {
            return false;
        }
        C67828a aVar = ((WalletPayResultEvent) iEvent).f194085d;
        return C46238a.m51546a(this.f194085d.f194086a, aVar.f194086a) && C46238a.m51546a(Integer.valueOf(this.f194085d.f194087b), Integer.valueOf(aVar.f194087b)) && C46238a.m51546a(Integer.valueOf(this.f194085d.f194088c), Integer.valueOf(aVar.f194088c)) && C46238a.m51546a(this.f194085d.f194089d, aVar.f194089d) && C46238a.m51546a(this.f194085d.f194090e, aVar.f194090e) && C46238a.m51546a(Boolean.valueOf(this.f194085d.f194091f), Boolean.valueOf(aVar.f194091f)) && C46238a.m51546a(Integer.valueOf(this.f194085d.f194092g), Integer.valueOf(aVar.f194092g));
    }
}
