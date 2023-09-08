package com.tencent.p014mm.autogen.events;

import android.view.View;
import com.tencent.p014mm.sdk.event.IEvent;
import gu2.C98214b;
import if0.C46238a;
import te3.w64;

/* renamed from: com.tencent.mm.autogen.events.SnsReplyEvent */
public final class SnsReplyEvent extends IEvent {

    /* renamed from: d */
    public C92590a f265189d = new C92590a();

    /* renamed from: com.tencent.mm.autogen.events.SnsReplyEvent$a */
    public static final class C92590a {

        /* renamed from: a */
        public C98214b f265190a;

        /* renamed from: b */
        public w64 f265191b;

        /* renamed from: c */
        public View f265192c;
    }

    public SnsReplyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsReplyEvent)) {
            return false;
        }
        C92590a aVar = ((SnsReplyEvent) iEvent).f265189d;
        return C46238a.m51546a(this.f265189d.f265190a, aVar.f265190a) && C46238a.m51546a(this.f265189d.f265191b, aVar.f265191b) && C46238a.m51546a(this.f265189d.f265192c, aVar.f265192c);
    }
}
