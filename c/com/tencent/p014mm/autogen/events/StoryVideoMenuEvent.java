package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StoryVideoMenuEvent */
public final class StoryVideoMenuEvent extends IEvent {

    /* renamed from: d */
    public C1150a f9561d = new C1150a();

    /* renamed from: com.tencent.mm.autogen.events.StoryVideoMenuEvent$a */
    public static final class C1150a {
    }

    public StoryVideoMenuEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StoryVideoMenuEvent)) {
            return false;
        }
        C1150a aVar = ((StoryVideoMenuEvent) iEvent).f9561d;
        this.f9561d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9561d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9561d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f9561d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9561d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
