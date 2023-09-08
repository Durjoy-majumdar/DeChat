package c14;

import a14.C53916l;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: c14.t */
public final class C54643t {

    @C91590f(mo125468c = "kotlinx.coroutines.channels.ProduceKt", mo125469f = "Produce.kt", mo125470l = {153}, mo125471m = "awaitClose")
    /* renamed from: c14.t$a */
    public static final class C54644a extends C66704d {

        /* renamed from: d */
        public Object f153168d;

        /* renamed from: e */
        public Object f153169e;

        /* renamed from: f */
        public /* synthetic */ Object f153170f;

        /* renamed from: g */
        public int f153171g;

        public C54644a(C15601d<? super C54644a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f153170f = obj;
            this.f153171g |= Integer.MIN_VALUE;
            return C54643t.m61515a((C54647v<?>) null, (C32224a<C13598b0>) null, this);
        }
    }

    /* renamed from: c14.t$b */
    public static final class C54645b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C53916l<C13598b0> f153172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54645b(C53916l<? super C13598b0> lVar) {
            super(1);
            this.f153172d = lVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C53916l<C13598b0> lVar = this.f153172d;
            Result.Companion companion = Result.Companion;
            C13598b0 b0Var = C13598b0.f38549a;
            lVar.resumeWith(Result.m168114constructorimpl(b0Var));
            return b0Var;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: fy3.a<rx3.b0>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m61515a(c14.C54647v<?> r4, fy3.C32224a<rx3.C13598b0> r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            boolean r0 = r6 instanceof c14.C54643t.C54644a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            c14.t$a r0 = (c14.C54643t.C54644a) r0
            int r1 = r0.f153171g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f153171g = r1
            goto L_0x0018
        L_0x0013:
            c14.t$a r0 = new c14.t$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f153170f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f153171g
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.f153169e
            r5 = r4
            fy3.a r5 = (fy3.C32224a) r5
            java.lang.Object r4 = r0.f153168d
            c14.v r4 = (c14.C54647v) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x0030 }
            goto L_0x0071
        L_0x0030:
            r4 = move-exception
            goto L_0x0077
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            wx3.f r6 = r0.getContext()
            int r2 = a14.C53973z1.f151221b0
            a14.z1$b r2 = a14.C53973z1.C0004b.f3d
            wx3.f$b r6 = r6.get(r2)
            if (r6 != r4) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x007b
            r0.f153168d = r4     // Catch:{ all -> 0x0030 }
            r0.f153169e = r5     // Catch:{ all -> 0x0030 }
            r0.f153171g = r3     // Catch:{ all -> 0x0030 }
            a14.m r6 = new a14.m     // Catch:{ all -> 0x0030 }
            wx3.d r0 = xx3.C66447b.m78392b(r0)     // Catch:{ all -> 0x0030 }
            r6.<init>(r0, r3)     // Catch:{ all -> 0x0030 }
            r6.mo74609p()     // Catch:{ all -> 0x0030 }
            c14.t$b r0 = new c14.t$b     // Catch:{ all -> 0x0030 }
            r0.<init>(r6)     // Catch:{ all -> 0x0030 }
            r4.mo75538p(r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r6.mo74608o()     // Catch:{ all -> 0x0030 }
            if (r4 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r5.invoke()
            rx3.b0 r4 = rx3.C13598b0.f38549a
            return r4
        L_0x0077:
            r5.invoke()
            throw r4
        L_0x007b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c14.C54643t.m61515a(c14.v, fy3.a, wx3.d):java.lang.Object");
    }
}
