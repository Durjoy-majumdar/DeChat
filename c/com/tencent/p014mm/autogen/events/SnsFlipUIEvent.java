package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsFlipUIEvent */
public final class SnsFlipUIEvent extends IEvent {

    /* renamed from: d */
    public C92577a f265148d = new C92577a();

    /* renamed from: com.tencent.mm.autogen.events.SnsFlipUIEvent$a */
    public static final class C92577a {

        /* renamed from: a */
        public Context f265149a;

        /* renamed from: b */
        public int f265150b;

        /* renamed from: c */
        public String f265151c;
    }

    public SnsFlipUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsFlipUIEvent)) {
            return false;
        }
        C92577a aVar = ((SnsFlipUIEvent) iEvent).f265148d;
        return C46238a.m51546a(this.f265148d.f265149a, aVar.f265149a) && C46238a.m51546a(Integer.valueOf(this.f265148d.f265150b), Integer.valueOf(aVar.f265150b)) && C46238a.m51546a(this.f265148d.f265151c, aVar.f265151c);
    }
}
