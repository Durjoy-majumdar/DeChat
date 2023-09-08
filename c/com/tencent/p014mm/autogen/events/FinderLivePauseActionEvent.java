package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLivePauseActionEvent */
public final class FinderLivePauseActionEvent extends IEvent {

    /* renamed from: d */
    public C55126a f154776d = new C55126a();

    /* renamed from: e */
    public C55127b f154777e = new C55127b();

    /* renamed from: com.tencent.mm.autogen.events.FinderLivePauseActionEvent$a */
    public static final class C55126a {

        /* renamed from: a */
        public boolean f154778a;
    }

    /* renamed from: com.tencent.mm.autogen.events.FinderLivePauseActionEvent$b */
    public static final class C55127b {

        /* renamed from: a */
        public boolean f154779a;
    }

    public FinderLivePauseActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLivePauseActionEvent)) {
            return false;
        }
        FinderLivePauseActionEvent finderLivePauseActionEvent = (FinderLivePauseActionEvent) iEvent;
        if (!C46238a.m51546a(Boolean.valueOf(this.f154776d.f154778a), Boolean.valueOf(finderLivePauseActionEvent.f154776d.f154778a))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f154777e.f154779a), Boolean.valueOf(finderLivePauseActionEvent.f154777e.f154779a));
    }
}
