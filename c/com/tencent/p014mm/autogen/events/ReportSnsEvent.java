package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportSnsEvent */
public final class ReportSnsEvent extends IEvent {

    /* renamed from: d */
    public C92555a f265064d = new C92555a();

    /* renamed from: com.tencent.mm.autogen.events.ReportSnsEvent$a */
    public static final class C92555a {

        /* renamed from: a */
        public SnsAdClick f265065a;

        /* renamed from: b */
        public int f265066b;

        /* renamed from: c */
        public String f265067c;
    }

    public ReportSnsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportSnsEvent)) {
            return false;
        }
        C92555a aVar = ((ReportSnsEvent) iEvent).f265064d;
        if (!C46238a.m51546a(this.f265064d.f265065a, aVar.f265065a) || !C46238a.m51546a(Integer.valueOf(this.f265064d.f265066b), Integer.valueOf(aVar.f265066b))) {
            return false;
        }
        this.f265064d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f265064d.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(this.f265064d.f265067c, aVar.f265067c);
    }
}
