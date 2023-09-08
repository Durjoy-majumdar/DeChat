package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DeleteFavoriteEvent */
public final class DeleteFavoriteEvent extends IEvent {

    /* renamed from: d */
    public C92471a f264667d = new C92471a();

    /* renamed from: e */
    public C92472b f264668e = new C92472b();

    /* renamed from: com.tencent.mm.autogen.events.DeleteFavoriteEvent$a */
    public static final class C92471a {

        /* renamed from: a */
        public long f264669a = 0;

        /* renamed from: b */
        public int f264670b = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.DeleteFavoriteEvent$b */
    public static final class C92472b {

        /* renamed from: a */
        public boolean f264671a = false;
    }

    public DeleteFavoriteEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DeleteFavoriteEvent)) {
            return false;
        }
        DeleteFavoriteEvent deleteFavoriteEvent = (DeleteFavoriteEvent) iEvent;
        C92471a aVar = deleteFavoriteEvent.f264667d;
        if (!C46238a.m51546a(Long.valueOf(this.f264667d.f264669a), Long.valueOf(aVar.f264669a)) || !C46238a.m51546a(Integer.valueOf(this.f264667d.f264670b), Integer.valueOf(aVar.f264670b))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f264668e.f264671a), Boolean.valueOf(deleteFavoriteEvent.f264668e.f264671a));
    }
}
