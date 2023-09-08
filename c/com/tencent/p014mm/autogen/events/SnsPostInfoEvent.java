package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.HashMap;

/* renamed from: com.tencent.mm.autogen.events.SnsPostInfoEvent */
public final class SnsPostInfoEvent extends IEvent {

    /* renamed from: d */
    public C55166a f154876d = new C55166a();

    /* renamed from: com.tencent.mm.autogen.events.SnsPostInfoEvent$a */
    public static final class C55166a {

        /* renamed from: a */
        public long f154877a;

        /* renamed from: b */
        public int f154878b;

        /* renamed from: c */
        public HashMap f154879c;
    }

    public SnsPostInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsPostInfoEvent)) {
            return false;
        }
        C55166a aVar = ((SnsPostInfoEvent) iEvent).f154876d;
        return C46238a.m51546a(Long.valueOf(this.f154876d.f154877a), Long.valueOf(aVar.f154877a)) && C46238a.m51546a(Integer.valueOf(this.f154876d.f154878b), Integer.valueOf(aVar.f154878b)) && C46238a.m51546a(this.f154876d.f154879c, aVar.f154879c);
    }
}
