package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QueryGameLifeMsgEvent */
public final class QueryGameLifeMsgEvent extends IEvent {

    /* renamed from: d */
    public C40155a f107703d = new C40155a();

    /* renamed from: com.tencent.mm.autogen.events.QueryGameLifeMsgEvent$a */
    public static final class C40155a {

        /* renamed from: a */
        public boolean f107704a;

        /* renamed from: b */
        public String f107705b;

        /* renamed from: c */
        public String f107706c;

        /* renamed from: d */
        public int f107707d;

        /* renamed from: e */
        public long f107708e;

        /* renamed from: f */
        public long f107709f = 0;
    }

    public QueryGameLifeMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QueryGameLifeMsgEvent)) {
            return false;
        }
        C40155a aVar = ((QueryGameLifeMsgEvent) iEvent).f107703d;
        return C46238a.m51546a(Boolean.valueOf(this.f107703d.f107704a), Boolean.valueOf(aVar.f107704a)) && C46238a.m51546a(this.f107703d.f107705b, aVar.f107705b) && C46238a.m51546a(this.f107703d.f107706c, aVar.f107706c) && C46238a.m51546a(Integer.valueOf(this.f107703d.f107707d), Integer.valueOf(aVar.f107707d)) && C46238a.m51546a(Long.valueOf(this.f107703d.f107708e), Long.valueOf(aVar.f107708e)) && C46238a.m51546a(Long.valueOf(this.f107703d.f107709f), Long.valueOf(aVar.f107709f));
    }
}
