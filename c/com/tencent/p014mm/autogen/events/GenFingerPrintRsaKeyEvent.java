package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent */
public final class GenFingerPrintRsaKeyEvent extends IEvent {

    /* renamed from: d */
    public C67704a f193630d = new C67704a();

    /* renamed from: e */
    public C67705b f193631e = new C67705b();

    /* renamed from: com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent$a */
    public static final class C67704a {

        /* renamed from: a */
        public boolean f193632a = false;

        /* renamed from: b */
        public int f193633b = 0;

        /* renamed from: c */
        public String f193634c;
    }

    /* renamed from: com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent$b */
    public static final class C67705b {

        /* renamed from: a */
        public boolean f193635a = false;

        /* renamed from: b */
        public String f193636b;

        /* renamed from: c */
        public String f193637c;
    }

    public GenFingerPrintRsaKeyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GenFingerPrintRsaKeyEvent)) {
            return false;
        }
        GenFingerPrintRsaKeyEvent genFingerPrintRsaKeyEvent = (GenFingerPrintRsaKeyEvent) iEvent;
        C67704a aVar = genFingerPrintRsaKeyEvent.f193630d;
        if (!C46238a.m51546a(Boolean.valueOf(this.f193630d.f193632a), Boolean.valueOf(aVar.f193632a)) || !C46238a.m51546a(Integer.valueOf(this.f193630d.f193633b), Integer.valueOf(aVar.f193633b)) || !C46238a.m51546a(this.f193630d.f193634c, aVar.f193634c)) {
            return false;
        }
        C67705b bVar = genFingerPrintRsaKeyEvent.f193631e;
        return C46238a.m51546a(Boolean.valueOf(this.f193631e.f193635a), Boolean.valueOf(bVar.f193635a)) && C46238a.m51546a(this.f193631e.f193636b, bVar.f193636b) && C46238a.m51546a(this.f193631e.f193637c, bVar.f193637c);
    }
}
