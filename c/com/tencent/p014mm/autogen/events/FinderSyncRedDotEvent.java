package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.FinderSyncRedDotEvent */
public final class FinderSyncRedDotEvent extends IEvent {

    /* renamed from: d */
    public C17678a f48092d = new C17678a();

    /* renamed from: com.tencent.mm.autogen.events.FinderSyncRedDotEvent$a */
    public static final class C17678a {

        /* renamed from: a */
        public int f48093a;

        /* renamed from: b */
        public int f48094b;

        /* renamed from: c */
        public List f48095c;
    }

    public FinderSyncRedDotEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderSyncRedDotEvent)) {
            return false;
        }
        C17678a aVar = ((FinderSyncRedDotEvent) iEvent).f48092d;
        return C46238a.m51546a(Integer.valueOf(this.f48092d.f48093a), Integer.valueOf(aVar.f48093a)) && C46238a.m51546a(Integer.valueOf(this.f48092d.f48094b), Integer.valueOf(aVar.f48094b)) && C46238a.m51546a(this.f48092d.f48095c, aVar.f48095c);
    }
}
