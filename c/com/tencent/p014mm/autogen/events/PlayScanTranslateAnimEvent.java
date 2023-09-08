package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent */
public final class PlayScanTranslateAnimEvent extends IEvent {

    /* renamed from: d */
    public C114686a f343590d = new C114686a();

    /* renamed from: com.tencent.mm.autogen.events.PlayScanTranslateAnimEvent$a */
    public static final class C114686a {

        /* renamed from: a */
        public int f343591a = 0;
    }

    public PlayScanTranslateAnimEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PlayScanTranslateAnimEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f343590d.f343591a), Integer.valueOf(((PlayScanTranslateAnimEvent) iEvent).f343590d.f343591a));
    }
}
