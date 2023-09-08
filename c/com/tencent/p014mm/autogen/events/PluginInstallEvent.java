package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PluginInstallEvent */
public final class PluginInstallEvent extends IEvent {

    /* renamed from: d */
    public C55155a f154857d = new C55155a();

    /* renamed from: e */
    public C55156b f154858e = new C55156b();

    /* renamed from: com.tencent.mm.autogen.events.PluginInstallEvent$a */
    public static final class C55155a {
    }

    /* renamed from: com.tencent.mm.autogen.events.PluginInstallEvent$b */
    public static final class C55156b {
    }

    public PluginInstallEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PluginInstallEvent)) {
            return false;
        }
        PluginInstallEvent pluginInstallEvent = (PluginInstallEvent) iEvent;
        C55155a aVar = pluginInstallEvent.f154857d;
        this.f154857d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f154857d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        C55156b bVar = pluginInstallEvent.f154858e;
        this.f154858e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
