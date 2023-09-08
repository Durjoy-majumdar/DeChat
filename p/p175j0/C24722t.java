package p175j0;

import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p410k0.C108792d;
import p410k0.C24853b;
import p410k0.C60926c;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C66212f;

/* renamed from: j0.t */
public final class C24722t implements C60689y {

    /* renamed from: d */
    public final C24721r f70510d;

    /* renamed from: e */
    public final C24665d<?> f70511e;

    /* renamed from: f */
    public final AtomicReference<Object> f70512f;

    /* renamed from: g */
    public final Object f70513g;

    /* renamed from: h */
    public final HashSet<C24725u1> f70514h;

    /* renamed from: i */
    public final C24729z1 f70515i;

    /* renamed from: j */
    public final C108792d<C24705j1> f70516j;

    /* renamed from: n */
    public final HashSet<C24705j1> f70517n;

    /* renamed from: o */
    public final C108792d<C24660b0<?>> f70518o;

    /* renamed from: p */
    public final List<C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0>> f70519p;

    /* renamed from: q */
    public final List<C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0>> f70520q;

    /* renamed from: r */
    public final C108792d<C24705j1> f70521r;

    /* renamed from: s */
    public C24853b<C24705j1, C60926c<Object>> f70522s;

    /* renamed from: t */
    public boolean f70523t;

    /* renamed from: u */
    public C24722t f70524u;

    /* renamed from: v */
    public int f70525v;

    /* renamed from: w */
    public final C24669i f70526w;

    /* renamed from: x */
    public final C66212f f70527x;

    /* renamed from: y */
    public boolean f70528y;

    /* renamed from: z */
    public C32227p<? super C108504h, ? super Integer, C13598b0> f70529z;

    /* renamed from: j0.t$a */
    public static final class C24723a implements C24724t1 {

        /* renamed from: a */
        public final Set<C24725u1> f70530a;

        /* renamed from: b */
        public final List<C24725u1> f70531b = new ArrayList();

        /* renamed from: c */
        public final List<C24725u1> f70532c = new ArrayList();

        /* renamed from: d */
        public final List<C32224a<C13598b0>> f70533d = new ArrayList();

        public C24723a(Set<C24725u1> set) {
            C87412m.m108594g(set, "abandoning");
            this.f70530a = set;
        }

        /* renamed from: a */
        public void mo51682a(C32224a<C13598b0> aVar) {
            C87412m.m108594g(aVar, "effect");
            this.f70533d.add(aVar);
        }

        /* renamed from: b */
        public void mo51683b(C24725u1 u1Var) {
            C87412m.m108594g(u1Var, "instance");
            int lastIndexOf = ((ArrayList) this.f70531b).lastIndexOf(u1Var);
            if (lastIndexOf >= 0) {
                ((ArrayList) this.f70531b).remove(lastIndexOf);
                this.f70530a.remove(u1Var);
                return;
            }
            ((ArrayList) this.f70532c).add(u1Var);
        }

        /* renamed from: c */
        public void mo51684c(C24725u1 u1Var) {
            C87412m.m108594g(u1Var, "instance");
            int lastIndexOf = ((ArrayList) this.f70532c).lastIndexOf(u1Var);
            if (lastIndexOf >= 0) {
                ((ArrayList) this.f70532c).remove(lastIndexOf);
                this.f70530a.remove(u1Var);
                return;
            }
            ((ArrayList) this.f70531b).add(u1Var);
        }

        /* renamed from: d */
        public final void mo51685d() {
            if (!this.f70530a.isEmpty()) {
                Iterator<C24725u1> it = this.f70530a.iterator();
                while (it.hasNext()) {
                    it.remove();
                    it.next().mo51625b();
                }
            }
        }

