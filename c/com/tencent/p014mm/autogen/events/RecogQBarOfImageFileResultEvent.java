package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent */
public final class RecogQBarOfImageFileResultEvent extends IEvent {

    /* renamed from: d */
    public C92550a f265015d = new C92550a();

    /* renamed from: com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a */
    public static final class C92550a {

        /* renamed from: a */
        public String f265016a;

        /* renamed from: b */
        public ArrayList f265017b;

        /* renamed from: c */
        public ArrayList f265018c;

        /* renamed from: d */
        public ArrayList f265019d;

        /* renamed from: e */
        public ArrayList f265020e;

        /* renamed from: f */
        public ArrayList f265021f;

        /* renamed from: g */
        public int f265022g;

        /* renamed from: h */
        public int f265023h;

        /* renamed from: i */
        public ArrayList f265024i;

        /* renamed from: j */
        public ArrayList f265025j;

        /* renamed from: k */
        public int f265026k;
    }

    public RecogQBarOfImageFileResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecogQBarOfImageFileResultEvent)) {
            return false;
        }
        C92550a aVar = ((RecogQBarOfImageFileResultEvent) iEvent).f265015d;
        this.f265015d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0L, 0L) && C46238a.m51546a(this.f265015d.f265016a, aVar.f265016a) && C46238a.m51546a(this.f265015d.f265017b, aVar.f265017b) && C46238a.m51546a(this.f265015d.f265018c, aVar.f265018c) && C46238a.m51546a(this.f265015d.f265019d, aVar.f265019d) && C46238a.m51546a(this.f265015d.f265020e, aVar.f265020e) && C46238a.m51546a(this.f265015d.f265021f, aVar.f265021f) && C46238a.m51546a(Integer.valueOf(this.f265015d.f265022g), Integer.valueOf(aVar.f265022g)) && C46238a.m51546a(Integer.valueOf(this.f265015d.f265023h), Integer.valueOf(aVar.f265023h)) && C46238a.m51546a(this.f265015d.f265024i, aVar.f265024i) && C46238a.m51546a(this.f265015d.f265025j, aVar.f265025j) && C46238a.m51546a(Integer.valueOf(this.f265015d.f265026k), Integer.valueOf(aVar.f265026k));
    }
}
