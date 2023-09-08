package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n04.C25143j0;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26505s;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26520x0;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.k0 */
public class C26755k0 extends C26777s implements C26520x0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26755k0(C26469k kVar, C26520x0 x0Var, C26571h hVar, C22830f fVar, C26436b.C26437a aVar, C26521y0 y0Var) {
        super(kVar, x0Var, hVar, fVar, aVar, y0Var);
        if (kVar == null) {
            m34977D(0);
            throw null;
        } else if (hVar == null) {
            m34977D(1);
            throw null;
        } else if (fVar == null) {
            m34977D(2);
            throw null;
        } else if (aVar == null) {
            m34977D(3);
            throw null;
        } else if (y0Var != null) {
        } else {
            m34977D(4);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m34977D(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: T0 */
    public static C26755k0 m34978T0(C26469k kVar, C26571h hVar, C22830f fVar, C26436b.C26437a aVar, C26521y0 y0Var) {
        if (kVar == null) {
            m34977D(5);
            throw null;
        } else if (hVar == null) {
            m34977D(6);
            throw null;
        } else if (fVar == null) {
            m34977D(7);
            throw null;
        } else if (aVar == null) {
            m34977D(8);
            throw null;
        } else if (y0Var != null) {
            return new C26755k0(kVar, (C26520x0) null, hVar, fVar, aVar, y0Var);
        } else {
            m34977D(9);
            throw null;
        }
    }

    /* renamed from: J0 */
    public C26777s mo51316J0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        if (kVar == null) {
            m34977D(25);
            throw null;
        } else if (aVar == null) {
            m34977D(26);
            throw null;
        } else if (hVar == null) {
            m34977D(27);
            throw null;
        } else if (y0Var != null) {
            C26520x0 x0Var = (C26520x0) wVar;
            if (fVar == null) {
                fVar = getName();
            }
            return new C26755k0(kVar, x0Var, hVar, fVar, aVar, y0Var);
        } else {
            m34977D(28);
            throw null;
        }
    }

    /* renamed from: S0 */
    public C26520x0 mo52598y(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26436b.C26437a aVar, boolean z) {
        C26520x0 x0Var = (C26520x0) super.mo52598y(kVar, c0Var, sVar, aVar, z);
        if (x0Var != null) {
            return x0Var;
        }
        m34977D(29);
        throw null;
    }

    /* renamed from: U0 */
    public C26520x0 m34990a() {
        C26520x0 x0Var = (C26520x0) super.m35121a();
        if (x0Var != null) {
            return x0Var;
        }
        m34977D(24);
        throw null;
    }

    /* renamed from: V0 */
    public C26755k0 mo53735M0(C26509u0 u0Var, C26509u0 u0Var2, List<C26509u0> list, List<? extends C26446d1> list2, List<C26463h1> list3, C25143j0 j0Var, C26442c0 c0Var, C26505s sVar) {
        if (list == null) {
            m34977D(14);
            throw null;
        } else if (list2 == null) {
            m34977D(15);
            throw null;
        } else if (list3 == null) {
            m34977D(16);
            throw null;
        } else if (sVar != null) {
            C26755k0 W0 = mo51322W0(u0Var, u0Var2, list, list2, list3, j0Var, c0Var, sVar, (Map<? extends C26434a.C22933a<?>, ?>) null);
            if (W0 != null) {
                return W0;
            }
            m34977D(18);
            throw null;
        } else {
            m34977D(17);
            throw null;
        }
    }

    /* renamed from: W0 */
    public C26755k0 mo51322W0(C26509u0 u0Var, C26509u0 u0Var2, List<C26509u0> list, List<? extends C26446d1> list2, List<C26463h1> list3, C25143j0 j0Var, C26442c0 c0Var, C26505s sVar, Map<? extends C26434a.C22933a<?>, ?> map) {
        if (list == null) {
            m34977D(19);
            throw null;
        } else if (list2 == null) {
            m34977D(20);
            throw null;
        } else if (list3 == null) {
            m34977D(21);
            throw null;
        } else if (sVar != null) {
            super.mo53735M0(u0Var, u0Var2, list, list2, list3, j0Var, c0Var, sVar);
            if (map != null && !map.isEmpty()) {
                this.f74457J = new LinkedHashMap(map);
            }
            return this;
        } else {
            m34977D(22);
            throw null;
        }
    }

    /* renamed from: p */
    public C26516w.C26517a<? extends C26520x0> mo52597p() {
        return super.mo52597p();
    }
}
