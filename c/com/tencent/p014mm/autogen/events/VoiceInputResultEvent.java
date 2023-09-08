package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoiceInputResultEvent */
public final class VoiceInputResultEvent extends IEvent {

    /* renamed from: d */
    public C17693a f48133d = new C17693a();

    /* renamed from: com.tencent.mm.autogen.events.VoiceInputResultEvent$a */
    public static final class C17693a {

        /* renamed from: a */
        public int f48134a;

        /* renamed from: b */
        public int f48135b;

        /* renamed from: c */
        public String f48136c;

        /* renamed from: d */
        public String f48137d;
    }

    public VoiceInputResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoiceInputResultEvent)) {
            return false;
        }
        C17693a aVar = ((VoiceInputResultEvent) iEvent).f48133d;
        return C46238a.m51546a(Integer.valueOf(this.f48133d.f48134a), Integer.valueOf(aVar.f48134a)) && C46238a.m51546a(Integer.valueOf(this.f48133d.f48135b), Integer.valueOf(aVar.f48135b)) && C46238a.m51546a(this.f48133d.f48136c, aVar.f48136c) && C46238a.m51546a(this.f48133d.f48137d, aVar.f48137d);
    }
}
