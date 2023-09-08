package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EmotionStateChangeEvent */
public final class EmotionStateChangeEvent extends IEvent {

    /* renamed from: d */
    public C92476a f264696d = new C92476a();

    /* renamed from: com.tencent.mm.autogen.events.EmotionStateChangeEvent$a */
    public static final class C92476a {

        /* renamed from: a */
        public String f264697a;

        /* renamed from: b */
        public int f264698b = 0;

        /* renamed from: c */
        public int f264699c = 0;

        /* renamed from: d */
        public String f264700d;
    }

    public EmotionStateChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EmotionStateChangeEvent)) {
            return false;
        }
        C92476a aVar = ((EmotionStateChangeEvent) iEvent).f264696d;
        return C46238a.m51546a(this.f264696d.f264697a, aVar.f264697a) && C46238a.m51546a(Integer.valueOf(this.f264696d.f264698b), Integer.valueOf(aVar.f264698b)) && C46238a.m51546a(Integer.valueOf(this.f264696d.f264699c), Integer.valueOf(aVar.f264699c)) && C46238a.m51546a(this.f264696d.f264700d, aVar.f264700d);
    }
}
