package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent */
public final class FTSEmojiDownloadedEvent extends IEvent {

    /* renamed from: d */
    public C1032a f9141d = new C1032a();

    /* renamed from: e */
    public C1033b f9142e = new C1033b();

    /* renamed from: com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$a */
    public static final class C1032a {

        /* renamed from: a */
        public int f9143a;

        /* renamed from: b */
        public String f9144b;

        /* renamed from: c */
        public String f9145c;

        /* renamed from: d */
        public String f9146d;

        /* renamed from: e */
        public String f9147e;

        /* renamed from: f */
        public String f9148f;

        /* renamed from: g */
        public String f9149g;

        /* renamed from: h */
        public String f9150h;
    }

    /* renamed from: com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent$b */
    public static final class C1033b {

        /* renamed from: a */
        public String f9151a;
    }

    public FTSEmojiDownloadedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FTSEmojiDownloadedEvent)) {
            return false;
        }
        FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent = (FTSEmojiDownloadedEvent) iEvent;
        C1032a aVar = fTSEmojiDownloadedEvent.f9141d;
        if (!C46238a.m51546a(Integer.valueOf(this.f9141d.f9143a), Integer.valueOf(aVar.f9143a)) || !C46238a.m51546a(this.f9141d.f9144b, aVar.f9144b) || !C46238a.m51546a(this.f9141d.f9145c, aVar.f9145c) || !C46238a.m51546a(this.f9141d.f9146d, aVar.f9146d) || !C46238a.m51546a(this.f9141d.f9147e, aVar.f9147e) || !C46238a.m51546a(this.f9141d.f9148f, aVar.f9148f) || !C46238a.m51546a(this.f9141d.f9149g, aVar.f9149g) || !C46238a.m51546a(this.f9141d.f9150h, aVar.f9150h)) {
            return false;
        }
        return C46238a.m51546a(this.f9142e.f9151a, fTSEmojiDownloadedEvent.f9142e.f9151a);
    }
}
