package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderAddUserToBlackListEvent */
public final class FinderAddUserToBlackListEvent extends IEvent {

    /* renamed from: d */
    public C40098a f107526d = new C40098a();

    /* renamed from: com.tencent.mm.autogen.events.FinderAddUserToBlackListEvent$a */
    public static final class C40098a {

        /* renamed from: a */
        public String f107527a;

        /* renamed from: b */
        public int f107528b;
    }

    public FinderAddUserToBlackListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderAddUserToBlackListEvent)) {
            return false;
        }
        C40098a aVar = ((FinderAddUserToBlackListEvent) iEvent).f107526d;
        return C46238a.m51546a(this.f107526d.f107527a, aVar.f107527a) && C46238a.m51546a(Integer.valueOf(this.f107526d.f107528b), Integer.valueOf(aVar.f107528b));
    }
}
