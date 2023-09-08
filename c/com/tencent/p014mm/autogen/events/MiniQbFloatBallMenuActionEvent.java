package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent */
public final class MiniQbFloatBallMenuActionEvent extends IEvent {

    /* renamed from: d */
    public C17684a f48105d = new C17684a();

    /* renamed from: e */
    public C17685b f48106e = new C17685b();

    /* renamed from: com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent$a */
    public static final class C17684a {

        /* renamed from: a */
        public int f48107a;

        /* renamed from: b */
        public String f48108b;

        /* renamed from: c */
        public int f48109c;
    }

    /* renamed from: com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent$b */
    public static final class C17685b {
    }

    public MiniQbFloatBallMenuActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MiniQbFloatBallMenuActionEvent)) {
            return false;
        }
        MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent = (MiniQbFloatBallMenuActionEvent) iEvent;
        C17684a aVar = miniQbFloatBallMenuActionEvent.f48105d;
        if (!C46238a.m51546a(Integer.valueOf(this.f48105d.f48107a), Integer.valueOf(aVar.f48107a)) || !C46238a.m51546a(this.f48105d.f48108b, aVar.f48108b) || !C46238a.m51546a(Integer.valueOf(this.f48105d.f48109c), Integer.valueOf(aVar.f48109c))) {
            return false;
        }
        C17685b bVar = miniQbFloatBallMenuActionEvent.f48106e;
        this.f48106e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
