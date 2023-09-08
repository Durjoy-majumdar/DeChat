package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FavNoteSaveEvent */
public final class FavNoteSaveEvent extends IEvent {

    /* renamed from: d */
    public C55117a f154747d;

    /* renamed from: com.tencent.mm.autogen.events.FavNoteSaveEvent$a */
    public static final class C55117a {
    }

    public FavNoteSaveEvent() {
        this((Runnable) null);
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavNoteSaveEvent)) {
            return false;
        }
        C55117a aVar = ((FavNoteSaveEvent) iEvent).f154747d;
        this.f154747d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }

    public FavNoteSaveEvent(Runnable runnable) {
        this.f154747d = new C55117a();
        this.order = false;
        this.callback = runnable;
    }
}
