package zy3;

import d04.C24442a;
import fy3.C32226l;
import g04.C20770i;
import g04.C27077n;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m04.C24959e;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25158m1;
import n04.C25159n;
import n04.C25165p;
import n04.C25167p1;
import n04.C25176s0;
import n04.C25180t1;
import n04.C25187v1;
import n04.C25192x;
import n04.C25202z1;
import o04.C25323e;
import q04.C25528k;
import rx3.C13603j;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import vz3.C22830f;
import wy3.C26442c0;
import wy3.C26444d;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26453f;
import wy3.C26454f0;
import wy3.C26455f1;
import wy3.C26469k;
import wy3.C26480l;
import wy3.C26482m;
import wy3.C26505s;
import wy3.C26509u0;
import wy3.C26519x;
import wy3.C26521y0;
import xy3.C26571h;
import zz3.C26794h;

/* renamed from: zy3.v */
public class C26784v extends C26787w {

    /* renamed from: d */
    public final C26787w f74510d;

    /* renamed from: e */
    public final C25180t1 f74511e;

    /* renamed from: f */
    public C25180t1 f74512f;

    /* renamed from: g */
    public List<C26446d1> f74513g;

    /* renamed from: h */
    public List<C26446d1> f74514h;

    /* renamed from: i */
    public C25144j1 f74515i;

    /* renamed from: zy3.v$a */
    public class C26785a implements C32226l<C26446d1, Boolean> {
        public C26785a(C26784v vVar) {
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(!((C26446d1) obj).mo53427x());
        }
    }

    /* renamed from: zy3.v$b */
    public class C26786b implements C32226l<C25176s0, C25176s0> {
        public C26786b() {
        }

        public Object invoke(Object obj) {
            C25176s0 s0Var = (C25176s0) obj;
            C26784v vVar = C26784v.this;
            if (s0Var != null) {
                return vVar.f74511e.mo52312h() ? s0Var : (C25176s0) vVar.mo53754I0().mo52314k(s0Var, C25202z1.INVARIANT);
            }
            vVar.getClass();
            return s0Var;
        }
    }

