package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsShowStoryHeadViewEvent */
public final class SnsShowStoryHeadViewEvent extends IEvent {

    /* renamed from: d */
    public C55167a f154880d = new C55167a();

    /* renamed from: com.tencent.mm.autogen.events.SnsShowStoryHeadViewEvent$a */
    public static final class C55167a {
    }

    public SnsShowStoryHeadViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsShowStoryHeadViewEvent)) {
            return false;
        }
        C55167a aVar = ((SnsShowStoryHeadViewEvent) iEvent).f154880d;
        this.f154880d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
