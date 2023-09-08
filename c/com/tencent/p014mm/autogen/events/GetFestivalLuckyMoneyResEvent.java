package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent */
public final class GetFestivalLuckyMoneyResEvent extends IEvent {

    /* renamed from: d */
    public C67709a f193649d = new C67709a();

    /* renamed from: e */
    public C67710b f193650e = new C67710b();

    /* renamed from: com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent$a */
    public static final class C67709a {

        /* renamed from: a */
        public int f193651a = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetFestivalLuckyMoneyResEvent$b */
    public static final class C67710b {
    }

    public GetFestivalLuckyMoneyResEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetFestivalLuckyMoneyResEvent)) {
            return false;
        }
        GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent = (GetFestivalLuckyMoneyResEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f193649d.f193651a), Integer.valueOf(getFestivalLuckyMoneyResEvent.f193649d.f193651a))) {
            return false;
        }
        C67710b bVar = getFestivalLuckyMoneyResEvent.f193650e;
        this.f193650e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f193650e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
