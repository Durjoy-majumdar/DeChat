package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdVideoBonusSceneEvent */
public final class SnsAdVideoBonusSceneEvent extends IEvent {

    /* renamed from: d */
    public C55164a f154874d = new C55164a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdVideoBonusSceneEvent$a */
    public static final class C55164a {
    }

    public SnsAdVideoBonusSceneEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdVideoBonusSceneEvent)) {
            return false;
        }
        C55164a aVar = ((SnsAdVideoBonusSceneEvent) iEvent).f154874d;
        this.f154874d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
