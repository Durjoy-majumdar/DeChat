package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C101801kd0;
import te3.C101811md0;

/* renamed from: com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent */
public final class NotifyWNNoteOperationEvent extends IEvent {

    /* renamed from: d */
    public C92535a f264942d = new C92535a();

    /* renamed from: e */
    public C92536b f264943e = new C92536b();

    /* renamed from: com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a */
    public static final class C92535a {

        /* renamed from: a */
        public int f264944a = 0;

        /* renamed from: b */
        public String f264945b;

        /* renamed from: c */
        public int f264946c = 0;

        /* renamed from: d */
        public Context f264947d;

        /* renamed from: e */
        public String f264948e;

        /* renamed from: f */
        public String f264949f;
        public C101801kd0 field_favProto;
        public long field_localId = 0;

        /* renamed from: g */
        public boolean f264950g = false;

        /* renamed from: h */
        public Bundle f264951h;

        /* renamed from: i */
        public int f264952i = 0;

        /* renamed from: j */
        public String f264953j;

        /* renamed from: k */
        public int f264954k = 0;

        /* renamed from: l */
        public boolean f264955l = true;

        /* renamed from: m */
        public C101811md0 f264956m;
    }

    /* renamed from: com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$b */
    public static final class C92536b {
    }

    public NotifyWNNoteOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyWNNoteOperationEvent)) {
            return false;
        }
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = (NotifyWNNoteOperationEvent) iEvent;
        C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264942d.f264944a), Integer.valueOf(aVar.f264944a)) || !C46238a.m51546a(this.f264942d.f264945b, aVar.f264945b) || !C46238a.m51546a(Long.valueOf(this.f264942d.field_localId), Long.valueOf(aVar.field_localId)) || !C46238a.m51546a(Integer.valueOf(this.f264942d.f264946c), Integer.valueOf(aVar.f264946c)) || !C46238a.m51546a(this.f264942d.f264947d, aVar.f264947d) || !C46238a.m51546a(this.f264942d.f264948e, aVar.f264948e) || !C46238a.m51546a(this.f264942d.f264949f, aVar.f264949f) || !C46238a.m51546a(Boolean.valueOf(this.f264942d.f264950g), Boolean.valueOf(aVar.f264950g)) || !C46238a.m51546a(this.f264942d.f264951h, aVar.f264951h) || !C46238a.m51546a(Integer.valueOf(this.f264942d.f264952i), Integer.valueOf(aVar.f264952i)) || !C46238a.m51546a(this.f264942d.f264953j, aVar.f264953j) || !C46238a.m51546a(Integer.valueOf(this.f264942d.f264954k), Integer.valueOf(aVar.f264954k))) {
            return false;
        }
        this.f264942d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(Boolean.valueOf(this.f264942d.f264955l), Boolean.valueOf(aVar.f264955l)) || !C46238a.m51546a(this.f264942d.field_favProto, aVar.field_favProto) || !C46238a.m51546a(this.f264942d.f264956m, aVar.f264956m)) {
            return false;
        }
        C92536b bVar = notifyWNNoteOperationEvent.f264943e;
        this.f264943e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f264943e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
