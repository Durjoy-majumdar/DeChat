package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SDKOpenBusiLuckyMoneyEvent */
public final class SDKOpenBusiLuckyMoneyEvent extends IEvent {

    /* renamed from: d */
    public C80737a f236273d = new C80737a();

    /* renamed from: com.tencent.mm.autogen.events.SDKOpenBusiLuckyMoneyEvent$a */
    public static final class C80737a {

        /* renamed from: a */
        public String[] f236274a;

        /* renamed from: b */
        public String[] f236275b;

        /* renamed from: c */
        public Context f236276c;
    }

    public SDKOpenBusiLuckyMoneyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SDKOpenBusiLuckyMoneyEvent)) {
            return false;
        }
        C80737a aVar = ((SDKOpenBusiLuckyMoneyEvent) iEvent).f236273d;
        return C46238a.m51546a(this.f236273d.f236274a, aVar.f236274a) && C46238a.m51546a(this.f236273d.f236275b, aVar.f236275b) && C46238a.m51546a(this.f236273d.f236276c, aVar.f236276c);
    }
}
