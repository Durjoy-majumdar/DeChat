package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import d04.C24442a;
import fy3.C32224a;
import g04.C20768h;
import gy3.C87412m;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m04.C21480i;
import m04.C24959e;
import m04.C24980n;
import n04.C25122g1;
import n04.C25127i;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25176s0;
import n04.C25202z1;
import p04.C25416i;
import p04.C25417j;
import ty3.C26336h;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26439b1;
import wy3.C26446d1;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26483n;
import wy3.C26521y0;
import xy3.C26571h;
import zz3.C112693e;
import zz3.C26791f;

/* renamed from: zy3.g */
public abstract class C26742g extends C26758n implements C26446d1 {

    /* renamed from: h */
    public final C25202z1 f74348h;

    /* renamed from: i */
    public final boolean f74349i;

    /* renamed from: j */
    public final int f74350j;

    /* renamed from: n */
    public final C21480i<C25144j1> f74351n;

    /* renamed from: o */
    public final C21480i<C25176s0> f74352o;

    /* renamed from: p */
    public final C24980n f74353p;

    /* renamed from: zy3.g$a */
    public class C26743a implements C32224a<C25144j1> {

        /* renamed from: d */
        public final /* synthetic */ C24980n f74354d;

        /* renamed from: e */
        public final /* synthetic */ C26439b1 f74355e;

        public C26743a(C24980n nVar, C26439b1 b1Var) {
            this.f74354d = nVar;
            this.f74355e = b1Var;
        }

        public Object invoke() {
            return new C26745c(C26742g.this, this.f74354d, this.f74355e);
        }
    }

    /* renamed from: zy3.g$b */
    public class C26744b implements C32224a<C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C22830f f74357d;

        public C26744b(C22830f fVar) {
            this.f74357d = fVar;
        }

