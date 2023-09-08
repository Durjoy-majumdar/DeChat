package d14;

import fy3.C32228q;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.t */
public final class C58083t implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f166122d;

    /* renamed from: e */
    public final /* synthetic */ C32228q f166123e;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", mo125469f = "Errors.kt", mo125470l = {113, 114}, mo125471m = "collect")
    /* renamed from: d14.t$a */
    public static final class C58084a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f166124d;

        /* renamed from: e */
        public int f166125e;

        /* renamed from: f */
        public final /* synthetic */ C58083t f166126f;

        /* renamed from: g */
        public Object f166127g;

        /* renamed from: h */
        public Object f166128h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58084a(C58083t tVar, C15601d dVar) {
            super(dVar);
            this.f166126f = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166124d = obj;
            this.f166125e |= Integer.MIN_VALUE;
            return this.f166126f.mo31880a((C45253g<Object>) null, this);
        }
    }

    public C58083t(C45252f fVar, C32228q qVar) {
        this.f166122d = fVar;
        this.f166123e = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31880a(d14.C45253g<java.lang.Object> r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d14.C58083t.C58084a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            d14.t$a r0 = (d14.C58083t.C58084a) r0
            int r1 = r0.f166125e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166125e = r1
            goto L_0x0018
        L_0x0013:
            d14.t$a r0 = new d14.t$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f166124d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166125e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0065
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.f166128h
            d14.g r6 = (d14.C45253g) r6
            java.lang.Object r2 = r0.f166127g
            d14.t r2 = (d14.C58083t) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0051
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r7)
            d14.f r7 = r5.f166122d
            r0.f166127g = r5
            r0.f166128h = r6
            r0.f166125e = r4
            java.lang.Object r7 = d14.C58042h.m67193b(r7, r6, r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r5
        L_0x0051:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L_0x0065
            fy3.q r2 = r2.f166123e
            r4 = 0
            r0.f166127g = r4
            r0.f166128h = r4
            r0.f166125e = r3
            java.lang.Object r6 = r2.invoke(r6, r7, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58083t.mo31880a(d14.g, wx3.d):java.lang.Object");
    }
}
