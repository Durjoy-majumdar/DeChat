package d14;

import a14.C53883f1;
import a14.C53892g1;
import a14.C53921m;
import c14.C54624g;
import e14.C58474b;
import e14.C58476c;
import e14.C58479d;
import e14.C58490l;
import e14.C58506s;
import f14.C58872c0;
import gy3.C87412m;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: d14.z0 */
public class C58100z0<T> extends C58474b<C58021b1> implements C58085t0<T>, C45252f, C58506s<T> {

    /* renamed from: h */
    public final int f166160h;

    /* renamed from: i */
    public final int f166161i;

    /* renamed from: j */
    public final C54624g f166162j;

    /* renamed from: n */
    public Object[] f166163n;

    /* renamed from: o */
    public long f166164o;

    /* renamed from: p */
    public long f166165p;

    /* renamed from: q */
    public int f166166q;

    /* renamed from: r */
    public int f166167r;

    /* renamed from: d14.z0$a */
    public static final class C58101a implements C53883f1 {

        /* renamed from: d */
        public final C58100z0<?> f166168d;

        /* renamed from: e */
        public long f166169e;

        /* renamed from: f */
        public final Object f166170f;

        /* renamed from: g */
        public final C15601d<C13598b0> f166171g;

        public C58101a(C58100z0<?> z0Var, long j, Object obj, C15601d<? super C13598b0> dVar) {
            this.f166168d = z0Var;
            this.f166169e = j;
            this.f166170f = obj;
            this.f166171g = dVar;
        }

