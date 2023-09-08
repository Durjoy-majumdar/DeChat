package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameJsApiCommandEvent */
public final class GameJsApiCommandEvent extends IEvent {

    /* renamed from: d */
    public C1076a f9284d = new C1076a();

    /* renamed from: e */
    public C1077b f9285e = new C1077b();

    /* renamed from: com.tencent.mm.autogen.events.GameJsApiCommandEvent$a */
    public static final class C1076a {

        /* renamed from: a */
        public int f9286a = 0;

        /* renamed from: b */
        public String f9287b;
    }

    /* renamed from: com.tencent.mm.autogen.events.GameJsApiCommandEvent$b */
    public static final class C1077b {

        /* renamed from: a */
        public String f9288a;
    }

    public GameJsApiCommandEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameJsApiCommandEvent)) {
            return false;
        }
        GameJsApiCommandEvent gameJsApiCommandEvent = (GameJsApiCommandEvent) iEvent;
        C1076a aVar = gameJsApiCommandEvent.f9284d;
        if (!C46238a.m51546a(Integer.valueOf(this.f9284d.f9286a), Integer.valueOf(aVar.f9286a)) || !C46238a.m51546a(this.f9284d.f9287b, aVar.f9287b)) {
            return false;
        }
        return C46238a.m51546a(this.f9285e.f9288a, gameJsApiCommandEvent.f9285e.f9288a);
    }
}
