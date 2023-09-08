package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent */
public final class PauseAutoGetBigImgEvent extends IEvent {

    /* renamed from: d */
    public C92540a f264980d = new C92540a();

    /* renamed from: com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent$a */
    public static final class C92540a {

        /* renamed from: a */
        public boolean f264981a;

        /* renamed from: b */
        public String f264982b;
    }

    public PauseAutoGetBigImgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PauseAutoGetBigImgEvent)) {
            return false;
        }
        C92540a aVar = ((PauseAutoGetBigImgEvent) iEvent).f264980d;
        return C46238a.m51546a(Boolean.valueOf(this.f264980d.f264981a), Boolean.valueOf(aVar.f264981a)) && C46238a.m51546a(this.f264980d.f264982b, aVar.f264982b);
    }
}
