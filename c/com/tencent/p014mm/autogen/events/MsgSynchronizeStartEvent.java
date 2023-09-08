package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MsgSynchronizeStartEvent */
public final class MsgSynchronizeStartEvent extends IEvent {

    /* renamed from: d */
    public C1093a f9331d = new C1093a();

    /* renamed from: com.tencent.mm.autogen.events.MsgSynchronizeStartEvent$a */
    public static final class C1093a {

        /* renamed from: a */
        public byte[] f9332a;

        /* renamed from: b */
        public int f9333b;

        /* renamed from: c */
        public boolean f9334c;

        /* renamed from: d */
        public String f9335d;
    }

    public MsgSynchronizeStartEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MsgSynchronizeStartEvent)) {
            return false;
        }
        C1093a aVar = ((MsgSynchronizeStartEvent) iEvent).f9331d;
        return C46238a.m51546a(this.f9331d.f9332a, aVar.f9332a) && C46238a.m51546a(Integer.valueOf(this.f9331d.f9333b), Integer.valueOf(aVar.f9333b)) && C46238a.m51546a(Boolean.valueOf(this.f9331d.f9334c), Boolean.valueOf(aVar.f9334c)) && C46238a.m51546a(this.f9331d.f9335d, aVar.f9335d);
    }
}
