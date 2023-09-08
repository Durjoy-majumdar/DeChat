package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent */
public final class JsApiOfflineUserBindQueryResultCallBackEvent extends IEvent {

    /* renamed from: d */
    public C67718a f193679d = new C67718a();

    /* renamed from: e */
    public C67719b f193680e = new C67719b();

    /* renamed from: com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a */
    public static final class C67718a {

        /* renamed from: a */
        public String f193681a;

        /* renamed from: b */
        public String f193682b;

        /* renamed from: c */
        public String f193683c;

        /* renamed from: d */
        public String f193684d;

        /* renamed from: e */
        public String f193685e;

        /* renamed from: f */
        public String f193686f;

        /* renamed from: g */
        public String f193687g;

        /* renamed from: h */
        public String f193688h;

        /* renamed from: i */
        public String f193689i;

        /* renamed from: j */
        public String f193690j;

        /* renamed from: k */
        public String f193691k;

        /* renamed from: l */
        public Runnable f193692l;
    }

    /* renamed from: com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$b */
    public static final class C67719b {

        /* renamed from: a */
        public String f193693a;
    }

    public JsApiOfflineUserBindQueryResultCallBackEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof JsApiOfflineUserBindQueryResultCallBackEvent)) {
            return false;
        }
        JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent = (JsApiOfflineUserBindQueryResultCallBackEvent) iEvent;
        C67718a aVar = jsApiOfflineUserBindQueryResultCallBackEvent.f193679d;
        if (!C46238a.m51546a(this.f193679d.f193681a, aVar.f193681a) || !C46238a.m51546a(this.f193679d.f193682b, aVar.f193682b) || !C46238a.m51546a(this.f193679d.f193683c, aVar.f193683c) || !C46238a.m51546a(this.f193679d.f193684d, aVar.f193684d) || !C46238a.m51546a(this.f193679d.f193685e, aVar.f193685e) || !C46238a.m51546a(this.f193679d.f193686f, aVar.f193686f) || !C46238a.m51546a(this.f193679d.f193687g, aVar.f193687g) || !C46238a.m51546a(this.f193679d.f193688h, aVar.f193688h) || !C46238a.m51546a(this.f193679d.f193689i, aVar.f193689i) || !C46238a.m51546a(this.f193679d.f193690j, aVar.f193690j) || !C46238a.m51546a(this.f193679d.f193691k, aVar.f193691k) || !C46238a.m51546a(this.f193679d.f193692l, aVar.f193692l)) {
            return false;
        }
        return C46238a.m51546a(this.f193680e.f193693a, jsApiOfflineUserBindQueryResultCallBackEvent.f193680e.f193693a);
    }
}
