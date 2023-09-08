package com.tencent.mapsdk.core.utils.cache;

import com.tencent.mapsdk.internal.C0949kl;
import com.tencent.mapsdk.internal.C113846jl;
import com.tencent.mapsdk.internal.C113849jm;
import com.tencent.mapsdk.internal.C113850jn;
import com.tencent.mapsdk.internal.C113862jt;
import com.tencent.mapsdk.internal.C113896kq;

public final class MemoryCache<D extends C113849jm> extends C113862jt<D> {

    /* renamed from: a */
    private static final float f339606a = 0.9f;

    /* renamed from: b */
    private static final float f339607b = 0.15f;

    /* renamed from: c */
    private final C113493a f339608c;

    /* renamed from: d */
    private final C113850jn.C113851a<D> f339609d;

    /* renamed from: com.tencent.mapsdk.core.utils.cache.MemoryCache$a */
    public static class C113493a implements C113846jl.C113847a {

        /* renamed from: b */
        public int f339610b;

        /* renamed from: c */
        public C113846jl.C113848b f339611c;

        /* renamed from: a */
        private C113493a m155429a(int i) {
            this.f339610b = i;
            return this;
        }

        /* renamed from: b */
        private <D> C113846jl.C113848b<D> m155431b() {
            return this.f339611c;
        }

        public final String toString() {
            return "Options{mMaxCacheSize=" + this.f339610b + '}';
        }

        /* renamed from: a */
        private <D> C113493a m155430a(C113846jl.C113848b<D> bVar) {
            this.f339611c = bVar;
            return this;
        }

        /* renamed from: a */
        public final int mo170965a() {
            return this.f339610b;
        }
    }

    public MemoryCache(C113493a aVar) {
        this.f339608c = aVar;
        int i = (int) (((float) Runtime.getRuntime().totalMemory()) * f339606a);
        this.f339609d = new C113850jn.C113851a<>(aVar != null ? Math.min(Math.max(aVar.f339610b, (int) (((float) Runtime.getRuntime().freeMemory()) * f339607b)), i) : i, aVar.f339611c);
    }

    /* renamed from: a */
    private int m155421a() {
        int i = (int) (((float) Runtime.getRuntime().totalMemory()) * f339606a);
        int freeMemory = (int) (((float) Runtime.getRuntime().freeMemory()) * f339607b);
        C113493a aVar = this.f339608c;
        return aVar != null ? Math.min(Math.max(aVar.f339610b, freeMemory), i) : i;
    }

    /* renamed from: b */
    public final void mo170953b() {
        this.f339609d.mo147870a();
    }

    /* renamed from: c */
    public final long mo170954c() {
        return (long) this.f339609d.mo147876d().size();
    }

    /* renamed from: d */
    public final long mo170955d() {
        return (long) this.f339609d.mo147872b();
    }

    /* renamed from: e */
    public final long mo170956e() {
        return (long) this.f339609d.mo147874c();
    }

    /* renamed from: a */
    public final void mo170951a(String str, D d) {
        C113896kq.m157664b(C0949kl.f2247q, str);
        this.f339609d.mo147869a(str, d);
        C113896kq.m157656a(C0949kl.f2247q, str, "put data length", (Object) Integer.valueOf(d.mo56234a()));
    }

    /* renamed from: a */
    public final D mo170950a(String str, Class<D> cls) {
        int i;
        D d = (C113849jm) this.f339609d.mo147873b(str);
        if (d == null) {
            i = 0;
        } else {
            i = d.mo56234a();
        }
        C113896kq.m157656a(C0949kl.f2247q, str, "get data length", (Object) Integer.valueOf(i));
        C113896kq.m157676f(C0949kl.f2247q, str);
        return d;
    }

    /* renamed from: a */
    public final boolean mo170952a(String str) {
        return this.f339609d.mo147875c(str) != null;
    }
}
