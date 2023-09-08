package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent */
public final class ChattingUIPhotoInfoEvent extends IEvent {

    /* renamed from: d */
    public C67668a f193516d = new C67668a();

    /* renamed from: e */
    public C67669b f193517e = new C67669b();

    /* renamed from: com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent$a */
    public static final class C67668a {

        /* renamed from: a */
        public C72963f4 f193518a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent$b */
    public static final class C67669b {

        /* renamed from: a */
        public int f193519a = 0;

        /* renamed from: b */
        public int f193520b = 0;

        /* renamed from: c */
        public int f193521c = 0;

        /* renamed from: d */
        public int f193522d = 0;
    }

    public ChattingUIPhotoInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChattingUIPhotoInfoEvent)) {
            return false;
        }
        ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = (ChattingUIPhotoInfoEvent) iEvent;
        if (!C46238a.m51546a(this.f193516d.f193518a, chattingUIPhotoInfoEvent.f193516d.f193518a)) {
            return false;
        }
        C67669b bVar = chattingUIPhotoInfoEvent.f193517e;
        return C46238a.m51546a(Integer.valueOf(this.f193517e.f193519a), Integer.valueOf(bVar.f193519a)) && C46238a.m51546a(Integer.valueOf(this.f193517e.f193520b), Integer.valueOf(bVar.f193520b)) && C46238a.m51546a(Integer.valueOf(this.f193517e.f193521c), Integer.valueOf(bVar.f193521c)) && C46238a.m51546a(Integer.valueOf(this.f193517e.f193522d), Integer.valueOf(bVar.f193522d));
    }
}
