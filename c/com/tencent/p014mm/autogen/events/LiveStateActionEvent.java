package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LiveStateActionEvent */
public final class LiveStateActionEvent extends IEvent {

    /* renamed from: d */
    public C55143a f154829d = new C55143a();

    /* renamed from: com.tencent.mm.autogen.events.LiveStateActionEvent$a */
    public static final class C55143a {

        /* renamed from: a */
        public boolean f154830a;

        /* renamed from: b */
        public boolean f154831b;

        /* renamed from: c */
        public boolean f154832c;

        /* renamed from: d */
        public boolean f154833d;
    }

    public LiveStateActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LiveStateActionEvent)) {
            return false;
        }
        C55143a aVar = ((LiveStateActionEvent) iEvent).f154829d;
        return C46238a.m51546a(Boolean.valueOf(this.f154829d.f154830a), Boolean.valueOf(aVar.f154830a)) && C46238a.m51546a(Boolean.valueOf(this.f154829d.f154831b), Boolean.valueOf(aVar.f154831b)) && C46238a.m51546a(Boolean.valueOf(this.f154829d.f154832c), Boolean.valueOf(aVar.f154832c)) && C46238a.m51546a(Boolean.valueOf(this.f154829d.f154833d), Boolean.valueOf(aVar.f154833d));
    }
}
