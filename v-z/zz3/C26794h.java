package zz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Set;
import n04.C25143j0;
import n04.C25144j1;
import p04.C25417j;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C26409h;
import wy3.C22935h;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26453f;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26483n;
import wy3.C26484n0;
import wy3.C26485o;
import wy3.C26491r;
import wy3.C26507t0;
import wy3.C26524z0;

/* renamed from: zz3.h */
public class C26794h {

    /* renamed from: a */
    public static final /* synthetic */ int f74523a = 0;

    static {
        new C22826c("kotlin.jvm.JvmName");
    }

    /* renamed from: a */
    public static /* synthetic */ void m35213a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = FirebaseAnalytics.C113379b.LOCATION;
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public static <D extends C26434a> void m35214b(D d, Set<D> set) {
        if (d == null) {
            m35213a(70);
            throw null;
        } else if (set == null) {
            m35213a(71);
            throw null;
        } else if (!set.contains(d)) {
            for (C26434a a : d.mo36109a().mo52633e()) {
                C26434a a2 = a.mo36109a();
                m35214b(a2, set);
                set.add(a2);
            }
        }
    }

    /* renamed from: c */
    public static C26447e m35215c(C25143j0 j0Var) {
        if (j0Var != null) {
            C25144j1 K0 = j0Var.mo37081K0();
            if (K0 != null) {
                C26447e eVar = (C26447e) K0.mo37094o();
                if (eVar != null) {
                    return eVar;
                }
                m35213a(47);
                throw null;
            }
            m35213a(46);
            throw null;
        }
        m35213a(45);
        throw null;
    }

    /* renamed from: d */
    public static C26448e0 m35216d(C26469k kVar) {
        if (kVar != null) {
            C26448e0 e = m35217e(kVar);
            if (e != null) {
                return e;
            }
            m35213a(22);
            throw null;
        }
        m35213a(21);
        throw null;
    }

