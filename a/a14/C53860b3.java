package a14;

import fy3.C32227p;
import gy3.C24564k0;
import gy3.C8480h;
import wx3.C15601d;
import wx3.C66210e;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: a14.b3 */
public final class C53860b3 {

    @C91590f(mo125468c = "kotlinx.coroutines.TimeoutKt", mo125469f = "Timeout.kt", mo125470l = {100}, mo125471m = "withTimeoutOrNull")
    /* renamed from: a14.b3$a */
    public static final class C53861a<T> extends C66704d {

        /* renamed from: d */
        public Object f151099d;

        /* renamed from: e */
        public Object f151100e;

        /* renamed from: f */
        public /* synthetic */ Object f151101f;

        /* renamed from: g */
        public int f151102g;

        public C53861a(C15601d<? super C53861a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f151101f = obj;
            this.f151102g |= Integer.MIN_VALUE;
            return C53860b3.m60375c(0, (C32227p) null, this);
        }
    }

    /* renamed from: a */
    public static final <U, T extends U> Object m60373a(C53855a3<U, ? super T> a3Var, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object k0;
        C66212f.C66215b bVar = a3Var.f168560f.getContext().get(C66210e.C66211a.f190251d);
        C53960w0 w0Var = bVar instanceof C53960w0 ? (C53960w0) bVar : null;
        if (w0Var == null) {
            w0Var = C53949t0.f151198a;
        }
        a3Var.mo74515E(new C53898h1(w0Var.mo74579Q(a3Var.f151097g, a3Var, a3Var.f151094e)));
        boolean z = false;
        try {
            C24564k0.m30741e(pVar, 2);
            obj = pVar.invoke(a3Var, a3Var);
        } catch (Throwable th) {
            obj = new C53969y(th, false, 2, (C8480h) null);
        }
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (obj == aVar || (k0 = a3Var.mo74538k0(obj)) == C53899h2.f151146b) {
            return aVar;
        }
        if (k0 instanceof C53969y) {
            Throwable th4 = ((C53969y) k0).f151214a;
            if (!(th4 instanceof C53975z2) || ((C53975z2) th4).f151222d != a3Var) {
                z = true;
            }
            if (z) {
                throw th4;
            } else if (obj instanceof C53969y) {
                throw ((C53969y) obj).f151214a;
            }
        } else {
            obj = C53899h2.m60476a(k0);
        }
        return obj;
    }

    /* renamed from: b */
    public static final <T> Object m60374b(long j, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar) {
        if (j > 0) {
            return m60373a(new C53855a3(j, dVar), pVar);
        }
        throw new C53975z2("Timed out immediately", (C53973z1) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m60375c(long r7, fy3.C32227p<? super a14.C0000n0, ? super wx3.C15601d<? super T>, ? extends java.lang.Object> r9, wx3.C15601d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof a14.C53860b3.C53861a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            a14.b3$a r0 = (a14.C53860b3.C53861a) r0
            int r1 = r0.f151102g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f151102g = r1
            goto L_0x0018
        L_0x0013:
            a14.b3$a r0 = new a14.b3$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f151101f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f151102g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r7 = r0.f151100e
            gy3.f0 r7 = (gy3.C8479f0) r7
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ z2 -> 0x002c }
            goto L_0x0059
        L_0x002c:
            r8 = move-exception
            goto L_0x005d
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0040
            return r3
        L_0x0040:
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            r0.f151099d = r9     // Catch:{ z2 -> 0x005a }
            r0.f151100e = r10     // Catch:{ z2 -> 0x005a }
            r0.f151102g = r4     // Catch:{ z2 -> 0x005a }
            a14.a3 r2 = new a14.a3     // Catch:{ z2 -> 0x005a }
            r2.<init>(r7, r0)     // Catch:{ z2 -> 0x005a }
            r10.f27484d = r2     // Catch:{ z2 -> 0x005a }
            java.lang.Object r10 = m60373a(r2, r9)     // Catch:{ z2 -> 0x005a }
            if (r10 != r1) goto L_0x0059
            return r1
        L_0x0059:
            return r10
        L_0x005a:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L_0x005d:
            a14.z1 r9 = r8.f151222d
            T r7 = r7.f27484d
            if (r9 != r7) goto L_0x0064
            return r3
        L_0x0064:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53860b3.m60375c(long, fy3.p, wx3.d):java.lang.Object");
    }
}
