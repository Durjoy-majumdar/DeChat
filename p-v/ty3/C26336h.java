package ty3;

import com.tencent.thumbplayer.api.TPOptionalID;
import d04.C24442a;
import ez3.C24476d;
import fy3.C32224a;
import fy3.C32226l;
import g04.C20770i;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m04.C21480i;
import m04.C24959e;
import m04.C24975g;
import m04.C24980n;
import n04.C25126h1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25164o1;
import n04.C25176s0;
import n04.C25187v1;
import n04.C25202z1;
import sx3.C110823p;
import sx3.C64186f0;
import sx3.C64187h0;
import ty3.C26328a;
import ty3.C26343l;
import uy3.C26368a;
import uy3.C26371c;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C22936j0;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26484n0;
import wy3.C26489q;
import wy3.C26504r0;
import wy3.C26506s0;
import wy3.C26507t0;
import wy3.C26510v;
import wz3.C26526a;
import xy3.C26571h;
import yy3.C26640a;
import yy3.C26642b;
import yy3.C26643c;
import zy3.C23598y;
import zy3.C26729b0;
import zz3.C26794h;

/* renamed from: ty3.h */
public abstract class C26336h {

    /* renamed from: e */
    public static final C22830f f73354e = C22830f.m26796h("<built-ins module>");

    /* renamed from: a */
    public C26729b0 f73355a;

    /* renamed from: b */
    public final C21480i<C22556d> f73356b;

    /* renamed from: c */
    public final C24975g<C22830f, C26447e> f73357c;

    /* renamed from: d */
    public final C24980n f73358d;

    /* renamed from: ty3.h$b */
    public class C22555b implements C32224a<C22556d> {
        public C22555b() {
        }

        public Object invoke() {
            EnumMap enumMap = new EnumMap(C22558j.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (C22558j jVar : C22558j.values()) {
                C25176s0 b = C26336h.m33837b(C26336h.this, jVar.f64883d.mo35995b());
                C25176s0 b2 = C26336h.m33837b(C26336h.this, jVar.f64884e.mo35995b());
                enumMap.put(jVar, b2);
                hashMap.put(b, b2);
                hashMap2.put(b2, b);
            }
            return new C22556d(enumMap, hashMap, hashMap2, (C26337a) null);
        }
    }

    /* renamed from: ty3.h$d */
    public static class C22556d {

        /* renamed from: a */
        public final Map<C22558j, C25176s0> f64868a;

        /* renamed from: b */
        public final Map<C25143j0, C25176s0> f64869b;

        /* renamed from: c */
        public final Map<C25176s0, C25176s0> f64870c;