    /* renamed from: e */
    public static C26448e0 m35217e(C26469k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof C26448e0) {
                    return (C26448e0) kVar;
                }
                if (kVar instanceof C26484n0) {
                    return ((C26484n0) kVar).mo53459G0();
                }
                kVar = kVar.mo51892b();
            }
            return null;
        }
        m35213a(23);
        throw null;
    }

    /* renamed from: f */
    public static C26524z0 m35218f(C26469k kVar) {
        if (kVar != null) {
            if (kVar instanceof C26507t0) {
                kVar = ((C26507t0) kVar).mo53467u0();
            }
            if (!(kVar instanceof C26483n)) {
                return C26524z0.f73810a;
            }
            C26524z0 a = ((C26483n) kVar).getSource().mo37215a();
            if (a != null) {
                return a;
            }
            m35213a(80);
            throw null;
        }
        m35213a(79);
        throw null;
    }

    /* renamed from: g */
    public static C22827d m35219g(C26469k kVar) {
        if (kVar != null) {
            C22826c h = m35220h(kVar);
            return h != null ? h.mo35982i() : m35219g(kVar.mo51892b()).mo35985c(kVar.getName());
        }
        m35213a(2);
        throw null;
    }

    /* renamed from: h */
    public static C22826c m35220h(C26469k kVar) {
        if (kVar == null) {
            m35213a(5);
            throw null;
        } else if ((kVar instanceof C26448e0) || C25417j.m32699f(kVar)) {
            return C22826c.f65627c;
        } else {
            if (kVar instanceof C26484n0) {
                return ((C26484n0) kVar).mo53460d();
            }
            if (kVar instanceof C26465i0) {
                return ((C26465i0) kVar).mo53444d();
            }
            return null;
        }
    }

    /* renamed from: i */
    public static <D extends C26469k> D m35221i(C26469k kVar, Class<D> cls) {
        if (cls != null) {
            return m35222j(kVar, cls, true);
        }
        m35213a(18);
        throw null;
    }

    /* renamed from: j */
    public static <D extends C26469k> D m35222j(D d, Class<D> cls, boolean z) {
        if (cls == null) {
            m35213a(19);
            throw null;
        } else if (d == null) {
            return null;
        } else {
            if (z) {
                d = d.mo51892b();
            }
            while (d != null) {
                if (cls.isInstance(d)) {
                    return d;
                }
                d = d.mo51892b();
            }
            return null;
        }
    }

    /* renamed from: k */
    public static C26447e m35223k(C26447e eVar) {
        if (eVar != null) {
            for (C25143j0 c : eVar.mo36110l().mo37096r()) {
                C26447e c2 = m35215c(c);
                if (c2.mo51796f() != C26453f.INTERFACE) {
                    return c2;
                }
            }
            return null;
        }
        m35213a(44);
        throw null;
    }

    /* renamed from: l */
    public static boolean m35224l(C26469k kVar) {
        if (kVar != null) {
            return m35227o(kVar, C26453f.CLASS) && kVar.getName().equals(C26409h.f73647a);
        }
        m35213a(34);
        throw null;
    }

    /* renamed from: m */
    public static boolean m35225m(C26469k kVar) {
        return m35227o(kVar, C26453f.OBJECT) && ((C26447e) kVar).mo51809x0();
    }

    /* renamed from: n */
    public static boolean m35226n(C26469k kVar) {
        if (kVar != null) {
            return m35227o(kVar, C26453f.ENUM_ENTRY);
        }
        m35213a(36);
        throw null;
    }

    /* renamed from: o */
    public static boolean m35227o(C26469k kVar, C26453f fVar) {
        if (fVar != null) {
            return (kVar instanceof C26447e) && ((C26447e) kVar).mo51796f() == fVar;
        }
        m35213a(37);
        throw null;
    }

    /* renamed from: p */
    public static boolean m35228p(C26469k kVar) {
        if (kVar != null) {
            while (true) {
                boolean z = false;
                if (kVar == null) {
                    return false;
                }
                if (m35224l(kVar)) {
                    break;
                }
                if ((kVar instanceof C26485o) && ((C26485o) kVar).getVisibility() == C26491r.f73783f) {
                    z = true;
                }
                if (z) {
                    break;
                }
                kVar = kVar.mo51892b();
            }
            return true;
        }
        m35213a(1);
        throw null;
    }

    /* renamed from: q */
    public static boolean m35229q(C25143j0 j0Var, C26469k kVar) {
        if (j0Var == null) {
            m35213a(30);
            throw null;
        } else if (kVar != null) {
            C22935h o = j0Var.mo37081K0().mo37094o();
            if (o == null) {
                return false;
            }
            C26469k a = o.mo36109a();
            return (a instanceof C22935h) && (kVar instanceof C22935h) && ((C22935h) kVar).mo36110l().equals(((C22935h) a).mo36110l());
        } else {
            m35213a(31);
            throw null;
        }
    }

    /* renamed from: r */
    public static boolean m35230r(C26469k kVar) {
        return (m35227o(kVar, C26453f.CLASS) || m35227o(kVar, C26453f.INTERFACE)) && ((C26447e) kVar).mo51802j() == C26442c0.SEALED;
    }

    /* renamed from: s */
    public static boolean m35231s(C26447e eVar, C26447e eVar2) {
        if (eVar == null) {
            m35213a(28);
            throw null;
        } else if (eVar2 != null) {
            return m35232t(eVar.mo36111s(), eVar2.mo36109a());
        } else {
            m35213a(29);
            throw null;
        }
    }

    /* renamed from: t */
    public static boolean m35232t(C25143j0 j0Var, C26469k kVar) {
        if (j0Var == null) {
            m35213a(32);
            throw null;
        } else if (kVar == null) {
            m35213a(33);
            throw null;
        } else if (m35229q(j0Var, kVar)) {
            return true;
        } else {
            for (C25143j0 t : j0Var.mo37081K0().mo37096r()) {
                if (m35232t(t, kVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: u */
    public static boolean m35233u(C26469k kVar) {
        return kVar != null && (kVar.mo51892b() instanceof C26465i0);
    }

    /* renamed from: v */
    public static <D extends C26436b> D m35234v(D d) {
        if (d != null) {
            while (d.mo52634f() == C26436b.C26437a.FAKE_OVERRIDE) {
                Collection e = d.mo52633e();
                if (!e.isEmpty()) {
                    d = (C26436b) e.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
                }
            }
            return d;
        }
        m35213a(59);
        throw null;
    }

    /* renamed from: w */
    public static <D extends C26485o> D m35235w(D d) {
        if (d == null) {
            m35213a(61);
            throw null;
        } else if (d instanceof C26436b) {
            return m35234v((C26436b) d);
        } else {
            if (d != null) {
                return d;
            }
            m35213a(62);
            throw null;
        }
    }
}
