package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent */
public final class QueryRecordMsgMediaListEvent extends IEvent {

    /* renamed from: d */
    public C92546a f265003d = new C92546a();

    /* renamed from: e */
    public C92547b f265004e = new C92547b();

    /* renamed from: com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent$a */
    public static final class C92546a {

        /* renamed from: a */
        public String f265005a;

        /* renamed from: b */
        public long f265006b;
    }

    /* renamed from: com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent$b */
    public static final class C92547b {

        /* renamed from: a */
        public String f265007a;
    }

    public QueryRecordMsgMediaListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QueryRecordMsgMediaListEvent)) {
            return false;
        }
        QueryRecordMsgMediaListEvent queryRecordMsgMediaListEvent = (QueryRecordMsgMediaListEvent) iEvent;
        C92546a aVar = queryRecordMsgMediaListEvent.f265003d;
        if (!C46238a.m51546a(this.f265003d.f265005a, aVar.f265005a) || !C46238a.m51546a(Long.valueOf(this.f265003d.f265006b), Long.valueOf(aVar.f265006b))) {
            return false;
        }
        return C46238a.m51546a(this.f265004e.f265007a, queryRecordMsgMediaListEvent.f265004e.f265007a);
    }
}
