package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UploadImgResultEvent */
public final class UploadImgResultEvent extends IEvent {

    /* renamed from: d */
    public C40179a f107796d = new C40179a();

    /* renamed from: com.tencent.mm.autogen.events.UploadImgResultEvent$a */
    public static final class C40179a {

        /* renamed from: a */
        public String f107797a;

        /* renamed from: b */
        public boolean f107798b = false;

        /* renamed from: c */
        public String f107799c;

        /* renamed from: d */
        public String f107800d;

        /* renamed from: e */
        public int f107801e = 0;

        /* renamed from: f */
        public int f107802f = 0;
    }

    public UploadImgResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UploadImgResultEvent)) {
            return false;
        }
        C40179a aVar = ((UploadImgResultEvent) iEvent).f107796d;
        if (!C46238a.m51546a(this.f107796d.f107797a, aVar.f107797a) || !C46238a.m51546a(Boolean.valueOf(this.f107796d.f107798b), Boolean.valueOf(aVar.f107798b)) || !C46238a.m51546a(this.f107796d.f107799c, aVar.f107799c) || !C46238a.m51546a(this.f107796d.f107800d, aVar.f107800d) || !C46238a.m51546a(Integer.valueOf(this.f107796d.f107801e), Integer.valueOf(aVar.f107801e)) || !C46238a.m51546a(Integer.valueOf(this.f107796d.f107802f), Integer.valueOf(aVar.f107802f))) {
            return false;
        }
        this.f107796d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