    public C26784v(C26787w wVar, C25180t1 t1Var) {
        this.f74510d = wVar;
        this.f74511e = t1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3 A[ADDED_TO_REGION] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m35161U(int r15) {
        /*
            r0 = 23
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L_0x001f
            if (r15 == r6) goto L_0x001f
            if (r15 == r5) goto L_0x001f
            if (r15 == r4) goto L_0x001f
            if (r15 == r3) goto L_0x001f
            if (r15 == r2) goto L_0x001f
            if (r15 == r1) goto L_0x001f
            if (r15 == r0) goto L_0x001f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L_0x0021
        L_0x001f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L_0x0021:
            if (r15 == r7) goto L_0x0033
            if (r15 == r6) goto L_0x0033
            if (r15 == r5) goto L_0x0033
            if (r15 == r4) goto L_0x0033
            if (r15 == r3) goto L_0x0033
            if (r15 == r2) goto L_0x0033
            if (r15 == r1) goto L_0x0033
            if (r15 == r0) goto L_0x0033
            r9 = 2
            goto L_0x0034
        L_0x0033:
            r9 = 3
        L_0x0034:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L_0x005b
            if (r15 == r6) goto L_0x0056
            if (r15 == r5) goto L_0x0051
            if (r15 == r4) goto L_0x0056
            if (r15 == r3) goto L_0x005b
            if (r15 == r2) goto L_0x0051
            if (r15 == r1) goto L_0x0056
            if (r15 == r0) goto L_0x004c
            r9[r11] = r10
            goto L_0x005f
        L_0x004c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L_0x005f
        L_0x0051:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L_0x005f
        L_0x0056:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L_0x005f
        L_0x005b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L_0x005f:
            java.lang.String r11 = "substitute"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "getMemberScope"
            r14 = 1
            switch(r15) {
                case 2: goto L_0x00c2;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00bf;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00bc;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00ad;
                case 18: goto L_0x00a8;
                case 19: goto L_0x00a3;
                case 20: goto L_0x009e;
                case 21: goto L_0x0099;
                case 22: goto L_0x0094;
                case 23: goto L_0x00c2;
                case 24: goto L_0x0091;
                case 25: goto L_0x008c;
                case 26: goto L_0x0087;
                case 27: goto L_0x0082;
                case 28: goto L_0x007d;
                case 29: goto L_0x0078;
                case 30: goto L_0x0073;
                case 31: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto L_0x00c4
        L_0x006e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0073:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0078:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto L_0x00c4
        L_0x007d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0082:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0087:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto L_0x00c4
        L_0x008c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0091:
            r9[r14] = r11
            goto L_0x00c4
        L_0x0094:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0099:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto L_0x00c4
        L_0x009e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00ad:
            java.lang.String r10 = "getContextReceivers"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b2:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00bc:
            r9[r14] = r12
            goto L_0x00c4
        L_0x00bf:
            r9[r14] = r13
            goto L_0x00c4
        L_0x00c2:
            r9[r14] = r10
        L_0x00c4:
            if (r15 == r7) goto L_0x00db
            if (r15 == r6) goto L_0x00db
            if (r15 == r5) goto L_0x00db
            if (r15 == r4) goto L_0x00db
            if (r15 == r3) goto L_0x00db
            if (r15 == r2) goto L_0x00db
            if (r15 == r1) goto L_0x00d8
            if (r15 == r0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            r9[r7] = r11
            goto L_0x00dd
        L_0x00d8:
            r9[r7] = r12
            goto L_0x00dd
        L_0x00db:
            r9[r7] = r13
        L_0x00dd:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto L_0x00f7
            if (r15 == r6) goto L_0x00f7
            if (r15 == r5) goto L_0x00f7
            if (r15 == r4) goto L_0x00f7
            if (r15 == r3) goto L_0x00f7
            if (r15 == r2) goto L_0x00f7
            if (r15 == r1) goto L_0x00f7
            if (r15 == r0) goto L_0x00f7
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto L_0x00fc
        L_0x00f7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        L_0x00fc:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: zy3.C26784v.m35161U(int):void");
    }

    /* renamed from: A0 */
    public C26447e mo51787A0() {
        return this.f74510d.mo51787A0();
    }

    /* renamed from: D */
    public C20770i mo52591D(C25167p1 p1Var, C25323e eVar) {
        if (p1Var == null) {
            m35161U(5);
            throw null;
        } else if (eVar != null) {
            C20770i D = this.f74510d.mo52591D(p1Var, eVar);
            if (!this.f74511e.mo52312h()) {
                return new C27077n(D, mo53754I0());
            }
            if (D != null) {
                return D;
            }
            m35161U(7);
            throw null;
        } else {
            m35161U(6);
            throw null;
        }
    }

    /* renamed from: I0 */
    public final C25180t1 mo53754I0() {
        if (this.f74512f == null) {
            if (this.f74511e.mo52312h()) {
                this.f74512f = this.f74511e;
            } else {
                List<C26446d1> parameters = this.f74510d.mo36110l().getParameters();
                this.f74513g = new ArrayList(parameters.size());
                this.f74512f = C25192x.m32115b(parameters, this.f74511e.mo52311g(), this, this.f74513g);
                this.f74514h = C110818d0.m150911I(this.f74513g, new C26785a(this));
            }
        }
        return this.f74512f;
    }

    /* renamed from: K */
    public C26455f1<C25176s0> mo51789K() {
        C26455f1<C25176s0> K = this.f74510d.mo51789K();
        if (K == null) {
            return null;
        }
        C26786b bVar = new C26786b();
        if (K instanceof C26519x) {
            C26519x xVar = (C26519x) K;
            return new C26519x(xVar.f73806a, (C25528k) bVar.invoke(xVar.f73807b));
        } else if (K instanceof C26454f0) {
            List<C13604l<C22830f, C25176s0>> a = K.mo53432a();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(a, 10));
            for (C13604l lVar : a) {
                arrayList.add(new C13604l((C22830f) lVar.f38555d, bVar.invoke((C25528k) lVar.f38556e)));
            }
            return new C26454f0(arrayList);
        } else {
            throw new C13603j();
        }
    }

    /* renamed from: N */
    public C20770i mo51790N(C25323e eVar) {
        if (eVar != null) {
            C20770i N = this.f74510d.mo51790N(eVar);
            if (!this.f74511e.mo52312h()) {
                return new C27077n(N, mo53754I0());
            }
            if (N != null) {
                return N;
            }
            m35161U(14);
            throw null;
        }
        m35161U(13);
        throw null;
    }

    /* renamed from: O */
    public boolean mo51791O() {
        return this.f74510d.mo51791O();
    }

    /* renamed from: P */
    public boolean mo51792P() {
        return this.f74510d.mo51792P();
    }

    /* renamed from: Q */
    public C20770i mo51793Q() {
        C20770i Q = this.f74510d.mo51793Q();
        if (Q != null) {
            return Q;
        }
        m35161U(15);
        throw null;
    }

    /* renamed from: W */
    public boolean mo51794W() {
        return this.f74510d.mo51794W();
    }

    /* renamed from: Y */
    public boolean mo51795Y() {
        return this.f74510d.mo51795Y();
    }

    /* renamed from: a */
    public C26447e mo36109a() {
        C26447e a = this.f74510d.mo36109a();
        if (a != null) {
            return a;
        }
        m35161U(21);
        throw null;
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        C26469k b = this.f74510d.mo51892b();
        if (b != null) {
            return b;
        }
        m35161U(22);
        throw null;
    }

    /* renamed from: c */
    public C26480l mo51921c(C25180t1 t1Var) {
        if (t1Var != null) {
            return t1Var.mo52312h() ? this : new C26784v(this, C25180t1.m32045f(t1Var.mo52311g(), mo53754I0().mo52311g()));
        }
        m35161U(23);
        throw null;
    }

    /* renamed from: f */
    public C26453f mo51796f() {
        C26453f f = this.f74510d.mo51796f();
        if (f != null) {
            return f;
        }
        m35161U(25);
        throw null;
    }

    /* renamed from: f0 */
    public C20770i mo51797f0() {
        C20770i f0 = this.f74510d.mo51797f0();
        if (f0 != null) {
            return f0;
        }
        m35161U(28);
        throw null;
    }

    /* renamed from: g0 */
    public C20770i mo51798g0() {
        C20770i N = mo51790N(C24442a.m30542i(C26794h.m35216d(this.f74510d)));
        if (N != null) {
            return N;
        }
        m35161U(12);
        throw null;
    }

    public C26571h getAnnotations() {
        C26571h annotations = this.f74510d.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        m35161U(19);
        throw null;
    }

    public C22830f getName() {
        C22830f name = this.f74510d.getName();
        if (name != null) {
            return name;
        }
        m35161U(20);
        throw null;
    }

    public C26521y0 getSource() {
        return C26521y0.f73808a;
    }

    public C26505s getVisibility() {
        C26505s visibility = this.f74510d.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        m35161U(27);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo53456j(this, d);
    }

    public boolean isExternal() {
        return this.f74510d.isExternal();
    }

    public boolean isInline() {
        return this.f74510d.isInline();
    }

    /* renamed from: j */
    public C26442c0 mo51802j() {
        C26442c0 j = this.f74510d.mo51802j();
        if (j != null) {
            return j;
        }
        m35161U(26);
        throw null;
    }

    /* renamed from: l */
    public C25144j1 mo36110l() {
        C25144j1 l = this.f74510d.mo36110l();
        if (!this.f74511e.mo52312h()) {
            if (this.f74515i == null) {
                C25180t1 I0 = mo53754I0();
                Collection<C25143j0> r = l.mo37096r();
                ArrayList arrayList = new ArrayList(r.size());
                for (C25143j0 k : r) {
                    arrayList.add(I0.mo52314k(k, C25202z1.INVARIANT));
                }
                this.f74515i = new C25165p(this, this.f74513g, arrayList, C24959e.f71117e);
            }
            C25144j1 j1Var = this.f74515i;
            if (j1Var != null) {
                return j1Var;
            }
            m35161U(1);
            throw null;
        } else if (l != null) {
            return l;
        } else {
            m35161U(0);
            throw null;
        }
    }

    /* renamed from: o0 */
    public C26509u0 mo53429o0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p0 */
    public Collection<C26447e> mo51803p0() {
        Collection<C26447e> p0 = this.f74510d.mo51803p0();
        if (p0 != null) {
            return p0;
        }
        m35161U(31);
        throw null;
    }

    /* renamed from: q */
    public Collection<C26444d> mo51804q() {
        Collection<C26444d> q = this.f74510d.mo51804q();
        ArrayList arrayList = new ArrayList(q.size());
        for (C26444d next : q) {
            arrayList.add(((C26444d) next.mo52597p().mo52611l(next.mo36109a()).mo52606g(next.mo51802j()).mo52613n(next.getVisibility()).mo52609j(next.mo52634f()).mo52608i(false).build()).mo51921c(mo53754I0()));
        }
        return arrayList;
    }

    /* renamed from: s */
    public C25176s0 mo36111s() {
        C25122g1 g1Var;
        List<C25158m1> e = C25187v1.m32085e(mo36110l().getParameters());
        C26571h annotations = getAnnotations();
        C87412m.m108594g(annotations, "annotations");
        if (annotations.isEmpty()) {
            C25122g1.f71557e.getClass();
            g1Var = C25122g1.f71558f;
        } else {
            g1Var = C25122g1.f71557e.mo33818c(C26236u.m33719b(new C25159n(annotations)));
        }
        return C25146k0.m31962h(g1Var, mo36110l(), e, false, mo51798g0());
    }

    /* renamed from: t */
    public List<C26446d1> mo51805t() {
        mo53754I0();
        List<C26446d1> list = this.f74514h;
        if (list != null) {
            return list;
        }
        m35161U(30);
        throw null;
    }

    /* renamed from: t0 */
    public C20770i mo53430t0(C25167p1 p1Var) {
        if (p1Var != null) {
            C20770i D = mo52591D(p1Var, C24442a.m30542i(C26794h.m35216d(this)));
            if (D != null) {
                return D;
            }
            m35161U(11);
            throw null;
        }
        m35161U(10);
        throw null;
    }

    /* renamed from: v */
    public C26444d mo51807v() {
        return this.f74510d.mo51807v();
    }

    /* renamed from: v0 */
    public boolean mo51808v0() {
        return this.f74510d.mo51808v0();
    }

    /* renamed from: w0 */
    public List<C26509u0> mo51894w0() {
        List<C26509u0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m35161U(17);
        throw null;
    }

    /* renamed from: x0 */
    public boolean mo51809x0() {
        return this.f74510d.mo51809x0();
    }

    /* renamed from: z0 */
    public boolean mo51810z0() {
        return this.f74510d.mo51810z0();
    }
}