        public C22556d(Map map, Map map2, Map map3, C26337a aVar) {
            if (map == null) {
                m26340a(0);
                throw null;
            } else if (map2 == null) {
                m26340a(1);
                throw null;
            } else if (map3 != null) {
                this.f64868a = map;
                this.f64869b = map2;
                this.f64870c = map3;
            } else {
                m26340a(2);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m26340a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: ty3.h$a */
    public class C26337a implements C32224a<Collection<C26484n0>> {
        public C26337a() {
        }

        public Object invoke() {
            return Arrays.asList(new C26484n0[]{C26336h.this.mo53320l().mo52620b0(C26343l.f73376j), C26336h.this.mo53320l().mo52620b0(C26343l.f73378l), C26336h.this.mo53320l().mo52620b0(C26343l.f73379m), C26336h.this.mo53320l().mo52620b0(C26343l.f73377k)});
        }
    }

    /* renamed from: ty3.h$c */
    public class C26338c implements C32226l<C22830f, C26447e> {
        public C26338c() {
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C26729b0 l = C26336h.this.mo53320l();
            C22826c cVar = C26343l.f73376j;
            C20770i n = l.mo52620b0(cVar).mo53462n();
            if (n != null) {
                C22935h g = n.mo32462g(fVar, C24476d.FROM_BUILTINS);
                if (g == null) {
                    throw new AssertionError("Built-in class " + cVar.mo35974c(fVar) + " is not found");
                } else if (g instanceof C26447e) {
                    return (C26447e) g;
                } else {
                    throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + g);
                }
            } else {
                C26336h.m33836a(11);
                throw null;
            }
        }
    }

    public C26336h(C24980n nVar) {
        if (nVar != null) {
            this.f73358d = nVar;
            nVar.mo52006g(new C26337a());
            this.f73356b = nVar.mo52006g(new C22555b());
            this.f73357c = nVar.mo52007h(new C26338c());
            return;
        }
        m33836a(0);
        throw null;
    }

    /* renamed from: A */
    public static boolean m33824A(C26469k kVar) {
        if (kVar != null) {
            return C26794h.m35222j(kVar, C26331b.class, false) != null;
        }
        m33836a(9);
        throw null;
    }

    /* renamed from: B */
    public static boolean m33825B(C25143j0 j0Var, C22827d dVar) {
        if (j0Var == null) {
            m33836a(97);
            throw null;
        } else if (dVar != null) {
            return m33834K(j0Var.mo37081K0(), dVar);
        } else {
            m33836a(98);
            throw null;
        }
    }

    /* renamed from: C */
    public static boolean m33826C(C25143j0 j0Var, C22827d dVar) {
        if (j0Var == null) {
            m33836a(134);
            throw null;
        } else if (dVar != null) {
            return m33825B(j0Var, dVar) && !j0Var.mo37082L0();
        } else {
            m33836a(135);
            throw null;
        }
    }

    /* renamed from: D */
    public static boolean m33827D(C26469k kVar) {
        if (kVar == null) {
            m33836a(160);
            throw null;
        } else if (kVar.mo36109a().getAnnotations().mo51479q(C26343l.C26344a.f73424n)) {
            return true;
        } else {
            if (!(kVar instanceof C26504r0)) {
                return false;
            }
            C26504r0 r0Var = (C26504r0) kVar;
            boolean c0 = r0Var.mo52631c0();
            C26506s0 g = r0Var.mo52635g();
            C26507t0 i = r0Var.mo52640i();
            if (g != null && m33827D(g)) {
                if (c0) {
                    return i != null && m33827D(i);
                }
                return true;
            }
        }
    }

    /* renamed from: E */
    public static boolean m33828E(C25143j0 j0Var, C22827d dVar) {
        if (j0Var == null) {
            m33836a(105);
            throw null;
        } else if (dVar != null) {
            return !j0Var.mo37082L0() && m33825B(j0Var, dVar);
        } else {
            m33836a(106);
            throw null;
        }
    }

    /* renamed from: F */
    public static boolean m33829F(C25143j0 j0Var) {
        if (j0Var == null) {
            m33836a(136);
            throw null;
        } else if (j0Var != null) {
            return m33825B(j0Var, C26343l.C26344a.f73411c) && !C25187v1.m32087g(j0Var);
        } else {
            m33836a(138);
            throw null;
        }
    }

    /* renamed from: G */
    public static boolean m33830G(C25143j0 j0Var) {
        if (j0Var != null) {
            C22935h o = j0Var.mo37081K0().mo37094o();
            return (o == null || m33839s(o) == null) ? false : true;
        }
        m33836a(91);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33831H(n04.C25143j0 r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0033
            boolean r1 = r4.mo37082L0()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0032
            n04.j1 r4 = r4.mo37081K0()
            wy3.h r4 = r4.mo37094o()
            boolean r1 = r4 instanceof wy3.C26447e
            if (r1 == 0) goto L_0x002e
            wy3.e r4 = (wy3.C26447e) r4
            if (r4 == 0) goto L_0x0028
            ty3.j r4 = m33840u(r4)
            if (r4 == 0) goto L_0x0023
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == 0) goto L_0x002e
            r4 = 1
            goto L_0x002f
        L_0x0028:
            r4 = 96
            m33836a(r4)
            throw r0
        L_0x002e:
            r4 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r2 = 1
        L_0x0032:
            return r2
        L_0x0033:
            r4 = 94
            m33836a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ty3.C26336h.m33831H(n04.j0):boolean");
    }

    /* renamed from: I */
    public static boolean m33832I(C26447e eVar) {
        if (eVar != null) {
            return m33838c(eVar, C26343l.C26344a.f73409b) || m33838c(eVar, C26343l.C26344a.f73411c);
        }
        m33836a(107);
        throw null;
    }

    /* renamed from: J */
    public static boolean m33833J(C25143j0 j0Var) {
        return j0Var != null && m33828E(j0Var, C26343l.C26344a.f73417g);
    }

    /* renamed from: K */
    public static boolean m33834K(C25144j1 j1Var, C22827d dVar) {
        if (j1Var == null) {
            m33836a(101);
            throw null;
        } else if (dVar != null) {
            C22935h o = j1Var.mo37094o();
            return (o instanceof C26447e) && m33838c(o, dVar);
        } else {
            m33836a(102);
            throw null;
        }
    }

    /* renamed from: L */
    public static boolean m33835L(C26469k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof C26465i0) {
                    return ((C26465i0) kVar).mo53444d().mo35980h(C26343l.f73375i);
                }
                kVar = kVar.mo51892b();
            }
            return false;
        }
        m33836a(10);
        throw null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m33836a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case 148:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
            case TPOptionalID.f349338xc9bdf6cd /*143*/:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 161:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                objArr[2] = "isUnit";
                break;
            case TPOptionalID.f349338xc9bdf6cd /*143*/:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case 148:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public static C25176s0 m33837b(C26336h hVar, String str) {
        if (str != null) {
            C25176s0 s = hVar.mo53319k(str).mo36111s();
            if (s != null) {
                return s;
            }
            m33836a(47);
            throw null;
        }
        hVar.getClass();
        m33836a(46);
        throw null;
    }

