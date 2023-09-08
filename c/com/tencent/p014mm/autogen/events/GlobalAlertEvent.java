package com.tencent.p014mm.autogen.events;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import se3.C77684b;

/* renamed from: com.tencent.mm.autogen.events.GlobalAlertEvent */
public final class GlobalAlertEvent extends IEvent {

    /* renamed from: d */
    public C67717a f193674d = new C67717a();

    /* renamed from: com.tencent.mm.autogen.events.GlobalAlertEvent$a */
    public static final class C67717a {

        /* renamed from: a */
        public C77684b f193675a;

        /* renamed from: b */
        public DialogInterface.OnClickListener f193676b;

        /* renamed from: c */
        public DialogInterface.OnClickListener f193677c;

        /* renamed from: d */
        public int f193678d = 0;
    }

    public GlobalAlertEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GlobalAlertEvent)) {
            return false;
        }
        C67717a aVar = ((GlobalAlertEvent) iEvent).f193674d;
        return C46238a.m51546a(this.f193674d.f193675a, aVar.f193675a) && C46238a.m51546a(this.f193674d.f193676b, aVar.f193676b) && C46238a.m51546a(this.f193674d.f193677c, aVar.f193677c) && C46238a.m51546a(Integer.valueOf(this.f193674d.f193678d), Integer.valueOf(aVar.f193678d));
    }
}
