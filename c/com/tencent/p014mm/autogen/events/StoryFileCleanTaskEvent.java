package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StoryFileCleanTaskEvent */
public final class StoryFileCleanTaskEvent extends IEvent {

    /* renamed from: d */
    public C1147a f9558d = new C1147a();

    /* renamed from: com.tencent.mm.autogen.events.StoryFileCleanTaskEvent$a */
    public static final class C1147a {
    }

    public StoryFileCleanTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StoryFileCleanTaskEvent)) {
            return false;
        }
        C1147a aVar = ((StoryFileCleanTaskEvent) iEvent).f9558d;
        this.f9558d.getClass();
        aVar.getClass();
        return C46238a.m51546a(-1, -1);
    }
}
