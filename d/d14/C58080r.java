package d14;

import fy3.C32227p;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.r */
public final class C58080r implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ C32227p f166114d;

    /* renamed from: e */
    public final /* synthetic */ C45252f f166115e;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", mo125469f = "Emitters.kt", mo125470l = {116, 120}, mo125471m = "collect")
    /* renamed from: d14.r$a */
    public static final class C58081a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f166116d;

        /* renamed from: e */
        public int f166117e;

        /* renamed from: f */
        public final /* synthetic */ C58080r f166118f;

        /* renamed from: g */
        public Object f166119g;

        /* renamed from: h */
        public Object f166120h;

        /* renamed from: i */
        public Object f166121i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58081a(C58080r rVar, C15601d dVar) {
            super(dVar);
            this.f166118f = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166116d = obj;
            this.f166117e |= Integer.MIN_VALUE;
            return this.f166118f.mo31880a((C45253g<Object>) null, this);
        }
    }

    public C58080r(C32227p pVar, C45252f fVar) {
        this.f166114d = pVar;
        this.f166115e = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31880a(d14.C45253g<java.lang.Object> r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d14.C58080r.C58081a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            d14.r$a r0 = (d14.C58080r.C58081a) r0
            int r1 = r0.f166117e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166117e = r1
            goto L_0x0018
        L_0x0013:
            d14.r$a r0 = new d14.r$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f166116d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166117e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0079
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.f166121i
            e14.w r7 = (e14.C58510w) r7
            java.lang.Object r2 = r0.f166120h
            d14.g r2 = (d14.C45253g) r2
            java.lang.Object r4 = r0.f166119g
            d14.r r4 = (d14.C58080r) r4
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0042 }
            goto L_0x0064
        L_0x0042:
            r8 = move-exception
            goto L_0x0080
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r8)
            e14.w r8 = new e14.w
            wx3.f r2 = r0.getContext()
            r8.<init>(r7, r2)
            fy3.p r2 = r6.f166114d     // Catch:{ all -> 0x007c }
            r0.f166119g = r6     // Catch:{ all -> 0x007c }
            r0.f166120h = r7     // Catch:{ all -> 0x007c }
            r0.f166121i = r8     // Catch:{ all -> 0x007c }
            r0.f166117e = r4     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch:{ all -> 0x007c }
            if (r2 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r4 = r6
            r2 = r7
            r7 = r8
        L_0x0064:
            r7.releaseIntercepted()
            d14.f r7 = r4.f166115e
            r8 = 0
            r0.f166119g = r8
            r0.f166120h = r8
            r0.f166121i = r8
            r0.f166117e = r3
            java.lang.Object r7 = r7.mo31880a(r2, r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0079:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x007c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0080:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58080r.mo31880a(d14.g, wx3.d):java.lang.Object");
    }
}
