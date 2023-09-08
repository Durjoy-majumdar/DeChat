package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PayAuthNativeEvent */
public final class PayAuthNativeEvent extends IEvent {

    /* renamed from: d */
    public C67752a f193807d = new C67752a();

    /* renamed from: e */
    public C67753b f193808e = new C67753b();

    /* renamed from: com.tencent.mm.autogen.events.PayAuthNativeEvent$a */
    public static final class C67752a {

        /* renamed from: a */
        public String f193809a;

        /* renamed from: b */
        public int f193810b;

        /* renamed from: c */
        public int f193811c;

        /* renamed from: d */
        public Context f193812d;

        /* renamed from: e */
        public int f193813e = 0;

        /* renamed from: f */
        public String f193814f;

        /* renamed from: g */
        public int f193815g = 0;

        /* renamed from: h */
        public int f193816h = 0;

        /* renamed from: i */
        public int f193817i = 0;

        /* renamed from: j */
        public String f193818j;

        /* renamed from: k */
        public String f193819k;
    }

    /* renamed from: com.tencent.mm.autogen.events.PayAuthNativeEvent$b */
    public static final class C67753b {

        /* renamed from: a */
        public int f193820a = 0;
    }

    public PayAuthNativeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PayAuthNativeEvent)) {
            return false;
        }
        PayAuthNativeEvent payAuthNativeEvent = (PayAuthNativeEvent) iEvent;
        C67752a aVar = payAuthNativeEvent.f193807d;
        if (!C46238a.m51546a(this.f193807d.f193809a, aVar.f193809a) || !C46238a.m51546a(Integer.valueOf(this.f193807d.f193810b), Integer.valueOf(aVar.f193810b)) || !C46238a.m51546a(Integer.valueOf(this.f193807d.f193811c), Integer.valueOf(aVar.f193811c)) || !C46238a.m51546a(this.f193807d.f193812d, aVar.f193812d) || !C46238a.m51546a(Integer.valueOf(this.f193807d.f193813e), Integer.valueOf(aVar.f193813e)) || !C46238a.m51546a(this.f193807d.f193814f, aVar.f193814f) || !C46238a.m51546a(Integer.valueOf(this.f193807d.f193815g), Integer.valueOf(aVar.f193815g)) || !C46238a.m51546a(Integer.valueOf(this.f193807d.f193816h), Integer.valueOf(aVar.f193816h)) || !C46238a.m51546a(Integer.valueOf(this.f193807d.f193817i), Integer.valueOf(aVar.f193817i)) || !C46238a.m51546a(this.f193807d.f193818j, aVar.f193818j) || !C46238a.m51546a(this.f193807d.f193819k, aVar.f193819k)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193808e.f193820a), Integer.valueOf(payAuthNativeEvent.f193808e.f193820a));
    }
}
