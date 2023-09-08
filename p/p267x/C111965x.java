package p267x;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import kotlin.ResultKt;
import p1165z.C112527l;
import p1165z.C112530o;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p759y.C112255l0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", mo125469f = "Clickable.kt", mo125470l = {412, 414, 421, 422, 431}, mo125471m = "invokeSuspend")
/* renamed from: x.x */
public final class C111965x extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public boolean f335195d;

    /* renamed from: e */
    public int f335196e;

    /* renamed from: f */
    public /* synthetic */ Object f335197f;

    /* renamed from: g */
    public final /* synthetic */ C112255l0 f335198g;

    /* renamed from: h */
    public final /* synthetic */ long f335199h;

    /* renamed from: i */
    public final /* synthetic */ C112527l f335200i;

    /* renamed from: j */
    public final /* synthetic */ C60690y0<C112530o> f335201j;

    /* renamed from: n */
    public final /* synthetic */ C60667k2<C32224a<Boolean>> f335202n;

    @C91590f(mo125468c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", mo125469f = "Clickable.kt", mo125470l = {406, 409}, mo125471m = "invokeSuspend")
    /* renamed from: x.x$a */
    public static final class C111966a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f335203d;

        /* renamed from: e */
        public int f335204e;

        /* renamed from: f */
        public final /* synthetic */ C60667k2<C32224a<Boolean>> f335205f;

        /* renamed from: g */
        public final /* synthetic */ long f335206g;

        /* renamed from: h */
        public final /* synthetic */ C112527l f335207h;

        /* renamed from: i */
        public final /* synthetic */ C60690y0<C112530o> f335208i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111966a(C60667k2<? extends C32224a<Boolean>> k2Var, long j, C112527l lVar, C60690y0<C112530o> y0Var, C15601d<? super C111966a> dVar) {
            super(2, dVar);
            this.f335205f = k2Var;
            this.f335206g = j;
            this.f335207h = lVar;
            this.f335208i = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111966a(this.f335205f, this.f335206g, this.f335207h, this.f335208i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111966a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C112530o oVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335204e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((Boolean) this.f335205f.getValue().invoke()).booleanValue()) {
                    long j = C111972z.f335218a;
                    this.f335204e = 1;
                    if (C53965x0.m60607b(j, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                oVar = (C112530o) this.f335203d;
                ResultKt.throwOnFailure(obj);
                this.f335208i.setValue(oVar);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C112530o oVar2 = new C112530o(this.f335206g, (C8480h) null);
            C112527l lVar = this.f335207h;
            this.f335203d = oVar2;
            this.f335204e = 2;
            if (lVar.mo164252a(oVar2, this) == aVar) {
                return aVar;
            }
            oVar = oVar2;
            this.f335208i.setValue(oVar);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111965x(C112255l0 l0Var, long j, C112527l lVar, C60690y0<C112530o> y0Var, C60667k2<? extends C32224a<Boolean>> k2Var, C15601d<? super C111965x> dVar) {
        super(2, dVar);
        this.f335198g = l0Var;
        this.f335199h = j;
        this.f335200i = lVar;
        this.f335201j = y0Var;
        this.f335202n = k2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C111965x xVar = new C111965x(this.f335198g, this.f335199h, this.f335200i, this.f335201j, this.f335202n, dVar);
        xVar.f335197f = obj;
        return xVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111965x) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f335196e
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 == r7) goto L_0x0035
            if (r2 == r6) goto L_0x002f
            if (r2 == r5) goto L_0x0026
            if (r2 == r4) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x00d8
        L_0x0026:
            java.lang.Object r2 = r0.f335197f
            z.p r2 = (p1165z.C112531p) r2
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x00a6
        L_0x002f:
            boolean r2 = r0.f335195d
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x008a
        L_0x0035:
            java.lang.Object r2 = r0.f335197f
            a14.z1 r2 = (a14.C53973z1) r2
            kotlin.ResultKt.throwOnFailure(r20)
            r3 = r20
            goto L_0x0070
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r2 = r0.f335197f
            r9 = r2
            a14.n0 r9 = (a14.C0000n0) r9
            r10 = 0
            r11 = 0
            x.x$a r2 = new x.x$a
            j0.k2<fy3.a<java.lang.Boolean>> r13 = r0.f335202n
            long r14 = r0.f335199h
            z.l r12 = r0.f335200i
            j0.y0<z.o> r3 = r0.f335201j
            r18 = 0
            r16 = r12
            r12 = r2
            r17 = r3
            r12.<init>(r13, r14, r16, r17, r18)
            r13 = 3
            r14 = 0
            a14.z1 r2 = a14.C53895h.m60466d(r9, r10, r11, r12, r13, r14)
            y.l0 r3 = r0.f335198g
            r0.f335197f = r2
            r0.f335196e = r7
            java.lang.Object r3 = r3.mo164036o(r0)
            if (r3 != r1) goto L_0x0070
            return r1
        L_0x0070:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r7 = r2.mo74466a()
            if (r7 == 0) goto L_0x00b3
            r0.f335197f = r8
            r0.f335195d = r3
            r0.f335196e = r6
            java.lang.Object r2 = a14.C53873d2.m60391c(r2, r0)
            if (r2 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r2 = r3
        L_0x008a:
            if (r2 == 0) goto L_0x00d8
            z.o r2 = new z.o
            long r6 = r0.f335199h
            r2.<init>(r6, r8)
            z.p r3 = new z.p
            r3.<init>(r2)
            z.l r6 = r0.f335200i
            r0.f335197f = r3
            r0.f335196e = r5
            java.lang.Object r2 = r6.mo164252a(r2, r0)
            if (r2 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            r2 = r3
        L_0x00a6:
            z.l r3 = r0.f335200i
            r0.f335197f = r8
            r0.f335196e = r4
            java.lang.Object r2 = r3.mo164252a(r2, r0)
            if (r2 != r1) goto L_0x00d8
            return r1
        L_0x00b3:
            j0.y0<z.o> r2 = r0.f335201j
            java.lang.Object r2 = r2.getValue()
            z.o r2 = (p1165z.C112530o) r2
            if (r2 == 0) goto L_0x00d8
            z.l r4 = r0.f335200i
            if (r3 == 0) goto L_0x00c7
            z.p r3 = new z.p
            r3.<init>(r2)
            goto L_0x00cc
        L_0x00c7:
            z.n r3 = new z.n
            r3.<init>(r2)
        L_0x00cc:
            r0.f335197f = r8
            r2 = 5
            r0.f335196e = r2
            java.lang.Object r2 = r4.mo164252a(r3, r0)
            if (r2 != r1) goto L_0x00d8
            return r1
        L_0x00d8:
            j0.y0<z.o> r1 = r0.f335201j
            r1.setValue(r8)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p267x.C111965x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
