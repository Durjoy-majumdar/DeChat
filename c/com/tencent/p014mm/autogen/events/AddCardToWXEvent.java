package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AddCardToWXEvent */
public final class AddCardToWXEvent extends IEvent {

    /* renamed from: d */
    public C80699a f236123d = new C80699a();

    /* renamed from: com.tencent.mm.autogen.events.AddCardToWXEvent$a */
    public static final class C80699a {

        /* renamed from: a */
        public String[] f236124a;

        /* renamed from: b */
        public String[] f236125b;

        /* renamed from: c */
        public Context f236126c;
    }

    public AddCardToWXEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AddCardToWXEvent)) {
            return false;
        }
        C80699a aVar = ((AddCardToWXEvent) iEvent).f236123d;
        return C46238a.m51546a(this.f236123d.f236124a, aVar.f236124a) && C46238a.m51546a(this.f236123d.f236125b, aVar.f236125b) && C46238a.m51546a(this.f236123d.f236126c, aVar.f236126c);
    }
}
