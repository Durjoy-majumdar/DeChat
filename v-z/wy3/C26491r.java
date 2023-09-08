package wy3;

import h04.C24603f;
import h04.C24605h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import n04.C25143j0;
import sx3.C110826x0;
import t04.C26270m;
import wy3.C26470k1;
import zy3.C26757m0;
import zz3.C26794h;

/* renamed from: wy3.r */
public class C26491r {

    /* renamed from: a */
    public static final C26505s f73778a;

    /* renamed from: b */
    public static final C26505s f73779b;

    /* renamed from: c */
    public static final C26505s f73780c;

    /* renamed from: d */
    public static final C26505s f73781d;

    /* renamed from: e */
    public static final C26505s f73782e;

    /* renamed from: f */
    public static final C26505s f73783f;

    /* renamed from: g */
    public static final C26505s f73784g;

    /* renamed from: h */
    public static final C26505s f73785h;

    /* renamed from: i */
    public static final C26505s f73786i;

    /* renamed from: j */
    public static final Set<C26505s> f73787j;

    /* renamed from: k */
    public static final Map<C26505s, Integer> f73788k;

    /* renamed from: l */
    public static final C26505s f73789l;

    /* renamed from: m */
    public static final C24603f f73790m = new C26492a();

    /* renamed from: n */
    public static final C24603f f73791n = new C26493b();
    @Deprecated

    /* renamed from: o */
    public static final C24603f f73792o = new C26494c();

    /* renamed from: p */
    public static final C26270m f73793p;

    /* renamed from: q */
    public static final Map<C26481l1, C26505s> f73794q = new HashMap();

    /* renamed from: wy3.r$a */
    public static class C26492a implements C24603f {
        public C25143j0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: wy3.r$b */
    public static class C26493b implements C24603f {
        public C25143j0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: wy3.r$c */
    public static class C26494c implements C24603f {
        public C25143j0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: wy3.r$d */
    public static class C26495d extends C26487p {
        public C26495d(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34185e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            C26469k kVar2;
            if (oVar == null) {
                m34185e(1);
                throw null;
            } else if (kVar != null) {
                if (C26794h.m35233u(oVar)) {
                    if (kVar != null) {
                        if (C26794h.m35218f(kVar) != C26524z0.f73810a) {
                            return C26491r.m34181d(oVar, kVar);
                        }
                    } else {
                        m34185e(0);
                        throw null;
                    }
                }
                if (oVar instanceof C26467j) {
                    C26464i b = ((C26467j) oVar).mo51892b();
                    if (z && C26794h.m35230r(b) && C26794h.m35233u(b) && (kVar instanceof C26467j) && C26794h.m35233u(kVar.mo51892b()) && C26491r.m34181d(oVar, kVar)) {
                        return true;
                    }
                }
                C26469k kVar3 = oVar;
                while (kVar3 != null) {
                    C26469k b2 = kVar3.mo51892b();
                    if ((b2 instanceof C26447e) && !C26794h.m35225m(b2)) {
                        kVar2 = b2;
                        break;
                    }
                    boolean z2 = b2 instanceof C26465i0;
                    kVar3 = b2;
                    if (z2) {
                        kVar2 = b2;
                        break;
                    }
                }
                kVar2 = kVar3;
                if (kVar2 == null) {
                    return false;
                }
                while (kVar != null) {
                    if (kVar2 == kVar) {
                        return true;
                    }
                    if (kVar instanceof C26465i0) {
                        return (kVar2 instanceof C26465i0) && ((C26465i0) kVar2).mo53444d().equals(((C26465i0) kVar).mo53444d()) && C26794h.m35216d(kVar).equals(C26794h.m35216d(kVar2));
                    }
                    kVar = kVar.mo51892b();
                }
                return false;
            } else {
                m34185e(2);
                throw null;
            }
        }
    }

    /* renamed from: wy3.r$e */
    public static class C26496e extends C26487p {
        public C26496e(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34187e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            C26469k i;
            if (oVar == null) {
                m34187e(0);
                throw null;
            } else if (kVar != null) {
                if (C26491r.f73778a.mo51202c(fVar, oVar, kVar, z)) {
                    if (fVar == C26491r.f73791n) {
                        return true;
                    }
                    if (!(fVar == C26491r.f73790m || (i = C26794h.m35221i(oVar, C26447e.class)) == null || !(fVar instanceof C24605h))) {
                        return ((C24605h) fVar).mo51311k().mo36109a().equals(i.mo36109a());
                    }
                }
                return false;
            } else {
                m34187e(1);
                throw null;
            }
        }
    }

