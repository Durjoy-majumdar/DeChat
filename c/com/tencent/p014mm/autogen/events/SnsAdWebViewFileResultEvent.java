package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent */
public final class SnsAdWebViewFileResultEvent extends IEvent {

    /* renamed from: d */
    public C40166a f107758d = new C40166a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent$a */
    public static final class C40166a {

        /* renamed from: a */
        public int f107759a;

        /* renamed from: b */
        public int f107760b;

        /* renamed from: c */
        public int f107761c;

        /* renamed from: d */
        public Intent f107762d;
    }

    public SnsAdWebViewFileResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdWebViewFileResultEvent)) {
            return false;
        }
        C40166a aVar = ((SnsAdWebViewFileResultEvent) iEvent).f107758d;
        if (!C46238a.m51546a(Integer.valueOf(this.f107758d.f107759a), Integer.valueOf(aVar.f107759a))) {
            return false;
        }
        this.f107758d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f107758d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f107758d.f107760b), Integer.valueOf(aVar.f107760b)) && C46238a.m51546a(Integer.valueOf(this.f107758d.f107761c), Integer.valueOf(aVar.f107761c)) && C46238a.m51546a(this.f107758d.f107762d, aVar.f107762d);
    }
}
