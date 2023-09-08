package q11;

import a14.C0000n0;
import a14.C53953u0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import p11.C110101a;
import p11.C110102b;
import p11.C110103c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_core.execute_core.MTRExecutor$start$1", mo125469f = "MTRExecutor.kt", mo125470l = {40, 44, 61}, mo125471m = "invokeSuspend")
/* renamed from: q11.h */
public final class C110339h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f330070d;

    /* renamed from: e */
    public int f330071e;

    /* renamed from: f */
    public /* synthetic */ Object f330072f;

    /* renamed from: g */
    public final /* synthetic */ C110337g<C110101a, C110102b> f330073g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_core.execute_core.MTRExecutor$start$1$3$1", mo125469f = "MTRExecutor.kt", mo125470l = {51}, mo125471m = "invokeSuspend")
    /* renamed from: q11.h$a */
    public static final class C110340a extends C91594j implements C32227p<C0000n0, C15601d<C110102b>, Object> {

        /* renamed from: d */
        public int f330074d;

        /* renamed from: e */
        public final /* synthetic */ C110337g<C110101a, C110102b> f330075e;

        /* renamed from: f */
        public final /* synthetic */ C110101a f330076f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110340a(C110337g<C110101a, C110102b> gVar, C110101a aVar, C15601d<? super C110340a> dVar) {
            super(2, dVar);
            this.f330075e = gVar;
            this.f330076f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110340a(this.f330075e, this.f330076f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110340a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f330074d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C110337g<C110101a, C110102b> gVar = this.f330075e;
                C110101a aVar2 = this.f330076f;
                Result.Companion companion = Result.Companion;
                C110103c<IN, OUT> cVar = gVar.f330065d;
                this.f330074d = 1;
                obj = cVar.mo161502c(aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = Result.m168114constructorimpl((C110102b) obj);
            if (Result.m168120isFailureimpl(obj2)) {
                return null;
            }
            return obj2;
        }
    }

    /* renamed from: q11.h$b */
    public static final class C110341b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f330077d;

        /* renamed from: e */
        public final /* synthetic */ C53953u0<C110102b> f330078e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110341b(C8477a0 a0Var, C53953u0<C110102b> u0Var) {
            super(1);
            this.f330077d = a0Var;
            this.f330078e = u0Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C8477a0 a0Var = this.f330077d;
            boolean z = false;
            if (th == null) {
                C110102b i = this.f330078e.mo74635i();
                if (!(i != null && !i.f329411a)) {
                    z = true;
                }
            }
            a0Var.f27482d = z;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110339h(C110337g<C110101a, C110102b> gVar, C15601d<? super C110339h> dVar) {
        super(2, dVar);
        this.f330073g = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C110339h hVar = new C110339h(this.f330073g, dVar);
        hVar.f330072f = obj;
        return hVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110339h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: gy3.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e A[Catch:{ all -> 0x0086 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r1.f330071e
            r3 = 3
            r4 = 2
            java.lang.String r5 = "MicroMsg.MTR.MTRExecutor"
            r6 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r6) goto L_0x0035
            if (r0 == r4) goto L_0x0021
            if (r0 != r3) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r17)
            r14 = r1
            goto L_0x00e5
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0021:
            java.lang.Object r0 = r1.f330070d
            r6 = r0
            gy3.a0 r6 = (gy3.C8477a0) r6
            java.lang.Object r0 = r1.f330072f
            r7 = r0
            a14.n0 r7 = (a14.C0000n0) r7
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ all -> 0x0032 }
            r0 = r17
            r8 = r1
            goto L_0x007f
        L_0x0032:
            r0 = move-exception
            r8 = r1
            goto L_0x0087
        L_0x0035:
            java.lang.Object r0 = r1.f330070d
            gy3.a0 r0 = (gy3.C8477a0) r0
            java.lang.Object r6 = r1.f330072f
            a14.n0 r6 = (a14.C0000n0) r6
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x0062
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r0 = r1.f330072f
            a14.n0 r0 = (a14.C0000n0) r0
            gy3.a0 r7 = new gy3.a0
            r7.<init>()
            r7.f27482d = r6
            q11.g<p11.a, p11.b> r8 = r1.f330073g
            p11.c<IN, OUT> r8 = r8.f330065d
            r1.f330072f = r0
            r1.f330070d = r7
            r1.f330071e = r6
            java.lang.Object r6 = r8.mo161501b(r1)
            if (r6 != r2) goto L_0x0060
            return r2
        L_0x0060:
            r6 = r0
            r0 = r7
        L_0x0062:
            java.lang.String r7 = "enter loop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            r8 = r1
            r7 = r6
            r6 = r0
        L_0x006a:
            q11.g<p11.a, p11.b> r0 = r8.f330073g
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ all -> 0x0086 }
            c14.h<IN> r0 = r0.f330067f     // Catch:{ all -> 0x0086 }
            r8.f330072f = r7     // Catch:{ all -> 0x0086 }
            r8.f330070d = r6     // Catch:{ all -> 0x0086 }
            r8.f330071e = r4     // Catch:{ all -> 0x0086 }
            c14.a r0 = (c14.C54602a) r0     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.mo75514g(r8)     // Catch:{ all -> 0x0086 }
            if (r0 != r2) goto L_0x007f
            return r2
        L_0x007f:
            p11.a r0 = (p11.C110101a) r0     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x0091
        L_0x0086:
            r0 = move-exception
        L_0x0087:
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x0091:
            r13 = r7
            r14 = r8
            java.lang.Throwable r7 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            if (r7 == 0) goto L_0x00a4
            r8 = 0
            r6.f27482d = r8
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "receive error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r7, r9, r8)
        L_0x00a4:
            boolean r7 = kotlin.Result.m168120isFailureimpl(r0)
            r15 = 0
            if (r7 == 0) goto L_0x00ac
            r0 = r15
        L_0x00ac:
            p11.a r0 = (p11.C110101a) r0
            if (r0 == 0) goto L_0x00ca
            q11.g<p11.a, p11.b> r7 = r14.f330073g
            r8 = 0
            r9 = 0
            q11.h$a r10 = new q11.h$a
            r10.<init>(r7, r0, r15)
            r11 = 3
            r12 = 0
            r7 = r13
            a14.u0 r0 = a14.C53895h.m60464b(r7, r8, r9, r10, r11, r12)
            q11.h$b r7 = new q11.h$b
            r7.<init>(r6, r0)
            a14.f2 r0 = (a14.C53884f2) r0
            r0.mo74515E(r7)
        L_0x00ca:
            boolean r0 = r6.f27482d
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "quit loop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            q11.g<p11.a, p11.b> r0 = r14.f330073g
            p11.c<IN, OUT> r0 = r0.f330065d
            r14.f330072f = r15
            r14.f330070d = r15
            r14.f330071e = r3
            java.lang.Object r0 = r0.mo161500a(r14)
            if (r0 != r2) goto L_0x00e5
            return r2
        L_0x00e5:
            q11.g<p11.a, p11.b> r0 = r14.f330073g
            r0.close()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x00ed:
            r7 = r13
            r8 = r14
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: q11.C110339h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
