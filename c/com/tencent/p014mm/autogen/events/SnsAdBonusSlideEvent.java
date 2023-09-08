package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdBonusSlideEvent */
public final class SnsAdBonusSlideEvent extends IEvent {

    /* renamed from: d */
    public C92565a f265108d = new C92565a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdBonusSlideEvent$a */
    public static final class C92565a {

        /* renamed from: a */
        public int f265109a = 0;

        /* renamed from: b */
        public int f265110b = 0;

        /* renamed from: c */
        public int f265111c = 0;

        /* renamed from: d */
        public int f265112d = 0;
    }

    public SnsAdBonusSlideEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdBonusSlideEvent)) {
            return false;
        }
        C92565a aVar = ((SnsAdBonusSlideEvent) iEvent).f265108d;
        return C46238a.m51546a(Integer.valueOf(this.f265108d.f265109a), Integer.valueOf(aVar.f265109a)) && C46238a.m51546a(Integer.valueOf(this.f265108d.f265110b), Integer.valueOf(aVar.f265110b)) && C46238a.m51546a(Integer.valueOf(this.f265108d.f265111c), Integer.valueOf(aVar.f265111c)) && C46238a.m51546a(Integer.valueOf(this.f265108d.f265112d), Integer.valueOf(aVar.f265112d));
    }
}
