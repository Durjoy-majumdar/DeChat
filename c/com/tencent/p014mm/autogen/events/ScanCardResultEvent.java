package com.tencent.p014mm.autogen.events;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanCardResultEvent */
public final class ScanCardResultEvent extends IEvent {

    /* renamed from: d */
    public C1127a f9468d = new C1127a();

    /* renamed from: com.tencent.mm.autogen.events.ScanCardResultEvent$a */
    public static final class C1127a {

        /* renamed from: a */
        public String f9469a;

        /* renamed from: b */
        public int f9470b = 0;

        /* renamed from: c */
        public Bitmap f9471c;
    }

    public ScanCardResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanCardResultEvent)) {
            return false;
        }
        C1127a aVar = ((ScanCardResultEvent) iEvent).f9468d;
        if (!C46238a.m51546a(this.f9468d.f9469a, aVar.f9469a) || !C46238a.m51546a(Integer.valueOf(this.f9468d.f9470b), Integer.valueOf(aVar.f9470b))) {
            return false;
        }
        this.f9468d.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(this.f9468d.f9471c, aVar.f9471c);
    }
}
