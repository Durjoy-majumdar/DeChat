package w04;

import fy3.C32226l;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: w04.b */
public class C22843b {

    /* renamed from: w04.b$a */
    public static class C22844a extends C22845b<N, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C32226l f65671a;

        /* renamed from: b */
        public final /* synthetic */ boolean[] f65672b;

        public C22844a(C32226l lVar, boolean[] zArr) {
            this.f65671a = lVar;
            this.f65672b = zArr;
        }

        /* renamed from: a */
        public Object mo31877a() {
            return Boolean.valueOf(this.f65672b[0]);
        }

        /* renamed from: b */
        public boolean mo31878b(N n) {
            if (((Boolean) this.f65671a.invoke(n)).booleanValue()) {
                this.f65672b[0] = true;
            }
            return !this.f65672b[0];
        }
    }

    /* renamed from: w04.b$b */
    public static abstract class C22845b<N, R> implements C22847d<N, R> {
        /* renamed from: c */
        public void mo31879c(N n) {
        }
    }

    /* renamed from: w04.b$c */
    public interface C22846c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo33273a(N n);
    }

    /* renamed from: w04.b$d */
    public interface C22847d<N, R> {
        /* renamed from: a */
        R mo31877a();

        /* renamed from: b */
        boolean mo31878b(N n);

        /* renamed from: c */
        void mo31879c(N n);
    }

    /* renamed from: w04.b$e */
    public interface C22848e<N> {
    }

    /* renamed from: w04.b$f */
    public static class C22849f<N> implements C22848e<N> {

        /* renamed from: a */
        public final Set<N> f65673a = new HashSet();
    }

    /* renamed from: a */
    public static /* synthetic */ void m26801a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <N, R> R m26802b(Collection<N> collection, C22846c<N> cVar, C22847d<N, R> dVar) {
        if (collection == null) {
            m26801a(4);
            throw null;
        } else if (cVar == null) {
            m26801a(5);
            throw null;
        } else if (dVar != null) {
            C22849f fVar = new C22849f();
            if (collection == null) {
                m26801a(0);
                throw null;
            } else if (cVar == null) {
                m26801a(1);
                throw null;
            } else if (dVar != null) {
                for (N c : collection) {
                    m26803c(c, cVar, fVar, dVar);
                }
                return dVar.mo31877a();
            } else {
                m26801a(3);
                throw null;
            }
        } else {
            m26801a(6);
            throw null;
        }
    }

    /* renamed from: c */
    public static <N> void m26803c(N n, C22846c<N> cVar, C22848e<N> eVar, C22847d<N, ?> dVar) {
        if (n == null) {
            m26801a(22);
            throw null;
        } else if (cVar == null) {
            m26801a(23);
            throw null;
        } else if (eVar == null) {
            m26801a(24);
            throw null;
        } else if (dVar == null) {
            m26801a(25);
            throw null;
        } else if (((C22849f) eVar).f65673a.add(n) && dVar.mo31878b(n)) {
            for (Object c : cVar.mo33273a(n)) {
                m26803c(c, cVar, eVar, dVar);
            }
            dVar.mo31879c(n);
        }
    }

    /* renamed from: d */
    public static <N> Boolean m26804d(Collection<N> collection, C22846c<N> cVar, C32226l<N, Boolean> lVar) {
        if (collection == null) {
            m26801a(7);
            throw null;
        } else if (cVar == null) {
            m26801a(8);
            throw null;
        } else if (lVar != null) {
            return (Boolean) m26802b(collection, cVar, new C22844a(lVar, new boolean[1]));
        } else {
            m26801a(9);
            throw null;
        }
    }
}
