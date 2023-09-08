package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StoryFlipUIEvent */
public final class StoryFlipUIEvent extends IEvent {

    /* renamed from: d */
    public C1148a f9559d = new C1148a();

    /* renamed from: com.tencent.mm.autogen.events.StoryFlipUIEvent$a */
    public static final class C1148a {
    }

    public StoryFlipUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StoryFlipUIEvent)) {
            return false;
        }
        C1148a aVar = ((StoryFlipUIEvent) iEvent).f9559d;
        this.f9559d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9559d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