    /* renamed from: wy3.r$f */
    public static class C26497f extends C26487p {
        public C26497f(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34189e(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
            if (n04.C25102a0.m31816a(r0) == false) goto L_0x007c;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo51202c(h04.C24603f r7, wy3.C26485o r8, wy3.C26469k r9, boolean r10) {
            /*
                r6 = this;
                java.lang.Class<wy3.e> r0 = wy3.C26447e.class
                r1 = 0
                r2 = 0
                if (r8 == 0) goto L_0x0091
                r3 = 1
                if (r9 == 0) goto L_0x008d
                wy3.k r4 = zz3.C26794h.m35221i(r8, r0)
                wy3.e r4 = (wy3.C26447e) r4
                wy3.k r9 = zz3.C26794h.m35222j(r9, r0, r2)
                wy3.e r9 = (wy3.C26447e) r9
                if (r9 != 0) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 == 0) goto L_0x002f
                boolean r5 = zz3.C26794h.m35225m(r4)
                if (r5 == 0) goto L_0x002f
                wy3.k r4 = zz3.C26794h.m35221i(r4, r0)
                wy3.e r4 = (wy3.C26447e) r4
                if (r4 == 0) goto L_0x002f
                boolean r4 = zz3.C26794h.m35231s(r9, r4)
                if (r4 == 0) goto L_0x002f
                return r3
            L_0x002f:
                wy3.o r4 = zz3.C26794h.m35235w(r8)
                wy3.k r0 = zz3.C26794h.m35221i(r4, r0)
                wy3.e r0 = (wy3.C26447e) r0
                if (r0 != 0) goto L_0x003c
                return r2
            L_0x003c:
                boolean r0 = zz3.C26794h.m35231s(r9, r0)
                if (r0 == 0) goto L_0x0084
                if (r4 == 0) goto L_0x007f
                h04.f r0 = wy3.C26491r.f73792o
                if (r7 != r0) goto L_0x0049
                goto L_0x007c
            L_0x0049:
                boolean r0 = r4 instanceof wy3.C26436b
                if (r0 != 0) goto L_0x004e
                goto L_0x007b
            L_0x004e:
                boolean r0 = r4 instanceof wy3.C26467j
                if (r0 == 0) goto L_0x0053
                goto L_0x007b
            L_0x0053:
                h04.f r0 = wy3.C26491r.f73791n
                if (r7 != r0) goto L_0x0058
                goto L_0x007b
            L_0x0058:
                h04.f r0 = wy3.C26491r.f73790m
                if (r7 == r0) goto L_0x007c
                if (r7 != 0) goto L_0x005f
                goto L_0x007c
            L_0x005f:
                boolean r0 = r7 instanceof h04.C24604g
                if (r0 == 0) goto L_0x006b
                r0 = r7
                h04.g r0 = (h04.C24604g) r0
                n04.j0 r0 = r0.mo51313a()
                goto L_0x006f
            L_0x006b:
                n04.j0 r0 = r7.getType()
            L_0x006f:
                boolean r1 = zz3.C26794h.m35232t(r0, r9)
                if (r1 != 0) goto L_0x007b
                boolean r0 = n04.C25102a0.m31816a(r0)
                if (r0 == 0) goto L_0x007c
            L_0x007b:
                r2 = 1
            L_0x007c:
                if (r2 == 0) goto L_0x0084
                return r3
            L_0x007f:
                r7 = 2
                m34189e(r7)
                throw r1
            L_0x0084:
                wy3.k r9 = r9.mo51892b()
                boolean r7 = r6.mo51202c(r7, r8, r9, r10)
                return r7
            L_0x008d:
                m34189e(r3)
                throw r1
            L_0x0091:
                m34189e(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wy3.C26491r.C26497f.mo51202c(h04.f, wy3.o, wy3.k, boolean):boolean");
        }
    }

    /* renamed from: wy3.r$g */
    public static class C26498g extends C26487p {
        public C26498g(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34191e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m34191e(0);
                throw null;
            } else if (kVar != null) {
                if (!C26794h.m35216d(kVar).mo52622k0(C26794h.m35216d(oVar))) {
                    return false;
                }
                return C26491r.f73793p.mo53162a(oVar, kVar);
            } else {
                m34191e(1);
                throw null;
            }
        }
    }

    /* renamed from: wy3.r$h */
    public static class C26499h extends C26487p {
        public C26499h(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34193e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m34193e(0);
                throw null;
            } else if (kVar != null) {
                return true;
            } else {
                m34193e(1);
                throw null;
            }
        }
    }

    /* renamed from: wy3.r$i */
    public static class C26500i extends C26487p {
        public C26500i(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34195e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m34195e(0);
                throw null;
            } else if (kVar == null) {
                m34195e(1);
                throw null;
            } else {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        }
    }

    /* renamed from: wy3.r$j */
    public static class C26501j extends C26487p {
        public C26501j(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34197e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m34197e(0);
                throw null;
            } else if (kVar == null) {
                m34197e(1);
                throw null;
            } else {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        }
    }

    /* renamed from: wy3.r$k */
    public static class C26502k extends C26487p {
        public C26502k(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34199e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m34199e(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                m34199e(1);
                throw null;
            }
        }
    }

    /* renamed from: wy3.r$l */
    public static class C26503l extends C26487p {
        public C26503l(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m34201e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m34201e(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                m34201e(1);
                throw null;
            }
        }
    }

    static {
        Class<C26270m> cls = C26270m.class;
        C26495d dVar = new C26495d(C26470k1.C26475e.f73767c);
        f73778a = dVar;
        C26496e eVar = new C26496e(C26470k1.C26476f.f73768c);
        f73779b = eVar;
        C26497f fVar = new C26497f(C26470k1.C26477g.f73769c);
        f73780c = fVar;
        C26498g gVar = new C26498g(C26470k1.C26472b.f73764c);
        f73781d = gVar;
        C26499h hVar = new C26499h(C26470k1.C26478h.f73770c);
        f73782e = hVar;
        C26500i iVar = new C26500i(C26470k1.C26474d.f73766c);
        f73783f = iVar;
        C26501j jVar = new C26501j(C26470k1.C26471a.f73763c);
        f73784g = jVar;
        C26502k kVar = new C26502k(C26470k1.C26473c.f73765c);
        f73785h = kVar;
        C26503l lVar = new C26503l(C26470k1.C26479i.f73771c);
        f73786i = lVar;
        f73787j = Collections.unmodifiableSet(C110826x0.m151017e(dVar, eVar, gVar, iVar));
        HashMap hashMap = new HashMap(6);
        hashMap.put(eVar, 0);
        hashMap.put(dVar, 0);
        hashMap.put(gVar, 1);
        hashMap.put(fVar, 1);
        hashMap.put(hVar, 2);
        f73788k = Collections.unmodifiableMap(hashMap);
        f73789l = hVar;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        f73793p = it.hasNext() ? (C26270m) it.next() : C26270m.C26271a.f73204a;
        m34183f(dVar);
        m34183f(eVar);
        m34183f(fVar);
        m34183f(gVar);
        m34183f(hVar);
        m34183f(iVar);
        m34183f(jVar);
        m34183f(kVar);
        m34183f(lVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m34178a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 16 ? 3 : 2)];
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 16 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static Integer m34179b(C26505s sVar, C26505s sVar2) {
        if (sVar == null) {
            m34178a(12);
            throw null;
        } else if (sVar2 != null) {
            Integer a = sVar.mo53463a().mo37187a(sVar2.mo53463a());
            if (a != null) {
                return a;
            }
            Integer a2 = sVar2.mo53463a().mo37187a(sVar.mo53463a());
            if (a2 != null) {
                return Integer.valueOf(-a2.intValue());
            }
            return null;
        } else {
            m34178a(13);
            throw null;
        }
    }

    /* renamed from: c */
    public static C26485o m34180c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
        C26485o c;
        if (oVar == null) {
            m34178a(8);
            throw null;
        } else if (kVar != null) {
            C26485o oVar2 = (C26485o) oVar.mo36109a();
            while (oVar2 != null && oVar2.getVisibility() != f73783f) {
                if (!oVar2.getVisibility().mo51202c(fVar, oVar2, kVar, z)) {
                    return oVar2;
                }
                oVar2 = (C26485o) C26794h.m35221i(oVar2, C26485o.class);
            }
            if (!(oVar instanceof C26757m0) || (c = m34180c(fVar, ((C26757m0) oVar).mo53739e0(), kVar, z)) == null) {
                return null;
            }
            return c;
        } else {
            m34178a(9);
            throw null;
        }
    }

    /* renamed from: d */
    public static boolean m34181d(C26469k kVar, C26469k kVar2) {
        if (kVar == null) {
            m34178a(6);
            throw null;
        } else if (kVar2 != null) {
            C26524z0 f = C26794h.m35218f(kVar2);
            if (f != C26524z0.f73810a) {
                return f.equals(C26794h.m35218f(kVar));
            }
            return false;
        } else {
            m34178a(7);
            throw null;
        }
    }

    /* renamed from: e */
    public static boolean m34182e(C26505s sVar) {
        if (sVar != null) {
            return sVar == f73778a || sVar == f73779b;
        }
        m34178a(14);
        throw null;
    }

    /* renamed from: f */
    public static void m34183f(C26505s sVar) {
        f73794q.put(sVar.mo53463a(), sVar);
    }

    /* renamed from: g */
    public static C26505s m34184g(C26481l1 l1Var) {
        if (l1Var != null) {
            C26505s sVar = (C26505s) ((HashMap) f73794q).get(l1Var);
            if (sVar != null) {
                return sVar;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + l1Var);
        }
        m34178a(15);
        throw null;
    }
}
