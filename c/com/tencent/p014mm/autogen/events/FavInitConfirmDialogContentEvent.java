package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FavInitConfirmDialogContentEvent */
public final class FavInitConfirmDialogContentEvent extends IEvent {

    /* renamed from: d */
    public C67700a f193616d = new C67700a();

    /* renamed from: com.tencent.mm.autogen.events.FavInitConfirmDialogContentEvent$a */
    public static final class C67700a {

        /* renamed from: a */
        public long f193617a;

        /* renamed from: b */
        public String f193618b;

        /* renamed from: c */
        public int f193619c;

        /* renamed from: d */
        public Object f193620d;

        /* renamed from: e */
        public Object f193621e;

        /* renamed from: f */
        public String f193622f;
    }

    public FavInitConfirmDialogContentEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavInitConfirmDialogContentEvent)) {
            return false;
        }
        C67700a aVar = ((FavInitConfirmDialogContentEvent) iEvent).f193616d;
        return C46238a.m51546a(Long.valueOf(this.f193616d.f193617a), Long.valueOf(aVar.f193617a)) && C46238a.m51546a(this.f193616d.f193618b, aVar.f193618b) && C46238a.m51546a(Integer.valueOf(this.f193616d.f193619c), Integer.valueOf(aVar.f193619c)) && C46238a.m51546a(this.f193616d.f193620d, aVar.f193620d) && C46238a.m51546a(this.f193616d.f193621e, aVar.f193621e) && C46238a.m51546a(this.f193616d.f193622f, aVar.f193622f);
    }
}