    /* renamed from: c */
    public static boolean m33838c(C22935h hVar, C22827d dVar) {
        if (hVar == null) {
            m33836a(103);
            throw null;
        } else if (dVar != null) {
            return hVar.getName().equals(dVar.mo35991h()) && dVar.equals(C26794h.m35219g(hVar));
        } else {
            m33836a(104);
            throw null;
        }
    }

    /* renamed from: s */
    public static C22558j m33839s(C26469k kVar) {
        if (kVar != null) {
            if (!((HashSet) C26343l.C26344a.f73410b0).contains(kVar.getName())) {
                return null;
            }
            return (C22558j) ((HashMap) C26343l.C26344a.f73414d0).get(C26794h.m35219g(kVar));
        }
        m33836a(77);
        throw null;
    }

    /* renamed from: u */
    public static C22558j m33840u(C26469k kVar) {
        if (kVar != null) {
            if (!((HashSet) C26343l.C26344a.f73408a0).contains(kVar.getName())) {
                return null;
            }
            return (C22558j) ((HashMap) C26343l.C26344a.f73412c0).get(C26794h.m35219g(kVar));
        }
        m33836a(76);
        throw null;
    }

    /* renamed from: y */
    public static boolean m33841y(C25143j0 j0Var) {
        if (j0Var != null) {
            return m33825B(j0Var, C26343l.C26344a.f73409b);
        }
        m33836a(139);
        throw null;
    }

    /* renamed from: z */
    public static boolean m33842z(C25143j0 j0Var) {
        if (j0Var != null) {
            return m33825B(j0Var, C26343l.C26344a.f73418h);
        }
        m33836a(88);
        throw null;
    }

    /* renamed from: d */
    public void mo53312d(boolean z) {
        C22830f fVar = f73354e;
        C24980n nVar = this.f73358d;
        C87412m.m108594g(fVar, "moduleName");
        C87412m.m108594g(nVar, "storageManager");
        C26729b0 b0Var = new C26729b0(fVar, nVar, this, (C26526a) null, (Map) null, (C22830f) null, 48, (C8480h) null);
        this.f73355a = b0Var;
        C26328a.f73349a.getClass();
        C22936j0 a = C26328a.C26329a.f73351b.getValue().mo51860a(this.f73358d, this.f73355a, mo53321m(), mo53325q(), mo53313e(), z);
        C87412m.m108594g(a, "providerForModuleContent");
        b0Var.f74316n = a;
        C26729b0 b0Var2 = this.f73355a;
        b0Var2.getClass();
        List a0 = C110823p.m151001a0(new C26729b0[]{b0Var2});
        C64187h0 h0Var = C64187h0.f181908d;
        b0Var2.f74315j = new C23598y(a0, h0Var, C64186f0.f181907d, h0Var);
    }

    /* renamed from: e */
    public C26640a mo53313e() {
        return C26640a.C26641a.f74149a;
    }

    /* renamed from: f */
    public C25176s0 mo53314f() {
        C25176s0 s = mo53319k("Any").mo36111s();
        if (s != null) {
            return s;
        }
        m33836a(50);
        throw null;
    }

