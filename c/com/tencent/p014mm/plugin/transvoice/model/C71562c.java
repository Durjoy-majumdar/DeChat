package com.tencent.p014mm.plugin.transvoice.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.transvoice.model.c */
public final class C71562c {

    /* renamed from: v */
    public static final C71562c f207365v = C71563a.f207387a;

    /* renamed from: a */
    public boolean f207366a;

    /* renamed from: b */
    public long f207367b;

    /* renamed from: c */
    public int f207368c;

    /* renamed from: d */
    public int f207369d;

    /* renamed from: e */
    public long f207370e;

    /* renamed from: f */
    public int f207371f;

    /* renamed from: g */
    public int f207372g;

    /* renamed from: h */
    public int f207373h;

    /* renamed from: i */
    public int f207374i;

    /* renamed from: j */
    public long f207375j;

    /* renamed from: k */
    public long f207376k;

    /* renamed from: l */
    public int f207377l;

    /* renamed from: m */
    public int f207378m;

    /* renamed from: n */
    public int f207379n;

    /* renamed from: o */
    public long f207380o;

    /* renamed from: p */
    public int f207381p;

    /* renamed from: q */
    public int f207382q;

    /* renamed from: r */
    public int f207383r;

    /* renamed from: s */
    public int f207384s;

    /* renamed from: t */
    public int f207385t;

    /* renamed from: u */
    public int f207386u;

    /* renamed from: com.tencent.mm.plugin.transvoice.model.c$a */
    public static final class C71563a {

        /* renamed from: a */
        public static final C71562c f207387a = new C71562c((C8480h) null);
    }

    public C71562c(C8480h hVar) {
    }

    /* renamed from: a */
    public final void mo98690a() {
        this.f207367b = 0;
        this.f207368c = 0;
        this.f207369d = 0;
        this.f207370e = 0;
        this.f207371f = 0;
        this.f207372g = 0;
        this.f207374i = 0;
        this.f207375j = 0;
        this.f207376k = 0;
        this.f207377l = 0;
        this.f207378m = 0;
        this.f207379n = 0;
        this.f207380o = 0;
        this.f207381p = 0;
        this.f207382q = 0;
        this.f207383r = 0;
        this.f207384s = 0;
        this.f207385t = 0;
        this.f207386u = 0;
    }

    /* renamed from: b */
    public final void mo98691b(int i) {
        if (this.f207366a) {
            this.f207366a = false;
            this.f207373h = i;
            this.f207374i = NetworkCache.INSTANCE.getIOSNetTypeFromCache(MMApplicationContext.getContext());
            C115669n.INSTANCE.mo160131h(17164, Long.valueOf(this.f207367b), Integer.valueOf(this.f207368c), Integer.valueOf(this.f207369d), Long.valueOf(this.f207370e), Integer.valueOf(this.f207371f), Integer.valueOf(this.f207372g), Integer.valueOf(this.f207373h), Integer.valueOf(this.f207374i), Long.valueOf(this.f207375j), Long.valueOf(this.f207376k), Integer.valueOf(this.f207377l), Integer.valueOf(this.f207378m), Integer.valueOf(this.f207379n), Long.valueOf(this.f207380o), Integer.valueOf(this.f207381p), Integer.valueOf(this.f207382q), Integer.valueOf(this.f207383r), Integer.valueOf(this.f207384s), Integer.valueOf(this.f207385t), Integer.valueOf(this.f207386u), Integer.valueOf(MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels), Integer.valueOf(MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels));
            mo98690a();
            return;
        }
        mo98690a();
    }
}
