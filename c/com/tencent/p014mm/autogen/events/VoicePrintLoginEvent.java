package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoicePrintLoginEvent */
public final class VoicePrintLoginEvent extends IEvent {

    /* renamed from: d */
    public C24259a f69433d = new C24259a();

    /* renamed from: e */
    public C24260b f69434e = new C24260b();

    /* renamed from: com.tencent.mm.autogen.events.VoicePrintLoginEvent$a */
    public static final class C24259a {
    }

    /* renamed from: com.tencent.mm.autogen.events.VoicePrintLoginEvent$b */
    public static final class C24260b {

        /* renamed from: a */
        public Object f69435a = 0;
    }

    public VoicePrintLoginEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoicePrintLoginEvent)) {
            return false;
        }
        VoicePrintLoginEvent voicePrintLoginEvent = (VoicePrintLoginEvent) iEvent;
        C24259a aVar = voicePrintLoginEvent.f69433d;
        this.f69433d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f69433d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f69433d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        return C46238a.m51546a(this.f69434e.f69435a, voicePrintLoginEvent.f69434e.f69435a);
    }
}
