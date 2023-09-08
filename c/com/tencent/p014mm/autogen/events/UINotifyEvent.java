package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UINotifyEvent */
public final class UINotifyEvent extends IEvent {

    /* renamed from: d */
    public C114698a f343630d = new C114698a();

    /* renamed from: com.tencent.mm.autogen.events.UINotifyEvent$a */
    public static final class C114698a {

        /* renamed from: a */
        public boolean f343631a = false;

        /* renamed from: b */
        public String f343632b;

        /* renamed from: c */
        public String f343633c;

        /* renamed from: d */
        public int f343634d = 0;

        /* renamed from: e */
        public int f343635e = 0;

        /* renamed from: f */
        public String f343636f;

        /* renamed from: g */
        public int f343637g = 0;

        /* renamed from: h */
        public String f343638h;

        /* renamed from: i */
        public int f343639i = 0;
    }

    public UINotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UINotifyEvent)) {
            return false;
        }
        C114698a aVar = ((UINotifyEvent) iEvent).f343630d;
        if (!C46238a.m51546a(Boolean.valueOf(this.f343630d.f343631a), Boolean.valueOf(aVar.f343631a)) || !C46238a.m51546a(this.f343630d.f343632b, aVar.f343632b) || !C46238a.m51546a(this.f343630d.f343633c, aVar.f343633c) || !C46238a.m51546a(Integer.valueOf(this.f343630d.f343634d), Integer.valueOf(aVar.f343634d))) {
            return false;
        }
        this.f343630d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f343630d.f343635e), Integer.valueOf(aVar.f343635e)) && C46238a.m51546a(this.f343630d.f343636f, aVar.f343636f) && C46238a.m51546a(Integer.valueOf(this.f343630d.f343637g), Integer.valueOf(aVar.f343637g)) && C46238a.m51546a(this.f343630d.f343638h, aVar.f343638h) && C46238a.m51546a(Integer.valueOf(this.f343630d.f343639i), Integer.valueOf(aVar.f343639i));
    }
}
