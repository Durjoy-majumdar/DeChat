package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import eb0.C75576f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent */
public final class ExtStartSnsServerAndCallbackOnFpSetSizeEvent extends IEvent {

    /* renamed from: d */
    public C92504a f264795d = new C92504a();

    /* renamed from: com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent$a */
    public static final class C92504a {

        /* renamed from: a */
        public int f264796a;

        /* renamed from: b */
        public String f264797b;

        /* renamed from: c */
        public boolean f264798c;

        /* renamed from: d */
        public boolean f264799d;

        /* renamed from: e */
        public C75576f4.C75578b f264800e;
    }

    public ExtStartSnsServerAndCallbackOnFpSetSizeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtStartSnsServerAndCallbackOnFpSetSizeEvent)) {
            return false;
        }
        C92504a aVar = ((ExtStartSnsServerAndCallbackOnFpSetSizeEvent) iEvent).f264795d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264795d.f264796a), Integer.valueOf(aVar.f264796a)) || !C46238a.m51546a(this.f264795d.f264797b, aVar.f264797b) || !C46238a.m51546a(Boolean.valueOf(this.f264795d.f264798c), Boolean.valueOf(aVar.f264798c)) || !C46238a.m51546a(Boolean.valueOf(this.f264795d.f264799d), Boolean.valueOf(aVar.f264799d))) {
            return false;
        }
        this.f264795d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(this.f264795d.f264800e, aVar.f264800e);
    }
}