    /* renamed from: g */
    public C25143j0 mo53315g(C25143j0 j0Var) {
        C26408b f;
        C26408b bVar;
        C26447e a;
        C25176s0 s0Var = null;
        if (j0Var == null) {
            m33836a(67);
            throw null;
        } else if (!m33842z(j0Var)) {
            C25143j0 i = C25187v1.m32089i(j0Var);
            C25143j0 j0Var2 = ((C22556d) this.f73356b.invoke()).f64870c.get(i);
            if (j0Var2 != null) {
                return j0Var2;
            }
            if (i != null) {
                int i2 = C26794h.f74523a;
                C22935h o = i.mo37081K0().mo37094o();
                C26448e0 e = o == null ? null : C26794h.m35217e(o);
                if (e != null) {
                    C22935h o2 = i.mo37081K0().mo37094o();
                    if (o2 != null) {
                        Set<C22830f> set = C26348p.f73448a;
                        C22830f name = o2.getName();
                        C87412m.m108594g(name, "name");
                        if (!(!C26348p.f73452e.contains(name) || (f = C24442a.m30539f(o2)) == null || (bVar = C26348p.f73450c.get(f)) == null || (a = C26510v.m34216a(e, bVar)) == null)) {
                            s0Var = a.mo36111s();
                        }
                    }
                    if (s0Var != null) {
                        return s0Var;
                    }
                }
                throw new IllegalStateException("not array: " + j0Var);
            }
            C26794h.m35213a(20);
            throw null;
        } else if (j0Var.mo37079I0().size() == 1) {
            C25143j0 type = j0Var.mo37079I0().get(0).getType();
            if (type != null) {
                return type;
            }
            m33836a(68);
            throw null;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public C25176s0 mo53316h(C25202z1 z1Var, C25143j0 j0Var) {
        if (z1Var == null) {
            m33836a(82);
            throw null;
        } else if (j0Var != null) {
            int i = C26571h.f73936P0;
            return mo53317i(z1Var, j0Var, C26571h.C26572a.f73937a);
        } else {
            m33836a(83);
            throw null;
        }
    }

    /* renamed from: i */
    public C25176s0 mo53317i(C25202z1 z1Var, C25143j0 j0Var, C26571h hVar) {
        if (z1Var == null) {
            m33836a(78);
            throw null;
        } else if (j0Var == null) {
            m33836a(79);
            throw null;
        } else if (hVar != null) {
            return C25146k0.m31959e(C25126h1.m31918b(hVar), mo53319k("Array"), Collections.singletonList(new C25164o1(z1Var, j0Var)));
        } else {
            m33836a(80);
            throw null;
        }
    }

    /* renamed from: j */
    public C26447e mo53318j(C22826c cVar) {
        if (cVar != null) {
            C26447e b = C26489q.m34175b(mo53320l(), cVar, C24476d.FROM_BUILTINS);
            if (b != null) {
                return b;
            }
            m33836a(13);
            throw null;
        }
        m33836a(12);
        throw null;
    }

    /* renamed from: k */
    public final C26447e mo53319k(String str) {
        if (str != null) {
            C26447e eVar = (C26447e) ((C24959e.C24972m) this.f73357c).invoke(C22830f.m26794f(str));
            if (eVar != null) {
                return eVar;
            }
            m33836a(15);
            throw null;
        }
        m33836a(14);
        throw null;
    }

    /* renamed from: l */
    public C26729b0 mo53320l() {
        C26729b0 b0Var = this.f73355a;
        b0Var.getClass();
        if (b0Var != null) {
            return b0Var;
        }
        m33836a(7);
        throw null;
    }

    /* renamed from: m */
    public Iterable<C26642b> mo53321m() {
        List singletonList = Collections.singletonList(new C26368a(this.f73358d, mo53320l()));
        if (singletonList != null) {
            return singletonList;
        }
        m33836a(5);
        throw null;
    }

    /* renamed from: n */
    public C25176s0 mo53322n() {
        C25176s0 p = mo53324p();
        if (p != null) {
            return p;
        }
        m33836a(52);
        throw null;
    }

    /* renamed from: o */
    public C25176s0 mo53323o() {
        C25176s0 s = mo53319k("Nothing").mo36111s();
        if (s != null) {
            return s;
        }
        m33836a(48);
        throw null;
    }

    /* renamed from: p */
    public C25176s0 mo53324p() {
        C25176s0 R0 = mo53314f().mo37084O0(true);
        if (R0 != null) {
            return R0;
        }
        m33836a(51);
        throw null;
    }

    /* renamed from: q */
    public C26643c mo53325q() {
        return C26643c.C26645b.f74151a;
    }

    /* renamed from: r */
    public C25176s0 mo53326r(C22558j jVar) {
        if (jVar != null) {
            C25176s0 s0Var = ((C22556d) this.f73356b.invoke()).f64868a.get(jVar);
            if (s0Var != null) {
                return s0Var;
            }
            m33836a(74);
            throw null;
        }
        m33836a(73);
        throw null;
    }

    /* renamed from: t */
    public C25176s0 mo53327t(C22558j jVar) {
        if (jVar == null) {
            m33836a(53);
            throw null;
        } else if (jVar != null) {
            C25176s0 s = mo53319k(jVar.f64883d.mo35995b()).mo36111s();
            if (s != null) {
                return s;
            }
            m33836a(54);
            throw null;
        } else {
            m33836a(16);
            throw null;
        }
    }

    /* renamed from: v */
    public C25176s0 mo53328v() {
        C25176s0 s = mo53319k("String").mo36111s();
        if (s != null) {
            return s;
        }
        m33836a(65);
        throw null;
    }

    /* renamed from: w */
    public C26447e mo53329w(int i) {
        C22826c cVar = C26343l.f73370d;
        C26447e j = mo53318j(cVar.mo35974c(C22830f.m26794f(C26371c.SuspendFunction.f73572e + i)));
        if (j != null) {
            return j;
        }
        m33836a(18);
        throw null;
    }

    /* renamed from: x */
    public C25176s0 mo53330x() {
        C25176s0 s = mo53319k("Unit").mo36111s();
        if (s != null) {
            return s;
        }
        m33836a(64);
        throw null;
    }
}
