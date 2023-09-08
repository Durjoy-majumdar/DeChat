package p247u3;

import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import fy3.C32226l;
import sx3.C64188i0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: u3.c2 */
public final class C65041c2<T> {

    /* renamed from: a */
    public final C54625h<C64188i0<C65086n0<T>>> f187217a = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);

    @C91590f(mo125468c = "androidx.paging.TemporaryDownstream", mo125469f = "CachedPageEventFlow.kt", mo125470l = {149}, mo125471m = "send")
    /* renamed from: u3.c2$a */
    public static final class C65042a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f187218d;

        /* renamed from: e */
        public int f187219e;

        /* renamed from: f */
        public final /* synthetic */ C65041c2 f187220f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65042a(C65041c2 c2Var, C15601d dVar) {
            super(dVar);
            this.f187220f = c2Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f187218d = obj;
            this.f187219e |= Integer.MIN_VALUE;
            return this.f187220f.mo89242a((C64188i0) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89242a(sx3.C64188i0<? extends p247u3.C65086n0<T>> r5, wx3.C15601d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p247u3.C65041c2.C65042a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            u3.c2$a r0 = (p247u3.C65041c2.C65042a) r0
            int r1 = r0.f187219e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f187219e = r1
            goto L_0x0018
        L_0x0013:
            u3.c2$a r0 = new u3.c2$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f187218d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187219e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ p -> 0x003f }
            goto L_0x0040
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            c14.h<sx3.i0<u3.n0<T>>> r6 = r4.f187217a     // Catch:{ p -> 0x003f }
            r0.f187219e = r3     // Catch:{ p -> 0x003f }
            c14.c r6 = (c14.C54614c) r6     // Catch:{ p -> 0x003f }
            java.lang.Object r5 = r6.mo75536o(r5, r0)     // Catch:{ p -> 0x003f }
            if (r5 != r1) goto L_0x0040
            return r1
        L_0x003f:
            r3 = 0
        L_0x0040:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p247u3.C65041c2.mo89242a(sx3.i0, wx3.d):java.lang.Object");
    }
}
