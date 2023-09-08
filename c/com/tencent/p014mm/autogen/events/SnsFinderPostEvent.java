package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsFinderPostEvent */
public final class SnsFinderPostEvent extends IEvent {

    /* renamed from: d */
    public C92576a f265144d = new C92576a();

    /* renamed from: com.tencent.mm.autogen.events.SnsFinderPostEvent$a */
    public static final class C92576a {

        /* renamed from: a */
        public int f265145a;

        /* renamed from: b */
        public Context f265146b;

        /* renamed from: c */
        public SnsInfo f265147c;
    }

    public SnsFinderPostEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsFinderPostEvent)) {
            return false;
        }
        C92576a aVar = ((SnsFinderPostEvent) iEvent).f265144d;
        return C46238a.m51546a(Integer.valueOf(this.f265144d.f265145a), Integer.valueOf(aVar.f265145a)) && C46238a.m51546a(this.f265144d.f265146b, aVar.f265146b) && C46238a.m51546a(this.f265144d.f265147c, aVar.f265147c);
    }
}
