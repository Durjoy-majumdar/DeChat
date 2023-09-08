package i82;

import a14.C0000n0;
import a14.C53953u0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87413o;
import h82.C108172a;
import h82.C108173b;
import h82.C108174c;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_core.execute_core.MTRExecutor$start$1", mo125469f = "MTRExecutor.kt", mo125470l = {40, 44, 61}, mo125471m = "invokeSuspend")
/* renamed from: i82.h */
public final class C108411h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f324617d;

    /* renamed from: e */
    public int f324618e;

    /* renamed from: f */
    public /* synthetic */ Object f324619f;

    /* renamed from: g */
    public final /* synthetic */ C108409g<C108172a, C108173b> f324620g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_core.execute_core.MTRExecutor$start$1$3$1", mo125469f = "MTRExecutor.kt", mo125470l = {51}, mo125471m = "invokeSuspend")
    /* renamed from: i82.h$a */
    public static final class C108412a extends C91594j implements C32227p<C0000n0, C15601d<C108173b>, Object> {

        /* renamed from: d */
        public int f324621d;

        /* renamed from: e */
        public final /* synthetic */ C108409g<C108172a, C108173b> f324622e;

        /* renamed from: f */
        public final /* synthetic */ C108172a f324623f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108412a(C108409g<C108172a, C108173b> gVar, C108172a aVar, C15601d<? super C108412a> dVar) {
            super(2, dVar);
            this.f324622e = gVar;
            this.f324623f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108412a(this.f324622e, this.f324623f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108412a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f324621d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C108409g<C108172a, C108173b> gVar = this.f324622e;
                C108172a aVar2 = this.f324623f;
                Result.Companion companion = Result.Companion;
                C108174c<IN, OUT> cVar = gVar.f324612d;
                this.f324621d = 1;
                obj = cVar.mo158582c(aVar2, this);
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
            obj2 = Result.m168114constructorimpl((C108173b) obj);
            if (Result.m168120isFailureimpl(obj2)) {
                return null;
            }
            return obj2;
        }
    }

    /* renamed from: i82.h$b */
    public static final class C108413b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f324624d;

        /* renamed from: e */
        public final /* synthetic */ C53953u0<C108173b> f324625e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108413b(C8477a0 a0Var, C53953u0<C108173b> u0Var) {
            super(1);
            this.f324624d = a0Var;
            this.f324625e = u0Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C8477a0 a0Var = this.f324624d;
            boolean z = false;
            if (th == null) {
                C108173b i = this.f324625e.mo74635i();
                if (!(i != null && !i.f323905a)) {
                    z = true;
                }
            }
            a0Var.f27482d = z;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108411h(C108409g<C108172a, C108173b> gVar, C15601d<? super C108411h> dVar) {
        super(2, dVar);
        this.f324620g = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C108411h hVar = new C108411h(this.f324620g, dVar);
        hVar.f324619f = obj;
        return hVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108411h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: gy3.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e A[Catch:{ all -> 0x0086 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r1.f324618e
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
            goto L_0x00e3
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0021:
            java.lang.Object r0 = r1.f324617d
            r6 = r0
            gy3.a0 r6 = (gy3.C8477a0) r6
            java.lang.Object r0 = r1.f324619f
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
            java.lang.Object r0 = r1.f324617d
            gy3.a0 r0 = (gy3.C8477a0) r0
            java.lang.Object r6 = r1.f324619f
            a14.n0 r6 = (a14.C0000n0) r6
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x0062
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r0 = r1.f324619f
            a14.n0 r0 = (a14.C0000n0) r0
            gy3.a0 r7 = new gy3.a0
            r7.<init>()
            r7.f27482d = r6
            i82.g<h82.a, h82.b> r8 = r1.f324620g
            h82.c<IN, OUT> r8 = r8.f324612d
            r1.f324619f = r0
            r1.f324617d = r7
            r1.f324618e = r6
            java.lang.Object r6 = r8.mo158581b(r1)
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
            i82.g<h82.a, h82.b> r0 = r8.f324620g
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ all -> 0x0086 }
            c14.h<IN> r0 = r0.f324614f     // Catch:{ all -> 0x0086 }
            r8.f324619f = r7     // Catch:{ all -> 0x0086 }
            r8.f324617d = r6     // Catch:{ all -> 0x0086 }
            r8.f324618e = r4     // Catch:{ all -> 0x0086 }
            c14.a r0 = (c14.C54602a) r0     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.mo75514g(r8)     // Catch:{ all -> 0x0086 }
            if (r0 != r2) goto L_0x007f
            return r2
        L_0x007f:
            h82.a r0 = (h82.C108172a) r0     // Catch:{ all -> 0x0086 }
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
            if (r7 == 0) goto L_0x00a3
            r8 = 0
            r6.f27482d = r8
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "receive error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r7, r9, r8)
        L_0x00a3:
            boolean r7 = kotlin.Result.m168120isFailureimpl(r0)
            r15 = 0
            if (r7 == 0) goto L_0x00ab
            r0 = r15
        L_0x00ab:
            h82.a r0 = (h82.C108172a) r0
            if (r0 == 0) goto L_0x00c9
            i82.g<h82.a, h82.b> r7 = r14.f324620g
            r8 = 0
            r9 = 0
            i82.h$a r10 = new i82.h$a
            r10.<init>(r7, r0, r15)
            r11 = 3
            r12 = 0
            r7 = r13
            a14.u0 r0 = a14.C53895h.m60464b(r7, r8, r9, r10, r11, r12)
            i82.h$b r7 = new i82.h$b
            r7.<init>(r6, r0)
            a14.f2 r0 = (a14.C53884f2) r0
            r0.mo74515E(r7)
        L_0x00c9:
            boolean r0 = r6.f27482d
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = "quit loop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            i82.g<h82.a, h82.b> r0 = r14.f324620g
            h82.c<IN, OUT> r0 = r0.f324612d
            r14.f324619f = r15
            r14.f324617d = r15
            r14.f324618e = r3
            java.lang.Object r0 = r0.mo158580a(r14)
            if (r0 != r2) goto L_0x00e3
            return r2
        L_0x00e3:
            i82.g<h82.a, h82.b> r0 = r14.f324620g
            r0.close()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x00eb:
            r7 = r13
            r8 = r14
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: i82.C108411h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
