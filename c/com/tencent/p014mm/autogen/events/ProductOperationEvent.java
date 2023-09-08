package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ProductOperationEvent */
public final class ProductOperationEvent extends IEvent {

    /* renamed from: d */
    public C67755a f193823d = new C67755a();

    /* renamed from: e */
    public C67756b f193824e = new C67756b();

    /* renamed from: com.tencent.mm.autogen.events.ProductOperationEvent$a */
    public static final class C67755a {

        /* renamed from: a */
        public int f193825a = 0;

        /* renamed from: b */
        public Context f193826b;

        /* renamed from: c */
        public String f193827c;
    }

    /* renamed from: com.tencent.mm.autogen.events.ProductOperationEvent$b */
    public static final class C67756b {

        /* renamed from: a */
        public boolean f193828a = false;

        /* renamed from: b */
        public String f193829b;

        /* renamed from: c */
        public String f193830c;
    }

    public ProductOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ProductOperationEvent)) {
            return false;
        }
        ProductOperationEvent productOperationEvent = (ProductOperationEvent) iEvent;
        C67755a aVar = productOperationEvent.f193823d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193823d.f193825a), Integer.valueOf(aVar.f193825a)) || !C46238a.m51546a(this.f193823d.f193826b, aVar.f193826b) || !C46238a.m51546a(this.f193823d.f193827c, aVar.f193827c)) {
            return false;
        }
        C67756b bVar = productOperationEvent.f193824e;
        return C46238a.m51546a(Boolean.valueOf(this.f193824e.f193828a), Boolean.valueOf(bVar.f193828a)) && C46238a.m51546a(this.f193824e.f193829b, bVar.f193829b) && C46238a.m51546a(this.f193824e.f193830c, bVar.f193830c);
    }
}
