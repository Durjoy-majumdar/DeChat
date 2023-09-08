package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateWeChatEvent */
public final class UpdateWeChatEvent extends IEvent {

    /* renamed from: d */
    public C1155a f9572d = new C1155a();

    /* renamed from: e */
    public C1156b f9573e = new C1156b();

    /* renamed from: com.tencent.mm.autogen.events.UpdateWeChatEvent$a */
    public static final class C1155a {

        /* renamed from: a */
        public Context f9574a;

        /* renamed from: b */
        public int f9575b;
    }

    /* renamed from: com.tencent.mm.autogen.events.UpdateWeChatEvent$b */
    public static final class C1156b {
    }

    public UpdateWeChatEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateWeChatEvent)) {
            return false;
        }
        UpdateWeChatEvent updateWeChatEvent = (UpdateWeChatEvent) iEvent;
        C1155a aVar = updateWeChatEvent.f9572d;
        if (!C46238a.m51546a(this.f9572d.f9574a, aVar.f9574a) || !C46238a.m51546a(Integer.valueOf(this.f9572d.f9575b), Integer.valueOf(aVar.f9575b))) {
            return false;
        }
        C1156b bVar = updateWeChatEvent.f9573e;
        this.f9573e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f9573e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
