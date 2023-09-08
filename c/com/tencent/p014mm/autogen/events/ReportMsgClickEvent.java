package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportMsgClickEvent */
public final class ReportMsgClickEvent extends IEvent {

    /* renamed from: d */
    public C67778a f193900d = new C67778a();

    /* renamed from: com.tencent.mm.autogen.events.ReportMsgClickEvent$a */
    public static final class C67778a {

        /* renamed from: a */
        public Context f193901a;

        /* renamed from: b */
        public String f193902b;

        /* renamed from: c */
        public String f193903c;

        /* renamed from: d */
        public String f193904d;

        /* renamed from: e */
        public int f193905e;

        /* renamed from: f */
        public String f193906f;

        /* renamed from: g */
        public int f193907g;

        /* renamed from: h */
        public int f193908h;

        /* renamed from: i */
        public long f193909i;

        /* renamed from: j */
        public String f193910j;

        /* renamed from: k */
        public String f193911k;

        /* renamed from: l */
        public int f193912l;
    }

    public ReportMsgClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportMsgClickEvent)) {
            return false;
        }
        C67778a aVar = ((ReportMsgClickEvent) iEvent).f193900d;
        return C46238a.m51546a(this.f193900d.f193901a, aVar.f193901a) && C46238a.m51546a(this.f193900d.f193902b, aVar.f193902b) && C46238a.m51546a(this.f193900d.f193903c, aVar.f193903c) && C46238a.m51546a(this.f193900d.f193904d, aVar.f193904d) && C46238a.m51546a(Integer.valueOf(this.f193900d.f193905e), Integer.valueOf(aVar.f193905e)) && C46238a.m51546a(this.f193900d.f193906f, aVar.f193906f) && C46238a.m51546a(Integer.valueOf(this.f193900d.f193907g), Integer.valueOf(aVar.f193907g)) && C46238a.m51546a(Integer.valueOf(this.f193900d.f193908h), Integer.valueOf(aVar.f193908h)) && C46238a.m51546a(Long.valueOf(this.f193900d.f193909i), Long.valueOf(aVar.f193909i)) && C46238a.m51546a(this.f193900d.f193910j, aVar.f193910j) && C46238a.m51546a(this.f193900d.f193911k, aVar.f193911k) && C46238a.m51546a(Integer.valueOf(this.f193900d.f193912l), Integer.valueOf(aVar.f193912l));
    }
}
