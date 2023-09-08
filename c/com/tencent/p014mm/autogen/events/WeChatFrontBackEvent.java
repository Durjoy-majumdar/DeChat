package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WeChatFrontBackEvent */
public final class WeChatFrontBackEvent extends IEvent {

    /* renamed from: d */
    public C28852a f79057d = new C28852a();

    /* renamed from: com.tencent.mm.autogen.events.WeChatFrontBackEvent$a */
    public static final class C28852a {

        /* renamed from: a */
        public int f79058a;

        /* renamed from: b */
        public String f79059b;

        /* renamed from: c */
        public long f79060c;

        /* renamed from: d */
        public int f79061d;
    }

    public WeChatFrontBackEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WeChatFrontBackEvent)) {
            return false;
        }
        C28852a aVar = ((WeChatFrontBackEvent) iEvent).f79057d;
        return C46238a.m51546a(Integer.valueOf(this.f79057d.f79058a), Integer.valueOf(aVar.f79058a)) && C46238a.m51546a(this.f79057d.f79059b, aVar.f79059b) && C46238a.m51546a(Long.valueOf(this.f79057d.f79060c), Long.valueOf(aVar.f79060c)) && C46238a.m51546a(Integer.valueOf(this.f79057d.f79061d), Integer.valueOf(aVar.f79061d));
    }
}
