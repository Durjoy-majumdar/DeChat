package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetSceneResponseEvent */
public final class NetSceneResponseEvent extends IEvent {

    /* renamed from: d */
    public C40142a f107652d = new C40142a();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneResponseEvent$a */
    public static final class C40142a {

        /* renamed from: a */
        public int f107653a = 0;

        /* renamed from: b */
        public int f107654b = 0;

        /* renamed from: c */
        public String f107655c;

        /* renamed from: d */
        public IEvent f107656d;
    }

    public NetSceneResponseEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneResponseEvent)) {
            return false;
        }
        C40142a aVar = ((NetSceneResponseEvent) iEvent).f107652d;
        return C46238a.m51546a(Integer.valueOf(this.f107652d.f107653a), Integer.valueOf(aVar.f107653a)) && C46238a.m51546a(Integer.valueOf(this.f107652d.f107654b), Integer.valueOf(aVar.f107654b)) && C46238a.m51546a(this.f107652d.f107655c, aVar.f107655c) && C46238a.m51546a(this.f107652d.f107656d, aVar.f107656d);
    }
}
