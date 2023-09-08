package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanTranslationEvent */
public final class ScanTranslationEvent extends IEvent {

    /* renamed from: d */
    public C92559a f265085d = new C92559a();

    /* renamed from: com.tencent.mm.autogen.events.ScanTranslationEvent$a */
    public static final class C92559a {

        /* renamed from: a */
        public int f265086a = 0;

        /* renamed from: b */
        public int f265087b;

        /* renamed from: c */
        public String f265088c;
    }

    public ScanTranslationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanTranslationEvent)) {
            return false;
        }
        C92559a aVar = ((ScanTranslationEvent) iEvent).f265085d;
        return C46238a.m51546a(Integer.valueOf(this.f265085d.f265086a), Integer.valueOf(aVar.f265086a)) && C46238a.m51546a(Integer.valueOf(this.f265085d.f265087b), Integer.valueOf(aVar.f265087b)) && C46238a.m51546a(this.f265085d.f265088c, aVar.f265088c);
    }
}
