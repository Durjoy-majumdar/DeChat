package com.tencent.p014mm.autogen.events;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetStaticMapEvent */
public final class GetStaticMapEvent extends IEvent {

    /* renamed from: d */
    public C67715a f193661d = new C67715a();

    /* renamed from: e */
    public C28760b f193662e = new C28760b();

    /* renamed from: com.tencent.mm.autogen.events.GetStaticMapEvent$b */
    public static final class C28760b {
    }

    /* renamed from: com.tencent.mm.autogen.events.GetStaticMapEvent$a */
    public static final class C67715a {

        /* renamed from: a */
        public C72963f4 f193663a;

        /* renamed from: b */
        public ImageView f193664b;

        /* renamed from: c */
        public ImageView f193665c;

        /* renamed from: d */
        public ProgressBar f193666d;

        /* renamed from: e */
        public int f193667e;

        /* renamed from: f */
        public int f193668f;

        /* renamed from: g */
        public int f193669g;
    }

    public GetStaticMapEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetStaticMapEvent)) {
            return false;
        }
        GetStaticMapEvent getStaticMapEvent = (GetStaticMapEvent) iEvent;
        C67715a aVar = getStaticMapEvent.f193661d;
        if (!C46238a.m51546a(this.f193661d.f193663a, aVar.f193663a) || !C46238a.m51546a(this.f193661d.f193664b, aVar.f193664b) || !C46238a.m51546a(this.f193661d.f193665c, aVar.f193665c) || !C46238a.m51546a(this.f193661d.f193666d, aVar.f193666d) || !C46238a.m51546a(Integer.valueOf(this.f193661d.f193667e), Integer.valueOf(aVar.f193667e)) || !C46238a.m51546a(Integer.valueOf(this.f193661d.f193668f), Integer.valueOf(aVar.f193668f)) || !C46238a.m51546a(Integer.valueOf(this.f193661d.f193669g), Integer.valueOf(aVar.f193669g))) {
            return false;
        }
        C28760b bVar = getStaticMapEvent.f193662e;
        this.f193662e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
