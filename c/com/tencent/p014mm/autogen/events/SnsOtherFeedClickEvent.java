package com.tencent.p014mm.autogen.events;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsOtherFeedClickEvent */
public final class SnsOtherFeedClickEvent extends IEvent {

    /* renamed from: d */
    public C92587a f265177d = new C92587a();

    /* renamed from: com.tencent.mm.autogen.events.SnsOtherFeedClickEvent$a */
    public static final class C92587a {

        /* renamed from: a */
        public int f265178a;

        /* renamed from: b */
        public C95787g0 f265179b;

        /* renamed from: c */
        public View f265180c;
    }

    public SnsOtherFeedClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsOtherFeedClickEvent)) {
            return false;
        }
        C92587a aVar = ((SnsOtherFeedClickEvent) iEvent).f265177d;
        return C46238a.m51546a(Integer.valueOf(this.f265177d.f265178a), Integer.valueOf(aVar.f265178a)) && C46238a.m51546a(this.f265177d.f265179b, aVar.f265179b) && C46238a.m51546a(this.f265177d.f265180c, aVar.f265180c);
    }
}
