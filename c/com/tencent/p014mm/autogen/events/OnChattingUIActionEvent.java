package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OnChattingUIActionEvent */
public final class OnChattingUIActionEvent extends IEvent {

    /* renamed from: d */
    public C67746a f193777d = new C67746a();

    /* renamed from: com.tencent.mm.autogen.events.OnChattingUIActionEvent$a */
    public static final class C67746a {

        /* renamed from: a */
        public int f193778a = 0;

        /* renamed from: b */
        public String f193779b;

        /* renamed from: c */
        public long f193780c;
    }

    public OnChattingUIActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnChattingUIActionEvent)) {
            return false;
        }
        C67746a aVar = ((OnChattingUIActionEvent) iEvent).f193777d;
        return C46238a.m51546a(Integer.valueOf(this.f193777d.f193778a), Integer.valueOf(aVar.f193778a)) && C46238a.m51546a(this.f193777d.f193779b, aVar.f193779b) && C46238a.m51546a(Long.valueOf(this.f193777d.f193780c), Long.valueOf(aVar.f193780c));
    }
}
