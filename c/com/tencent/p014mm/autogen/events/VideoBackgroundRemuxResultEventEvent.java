package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent */
public final class VideoBackgroundRemuxResultEventEvent extends IEvent {

    /* renamed from: d */
    public C92609a f265253d = new C92609a();

    /* renamed from: com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent$a */
    public static final class C92609a {

        /* renamed from: a */
        public int f265254a = -1;

        /* renamed from: b */
        public String f265255b;

        /* renamed from: c */
        public int f265256c = 0;
    }

    public VideoBackgroundRemuxResultEventEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VideoBackgroundRemuxResultEventEvent)) {
            return false;
        }
        C92609a aVar = ((VideoBackgroundRemuxResultEventEvent) iEvent).f265253d;
        return C46238a.m51546a(Integer.valueOf(this.f265253d.f265254a), Integer.valueOf(aVar.f265254a)) && C46238a.m51546a(this.f265253d.f265255b, aVar.f265255b) && C46238a.m51546a(Integer.valueOf(this.f265253d.f265256c), Integer.valueOf(aVar.f265256c));
    }
}
