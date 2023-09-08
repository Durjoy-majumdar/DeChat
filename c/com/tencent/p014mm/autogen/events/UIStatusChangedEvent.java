package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UIStatusChangedEvent */
public final class UIStatusChangedEvent extends IEvent {

    /* renamed from: d */
    public C67803a f193971d = new C67803a();

    /* renamed from: com.tencent.mm.autogen.events.UIStatusChangedEvent$a */
    public static final class C67803a {

        /* renamed from: a */
        public int f193972a = 0;

        /* renamed from: b */
        public int f193973b = 0;

        /* renamed from: c */
        public int f193974c = 0;

        /* renamed from: d */
        public int f193975d = 0;
    }

    public UIStatusChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UIStatusChangedEvent)) {
            return false;
        }
        C67803a aVar = ((UIStatusChangedEvent) iEvent).f193971d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193971d.f193972a), Integer.valueOf(aVar.f193972a))) {
            return false;
        }
        this.f193971d.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(Integer.valueOf(this.f193971d.f193973b), Integer.valueOf(aVar.f193973b)) && C46238a.m51546a(Integer.valueOf(this.f193971d.f193974c), Integer.valueOf(aVar.f193974c)) && C46238a.m51546a(Integer.valueOf(this.f193971d.f193975d), Integer.valueOf(aVar.f193975d));
    }
}
