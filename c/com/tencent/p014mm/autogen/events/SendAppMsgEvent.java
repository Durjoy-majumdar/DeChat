package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendAppMsgEvent */
public final class SendAppMsgEvent extends IEvent {

    /* renamed from: d */
    public C1131a f9477d = new C1131a();

    /* renamed from: com.tencent.mm.autogen.events.SendAppMsgEvent$a */
    public static final class C1131a {

        /* renamed from: a */
        public WXMediaMessage f9478a;

        /* renamed from: b */
        public String f9479b;

        /* renamed from: c */
        public String f9480c;

        /* renamed from: d */
        public String f9481d;

        /* renamed from: e */
        public int f9482e;

        /* renamed from: f */
        public String f9483f;

        /* renamed from: g */
        public String f9484g;

        /* renamed from: h */
        public String f9485h;

        /* renamed from: i */
        public String f9486i;

        /* renamed from: j */
        public String f9487j;

        /* renamed from: k */
        public String f9488k;

        /* renamed from: l */
        public String f9489l;

        /* renamed from: m */
        public String f9490m;

        /* renamed from: n */
        public String f9491n;

        /* renamed from: o */
        public String f9492o;

        /* renamed from: p */
        public String f9493p;

        /* renamed from: q */
        public String f9494q;

        /* renamed from: r */
        public String f9495r;
    }

    public SendAppMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendAppMsgEvent)) {
            return false;
        }
        C1131a aVar = ((SendAppMsgEvent) iEvent).f9477d;
        return C46238a.m51546a(this.f9477d.f9478a, aVar.f9478a) && C46238a.m51546a(this.f9477d.f9479b, aVar.f9479b) && C46238a.m51546a(this.f9477d.f9480c, aVar.f9480c) && C46238a.m51546a(this.f9477d.f9481d, aVar.f9481d) && C46238a.m51546a(Integer.valueOf(this.f9477d.f9482e), Integer.valueOf(aVar.f9482e)) && C46238a.m51546a(this.f9477d.f9483f, aVar.f9483f) && C46238a.m51546a(this.f9477d.f9484g, aVar.f9484g) && C46238a.m51546a(this.f9477d.f9485h, aVar.f9485h) && C46238a.m51546a(this.f9477d.f9486i, aVar.f9486i) && C46238a.m51546a(this.f9477d.f9487j, aVar.f9487j) && C46238a.m51546a(this.f9477d.f9488k, aVar.f9488k) && C46238a.m51546a(this.f9477d.f9489l, aVar.f9489l) && C46238a.m51546a(this.f9477d.f9490m, aVar.f9490m) && C46238a.m51546a(this.f9477d.f9491n, aVar.f9491n) && C46238a.m51546a(this.f9477d.f9492o, aVar.f9492o) && C46238a.m51546a(this.f9477d.f9493p, aVar.f9493p) && C46238a.m51546a(this.f9477d.f9494q, aVar.f9494q) && C46238a.m51546a(this.f9477d.f9495r, aVar.f9495r);
    }
}
