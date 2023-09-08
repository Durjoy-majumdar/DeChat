package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QMessageOperationEvent */
public final class QMessageOperationEvent extends IEvent {

    /* renamed from: d */
    public C67762a f193849d = new C67762a();

    /* renamed from: e */
    public C67763b f193850e = new C67763b();

    /* renamed from: com.tencent.mm.autogen.events.QMessageOperationEvent$a */
    public static final class C67762a {

        /* renamed from: a */
        public int f193851a = 0;

        /* renamed from: b */
        public String f193852b;

        /* renamed from: c */
        public String f193853c;

        /* renamed from: d */
        public String f193854d;

        /* renamed from: e */
        public int f193855e = 0;

        /* renamed from: f */
        public int f193856f = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.QMessageOperationEvent$b */
    public static final class C67763b {
    }

    public QMessageOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QMessageOperationEvent)) {
            return false;
        }
        QMessageOperationEvent qMessageOperationEvent = (QMessageOperationEvent) iEvent;
        C67762a aVar = qMessageOperationEvent.f193849d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193849d.f193851a), Integer.valueOf(aVar.f193851a)) || !C46238a.m51546a(this.f193849d.f193852b, aVar.f193852b) || !C46238a.m51546a(this.f193849d.f193853c, aVar.f193853c) || !C46238a.m51546a(this.f193849d.f193854d, aVar.f193854d) || !C46238a.m51546a(Integer.valueOf(this.f193849d.f193855e), Integer.valueOf(aVar.f193855e)) || !C46238a.m51546a(Integer.valueOf(this.f193849d.f193856f), Integer.valueOf(aVar.f193856f))) {
            return false;
        }
        C67763b bVar = qMessageOperationEvent.f193850e;
        this.f193850e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
