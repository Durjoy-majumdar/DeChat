package com.tencent.p014mm.autogen.events;

import android.view.View;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsFeedRelocateEvent */
public final class SnsFeedRelocateEvent extends IEvent {

    /* renamed from: d */
    public C92575a f265138d = new C92575a();

    /* renamed from: com.tencent.mm.autogen.events.SnsFeedRelocateEvent$a */
    public static final class C92575a {

        /* renamed from: a */
        public View f265139a;

        /* renamed from: b */
        public int f265140b;

        /* renamed from: c */
        public int f265141c;

        /* renamed from: d */
        public int f265142d;

        /* renamed from: e */
        public Runnable f265143e;
    }

    public SnsFeedRelocateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsFeedRelocateEvent)) {
            return false;
        }
        C92575a aVar = ((SnsFeedRelocateEvent) iEvent).f265138d;
        return C46238a.m51546a(this.f265138d.f265139a, aVar.f265139a) && C46238a.m51546a(Integer.valueOf(this.f265138d.f265140b), Integer.valueOf(aVar.f265140b)) && C46238a.m51546a(Integer.valueOf(this.f265138d.f265141c), Integer.valueOf(aVar.f265141c)) && C46238a.m51546a(Integer.valueOf(this.f265138d.f265142d), Integer.valueOf(aVar.f265142d)) && C46238a.m51546a(this.f265138d.f265143e, aVar.f265143e);
    }
}
