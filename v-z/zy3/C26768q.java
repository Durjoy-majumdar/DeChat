package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import ez3.C24476d;
import fy3.C32224a;
import fy3.C32226l;
import g04.C20770i;
import g04.C24531d;
import g04.C24538j;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m04.C21480i;
import m04.C24959e;
import m04.C24975g;
import m04.C24980n;
import n04.C25127i;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25165p;
import n04.C25176s0;
import o04.C25323e;
import rx3.C13598b0;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26444d;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26453f;
import wy3.C26455f1;
import wy3.C26469k;
import wy3.C26491r;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26520x0;
import wy3.C26521y0;
import xy3.C26571h;
import zz3.C26800l;
import zz3.C26802n;

/* renamed from: zy3.q */
public class C26768q extends C26752j {

    /* renamed from: n */
    public final C25144j1 f74431n;

    /* renamed from: o */
    public final C20770i f74432o;

    /* renamed from: p */
    public final C21480i<Set<C22830f>> f74433p;

    /* renamed from: q */
    public final C26571h f74434q;

    /* renamed from: zy3.q$a */
    public class C26769a extends C24538j {

        /* renamed from: b */
        public final C24975g<C22830f, Collection<? extends C26520x0>> f74435b;

        /* renamed from: c */
        public final C24975g<C22830f, Collection<? extends C26504r0>> f74436c;

        /* renamed from: d */
        public final C21480i<Collection<C26469k>> f74437d;

        /* renamed from: e */
        public final /* synthetic */ C26768q f74438e;

        /* renamed from: zy3.q$a$a */
        public class C26770a implements C32226l<C22830f, Collection<? extends C26520x0>> {
            public C26770a(C26768q qVar) {
            }

            public Object invoke(Object obj) {
                C22830f fVar = (C22830f) obj;
                C26769a aVar = C26769a.this;
                if (fVar != null) {
                    return aVar.mo53747j(fVar, aVar.mo53746i().mo32456a(fVar, C24476d.FOR_NON_TRACKED_SCOPE));
                }
                aVar.getClass();
                C26769a.m35076h(8);
                throw null;
            }
        }

        /* renamed from: zy3.q$a$b */
        public class C26771b implements C32226l<C22830f, Collection<? extends C26504r0>> {
            public C26771b(C26768q qVar) {
            }

            public Object invoke(Object obj) {
                C22830f fVar = (C22830f) obj;
                C26769a aVar = C26769a.this;
                if (fVar != null) {
                    return aVar.mo53747j(fVar, aVar.mo53746i().mo32457b(fVar, C24476d.FOR_NON_TRACKED_SCOPE));
                }
                aVar.getClass();
                C26769a.m35076h(4);
                throw null;
            }
        }

        /* renamed from: zy3.q$a$c */
        public class C26772c implements C32224a<Collection<C26469k>> {
            public C26772c(C26768q qVar) {
            }

            public Object invoke() {
                C26769a aVar = C26769a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (C22830f fVar : (Set) aVar.f74438e.f74433p.invoke()) {
                    if (fVar != null) {
                        Collection collection = (Collection) ((C24959e.C24972m) aVar.f74435b).invoke(fVar);
                        if (collection != null) {
                            hashSet.addAll(collection);
                            Collection collection2 = (Collection) ((C24959e.C24972m) aVar.f74436c).invoke(fVar);
                            if (collection2 != null) {
                                hashSet.addAll(collection2);
                            } else {
                                C26769a.m35076h(3);
                                throw null;
                            }
                        } else {
                            C26769a.m35076h(7);
                            throw null;
                        }
                    } else {
                        C26769a.m35076h(5);
                        throw null;
                    }
                }
                return hashSet;
            }
        }

        /* renamed from: zy3.q$a$d */
        public class C26773d extends C26800l {

            /* renamed from: a */
            public final /* synthetic */ Set f74442a;

            public C26773d(C26769a aVar, Set set) {
                this.f74442a = set;
            }

