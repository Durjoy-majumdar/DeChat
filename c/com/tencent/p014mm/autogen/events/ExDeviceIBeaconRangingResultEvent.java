package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceIBeaconRangingResultEvent */
public final class ExDeviceIBeaconRangingResultEvent extends IEvent {

    /* renamed from: d */
    public C40071a f107454d = new C40071a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceIBeaconRangingResultEvent$a */
    public static final class C40071a {

        /* renamed from: a */
        public String f107455a;

        /* renamed from: b */
        public int f107456b = 0;

        /* renamed from: c */
        public int f107457c = 0;

        /* renamed from: d */
        public double f107458d = 0.0d;

        /* renamed from: e */
        public double f107459e = 0.0d;

        /* renamed from: f */
        public String f107460f;

        /* renamed from: g */
        public int f107461g = 0;
    }

    public ExDeviceIBeaconRangingResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceIBeaconRangingResultEvent)) {
            return false;
        }
        C40071a aVar = ((ExDeviceIBeaconRangingResultEvent) iEvent).f107454d;
        return C46238a.m51546a(this.f107454d.f107455a, aVar.f107455a) && C46238a.m51546a(Integer.valueOf(this.f107454d.f107456b), Integer.valueOf(aVar.f107456b)) && C46238a.m51546a(Integer.valueOf(this.f107454d.f107457c), Integer.valueOf(aVar.f107457c)) && C46238a.m51546a(Double.valueOf(this.f107454d.f107458d), Double.valueOf(aVar.f107458d)) && C46238a.m51546a(Double.valueOf(this.f107454d.f107459e), Double.valueOf(aVar.f107459e)) && C46238a.m51546a(this.f107454d.f107460f, aVar.f107460f) && C46238a.m51546a(Integer.valueOf(this.f107454d.f107461g), Integer.valueOf(aVar.f107461g));
    }
}
