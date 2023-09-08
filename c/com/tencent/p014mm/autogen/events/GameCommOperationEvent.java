package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameCommOperationEvent */
public final class GameCommOperationEvent extends IEvent {

    /* renamed from: d */
    public C1072a f9268d = new C1072a();

    /* renamed from: e */
    public C1073b f9269e = new C1073b();

    /* renamed from: com.tencent.mm.autogen.events.GameCommOperationEvent$a */
    public static final class C1072a {

        /* renamed from: a */
        public int f9270a = 0;

        /* renamed from: b */
        public String f9271b;

        /* renamed from: c */
        public Context f9272c;
    }

    /* renamed from: com.tencent.mm.autogen.events.GameCommOperationEvent$b */
    public static final class C1073b {

        /* renamed from: a */
        public String f9273a;
    }

    public GameCommOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameCommOperationEvent)) {
            return false;
        }
        GameCommOperationEvent gameCommOperationEvent = (GameCommOperationEvent) iEvent;
        C1072a aVar = gameCommOperationEvent.f9268d;
        if (!C46238a.m51546a(Integer.valueOf(this.f9268d.f9270a), Integer.valueOf(aVar.f9270a)) || !C46238a.m51546a(this.f9268d.f9271b, aVar.f9271b) || !C46238a.m51546a(this.f9268d.f9272c, aVar.f9272c)) {
            return false;
        }
        return C46238a.m51546a(this.f9269e.f9273a, gameCommOperationEvent.f9269e.f9273a);
    }
}