            /* renamed from: f */
            public static /* synthetic */ void m35085f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* renamed from: a */
            public void mo51218a(C26436b bVar) {
                if (bVar != null) {
                    C26802n.m35263r(bVar, (C32226l<C26436b, C13598b0>) null);
                    this.f74442a.add(bVar);
                    return;
                }
                m35085f(0);
                throw null;
            }

            /* renamed from: e */
            public void mo51219e(C26436b bVar, C26436b bVar2) {
                if (bVar == null) {
                    m35085f(1);
                    throw null;
                } else if (bVar2 == null) {
                    m35085f(2);
                    throw null;
                }
            }
        }

        public C26769a(C26768q qVar, C24980n nVar) {
            if (nVar != null) {
                this.f74438e = qVar;
                this.f74435b = nVar.mo52007h(new C26770a(qVar));
                this.f74436c = nVar.mo52007h(new C26771b(qVar));
                this.f74437d = nVar.mo52006g(new C26772c(qVar));
                return;
            }
            m35076h(0);
            throw null;
        }

        /* renamed from: h */
        public static /* synthetic */ void m35076h(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = FirebaseAnalytics.C113379b.LOCATION;
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: a */
        public Collection<? extends C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
            if (fVar == null) {
                m35076h(5);
                throw null;
            } else if (bVar != null) {
                Collection<? extends C26520x0> collection = (Collection) ((C24959e.C24972m) this.f74435b).invoke(fVar);
                if (collection != null) {
                    return collection;
                }
                m35076h(7);
                throw null;
            } else {
                m35076h(6);
                throw null;
            }
        }

        /* renamed from: b */
        public Collection<? extends C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
            if (fVar == null) {
                m35076h(1);
                throw null;
            } else if (bVar != null) {
                Collection<? extends C26504r0> collection = (Collection) ((C24959e.C24972m) this.f74436c).invoke(fVar);
                if (collection != null) {
                    return collection;
                }
                m35076h(3);
                throw null;
            } else {
                m35076h(2);
                throw null;
            }
        }

        /* renamed from: c */
        public Set<C22830f> mo32458c() {
            Set<C22830f> set = (Set) this.f74438e.f74433p.invoke();
            if (set != null) {
                return set;
            }
            m35076h(17);
            throw null;
        }

        /* renamed from: d */
        public Set<C22830f> mo32459d() {
            Set<C22830f> set = (Set) this.f74438e.f74433p.invoke();
            if (set != null) {
                return set;
            }
            m35076h(19);
            throw null;
        }

