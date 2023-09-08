package com.tencent.p014mm.autogen.events;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsInputScrollEvent */
public final class SnsInputScrollEvent extends IEvent {

    /* renamed from: d */
    public C92581a f265161d = new C92581a();

    /* renamed from: com.tencent.mm.autogen.events.SnsInputScrollEvent$a */
    public static final class C92581a {

        /* renamed from: a */
        public View f265162a;

        /* renamed from: b */
        public SnsCommentFooter f265163b;
    }

    public SnsInputScrollEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsInputScrollEvent)) {
            return false;
        }
        C92581a aVar = ((SnsInputScrollEvent) iEvent).f265161d;
        return C46238a.m51546a(this.f265161d.f265162a, aVar.f265162a) && C46238a.m51546a(this.f265161d.f265163b, aVar.f265163b);
    }
}
