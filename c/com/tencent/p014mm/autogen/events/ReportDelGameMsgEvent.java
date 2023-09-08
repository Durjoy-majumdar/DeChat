package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportDelGameMsgEvent */
public final class ReportDelGameMsgEvent extends IEvent {

    /* renamed from: d */
    public C92554a f265059d = new C92554a();

    /* renamed from: com.tencent.mm.autogen.events.ReportDelGameMsgEvent$a */
    public static final class C92554a {

        /* renamed from: a */
        public String f265060a;

        /* renamed from: b */
        public String f265061b;

        /* renamed from: c */
        public String f265062c;

        /* renamed from: d */
        public String f265063d;
    }

    public ReportDelGameMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportDelGameMsgEvent)) {
            return false;
        }
        C92554a aVar = ((ReportDelGameMsgEvent) iEvent).f265059d;
        return C46238a.m51546a(this.f265059d.f265060a, aVar.f265060a) && C46238a.m51546a(this.f265059d.f265061b, aVar.f265061b) && C46238a.m51546a(this.f265059d.f265062c, aVar.f265062c) && C46238a.m51546a(this.f265059d.f265063d, aVar.f265063d);
    }
}
