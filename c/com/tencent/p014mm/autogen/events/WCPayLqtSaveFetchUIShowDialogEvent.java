package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C52159yr2;

/* renamed from: com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent */
public final class WCPayLqtSaveFetchUIShowDialogEvent extends IEvent {

    /* renamed from: d */
    public C40181a f107805d = new C40181a();

    /* renamed from: com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent$a */
    public static final class C40181a {

        /* renamed from: a */
        public C52159yr2 f107806a;

        /* renamed from: b */
        public byte[] f107807b;
    }

    public WCPayLqtSaveFetchUIShowDialogEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WCPayLqtSaveFetchUIShowDialogEvent)) {
            return false;
        }
        C40181a aVar = ((WCPayLqtSaveFetchUIShowDialogEvent) iEvent).f107805d;
        return C46238a.m51546a(this.f107805d.f107806a, aVar.f107806a) && C46238a.m51546a(this.f107805d.f107807b, aVar.f107807b);
    }
}
