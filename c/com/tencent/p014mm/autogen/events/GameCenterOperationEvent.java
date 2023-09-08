package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameCenterOperationEvent */
public final class GameCenterOperationEvent extends IEvent {

    /* renamed from: d */
    public C40104a f107543d = new C40104a();

    /* renamed from: com.tencent.mm.autogen.events.GameCenterOperationEvent$a */
    public static final class C40104a {

        /* renamed from: a */
        public int f107544a;

        /* renamed from: b */
        public Context f107545b;

        /* renamed from: c */
        public String f107546c;

        /* renamed from: d */
        public String f107547d;

        /* renamed from: e */
        public String f107548e;

        /* renamed from: f */
        public int f107549f;

        /* renamed from: g */
        public String f107550g;
    }

    public GameCenterOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameCenterOperationEvent)) {
            return false;
        }
        C40104a aVar = ((GameCenterOperationEvent) iEvent).f107543d;
        return C46238a.m51546a(Integer.valueOf(this.f107543d.f107544a), Integer.valueOf(aVar.f107544a)) && C46238a.m51546a(this.f107543d.f107545b, aVar.f107545b) && C46238a.m51546a(this.f107543d.f107546c, aVar.f107546c) && C46238a.m51546a(this.f107543d.f107547d, aVar.f107547d) && C46238a.m51546a(this.f107543d.f107548e, aVar.f107548e) && C46238a.m51546a(Integer.valueOf(this.f107543d.f107549f), Integer.valueOf(aVar.f107549f)) && C46238a.m51546a(this.f107543d.f107550g, aVar.f107550g);
    }
}
