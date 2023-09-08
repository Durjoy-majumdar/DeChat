package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtTranslateVoiceEvent */
public final class ExtTranslateVoiceEvent extends IEvent {

    /* renamed from: d */
    public C67684a f193561d = new C67684a();

    /* renamed from: e */
    public C67685b f193562e = new C67685b();

    /* renamed from: com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a */
    public static final class C67684a {

        /* renamed from: a */
        public String f193563a;

        /* renamed from: b */
        public String f193564b;

        /* renamed from: c */
        public int f193565c = 0;

        /* renamed from: d */
        public int f193566d = 0;

        /* renamed from: e */
        public Runnable f193567e;

        /* renamed from: f */
        public int f193568f;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$b */
    public static final class C67685b {

        /* renamed from: a */
        public String f193569a;

        /* renamed from: b */
        public boolean f193570b;

        /* renamed from: c */
        public int f193571c = 0;
    }

    public ExtTranslateVoiceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtTranslateVoiceEvent)) {
            return false;
        }
        ExtTranslateVoiceEvent extTranslateVoiceEvent = (ExtTranslateVoiceEvent) iEvent;
        C67684a aVar = extTranslateVoiceEvent.f193561d;
        if (!C46238a.m51546a(this.f193561d.f193563a, aVar.f193563a) || !C46238a.m51546a(this.f193561d.f193564b, aVar.f193564b) || !C46238a.m51546a(Integer.valueOf(this.f193561d.f193565c), Integer.valueOf(aVar.f193565c)) || !C46238a.m51546a(Integer.valueOf(this.f193561d.f193566d), Integer.valueOf(aVar.f193566d)) || !C46238a.m51546a(this.f193561d.f193567e, aVar.f193567e) || !C46238a.m51546a(Integer.valueOf(this.f193561d.f193568f), Integer.valueOf(aVar.f193568f))) {
            return false;
        }
        C67685b bVar = extTranslateVoiceEvent.f193562e;
        return C46238a.m51546a(this.f193562e.f193569a, bVar.f193569a) && C46238a.m51546a(Boolean.valueOf(this.f193562e.f193570b), Boolean.valueOf(bVar.f193570b)) && C46238a.m51546a(Integer.valueOf(this.f193562e.f193571c), Integer.valueOf(bVar.f193571c));
    }
}
