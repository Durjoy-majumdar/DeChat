package hz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import n04.C25143j0;
import rx3.C13604l;
import sx3.C64186f0;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26447e;
import wy3.C26469k;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26750i;
import zz3.C26792g;

/* renamed from: hz3.b */
public class C24608b extends C26750i implements C24607a {

    /* renamed from: L */
    public Boolean f70202L;

    /* renamed from: M */
    public Boolean f70203M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24608b(C26447e eVar, C24608b bVar, C26571h hVar, boolean z, C26436b.C26437a aVar, C26521y0 y0Var) {
        super(eVar, bVar, hVar, z, aVar, y0Var);
        if (eVar == null) {
            m30785D(0);
            throw null;
        } else if (hVar == null) {
            m30785D(1);
            throw null;
        } else if (aVar == null) {
            m30785D(2);
            throw null;
        } else if (y0Var != null) {
            this.f70202L = null;
            this.f70203M = null;
        } else {
            m30785D(3);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m30785D(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: W0 */
    public static C24608b m30786W0(C26447e eVar, C26571h hVar, boolean z, C26521y0 y0Var) {
        if (eVar == null) {
            m30785D(4);
            throw null;
        } else if (hVar == null) {
            m30785D(5);
            throw null;
        } else if (y0Var != null) {
            return new C24608b(eVar, (C24608b) null, hVar, z, C26436b.C26437a.DECLARATION, y0Var);
        } else {
            m30785D(6);
            throw null;
        }
    }

    /* renamed from: M */
    public boolean mo51317M() {
        return this.f70203M.booleanValue();
    }

    /* renamed from: P0 */
    public void mo51318P0(boolean z) {
        this.f70202L = Boolean.valueOf(z);
    }

    /* renamed from: Q0 */
    public void mo51319Q0(boolean z) {
        this.f70203M = Boolean.valueOf(z);
    }

    /* renamed from: X0 */
    public C24608b mo51320S0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        if (kVar == null) {
            m30785D(7);
            throw null;
        } else if (aVar == null) {
            m30785D(8);
            throw null;
        } else if (hVar == null) {
            m30785D(9);
            throw null;
        } else if (y0Var == null) {
            m30785D(10);
            throw null;
        } else if (aVar == C26436b.C26437a.DECLARATION || aVar == C26436b.C26437a.SYNTHESIZED) {
            C24608b bVar = new C24608b((C26447e) kVar, (C24608b) wVar, hVar, this.f74394K, aVar, y0Var);
            bVar.mo51318P0(this.f70202L.booleanValue());
            bVar.mo51319Q0(mo51317M());
            return bVar;
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + kVar + "\n" + "kind: " + aVar);
        }
    }

    /* renamed from: y0 */
    public C24607a mo51315y0(C25143j0 j0Var, List list, C25143j0 j0Var2, C13604l lVar) {
        C25143j0 j0Var3 = j0Var;
        List list2 = list;
        C13604l lVar2 = lVar;
        C26509u0 u0Var = null;
        if (list2 == null) {
            m30785D(16);
            throw null;
        } else if (j0Var2 != null) {
            C24608b X0 = mo51320S0(m34931b(), (C26516w) null, mo52634f(), (C22830f) null, getAnnotations(), getSource());
            if (j0Var3 != null) {
                int i = C26571h.f73936P0;
                u0Var = C26792g.m35208g(X0, j0Var, C26571h.C26572a.f73937a);
            }
            X0.mo53735M0(u0Var, this.f74463p, C64186f0.f181907d, getTypeParameters(), C24616h.m30810a(list2, mo52639h(), X0), j0Var2, mo51802j(), getVisibility());
            if (lVar2 != null) {
                X0.mo53750O0((C26434a.C22933a) lVar2.f38555d, lVar2.f38556e);
            }
            return X0;
        } else {
            m30785D(17);
            throw null;
        }
    }
}