        public void dispose() {
            C58100z0<?> z0Var = this.f166168d;
            synchronized (z0Var) {
                if (this.f166169e >= z0Var.mo82845p()) {
                    Object[] objArr = z0Var.f166163n;
                    C87412m.m108591d(objArr);
                    int i = (int) this.f166169e;
                    if (objArr[(objArr.length - 1) & i] == this) {
                        objArr[i & (objArr.length - 1)] = C58017a1.f165964a;
                        z0Var.mo82841k();
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
            }
        }
    }

    @C91590f(mo125468c = "kotlinx.coroutines.flow.SharedFlowImpl", mo125469f = "SharedFlow.kt", mo125470l = {373, 380, 383}, mo125471m = "collect$suspendImpl")
    /* renamed from: d14.z0$b */
    public static final class C58102b extends C66704d {

        /* renamed from: d */
        public Object f166172d;

        /* renamed from: e */
        public Object f166173e;

        /* renamed from: f */
        public Object f166174f;

        /* renamed from: g */
        public Object f166175g;

        /* renamed from: h */
        public /* synthetic */ Object f166176h;

        /* renamed from: i */
        public final /* synthetic */ C58100z0<T> f166177i;

        /* renamed from: j */
        public int f166178j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58102b(C58100z0<T> z0Var, C15601d<? super C58102b> dVar) {
            super(dVar);
            this.f166177i = z0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f166176h = obj;
            this.f166178j |= Integer.MIN_VALUE;
            return C58100z0.m67238l(this.f166177i, (C45253g) null, this);
        }
    }

    public C58100z0(int i, int i2, C54624g gVar) {
        this.f166160h = i;
        this.f166161i = i2;
        this.f166162j = gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: d14.b1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m67238l(d14.C58100z0 r8, d14.C45253g r9, wx3.C15601d r10) {
        /*
            boolean r0 = r10 instanceof d14.C58100z0.C58102b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            d14.z0$b r0 = (d14.C58100z0.C58102b) r0
            int r1 = r0.f166178j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f166178j = r1
            goto L_0x0018
        L_0x0013:
            d14.z0$b r0 = new d14.z0$b
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f166176h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f166178j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            java.lang.Object r8 = r0.f166175g
            a14.z1 r8 = (a14.C53973z1) r8
            java.lang.Object r9 = r0.f166174f
            d14.b1 r9 = (d14.C58021b1) r9
            java.lang.Object r2 = r0.f166173e
            d14.g r2 = (d14.C45253g) r2
            java.lang.Object r5 = r0.f166172d
            d14.z0 r5 = (d14.C58100z0) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0046 }
            goto L_0x0096
        L_0x0046:
            r8 = move-exception
        L_0x0047:
            r10 = r9
            r9 = r8
            r8 = r5
            goto L_0x00d4
        L_0x004c:
            java.lang.Object r8 = r0.f166174f
            r9 = r8
            d14.b1 r9 = (d14.C58021b1) r9
            java.lang.Object r8 = r0.f166173e
            d14.g r8 = (d14.C45253g) r8
            java.lang.Object r2 = r0.f166172d
            d14.z0 r2 = (d14.C58100z0) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x005f }
            r10 = r8
            r8 = r2
            goto L_0x0087
        L_0x005f:
            r8 = move-exception
            r10 = r9
            r9 = r8
            r8 = r2
            goto L_0x00d4
        L_0x0065:
            kotlin.ResultKt.throwOnFailure(r10)
            e14.d r10 = r8.mo83425f()
            d14.b1 r10 = (d14.C58021b1) r10
            boolean r2 = r9 instanceof d14.C58066m1     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0084
            r2 = r9
            d14.m1 r2 = (d14.C58066m1) r2     // Catch:{ all -> 0x00d3 }
            r0.f166172d = r8     // Catch:{ all -> 0x00d3 }
            r0.f166173e = r9     // Catch:{ all -> 0x00d3 }
            r0.f166174f = r10     // Catch:{ all -> 0x00d3 }
            r0.f166178j = r5     // Catch:{ all -> 0x00d3 }
            java.lang.Object r2 = r2.mo82838a(r0)     // Catch:{ all -> 0x00d3 }
            if (r2 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0087:
            wx3.f r2 = r0.getContext()     // Catch:{ all -> 0x00ce }
            a14.z1$b r5 = a14.C53973z1.C0004b.f3d     // Catch:{ all -> 0x00ce }
            wx3.f$b r2 = r2.get(r5)     // Catch:{ all -> 0x00ce }
            a14.z1 r2 = (a14.C53973z1) r2     // Catch:{ all -> 0x00ce }
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0096:
            java.lang.Object r10 = r5.mo82849t(r9)     // Catch:{ all -> 0x0046 }
            f14.c0 r6 = d14.C58017a1.f165964a     // Catch:{ all -> 0x0046 }
            if (r10 != r6) goto L_0x00af
            r0.f166172d = r5     // Catch:{ all -> 0x0046 }
            r0.f166173e = r2     // Catch:{ all -> 0x0046 }
            r0.f166174f = r9     // Catch:{ all -> 0x0046 }
            r0.f166175g = r8     // Catch:{ all -> 0x0046 }
            r0.f166178j = r4     // Catch:{ all -> 0x0046 }
            java.lang.Object r10 = r5.mo82840j(r9, r0)     // Catch:{ all -> 0x0046 }
            if (r10 != r1) goto L_0x0096
            return r1
        L_0x00af:
            if (r8 == 0) goto L_0x00bd
            boolean r6 = r8.mo74466a()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x00b8
            goto L_0x00bd
        L_0x00b8:
            java.util.concurrent.CancellationException r8 = r8.mo74526Z()     // Catch:{ all -> 0x0046 }
            throw r8     // Catch:{ all -> 0x0046 }
        L_0x00bd:
            r0.f166172d = r5     // Catch:{ all -> 0x0046 }
            r0.f166173e = r2     // Catch:{ all -> 0x0046 }
            r0.f166174f = r9     // Catch:{ all -> 0x0046 }
            r0.f166175g = r8     // Catch:{ all -> 0x0046 }
            r0.f166178j = r3     // Catch:{ all -> 0x0046 }
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch:{ all -> 0x0046 }
            if (r10 != r1) goto L_0x0096
            return r1
        L_0x00ce:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x0047
        L_0x00d3:
            r9 = move-exception
        L_0x00d4:
            r8.mo83426i(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58100z0.m67238l(d14.z0, d14.g, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<? super T> gVar, C15601d<?> dVar) {
        return m67238l(this, gVar, dVar);
    }

    /* renamed from: b */
    public void mo82830b() {
        synchronized (this) {
            mo82850u(mo82845p() + ((long) this.f166166q), this.f166165p, mo82845p() + ((long) this.f166166q), mo82845p() + ((long) this.f166166q) + ((long) this.f166167r));
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public C45252f<T> mo82831c(C66212f fVar, int i, C54624g gVar) {
        return ((i == 0 || i == -3) && gVar == C54624g.SUSPEND) ? this : new C58490l(this, fVar, i, gVar);
    }

    /* renamed from: d */
    public boolean mo82832d(T t) {
        int i;
        boolean z;
        C15601d<C13598b0>[] dVarArr = C58476c.f167459a;
        synchronized (this) {
            if (mo82847r(t)) {
                dVarArr = mo82844o(dVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (C15601d<C13598b0> dVar : dVarArr) {
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
        }
        return z;
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        C58101a aVar;
        C15601d<C13598b0>[] dVarArr;
        if (mo82832d(t)) {
            return C13598b0.f38549a;
        }
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C15601d<C13598b0>[] dVarArr2 = C58476c.f167459a;
        synchronized (this) {
            if (mo82847r(t)) {
                Result.Companion companion = Result.Companion;
                mVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                dVarArr = mo82844o(dVarArr2);
                aVar = null;
            } else {
                C58101a aVar2 = new C58101a(this, ((long) (this.f166166q + this.f166167r)) + mo82845p(), t, mVar);
                mo82843n(aVar2);
                this.f166167r++;
                if (this.f166161i == 0) {
                    dVarArr2 = mo82844o(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            mVar.mo74599v(new C53892g1(aVar));
        }
        for (C15601d<C13598b0> dVar2 : dVarArr) {
            if (dVar2 != null) {
                Result.Companion companion2 = Result.Companion;
                dVar2.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
        }
        Object o = mVar.mo74608o();
        C15911a aVar3 = C15911a.COROUTINE_SUSPENDED;
        if (o != aVar3) {
            o = C13598b0.f38549a;
        }
        return o == aVar3 ? o : C13598b0.f38549a;
    }

    /* renamed from: g */
    public C58479d mo82833g() {
        return new C58021b1();
    }

    /* renamed from: h */
    public C58479d[] mo82834h(int i) {
        return new C58021b1[i];
    }

    /* renamed from: j */
    public final Object mo82840j(C58021b1 b1Var, C15601d<? super C13598b0> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        synchronized (this) {
            if (mo82848s(b1Var) < 0) {
                b1Var.f165972b = mVar;
            } else {
                Result.Companion companion = Result.Companion;
                mVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        Object o = mVar.mo74608o();
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }

    /* renamed from: k */
    public final void mo82841k() {
        if (this.f166161i != 0 || this.f166167r > 1) {
            Object[] objArr = this.f166163n;
            C87412m.m108591d(objArr);
            while (this.f166167r > 0) {
                long p = mo82845p();
                int i = this.f166166q;
                int i2 = this.f166167r;
                if (objArr[(objArr.length - 1) & ((int) ((p + ((long) (i + i2))) - 1))] == C58017a1.f165964a) {
                    this.f166167r = i2 - 1;
                    objArr[(objArr.length - 1) & ((int) (mo82845p() + ((long) (this.f166166q + this.f166167r))))] = null;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo82842m() {
        S[] sArr;
        Object[] objArr = this.f166163n;
        C87412m.m108591d(objArr);
        objArr[(objArr.length - 1) & ((int) mo82845p())] = null;
        this.f166166q--;
        long p = mo82845p() + 1;
        if (this.f166164o < p) {
            this.f166164o = p;
        }
        if (this.f166165p < p) {
            if (!(this.f167456e == 0 || (sArr = this.f167455d) == null)) {
                for (S s : sArr) {
                    if (s != null) {
                        C58021b1 b1Var = (C58021b1) s;
                        long j = b1Var.f165971a;
                        if (j >= 0 && j < p) {
                            b1Var.f165971a = p;
                        }
                    }
                }
            }
            this.f166165p = p;
        }
    }

    /* renamed from: n */
    public final void mo82843n(Object obj) {
        int i = this.f166166q + this.f166167r;
        Object[] objArr = this.f166163n;
        if (objArr == null) {
            objArr = mo82846q((Object[]) null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = mo82846q(objArr, i, objArr.length * 2);
        }
        objArr[((int) (mo82845p() + ((long) i))) & (objArr.length - 1)] = obj;
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wx3.C15601d<rx3.C13598b0>[] mo82844o(wx3.C15601d<rx3.C13598b0>[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            int r1 = r11.f167456e
            if (r1 == 0) goto L_0x0044
            S[] r1 = r11.f167455d
            if (r1 == 0) goto L_0x0044
            r2 = 0
            int r3 = r1.length
        L_0x000b:
            if (r2 >= r3) goto L_0x0044
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0041
            d14.b1 r4 = (d14.C58021b1) r4
            wx3.d<? super rx3.b0> r5 = r4.f165972b
            if (r5 != 0) goto L_0x0018
            goto L_0x0041
        L_0x0018:
            long r6 = r11.mo82848s(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0041
            int r6 = r12.length
            if (r0 < r6) goto L_0x0036
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            gy3.C87412m.m108593f(r12, r6)
        L_0x0036:
            r6 = r12
            wx3.d[] r6 = (wx3.C15601d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f165972b = r0
            r0 = r7
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0044:
            wx3.d[] r12 = (wx3.C15601d[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.C58100z0.mo82844o(wx3.d[]):wx3.d[]");
    }

    /* renamed from: p */
    public final long mo82845p() {
        return Math.min(this.f166165p, this.f166164o);
    }

    /* renamed from: q */
    public final Object[] mo82846q(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f166163n = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long p = mo82845p();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (((long) i3) + p);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: r */
    public final boolean mo82847r(T t) {
        if (this.f167456e == 0) {
            if (this.f166160h != 0) {
                mo82843n(t);
                int i = this.f166166q + 1;
                this.f166166q = i;
                if (i > this.f166160h) {
                    mo82842m();
                }
                this.f166165p = mo82845p() + ((long) this.f166166q);
            }
            return true;
        }
        if (this.f166166q >= this.f166161i && this.f166165p <= this.f166164o) {
            int ordinal = this.f166162j.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        mo82843n(t);
        int i2 = this.f166166q + 1;
        this.f166166q = i2;
        if (i2 > this.f166161i) {
            mo82842m();
        }
        long p = mo82845p() + ((long) this.f166166q);
        long j = this.f166164o;
        if (((int) (p - j)) > this.f166160h) {
            mo82850u(j + 1, this.f166165p, mo82845p() + ((long) this.f166166q), mo82845p() + ((long) this.f166166q) + ((long) this.f166167r));
        }
        return true;
    }

    /* renamed from: s */
    public final long mo82848s(C58021b1 b1Var) {
        long j = b1Var.f165971a;
        if (j < mo82845p() + ((long) this.f166166q)) {
            return j;
        }
        if (this.f166161i <= 0 && j <= mo82845p() && this.f166167r != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: t */
    public final Object mo82849t(C58021b1 b1Var) {
        Object obj;
        C15601d<C13598b0>[] dVarArr = C58476c.f167459a;
        synchronized (this) {
            long s = mo82848s(b1Var);
            if (s < 0) {
                obj = C58017a1.f165964a;
            } else {
                long j = b1Var.f165971a;
                Object[] objArr = this.f166163n;
                C87412m.m108591d(objArr);
                Object obj2 = objArr[((int) s) & (objArr.length - 1)];
                if (obj2 instanceof C58101a) {
                    obj2 = ((C58101a) obj2).f166170f;
                }
                b1Var.f165971a = s + 1;
                Object obj3 = obj2;
                dVarArr = mo82851v(j);
                obj = obj3;
            }
        }
        for (C15601d<C13598b0> dVar : dVarArr) {
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
        }
        return obj;
    }

    /* renamed from: u */
    public final void mo82850u(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long min = Math.min(j6, j);
        for (long p = mo82845p(); p < min; p++) {
            Object[] objArr = this.f166163n;
            C87412m.m108591d(objArr);
            objArr[((int) p) & (objArr.length - 1)] = null;
        }
        this.f166164o = j5;
        this.f166165p = j6;
        this.f166166q = (int) (j3 - min);
        this.f166167r = (int) (j4 - j3);
    }

    /* renamed from: v */
    public final C15601d<C13598b0>[] mo82851v(long j) {
        long j2;
        long j3;
        long j4;
        S[] sArr;
        if (j > this.f166165p) {
            return C58476c.f167459a;
        }
        long p = mo82845p();
        long j5 = ((long) this.f166166q) + p;
        if (this.f166161i == 0 && this.f166167r > 0) {
            j5++;
        }
        if (!(this.f167456e == 0 || (sArr = this.f167455d) == null)) {
            for (S s : sArr) {
                if (s != null) {
                    long j6 = ((C58021b1) s).f165971a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.f166165p) {
            return C58476c.f167459a;
        }
        long p2 = mo82845p() + ((long) this.f166166q);
        int min = this.f167456e > 0 ? Math.min(this.f166167r, this.f166161i - ((int) (p2 - j5))) : this.f166167r;
        C15601d<C13598b0>[] dVarArr = C58476c.f167459a;
        long j7 = ((long) this.f166167r) + p2;
        if (min > 0) {
            dVarArr = new C15601d[min];
            Object[] objArr = this.f166163n;
            C87412m.m108591d(objArr);
            long j8 = p2;
            int i = 0;
            while (true) {
                if (p2 >= j7) {
                    j3 = j5;
                    j2 = j7;
                    break;
                }
                int i2 = (int) p2;
                j3 = j5;
                Object obj = objArr[(objArr.length - 1) & i2];
                C58872c0 c0Var = C58017a1.f165964a;
                if (obj == c0Var) {
                    j2 = j7;
                    j4 = 1;
                } else if (obj != null) {
                    C58101a aVar = (C58101a) obj;
                    j2 = j7;
                    int i3 = i + 1;
                    dVarArr[i] = aVar.f166171g;
                    objArr[i2 & (objArr.length - 1)] = c0Var;
                    objArr[((int) j8) & (objArr.length - 1)] = aVar.f166170f;
                    j4 = 1;
                    j8++;
                    if (i3 >= min) {
                        break;
                    }
                    i = i3;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
                p2 += j4;
                j5 = j3;
                j7 = j2;
            }
            p2 = j8;
        } else {
            j3 = j5;
            j2 = j7;
        }
        int i4 = (int) (p2 - p);
        long j9 = this.f167456e == 0 ? p2 : j3;
        long max = Math.max(this.f166164o, p2 - ((long) Math.min(this.f166160h, i4)));
        if (this.f166161i == 0 && max < j2) {
            Object[] objArr2 = this.f166163n;
            C87412m.m108591d(objArr2);
            if (C87412m.m108589b(objArr2[((int) max) & (objArr2.length - 1)], C58017a1.f165964a)) {
                p2++;
                max++;
            }
        }
        mo82850u(max, j9, p2, j2);
        mo82841k();
        return (dVarArr.length == 0) ^ true ? mo82844o(dVarArr) : dVarArr;
    }
}
