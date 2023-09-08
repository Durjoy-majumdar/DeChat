package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.KickOfflineEvent */
public final class KickOfflineEvent extends IEvent {

    /* renamed from: d */
    public C28767a f78847d = new C28767a();

    /* renamed from: com.tencent.mm.autogen.events.KickOfflineEvent$a */
    public static final class C28767a {

        /* renamed from: a */
        public String f78848a;

        /* renamed from: b */
        public String f78849b;
    }

    public KickOfflineEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KickOfflineEvent)) {
            return false;
        }
        C28767a aVar = ((KickOfflineEvent) iEvent).f78847d;
        return C46238a.m51546a(this.f78847d.f78848a, aVar.f78848a) && C46238a.m51546a(this.f78847d.f78849b, aVar.f78849b);
    }
}
