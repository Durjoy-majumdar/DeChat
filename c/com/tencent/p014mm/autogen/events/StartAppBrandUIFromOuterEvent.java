package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent */
public final class StartAppBrandUIFromOuterEvent extends IEvent {

    /* renamed from: d */
    public C1142a f9522d = new C1142a();

    /* renamed from: e */
    public C1143b f9523e = new C1143b();

    /* renamed from: com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a */
    public static final class C1142a {

        /* renamed from: A */
        public String f9524A;

        /* renamed from: B */
        public String f9525B;

        /* renamed from: a */
        public String f9526a;

        /* renamed from: b */
        public String f9527b;

        /* renamed from: c */
        public int f9528c;

        /* renamed from: d */
        public int f9529d;

        /* renamed from: e */
        public String f9530e;

        /* renamed from: f */
        public Context f9531f;

        /* renamed from: g */
        public Parcelable f9532g;

        /* renamed from: h */
        public String f9533h;

        /* renamed from: i */
        public int f9534i;

        /* renamed from: j */
        public int f9535j;

        /* renamed from: k */
        public String f9536k;

        /* renamed from: l */
        public String f9537l;

        /* renamed from: m */
        public boolean f9538m;

        /* renamed from: n */
        public boolean f9539n = true;

        /* renamed from: o */
        public LaunchParamsOptional f9540o = new LaunchParamsOptional();

        /* renamed from: p */
        public int f9541p = -1;

        /* renamed from: q */
        public String f9542q;

        /* renamed from: r */
        public int f9543r;

        /* renamed from: s */
        public String f9544s;

        /* renamed from: t */
        public Bundle f9545t;

        /* renamed from: u */
        public String f9546u;

        /* renamed from: v */
        public String f9547v;

        /* renamed from: w */
        public String f9548w;

        /* renamed from: x */
        public String f9549x;

        /* renamed from: y */
        public String f9550y;

        /* renamed from: z */
        public String f9551z;
    }

    /* renamed from: com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b */
    public static final class C1143b {

        /* renamed from: a */
        public boolean f9552a;

        /* renamed from: b */
        public String f9553b;
    }

    public StartAppBrandUIFromOuterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartAppBrandUIFromOuterEvent)) {
            return false;
        }
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = (StartAppBrandUIFromOuterEvent) iEvent;
        C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        if (!C46238a.m51546a(this.f9522d.f9526a, aVar.f9526a) || !C46238a.m51546a(this.f9522d.f9527b, aVar.f9527b) || !C46238a.m51546a(Integer.valueOf(this.f9522d.f9528c), Integer.valueOf(aVar.f9528c)) || !C46238a.m51546a(Integer.valueOf(this.f9522d.f9529d), Integer.valueOf(aVar.f9529d)) || !C46238a.m51546a(this.f9522d.f9530e, aVar.f9530e) || !C46238a.m51546a(this.f9522d.f9531f, aVar.f9531f) || !C46238a.m51546a(this.f9522d.f9532g, aVar.f9532g) || !C46238a.m51546a(this.f9522d.f9533h, aVar.f9533h) || !C46238a.m51546a(Integer.valueOf(this.f9522d.f9534i), Integer.valueOf(aVar.f9534i)) || !C46238a.m51546a(Integer.valueOf(this.f9522d.f9535j), Integer.valueOf(aVar.f9535j)) || !C46238a.m51546a(this.f9522d.f9536k, aVar.f9536k) || !C46238a.m51546a(this.f9522d.f9537l, aVar.f9537l) || !C46238a.m51546a(Boolean.valueOf(this.f9522d.f9538m), Boolean.valueOf(aVar.f9538m)) || !C46238a.m51546a(Boolean.valueOf(this.f9522d.f9539n), Boolean.valueOf(aVar.f9539n)) || !C46238a.m51546a(this.f9522d.f9540o, aVar.f9540o)) {
            return false;
        }
        this.f9522d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(Integer.valueOf(this.f9522d.f9541p), Integer.valueOf(aVar.f9541p)) || !C46238a.m51546a(this.f9522d.f9542q, aVar.f9542q)) {
            return false;
        }
        this.f9522d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(Integer.valueOf(this.f9522d.f9543r), Integer.valueOf(aVar.f9543r)) || !C46238a.m51546a(this.f9522d.f9544s, aVar.f9544s) || !C46238a.m51546a(this.f9522d.f9545t, aVar.f9545t) || !C46238a.m51546a(this.f9522d.f9546u, aVar.f9546u) || !C46238a.m51546a(this.f9522d.f9547v, aVar.f9547v) || !C46238a.m51546a(this.f9522d.f9548w, aVar.f9548w) || !C46238a.m51546a(this.f9522d.f9549x, aVar.f9549x) || !C46238a.m51546a(this.f9522d.f9525B, aVar.f9525B) || !C46238a.m51546a(this.f9522d.f9550y, aVar.f9550y) || !C46238a.m51546a(this.f9522d.f9551z, aVar.f9551z) || !C46238a.m51546a(this.f9522d.f9524A, aVar.f9524A)) {
            return false;
        }
        this.f9522d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C1143b bVar = startAppBrandUIFromOuterEvent.f9523e;
        return C46238a.m51546a(Boolean.valueOf(this.f9523e.f9552a), Boolean.valueOf(bVar.f9552a)) && C46238a.m51546a(this.f9523e.f9553b, bVar.f9553b);
    }
}
