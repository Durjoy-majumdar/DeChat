package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.WepkgNotifyEvent */
public final class WepkgNotifyEvent extends IEvent {

    /* renamed from: d */
    public C40188a f107837d = new C40188a();

    /* renamed from: com.tencent.mm.autogen.events.WepkgNotifyEvent$a */
    public static final class C40188a {

        /* renamed from: a */
        public int f107838a;

        /* renamed from: b */
        public String f107839b;

        /* renamed from: c */
        public boolean f107840c = false;

        /* renamed from: d */
        public int f107841d = 0;

        /* renamed from: e */
        public int f107842e = 0;

        /* renamed from: f */
        public int f107843f = 0;

        /* renamed from: g */
        public int f107844g;

        /* renamed from: h */
        public List f107845h;
    }

    public WepkgNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WepkgNotifyEvent)) {
            return false;
        }
        C40188a aVar = ((WepkgNotifyEvent) iEvent).f107837d;
        return C46238a.m51546a(Integer.valueOf(this.f107837d.f107838a), Integer.valueOf(aVar.f107838a)) && C46238a.m51546a(this.f107837d.f107839b, aVar.f107839b) && C46238a.m51546a(Boolean.valueOf(this.f107837d.f107840c), Boolean.valueOf(aVar.f107840c)) && C46238a.m51546a(Integer.valueOf(this.f107837d.f107841d), Integer.valueOf(aVar.f107841d)) && C46238a.m51546a(Integer.valueOf(this.f107837d.f107842e), Integer.valueOf(aVar.f107842e)) && C46238a.m51546a(Integer.valueOf(this.f107837d.f107843f), Integer.valueOf(aVar.f107843f)) && C46238a.m51546a(Integer.valueOf(this.f107837d.f107844g), Integer.valueOf(aVar.f107844g)) && C46238a.m51546a(this.f107837d.f107845h, aVar.f107845h);
    }
}
