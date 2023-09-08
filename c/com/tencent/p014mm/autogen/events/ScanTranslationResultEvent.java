package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanTranslationResultEvent */
public final class ScanTranslationResultEvent extends IEvent {

    /* renamed from: d */
    public C92560a f265089d = new C92560a();

    /* renamed from: com.tencent.mm.autogen.events.ScanTranslationResultEvent$a */
    public static final class C92560a {

        /* renamed from: a */
        public int f265090a;

        /* renamed from: b */
        public int f265091b = 0;

        /* renamed from: c */
        public boolean f265092c;

        /* renamed from: d */
        public String f265093d;

        /* renamed from: e */
        public String f265094e;

        /* renamed from: f */
        public String f265095f;
    }

    public ScanTranslationResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanTranslationResultEvent)) {
            return false;
        }
        C92560a aVar = ((ScanTranslationResultEvent) iEvent).f265089d;
        return C46238a.m51546a(Integer.valueOf(this.f265089d.f265090a), Integer.valueOf(aVar.f265090a)) && C46238a.m51546a(Integer.valueOf(this.f265089d.f265091b), Integer.valueOf(aVar.f265091b)) && C46238a.m51546a(Boolean.valueOf(this.f265089d.f265092c), Boolean.valueOf(aVar.f265092c)) && C46238a.m51546a(this.f265089d.f265093d, aVar.f265093d) && C46238a.m51546a(this.f265089d.f265094e, aVar.f265094e) && C46238a.m51546a(this.f265089d.f265095f, aVar.f265095f);
    }
}
