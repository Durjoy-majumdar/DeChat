package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FavUIPhotoInfoEvent */
public final class FavUIPhotoInfoEvent extends IEvent {

    /* renamed from: d */
    public C92513a f264826d = new C92513a();

    /* renamed from: e */
    public C92514b f264827e = new C92514b();

    /* renamed from: com.tencent.mm.autogen.events.FavUIPhotoInfoEvent$a */
    public static final class C92513a {

        /* renamed from: a */
        public String f264828a;
    }

    /* renamed from: com.tencent.mm.autogen.events.FavUIPhotoInfoEvent$b */
    public static final class C92514b {

        /* renamed from: a */
        public int f264829a = 0;

        /* renamed from: b */
        public int f264830b = 0;

        /* renamed from: c */
        public int f264831c = 0;

        /* renamed from: d */
        public int f264832d = 0;
    }

    public FavUIPhotoInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavUIPhotoInfoEvent)) {
            return false;
        }
        FavUIPhotoInfoEvent favUIPhotoInfoEvent = (FavUIPhotoInfoEvent) iEvent;
        if (!C46238a.m51546a(this.f264826d.f264828a, favUIPhotoInfoEvent.f264826d.f264828a)) {
            return false;
        }
        C92514b bVar = favUIPhotoInfoEvent.f264827e;
        return C46238a.m51546a(Integer.valueOf(this.f264827e.f264829a), Integer.valueOf(bVar.f264829a)) && C46238a.m51546a(Integer.valueOf(this.f264827e.f264830b), Integer.valueOf(bVar.f264830b)) && C46238a.m51546a(Integer.valueOf(this.f264827e.f264831c), Integer.valueOf(bVar.f264831c)) && C46238a.m51546a(Integer.valueOf(this.f264827e.f264832d), Integer.valueOf(bVar.f264832d));
    }
}
