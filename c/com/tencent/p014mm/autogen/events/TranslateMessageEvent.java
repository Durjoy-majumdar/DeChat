package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TranslateMessageEvent */
public final class TranslateMessageEvent extends IEvent {

    /* renamed from: d */
    public C67800a f193961d = new C67800a();

    /* renamed from: com.tencent.mm.autogen.events.TranslateMessageEvent$a */
    public static final class C67800a {

        /* renamed from: a */
        public String f193962a;

        /* renamed from: b */
        public String f193963b;

        /* renamed from: c */
        public int f193964c;

        /* renamed from: d */
        public String f193965d;

        /* renamed from: e */
        public byte[] f193966e;
    }

    public TranslateMessageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TranslateMessageEvent)) {
            return false;
        }
        C67800a aVar = ((TranslateMessageEvent) iEvent).f193961d;
        if (!C46238a.m51546a(this.f193961d.f193962a, aVar.f193962a) || !C46238a.m51546a(this.f193961d.f193963b, aVar.f193963b) || !C46238a.m51546a(Integer.valueOf(this.f193961d.f193964c), Integer.valueOf(aVar.f193964c)) || !C46238a.m51546a(this.f193961d.f193965d, aVar.f193965d)) {
            return false;
        }
        this.f193961d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool) && C46238a.m51546a(this.f193961d.f193966e, aVar.f193966e);
    }
}
