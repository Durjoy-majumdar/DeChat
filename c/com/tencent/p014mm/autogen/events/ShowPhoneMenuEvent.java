package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ShowPhoneMenuEvent */
public final class ShowPhoneMenuEvent extends IEvent {

    /* renamed from: d */
    public C1136a f9506d = new C1136a();

    /* renamed from: com.tencent.mm.autogen.events.ShowPhoneMenuEvent$a */
    public static final class C1136a {

        /* renamed from: a */
        public Context f9507a;

        /* renamed from: b */
        public String f9508b;

        /* renamed from: c */
        public DialogInterface.OnDismissListener f9509c;

        /* renamed from: d */
        public Bundle f9510d;
    }

    public ShowPhoneMenuEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShowPhoneMenuEvent)) {
            return false;
        }
        C1136a aVar = ((ShowPhoneMenuEvent) iEvent).f9506d;
        return C46238a.m51546a(this.f9506d.f9507a, aVar.f9507a) && C46238a.m51546a(this.f9506d.f9508b, aVar.f9508b) && C46238a.m51546a(this.f9506d.f9509c, aVar.f9509c) && C46238a.m51546a(this.f9506d.f9510d, aVar.f9510d);
    }
}
