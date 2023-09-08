package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent */
public final class VoiceMsgDownloadFinishEvent extends IEvent {

    /* renamed from: d */
    public C67814a f194004d = new C67814a();

    /* renamed from: com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent$a */
    public static final class C67814a {

        /* renamed from: a */
        public long f194005a;

        /* renamed from: b */
        public boolean f194006b;

        /* renamed from: c */
        public boolean f194007c;
    }

    public VoiceMsgDownloadFinishEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoiceMsgDownloadFinishEvent)) {
            return false;
        }
        C67814a aVar = ((VoiceMsgDownloadFinishEvent) iEvent).f194004d;
        return C46238a.m51546a(Long.valueOf(this.f194004d.f194005a), Long.valueOf(aVar.f194005a)) && C46238a.m51546a(Boolean.valueOf(this.f194004d.f194006b), Boolean.valueOf(aVar.f194006b)) && C46238a.m51546a(Boolean.valueOf(this.f194004d.f194007c), Boolean.valueOf(aVar.f194007c));
    }
}
