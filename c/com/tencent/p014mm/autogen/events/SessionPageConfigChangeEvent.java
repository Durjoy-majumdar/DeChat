package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.SessionPageConfigChangeEvent */
public final class SessionPageConfigChangeEvent extends IEvent {

    /* renamed from: d */
    public C114692a f343608d = new C114692a();

    /* renamed from: com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a */
    public static final class C114692a {

        /* renamed from: a */
        public long f343609a;

        /* renamed from: b */
        public String f343610b;

        /* renamed from: c */
        public List f343611c;

        /* renamed from: d */
        public Boolean f343612d;

        /* renamed from: e */
        public Boolean f343613e;

        /* renamed from: f */
        public int f343614f;
    }

    public SessionPageConfigChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SessionPageConfigChangeEvent)) {
            return false;
        }
        C114692a aVar = ((SessionPageConfigChangeEvent) iEvent).f343608d;
        return C46238a.m51546a(Long.valueOf(this.f343608d.f343609a), Long.valueOf(aVar.f343609a)) && C46238a.m51546a(this.f343608d.f343610b, aVar.f343610b) && C46238a.m51546a(this.f343608d.f343611c, aVar.f343611c) && C46238a.m51546a(this.f343608d.f343612d, aVar.f343612d) && C46238a.m51546a(this.f343608d.f343613e, aVar.f343613e) && C46238a.m51546a(Integer.valueOf(this.f343608d.f343614f), Integer.valueOf(aVar.f343614f));
    }
}
