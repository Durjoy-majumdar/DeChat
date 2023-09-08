package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.LinkedList;
import te3.C50869ps2;

/* renamed from: com.tencent.mm.autogen.events.SetRecvTmpMsgOptionEvent */
public final class SetRecvTmpMsgOptionEvent extends IEvent {

    /* renamed from: d */
    public C28823a f78977d = new C28823a();

    /* renamed from: com.tencent.mm.autogen.events.SetRecvTmpMsgOptionEvent$a */
    public static final class C28823a {

        /* renamed from: a */
        public String f78978a;

        /* renamed from: b */
        public LinkedList<C50869ps2> f78979b;
    }

    public SetRecvTmpMsgOptionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SetRecvTmpMsgOptionEvent)) {
            return false;
        }
        C28823a aVar = ((SetRecvTmpMsgOptionEvent) iEvent).f78977d;
        return C46238a.m51546a(this.f78977d.f78978a, aVar.f78978a) && C46238a.m51546a(this.f78977d.f78979b, aVar.f78979b);
    }
}
