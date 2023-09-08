package j31;

import a14.C53953u0;
import gy3.C87412m;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: j31.c */
public class C9279c<_key, _result> extends C117294b<_key, _result> {

    /* renamed from: b */
    public _result f29027b;

    /* renamed from: c */
    public long f29028c;

    /* renamed from: d */
    public C53953u0<? extends _result> f29029d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.cache.SimpleDataCache", mo125469f = "SimpleDataCache.kt", mo125470l = {30}, mo125471m = "requestCache$suspendImpl")
    /* renamed from: j31.c$a */
    public static final class C9280a extends C66704d {

        /* renamed from: d */
        public Object f29030d;

        /* renamed from: e */
        public /* synthetic */ Object f29031e;

        /* renamed from: f */
        public final /* synthetic */ C9279c<_key, _result> f29032f;

        /* renamed from: g */
        public int f29033g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9280a(C9279c<_key, _result> cVar, C15601d<? super C9280a> dVar) {
            super(dVar);
            this.f29032f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29031e = obj;
            this.f29033g |= Integer.MIN_VALUE;
            return C9279c.m8917i(this.f29032f, this);
        }
    }

    public C9279c(_key _key) {
        super(_key);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m8917i(j31.C9279c r4, wx3.C15601d r5) {
        /*
            boolean r0 = r5 instanceof j31.C9279c.C9280a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            j31.c$a r0 = (j31.C9279c.C9280a) r0
            int r1 = r0.f29033g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29033g = r1
            goto L_0x0018
        L_0x0013:
            j31.c$a r0 = new j31.c$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f29031e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f29033g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r4 = r0.f29030d
            j31.c r4 = (j31.C9279c) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0045
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            a14.u0<? extends _result> r5 = r4.f29029d
            if (r5 == 0) goto L_0x0045
            r0.f29030d = r4
            r0.f29033g = r3
            java.lang.Object r5 = r5.mo74521O(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r5 = r4.mo380g()
            if (r5 == 0) goto L_0x004e
            _result r4 = r4.f29027b
            goto L_0x0052
        L_0x004e:
            r4.mo10056c(r3)
            r4 = 0
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j31.C9279c.m8917i(j31.c, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public void mo10054a() {
        this.f29029d = null;
    }

    /* renamed from: b */
    public C53953u0<_result> mo10055b() {
        return this.f29029d;
    }

    /* renamed from: c */
    public _result mo10056c(boolean z) {
        _result _result = this.f29027b;
        if (z && _result != null) {
            C87412m.m108591d(_result);
            mo381h(_result);
        }
        this.f29027b = null;
        return _result;
    }

    /* renamed from: d */
    public Object mo378d(C15601d<? super _result> dVar) {
        return m8917i(this, dVar);
    }

    /* renamed from: e */
    public void mo379e(_result _result, long j) {
        this.f29027b = _result;
        this.f29028c = j;
    }

    /* renamed from: f */
    public void mo10057f(C53953u0<? extends _result> u0Var) {
        C87412m.m108594g(u0Var, "preloadJob");
        this.f29029d = u0Var;
    }

    /* renamed from: g */
    public boolean mo380g() {
        return true;
    }

    /* renamed from: h */
    public void mo381h(_result _result) {
    }
}
