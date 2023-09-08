package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.autogen.events.OmitAllResendSnsEvent */
public final class OmitAllResendSnsEvent extends IEvent {

    /* renamed from: d */
    public C28785a f78885d = new C28785a();

    /* renamed from: com.tencent.mm.autogen.events.OmitAllResendSnsEvent$a */
    public static final class C28785a {

        /* renamed from: a */
        public ArrayList f78886a;
    }

    public OmitAllResendSnsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OmitAllResendSnsEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78885d.f78886a, ((OmitAllResendSnsEvent) iEvent).f78885d.f78886a);
    }
}
