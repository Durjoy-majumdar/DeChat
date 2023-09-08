package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GalleryPhotoInfoEvent */
public final class GalleryPhotoInfoEvent extends IEvent {

    /* renamed from: d */
    public C92522a f264882d = new C92522a();

    /* renamed from: e */
    public C92523b f264883e = new C92523b();

    /* renamed from: com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$a */
    public static final class C92522a {

        /* renamed from: a */
        public int f264884a = 0;

        /* renamed from: b */
        public int f264885b = 0;

        /* renamed from: c */
        public long f264886c = -1;

        /* renamed from: d */
        public String f264887d;
    }

    /* renamed from: com.tencent.mm.autogen.events.GalleryPhotoInfoEvent$b */
    public static final class C92523b {

        /* renamed from: a */
        public int f264888a = 0;

        /* renamed from: b */
        public int f264889b = 0;

        /* renamed from: c */
        public int f264890c = 0;

        /* renamed from: d */
        public int f264891d = 0;
    }

    public GalleryPhotoInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GalleryPhotoInfoEvent)) {
            return false;
        }
        GalleryPhotoInfoEvent galleryPhotoInfoEvent = (GalleryPhotoInfoEvent) iEvent;
        C92522a aVar = galleryPhotoInfoEvent.f264882d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264882d.f264884a), Integer.valueOf(aVar.f264884a)) || !C46238a.m51546a(Integer.valueOf(this.f264882d.f264885b), Integer.valueOf(aVar.f264885b)) || !C46238a.m51546a(Long.valueOf(this.f264882d.f264886c), Long.valueOf(aVar.f264886c))) {
            return false;
        }
        this.f264882d.getClass();
        if (!C46238a.m51546a(-1L, -1L) || !C46238a.m51546a(this.f264882d.f264887d, aVar.f264887d)) {
            return false;
        }
        C92523b bVar = galleryPhotoInfoEvent.f264883e;
        return C46238a.m51546a(Integer.valueOf(this.f264883e.f264888a), Integer.valueOf(bVar.f264888a)) && C46238a.m51546a(Integer.valueOf(this.f264883e.f264889b), Integer.valueOf(bVar.f264889b)) && C46238a.m51546a(Integer.valueOf(this.f264883e.f264890c), Integer.valueOf(bVar.f264890c)) && C46238a.m51546a(Integer.valueOf(this.f264883e.f264891d), Integer.valueOf(bVar.f264891d));
    }
}
