package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BizPreSearchEvent */
public final class BizPreSearchEvent extends IEvent {

    /* renamed from: d */
    public C40042a f107375d = new C40042a();

    /* renamed from: e */
    public C40043b f107376e = new C40043b();

    /* renamed from: com.tencent.mm.autogen.events.BizPreSearchEvent$a */
    public static final class C40042a {

        /* renamed from: a */
        public Context f107377a;

        /* renamed from: b */
        public int f107378b = 0;

        /* renamed from: c */
        public String f107379c;

        /* renamed from: d */
        public long f107380d = 0;

        /* renamed from: e */
        public int f107381e = 0;

        /* renamed from: f */
        public String f107382f;

        /* renamed from: g */
        public Runnable f107383g;
    }

    /* renamed from: com.tencent.mm.autogen.events.BizPreSearchEvent$b */
    public static final class C40043b {

        /* renamed from: a */
        public boolean f107384a = false;
    }

    public BizPreSearchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BizPreSearchEvent)) {
            return false;
        }
        BizPreSearchEvent bizPreSearchEvent = (BizPreSearchEvent) iEvent;
        C40042a aVar = bizPreSearchEvent.f107375d;
        if (!C46238a.m51546a(this.f107375d.f107377a, aVar.f107377a) || !C46238a.m51546a(Integer.valueOf(this.f107375d.f107378b), Integer.valueOf(aVar.f107378b)) || !C46238a.m51546a(this.f107375d.f107379c, aVar.f107379c) || !C46238a.m51546a(Long.valueOf(this.f107375d.f107380d), Long.valueOf(aVar.f107380d))) {
            return false;
        }
        this.f107375d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(Integer.valueOf(this.f107375d.f107381e), Integer.valueOf(aVar.f107381e)) || !C46238a.m51546a(this.f107375d.f107382f, aVar.f107382f)) {
            return false;
        }
        this.f107375d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool) || !C46238a.m51546a(this.f107375d.f107383g, aVar.f107383g)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107376e.f107384a), Boolean.valueOf(bizPreSearchEvent.f107376e.f107384a));
    }
}
