package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.autogen.events.LiteAppCloseWindowEvent */
public final class LiteAppCloseWindowEvent extends IEvent {

    /* renamed from: d */
    public C104592a f309997d = new C104592a();

    /* renamed from: com.tencent.mm.autogen.events.LiteAppCloseWindowEvent$a */
    public static final class C104592a {

        /* renamed from: a */
        public JSONObject f309998a;

        /* renamed from: b */
        public String f309999b;

        /* renamed from: c */
        public Long f310000c;
    }

    public LiteAppCloseWindowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LiteAppCloseWindowEvent)) {
            return false;
        }
        C104592a aVar = ((LiteAppCloseWindowEvent) iEvent).f309997d;
        return C46238a.m51546a(this.f309997d.f309998a, aVar.f309998a) && C46238a.m51546a(this.f309997d.f309999b, aVar.f309999b) && C46238a.m51546a(this.f309997d.f310000c, aVar.f310000c);
    }
}
