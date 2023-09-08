package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ShellExecEvent */
public final class ShellExecEvent extends IEvent {

    /* renamed from: d */
    public C28824a f78980d = new C28824a();

    /* renamed from: com.tencent.mm.autogen.events.ShellExecEvent$a */
    public static final class C28824a {

        /* renamed from: a */
        public Intent f78981a;

        /* renamed from: b */
        public String f78982b;
    }

    public ShellExecEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShellExecEvent)) {
            return false;
        }
        C28824a aVar = ((ShellExecEvent) iEvent).f78980d;
        return C46238a.m51546a(this.f78980d.f78981a, aVar.f78981a) && C46238a.m51546a(this.f78980d.f78982b, aVar.f78982b);
    }
}
