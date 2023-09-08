package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent */
public final class PostSnsTagMemberOptionEvent extends IEvent {

    /* renamed from: d */
    public C40153a f107691d = new C40153a();

    /* renamed from: com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent$a */
    public static final class C40153a {

        /* renamed from: a */
        public int f107692a = 0;

        /* renamed from: b */
        public long f107693b = 0;

        /* renamed from: c */
        public int f107694c = 0;

        /* renamed from: d */
        public boolean f107695d = false;

        /* renamed from: e */
        public List f107696e;
    }

    public PostSnsTagMemberOptionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PostSnsTagMemberOptionEvent)) {
            return false;
        }
        C40153a aVar = ((PostSnsTagMemberOptionEvent) iEvent).f107691d;
        return C46238a.m51546a(Integer.valueOf(this.f107691d.f107692a), Integer.valueOf(aVar.f107692a)) && C46238a.m51546a(Long.valueOf(this.f107691d.f107693b), Long.valueOf(aVar.f107693b)) && C46238a.m51546a(Integer.valueOf(this.f107691d.f107694c), Integer.valueOf(aVar.f107694c)) && C46238a.m51546a(Boolean.valueOf(this.f107691d.f107695d), Boolean.valueOf(aVar.f107695d)) && C46238a.m51546a(this.f107691d.f107696e, aVar.f107696e);
    }
}