        /* renamed from: e */
        public final void mo51686e() {
            if (!this.f70532c.isEmpty()) {
                int size = ((ArrayList) this.f70532c).size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    C24725u1 u1Var = (C24725u1) ((ArrayList) this.f70532c).get(size);
                    if (!this.f70530a.contains(u1Var)) {
                        u1Var.mo51627d();
                    }
                }
            }
            if (!this.f70531b.isEmpty()) {
                ArrayList arrayList = (ArrayList) this.f70531b;
                int size2 = arrayList.size();
                for (int i = 0; i < size2; i++) {
                    C24725u1 u1Var2 = (C24725u1) arrayList.get(i);
                    this.f70530a.remove(u1Var2);
                    u1Var2.mo51626c();
                }
            }
        }
    }

    public C24722t(C24721r rVar, C24665d dVar, C66212f fVar, int i, C8480h hVar) {
        fVar = (i & 4) != 0 ? null : fVar;
        C87412m.m108594g(rVar, "parent");
        C87412m.m108594g(dVar, "applier");
        this.f70510d = rVar;
        this.f70511e = dVar;
        this.f70512f = new AtomicReference<>((Object) null);
        this.f70513g = new Object();
        HashSet<C24725u1> hashSet = new HashSet<>();
        this.f70514h = hashSet;
        C24729z1 z1Var = new C24729z1();
        this.f70515i = z1Var;
        this.f70516j = new C108792d<>();
        this.f70517n = new HashSet<>();
        this.f70518o = new C108792d<>();
        ArrayList arrayList = new ArrayList();
        this.f70519p = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f70520q = arrayList2;
        this.f70521r = new C108792d<>();
        this.f70522s = new C24853b<>(0, 1, (C8480h) null);
        C24669i iVar = new C24669i(dVar, rVar, z1Var, hashSet, arrayList, arrayList2, this);
        rVar.mo51640m(iVar);
        this.f70526w = iVar;
        this.f70527x = fVar;
        boolean z = rVar instanceof C60661k1;
        this.f70529z = C60652f.f172767a;
    }

    /* renamed from: t */
    public static final void m31047t(C24722t tVar, boolean z, C8479f0<HashSet<C24705j1>> f0Var, Object obj) {
        C24711m0 m0Var;
        C24711m0 m0Var2 = C24711m0.IGNORED;
        C108792d<C24705j1> dVar = tVar.f70516j;
        int b = dVar.mo159856b(obj);
        if (b >= 0) {
            C60926c<C24705j1> d = dVar.mo159858d(b);
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i < d.f173545d) {
                    int i2 = i + 1;
                    Object obj2 = d.f173546e[i];
                    if (obj2 != null) {
                        C24705j1 j1Var = (C24705j1) obj2;
                        if (!tVar.f70521r.mo159857c(obj, j1Var)) {
                            C24722t tVar2 = j1Var.f70463a;
                            if (tVar2 == null || (m0Var = tVar2.mo51679x(j1Var, obj)) == null) {
                                m0Var = m0Var2;
                            }
                            if (m0Var != m0Var2) {
                                if (j1Var.f70469g == null) {
                                    z2 = false;
                                }
                                if (!z2 || z) {
                                    T t = (HashSet) f0Var.f27484d;
                                    if (t == null) {
                                        t = new HashSet();
                                        f0Var.f27484d = t;
                                    }
                                    t.add(j1Var);
                                } else {
                                    tVar.f70517n.add(j1Var);
                                }
                            }
                        }
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo51656a(C24726w0 w0Var) {
        C87412m.m108594g(w0Var, "state");
        C24723a aVar = new C24723a(this.f70514h);
        C24661b2 l = w0Var.f70534a.mo51708l();
        try {
            C24715p.m31029e(l, aVar);
            C13598b0 b0Var = C13598b0.f38549a;
            l.mo51515f();
            aVar.mo51686e();
        } catch (Throwable th) {
            l.mo51515f();
            throw th;
        }
    }

    /* renamed from: b */
    public <R> R mo51657b(C60689y yVar, int i, C32224a<? extends R> aVar) {
        C87412m.m108594g(aVar, "block");
        if (yVar == null || C87412m.m108589b(yVar, this) || i < 0) {
            return aVar.invoke();
        }
        this.f70524u = (C24722t) yVar;
        this.f70525v = i;
        try {
            return aVar.invoke();
        } finally {
            this.f70524u = null;
            this.f70525v = 0;
        }
    }

    /* renamed from: c */
    public void mo51658c(C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "content");
        try {
            synchronized (this.f70513g) {
                mo51677v();
                C24669i iVar = this.f70526w;
                C24853b<C24705j1, C60926c<Object>> bVar = this.f70522s;
                this.f70522s = new C24853b<>(0, 1, (C8480h) null);
                iVar.getClass();
                C87412m.m108594g(bVar, "invalidationsRequested");
                if (iVar.f70370f.isEmpty()) {
                    iVar.mo51571W(bVar, pVar);
                    C13598b0 b0Var = C13598b0.f38549a;
                } else {
                    C24715p.m31027c("Expected applyChanges() to have been called".toString());
                    throw null;
                }
            }
        } catch (Throwable th) {
            if (!this.f70514h.isEmpty()) {
                HashSet<C24725u1> hashSet = this.f70514h;
                C87412m.m108594g(hashSet, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (true ^ hashSet.isEmpty()) {
                    Iterator<C24725u1> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().mo51625b();
                    }
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public boolean mo51659d() {
        boolean j0;
        synchronized (this.f70513g) {
            mo51677v();
            try {
                C24669i iVar = this.f70526w;
                C24853b<C24705j1, C60926c<Object>> bVar = this.f70522s;
                this.f70522s = new C24853b<>(0, 1, (C8480h) null);
                j0 = iVar.mo51593j0(bVar);
                if (!j0) {
                    mo51678w();
                }
            } catch (Throwable th) {
                if (!this.f70514h.isEmpty()) {
                    HashSet<C24725u1> hashSet = this.f70514h;
                    C87412m.m108594g(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (true ^ hashSet.isEmpty()) {
                        Iterator<C24725u1> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().mo51625b();
                        }
                    }
                }
                throw th;
            }
        }
        return j0;
    }

    /* JADX INFO: finally extract failed */
    public void dispose() {
        synchronized (this.f70513g) {
            if (!this.f70528y) {
                this.f70528y = true;
                C32227p<C108504h, Integer, C13598b0> pVar = C60652f.f172767a;
                this.f70529z = C60652f.f172768b;
                boolean z = this.f70515i.f70554e > 0;
                if (z || (true ^ this.f70514h.isEmpty())) {
                    C24723a aVar = new C24723a(this.f70514h);
                    if (z) {
                        C24661b2 l = this.f70515i.mo51708l();
                        try {
                            C24715p.m31029e(l, aVar);
                            C13598b0 b0Var = C13598b0.f38549a;
                            l.mo51515f();
                            this.f70511e.clear();
                            aVar.mo51686e();
                        } catch (Throwable th) {
                            l.mo51515f();
                            throw th;
                        }
                    }
                    aVar.mo51685d();
                }
                this.f70526w.mo51570V();
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
        this.f70510d.mo51643p(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r12 = r12 + 1;
        r8 = r6.f70835a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
        if (r12 >= r8) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        r9 = r6.f70836b[r12];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        if (r9 != r1) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (java.lang.System.identityHashCode(r9) == r10) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
        r12 = r6.f70835a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        r8 = -(r12 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        r9 = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51661e(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "value"
            gy3.C87412m.m108594g(r1, r2)
            j0.i r2 = r0.f70526w
            int r3 = r2.f70342A
            r5 = 1
            if (r3 <= 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r3 != 0) goto L_0x0143
            j0.j1 r2 = r2.mo51578b0()
            if (r2 == 0) goto L_0x0143
            int r3 = r2.f70464b
            r3 = r3 | r5
            r2.f70464b = r3
            k0.d<j0.j1> r3 = r0.f70516j
            r3.mo159855a(r1, r2)
            boolean r3 = r1 instanceof p175j0.C24660b0
            if (r3 == 0) goto L_0x0046
            r6 = r1
            j0.b0 r6 = (p175j0.C24660b0) r6
            java.util.Set r6 = r6.mo51495b()
            java.util.Iterator r6 = r6.iterator()
        L_0x0034:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0046
            java.lang.Object r7 = r6.next()
            t0.h0 r7 = (p241t0.C110851h0) r7
            k0.d<j0.b0<?>> r8 = r0.f70518o
            r8.mo159855a(r7, r1)
            goto L_0x0034
        L_0x0046:
            int r6 = r2.f70464b
            r6 = r6 & 32
            if (r6 == 0) goto L_0x004e
            r6 = 1
            goto L_0x004f
        L_0x004e:
            r6 = 0
        L_0x004f:
            if (r6 == 0) goto L_0x0053
            goto L_0x0143
        L_0x0053:
            k0.a r6 = r2.f70468f
            if (r6 != 0) goto L_0x005e
            k0.a r6 = new k0.a
            r6.<init>()
            r2.f70468f = r6
        L_0x005e:
            int r7 = r2.f70467e
            int r8 = r6.f70835a
            r9 = -1
            if (r8 <= 0) goto L_0x00c2
            int r8 = r8 + r9
            int r10 = java.lang.System.identityHashCode(r23)
            r11 = 0
        L_0x006b:
            if (r11 > r8) goto L_0x00b8
            int r12 = r11 + r8
            int r12 = r12 >>> r5
            java.lang.Object[] r13 = r6.f70836b
            r13 = r13[r12]
            int r14 = java.lang.System.identityHashCode(r13)
            if (r14 >= r10) goto L_0x007d
            int r11 = r12 + 1
            goto L_0x006b
        L_0x007d:
            if (r14 <= r10) goto L_0x0082
            int r8 = r12 + -1
            goto L_0x006b
        L_0x0082:
            if (r13 != r1) goto L_0x0086
            r9 = r12
            goto L_0x00bb
        L_0x0086:
            int r8 = r12 + -1
        L_0x0088:
            if (r9 >= r8) goto L_0x009b
            java.lang.Object[] r11 = r6.f70836b
            r11 = r11[r8]
            if (r11 != r1) goto L_0x0091
            goto L_0x00ba
        L_0x0091:
            int r11 = java.lang.System.identityHashCode(r11)
            if (r11 == r10) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            int r8 = r8 + -1
            goto L_0x0088
        L_0x009b:
            int r12 = r12 + 1
            int r8 = r6.f70835a
        L_0x009f:
            if (r12 >= r8) goto L_0x00b3
            java.lang.Object[] r9 = r6.f70836b
            r9 = r9[r12]
            if (r9 != r1) goto L_0x00a9
            r8 = r12
            goto L_0x00ba
        L_0x00a9:
            int r9 = java.lang.System.identityHashCode(r9)
            if (r9 == r10) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            int r12 = r12 + 1
            goto L_0x009f
        L_0x00b3:
            int r12 = r6.f70835a
        L_0x00b5:
            int r12 = r12 + r5
            int r8 = -r12
            goto L_0x00ba
        L_0x00b8:
            int r11 = r11 + r5
            int r8 = -r11
        L_0x00ba:
            r9 = r8
        L_0x00bb:
            if (r9 < 0) goto L_0x00c2
            int[] r6 = r6.f70837c
            r6[r9] = r7
            goto L_0x012a
        L_0x00c2:
            int r9 = r9 + r5
            int r8 = -r9
            int r9 = r6.f70835a
            java.lang.Object[] r10 = r6.f70836b
            int r11 = r10.length
            if (r9 != r11) goto L_0x0111
            int r11 = r10.length
            int r11 = r11 * 2
            java.lang.Object[] r15 = new java.lang.Object[r11]
            int r11 = r10.length
            int r11 = r11 * 2
            int[] r14 = new int[r11]
            int r11 = r8 + 1
            sx3.C110821n.m150963j(r10, r15, r11, r8, r9)
            int[] r9 = r6.f70837c
            int r10 = r6.f70835a
            sx3.C110821n.m150962i(r9, r14, r11, r8, r10)
            java.lang.Object[] r10 = r6.f70836b
            r9 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r12 = 0
            r13 = 0
            r16 = 6
            r20 = 0
            r11 = r15
            r21 = r14
            r14 = r8
            r4 = r15
            r15 = r16
            r16 = r20
            sx3.C110821n.m150966m(r10, r11, r12, r13, r14, r15, r16)
            int[] r10 = r6.f70837c
            r11 = r21
            r12 = r9
            r13 = r17
            r15 = r18
            r16 = r19
            sx3.C110821n.m150965l(r10, r11, r12, r13, r14, r15, r16)
            r6.f70836b = r4
            r4 = r21
            r6.f70837c = r4
            goto L_0x011d
        L_0x0111:
            int r4 = r8 + 1
            sx3.C110821n.m150963j(r10, r10, r4, r8, r9)
            int[] r9 = r6.f70837c
            int r10 = r6.f70835a
            sx3.C110821n.m150962i(r9, r9, r4, r8, r10)
        L_0x011d:
            java.lang.Object[] r4 = r6.f70836b
            r4[r8] = r1
            int[] r4 = r6.f70837c
            r4[r8] = r7
            int r4 = r6.f70835a
            int r4 = r4 + r5
            r6.f70835a = r4
        L_0x012a:
            if (r3 == 0) goto L_0x0143
            k0.b<j0.b0<?>, java.lang.Object> r3 = r2.f70469g
            if (r3 != 0) goto L_0x0139
            k0.b r3 = new k0.b
            r4 = 0
            r6 = 0
            r3.<init>(r6, r5, r4)
            r2.f70469g = r3
        L_0x0139:
            r2 = r1
            j0.b0 r2 = (p175j0.C24660b0) r2
            java.lang.Object r2 = r2.mo51494a()
            r3.mo51858b(r1, r2)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C24722t.mo51661e(java.lang.Object):void");
    }

    /* renamed from: f */
    public void mo51662f(C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "content");
        if (!this.f70528y) {
            this.f70529z = pVar;
            this.f70510d.mo51628a(this, pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    /* renamed from: g */
    public void mo51663g() {
        synchronized (this.f70513g) {
            mo51676u(this.f70519p);
            mo51678w();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: h */
    public void mo51664h() {
        synchronized (this.f70513g) {
            for (Object obj : this.f70515i.f70555f) {
                C24705j1 j1Var = obj instanceof C24705j1 ? (C24705j1) obj : null;
                if (j1Var != null) {
                    j1Var.invalidate();
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: i */
    public boolean mo51665i() {
        return this.f70528y;
    }

    /* renamed from: j */
    public boolean mo51666j(Set<? extends Object> set) {
        boolean z;
        C87412m.m108594g(set, "values");
        Iterator<? extends Object> it = set.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                Object next = it.next();
                C108792d<C24705j1> dVar = this.f70516j;
                dVar.getClass();
                C87412m.m108594g(next, "element");
                if (dVar.mo159856b(next) >= 0) {
                    break;
                }
                C108792d<C24660b0<?>> dVar2 = this.f70518o;
                dVar2.getClass();
                if (dVar2.mo159856b(next) >= 0) {
                    z = true;
                    continue;
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: k */
    public void mo51667k() {
        synchronized (this.f70513g) {
            this.f70526w.f70386v.clear();
            if (!this.f70514h.isEmpty()) {
                HashSet<C24725u1> hashSet = this.f70514h;
                C87412m.m108594g(hashSet, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!hashSet.isEmpty()) {
                    Iterator<C24725u1> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().mo51625b();
                    }
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: l */
    public void mo51668l(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        C24669i iVar = this.f70526w;
        iVar.getClass();
        if (!iVar.f70345D) {
            iVar.f70345D = true;
            try {
                aVar.invoke();
            } finally {
                iVar.f70345D = false;
            }
        } else {
            C24715p.m31027c("Preparing a composition while composing is not supported".toString());
            throw null;
        }
    }

    /* renamed from: m */
    public void mo51669m() {
        synchronized (this.f70513g) {
            if (!this.f70520q.isEmpty()) {
                mo51676u(this.f70520q);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: n */
    public void mo51670n(List<C13604l<C24727x0, C24727x0>> list) {
        C87412m.m108594g(list, "references");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!C87412m.m108589b(((C24727x0) list.get(i).f38555d).f70537c, this)) {
                break;
            } else {
                i++;
            }
        }
        C24715p.m31030f(z);
        try {
            this.f70526w.mo51580c0(list);
            C13598b0 b0Var = C13598b0.f38549a;
        } catch (Throwable th) {
            if (!this.f70514h.isEmpty()) {
                HashSet<C24725u1> hashSet = this.f70514h;
                C87412m.m108594g(hashSet, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!hashSet.isEmpty()) {
                    Iterator<C24725u1> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().mo51625b();
                    }
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51671o(java.util.Set<? extends java.lang.Object> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "values"
            gy3.C87412m.m108594g(r7, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r6.f70512f
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r2 = 1
            goto L_0x0016
        L_0x0010:
            java.lang.Object r2 = p175j0.C108512u.f324834a
            boolean r2 = gy3.C87412m.m108589b(r0, r2)
        L_0x0016:
            r3 = 0
            if (r2 == 0) goto L_0x001b
            r2 = r7
            goto L_0x003c
        L_0x001b:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x002a
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r2[r3] = r4
            r2[r1] = r7
            goto L_0x003c
        L_0x002a:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L_0x0066
            if (r0 == 0) goto L_0x005e
            r2 = r0
            java.util.Set[] r2 = (java.util.Set[]) r2
            int r4 = r2.length
            int r5 = r4 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            r2[r4] = r7
        L_0x003c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f70512f
        L_0x003e:
            boolean r5 = r4.compareAndSet(r0, r2)
            if (r5 == 0) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            java.lang.Object r5 = r4.get()
            if (r5 == r0) goto L_0x003e
            r1 = 0
        L_0x004c:
            if (r1 == 0) goto L_0x0005
            if (r0 != 0) goto L_0x005d
            java.lang.Object r7 = r6.f70513g
            monitor-enter(r7)
            r6.mo51678w()     // Catch:{ all -> 0x005a }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005a }
            monitor-exit(r7)
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x005d:
            return
        L_0x005e:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            r7.<init>(r0)
            throw r7
        L_0x0066:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f70512f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C24722t.mo51671o(java.util.Set):void");
    }

    /* renamed from: p */
    public boolean mo51672p() {
        return this.f70526w.f70345D;
    }

    /* renamed from: q */
    public void mo51673q(Object obj) {
        C87412m.m108594g(obj, "value");
        synchronized (this.f70513g) {
            mo51681z(obj);
            C108792d<C24660b0<?>> dVar = this.f70518o;
            int b = dVar.mo159856b(obj);
            if (b >= 0) {
                for (C24660b0<?> z : dVar.mo159858d(b)) {
                    mo51681z(z);
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: r */
    public boolean mo51674r() {
        boolean z;
        synchronized (this.f70513g) {
            z = this.f70522s.f70840c > 0;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x00ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51675s(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            r6 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            boolean r9 = r4 instanceof p175j0.C24705j1
            if (r9 == 0) goto L_0x002a
            j0.j1 r4 = (p175j0.C24705j1) r4
            j0.t r5 = r4.f70463a
            if (r5 == 0) goto L_0x000d
            j0.m0 r4 = r5.mo51679x(r4, r6)
            goto L_0x000d
        L_0x002a:
            m31047t(r0, r1, r2, r4)
            k0.d<j0.b0<?>> r6 = r0.f70518o
            int r4 = r6.mo159856b(r4)
            if (r4 < 0) goto L_0x000d
            k0.c r4 = r6.mo159858d(r4)
            r6 = 0
        L_0x003a:
            int r9 = r4.f173545d
            if (r6 >= r9) goto L_0x0040
            r9 = 1
            goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            if (r9 == 0) goto L_0x000d
            java.lang.Object[] r9 = r4.f173546e
            int r10 = r6 + 1
            r6 = r9[r6]
            if (r6 == 0) goto L_0x0052
            j0.b0 r6 = (p175j0.C24660b0) r6
            m31047t(r0, r1, r2, r6)
            r6 = r10
            goto L_0x003a
        L_0x0052:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0058:
            if (r1 == 0) goto L_0x00f1
            java.util.HashSet<j0.j1> r1 = r0.f70517n
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x00f1
            k0.d<j0.j1> r1 = r0.f70516j
            int r3 = r1.f325783d
            r4 = 0
            r9 = 0
        L_0x0069:
            if (r4 >= r3) goto L_0x00d7
            int[] r10 = r1.f325780a
            r10 = r10[r4]
            k0.c<T>[] r11 = r1.f325782c
            r11 = r11[r10]
            gy3.C87412m.m108591d(r11)
            int r12 = r11.f173545d
            r13 = 0
            r14 = 0
        L_0x007a:
            if (r13 >= r12) goto L_0x00b6
            java.lang.Object[] r15 = r11.f173546e
            r15 = r15[r13]
            if (r15 == 0) goto L_0x00b0
            r7 = r15
            j0.j1 r7 = (p175j0.C24705j1) r7
            java.util.HashSet<j0.j1> r6 = r0.f70517n
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00a1
            T r6 = r2.f27484d
            java.util.HashSet r6 = (java.util.HashSet) r6
            if (r6 == 0) goto L_0x009b
            boolean r6 = r6.contains(r7)
            if (r6 != r8) goto L_0x009b
            r6 = 1
            goto L_0x009c
        L_0x009b:
            r6 = 0
        L_0x009c:
            if (r6 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r6 = 0
            goto L_0x00a2
        L_0x00a1:
            r6 = 1
        L_0x00a2:
            if (r6 != 0) goto L_0x00ac
            if (r14 == r13) goto L_0x00aa
            java.lang.Object[] r6 = r11.f173546e
            r6[r14] = r15
        L_0x00aa:
            int r14 = r14 + 1
        L_0x00ac:
            int r13 = r13 + 1
            r6 = 0
            goto L_0x007a
        L_0x00b0:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x00b6:
            int r6 = r11.f173545d
            r7 = r14
        L_0x00b9:
            if (r7 >= r6) goto L_0x00c3
            java.lang.Object[] r12 = r11.f173546e
            r13 = 0
            r12[r7] = r13
            int r7 = r7 + 1
            goto L_0x00b9
        L_0x00c3:
            r11.f173545d = r14
            if (r14 <= 0) goto L_0x00d3
            if (r9 == r4) goto L_0x00d1
            int[] r6 = r1.f325780a
            r7 = r6[r9]
            r6[r9] = r10
            r6[r4] = r7
        L_0x00d1:
            int r9 = r9 + 1
        L_0x00d3:
            int r4 = r4 + 1
            r6 = 0
            goto L_0x0069
        L_0x00d7:
            int r2 = r1.f325783d
            r3 = r9
        L_0x00da:
            if (r3 >= r2) goto L_0x00e8
            java.lang.Object[] r4 = r1.f325781b
            int[] r5 = r1.f325780a
            r5 = r5[r3]
            r6 = 0
            r4[r5] = r6
            int r3 = r3 + 1
            goto L_0x00da
        L_0x00e8:
            r1.f325783d = r9
            java.util.HashSet<j0.j1> r1 = r0.f70517n
            r1.clear()
            goto L_0x0163
        L_0x00f1:
            T r1 = r2.f27484d
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x0163
            k0.d<j0.j1> r2 = r0.f70516j
            int r3 = r2.f325783d
            r4 = 0
            r6 = 0
        L_0x00fd:
            if (r4 >= r3) goto L_0x0150
            int[] r7 = r2.f325780a
            r7 = r7[r4]
            k0.c<T>[] r8 = r2.f325782c
            r8 = r8[r7]
            gy3.C87412m.m108591d(r8)
            int r9 = r8.f173545d
            r10 = 0
            r11 = 0
        L_0x010e:
            if (r10 >= r9) goto L_0x0130
            java.lang.Object[] r12 = r8.f173546e
            r12 = r12[r10]
            if (r12 == 0) goto L_0x012a
            r13 = r12
            j0.j1 r13 = (p175j0.C24705j1) r13
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x0127
            if (r11 == r10) goto L_0x0125
            java.lang.Object[] r13 = r8.f173546e
            r13[r11] = r12
        L_0x0125:
            int r11 = r11 + 1
        L_0x0127:
            int r10 = r10 + 1
            goto L_0x010e
        L_0x012a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0130:
            int r9 = r8.f173545d
            r10 = r11
        L_0x0133:
            if (r10 >= r9) goto L_0x013d
            java.lang.Object[] r12 = r8.f173546e
            r13 = 0
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x0133
        L_0x013d:
            r8.f173545d = r11
            if (r11 <= 0) goto L_0x014d
            if (r6 == r4) goto L_0x014b
            int[] r8 = r2.f325780a
            r9 = r8[r6]
            r8[r6] = r7
            r8[r4] = r9
        L_0x014b:
            int r6 = r6 + 1
        L_0x014d:
            int r4 = r4 + 1
            goto L_0x00fd
        L_0x0150:
            int r1 = r2.f325783d
            r3 = r6
        L_0x0153:
            if (r3 >= r1) goto L_0x0161
            java.lang.Object[] r4 = r2.f325781b
            int[] r5 = r2.f325780a
            r5 = r5[r3]
            r7 = 0
            r4[r5] = r7
            int r3 = r3 + 1
            goto L_0x0153
        L_0x0161:
            r2.f325783d = r6
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C24722t.mo51675s(java.util.Set, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc A[Catch:{ all -> 0x0187, all -> 0x018c }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51676u(java.util.List<fy3.C32228q<p175j0.C24665d<?>, p175j0.C24661b2, p175j0.C24724t1, rx3.C13598b0>> r17) {
        /*
            r16 = this;
            r1 = r16
            j0.t$a r2 = new j0.t$a
            java.util.HashSet<j0.u1> r0 = r1.f70514h
            r2.<init>(r0)
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x001d
            java.util.List<fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0>> r0 = r1.f70520q
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001c
            r2.mo51685d()
        L_0x001c:
            return
        L_0x001d:
            j0.d<?> r0 = r1.f70511e     // Catch:{ all -> 0x018c }
            r0.mo51490f()     // Catch:{ all -> 0x018c }
            j0.z1 r0 = r1.f70515i     // Catch:{ all -> 0x018c }
            j0.b2 r3 = r0.mo51708l()     // Catch:{ all -> 0x018c }
            j0.d<?> r0 = r1.f70511e     // Catch:{ all -> 0x0187 }
            int r4 = r17.size()     // Catch:{ all -> 0x0187 }
            r5 = 0
            r6 = 0
        L_0x0030:
            if (r6 >= r4) goto L_0x0040
            r7 = r17
            java.lang.Object r8 = r7.get(r6)     // Catch:{ all -> 0x0187 }
            fy3.q r8 = (fy3.C32228q) r8     // Catch:{ all -> 0x0187 }
            r8.invoke(r0, r3, r2)     // Catch:{ all -> 0x0187 }
            int r6 = r6 + 1
            goto L_0x0030
        L_0x0040:
            r7 = r17
            r17.clear()     // Catch:{ all -> 0x0187 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0187 }
            r3.mo51515f()     // Catch:{ all -> 0x018c }
            j0.d<?> r0 = r1.f70511e     // Catch:{ all -> 0x018c }
            r0.mo51485b()     // Catch:{ all -> 0x018c }
            r2.mo51686e()     // Catch:{ all -> 0x018c }
            java.util.List<fy3.a<rx3.b0>> r0 = r2.f70533d     // Catch:{ all -> 0x018c }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x018c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x018c }
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x007c
            java.util.List<fy3.a<rx3.b0>> r0 = r2.f70533d     // Catch:{ all -> 0x018c }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x018c }
            int r4 = r0.size()     // Catch:{ all -> 0x018c }
            r6 = 0
        L_0x0067:
            if (r6 >= r4) goto L_0x0075
            java.lang.Object r7 = r0.get(r6)     // Catch:{ all -> 0x018c }
            fy3.a r7 = (fy3.C32224a) r7     // Catch:{ all -> 0x018c }
            r7.invoke()     // Catch:{ all -> 0x018c }
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0075:
            java.util.List<fy3.a<rx3.b0>> r0 = r2.f70533d     // Catch:{ all -> 0x018c }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x018c }
            r0.clear()     // Catch:{ all -> 0x018c }
        L_0x007c:
            boolean r0 = r1.f70523t     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0179
            r1.f70523t = r5     // Catch:{ all -> 0x018c }
            k0.d<j0.j1> r0 = r1.f70516j     // Catch:{ all -> 0x018c }
            int r4 = r0.f325783d     // Catch:{ all -> 0x018c }
            r6 = 0
            r7 = 0
        L_0x0088:
            java.lang.String r8 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            if (r6 >= r4) goto L_0x00ef
            int[] r10 = r0.f325780a     // Catch:{ all -> 0x018c }
            r10 = r10[r6]     // Catch:{ all -> 0x018c }
            k0.c<T>[] r11 = r0.f325782c     // Catch:{ all -> 0x018c }
            r11 = r11[r10]     // Catch:{ all -> 0x018c }
            gy3.C87412m.m108591d(r11)     // Catch:{ all -> 0x018c }
            int r12 = r11.f173545d     // Catch:{ all -> 0x018c }
            r13 = 0
            r14 = 0
        L_0x009b:
            if (r13 >= r12) goto L_0x00ce
            java.lang.Object[] r15 = r11.f173546e     // Catch:{ all -> 0x018c }
            r15 = r15[r13]     // Catch:{ all -> 0x018c }
            if (r15 == 0) goto L_0x00c8
            r5 = r15
            j0.j1 r5 = (p175j0.C24705j1) r5     // Catch:{ all -> 0x018c }
            j0.t r9 = r5.f70463a     // Catch:{ all -> 0x018c }
            if (r9 == 0) goto L_0x00b8
            j0.c r5 = r5.f70465c     // Catch:{ all -> 0x018c }
            if (r5 == 0) goto L_0x00b3
            boolean r5 = r5.mo51537a()     // Catch:{ all -> 0x018c }
            goto L_0x00b4
        L_0x00b3:
            r5 = 0
        L_0x00b4:
            if (r5 == 0) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            r5 = r5 ^ r3
            if (r5 != 0) goto L_0x00c4
            if (r14 == r13) goto L_0x00c2
            java.lang.Object[] r5 = r11.f173546e     // Catch:{ all -> 0x018c }
            r5[r14] = r15     // Catch:{ all -> 0x018c }
        L_0x00c2:
            int r14 = r14 + 1
        L_0x00c4:
            int r13 = r13 + 1
            r5 = 0
            goto L_0x009b
        L_0x00c8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x018c }
            r0.<init>(r8)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x00ce:
            int r5 = r11.f173545d     // Catch:{ all -> 0x018c }
            r8 = r14
        L_0x00d1:
            if (r8 >= r5) goto L_0x00db
            java.lang.Object[] r9 = r11.f173546e     // Catch:{ all -> 0x018c }
            r12 = 0
            r9[r8] = r12     // Catch:{ all -> 0x018c }
            int r8 = r8 + 1
            goto L_0x00d1
        L_0x00db:
            r11.f173545d = r14     // Catch:{ all -> 0x018c }
            if (r14 <= 0) goto L_0x00eb
            if (r7 == r6) goto L_0x00e9
            int[] r5 = r0.f325780a     // Catch:{ all -> 0x018c }
            r8 = r5[r7]     // Catch:{ all -> 0x018c }
            r5[r7] = r10     // Catch:{ all -> 0x018c }
            r5[r6] = r8     // Catch:{ all -> 0x018c }
        L_0x00e9:
            int r7 = r7 + 1
        L_0x00eb:
            int r6 = r6 + 1
            r5 = 0
            goto L_0x0088
        L_0x00ef:
            int r4 = r0.f325783d     // Catch:{ all -> 0x018c }
            r5 = r7
        L_0x00f2:
            if (r5 >= r4) goto L_0x0100
            java.lang.Object[] r6 = r0.f325781b     // Catch:{ all -> 0x018c }
            int[] r9 = r0.f325780a     // Catch:{ all -> 0x018c }
            r9 = r9[r5]     // Catch:{ all -> 0x018c }
            r10 = 0
            r6[r9] = r10     // Catch:{ all -> 0x018c }
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x0100:
            r0.f325783d = r7     // Catch:{ all -> 0x018c }
            k0.d<j0.b0<?>> r0 = r1.f70518o     // Catch:{ all -> 0x018c }
            int r4 = r0.f325783d     // Catch:{ all -> 0x018c }
            r5 = 0
            r6 = 0
        L_0x0108:
            if (r5 >= r4) goto L_0x0166
            int[] r7 = r0.f325780a     // Catch:{ all -> 0x018c }
            r7 = r7[r5]     // Catch:{ all -> 0x018c }
            k0.c<T>[] r9 = r0.f325782c     // Catch:{ all -> 0x018c }
            r9 = r9[r7]     // Catch:{ all -> 0x018c }
            gy3.C87412m.m108591d(r9)     // Catch:{ all -> 0x018c }
            int r10 = r9.f173545d     // Catch:{ all -> 0x018c }
            r11 = 0
            r12 = 0
        L_0x0119:
            if (r11 >= r10) goto L_0x0146
            java.lang.Object[] r13 = r9.f173546e     // Catch:{ all -> 0x018c }
            r13 = r13[r11]     // Catch:{ all -> 0x018c }
            if (r13 == 0) goto L_0x0140
            r14 = r13
            j0.b0 r14 = (p175j0.C24660b0) r14     // Catch:{ all -> 0x018c }
            k0.d<j0.j1> r15 = r1.f70516j     // Catch:{ all -> 0x018c }
            r15.getClass()     // Catch:{ all -> 0x018c }
            int r14 = r15.mo159856b(r14)     // Catch:{ all -> 0x018c }
            if (r14 < 0) goto L_0x0131
            r14 = 1
            goto L_0x0132
        L_0x0131:
            r14 = 0
        L_0x0132:
            r14 = r14 ^ r3
            if (r14 != 0) goto L_0x013d
            if (r12 == r11) goto L_0x013b
            java.lang.Object[] r14 = r9.f173546e     // Catch:{ all -> 0x018c }
            r14[r12] = r13     // Catch:{ all -> 0x018c }
        L_0x013b:
            int r12 = r12 + 1
        L_0x013d:
            int r11 = r11 + 1
            goto L_0x0119
        L_0x0140:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x018c }
            r0.<init>(r8)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x0146:
            int r10 = r9.f173545d     // Catch:{ all -> 0x018c }
            r11 = r12
        L_0x0149:
            if (r11 >= r10) goto L_0x0153
            java.lang.Object[] r13 = r9.f173546e     // Catch:{ all -> 0x018c }
            r14 = 0
            r13[r11] = r14     // Catch:{ all -> 0x018c }
            int r11 = r11 + 1
            goto L_0x0149
        L_0x0153:
            r9.f173545d = r12     // Catch:{ all -> 0x018c }
            if (r12 <= 0) goto L_0x0163
            if (r6 == r5) goto L_0x0161
            int[] r9 = r0.f325780a     // Catch:{ all -> 0x018c }
            r10 = r9[r6]     // Catch:{ all -> 0x018c }
            r9[r6] = r7     // Catch:{ all -> 0x018c }
            r9[r5] = r10     // Catch:{ all -> 0x018c }
        L_0x0161:
            int r6 = r6 + 1
        L_0x0163:
            int r5 = r5 + 1
            goto L_0x0108
        L_0x0166:
            int r3 = r0.f325783d     // Catch:{ all -> 0x018c }
            r4 = r6
        L_0x0169:
            if (r4 >= r3) goto L_0x0177
            java.lang.Object[] r5 = r0.f325781b     // Catch:{ all -> 0x018c }
            int[] r7 = r0.f325780a     // Catch:{ all -> 0x018c }
            r7 = r7[r4]     // Catch:{ all -> 0x018c }
            r8 = 0
            r5[r7] = r8     // Catch:{ all -> 0x018c }
            int r4 = r4 + 1
            goto L_0x0169
        L_0x0177:
            r0.f325783d = r6     // Catch:{ all -> 0x018c }
        L_0x0179:
            java.util.List<fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0>> r0 = r1.f70520q
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0186
            r2.mo51685d()
        L_0x0186:
            return
        L_0x0187:
            r0 = move-exception
            r3.mo51515f()     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            java.util.List<fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0>> r3 = r1.f70520q
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x019a
            r2.mo51685d()
        L_0x019a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C24722t.mo51676u(java.util.List):void");
    }

    /* renamed from: v */
    public final void mo51677v() {
        AtomicReference<Object> atomicReference = this.f70512f;
        Object obj = C108512u.f324834a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet == null) {
            return;
        }
        if (C87412m.m108589b(andSet, obj)) {
            throw new IllegalStateException("pending composition has not been applied".toString());
        } else if (andSet instanceof Set) {
            mo51675s((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set s : (Set[]) andSet) {
                mo51675s(s, true);
            }
        } else {
            throw new IllegalStateException(("corrupt pendingModifications drain: " + this.f70512f).toString());
        }
    }

    /* renamed from: w */
    public final void mo51678w() {
        Object andSet = this.f70512f.getAndSet((Object) null);
        if (C87412m.m108589b(andSet, C108512u.f324834a)) {
            return;
        }
        if (andSet instanceof Set) {
            mo51675s((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set s : (Set[]) andSet) {
                mo51675s(s, false);
            }
        } else if (andSet == null) {
            throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
        } else {
            throw new IllegalStateException(("corrupt pendingModifications drain: " + this.f70512f).toString());
        }
    }

    /* renamed from: x */
    public final C24711m0 mo51679x(C24705j1 j1Var, Object obj) {
        C24711m0 m0Var = C24711m0.IGNORED;
        C87412m.m108594g(j1Var, "scope");
        int i = j1Var.f70464b;
        boolean z = true;
        if ((i & 2) != 0) {
            j1Var.f70464b = i | 4;
        }
        C24663c cVar = j1Var.f70465c;
        if (cVar == null || !this.f70515i.mo51709m(cVar) || !cVar.mo51537a() || !cVar.mo51537a()) {
            return m0Var;
        }
        if (j1Var.f70466d == null) {
            z = false;
        }
        return !z ? m0Var : mo51680y(j1Var, cVar, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: k0.c} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (r1 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        return r1.mo51680y(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        r5.f70510d.mo51636i(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r5.f70526w.f70345D == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return p175j0.C24711m0.f70481e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return p175j0.C24711m0.f70482f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p175j0.C24711m0 mo51680y(p175j0.C24705j1 r6, p175j0.C24663c r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f70513g
            monitor-enter(r0)
            j0.t r1 = r5.f70524u     // Catch:{ all -> 0x007d }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            j0.z1 r3 = r5.f70515i     // Catch:{ all -> 0x007d }
            int r4 = r5.f70525v     // Catch:{ all -> 0x007d }
            boolean r3 = r3.mo51705i(r4, r7)     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0064
            j0.i r3 = r5.f70526w     // Catch:{ all -> 0x007d }
            boolean r4 = r3.f70345D     // Catch:{ all -> 0x007d }
            if (r4 == 0) goto L_0x0026
            boolean r3 = r3.mo51624z0(r6, r8)     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0026
            j0.m0 r6 = p175j0.C24711m0.IMMINENT     // Catch:{ all -> 0x007d }
            monitor-exit(r0)
            return r6
        L_0x0026:
            if (r8 != 0) goto L_0x002e
            k0.b<j0.j1, k0.c<java.lang.Object>> r3 = r5.f70522s     // Catch:{ all -> 0x007d }
            r3.mo51858b(r6, r2)     // Catch:{ all -> 0x007d }
            goto L_0x0064
        L_0x002e:
            k0.b<j0.j1, k0.c<java.lang.Object>> r3 = r5.f70522s     // Catch:{ all -> 0x007d }
            java.lang.Object r4 = p175j0.C108512u.f324834a     // Catch:{ all -> 0x007d }
            r3.getClass()     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "key"
            gy3.C87412m.m108594g(r6, r4)     // Catch:{ all -> 0x007d }
            int r4 = r3.mo51857a(r6)     // Catch:{ all -> 0x007d }
            if (r4 < 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x0057
            int r4 = r3.mo51857a(r6)     // Catch:{ all -> 0x007d }
            if (r4 < 0) goto L_0x004f
            java.lang.Object[] r2 = r3.f70839b     // Catch:{ all -> 0x007d }
            r2 = r2[r4]     // Catch:{ all -> 0x007d }
        L_0x004f:
            k0.c r2 = (p410k0.C60926c) r2     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x0064
            r2.add(r8)     // Catch:{ all -> 0x007d }
            goto L_0x0064
        L_0x0057:
            k0.c r2 = new k0.c     // Catch:{ all -> 0x007d }
            r2.<init>()     // Catch:{ all -> 0x007d }
            r2.add(r8)     // Catch:{ all -> 0x007d }
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x007d }
            r3.mo51858b(r6, r2)     // Catch:{ all -> 0x007d }
        L_0x0064:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x006c
            j0.m0 r6 = r1.mo51680y(r6, r7, r8)
            return r6
        L_0x006c:
            j0.r r6 = r5.f70510d
            r6.mo51636i(r5)
            j0.i r6 = r5.f70526w
            boolean r6 = r6.f70345D
            if (r6 == 0) goto L_0x007a
            j0.m0 r6 = p175j0.C24711m0.DEFERRED
            goto L_0x007c
        L_0x007a:
            j0.m0 r6 = p175j0.C24711m0.SCHEDULED
        L_0x007c:
            return r6
        L_0x007d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C24722t.mo51680y(j0.j1, j0.c, java.lang.Object):j0.m0");
    }

    /* renamed from: z */
    public final void mo51681z(Object obj) {
        C24711m0 m0Var;
        C108792d<C24705j1> dVar = this.f70516j;
        int b = dVar.mo159856b(obj);
        if (b >= 0) {
            C60926c<C24705j1> d = dVar.mo159858d(b);
            int i = 0;
            while (true) {
                if (i < d.f173545d) {
                    int i2 = i + 1;
                    Object obj2 = d.f173546e[i];
                    if (obj2 != null) {
                        C24705j1 j1Var = (C24705j1) obj2;
                        C24722t tVar = j1Var.f70463a;
                        if (tVar == null || (m0Var = tVar.mo51679x(j1Var, obj)) == null) {
                            m0Var = C24711m0.IGNORED;
                        }
                        if (m0Var == C24711m0.IMMINENT) {
                            this.f70521r.mo159855a(obj, j1Var);
                        }
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                } else {
                    return;
                }
            }
        }
    }
}
