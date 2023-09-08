package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GpsInfoEvent */
public final class GpsInfoEvent extends IEvent {

    /* renamed from: d */
    public C114677a f343562d = new C114677a();

    /* renamed from: com.tencent.mm.autogen.events.GpsInfoEvent$a */
    public static final class C114677a {

        /* renamed from: a */
        public int f343563a;

        /* renamed from: b */
        public long f343564b;

        /* renamed from: c */
        public int f343565c;

        /* renamed from: d */
        public float f343566d;

        /* renamed from: e */
        public float f343567e;
    }

    public GpsInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GpsInfoEvent)) {
            return false;
        }
        C114677a aVar = ((GpsInfoEvent) iEvent).f343562d;
        return C46238a.m51546a(Integer.valueOf(this.f343562d.f343563a), Integer.valueOf(aVar.f343563a)) && C46238a.m51546a(Long.valueOf(this.f343562d.f343564b), Long.valueOf(aVar.f343564b)) && C46238a.m51546a(Integer.valueOf(this.f343562d.f343565c), Integer.valueOf(aVar.f343565c)) && C46238a.m51546a(Float.valueOf(this.f343562d.f343566d), Float.valueOf(aVar.f343566d)) && C46238a.m51546a(Float.valueOf(this.f343562d.f343567e), Float.valueOf(aVar.f343567e));
    }
}
