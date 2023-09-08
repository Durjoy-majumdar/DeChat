package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameMsgDownloadImgEvent */
public final class GameMsgDownloadImgEvent extends IEvent {

    /* renamed from: d */
    public C40107a f107555d = new C40107a();

    /* renamed from: e */
    public C40108b f107556e = new C40108b();

    /* renamed from: com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$a */
    public static final class C40107a {

        /* renamed from: a */
        public int f107557a = 0;

        /* renamed from: b */
        public String f107558b;
    }

    /* renamed from: com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$b */
    public static final class C40108b {

        /* renamed from: a */
        public String f107559a;

        /* renamed from: b */
        public boolean f107560b = false;
    }

    public GameMsgDownloadImgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameMsgDownloadImgEvent)) {
            return false;
        }
        GameMsgDownloadImgEvent gameMsgDownloadImgEvent = (GameMsgDownloadImgEvent) iEvent;
        C40107a aVar = gameMsgDownloadImgEvent.f107555d;
        if (!C46238a.m51546a(Integer.valueOf(this.f107555d.f107557a), Integer.valueOf(aVar.f107557a)) || !C46238a.m51546a(this.f107555d.f107558b, aVar.f107558b)) {
            return false;
        }
        this.f107555d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C40108b bVar = gameMsgDownloadImgEvent.f107556e;
        return C46238a.m51546a(this.f107556e.f107559a, bVar.f107559a) && C46238a.m51546a(Boolean.valueOf(this.f107556e.f107560b), Boolean.valueOf(bVar.f107560b));
    }
}
