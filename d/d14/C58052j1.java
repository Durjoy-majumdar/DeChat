package d14;

import c14.C54624g;
import e14.C58474b;
import e14.C58479d;
import e14.C58490l;
import e14.C58506s;
import e14.C58509v;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.j1 */
public final class C58052j1<T> extends C58474b<C58060l1> implements C58087u0<T>, C45252f, C58506s<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: h */
    public int f166041h;

    @C91590f(mo125468c = "kotlinx.coroutines.flow.StateFlowImpl", mo125469f = "StateFlow.kt", mo125470l = {386, 398, 403}, mo125471m = "collect")
    /* renamed from: d14.j1$a */
    public static final class C58053a extends C66704d {

        /* renamed from: d */
        public Object f166042d;

        /* renamed from: e */
        public Object f166043e;

        /* renamed from: f */
        public Object f166044f;

        /* renamed from: g */
        public Object f166045g;

        /* renamed from: h */
        public Object f166046h;

        /* renamed from: i */
        public /* synthetic */ Object f166047i;

        /* renamed from: j */
        public final /* synthetic */ C58052j1<T> f166048j;

        /* renamed from: n */
        public int f166049n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58053a(C58052j1<T> j1Var, C15601d<? super C58053a> dVar) {
            super(dVar);
            this.f166048j = j1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166047i = obj;
            this.f166049n |= Integer.MIN_VALUE;
            return this.f166048j.mo31880a((C45253g) null, this);
        }
    }

    public C58052j1(Object obj) {
        this._state = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: d14.l1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: d14.j1} */
    /* JADX WARNING: type inference failed for: r13v11, types: [wx3.f$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c2 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d5 A[Catch:{ all -> 0x0071 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ee A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31880a(d14.C45253g<? super T> r12, wx3.C15601d<?> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof d14.C58052j1.C58053a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            d14.j1$a r0 = (d14.C58052j1.C58053a) r0
            int r1 = r0.f166049n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166049n = r1
            goto L_0x0018
        L_0x0013:
            d14.j1$a r0 = new d14.j1$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f166047i
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166049n
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L_0x0074
            if (r2 == r3) goto L_0x005f
            if (r2 == r4) goto L_0x0048
            if (r2 != r5) goto L_0x0040
            java.lang.Object r12 = r0.f166046h
            java.lang.Object r2 = r0.f166045g
            a14.z1 r2 = (a14.C53973z1) r2
            java.lang.Object r7 = r0.f166044f
            d14.l1 r7 = (d14.C58060l1) r7
            java.lang.Object r8 = r0.f166043e
            d14.g r8 = (d14.C45253g) r8
            java.lang.Object r9 = r0.f166042d
            d14.j1 r9 = (d14.C58052j1) r9
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0071 }
            goto L_0x00a4
        L_0x0040:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0048:
            java.lang.Object r12 = r0.f166046h
            java.lang.Object r2 = r0.f166045g
            a14.z1 r2 = (a14.C53973z1) r2
            java.lang.Object r7 = r0.f166044f
            d14.l1 r7 = (d14.C58060l1) r7
            java.lang.Object r8 = r0.f166043e
            d14.g r8 = (d14.C45253g) r8
            java.lang.Object r9 = r0.f166042d
            d14.j1 r9 = (d14.C58052j1) r9
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0071 }
            goto L_0x00d7
        L_0x005f:
            java.lang.Object r12 = r0.f166044f
            r7 = r12
            d14.l1 r7 = (d14.C58060l1) r7
            java.lang.Object r12 = r0.f166043e
            d14.g r12 = (d14.C45253g) r12
            java.lang.Object r2 = r0.f166042d
            r9 = r2
            d14.j1 r9 = (d14.C58052j1) r9
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0071 }
            goto L_0x0095
        L_0x0071:
            r12 = move-exception
            goto L_0x0101
        L_0x0074:
            kotlin.ResultKt.throwOnFailure(r13)
            e14.d r13 = r11.mo83425f()
            d14.l1 r13 = (d14.C58060l1) r13
            boolean r2 = r12 instanceof d14.C58066m1     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x0093
            r2 = r12
            d14.m1 r2 = (d14.C58066m1) r2     // Catch:{ all -> 0x0103 }
            r0.f166042d = r11     // Catch:{ all -> 0x0103 }
            r0.f166043e = r12     // Catch:{ all -> 0x0103 }
            r0.f166044f = r13     // Catch:{ all -> 0x0103 }
            r0.f166049n = r3     // Catch:{ all -> 0x0103 }
            java.lang.Object r2 = r2.mo82838a(r0)     // Catch:{ all -> 0x0103 }
            if (r2 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r9 = r11
            r7 = r13
        L_0x0095:
            wx3.f r13 = r0.getContext()     // Catch:{ all -> 0x0071 }
            a14.z1$b r2 = a14.C53973z1.C0004b.f3d     // Catch:{ all -> 0x0071 }
            wx3.f$b r13 = r13.get(r2)     // Catch:{ all -> 0x0071 }
            r2 = r13
            a14.z1 r2 = (a14.C53973z1) r2     // Catch:{ all -> 0x0071 }
            r8 = r12
            r12 = r6
        L_0x00a4:
            java.lang.Object r13 = r9._state     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x00b4
            boolean r10 = r2.mo74466a()     // Catch:{ all -> 0x0071 }
            if (r10 == 0) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            java.util.concurrent.CancellationException r12 = r2.mo74526Z()     // Catch:{ all -> 0x0071 }
            throw r12     // Catch:{ all -> 0x0071 }
        L_0x00b4:
            if (r12 == 0) goto L_0x00bc
            boolean r10 = gy3.C87412m.m108589b(r12, r13)     // Catch:{ all -> 0x0071 }
            if (r10 != 0) goto L_0x00d7
        L_0x00bc:
            f14.c0 r12 = e14.C58509v.f167541a     // Catch:{ all -> 0x0071 }
            if (r13 != r12) goto L_0x00c2
            r12 = r6
            goto L_0x00c3
        L_0x00c2:
            r12 = r13
        L_0x00c3:
            r0.f166042d = r9     // Catch:{ all -> 0x0071 }
            r0.f166043e = r8     // Catch:{ all -> 0x0071 }
            r0.f166044f = r7     // Catch:{ all -> 0x0071 }
            r0.f166045g = r2     // Catch:{ all -> 0x0071 }
            r0.f166046h = r13     // Catch:{ all -> 0x0071 }
            r0.f166049n = r4     // Catch:{ all -> 0x0071 }
            java.lang.Object r12 = r8.emit(r12, r0)     // Catch:{ all -> 0x0071 }
            if (r12 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r12 = r13
        L_0x00d7:
            r7.getClass()     // Catch:{ all -> 0x0071 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = d14.C58060l1.f166065a     // Catch:{ all -> 0x0071 }
            f14.c0 r10 = d14.C58056k1.f166052a     // Catch:{ all -> 0x0071 }
            java.lang.Object r13 = r13.getAndSet(r7, r10)     // Catch:{ all -> 0x0071 }
            gy3.C87412m.m108591d(r13)     // Catch:{ all -> 0x0071 }
            f14.c0 r10 = d14.C58056k1.f166053b     // Catch:{ all -> 0x0071 }
            if (r13 != r10) goto L_0x00eb
            r13 = 1
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            if (r13 != 0) goto L_0x00a4
            r0.f166042d = r9     // Catch:{ all -> 0x0071 }
            r0.f166043e = r8     // Catch:{ all -> 0x0071 }
            r0.f166044f = r7     // Catch:{ all -> 0x0071 }
            r0.f166045g = r2     // Catch:{ all -> 0x0071 }
            r0.f166046h = r12     // Catch:{ all -> 0x0071 }
            r0.f166049n = r5     // Catch:{ all -> 0x0071 }
            java.lang.Object r13 = r7.mo82837c(r0)     // Catch:{ all -> 0x0071 }
            if (r13 != r1) goto L_0x00a4
            return r1
        L_0x0101:
            r13 = r7
            goto L_0x0105
        L_0x0103:
            r12 = move-exception
            r9 = r11
        L_0x0105:
            r9.mo83426i(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58052j1.mo31880a(d14.g, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public void mo82830b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* renamed from: c */
    public C45252f<T> mo82831c(C66212f fVar, int i, C54624g gVar) {
        return ((((i >= 0 && i < 2) || i == -2) && gVar == C54624g.DROP_OLDEST) || ((i == 0 || i == -3) && gVar == C54624g.SUSPEND)) ? this : new C58490l(this, fVar, i, gVar);
    }

    /* renamed from: d */
    public boolean mo82832d(T t) {
        setValue(t);
        return true;
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        setValue(t);
        return C13598b0.f38549a;
    }

    /* renamed from: g */
    public C58479d mo82833g() {
        return new C58060l1();
    }

    public T getValue() {
        T t = C58509v.f167541a;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    /* renamed from: h */
    public C58479d[] mo82834h(int i) {
        return new C58060l1[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r12 = (d14.C58060l1[]) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        if (r12 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        r2 = r12.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        if (r3 >= r2) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        r4 = r12[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        if (r4 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r5 = r4._state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        r6 = d14.C58056k1.f166053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        if (r5 != r6) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
        r7 = d14.C58056k1.f166052a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003f, code lost:
        if (r5 != r7) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        r8 = d14.C58060l1.f166065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        if (r8.compareAndSet(r4, r5, r6) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0049, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004f, code lost:
        if (r8.get(r4) == r5) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0052, code lost:
        if (r5 == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0055, code lost:
        r6 = d14.C58060l1.f166065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005b, code lost:
        if (r6.compareAndSet(r4, r5, r7) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005d, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0063, code lost:
        if (r6.get(r4) == r5) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0065, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0066, code lost:
        if (r6 == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0068, code lost:
        r4 = kotlin.Result.Companion;
        ((a14.C53921m) r5).resumeWith(kotlin.Result.m168114constructorimpl(rx3.C13598b0.f38549a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0075, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0078, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r12 = r10.f166041h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007b, code lost:
        if (r12 != r11) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007d, code lost:
        r10.f166041h = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0080, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0081, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r11 = r10.f167455d;
        r2 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0086, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0087, code lost:
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82835j(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.Object r0 = r10._state     // Catch:{ all -> 0x0094 }
            r1 = 0
            if (r11 == 0) goto L_0x000e
            boolean r11 = gy3.C87412m.m108589b(r0, r11)     // Catch:{ all -> 0x0094 }
            if (r11 != 0) goto L_0x000e
            monitor-exit(r10)
            return r1
        L_0x000e:
            boolean r11 = gy3.C87412m.m108589b(r0, r12)     // Catch:{ all -> 0x0094 }
            r0 = 1
            if (r11 == 0) goto L_0x0017
            monitor-exit(r10)
            return r0
        L_0x0017:
            r10._state = r12     // Catch:{ all -> 0x0094 }
            int r11 = r10.f166041h     // Catch:{ all -> 0x0094 }
            r12 = r11 & 1
            if (r12 != 0) goto L_0x008e
            int r11 = r11 + r0
            r10.f166041h = r11     // Catch:{ all -> 0x0094 }
            S[] r12 = r10.f167455d     // Catch:{ all -> 0x0094 }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0094 }
            monitor-exit(r10)
        L_0x0027:
            d14.l1[] r12 = (d14.C58060l1[]) r12
            if (r12 == 0) goto L_0x0078
            int r2 = r12.length
            r3 = 0
        L_0x002d:
            if (r3 >= r2) goto L_0x0078
            r4 = r12[r3]
            if (r4 == 0) goto L_0x0075
        L_0x0033:
            java.lang.Object r5 = r4._state
            if (r5 != 0) goto L_0x0038
            goto L_0x0075
        L_0x0038:
            f14.c0 r6 = d14.C58056k1.f166053b
            if (r5 != r6) goto L_0x003d
            goto L_0x0075
        L_0x003d:
            f14.c0 r7 = d14.C58056k1.f166052a
            if (r5 != r7) goto L_0x0055
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = d14.C58060l1.f166065a
        L_0x0043:
            boolean r7 = r8.compareAndSet(r4, r5, r6)
            if (r7 == 0) goto L_0x004b
            r5 = 1
            goto L_0x0052
        L_0x004b:
            java.lang.Object r7 = r8.get(r4)
            if (r7 == r5) goto L_0x0043
            r5 = 0
        L_0x0052:
            if (r5 == 0) goto L_0x0033
            goto L_0x0075
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = d14.C58060l1.f166065a
        L_0x0057:
            boolean r8 = r6.compareAndSet(r4, r5, r7)
            if (r8 == 0) goto L_0x005f
            r6 = 1
            goto L_0x0066
        L_0x005f:
            java.lang.Object r8 = r6.get(r4)
            if (r8 == r5) goto L_0x0057
            r6 = 0
        L_0x0066:
            if (r6 == 0) goto L_0x0033
            a14.m r5 = (a14.C53921m) r5
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            rx3.b0 r4 = rx3.C13598b0.f38549a
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
            r5.resumeWith(r4)
        L_0x0075:
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0078:
            monitor-enter(r10)
            int r12 = r10.f166041h     // Catch:{ all -> 0x008b }
            if (r12 != r11) goto L_0x0082
            int r11 = r11 + r0
            r10.f166041h = r11     // Catch:{ all -> 0x008b }
            monitor-exit(r10)
            return r0
        L_0x0082:
            S[] r11 = r10.f167455d     // Catch:{ all -> 0x008b }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x008b }
            monitor-exit(r10)
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x0027
        L_0x008b:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x008e:
            int r11 = r11 + 2
            r10.f166041h = r11     // Catch:{ all -> 0x0094 }
            monitor-exit(r10)
            return r0
        L_0x0094:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58052j1.mo82835j(java.lang.Object, java.lang.Object):boolean");
    }

    public void setValue(T t) {
        if (t == null) {
            t = C58509v.f167541a;
        }
        mo82835j((Object) null, t);
    }
}
