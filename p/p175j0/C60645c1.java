package p175j0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p175j0.C60683t0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: j0.c1 */
public final class C60645c1 implements C60683t0 {

    /* renamed from: d */
    public final C60683t0 f172751d;

    /* renamed from: e */
    public final C60677q0 f172752e = new C60677q0();

    @C91590f(mo125468c = "androidx.compose.runtime.PausableMonotonicFrameClock", mo125469f = "PausableMonotonicFrameClock.kt", mo125470l = {62, 63}, mo125471m = "withFrameNanos")
    /* renamed from: j0.c1$a */
    public static final class C60646a<R> extends C66704d {

        /* renamed from: d */
        public Object f172753d;

        /* renamed from: e */
        public Object f172754e;

        /* renamed from: f */
        public /* synthetic */ Object f172755f;

        /* renamed from: g */
        public final /* synthetic */ C60645c1 f172756g;

        /* renamed from: h */
        public int f172757h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60646a(C60645c1 c1Var, C15601d<? super C60646a> dVar) {
            super(dVar);
            this.f172756g = c1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f172755f = obj;
            this.f172757h |= Integer.MIN_VALUE;
            return this.f172756g.mo74976d((C32226l) null, this);
        }
    }

    public C60645c1(C60683t0 t0Var) {
        C87412m.m108594g(t0Var, "frameClock");
        this.f172751d = t0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:33:0x008b, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <R> java.lang.Object mo74976d(fy3.C32226l<? super java.lang.Long, ? extends R> r7, wx3.C15601d<? super R> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p175j0.C60645c1.C60646a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            j0.c1$a r0 = (p175j0.C60645c1.C60646a) r0
            int r1 = r0.f172757h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f172757h = r1
            goto L_0x0018
        L_0x0013:
            j0.c1$a r0 = new j0.c1$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f172755f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f172757h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008e
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.f172754e
            fy3.l r7 = (fy3.C32226l) r7
            java.lang.Object r2 = r0.f172753d
            j0.c1 r2 = (p175j0.C60645c1) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x007e
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r8)
            j0.q0 r8 = r6.f172752e
            r0.f172753d = r6
            r0.f172754e = r7
            r0.f172757h = r4
            java.lang.Object r2 = r8.f172830a
            monitor-enter(r2)
            boolean r5 = r8.f172833d     // Catch:{ all -> 0x0092 }
            monitor-exit(r2)
            if (r5 == 0) goto L_0x0054
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x007a
        L_0x0054:
            a14.m r2 = new a14.m
            wx3.d r5 = xx3.C66447b.m78392b(r0)
            r2.<init>(r5, r4)
            r2.mo74609p()
            java.lang.Object r4 = r8.f172830a
            monitor-enter(r4)
            java.util.List<wx3.d<rx3.b0>> r5 = r8.f172831b     // Catch:{ all -> 0x008f }
            r5.add(r2)     // Catch:{ all -> 0x008f }
            monitor-exit(r4)
            j0.p0 r4 = new j0.p0
            r4.<init>(r8, r2)
            r2.mo74599v(r4)
            java.lang.Object r8 = r2.mo74608o()
            if (r8 != r1) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x007a:
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r2 = r6
        L_0x007e:
            j0.t0 r8 = r2.f172751d
            r2 = 0
            r0.f172753d = r2
            r0.f172754e = r2
            r0.f172757h = r3
            java.lang.Object r8 = r8.mo74976d(r7, r0)
            if (r8 != r1) goto L_0x008e
            return r1
        L_0x008e:
            return r8
        L_0x008f:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L_0x0092:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C60645c1.mo74976d(fy3.l, wx3.d):java.lang.Object");
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return C60683t0.C60684a.f172855d;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }
}
