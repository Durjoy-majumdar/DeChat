package d14;

import fy3.C32228q;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.q */
public final class C58078q implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ C45252f f166107d;

    /* renamed from: e */
    public final /* synthetic */ C32228q f166108e;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", mo125469f = "Emitters.kt", mo125470l = {114, 121, 128}, mo125471m = "collect")
    /* renamed from: d14.q$a */
    public static final class C58079a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f166109d;

        /* renamed from: e */
        public int f166110e;

        /* renamed from: f */
        public final /* synthetic */ C58078q f166111f;

        /* renamed from: g */
        public Object f166112g;

        /* renamed from: h */
        public Object f166113h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58079a(C58078q qVar, C15601d dVar) {
            super(dVar);
            this.f166111f = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166109d = obj;
            this.f166110e |= Integer.MIN_VALUE;
            return this.f166111f.mo31880a((C45253g<Object>) null, this);
        }
    }

    public C58078q(C45252f fVar, C32228q qVar) {
        this.f166107d = fVar;
        this.f166108e = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31880a(d14.C45253g<java.lang.Object> r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof d14.C58078q.C58079a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            d14.q$a r0 = (d14.C58078q.C58079a) r0
            int r1 = r0.f166110e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166110e = r1
            goto L_0x0018
        L_0x0013:
            d14.q$a r0 = new d14.q$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f166109d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166110e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r9 = r0.f166112g
            e14.w r9 = (e14.C58510w) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0032 }
            goto L_0x007e
        L_0x0032:
            r10 = move-exception
            goto L_0x0088
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.f166112g
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a2
        L_0x0044:
            java.lang.Object r9 = r0.f166113h
            d14.g r9 = (d14.C45253g) r9
            java.lang.Object r2 = r0.f166112g
            d14.q r2 = (d14.C58078q) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0050 }
            goto L_0x0065
        L_0x0050:
            r9 = move-exception
            goto L_0x008e
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r10)
            d14.f r10 = r8.f166107d     // Catch:{ all -> 0x008c }
            r0.f166112g = r8     // Catch:{ all -> 0x008c }
            r0.f166113h = r9     // Catch:{ all -> 0x008c }
            r0.f166110e = r5     // Catch:{ all -> 0x008c }
            java.lang.Object r10 = r10.mo31880a(r9, r0)     // Catch:{ all -> 0x008c }
            if (r10 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r8
        L_0x0065:
            e14.w r10 = new e14.w
            wx3.f r4 = r0.getContext()
            r10.<init>(r9, r4)
            fy3.q r9 = r2.f166108e     // Catch:{ all -> 0x0084 }
            r0.f166112g = r10     // Catch:{ all -> 0x0084 }
            r0.f166113h = r6     // Catch:{ all -> 0x0084 }
            r0.f166110e = r3     // Catch:{ all -> 0x0084 }
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch:{ all -> 0x0084 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r9 = r10
        L_0x007e:
            r9.releaseIntercepted()
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        L_0x0084:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0088:
            r9.releaseIntercepted()
            throw r10
        L_0x008c:
            r9 = move-exception
            r2 = r8
        L_0x008e:
            d14.n1 r10 = new d14.n1
            r10.<init>(r9)
            fy3.q r2 = r2.f166108e
            r0.f166112g = r9
            r0.f166113h = r6
            r0.f166110e = r4
            java.lang.Object r10 = d14.C58082s.m67226a(r10, r2, r9, r0)
            if (r10 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58078q.mo31880a(d14.g, wx3.d):java.lang.Object");
    }
}
