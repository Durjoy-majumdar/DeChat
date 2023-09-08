package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartGameWebViewProcessEvent */
public final class StartGameWebViewProcessEvent extends IEvent {

    /* renamed from: d */
    public C28833a f79005d = new C28833a();

    /* renamed from: com.tencent.mm.autogen.events.StartGameWebViewProcessEvent$a */
    public static final class C28833a {
    }

    public StartGameWebViewProcessEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartGameWebViewProcessEvent)) {
            return false;
        }
        C28833a aVar = ((StartGameWebViewProcessEvent) iEvent).f79005d;
        this.f79005d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
