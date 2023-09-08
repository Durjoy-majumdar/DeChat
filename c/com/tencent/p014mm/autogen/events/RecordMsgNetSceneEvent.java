package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RecordMsgNetSceneEvent */
public final class RecordMsgNetSceneEvent extends IEvent {

    /* renamed from: d */
    public C67771a f193874d = new C67771a();

    /* renamed from: com.tencent.mm.autogen.events.RecordMsgNetSceneEvent$a */
    public static final class C67771a {

        /* renamed from: a */
        public long f193875a;

        /* renamed from: b */
        public boolean f193876b = false;

        /* renamed from: c */
        public String f193877c;
    }

    public RecordMsgNetSceneEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecordMsgNetSceneEvent)) {
            return false;
        }
        C67771a aVar = ((RecordMsgNetSceneEvent) iEvent).f193874d;
        return C46238a.m51546a(Long.valueOf(this.f193874d.f193875a), Long.valueOf(aVar.f193875a)) && C46238a.m51546a(Boolean.valueOf(this.f193874d.f193876b), Boolean.valueOf(aVar.f193876b)) && C46238a.m51546a(this.f193874d.f193877c, aVar.f193877c);
    }
}
