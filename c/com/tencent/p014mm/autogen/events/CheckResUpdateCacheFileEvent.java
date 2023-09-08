package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent */
public final class CheckResUpdateCacheFileEvent extends IEvent {

    /* renamed from: d */
    public C28720a f78743d = new C28720a();

    /* renamed from: com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a */
    public static final class C28720a {

        /* renamed from: a */
        public int f78744a;

        /* renamed from: b */
        public int f78745b;

        /* renamed from: c */
        public String f78746c;

        /* renamed from: d */
        public int f78747d;

        /* renamed from: e */
        public boolean f78748e = false;

        /* renamed from: f */
        public String f78749f;
    }

    public CheckResUpdateCacheFileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckResUpdateCacheFileEvent)) {
            return false;
        }
        C28720a aVar = ((CheckResUpdateCacheFileEvent) iEvent).f78743d;
        return C46238a.m51546a(Integer.valueOf(this.f78743d.f78744a), Integer.valueOf(aVar.f78744a)) && C46238a.m51546a(Integer.valueOf(this.f78743d.f78745b), Integer.valueOf(aVar.f78745b)) && C46238a.m51546a(this.f78743d.f78746c, aVar.f78746c) && C46238a.m51546a(Integer.valueOf(this.f78743d.f78747d), Integer.valueOf(aVar.f78747d)) && C46238a.m51546a(Boolean.valueOf(this.f78743d.f78748e), Boolean.valueOf(aVar.f78748e)) && C46238a.m51546a(this.f78743d.f78749f, aVar.f78749f);
    }
}
