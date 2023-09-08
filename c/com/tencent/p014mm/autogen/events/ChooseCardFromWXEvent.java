package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChooseCardFromWXEvent */
public final class ChooseCardFromWXEvent extends IEvent {

    /* renamed from: d */
    public C80709a f236163d = new C80709a();

    /* renamed from: com.tencent.mm.autogen.events.ChooseCardFromWXEvent$a */
    public static final class C80709a {

        /* renamed from: a */
        public String[] f236164a;

        /* renamed from: b */
        public String[] f236165b;

        /* renamed from: c */
        public Context f236166c;
    }

    public ChooseCardFromWXEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChooseCardFromWXEvent)) {
            return false;
        }
        C80709a aVar = ((ChooseCardFromWXEvent) iEvent).f236163d;
        return C46238a.m51546a(this.f236163d.f236164a, aVar.f236164a) && C46238a.m51546a(this.f236163d.f236165b, aVar.f236165b) && C46238a.m51546a(this.f236163d.f236166c, aVar.f236166c);
    }
}
