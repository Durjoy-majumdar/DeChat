package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent */
public final class WalletGetPaidOrderDetailEvent extends IEvent {

    /* renamed from: d */
    public C1161a f9593d = new C1161a();

    /* renamed from: com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent$a */
    public static final class C1161a {

        /* renamed from: a */
        public String f9594a;

        /* renamed from: b */
        public String f9595b;

        /* renamed from: c */
        public String f9596c;

        /* renamed from: d */
        public String f9597d;

        /* renamed from: e */
        public String f9598e;

        /* renamed from: f */
        public int f9599f;

        /* renamed from: g */
        public String f9600g;

        /* renamed from: h */
        public String f9601h;
    }

    public WalletGetPaidOrderDetailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletGetPaidOrderDetailEvent)) {
            return false;
        }
        C1161a aVar = ((WalletGetPaidOrderDetailEvent) iEvent).f9593d;
        return C46238a.m51546a(this.f9593d.f9594a, aVar.f9594a) && C46238a.m51546a(this.f9593d.f9595b, aVar.f9595b) && C46238a.m51546a(this.f9593d.f9596c, aVar.f9596c) && C46238a.m51546a(this.f9593d.f9597d, aVar.f9597d) && C46238a.m51546a(this.f9593d.f9598e, aVar.f9598e) && C46238a.m51546a(Integer.valueOf(this.f9593d.f9599f), Integer.valueOf(aVar.f9599f)) && C46238a.m51546a(this.f9593d.f9600g, aVar.f9600g) && C46238a.m51546a(this.f9593d.f9601h, aVar.f9601h);
    }
}
