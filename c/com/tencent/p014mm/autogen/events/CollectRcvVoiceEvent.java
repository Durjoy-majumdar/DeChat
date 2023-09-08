package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CollectRcvVoiceEvent */
public final class CollectRcvVoiceEvent extends IEvent {

    /* renamed from: d */
    public C67672a f193526d = new C67672a();

    /* renamed from: com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a */
    public static final class C67672a {

        /* renamed from: a */
        public int f193527a;

        /* renamed from: b */
        public String f193528b;

        /* renamed from: c */
        public String f193529c;

        /* renamed from: d */
        public String f193530d;

        /* renamed from: e */
        public long f193531e;

        /* renamed from: f */
        public int f193532f;

        /* renamed from: g */
        public String f193533g;

        /* renamed from: h */
        public String f193534h;

        /* renamed from: i */
        public boolean f193535i = true;
    }

    public CollectRcvVoiceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CollectRcvVoiceEvent)) {
            return false;
        }
        C67672a aVar = ((CollectRcvVoiceEvent) iEvent).f193526d;
        return C46238a.m51546a(Integer.valueOf(this.f193526d.f193527a), Integer.valueOf(aVar.f193527a)) && C46238a.m51546a(this.f193526d.f193528b, aVar.f193528b) && C46238a.m51546a(this.f193526d.f193529c, aVar.f193529c) && C46238a.m51546a(this.f193526d.f193530d, aVar.f193530d) && C46238a.m51546a(Long.valueOf(this.f193526d.f193531e), Long.valueOf(aVar.f193531e)) && C46238a.m51546a(Integer.valueOf(this.f193526d.f193532f), Integer.valueOf(aVar.f193532f)) && C46238a.m51546a(this.f193526d.f193533g, aVar.f193533g) && C46238a.m51546a(this.f193526d.f193534h, aVar.f193534h) && C46238a.m51546a(Boolean.valueOf(this.f193526d.f193535i), Boolean.valueOf(aVar.f193535i));
    }
}
