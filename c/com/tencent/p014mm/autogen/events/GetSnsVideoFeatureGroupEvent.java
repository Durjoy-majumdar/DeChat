package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import o30.C89112b;

/* renamed from: com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent */
public final class GetSnsVideoFeatureGroupEvent extends IEvent {

    /* renamed from: d */
    public C80724a f236216d = new C80724a();

    /* renamed from: com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent$a */
    public static final class C80724a {

        /* renamed from: a */
        public String f236217a;

        /* renamed from: b */
        public C89112b f236218b;
    }

    public GetSnsVideoFeatureGroupEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetSnsVideoFeatureGroupEvent)) {
            return false;
        }
        C80724a aVar = ((GetSnsVideoFeatureGroupEvent) iEvent).f236216d;
        return C46238a.m51546a(this.f236216d.f236217a, aVar.f236217a) && C46238a.m51546a(this.f236216d.f236218b, aVar.f236218b);
    }
}
