package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BroadcastEvent */
public final class BroadcastEvent extends IEvent {

    /* renamed from: d */
    public C80706a f343529d = new C80706a();

    /* renamed from: e */
    public C114669b f343530e = new C114669b();

    /* renamed from: com.tencent.mm.autogen.events.BroadcastEvent$a */
    public static final class C80706a {

        /* renamed from: a */
        public int f236156a = 0;

        /* renamed from: b */
        public String f236157b;

        /* renamed from: c */
        public int f236158c = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.BroadcastEvent$b */
    public static final class C114669b {

        /* renamed from: a */
        public boolean f343531a = false;

        /* renamed from: b */
        public String f343532b;

        /* renamed from: c */
        public String f343533c;

        /* renamed from: d */
        public int f343534d = 0;

        /* renamed from: e */
        public int f343535e = 0;

        /* renamed from: f */
        public String f343536f;

        /* renamed from: g */
        public int f343537g = 0;

        /* renamed from: h */
        public String f343538h;

        /* renamed from: i */
        public int f343539i = 0;
    }

    public BroadcastEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BroadcastEvent)) {
            return false;
        }
        BroadcastEvent broadcastEvent = (BroadcastEvent) iEvent;
        C80706a aVar = broadcastEvent.f343529d;
        if (!C46238a.m51546a(Integer.valueOf(this.f343529d.f236156a), Integer.valueOf(aVar.f236156a)) || !C46238a.m51546a(this.f343529d.f236157b, aVar.f236157b) || !C46238a.m51546a(Integer.valueOf(this.f343529d.f236158c), Integer.valueOf(aVar.f236158c))) {
            return false;
        }
        C114669b bVar = broadcastEvent.f343530e;
        if (!C46238a.m51546a(Boolean.valueOf(this.f343530e.f343531a), Boolean.valueOf(bVar.f343531a)) || !C46238a.m51546a(this.f343530e.f343532b, bVar.f343532b) || !C46238a.m51546a(this.f343530e.f343533c, bVar.f343533c) || !C46238a.m51546a(Integer.valueOf(this.f343530e.f343534d), Integer.valueOf(bVar.f343534d))) {
            return false;
        }
        this.f343530e.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f343530e.f343535e), Integer.valueOf(bVar.f343535e)) && C46238a.m51546a(this.f343530e.f343536f, bVar.f343536f) && C46238a.m51546a(Integer.valueOf(this.f343530e.f343537g), Integer.valueOf(bVar.f343537g)) && C46238a.m51546a(this.f343530e.f343538h, bVar.f343538h) && C46238a.m51546a(Integer.valueOf(this.f343530e.f343539i), Integer.valueOf(bVar.f343539i));
    }
}
