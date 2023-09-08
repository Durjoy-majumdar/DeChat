package p267x;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", mo125469f = "MutatorMutex.kt", mo125470l = {173, 160}, mo125471m = "invokeSuspend")
/* renamed from: x.w1 */
public final class C66230w1 extends C91594j implements C32227p<C0000n0, C15601d<Object>, Object> {

    /* renamed from: d */
    public Object f190277d;

    /* renamed from: e */
    public Object f190278e;

    /* renamed from: f */
    public Object f190279f;

    /* renamed from: g */
    public Object f190280g;

    /* renamed from: h */
    public int f190281h;

    /* renamed from: i */
    public /* synthetic */ Object f190282i;

    /* renamed from: j */
    public final /* synthetic */ C38426u1 f190283j;

    /* renamed from: n */
    public final /* synthetic */ C66228v1 f190284n;

    /* renamed from: o */
    public final /* synthetic */ C32227p<Object, C15601d<Object>, Object> f190285o;

    /* renamed from: p */
    public final /* synthetic */ Object f190286p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66230w1(C38426u1 u1Var, C66228v1 v1Var, C32227p<Object, ? super C15601d<Object>, ? extends Object> pVar, Object obj, C15601d<? super C66230w1> dVar) {
        super(2, dVar);
        this.f190283j = u1Var;
        this.f190284n = v1Var;
        this.f190285o = pVar;
        this.f190286p = obj;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C66230w1 w1Var = new C66230w1(this.f190283j, this.f190284n, this.f190285o, this.f190286p, dVar);
        w1Var.f190282i = obj;
        return w1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66230w1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df A[Catch:{ all -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00de A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00d6=Splitter:B:39:0x00d6, B:50:0x00ee=Splitter:B:50:0x00ee} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f190281h
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r10.f190278e
            x.v1 r0 = (p267x.C66228v1) r0
            java.lang.Object r1 = r10.f190277d
            k14.c r1 = (k14.C99088c) r1
            java.lang.Object r2 = r10.f190282i
            x.v1$a r2 = (p267x.C66228v1.C66229a) r2
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x001e }
            goto L_0x00d6
        L_0x001e:
            r11 = move-exception
            goto L_0x00ee
        L_0x0021:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0029:
            java.lang.Object r1 = r10.f190280g
            x.v1 r1 = (p267x.C66228v1) r1
            java.lang.Object r3 = r10.f190279f
            java.lang.Object r5 = r10.f190278e
            fy3.p r5 = (fy3.C32227p) r5
            java.lang.Object r6 = r10.f190277d
            k14.c r6 = (k14.C99088c) r6
            java.lang.Object r7 = r10.f190282i
            x.v1$a r7 = (p267x.C66228v1.C66229a) r7
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r1
            r1 = r6
            goto L_0x00c0
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f190282i
            a14.n0 r11 = (a14.C0000n0) r11
            x.v1$a r1 = new x.v1$a
            x.u1 r5 = r10.f190283j
            wx3.f r11 = r11.getCoroutineContext()
            int r6 = a14.C53973z1.f151221b0
            a14.z1$b r6 = a14.C53973z1.C0004b.f3d
            wx3.f$b r11 = r11.get(r6)
            gy3.C87412m.m108591d(r11)
            a14.z1 r11 = (a14.C53973z1) r11
            r1.<init>(r5, r11)
            x.v1 r11 = r10.f190284n
        L_0x0063:
            java.util.concurrent.atomic.AtomicReference<x.v1$a> r5 = r11.f190273a
            java.lang.Object r5 = r5.get()
            x.v1$a r5 = (p267x.C66228v1.C66229a) r5
            r6 = 0
            if (r5 == 0) goto L_0x0086
            x.u1 r7 = r1.f190275a
            x.u1 r8 = r5.f190275a
            int r7 = r7.compareTo(r8)
            if (r7 < 0) goto L_0x007a
            r7 = 1
            goto L_0x007b
        L_0x007a:
            r7 = 0
        L_0x007b:
            if (r7 == 0) goto L_0x007e
            goto L_0x0086
        L_0x007e:
            java.util.concurrent.CancellationException r11 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Current mutation had a higher priority"
            r11.<init>(r0)
            throw r11
        L_0x0086:
            java.util.concurrent.atomic.AtomicReference<x.v1$a> r7 = r11.f190273a
        L_0x0088:
            boolean r8 = r7.compareAndSet(r5, r1)
            if (r8 == 0) goto L_0x0090
            r6 = 1
            goto L_0x0096
        L_0x0090:
            java.lang.Object r8 = r7.get()
            if (r8 == r5) goto L_0x0088
        L_0x0096:
            if (r6 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x009f
            a14.z1 r11 = r5.f190276b
            a14.C53973z1.C53974a.m60623a(r11, r4, r3, r4)
        L_0x009f:
            x.v1 r11 = r10.f190284n
            k14.c r5 = r11.f190274b
            fy3.p<java.lang.Object, wx3.d<java.lang.Object>, java.lang.Object> r6 = r10.f190285o
            java.lang.Object r7 = r10.f190286p
            r10.f190282i = r1
            r10.f190277d = r5
            r10.f190278e = r6
            r10.f190279f = r7
            r10.f190280g = r11
            r10.f190281h = r3
            k14.d r5 = (k14.C60942d) r5
            java.lang.Object r3 = r5.mo85908b(r4, r10)
            if (r3 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            r3 = r7
            r7 = r1
            r1 = r5
            r5 = r6
        L_0x00c0:
            r10.f190282i = r7     // Catch:{ all -> 0x00e9 }
            r10.f190277d = r1     // Catch:{ all -> 0x00e9 }
            r10.f190278e = r11     // Catch:{ all -> 0x00e9 }
            r10.f190279f = r4     // Catch:{ all -> 0x00e9 }
            r10.f190280g = r4     // Catch:{ all -> 0x00e9 }
            r10.f190281h = r2     // Catch:{ all -> 0x00e9 }
            java.lang.Object r2 = r5.invoke(r3, r10)     // Catch:{ all -> 0x00e9 }
            if (r2 != r0) goto L_0x00d3
            return r0
        L_0x00d3:
            r0 = r11
            r11 = r2
            r2 = r7
        L_0x00d6:
            java.util.concurrent.atomic.AtomicReference<x.v1$a> r0 = r0.f190273a     // Catch:{ all -> 0x00fe }
        L_0x00d8:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00fe }
            if (r3 == 0) goto L_0x00df
            goto L_0x00e5
        L_0x00df:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00fe }
            if (r3 == r2) goto L_0x00d8
        L_0x00e5:
            r1.mo85909c(r4)
            return r11
        L_0x00e9:
            r0 = move-exception
            r2 = r7
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00ee:
            java.util.concurrent.atomic.AtomicReference<x.v1$a> r0 = r0.f190273a     // Catch:{ all -> 0x00fe }
        L_0x00f0:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00fe }
            if (r3 != 0) goto L_0x00fd
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00fe }
            if (r3 != r2) goto L_0x00fd
            goto L_0x00f0
        L_0x00fd:
            throw r11     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r11 = move-exception
            r1.mo85909c(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p267x.C66230w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
