package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PreEmotionSearchEvent */
public final class PreEmotionSearchEvent extends IEvent {

    /* renamed from: d */
    public C1110a f9403d = new C1110a();

    /* renamed from: com.tencent.mm.autogen.events.PreEmotionSearchEvent$a */
    public static final class C1110a {

        /* renamed from: a */
        public String f9404a;

        /* renamed from: b */
        public int f9405b;

        /* renamed from: c */
        public String f9406c;
    }

    public PreEmotionSearchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PreEmotionSearchEvent)) {
            return false;
        }
        C1110a aVar = ((PreEmotionSearchEvent) iEvent).f9403d;
        if (!C46238a.m51546a(this.f9403d.f9404a, aVar.f9404a) || !C46238a.m51546a(Integer.valueOf(this.f9403d.f9405b), Integer.valueOf(aVar.f9405b))) {
            return false;
        }
        this.f9403d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(this.f9403d.f9406c, aVar.f9406c)) {
            return false;
        }
        this.f9403d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9403d.getClass();
        return C46238a.m51546a(0L, 0L);
    }
}
