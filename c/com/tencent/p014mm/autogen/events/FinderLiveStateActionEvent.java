package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveStateActionEvent */
public final class FinderLiveStateActionEvent extends IEvent {

    /* renamed from: d */
    public C55128a f154780d = new C55128a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveStateActionEvent$a */
    public static final class C55128a {

        /* renamed from: a */
        public boolean f154781a;

        /* renamed from: b */
        public boolean f154782b;

        /* renamed from: c */
        public boolean f154783c;

        /* renamed from: d */
        public boolean f154784d;

        /* renamed from: e */
        public boolean f154785e;

        /* renamed from: f */
        public boolean f154786f;
    }

    public FinderLiveStateActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveStateActionEvent)) {
            return false;
        }
        C55128a aVar = ((FinderLiveStateActionEvent) iEvent).f154780d;
        return C46238a.m51546a(Boolean.valueOf(this.f154780d.f154781a), Boolean.valueOf(aVar.f154781a)) && C46238a.m51546a(Boolean.valueOf(this.f154780d.f154782b), Boolean.valueOf(aVar.f154782b)) && C46238a.m51546a(Boolean.valueOf(this.f154780d.f154783c), Boolean.valueOf(aVar.f154783c)) && C46238a.m51546a(Boolean.valueOf(this.f154780d.f154784d), Boolean.valueOf(aVar.f154784d)) && C46238a.m51546a(Boolean.valueOf(this.f154780d.f154785e), Boolean.valueOf(aVar.f154785e)) && C46238a.m51546a(Boolean.valueOf(this.f154780d.f154786f), Boolean.valueOf(aVar.f154786f));
    }
}
