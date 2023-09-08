package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoipEvent */
public final class VoipEvent extends IEvent {

    /* renamed from: d */
    public C67818a f194019d = new C67818a();

    /* renamed from: e */
    public C67819b f194020e = new C67819b();

    /* renamed from: com.tencent.mm.autogen.events.VoipEvent$a */
    public static final class C67818a {

        /* renamed from: a */
        public String f194021a;

        /* renamed from: b */
        public int f194022b = 0;

        /* renamed from: c */
        public byte[] f194023c;

        /* renamed from: d */
        public Context f194024d;

        /* renamed from: e */
        public String f194025e;

        /* renamed from: f */
        public int f194026f = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.VoipEvent$b */
    public static final class C67819b {

        /* renamed from: a */
        public int f194027a = 0;

        /* renamed from: b */
        public boolean f194028b = false;

        /* renamed from: c */
        public boolean f194029c = false;
    }

    public VoipEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoipEvent)) {
            return false;
        }
        VoipEvent voipEvent = (VoipEvent) iEvent;
        C67818a aVar = voipEvent.f194019d;
        if (!C46238a.m51546a(this.f194019d.f194021a, aVar.f194021a) || !C46238a.m51546a(Integer.valueOf(this.f194019d.f194022b), Integer.valueOf(aVar.f194022b)) || !C46238a.m51546a(this.f194019d.f194023c, aVar.f194023c) || !C46238a.m51546a(this.f194019d.f194024d, aVar.f194024d) || !C46238a.m51546a(this.f194019d.f194025e, aVar.f194025e) || !C46238a.m51546a(Integer.valueOf(this.f194019d.f194026f), Integer.valueOf(aVar.f194026f))) {
            return false;
        }
        C67819b bVar = voipEvent.f194020e;
        return C46238a.m51546a(Integer.valueOf(this.f194020e.f194027a), Integer.valueOf(bVar.f194027a)) && C46238a.m51546a(Boolean.valueOf(this.f194020e.f194028b), Boolean.valueOf(bVar.f194028b)) && C46238a.m51546a(Boolean.valueOf(this.f194020e.f194029c), Boolean.valueOf(bVar.f194029c));
    }
}
