package fz3;

import az3.C23637a;
import az3.C23638b;
import az3.C23639c;
import h04.C24603f;
import java.util.HashMap;
import java.util.Map;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26481l1;
import wy3.C26485o;
import wy3.C26487p;
import wy3.C26491r;
import wy3.C26505s;
import zz3.C26794h;

/* renamed from: fz3.v */
public class C24517v {

    /* renamed from: a */
    public static final C26505s f70076a;

    /* renamed from: b */
    public static final C26505s f70077b;

    /* renamed from: c */
    public static final C26505s f70078c;

    /* renamed from: d */
    public static final Map<C26481l1, C26505s> f70079d;

    /* renamed from: fz3.v$a */
    public static class C24518a extends C26487p {
        public C24518a(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m30657e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m30657e(0);
                throw null;
            } else if (kVar != null) {
                return C24517v.m30656c(oVar, kVar);
            } else {
                m30657e(1);
                throw null;
            }
        }
    }

    /* renamed from: fz3.v$b */
    public static class C24519b extends C26487p {
        public C24519b(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m30659e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m30659e(0);
                throw null;
            } else if (kVar != null) {
                return C24517v.m30655b(fVar, oVar, kVar);
            } else {
                m30659e(1);
                throw null;
            }
        }
    }

    /* renamed from: fz3.v$c */
    public static class C24520c extends C26487p {
        public C24520c(C26481l1 l1Var) {
            super(l1Var);
        }

        /* renamed from: e */
        public static /* synthetic */ void m30661e(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: c */
        public boolean mo51202c(C24603f fVar, C26485o oVar, C26469k kVar, boolean z) {
            if (oVar == null) {
                m30661e(0);
                throw null;
            } else if (kVar != null) {
                return C24517v.m30655b(fVar, oVar, kVar);
            } else {
                m30661e(1);
                throw null;
            }
        }
    }

    static {
        C24518a aVar = new C24518a(C23637a.f67833c);
        f70076a = aVar;
        C24519b bVar = new C24519b(C23639c.f67835c);
        f70077b = bVar;
        C24520c cVar = new C24520c(C23638b.f67834c);
        f70078c = cVar;
        HashMap hashMap = new HashMap();
        f70079d = hashMap;
        hashMap.put(aVar.mo53463a(), aVar);
        hashMap.put(bVar.mo53463a(), bVar);
        hashMap.put(cVar.mo53463a(), cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m30654a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static boolean m30655b(C24603f fVar, C26485o oVar, C26469k kVar) {
        if (oVar == null) {
            m30654a(0);
            throw null;
        } else if (kVar == null) {
            m30654a(1);
            throw null;
        } else if (m30656c(C26794h.m35235w(oVar), kVar)) {
            return true;
        } else {
            return C26491r.f73780c.mo51202c(fVar, oVar, kVar, false);
        }
    }

    /* renamed from: c */
    public static boolean m30656c(C26469k kVar, C26469k kVar2) {
        Class<C26465i0> cls = C26465i0.class;
        if (kVar == null) {
            m30654a(2);
            throw null;
        } else if (kVar2 != null) {
            C26465i0 i0Var = (C26465i0) C26794h.m35222j(kVar, cls, false);
            C26465i0 i0Var2 = (C26465i0) C26794h.m35222j(kVar2, cls, false);
            return (i0Var2 == null || i0Var == null || !i0Var.mo53444d().equals(i0Var2.mo53444d())) ? false : true;
        } else {
            m30654a(3);
            throw null;
        }
    }
}
