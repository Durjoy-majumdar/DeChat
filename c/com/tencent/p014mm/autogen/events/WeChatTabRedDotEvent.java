package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WeChatTabRedDotEvent */
public final class WeChatTabRedDotEvent extends IEvent {

    /* renamed from: d */
    public C28853a f79062d = new C28853a();

    /* renamed from: com.tencent.mm.autogen.events.WeChatTabRedDotEvent$a */
    public static final class C28853a {

        /* renamed from: a */
        public int f79063a;

        /* renamed from: b */
        public boolean f79064b;

        /* renamed from: c */
        public int f79065c;
    }

    public WeChatTabRedDotEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WeChatTabRedDotEvent)) {
            return false;
        }
        C28853a aVar = ((WeChatTabRedDotEvent) iEvent).f79062d;
        return C46238a.m51546a(Integer.valueOf(this.f79062d.f79063a), Integer.valueOf(aVar.f79063a)) && C46238a.m51546a(Boolean.valueOf(this.f79062d.f79064b), Boolean.valueOf(aVar.f79064b)) && C46238a.m51546a(Integer.valueOf(this.f79062d.f79065c), Integer.valueOf(aVar.f79065c));
    }
}
