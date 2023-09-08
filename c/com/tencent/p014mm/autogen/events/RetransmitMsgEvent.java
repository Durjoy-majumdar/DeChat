package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;
import java.util.List;
import s90.C77632o;

/* renamed from: com.tencent.mm.autogen.events.RetransmitMsgEvent */
public final class RetransmitMsgEvent extends IEvent {

    /* renamed from: d */
    public C80736a f236267d = new C80736a();

    /* renamed from: com.tencent.mm.autogen.events.RetransmitMsgEvent$a */
    public static final class C80736a {

        /* renamed from: a */
        public Context f236268a;

        /* renamed from: b */
        public List<C72963f4> f236269b;

        /* renamed from: c */
        public boolean f236270c = false;

        /* renamed from: d */
        public String f236271d;

        /* renamed from: e */
        public C77632o f236272e;
    }

    public RetransmitMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RetransmitMsgEvent)) {
            return false;
        }
        C80736a aVar = ((RetransmitMsgEvent) iEvent).f236267d;
        return C46238a.m51546a(this.f236267d.f236268a, aVar.f236268a) && C46238a.m51546a(this.f236267d.f236269b, aVar.f236269b) && C46238a.m51546a(Boolean.valueOf(this.f236267d.f236270c), Boolean.valueOf(aVar.f236270c)) && C46238a.m51546a(this.f236267d.f236271d, aVar.f236271d) && C46238a.m51546a(this.f236267d.f236272e, aVar.f236272e);
    }
}
