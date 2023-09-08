package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TranslateMessageResultEvent */
public final class TranslateMessageResultEvent extends IEvent {

    /* renamed from: d */
    public C92608a f265243d = new C92608a();

    /* renamed from: com.tencent.mm.autogen.events.TranslateMessageResultEvent$a */
    public static final class C92608a {

        /* renamed from: a */
        public int f265244a;

        /* renamed from: b */
        public String f265245b;

        /* renamed from: c */
        public String f265246c;

        /* renamed from: d */
        public String f265247d;

        /* renamed from: e */
        public int f265248e;

        /* renamed from: f */
        public String f265249f;

        /* renamed from: g */
        public String f265250g;

        /* renamed from: h */
        public byte[] f265251h;

        /* renamed from: i */
        public int f265252i = 0;
    }

    public TranslateMessageResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TranslateMessageResultEvent)) {
            return false;
        }
        C92608a aVar = ((TranslateMessageResultEvent) iEvent).f265243d;
        return C46238a.m51546a(Integer.valueOf(this.f265243d.f265244a), Integer.valueOf(aVar.f265244a)) && C46238a.m51546a(this.f265243d.f265245b, aVar.f265245b) && C46238a.m51546a(this.f265243d.f265246c, aVar.f265246c) && C46238a.m51546a(this.f265243d.f265247d, aVar.f265247d) && C46238a.m51546a(Integer.valueOf(this.f265243d.f265248e), Integer.valueOf(aVar.f265248e)) && C46238a.m51546a(this.f265243d.f265249f, aVar.f265249f) && C46238a.m51546a(this.f265243d.f265250g, aVar.f265250g) && C46238a.m51546a(this.f265243d.f265251h, aVar.f265251h) && C46238a.m51546a(Integer.valueOf(this.f265243d.f265252i), Integer.valueOf(aVar.f265252i));
    }
}