        public Object invoke() {
            C25122g1.f71557e.getClass();
            C25122g1 g1Var = C25122g1.f71558f;
            C25144j1 l = C26742g.this.mo36110l();
            List emptyList = Collections.emptyList();
            C26748h hVar = new C26748h(this);
            C24980n nVar = C24959e.f71117e;
            C87412m.m108593f(nVar, "NO_LOCKS");
            return C25146k0.m31962h(g1Var, l, emptyList, false, new C20768h(nVar, hVar));
        }
    }

    /* renamed from: zy3.g$c */
    public class C26745c extends C25127i {

        /* renamed from: c */
        public final C26439b1 f74359c;

        /* renamed from: d */
        public final /* synthetic */ C26742g f74360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26745c(C26742g gVar, C24980n nVar, C26439b1 b1Var) {
            super(nVar);
            if (nVar != null) {
                this.f74360d = gVar;
                this.f74359c = b1Var;
                return;
            }
            m34858j(0);
            throw null;
        }

        /* renamed from: j */
        public static /* synthetic */ void m34858j(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public boolean mo52233b(C22935h hVar) {
            if (hVar != null) {
                if (hVar instanceof C26446d1) {
                    C26791f fVar = C26791f.f74522a;
                    C26742g gVar = this.f74360d;
                    C87412m.m108594g(gVar, "a");
                    if (fVar.mo53756b(gVar, (C26446d1) hVar, true, C112693e.f337415d)) {
                        return true;
                    }
                }
                return false;
            }
            m34858j(9);
            throw null;
        }

        /* renamed from: c */
        public Collection<C25143j0> mo51811c() {
            List<C25143j0> K0 = this.f74360d.mo51856K0();
            if (K0 != null) {
                return K0;
            }
            m34858j(1);
            throw null;
        }

        /* renamed from: d */
        public C25143j0 mo52234d() {
            return C25417j.m32698c(C25416i.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        /* renamed from: f */
        public C26439b1 mo51812f() {
            C26439b1 b1Var = this.f74359c;
            if (b1Var != null) {
                return b1Var;
            }
            m34858j(5);
            throw null;
        }

        public List<C26446d1> getParameters() {
            List<C26446d1> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m34858j(2);
            throw null;
        }

        /* renamed from: h */
        public List<C25143j0> mo52276h(List<C25143j0> list) {
            if (list != null) {
                List<C25143j0> I0 = this.f74360d.mo51854I0(list);
                if (I0 != null) {
                    return I0;
                }
                m34858j(8);
                throw null;
            }
            m34858j(7);
            throw null;
        }

        /* renamed from: i */
        public void mo52277i(C25143j0 j0Var) {
            if (j0Var != null) {
                this.f74360d.mo51855J0(j0Var);
            } else {
                m34858j(6);
                throw null;
            }
        }

        /* renamed from: m */
        public C26336h mo37092m() {
            C26336h e = C24442a.m30538e(this.f74360d);
            if (e != null) {
                return e;
            }
            m34858j(4);
            throw null;
        }

        /* renamed from: o */
        public C22935h mo37094o() {
            C26742g gVar = this.f74360d;
            if (gVar != null) {
                return gVar;
            }
            m34858j(3);
            throw null;
        }

        /* renamed from: p */
        public boolean mo37095p() {
            return true;
        }

        public String toString() {
            return this.f74360d.getName().f65637d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26742g(C24980n nVar, C26469k kVar, C26571h hVar, C22830f fVar, C25202z1 z1Var, boolean z, int i, C26521y0 y0Var, C26439b1 b1Var) {
        super(kVar, hVar, fVar, y0Var);
        if (nVar == null) {
            m34843D(0);
            throw null;
        } else if (kVar == null) {
            m34843D(1);
            throw null;
        } else if (hVar == null) {
            m34843D(2);
            throw null;
        } else if (fVar == null) {
            m34843D(3);
            throw null;
        } else if (z1Var == null) {
            m34843D(4);
            throw null;
        } else if (y0Var == null) {
            m34843D(5);
            throw null;
        } else if (b1Var != null) {
            this.f74348h = z1Var;
            this.f74349i = z;
            this.f74350j = i;
            this.f74351n = nVar.mo52006g(new C26743a(nVar, b1Var));
            this.f74352o = nVar.mo52006g(new C26744b(fVar));
            this.f74353p = nVar;
        } else {
            m34843D(6);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34843D(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: I0 */
    public List<C25143j0> mo51854I0(List<C25143j0> list) {
        if (list == null) {
            m34843D(12);
            throw null;
        } else if (list != null) {
            return list;
        } else {
            m34843D(13);
            throw null;
        }
    }

    /* renamed from: J0 */
    public abstract void mo51855J0(C25143j0 j0Var);

    /* renamed from: K0 */
    public abstract List<C25143j0> mo51856K0();

    /* renamed from: U */
    public C26483n mo53719U() {
        return this;
    }

    /* renamed from: a */
    public C26446d1 mo36109a() {
        return this;
    }

    /* renamed from: a */
    public C22935h m34849a() {
        return this;
    }

    /* renamed from: a */
    public C26469k m34850a() {
        return this;
    }

    public int getIndex() {
        return this.f74350j;
    }

    public List<C25143j0> getUpperBounds() {
        List<C25143j0> g = ((C26745c) mo36110l()).mo37096r();
        if (g != null) {
            return g;
        }
        m34843D(8);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo53452f(this, d);
    }

    /* renamed from: l */
    public final C25144j1 mo36110l() {
        C25144j1 j1Var = (C25144j1) this.f74351n.invoke();
        if (j1Var != null) {
            return j1Var;
        }
        m34843D(9);
        throw null;
    }

    /* renamed from: o */
    public C25202z1 mo53423o() {
        C25202z1 z1Var = this.f74348h;
        if (z1Var != null) {
            return z1Var;
        }
        m34843D(7);
        throw null;
    }

    /* renamed from: s */
    public C25176s0 mo36111s() {
        C25176s0 s0Var = (C25176s0) this.f74352o.invoke();
        if (s0Var != null) {
            return s0Var;
        }
        m34843D(10);
        throw null;
    }

    /* renamed from: s0 */
    public C24980n mo53424s0() {
        C24980n nVar = this.f74353p;
        if (nVar != null) {
            return nVar;
        }
        m34843D(14);
        throw null;
    }

    /* renamed from: u */
    public boolean mo53426u() {
        return this.f74349i;
    }

    /* renamed from: x */
    public boolean mo53427x() {
        return false;
    }
}
