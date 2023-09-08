package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpenNoteFromSessionEvent */
public final class OpenNoteFromSessionEvent extends IEvent {

    /* renamed from: d */
    public C67750a f193796d = new C67750a();

    /* renamed from: com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a */
    public static final class C67750a {

        /* renamed from: a */
        public long f193797a = -1;

        /* renamed from: b */
        public String f193798b;

        /* renamed from: c */
        public Context f193799c;

        /* renamed from: d */
        public boolean f193800d = true;

        /* renamed from: e */
        public int f193801e;

        /* renamed from: f */
        public Bundle f193802f;
    }

    public OpenNoteFromSessionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenNoteFromSessionEvent)) {
            return false;
        }
        C67750a aVar = ((OpenNoteFromSessionEvent) iEvent).f193796d;
        return C46238a.m51546a(Long.valueOf(this.f193796d.f193797a), Long.valueOf(aVar.f193797a)) && C46238a.m51546a(this.f193796d.f193798b, aVar.f193798b) && C46238a.m51546a(this.f193796d.f193799c, aVar.f193799c) && C46238a.m51546a(Boolean.valueOf(this.f193796d.f193800d), Boolean.valueOf(aVar.f193800d)) && C46238a.m51546a(Integer.valueOf(this.f193796d.f193801e), Integer.valueOf(aVar.f193801e)) && C46238a.m51546a(this.f193796d.f193802f, aVar.f193802f);
    }
}
