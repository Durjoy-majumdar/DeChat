package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CommandProcessorEvent */
public final class CommandProcessorEvent extends IEvent {

    /* renamed from: d */
    public C67673a f193536d = new C67673a();

    /* renamed from: e */
    public C67674b f193537e = new C67674b();

    /* renamed from: com.tencent.mm.autogen.events.CommandProcessorEvent$a */
    public static final class C67673a {

        /* renamed from: a */
        public String f193538a;

        /* renamed from: b */
        public Context f193539b;

        /* renamed from: c */
        public String f193540c;
    }

    /* renamed from: com.tencent.mm.autogen.events.CommandProcessorEvent$b */
    public static final class C67674b {

        /* renamed from: a */
        public boolean f193541a = false;
    }

    public CommandProcessorEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CommandProcessorEvent)) {
            return false;
        }
        CommandProcessorEvent commandProcessorEvent = (CommandProcessorEvent) iEvent;
        C67673a aVar = commandProcessorEvent.f193536d;
        if (!C46238a.m51546a(this.f193536d.f193538a, aVar.f193538a) || !C46238a.m51546a(this.f193536d.f193539b, aVar.f193539b) || !C46238a.m51546a(this.f193536d.f193540c, aVar.f193540c)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193537e.f193541a), Boolean.valueOf(commandProcessorEvent.f193537e.f193541a));
    }
}
