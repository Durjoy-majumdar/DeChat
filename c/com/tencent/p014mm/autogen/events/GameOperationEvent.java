package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameOperationEvent */
public final class GameOperationEvent extends IEvent {

    /* renamed from: d */
    public C55140a f154825d = new C55140a();

    /* renamed from: e */
    public C55141b f154826e = new C55141b();

    /* renamed from: com.tencent.mm.autogen.events.GameOperationEvent$a */
    public static final class C55140a {
    }

    /* renamed from: com.tencent.mm.autogen.events.GameOperationEvent$b */
    public static final class C55141b {
    }

    public GameOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameOperationEvent)) {
            return false;
        }
        GameOperationEvent gameOperationEvent = (GameOperationEvent) iEvent;
        C55140a aVar = gameOperationEvent.f154825d;
        this.f154825d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154825d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C55141b bVar = gameOperationEvent.f154826e;
        this.f154826e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
