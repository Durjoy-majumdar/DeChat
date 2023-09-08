package p257w;

import a14.C0000n0;
import fy3.C32226l;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.animation.core.MutatorMutex$mutate$2", mo125469f = "InternalMutatorMutex.kt", mo125470l = {171, 119}, mo125471m = "invokeSuspend")
/* renamed from: w.p0 */
public final class C65923p0 extends C91594j implements C32227p<C0000n0, C15601d<Object>, Object> {

    /* renamed from: d */
    public Object f189515d;

    /* renamed from: e */
    public Object f189516e;

    /* renamed from: f */
    public Object f189517f;

    /* renamed from: g */
    public int f189518g;

    /* renamed from: h */
    public /* synthetic */ Object f189519h;

    /* renamed from: i */
    public final /* synthetic */ C37917n0 f189520i;

    /* renamed from: j */
    public final /* synthetic */ C65921o0 f189521j;

    /* renamed from: n */
    public final /* synthetic */ C32226l<C15601d<Object>, Object> f189522n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65923p0(C37917n0 n0Var, C65921o0 o0Var, C32226l<? super C15601d<Object>, ? extends Object> lVar, C15601d<? super C65923p0> dVar) {
        super(2, dVar);
        this.f189520i = n0Var;
        this.f189521j = o0Var;
        this.f189522n = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C65923p0 p0Var = new C65923p0(this.f189520i, this.f189521j, this.f189522n, dVar);
        p0Var.f189519h = obj;
        return p0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65923p0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5 A[Catch:{ all -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x00e4=Splitter:B:51:0x00e4, B:40:0x00cc=Splitter:B:40:0x00cc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f189518g
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x003f
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r10.f189516e
            w.o0 r0 = (p257w.C65921o0) r0
            java.lang.Object r1 = r10.f189515d
            k14.c r1 = (k14.C99088c) r1
            java.lang.Object r2 = r10.f189519h
            w.o0$a r2 = (p257w.C65921o0.C65922a) r2
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x001e }
            goto L_0x00cc
        L_0x001e:
            r11 = move-exception
            goto L_0x00e4
        L_0x0021:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0029:
            java.lang.Object r1 = r10.f189517f
            w.o0 r1 = (p257w.C65921o0) r1
            java.lang.Object r3 = r10.f189516e
            fy3.l r3 = (fy3.C32226l) r3
            java.lang.Object r5 = r10.f189515d
            k14.c r5 = (k14.C99088c) r5
            java.lang.Object r6 = r10.f189519h
            w.o0$a r6 = (p257w.C65921o0.C65922a) r6
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r1
            goto L_0x00b7
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f189519h
            a14.n0 r11 = (a14.C0000n0) r11
            w.o0$a r1 = new w.o0$a
            w.n0 r5 = r10.f189520i
            wx3.f r11 = r11.getCoroutineContext()
            int r6 = a14.C53973z1.f151221b0
            a14.z1$b r6 = a14.C53973z1.C0004b.f3d
            wx3.f$b r11 = r11.get(r6)
            gy3.C87412m.m108591d(r11)
            a14.z1 r11 = (a14.C53973z1) r11
            r1.<init>(r5, r11)
            w.o0 r11 = r10.f189521j
        L_0x0060:
            java.util.concurrent.atomic.AtomicReference<w.o0$a> r5 = r11.f189511a
            java.lang.Object r5 = r5.get()
            w.o0$a r5 = (p257w.C65921o0.C65922a) r5
            r6 = 0
            if (r5 == 0) goto L_0x0083
            w.n0 r7 = r1.f189513a
            w.n0 r8 = r5.f189513a
            int r7 = r7.compareTo(r8)
            if (r7 < 0) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            if (r7 == 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.util.concurrent.CancellationException r11 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Current mutation had a higher priority"
            r11.<init>(r0)
            throw r11
        L_0x0083:
            java.util.concurrent.atomic.AtomicReference<w.o0$a> r7 = r11.f189511a
        L_0x0085:
            boolean r8 = r7.compareAndSet(r5, r1)
            if (r8 == 0) goto L_0x008d
            r6 = 1
            goto L_0x0093
        L_0x008d:
            java.lang.Object r8 = r7.get()
            if (r8 == r5) goto L_0x0085
        L_0x0093:
            if (r6 == 0) goto L_0x0060
            if (r5 == 0) goto L_0x009c
            a14.z1 r11 = r5.f189514b
            a14.C53973z1.C53974a.m60623a(r11, r4, r3, r4)
        L_0x009c:
            w.o0 r11 = r10.f189521j
            k14.c r5 = r11.f189512b
            fy3.l<wx3.d<java.lang.Object>, java.lang.Object> r6 = r10.f189522n
            r10.f189519h = r1
            r10.f189515d = r5
            r10.f189516e = r6
            r10.f189517f = r11
            r10.f189518g = r3
            k14.d r5 = (k14.C60942d) r5
            java.lang.Object r3 = r5.mo85908b(r4, r10)
            if (r3 != r0) goto L_0x00b5
            return r0
        L_0x00b5:
            r3 = r6
            r6 = r1
        L_0x00b7:
            r1 = r5
            r10.f189519h = r6     // Catch:{ all -> 0x00df }
            r10.f189515d = r1     // Catch:{ all -> 0x00df }
            r10.f189516e = r11     // Catch:{ all -> 0x00df }
            r10.f189517f = r4     // Catch:{ all -> 0x00df }
            r10.f189518g = r2     // Catch:{ all -> 0x00df }
            java.lang.Object r2 = r3.invoke(r10)     // Catch:{ all -> 0x00df }
            if (r2 != r0) goto L_0x00c9
            return r0
        L_0x00c9:
            r0 = r11
            r11 = r2
            r2 = r6
        L_0x00cc:
            java.util.concurrent.atomic.AtomicReference<w.o0$a> r0 = r0.f189511a     // Catch:{ all -> 0x00f4 }
        L_0x00ce:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x00d5
            goto L_0x00db
        L_0x00d5:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00f4 }
            if (r3 == r2) goto L_0x00ce
        L_0x00db:
            r1.mo85909c(r4)
            return r11
        L_0x00df:
            r0 = move-exception
            r2 = r6
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00e4:
            java.util.concurrent.atomic.AtomicReference<w.o0$a> r0 = r0.f189511a     // Catch:{ all -> 0x00f4 }
        L_0x00e6:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00f4 }
            if (r3 != 0) goto L_0x00f3
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00f4 }
            if (r3 != r2) goto L_0x00f3
            goto L_0x00e6
        L_0x00f3:
            throw r11     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r11 = move-exception
            r1.mo85909c(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C65923p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
