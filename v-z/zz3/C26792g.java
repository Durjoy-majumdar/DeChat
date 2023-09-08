package zz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import d04.C24442a;
import h04.C24600c;
import h04.C24601d;
import h04.C24603f;
import java.util.Collections;
import java.util.List;
import n04.C25143j0;
import n04.C25202z1;
import ty3.C26343l;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26447e;
import wy3.C26453f;
import wy3.C26463h1;
import wy3.C26467j;
import wy3.C26491r;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26506s0;
import wy3.C26507t0;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26520x0;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26749h0;
import zy3.C26750i;
import zy3.C26751i0;
import zy3.C26753j0;
import zy3.C26755k0;
import zy3.C26765p0;

/* renamed from: zz3.g */
public class C26792g {

    /* renamed from: zz3.g$a */
    public static class C26793a extends C26750i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26793a(C26447e eVar, C26521y0 y0Var, boolean z) {
            super(eVar, (C26467j) null, C26571h.C26572a.f73937a, true, C26436b.C26437a.DECLARATION, y0Var);
            C26505s sVar;
            if (eVar == null) {
                m35212D(0);
                throw null;
            } else if (y0Var != null) {
                int i = C26571h.f73936P0;
                List emptyList = Collections.emptyList();
                int i2 = C26794h.f74523a;
                C26453f f = eVar.mo51796f();
                if (f == C26453f.ENUM_CLASS || f.mo53431a()) {
                    sVar = C26491r.f73778a;
                    if (sVar == null) {
                        C26794h.m35213a(49);
                        throw null;
                    }
                } else if (C26794h.m35230r(eVar)) {
                    if (z) {
                        sVar = C26491r.f73780c;
                        if (sVar == null) {
                            C26794h.m35213a(50);
                            throw null;
                        }
                    } else {
                        sVar = C26491r.f73778a;
                        if (sVar == null) {
                            C26794h.m35213a(51);
                            throw null;
                        }
                    }
                } else if (C26794h.m35224l(eVar)) {
                    sVar = C26491r.f73789l;
                    if (sVar == null) {
                        C26794h.m35213a(52);
                        throw null;
                    }
                } else {
                    sVar = C26491r.f73782e;
                    if (sVar == null) {
                        C26794h.m35213a(53);
                        throw null;
                    }
                }
                mo53731U0(emptyList, sVar);
            } else {
                m35212D(1);
                throw null;
            }
        }

        /* renamed from: D */
        public static /* synthetic */ void m35212D(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m35202a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
            case 32:
            case 34:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
            case 31:
            case 33:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 31:
            case 32:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 33:
            case 34:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 23 || i == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C26509u0 m35203b(C26434a aVar, C25143j0 j0Var, C26571h hVar) {
        if (aVar == null) {
            m35202a(31);
            throw null;
        } else if (hVar == null) {
            m35202a(32);
            throw null;
        } else if (j0Var == null) {
            return null;
        } else {
            return new C26753j0(aVar, new C24600c(aVar, j0Var, (C24603f) null), hVar);
        }
    }

    /* renamed from: c */
    public static C26749h0 m35204c(C26504r0 r0Var, C26571h hVar) {
        if (r0Var == null) {
            m35202a(13);
            throw null;
        } else if (hVar == null) {
            m35202a(14);
            throw null;
        } else if (r0Var == null) {
            m35202a(15);
            throw null;
        } else if (hVar != null) {
            return m35209h(r0Var, hVar, true, false, false, r0Var.getSource());
        } else {
            m35202a(16);
            throw null;
        }
    }

    /* renamed from: d */
    public static C26751i0 m35205d(C26504r0 r0Var, C26571h hVar, C26571h hVar2) {
        if (r0Var == null) {
            m35202a(0);
            throw null;
        } else if (hVar == null) {
            m35202a(1);
            throw null;
        } else if (hVar2 != null) {
            C26521y0 source = r0Var.getSource();
            if (hVar == null) {
                m35202a(4);
                throw null;
            } else if (hVar2 == null) {
                m35202a(5);
                throw null;
            } else if (source != null) {
                return m35210i(r0Var, hVar, hVar2, true, false, false, r0Var.getVisibility(), source);
            } else {
                m35202a(6);
                throw null;
            }
        } else {
            m35202a(2);
            throw null;
        }
    }

    /* renamed from: e */
    public static C26520x0 m35206e(C26447e eVar) {
        C26447e eVar2 = eVar;
        if (eVar2 != null) {
            int i = C26571h.f73936P0;
            C26571h hVar = C26571h.C26572a.f73937a;
            C26755k0 T0 = C26755k0.m34978T0(eVar2, hVar, C26343l.f73368b, C26436b.C26437a.SYNTHESIZED, eVar.getSource());
            C26755k0 k0Var = T0;
            C26755k0 V0 = k0Var.mo53735M0((C26509u0) null, (C26509u0) null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C26765p0(T0, (C26463h1) null, 0, hVar, C22830f.m26794f("value"), C24442a.m30538e(eVar).mo53328v(), false, false, false, (C25143j0) null, eVar.getSource())), eVar.mo36111s(), C26442c0.FINAL, C26491r.f73782e);
            if (V0 != null) {
                return V0;
            }
            m35202a(25);
            throw null;
        }
        m35202a(24);
        throw null;
    }

