package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.autogen.events.GetAllNeedResendSnsEvent */
public final class GetAllNeedResendSnsEvent extends IEvent {

    /* renamed from: d */
    public C28750a f78810d = new C28750a();

    /* renamed from: com.tencent.mm.autogen.events.GetAllNeedResendSnsEvent$a */
    public static final class C28750a {

        /* renamed from: a */
        public ArrayList f78811a;
    }

    public GetAllNeedResendSnsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetAllNeedResendSnsEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78810d.f78811a, ((GetAllNeedResendSnsEvent) iEvent).f78810d.f78811a);
    }
}
