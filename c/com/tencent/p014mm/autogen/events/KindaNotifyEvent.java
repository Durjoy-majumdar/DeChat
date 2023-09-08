package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.HashMap;

/* renamed from: com.tencent.mm.autogen.events.KindaNotifyEvent */
public final class KindaNotifyEvent extends IEvent {

    /* renamed from: d */
    public C28768a f78850d = new C28768a();

    /* renamed from: com.tencent.mm.autogen.events.KindaNotifyEvent$a */
    public static final class C28768a {

        /* renamed from: a */
        public String f78851a;

        /* renamed from: b */
        public HashMap f78852b;
    }

    public KindaNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KindaNotifyEvent)) {
            return false;
        }
        C28768a aVar = ((KindaNotifyEvent) iEvent).f78850d;
        return C46238a.m51546a(this.f78850d.f78851a, aVar.f78851a) && C46238a.m51546a(this.f78850d.f78852b, aVar.f78852b);
    }
}
