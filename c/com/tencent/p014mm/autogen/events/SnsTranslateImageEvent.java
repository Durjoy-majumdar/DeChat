package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsTranslateImageEvent */
public final class SnsTranslateImageEvent extends IEvent {

    /* renamed from: d */
    public C92596a f265206d = new C92596a();

    /* renamed from: com.tencent.mm.autogen.events.SnsTranslateImageEvent$a */
    public static final class C92596a {

        /* renamed from: a */
        public String f265207a;
    }

    public SnsTranslateImageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsTranslateImageEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f265206d.f265207a, ((SnsTranslateImageEvent) iEvent).f265206d.f265207a);
    }
}
