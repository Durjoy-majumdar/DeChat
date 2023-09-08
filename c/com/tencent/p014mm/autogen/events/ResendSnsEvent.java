package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ResendSnsEvent */
public final class ResendSnsEvent extends IEvent {

    /* renamed from: d */
    public C28807a f78937d = new C28807a();

    /* renamed from: com.tencent.mm.autogen.events.ResendSnsEvent$a */
    public static final class C28807a {

        /* renamed from: a */
        public int f78938a = -1;
    }

    public ResendSnsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResendSnsEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78937d.f78938a), Integer.valueOf(((ResendSnsEvent) iEvent).f78937d.f78938a));
    }
}
