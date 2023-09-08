package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsTranslateFinishEvent */
public final class SnsTranslateFinishEvent extends IEvent {

    /* renamed from: d */
    public C92595a f265201d = new C92595a();

    /* renamed from: com.tencent.mm.autogen.events.SnsTranslateFinishEvent$a */
    public static final class C92595a {

        /* renamed from: a */
        public int f265202a;

        /* renamed from: b */
        public String f265203b;

        /* renamed from: c */
        public String f265204c;

        /* renamed from: d */
        public String f265205d;
    }

    public SnsTranslateFinishEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsTranslateFinishEvent)) {
            return false;
        }
        C92595a aVar = ((SnsTranslateFinishEvent) iEvent).f265201d;
        return C46238a.m51546a(Integer.valueOf(this.f265201d.f265202a), Integer.valueOf(aVar.f265202a)) && C46238a.m51546a(this.f265201d.f265203b, aVar.f265203b) && C46238a.m51546a(this.f265201d.f265204c, aVar.f265204c) && C46238a.m51546a(this.f265201d.f265205d, aVar.f265205d);
    }
}
