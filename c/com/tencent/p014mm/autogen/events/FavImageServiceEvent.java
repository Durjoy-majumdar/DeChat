package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.autogen.events.FavImageServiceEvent */
public final class FavImageServiceEvent extends IEvent {

    /* renamed from: d */
    public C92510a f264809d = new C92510a();

    /* renamed from: e */
    public C92511b f264810e = new C92511b();

    /* renamed from: com.tencent.mm.autogen.events.FavImageServiceEvent$a */
    public static final class C92510a {

        /* renamed from: a */
        public int f264811a = -1;

        /* renamed from: b */
        public C101834rc0 f264812b;

        /* renamed from: c */
        public long f264813c;

        /* renamed from: d */
        public int f264814d;

        /* renamed from: e */
        public ImageView f264815e;

        /* renamed from: f */
        public int f264816f;

        /* renamed from: g */
        public int f264817g;

        /* renamed from: h */
        public int f264818h;

        /* renamed from: i */
        public Context f264819i;

        /* renamed from: j */
        public boolean f264820j = false;

        /* renamed from: k */
        public boolean f264821k = false;

        /* renamed from: l */
        public boolean f264822l = true;
    }

    /* renamed from: com.tencent.mm.autogen.events.FavImageServiceEvent$b */
    public static final class C92511b {

        /* renamed from: a */
        public Bitmap f264823a;
    }

    public FavImageServiceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavImageServiceEvent)) {
            return false;
        }
        FavImageServiceEvent favImageServiceEvent = (FavImageServiceEvent) iEvent;
        C92510a aVar = favImageServiceEvent.f264809d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264809d.f264811a), Integer.valueOf(aVar.f264811a)) || !C46238a.m51546a(this.f264809d.f264812b, aVar.f264812b) || !C46238a.m51546a(Long.valueOf(this.f264809d.f264813c), Long.valueOf(aVar.f264813c)) || !C46238a.m51546a(Integer.valueOf(this.f264809d.f264814d), Integer.valueOf(aVar.f264814d)) || !C46238a.m51546a(this.f264809d.f264815e, aVar.f264815e) || !C46238a.m51546a(Integer.valueOf(this.f264809d.f264816f), Integer.valueOf(aVar.f264816f)) || !C46238a.m51546a(Integer.valueOf(this.f264809d.f264817g), Integer.valueOf(aVar.f264817g)) || !C46238a.m51546a(Integer.valueOf(this.f264809d.f264818h), Integer.valueOf(aVar.f264818h)) || !C46238a.m51546a(this.f264809d.f264819i, aVar.f264819i)) {
            return false;
        }
        this.f264809d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(Boolean.valueOf(this.f264809d.f264820j), Boolean.valueOf(aVar.f264820j)) || !C46238a.m51546a(Boolean.valueOf(this.f264809d.f264821k), Boolean.valueOf(aVar.f264821k)) || !C46238a.m51546a(Boolean.valueOf(this.f264809d.f264822l), Boolean.valueOf(aVar.f264822l))) {
            return false;
        }
        if (!C46238a.m51546a(this.f264810e.f264823a, favImageServiceEvent.f264810e.f264823a)) {
            return false;
        }
        this.f264810e.getClass();
        return C46238a.m51546a(-1, -1);
    }
}
