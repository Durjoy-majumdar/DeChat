package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import ob0.C117747y;

/* renamed from: com.tencent.mm.autogen.events.ExtNetSceneSendMsgEvent */
public final class ExtNetSceneSendMsgEvent extends IEvent {

    /* renamed from: d */
    public C92498a f264772d = new C92498a();

    /* renamed from: e */
    public C92499b f264773e = new C92499b();

    /* renamed from: com.tencent.mm.autogen.events.ExtNetSceneSendMsgEvent$a */
    public static final class C92498a {

        /* renamed from: a */
        public String f264774a;

        /* renamed from: b */
        public String f264775b;

        /* renamed from: c */
        public int f264776c;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtNetSceneSendMsgEvent$b */
    public static final class C92499b {

        /* renamed from: a */
        public long f264777a = 0;

        /* renamed from: b */
        public C117747y f264778b;
    }

    public ExtNetSceneSendMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtNetSceneSendMsgEvent)) {
            return false;
        }
        ExtNetSceneSendMsgEvent extNetSceneSendMsgEvent = (ExtNetSceneSendMsgEvent) iEvent;
        C92498a aVar = extNetSceneSendMsgEvent.f264772d;
        if (!C46238a.m51546a(this.f264772d.f264774a, aVar.f264774a) || !C46238a.m51546a(this.f264772d.f264775b, aVar.f264775b) || !C46238a.m51546a(Integer.valueOf(this.f264772d.f264776c), Integer.valueOf(aVar.f264776c))) {
            return false;
        }
        this.f264772d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        C92499b bVar = extNetSceneSendMsgEvent.f264773e;
        return C46238a.m51546a(Long.valueOf(this.f264773e.f264777a), Long.valueOf(bVar.f264777a)) && C46238a.m51546a(this.f264773e.f264778b, bVar.f264778b);
    }
}