    /* renamed from: f */
    public static C26520x0 m35207f(C26447e eVar) {
        if (eVar != null) {
            int i = C26571h.f73936P0;
            C26755k0 V0 = C26755k0.m34978T0(eVar, C26571h.C26572a.f73937a, C26343l.f73367a, C26436b.C26437a.SYNTHESIZED, eVar.getSource()).mo53735M0((C26509u0) null, (C26509u0) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C24442a.m30538e(eVar).mo53316h(C25202z1.INVARIANT, eVar.mo36111s()), C26442c0.FINAL, C26491r.f73782e);
            if (V0 != null) {
                return V0;
            }
            m35202a(23);
            throw null;
        }
        m35202a(22);
        throw null;
    }

    /* renamed from: g */
    public static C26509u0 m35208g(C26434a aVar, C25143j0 j0Var, C26571h hVar) {
        if (aVar == null) {
            m35202a(29);
            throw null;
        } else if (hVar == null) {
            m35202a(30);
            throw null;
        } else if (j0Var == null) {
            return null;
        } else {
            return new C26753j0(aVar, new C24601d(aVar, j0Var, (C24603f) null), hVar);
        }
    }

    /* renamed from: h */
    public static C26749h0 m35209h(C26504r0 r0Var, C26571h hVar, boolean z, boolean z2, boolean z3, C26521y0 y0Var) {
        if (r0Var == null) {
            m35202a(17);
            throw null;
        } else if (hVar == null) {
            m35202a(18);
            throw null;
        } else if (y0Var != null) {
            return new C26749h0(r0Var, hVar, r0Var.mo51802j(), r0Var.getVisibility(), z, z2, z3, C26436b.C26437a.DECLARATION, (C26506s0) null, y0Var);
        } else {
            m35202a(19);
            throw null;
        }
    }

    /* renamed from: i */
    public static C26751i0 m35210i(C26504r0 r0Var, C26571h hVar, C26571h hVar2, boolean z, boolean z2, boolean z3, C26505s sVar, C26521y0 y0Var) {
        C26571h hVar3 = hVar2;
        if (r0Var == null) {
            m35202a(7);
            throw null;
        } else if (hVar == null) {
            m35202a(8);
            throw null;
        } else if (hVar3 == null) {
            m35202a(9);
            throw null;
        } else if (sVar == null) {
            m35202a(10);
            throw null;
        } else if (y0Var != null) {
            C26751i0 i0Var = new C26751i0(r0Var, hVar, r0Var.mo51802j(), sVar, z, z2, z3, C26436b.C26437a.DECLARATION, (C26507t0) null, y0Var);
            i0Var.f74395s = C26751i0.m34942K0(i0Var, r0Var.getType(), hVar2);
            return i0Var;
        } else {
            m35202a(11);
            throw null;
        }
    }

    /* renamed from: j */
    public static boolean m35211j(C26516w wVar) {
        if (wVar != null) {
            return wVar.mo52634f() == C26436b.C26437a.SYNTHESIZED && C26794h.m35227o(wVar.mo51892b(), C26453f.ENUM_CLASS);
        }
        m35202a(28);
        throw null;
    }
}
