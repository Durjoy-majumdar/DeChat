package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.RcptRecentAddrEvent */
public final class RcptRecentAddrEvent extends IEvent {

    /* renamed from: d */
    public C1111a f9407d = new C1111a();

    /* renamed from: e */
    public C1112b f9408e = new C1112b();

    /* renamed from: com.tencent.mm.autogen.events.RcptRecentAddrEvent$a */
    public static final class C1111a {

        /* renamed from: a */
        public String f9409a;

        /* renamed from: b */
        public String f9410b;
    }

    /* renamed from: com.tencent.mm.autogen.events.RcptRecentAddrEvent$b */
    public static final class C1112b {

        /* renamed from: a */
        public int f9411a = 0;

        /* renamed from: b */
        public boolean f9412b = false;

        /* renamed from: c */
        public String f9413c;

        /* renamed from: d */
        public String f9414d;

        /* renamed from: e */
        public String f9415e;

        /* renamed from: f */
        public String f9416f;

        /* renamed from: g */
        public String f9417g;

        /* renamed from: h */
        public String f9418h;

        /* renamed from: i */
        public String f9419i;

        /* renamed from: j */
        public String f9420j;

        /* renamed from: k */
        public String f9421k;

        /* renamed from: l */
        public List f9422l;
    }

    public RcptRecentAddrEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RcptRecentAddrEvent)) {
            return false;
        }
        RcptRecentAddrEvent rcptRecentAddrEvent = (RcptRecentAddrEvent) iEvent;
        C1111a aVar = rcptRecentAddrEvent.f9407d;
        this.f9407d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(this.f9407d.f9409a, aVar.f9409a) || !C46238a.m51546a(this.f9407d.f9410b, aVar.f9410b)) {
            return false;
        }
        C1112b bVar = rcptRecentAddrEvent.f9408e;
        return C46238a.m51546a(Integer.valueOf(this.f9408e.f9411a), Integer.valueOf(bVar.f9411a)) && C46238a.m51546a(Boolean.valueOf(this.f9408e.f9412b), Boolean.valueOf(bVar.f9412b)) && C46238a.m51546a(this.f9408e.f9413c, bVar.f9413c) && C46238a.m51546a(this.f9408e.f9414d, bVar.f9414d) && C46238a.m51546a(this.f9408e.f9415e, bVar.f9415e) && C46238a.m51546a(this.f9408e.f9416f, bVar.f9416f) && C46238a.m51546a(this.f9408e.f9417g, bVar.f9417g) && C46238a.m51546a(this.f9408e.f9418h, bVar.f9418h) && C46238a.m51546a(this.f9408e.f9419i, bVar.f9419i) && C46238a.m51546a(this.f9408e.f9420j, bVar.f9420j) && C46238a.m51546a(this.f9408e.f9421k, bVar.f9421k) && C46238a.m51546a(this.f9408e.f9422l, bVar.f9422l);
    }
}
