package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderFeedUiActionEvent */
public final class FinderFeedUiActionEvent extends IEvent {

    /* renamed from: d */
    public C1047a f9202d = new C1047a();

    /* renamed from: com.tencent.mm.autogen.events.FinderFeedUiActionEvent$a */
    public static final class C1047a {

        /* renamed from: a */
        public long f9203a;

        /* renamed from: b */
        public int f9204b;

        /* renamed from: c */
        public int f9205c;

        /* renamed from: d */
        public int f9206d;

        /* renamed from: e */
        public int f9207e;

        /* renamed from: f */
        public int f9208f;

        /* renamed from: g */
        public int f9209g;

        /* renamed from: h */
        public int f9210h;

        /* renamed from: i */
        public String f9211i;
    }

    public FinderFeedUiActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderFeedUiActionEvent)) {
            return false;
        }
        C1047a aVar = ((FinderFeedUiActionEvent) iEvent).f9202d;
        return C46238a.m51546a(Long.valueOf(this.f9202d.f9203a), Long.valueOf(aVar.f9203a)) && C46238a.m51546a(Integer.valueOf(this.f9202d.f9204b), Integer.valueOf(aVar.f9204b)) && C46238a.m51546a(Integer.valueOf(this.f9202d.f9205c), Integer.valueOf(aVar.f9205c)) && C46238a.m51546a(Integer.valueOf(this.f9202d.f9206d), Integer.valueOf(aVar.f9206d)) && C46238a.m51546a(Integer.valueOf(this.f9202d.f9207e), Integer.valueOf(aVar.f9207e)) && C46238a.m51546a(Integer.valueOf(this.f9202d.f9208f), Integer.valueOf(aVar.f9208f)) && C46238a.m51546a(Integer.valueOf(this.f9202d.f9209g), Integer.valueOf(aVar.f9209g)) && C46238a.m51546a(Integer.valueOf(this.f9202d.f9210h), Integer.valueOf(aVar.f9210h)) && C46238a.m51546a(this.f9202d.f9211i, aVar.f9211i);
    }
}
