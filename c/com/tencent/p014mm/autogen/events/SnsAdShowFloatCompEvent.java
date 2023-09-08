package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdShowFloatCompEvent */
public final class SnsAdShowFloatCompEvent extends IEvent {

    /* renamed from: d */
    public C92573a f265132d = new C92573a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdShowFloatCompEvent$a */
    public static final class C92573a {

        /* renamed from: a */
        public int f265133a;

        /* renamed from: b */
        public Context f265134b;
    }

    public SnsAdShowFloatCompEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdShowFloatCompEvent)) {
            return false;
        }
        C92573a aVar = ((SnsAdShowFloatCompEvent) iEvent).f265132d;
        return C46238a.m51546a(Integer.valueOf(this.f265132d.f265133a), Integer.valueOf(aVar.f265133a)) && C46238a.m51546a(this.f265132d.f265134b, aVar.f265134b);
    }
}
