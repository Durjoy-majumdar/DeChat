package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.WearActionEvent */
public final class WearActionEvent extends IEvent {

    /* renamed from: d */
    public C40182a f107808d = new C40182a();

    /* renamed from: e */
    public C40183b f107809e = new C40183b();

    /* renamed from: com.tencent.mm.autogen.events.WearActionEvent$a */
    public static final class C40182a {

        /* renamed from: a */
        public int f107810a;

        /* renamed from: b */
        public long f107811b;

        /* renamed from: c */
        public int f107812c;

        /* renamed from: d */
        public String f107813d;
    }

    /* renamed from: com.tencent.mm.autogen.events.WearActionEvent$b */
    public static final class C40183b {

        /* renamed from: a */
        public long f107814a;

        /* renamed from: b */
        public long f107815b;

        /* renamed from: c */
        public String f107816c;

        /* renamed from: d */
        public List f107817d;

        /* renamed from: e */
        public int f107818e;

        /* renamed from: f */
        public byte[] f107819f;

        /* renamed from: g */
        public byte[] f107820g;

        /* renamed from: h */
        public String f107821h;

        /* renamed from: i */
        public String f107822i;
    }

    public WearActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WearActionEvent)) {
            return false;
        }
        WearActionEvent wearActionEvent = (WearActionEvent) iEvent;
        C40182a aVar = wearActionEvent.f107808d;
        if (!C46238a.m51546a(Integer.valueOf(this.f107808d.f107810a), Integer.valueOf(aVar.f107810a)) || !C46238a.m51546a(Long.valueOf(this.f107808d.f107811b), Long.valueOf(aVar.f107811b)) || !C46238a.m51546a(Integer.valueOf(this.f107808d.f107812c), Integer.valueOf(aVar.f107812c)) || !C46238a.m51546a(this.f107808d.f107813d, aVar.f107813d)) {
            return false;
        }
        C40183b bVar = wearActionEvent.f107809e;
        return C46238a.m51546a(Long.valueOf(this.f107809e.f107814a), Long.valueOf(bVar.f107814a)) && C46238a.m51546a(Long.valueOf(this.f107809e.f107815b), Long.valueOf(bVar.f107815b)) && C46238a.m51546a(this.f107809e.f107816c, bVar.f107816c) && C46238a.m51546a(this.f107809e.f107817d, bVar.f107817d) && C46238a.m51546a(Integer.valueOf(this.f107809e.f107818e), Integer.valueOf(bVar.f107818e)) && C46238a.m51546a(this.f107809e.f107819f, bVar.f107819f) && C46238a.m51546a(this.f107809e.f107820g, bVar.f107820g) && C46238a.m51546a(this.f107809e.f107821h, bVar.f107821h) && C46238a.m51546a(this.f107809e.f107822i, bVar.f107822i);
    }
}
