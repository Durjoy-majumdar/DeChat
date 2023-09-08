package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent */
public final class LocalCheckResUpdateCacheFileEvent extends IEvent {

    /* renamed from: d */
    public C28773a f78859d = new C28773a();

    /* renamed from: com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent$a */
    public static final class C28773a {

        /* renamed from: a */
        public int f78860a;

        /* renamed from: b */
        public int f78861b;

        /* renamed from: c */
        public String f78862c;
    }

    public LocalCheckResUpdateCacheFileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LocalCheckResUpdateCacheFileEvent)) {
            return false;
        }
        C28773a aVar = ((LocalCheckResUpdateCacheFileEvent) iEvent).f78859d;
        if (!C46238a.m51546a(Integer.valueOf(this.f78859d.f78860a), Integer.valueOf(aVar.f78860a)) || !C46238a.m51546a(Integer.valueOf(this.f78859d.f78861b), Integer.valueOf(aVar.f78861b)) || !C46238a.m51546a(this.f78859d.f78862c, aVar.f78862c)) {
            return false;
        }
        this.f78859d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f78859d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