        /* renamed from: e */
        public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
            if (dVar == null) {
                m35076h(13);
                throw null;
            } else if (lVar != null) {
                Collection<C26469k> collection = (Collection) this.f74437d.invoke();
                if (collection != null) {
                    return collection;
                }
                m35076h(15);
                throw null;
            } else {
                m35076h(14);
                throw null;
            }
        }

        /* renamed from: f */
        public Set<C22830f> mo32461f() {
            Set<C22830f> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            m35076h(18);
            throw null;
        }

        /* renamed from: i */
        public final C20770i mo53746i() {
            C20770i n = ((C25127i) this.f74438e.mo36110l()).mo37096r().iterator().next().mo37088n();
            if (n != null) {
                return n;
            }
            m35076h(9);
            throw null;
        }

        /* renamed from: j */
        public final <D extends C26436b> Collection<? extends D> mo53747j(C22830f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                m35076h(10);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C26802n.f74534f.mo53763h(fVar, collection, Collections.emptySet(), this.f74438e, new C26773d(this, linkedHashSet));
                return linkedHashSet;
            } else {
                m35076h(11);
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26768q(C24980n nVar, C26447e eVar, C25143j0 j0Var, C22830f fVar, C21480i<Set<C22830f>> iVar, C26571h hVar, C26521y0 y0Var) {
        super(nVar, eVar, fVar, y0Var, false);
        if (nVar == null) {
            m35057U(6);
            throw null;
        } else if (eVar == null) {
            m35057U(7);
            throw null;
        } else if (j0Var == null) {
            m35057U(8);
            throw null;
        } else if (fVar == null) {
            m35057U(9);
            throw null;
        } else if (iVar == null) {
            m35057U(10);
            throw null;
        } else if (hVar == null) {
            m35057U(11);
            throw null;
        } else if (y0Var != null) {
            this.f74434q = hVar;
            this.f74431n = new C25165p(this, Collections.emptyList(), Collections.singleton(j0Var), nVar);
            this.f74432o = new C26769a(this, nVar);
            this.f74433p = iVar;
        } else {
            m35057U(12);
            throw null;
        }
    }

    /* renamed from: J0 */
    public static C26768q m35056J0(C24980n nVar, C26447e eVar, C22830f fVar, C21480i<Set<C22830f>> iVar, C26571h hVar, C26521y0 y0Var) {
        if (nVar == null) {
            m35057U(0);
            throw null;
        } else if (eVar == null) {
            m35057U(1);
            throw null;
        } else if (fVar == null) {
            m35057U(2);
            throw null;
        } else if (iVar == null) {
            m35057U(3);
            throw null;
        } else if (hVar == null) {
            m35057U(4);
            throw null;
        } else if (y0Var != null) {
            return new C26768q(nVar, eVar, eVar.mo36111s(), fVar, iVar, hVar, y0Var);
        } else {
            m35057U(5);
            throw null;
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m35057U(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: A0 */
    public C26447e mo51787A0() {
        return null;
    }

    /* renamed from: K */
    public C26455f1<C25176s0> mo51789K() {
        return null;
    }

    /* renamed from: N */
    public C20770i mo51790N(C25323e eVar) {
        if (eVar != null) {
            C20770i iVar = this.f74432o;
            if (iVar != null) {
                return iVar;
            }
            m35057U(14);
            throw null;
        }
        m35057U(13);
        throw null;
    }

    /* renamed from: O */
    public boolean mo51791O() {
        return false;
    }

    /* renamed from: P */
    public boolean mo51792P() {
        return false;
    }

    /* renamed from: Q */
    public C20770i mo51793Q() {
        C20770i.C20773b bVar = C20770i.C20773b.f58684b;
        if (bVar != null) {
            return bVar;
        }
        m35057U(15);
        throw null;
    }

    /* renamed from: W */
    public boolean mo51794W() {
        return false;
    }

    /* renamed from: Y */
    public boolean mo51795Y() {
        return false;
    }

    /* renamed from: f */
    public C26453f mo51796f() {
        return C26453f.ENUM_ENTRY;
    }

    public C26571h getAnnotations() {
        C26571h hVar = this.f74434q;
        if (hVar != null) {
            return hVar;
        }
        m35057U(21);
        throw null;
    }

    public C26505s getVisibility() {
        C26505s sVar = C26491r.f73782e;
        if (sVar != null) {
            return sVar;
        }
        m35057U(20);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public C26442c0 mo51802j() {
        return C26442c0.FINAL;
    }

    /* renamed from: l */
    public C25144j1 mo36110l() {
        C25144j1 j1Var = this.f74431n;
        if (j1Var != null) {
            return j1Var;
        }
        m35057U(17);
        throw null;
    }

    /* renamed from: p0 */
    public Collection<C26447e> mo51803p0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m35057U(23);
        throw null;
    }

    /* renamed from: q */
    public Collection<C26444d> mo51804q() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m35057U(16);
        throw null;
    }

    /* renamed from: t */
    public List<C26446d1> mo51805t() {
        List<C26446d1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m35057U(22);
        throw null;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    /* renamed from: v */
    public C26444d mo51807v() {
        return null;
    }

    /* renamed from: v0 */
    public boolean mo51808v0() {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo51809x0() {
        return false;
    }

    /* renamed from: z0 */
    public boolean mo51810z0() {
        return false;
    }
}
