package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.autogen.events.ScanMaterialCodeEvent */
public final class ScanMaterialCodeEvent extends IEvent {

    /* renamed from: d */
    public C92557a f265075d = new C92557a();

    /* renamed from: e */
    public C92558b f265076e = new C92558b();

    /* renamed from: com.tencent.mm.autogen.events.ScanMaterialCodeEvent$a */
    public static final class C92557a {

        /* renamed from: a */
        public String f265077a;

        /* renamed from: b */
        public int f265078b;

        /* renamed from: c */
        public int f265079c;

        /* renamed from: d */
        public WeakReference f265080d;

        /* renamed from: e */
        public Runnable f265081e;
    }

    /* renamed from: com.tencent.mm.autogen.events.ScanMaterialCodeEvent$b */
    public static final class C92558b {

        /* renamed from: a */
        public String f265082a;

        /* renamed from: b */
        public int f265083b;

        /* renamed from: c */
        public String f265084c;
    }

    public ScanMaterialCodeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanMaterialCodeEvent)) {
            return false;
        }
        ScanMaterialCodeEvent scanMaterialCodeEvent = (ScanMaterialCodeEvent) iEvent;
        C92557a aVar = scanMaterialCodeEvent.f265075d;
        if (!C46238a.m51546a(this.f265075d.f265077a, aVar.f265077a) || !C46238a.m51546a(Integer.valueOf(this.f265075d.f265078b), Integer.valueOf(aVar.f265078b)) || !C46238a.m51546a(Integer.valueOf(this.f265075d.f265079c), Integer.valueOf(aVar.f265079c)) || !C46238a.m51546a(this.f265075d.f265080d, aVar.f265080d) || !C46238a.m51546a(this.f265075d.f265081e, aVar.f265081e)) {
            return false;
        }
        C92558b bVar = scanMaterialCodeEvent.f265076e;
        return C46238a.m51546a(this.f265076e.f265082a, bVar.f265082a) && C46238a.m51546a(Integer.valueOf(this.f265076e.f265083b), Integer.valueOf(bVar.f265083b)) && C46238a.m51546a(this.f265076e.f265084c, bVar.f265084c);
    }
}
