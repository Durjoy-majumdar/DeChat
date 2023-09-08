package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import d04.C24442a;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.List;
import m04.C24980n;
import n04.C25143j0;
import n04.C25153l0;
import n04.C25176s0;
import n04.C25202z1;
import vz3.C22830f;
import wy3.C26439b1;
import wy3.C26446d1;
import wy3.C26469k;
import wy3.C26521y0;
import xy3.C26571h;
import zz3.C26794h;

/* renamed from: zy3.o0 */
public class C26763o0 extends C26742g {

    /* renamed from: q */
    public final C32226l<C25143j0, Void> f74420q;

    /* renamed from: r */
    public final List<C25143j0> f74421r;

    /* renamed from: s */
    public boolean f74422s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26763o0(C26469k kVar, C26571h hVar, boolean z, C25202z1 z1Var, C22830f fVar, int i, C26521y0 y0Var, C32226l<C25143j0, Void> lVar, C26439b1 b1Var, C24980n nVar) {
        super(nVar, kVar, hVar, fVar, z1Var, z, i, y0Var, b1Var);
        if (kVar == null) {
            m35031D(19);
            throw null;
        } else if (hVar == null) {
            m35031D(20);
            throw null;
        } else if (z1Var == null) {
            m35031D(21);
            throw null;
        } else if (fVar == null) {
            m35031D(22);
            throw null;
        } else if (y0Var == null) {
            m35031D(23);
            throw null;
        } else if (b1Var == null) {
            m35031D(24);
            throw null;
        } else if (nVar != null) {
            this.f74421r = new ArrayList(1);
            this.f74422s = false;
            this.f74420q = lVar;
        } else {
            m35031D(25);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m35031D(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 28) ? 2 : 3)];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: M0 */
    public static C26763o0 m35032M0(C26469k kVar, C26571h hVar, boolean z, C25202z1 z1Var, C22830f fVar, int i, C26521y0 y0Var, C24980n nVar) {
        if (kVar == null) {
            m35031D(6);
            throw null;
        } else if (hVar == null) {
            m35031D(7);
            throw null;
        } else if (z1Var == null) {
            m35031D(8);
            throw null;
        } else if (fVar == null) {
            m35031D(9);
            throw null;
        } else if (y0Var == null) {
            m35031D(10);
            throw null;
        } else if (nVar != null) {
            C26439b1.C26440a aVar = C26439b1.C26440a.f73729a;
            if (kVar == null) {
                m35031D(12);
                throw null;
            } else if (hVar == null) {
                m35031D(13);
                throw null;
            } else if (z1Var == null) {
                m35031D(14);
                throw null;
            } else if (fVar == null) {
                m35031D(15);
                throw null;
            } else if (y0Var == null) {
                m35031D(16);
                throw null;
            } else if (nVar != null) {
                return new C26763o0(kVar, hVar, z, z1Var, fVar, i, y0Var, (C32226l<C25143j0, Void>) null, aVar, nVar);
            } else {
                m35031D(18);
                throw null;
            }
        } else {
            m35031D(11);
            throw null;
        }
    }

    /* renamed from: N0 */
    public static C26446d1 m35033N0(C26469k kVar, C26571h hVar, boolean z, C25202z1 z1Var, C22830f fVar, int i, C24980n nVar) {
        if (kVar == null) {
            m35031D(0);
            throw null;
        } else if (hVar == null) {
            m35031D(1);
            throw null;
        } else if (z1Var == null) {
            m35031D(2);
            throw null;
        } else if (fVar == null) {
            m35031D(3);
            throw null;
        } else if (nVar != null) {
            C26763o0 M0 = m35032M0(kVar, hVar, z, z1Var, fVar, i, C26521y0.f73808a, nVar);
            C25176s0 n = C24442a.m30538e(kVar).mo53322n();
            if (n != null) {
                M0.mo53743L0();
                if (!C25153l0.m31968a(n)) {
                    ((ArrayList) M0.f74421r).add(n);
                }
                M0.mo53743L0();
                M0.f74422s = true;
                return M0;
            }
            m35031D(26);
            throw null;
        } else {
            m35031D(4);
            throw null;
        }
    }

    /* renamed from: J0 */
    public void mo51855J0(C25143j0 j0Var) {
        if (j0Var != null) {
            C32226l<C25143j0, Void> lVar = this.f74420q;
            if (lVar != null) {
                lVar.invoke(j0Var);
                return;
            }
            return;
        }
        m35031D(27);
        throw null;
    }

    /* renamed from: K0 */
    public List<C25143j0> mo51856K0() {
        if (this.f74422s) {
            List<C25143j0> list = this.f74421r;
            if (list != null) {
                return list;
            }
            m35031D(28);
            throw null;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + mo53744O0());
    }

    /* renamed from: L0 */
    public final void mo53743L0() {
        if (this.f74422s) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + mo53744O0());
        }
    }

    /* renamed from: O0 */
    public final String mo53744O0() {
        return getName() + " declared in " + C26794h.m35219g(mo51892b());
    }
}
