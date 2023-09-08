package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent */
public final class CreateOrJoinChatroomEvent extends IEvent {

    /* renamed from: d */
    public C80712a f236173d = new C80712a();

    /* renamed from: com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent$a */
    public static final class C80712a {

        /* renamed from: a */
        public int f236174a = 0;

        /* renamed from: b */
        public String[] f236175b;

        /* renamed from: c */
        public String[] f236176c;

        /* renamed from: d */
        public Context f236177d;
    }

    public CreateOrJoinChatroomEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CreateOrJoinChatroomEvent)) {
            return false;
        }
        C80712a aVar = ((CreateOrJoinChatroomEvent) iEvent).f236173d;
        return C46238a.m51546a(Integer.valueOf(this.f236173d.f236174a), Integer.valueOf(aVar.f236174a)) && C46238a.m51546a(this.f236173d.f236175b, aVar.f236175b) && C46238a.m51546a(this.f236173d.f236176c, aVar.f236176c) && C46238a.m51546a(this.f236173d.f236177d, aVar.f236177d);
    }
}
