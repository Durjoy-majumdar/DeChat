package gz3;

import fy3.C32226l;
import j04.C21150r;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import rx3.C13598b0;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26444d;
import wy3.C26447e;
import wy3.C26463h1;
import zz3.C26800l;
import zz3.C26802n;

/* renamed from: gz3.a */
public final class C24577a {

    /* renamed from: gz3.a$a */
    public static class C24578a extends C26800l {

        /* renamed from: a */
        public final /* synthetic */ C21150r f70160a;

        /* renamed from: b */
        public final /* synthetic */ Set f70161b;

        /* renamed from: c */
        public final /* synthetic */ boolean f70162c;

        /* renamed from: gz3.a$a$a */
        public class C20881a implements C32226l<C26436b, C13598b0> {
            public C20881a() {
            }

            public Object invoke(Object obj) {
                C26436b bVar = (C26436b) obj;
                if (bVar != null) {
                    C24578a.this.f70160a.mo17871a(bVar);
                    return C13598b0.f38549a;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
            }
        }

        public C24578a(C21150r rVar, Set set, boolean z) {
            this.f70160a = rVar;
            this.f70161b = set;
            this.f70162c = z;
        }

        /* renamed from: f */
        public static /* synthetic */ void m30760f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo51218a(C26436b bVar) {
            if (bVar != null) {
                C26802n.m35263r(bVar, new C20881a());
                this.f70161b.add(bVar);
                return;
            }
            m30760f(0);
            throw null;
        }

        /* renamed from: d */
        public void mo51295d(C26436b bVar, Collection<? extends C26436b> collection) {
            if (bVar == null) {
                m30760f(3);
                throw null;
            } else if (collection == null) {
                m30760f(4);
                throw null;
            } else if (!this.f70162c || bVar.mo52634f() == C26436b.C26437a.FAKE_OVERRIDE) {
                super.mo51295d(bVar, collection);
            }
        }

        /* renamed from: e */
        public void mo51219e(C26436b bVar, C26436b bVar2) {
            if (bVar == null) {
                m30760f(1);
                throw null;
            } else if (bVar2 == null) {
                m30760f(2);
                throw null;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m30755a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 18 ? 3 : 2)];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 18 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static C26463h1 m30756b(C22830f fVar, C26447e eVar) {
        if (fVar == null) {
            m30755a(19);
            throw null;
        } else if (eVar != null) {
            Collection<C26444d> q = eVar.mo51804q();
            if (q.size() != 1) {
                return null;
            }
            for (C26463h1 next : q.iterator().next().mo52639h()) {
                if (next.getName().equals(fVar)) {
                    return next;
                }
            }
            return null;
        } else {
            m30755a(20);
            throw null;
        }
    }

    /* renamed from: c */
    public static <D extends C26436b> Collection<D> m30757c(C22830f fVar, Collection<D> collection, Collection<D> collection2, C26447e eVar, C21150r rVar, C26802n nVar, boolean z) {
        if (fVar == null) {
            m30755a(12);
            throw null;
        } else if (collection == null) {
            m30755a(13);
            throw null;
        } else if (collection2 == null) {
            m30755a(14);
            throw null;
        } else if (eVar == null) {
            m30755a(15);
            throw null;
        } else if (rVar == null) {
            m30755a(16);
            throw null;
        } else if (nVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            nVar.mo53763h(fVar, collection, collection2, eVar, new C24578a(rVar, linkedHashSet, z));
            return linkedHashSet;
        } else {
            m30755a(17);
            throw null;
        }
    }

    /* renamed from: d */
    public static <D extends C26436b> Collection<D> m30758d(C22830f fVar, Collection<D> collection, Collection<D> collection2, C26447e eVar, C21150r rVar, C26802n nVar) {
        if (fVar == null) {
            m30755a(0);
            throw null;
        } else if (collection == null) {
            m30755a(1);
            throw null;
        } else if (collection2 == null) {
            m30755a(2);
            throw null;
        } else if (eVar == null) {
            m30755a(3);
            throw null;
        } else if (rVar == null) {
            m30755a(4);
            throw null;
        } else if (nVar != null) {
            return m30757c(fVar, collection, collection2, eVar, rVar, nVar, false);
        } else {
            m30755a(5);
            throw null;
        }
    }

    /* renamed from: e */
    public static <D extends C26436b> Collection<D> m30759e(C22830f fVar, Collection<D> collection, Collection<D> collection2, C26447e eVar, C21150r rVar, C26802n nVar) {
        if (fVar == null) {
            m30755a(6);
            throw null;
        } else if (collection == null) {
            m30755a(7);
            throw null;
        } else if (collection2 == null) {
            m30755a(8);
            throw null;
        } else if (eVar == null) {
            m30755a(9);
            throw null;
        } else if (rVar == null) {
            m30755a(10);
            throw null;
        } else if (nVar != null) {
            return m30757c(fVar, collection, collection2, eVar, rVar, nVar, true);
        } else {
            m30755a(11);
            throw null;
        }
    }
}
