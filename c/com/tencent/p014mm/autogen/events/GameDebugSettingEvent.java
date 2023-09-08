package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameDebugSettingEvent */
public final class GameDebugSettingEvent extends IEvent {

    /* renamed from: d */
    public C1074a f9274d = new C1074a();

    /* renamed from: com.tencent.mm.autogen.events.GameDebugSettingEvent$a */
    public static final class C1074a {

        /* renamed from: a */
        public int f9275a;

        /* renamed from: b */
        public int f9276b;

        /* renamed from: c */
        public String f9277c;
    }

    public GameDebugSettingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameDebugSettingEvent)) {
            return false;
        }
        C1074a aVar = ((GameDebugSettingEvent) iEvent).f9274d;
        return C46238a.m51546a(Integer.valueOf(this.f9274d.f9275a), Integer.valueOf(aVar.f9275a)) && C46238a.m51546a(Integer.valueOf(this.f9274d.f9276b), Integer.valueOf(aVar.f9276b)) && C46238a.m51546a(this.f9274d.f9277c, aVar.f9277c);
    }
}
