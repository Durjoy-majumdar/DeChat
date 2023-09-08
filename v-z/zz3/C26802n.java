package zz3;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import n04.C25119f0;
import n04.C25123h;
import n04.C25134i1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25153l0;
import n04.C25198y1;
import o04.C25318c;
import o04.C25320d;
import o04.C25323e;
import rx3.C13598b0;
import sx3.C110818d0;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26485o;
import wy3.C26491r;
import wy3.C26504r0;
import wy3.C26507t0;
import wy3.C26509u0;
import wy3.C26516w;
import zz3.C26795i;

/* renamed from: zz3.n */
public class C26802n {

    /* renamed from: e */
    public static final List<C26795i> f74533e;

    /* renamed from: f */
    public static final C26802n f74534f;

    /* renamed from: g */
    public static final C25318c.C25319a f74535g;

    /* renamed from: a */
    public final C25323e f74536a;

    /* renamed from: b */
    public final C25320d f74537b;

    /* renamed from: c */
    public final C25318c.C25319a f74538c;

    /* renamed from: d */
    public final C32227p<C25143j0, C25143j0, Boolean> f74539d;

    /* renamed from: zz3.n$a */
    public static class C26803a implements C25318c.C25319a {
        /* renamed from: b */
        public static /* synthetic */ void m35270b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo52405a(C25144j1 j1Var, C25144j1 j1Var2) {
            if (j1Var == null) {
                m35270b(0);
                throw null;
            } else if (j1Var2 != null) {
                return j1Var.equals(j1Var2);
            } else {
                m35270b(1);
                throw null;
            }
        }
    }

    /* renamed from: zz3.n$b */
    public static class C26804b implements C32226l<C26436b, C26434a> {
        public Object invoke(Object obj) {
            return (C26436b) obj;
        }
    }

    /* renamed from: zz3.n$c */
    public static class C26805c {

        /* renamed from: b */
        public static final C26805c f74540b = new C26805c(C26806a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        public final C26806a f74541a;

        /* renamed from: zz3.n$c$a */
        public enum C26806a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public C26805c(C26806a aVar, String str) {
            if (aVar == null) {
                m35272a(3);
                throw null;
            } else if (str != null) {
                this.f74541a = aVar;
            } else {
                m35272a(4);
                throw null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void m35272a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = 2
                goto L_0x001c
            L_0x001b:
                r5 = 3
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: zz3.C26802n.C26805c.m35272a(int):void");
        }

        /* renamed from: b */
        public static C26805c m35273b(String str) {
            if (str != null) {
                return new C26805c(C26806a.CONFLICT, str);
            }
            m35272a(2);
            throw null;
        }

        /* renamed from: d */
        public static C26805c m35274d(String str) {
            if (str != null) {
                return new C26805c(C26806a.INCOMPATIBLE, str);
            }
            m35272a(1);
            throw null;
        }

        /* renamed from: c */
        public C26806a mo53767c() {
            C26806a aVar = this.f74541a;
            if (aVar != null) {
                return aVar;
            }
            m35272a(5);
            throw null;
        }
    }

    static {
        Class<C26795i> cls = C26795i.class;
        f74533e = C110818d0.m150953y0(ServiceLoader.load(cls, cls.getClassLoader()));
        C26803a aVar = new C26803a();
        f74535g = aVar;
        f74534f = new C26802n(aVar, C25323e.C25324a.f71823a, C25320d.C25321a.f71822a, (C32227p<C25143j0, C25143j0, Boolean>) null);
    }

    public C26802n(C25318c.C25319a aVar, C25323e eVar, C25320d dVar, C32227p<C25143j0, C25143j0, Boolean> pVar) {
        if (aVar == null) {
            m35251a(5);
            throw null;
        } else if (eVar == null) {
            m35251a(6);
            throw null;
        } else if (dVar != null) {
            this.f74538c = aVar;
            this.f74536a = eVar;
            this.f74537b = dVar;
            this.f74539d = pVar;
        } else {
            m35251a(7);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m35251a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
        }
        if (i3 == 11 || i3 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 16) {
            if (i3 != 21) {
                if (i3 == 95) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 98) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 103) {
                    if (i3 != 44 && i3 != 45) {
                        switch (i3) {
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                break;
                            default:
                                switch (i3) {
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 80:
                                            case 81:
                                            case 82:
                                            case 83:
                                            case 84:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeCheckerState";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static boolean m35252b(C25143j0 j0Var, C25143j0 j0Var2, C25134i1 i1Var) {
        if (j0Var == null) {
            m35251a(46);
            throw null;
        } else if (j0Var2 == null) {
            m35251a(47);
            throw null;
        } else if (i1Var != null) {
            if (C25153l0.m31968a(j0Var) && C25153l0.m31968a(j0Var2)) {
                return true;
            }
            return C25123h.f71559a.mo52264e(i1Var, j0Var.mo52229N0(), j0Var2.mo52229N0());
        } else {
            m35251a(48);
            throw null;
        }
    }

    /* renamed from: c */
    public static void m35253c(C26436b bVar, Set<C26436b> set) {
        if (bVar == null) {
            m35251a(17);
            throw null;
        } else if (set != null) {
            C26436b.C26437a f = bVar.mo52634f();
            f.getClass();
            if (f != C26436b.C26437a.FAKE_OVERRIDE) {
                set.add(bVar);
            } else if (!bVar.mo52633e().isEmpty()) {
                for (C26436b c : bVar.mo52633e()) {
                    m35253c(c, set);
                }
            } else {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
            }
        } else {
            m35251a(18);
            throw null;
        }
    }

    /* renamed from: d */
    public static List<C25143j0> m35254d(C26434a aVar) {
        C26509u0 I = aVar.mo52627I();
        ArrayList arrayList = new ArrayList();
        if (I != null) {
            arrayList.add(I.getType());
        }
        for (C26463h1 type : aVar.mo52639h()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2 = r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m35255e(java.util.Collection<wy3.C26436b> r16, wy3.C26447e r17, zz3.C26801m r18) {
        /*
            r0 = r16
            r1 = r17
            r6 = r18
            r2 = 0
            if (r0 == 0) goto L_0x019f
            if (r1 == 0) goto L_0x0199
            if (r6 == 0) goto L_0x0193
            if (r1 == 0) goto L_0x018d
            if (r0 == 0) goto L_0x0187
            zz3.o r3 = new zz3.o
            r3.<init>(r1)
            java.util.List r3 = sx3.C110818d0.m150911I(r0, r3)
            r4 = r3
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0025
            r7 = r0
            goto L_0x0026
        L_0x0025:
            r7 = r3
        L_0x0026:
            wy3.c0 r0 = wy3.C26442c0.ABSTRACT
            java.util.Iterator r3 = r7.iterator()
            r5 = 1
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0030:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x006f
            java.lang.Object r11 = r3.next()
            wy3.b r11 = (wy3.C26436b) r11
            wy3.c0 r12 = r11.mo51802j()
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x006a
            if (r12 == r5) goto L_0x0053
            r11 = 2
            if (r12 == r11) goto L_0x0051
            r11 = 3
            if (r12 == r11) goto L_0x004f
            goto L_0x0030
        L_0x004f:
            r10 = 1
            goto L_0x0030
        L_0x0051:
            r9 = 1
            goto L_0x0030
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Member cannot have SEALED modality: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006a:
            wy3.c0 r0 = wy3.C26442c0.FINAL
        L_0x006c:
            r2 = r0
            goto L_0x0158
        L_0x006f:
            boolean r3 = r17.mo51792P()
            if (r3 == 0) goto L_0x0085
            wy3.c0 r3 = r17.mo51802j()
            if (r3 == r0) goto L_0x0085
            wy3.c0 r3 = r17.mo51802j()
            wy3.c0 r11 = wy3.C26442c0.SEALED
            if (r3 == r11) goto L_0x0085
            r3 = 1
            goto L_0x0086
        L_0x0085:
            r3 = 0
        L_0x0086:
            if (r9 == 0) goto L_0x008d
            if (r10 != 0) goto L_0x008d
            wy3.c0 r0 = wy3.C26442c0.OPEN
            goto L_0x006c
        L_0x008d:
            if (r9 != 0) goto L_0x00a0
            if (r10 == 0) goto L_0x00a0
            if (r3 == 0) goto L_0x0097
            wy3.c0 r0 = r17.mo51802j()
        L_0x0097:
            if (r0 == 0) goto L_0x009a
            goto L_0x006c
        L_0x009a:
            r0 = 92
            m35251a(r0)
            throw r2
        L_0x00a0:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Iterator r10 = r7.iterator()
        L_0x00a9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c9
            java.lang.Object r11 = r10.next()
            wy3.b r11 = (wy3.C26436b) r11
            if (r11 == 0) goto L_0x00c3
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            m35253c(r11, r12)
            r9.addAll(r12)
            goto L_0x00a9
        L_0x00c3:
            r0 = 15
            m35251a(r0)
            throw r2
        L_0x00c9:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x00e5
            java.util.Iterator r10 = r9.iterator()
            java.lang.Object r10 = r10.next()
            wy3.k r10 = (wy3.C26469k) r10
            wy3.e0 r10 = d04.C24442a.m30543j(r10)
            wy3.d0<o04.n<java.lang.Object>> r11 = o04.C25325f.f71824a
            java.lang.Object r10 = r10.mo52619J(r11)
            o04.n r10 = (o04.C25334n) r10
        L_0x00e5:
            int r10 = r9.size()
            if (r10 > r5) goto L_0x00ec
            goto L_0x0128
        L_0x00ec:
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00f5:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0127
            java.lang.Object r11 = r9.next()
            java.util.Iterator r12 = r10.iterator()
        L_0x0103:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0123
            java.lang.Object r13 = r12.next()
            r14 = r11
            wy3.a r14 = (wy3.C26434a) r14
            wy3.a r13 = (wy3.C26434a) r13
            boolean r15 = m35262q(r14, r13, r8, r5)
            if (r15 == 0) goto L_0x011c
            r12.remove()
            goto L_0x0103
        L_0x011c:
            boolean r13 = m35262q(r13, r14, r8, r5)
            if (r13 == 0) goto L_0x0103
            goto L_0x00f5
        L_0x0123:
            r10.add(r11)
            goto L_0x00f5
        L_0x0127:
            r9 = r10
        L_0x0128:
            wy3.c0 r5 = r17.mo51802j()
            if (r5 == 0) goto L_0x0181
            java.util.Iterator r8 = r9.iterator()
            r9 = r0
        L_0x0133:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0155
            java.lang.Object r10 = r8.next()
            wy3.b r10 = (wy3.C26436b) r10
            if (r3 == 0) goto L_0x0149
            wy3.c0 r11 = r10.mo51802j()
            if (r11 != r0) goto L_0x0149
            r10 = r5
            goto L_0x014d
        L_0x0149:
            wy3.c0 r10 = r10.mo51802j()
        L_0x014d:
            int r11 = r10.compareTo(r9)
            if (r11 >= 0) goto L_0x0133
            r9 = r10
            goto L_0x0133
        L_0x0155:
            if (r9 == 0) goto L_0x017b
            r2 = r9
        L_0x0158:
            if (r4 == 0) goto L_0x015d
            wy3.s r0 = wy3.C26491r.f73785h
            goto L_0x015f
        L_0x015d:
            wy3.s r0 = wy3.C26491r.f73784g
        L_0x015f:
            r3 = r0
            zz3.n$b r0 = new zz3.n$b
            r0.<init>()
            java.lang.Object r0 = m35264s(r7, r0)
            wy3.b r0 = (wy3.C26436b) r0
            wy3.b$a r4 = wy3.C26436b.C26437a.FAKE_OVERRIDE
            r5 = 0
            r1 = r17
            wy3.b r0 = r0.mo52598y(r1, r2, r3, r4, r5)
            r6.mo51295d(r0, r7)
            r6.mo51218a(r0)
            return
        L_0x017b:
            r0 = 95
            m35251a(r0)
            throw r2
        L_0x0181:
            r0 = 94
            m35251a(r0)
            throw r2
        L_0x0187:
            r0 = 97
            m35251a(r0)
            throw r2
        L_0x018d:
            r0 = 96
            m35251a(r0)
            throw r2
        L_0x0193:
            r0 = 87
            m35251a(r0)
            throw r2
        L_0x0199:
            r0 = 86
            m35251a(r0)
            throw r2
        L_0x019f:
            r0 = 85
            m35251a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zz3.C26802n.m35255e(java.util.Collection, wy3.e, zz3.m):void");
    }

    /* renamed from: g */
    public static <H> Collection<H> m35256g(H h, Collection<H> collection, C32226l<H, C26434a> lVar, C32226l<H, C13598b0> lVar2) {
        if (h == null) {
            m35251a(99);
            throw null;
        } else if (collection == null) {
            m35251a(100);
            throw null;
        } else if (lVar == null) {
            m35251a(101);
            throw null;
        } else if (lVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h);
            C26434a invoke = lVar.invoke(h);
            Iterator<H> it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                C26434a invoke2 = lVar.invoke(next);
                if (h == next) {
                    it.remove();
                } else {
                    C26805c.C26806a j = m35258j(invoke, invoke2);
                    if (j == C26805c.C26806a.OVERRIDABLE) {
                        arrayList.add(next);
                        it.remove();
                    } else if (j == C26805c.C26806a.CONFLICT) {
                        lVar2.invoke(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        } else {
            m35251a(102);
            throw null;
        }
    }

    /* renamed from: i */
    public static C26805c m35257i(C26434a aVar, C26434a aVar2) {
        boolean z;
        if (aVar == null) {
            m35251a(40);
            throw null;
        } else if (aVar2 != null) {
            boolean z2 = aVar instanceof C26516w;
            if ((z2 && !(aVar2 instanceof C26516w)) || (((z = aVar instanceof C26504r0)) && !(aVar2 instanceof C26504r0))) {
                return C26805c.m35274d("Member kind mismatch");
            }
            if (!z2 && !z) {
                throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
            } else if (!aVar.getName().equals(aVar2.getName())) {
                return C26805c.m35274d("Name mismatch");
            } else {
                boolean z3 = false;
                boolean z4 = aVar.mo52627I() == null;
                if (aVar2.mo52627I() == null) {
                    z3 = true;
                }
                C26805c d = z4 != z3 ? C26805c.m35274d("Receiver presence mismatch") : aVar.mo52639h().size() != aVar2.mo52639h().size() ? C26805c.m35274d("Value parameter number mismatch") : null;
                if (d != null) {
                    return d;
                }
                return null;
            }
        } else {
            m35251a(41);
            throw null;
        }
    }

    /* renamed from: j */
    public static C26805c.C26806a m35258j(C26434a aVar, C26434a aVar2) {
        C26802n nVar = f74534f;
        C26805c.C26806a c = nVar.mo53764l(aVar2, aVar, (C26447e) null).mo53767c();
        C26805c.C26806a c2 = nVar.mo53764l(aVar, aVar2, (C26447e) null).mo53767c();
        C26805c.C26806a aVar3 = C26805c.C26806a.OVERRIDABLE;
        if (c == aVar3 && c2 == aVar3) {
            return aVar3;
        }
        C26805c.C26806a aVar4 = C26805c.C26806a.CONFLICT;
        return (c == aVar4 || c2 == aVar4) ? aVar4 : C26805c.C26806a.INCOMPATIBLE;
    }

    /* renamed from: k */
    public static boolean m35259k(C26434a aVar, C26434a aVar2) {
        if (aVar == null) {
            m35251a(67);
            throw null;
        } else if (aVar2 != null) {
            C25143j0 returnType = aVar.getReturnType();
            C25143j0 returnType2 = aVar2.getReturnType();
            if (!m35261p(aVar, aVar2)) {
                return false;
            }
            C25134i1 f = f74534f.mo53762f(aVar.getTypeParameters(), aVar2.getTypeParameters());
            if (aVar instanceof C26516w) {
                return m35260o(aVar, returnType, aVar2, returnType2, f);
            }
            if (aVar instanceof C26504r0) {
                C26504r0 r0Var = (C26504r0) aVar;
                C26504r0 r0Var2 = (C26504r0) aVar2;
                C26507t0 i = r0Var.mo52640i();
                C26507t0 i2 = r0Var2.mo52640i();
                if (!((i == null || i2 == null) ? true : m35261p(i, i2))) {
                    return false;
                }
                return (!r0Var.mo52631c0() || !r0Var2.mo52631c0()) ? (r0Var.mo52631c0() || !r0Var2.mo52631c0()) && m35260o(aVar, returnType, aVar2, returnType2, f) : C25123h.f71559a.mo52264e(f, returnType.mo52229N0(), returnType2.mo52229N0());
            }
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        } else {
            m35251a(68);
            throw null;
        }
    }

    /* renamed from: o */
    public static boolean m35260o(C26434a aVar, C25143j0 j0Var, C26434a aVar2, C25143j0 j0Var2, C25134i1 i1Var) {
        if (aVar == null) {
            m35251a(73);
            throw null;
        } else if (j0Var == null) {
            m35251a(74);
            throw null;
        } else if (aVar2 == null) {
            m35251a(75);
            throw null;
        } else if (j0Var2 == null) {
            m35251a(76);
            throw null;
        } else if (i1Var != null) {
            C25123h hVar = C25123h.f71559a;
            C25198y1 N0 = j0Var.mo52229N0();
            C25198y1 N02 = j0Var2.mo52229N0();
            C87412m.m108594g(N0, "subType");
            C87412m.m108594g(N02, "superType");
            return C25123h.m31901i(hVar, i1Var, N0, N02, false, 8, (Object) null);
        } else {
            m35251a(77);
            throw null;
        }
    }

    /* renamed from: p */
    public static boolean m35261p(C26485o oVar, C26485o oVar2) {
        if (oVar == null) {
            m35251a(69);
            throw null;
        } else if (oVar2 != null) {
            Integer b = C26491r.m34179b(oVar.getVisibility(), oVar2.getVisibility());
            return b == null || b.intValue() >= 0;
        } else {
            m35251a(70);
            throw null;
        }
    }

    /* renamed from: q */
    public static <D extends C26434a> boolean m35262q(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            m35251a(13);
            throw null;
        } else if (d2 == null) {
            m35251a(14);
            throw null;
        } else if (!d.equals(d2) && C26791f.f74522a.mo53755a(d.mo36109a(), d2.mo36109a(), z, z2)) {
            return true;
        } else {
            C26434a a = d2.mo36109a();
            int i = C26794h.f74523a;
            LinkedHashSet<C26434a> linkedHashSet = new LinkedHashSet<>();
            C26794h.m35214b(d.mo36109a(), linkedHashSet);
            for (C26434a a2 : linkedHashSet) {
                if (C26791f.f74522a.mo53755a(a, a2, z, z2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m35263r(wy3.C26436b r6, fy3.C32226l<wy3.C26436b, rx3.C13598b0> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x011f
            java.util.Collection r1 = r6.mo52633e()
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            wy3.b r2 = (wy3.C26436b) r2
            wy3.s r3 = r2.getVisibility()
            wy3.s r4 = wy3.C26491r.f73784g
            if (r3 != r4) goto L_0x000b
            m35263r(r2, r7)
            goto L_0x000b
        L_0x0023:
            wy3.s r1 = r6.getVisibility()
            wy3.s r2 = wy3.C26491r.f73784g
            if (r1 == r2) goto L_0x002c
            return
        L_0x002c:
            java.util.Collection r1 = r6.mo52633e()
            if (r1 == 0) goto L_0x0119
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003b
            wy3.s r2 = wy3.C26491r.f73789l
            goto L_0x0088
        L_0x003b:
            java.util.Iterator r2 = r1.iterator()
        L_0x003f:
            r3 = r0
        L_0x0040:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r2.next()
            wy3.b r4 = (wy3.C26436b) r4
            wy3.s r4 = r4.getVisibility()
            if (r3 != 0) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            java.lang.Integer r5 = wy3.C26491r.m34179b(r4, r3)
            if (r5 != 0) goto L_0x005a
            goto L_0x003f
        L_0x005a:
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x0040
        L_0x0060:
            r3 = r4
            goto L_0x0040
        L_0x0062:
            if (r3 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            java.util.Iterator r2 = r1.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r2.next()
            wy3.b r4 = (wy3.C26436b) r4
            wy3.s r4 = r4.getVisibility()
            java.lang.Integer r4 = wy3.C26491r.m34179b(r3, r4)
            if (r4 == 0) goto L_0x0085
            int r4 = r4.intValue()
            if (r4 >= 0) goto L_0x0069
        L_0x0085:
            r2 = r0
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            if (r2 != 0) goto L_0x008c
        L_0x008a:
            r2 = r0
            goto L_0x00bb
        L_0x008c:
            wy3.b$a r3 = r6.mo52634f()
            wy3.b$a r4 = wy3.C26436b.C26437a.FAKE_OVERRIDE
            if (r3 != r4) goto L_0x00b7
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()
            wy3.b r3 = (wy3.C26436b) r3
            wy3.c0 r4 = r3.mo51802j()
            wy3.c0 r5 = wy3.C26442c0.ABSTRACT
            if (r4 == r5) goto L_0x0098
            wy3.s r3 = r3.getVisibility()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0098
            goto L_0x008a
        L_0x00b7:
            wy3.s r2 = r2.mo53465d()
        L_0x00bb:
            if (r2 != 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c2
            r7.invoke(r6)
        L_0x00c2:
            wy3.s r1 = wy3.C26491r.f73782e
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            boolean r3 = r6 instanceof zy3.C26746g0
            if (r3 == 0) goto L_0x00f6
            r3 = r6
            zy3.g0 r3 = (zy3.C26746g0) r3
            if (r1 == 0) goto L_0x00f0
            r3.f74369p = r1
            wy3.r0 r6 = (wy3.C26504r0) r6
            java.util.List r6 = r6.mo52630X()
            java.util.Iterator r6 = r6.iterator()
        L_0x00db:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0118
            java.lang.Object r1 = r6.next()
            wy3.q0 r1 = (wy3.C26490q0) r1
            if (r2 != 0) goto L_0x00eb
            r3 = r0
            goto L_0x00ec
        L_0x00eb:
            r3 = r7
        L_0x00ec:
            m35263r(r1, r3)
            goto L_0x00db
        L_0x00f0:
            r6 = 20
            zy3.C26746g0.m34868D(r6)
            throw r0
        L_0x00f6:
            boolean r7 = r6 instanceof zy3.C26777s
            if (r7 == 0) goto L_0x0107
            zy3.s r6 = (zy3.C26777s) r6
            if (r1 == 0) goto L_0x0101
            r6.f74465r = r1
            goto L_0x0118
        L_0x0101:
            r6 = 10
            zy3.C26777s.m35097D(r6)
            throw r0
        L_0x0107:
            zy3.f0 r6 = (zy3.C26741f0) r6
            r6.f74346q = r1
            wy3.r0 r7 = r6.mo53467u0()
            wy3.s r7 = r7.getVisibility()
            if (r1 == r7) goto L_0x0118
            r7 = 0
            r6.f74340h = r7
        L_0x0118:
            return
        L_0x0119:
            r6 = 109(0x6d, float:1.53E-43)
            m35251a(r6)
            throw r0
        L_0x011f:
            r6 = 107(0x6b, float:1.5E-43)
            m35251a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zz3.C26802n.m35263r(wy3.b, fy3.l):void");
    }

    /* renamed from: s */
    public static <H> H m35264s(Collection<H> collection, C32226l<H, C26434a> lVar) {
        H h;
        boolean z;
        if (collection == null) {
            m35251a(78);
            throw null;
        } else if (lVar == null) {
            m35251a(79);
            throw null;
        } else if (collection.size() == 1) {
            H K = C110818d0.m150913K(collection);
            if (K != null) {
                return K;
            }
            m35251a(80);
            throw null;
        } else {
            ArrayList arrayList = new ArrayList(2);
            List<C26434a> X = C110818d0.m150926X(collection, lVar);
            H K2 = C110818d0.m150913K(collection);
            C26434a invoke = lVar.invoke(K2);
            for (H next : collection) {
                C26434a invoke2 = lVar.invoke(next);
                if (invoke2 != null) {
                    Iterator it = ((ArrayList) X).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!m35259k(invoke2, (C26434a) it.next())) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                    if (m35259k(invoke2, invoke) && !m35259k(invoke, invoke2)) {
                        K2 = next;
                    }
                } else {
                    m35251a(71);
                    throw null;
                }
            }
            if (arrayList.isEmpty()) {
                if (K2 != null) {
                    return K2;
                }
                m35251a(81);
                throw null;
            } else if (arrayList.size() == 1) {
                H K3 = C110818d0.m150913K(arrayList);
                if (K3 != null) {
                    return K3;
                }
                m35251a(82);
                throw null;
            } else {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        h = null;
                        break;
                    }
                    h = it4.next();
                    if (!C25119f0.m31892b(lVar.invoke(h).getReturnType())) {
                        break;
                    }
                }
                if (h != null) {
                    return h;
                }
                H K4 = C110818d0.m150913K(arrayList);
                if (K4 != null) {
                    return K4;
                }
                m35251a(84);
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final C25134i1 mo53762f(List<C26446d1> list, List<C26446d1> list2) {
        if (list == null) {
            m35251a(42);
            throw null;
        } else if (list2 == null) {
            m35251a(43);
            throw null;
        } else if (list.isEmpty()) {
            C26810s sVar = new C26810s((Map<C25144j1, ? extends C25144j1>) null, this.f74538c, this.f74536a, this.f74537b, this.f74539d);
            if (sVar.f74554e == null) {
                C25323e eVar = sVar.f74552c;
                C25320d dVar = sVar.f74553d;
                C87412m.m108594g(dVar, "kotlinTypePreparator");
                C87412m.m108594g(eVar, "kotlinTypeRefiner");
                return new C25134i1(true, true, true, sVar, dVar, eVar);
            }
            return new C26809r(true, true, sVar, sVar.f74553d, sVar.f74552c);
        } else {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(list.get(i).mo36110l(), list2.get(i).mo36110l());
            }
            C26810s sVar2 = new C26810s(hashMap, this.f74538c, this.f74536a, this.f74537b, this.f74539d);
            if (sVar2.f74554e == null) {
                C25323e eVar2 = sVar2.f74552c;
                C25320d dVar2 = sVar2.f74553d;
                C87412m.m108594g(dVar2, "kotlinTypePreparator");
                C87412m.m108594g(eVar2, "kotlinTypeRefiner");
                return new C25134i1(true, true, true, sVar2, dVar2, eVar2);
            }
            return new C26809r(true, true, sVar2, sVar2.f74553d, sVar2.f74552c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53763h(vz3.C22830f r18, java.util.Collection<? extends wy3.C26436b> r19, java.util.Collection<? extends wy3.C26436b> r20, wy3.C26447e r21, zz3.C26801m r22) {
        /*
            r17 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 0
            if (r18 == 0) goto L_0x0165
            if (r0 == 0) goto L_0x015d
            if (r20 == 0) goto L_0x0155
            if (r1 == 0) goto L_0x014d
            if (r2 == 0) goto L_0x0145
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r0)
            java.util.Iterator r5 = r20.iterator()
        L_0x001a:
            boolean r6 = r5.hasNext()
            r7 = 2
            r9 = 0
            if (r6 == 0) goto L_0x0099
            java.lang.Object r6 = r5.next()
            wy3.b r6 = (wy3.C26436b) r6
            if (r6 == 0) goto L_0x0091
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r19.size()
            r10.<init>(r11)
            w04.f$b r11 = w04.C22850f.f65674f
            w04.f r11 = r11.mo36008a()
            java.util.Iterator r12 = r19.iterator()
        L_0x003d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0088
            java.lang.Object r13 = r12.next()
            wy3.b r13 = (wy3.C26436b) r13
            r14 = r17
            zz3.n$c r15 = r14.mo53764l(r13, r6, r1)
            zz3.n$c$a r15 = r15.mo53767c()
            wy3.s r16 = r13.getVisibility()
            boolean r16 = wy3.C26491r.m34182e(r16)
            if (r16 != 0) goto L_0x006c
            h04.f r8 = wy3.C26491r.f73791n
            wy3.o r8 = wy3.C26491r.m34180c(r8, r13, r6, r9)
            if (r8 != 0) goto L_0x0067
            r8 = 1
            goto L_0x0068
        L_0x0067:
            r8 = 0
        L_0x0068:
            if (r8 == 0) goto L_0x006c
            r8 = 1
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            int r15 = r15.ordinal()
            if (r15 == 0) goto L_0x007f
            if (r15 == r7) goto L_0x0076
            goto L_0x003d
        L_0x0076:
            if (r8 == 0) goto L_0x007b
            r2.mo53761c(r13, r6)
        L_0x007b:
            r10.add(r13)
            goto L_0x003d
        L_0x007f:
            if (r8 == 0) goto L_0x0084
            r11.add(r13)
        L_0x0084:
            r10.add(r13)
            goto L_0x003d
        L_0x0088:
            r14 = r17
            r2.mo51295d(r6, r11)
            r4.removeAll(r10)
            goto L_0x001a
        L_0x0091:
            r14 = r17
            r0 = 59
            m35251a(r0)
            throw r3
        L_0x0099:
            r14 = r17
            int r0 = r4.size()
            if (r0 >= r7) goto L_0x00a2
            goto L_0x00dc
        L_0x00a2:
            java.util.Iterator r0 = r4.iterator()
            java.lang.Object r0 = r0.next()
            wy3.b r0 = (wy3.C26436b) r0
            wy3.k r0 = r0.mo51892b()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00b7
            goto L_0x00dc
        L_0x00b7:
            java.util.Iterator r5 = r4.iterator()
        L_0x00bb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00dc
            java.lang.Object r6 = r5.next()
            wy3.b r6 = (wy3.C26436b) r6
            wy3.k r6 = r6.mo51892b()
            if (r6 != r0) goto L_0x00cf
            r6 = 1
            goto L_0x00d0
        L_0x00cf:
            r6 = 0
        L_0x00d0:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00bb
            r8 = 0
            goto L_0x00dd
        L_0x00dc:
            r8 = 1
        L_0x00dd:
            if (r8 == 0) goto L_0x00f7
            java.util.Iterator r0 = r4.iterator()
        L_0x00e3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0144
            java.lang.Object r3 = r0.next()
            wy3.b r3 = (wy3.C26436b) r3
            java.util.Set r3 = java.util.Collections.singleton(r3)
            m35255e(r3, r1, r2)
            goto L_0x00e3
        L_0x00f7:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r4)
        L_0x00fc:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0144
            r0.isEmpty()
            java.util.Iterator r4 = r0.iterator()
            r5 = r3
        L_0x010a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x012f
            java.lang.Object r6 = r4.next()
            wy3.b r6 = (wy3.C26436b) r6
            if (r5 != 0) goto L_0x0119
            goto L_0x012d
        L_0x0119:
            wy3.s r7 = r5.getVisibility()
            wy3.s r8 = r6.getVisibility()
            java.lang.Integer r7 = wy3.C26491r.m34179b(r7, r8)
            if (r7 == 0) goto L_0x010a
            int r7 = r7.intValue()
            if (r7 >= 0) goto L_0x010a
        L_0x012d:
            r5 = r6
            goto L_0x010a
        L_0x012f:
            gy3.C87412m.m108591d(r5)
            zz3.p r4 = new zz3.p
            r4.<init>()
            zz3.q r6 = new zz3.q
            r6.<init>(r2, r5)
            java.util.Collection r4 = m35256g(r5, r0, r4, r6)
            m35255e(r4, r1, r2)
            goto L_0x00fc
        L_0x0144:
            return
        L_0x0145:
            r14 = r17
            r0 = 56
            m35251a(r0)
            throw r3
        L_0x014d:
            r14 = r17
            r0 = 55
            m35251a(r0)
            throw r3
        L_0x0155:
            r14 = r17
            r0 = 54
            m35251a(r0)
            throw r3
        L_0x015d:
            r14 = r17
            r0 = 53
            m35251a(r0)
            throw r3
        L_0x0165:
            r14 = r17
            r0 = 52
            m35251a(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zz3.C26802n.mo53763h(vz3.f, java.util.Collection, java.util.Collection, wy3.e, zz3.m):void");
    }

    /* renamed from: l */
    public C26805c mo53764l(C26434a aVar, C26434a aVar2, C26447e eVar) {
        if (aVar == null) {
            m35251a(19);
            throw null;
        } else if (aVar2 != null) {
            C26805c m = mo53765m(aVar, aVar2, eVar, false);
            if (m != null) {
                return m;
            }
            m35251a(21);
            throw null;
        } else {
            m35251a(20);
            throw null;
        }
    }

    /* renamed from: m */
    public C26805c mo53765m(C26434a aVar, C26434a aVar2, C26447e eVar, boolean z) {
        C26434a aVar3 = aVar;
        C26434a aVar4 = aVar2;
        C26447e eVar2 = eVar;
        C26795i.C26796a aVar5 = C26795i.C26796a.CONFLICTS_ONLY;
        if (aVar3 == null) {
            m35251a(22);
            throw null;
        } else if (aVar4 != null) {
            C26805c n = mo53766n(aVar3, aVar4, z);
            boolean z2 = n.mo53767c() == C26805c.C26806a.OVERRIDABLE;
            for (C26795i next : f74533e) {
                if (next.mo51197b() != aVar5 && (!z2 || next.mo51197b() != C26795i.C26796a.SUCCESS_ONLY)) {
                    int ordinal = next.mo51196a(aVar3, aVar4, eVar2).ordinal();
                    if (ordinal == 0) {
                        z2 = true;
                    } else if (ordinal == 1) {
                        return C26805c.m35273b("External condition failed");
                    } else {
                        if (ordinal == 2) {
                            return C26805c.m35274d("External condition");
                        }
                    }
                }
            }
            if (!z2) {
                return n;
            }
            for (C26795i next2 : f74533e) {
                if (next2.mo51197b() == aVar5) {
                    int ordinal2 = next2.mo51196a(aVar3, aVar4, eVar2).ordinal();
                    if (ordinal2 == 0) {
                        throw new IllegalStateException("Contract violation in " + next2.getClass().getName() + " condition. It's not supposed to end with success");
                    } else if (ordinal2 == 1) {
                        return C26805c.m35273b("External condition failed");
                    } else {
                        if (ordinal2 == 2) {
                            return C26805c.m35274d("External condition");
                        }
                    }
                }
            }
            C26805c cVar = C26805c.f74540b;
            if (cVar != null) {
                return cVar;
            }
            C26805c.m35272a(0);
            throw null;
        } else {
            m35251a(23);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9 A[LOOP:1: B:18:0x0063->B:39:0x00c9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c2 A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zz3.C26802n.C26805c mo53766n(wy3.C26434a r18, wy3.C26434a r19, boolean r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            if (r0 == 0) goto L_0x0176
            if (r1 == 0) goto L_0x016e
            zz3.n$c r3 = m35257i(r18, r19)
            if (r3 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.List r3 = m35254d(r18)
            java.util.List r4 = m35254d(r19)
            java.util.List r5 = r18.getTypeParameters()
            java.util.List r6 = r19.getTypeParameters()
            int r7 = r5.size()
            int r8 = r6.size()
            r9 = 0
            if (r7 == r8) goto L_0x005c
        L_0x002b:
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            java.lang.String r2 = "Type parameter number mismatch"
            if (r9 >= r1) goto L_0x0057
            o04.c r1 = o04.C25318c.f71821a
            java.lang.Object r0 = r0.get(r9)
            n04.j0 r0 = (n04.C25143j0) r0
            r5 = r4
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r9)
            n04.j0 r5 = (n04.C25143j0) r5
            o04.l r1 = (o04.C25332l) r1
            boolean r0 = r1.mo52404a(r0, r5)
            if (r0 != 0) goto L_0x0054
            zz3.n$c r0 = zz3.C26802n.C26805c.m35274d(r2)
            return r0
        L_0x0054:
            int r9 = r9 + 1
            goto L_0x002b
        L_0x0057:
            zz3.n$c r0 = zz3.C26802n.C26805c.m35273b(r2)
            return r0
        L_0x005c:
            r7 = r17
            n04.i1 r11 = r7.mo53762f(r5, r6)
            r8 = 0
        L_0x0063:
            int r10 = r5.size()
            if (r8 >= r10) goto L_0x00d8
            java.lang.Object r10 = r5.get(r8)
            wy3.d1 r10 = (wy3.C26446d1) r10
            java.lang.Object r13 = r6.get(r8)
            wy3.d1 r13 = (wy3.C26446d1) r13
            if (r10 == 0) goto L_0x00d2
            if (r13 == 0) goto L_0x00cc
            java.util.List r10 = r10.getUpperBounds()
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.List r13 = r13.getUpperBounds()
            r14.<init>(r13)
            int r13 = r10.size()
            int r15 = r14.size()
            if (r13 == r15) goto L_0x0091
            goto L_0x00bd
        L_0x0091:
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x00bf
            java.lang.Object r13 = r10.next()
            n04.j0 r13 = (n04.C25143j0) r13
            java.util.ListIterator r15 = r14.listIterator()
        L_0x00a5:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00bd
            java.lang.Object r16 = r15.next()
            r12 = r16
            n04.j0 r12 = (n04.C25143j0) r12
            boolean r12 = m35252b(r13, r12, r11)
            if (r12 == 0) goto L_0x00a5
            r15.remove()
            goto L_0x0095
        L_0x00bd:
            r12 = 0
            goto L_0x00c0
        L_0x00bf:
            r12 = 1
        L_0x00c0:
            if (r12 != 0) goto L_0x00c9
            java.lang.String r0 = "Type parameter bounds mismatch"
            zz3.n$c r0 = zz3.C26802n.C26805c.m35274d(r0)
            return r0
        L_0x00c9:
            int r8 = r8 + 1
            goto L_0x0063
        L_0x00cc:
            r0 = 50
            m35251a(r0)
            throw r2
        L_0x00d2:
            r0 = 49
            m35251a(r0)
            throw r2
        L_0x00d8:
            r5 = 0
        L_0x00d9:
            r6 = r3
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r8 = r6.size()
            if (r5 >= r8) goto L_0x0101
            java.lang.Object r6 = r6.get(r5)
            n04.j0 r6 = (n04.C25143j0) r6
            r8 = r4
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r5)
            n04.j0 r8 = (n04.C25143j0) r8
            boolean r6 = m35252b(r6, r8, r11)
            if (r6 != 0) goto L_0x00fe
            java.lang.String r0 = "Value parameter type mismatch"
            zz3.n$c r0 = zz3.C26802n.C26805c.m35274d(r0)
            return r0
        L_0x00fe:
            int r5 = r5 + 1
            goto L_0x00d9
        L_0x0101:
            boolean r3 = r0 instanceof wy3.C26516w
            if (r3 == 0) goto L_0x0120
            boolean r3 = r1 instanceof wy3.C26516w
            if (r3 == 0) goto L_0x0120
            r3 = r0
            wy3.w r3 = (wy3.C26516w) r3
            boolean r3 = r3.isSuspend()
            r4 = r1
            wy3.w r4 = (wy3.C26516w) r4
            boolean r4 = r4.isSuspend()
            if (r3 == r4) goto L_0x0120
            java.lang.String r0 = "Incompatible suspendability"
            zz3.n$c r0 = zz3.C26802n.C26805c.m35273b(r0)
            return r0
        L_0x0120:
            if (r20 == 0) goto L_0x0165
            n04.j0 r0 = r18.getReturnType()
            n04.j0 r1 = r19.getReturnType()
            if (r0 == 0) goto L_0x0165
            if (r1 == 0) goto L_0x0165
            boolean r3 = n04.C25153l0.m31968a(r1)
            if (r3 == 0) goto L_0x013c
            boolean r3 = n04.C25153l0.m31968a(r0)
            if (r3 == 0) goto L_0x013c
            r12 = 1
            goto L_0x013d
        L_0x013c:
            r12 = 0
        L_0x013d:
            if (r12 != 0) goto L_0x0165
            n04.h r10 = n04.C25123h.f71559a
            n04.y1 r12 = r1.mo52229N0()
            n04.y1 r13 = r0.mo52229N0()
            java.lang.String r0 = "subType"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "superType"
            gy3.C87412m.m108594g(r13, r0)
            r14 = 0
            r15 = 8
            r16 = 0
            boolean r0 = n04.C25123h.m31901i(r10, r11, r12, r13, r14, r15, r16)
            if (r0 != 0) goto L_0x0165
            java.lang.String r0 = "Return type mismatch"
            zz3.n$c r0 = zz3.C26802n.C26805c.m35273b(r0)
            return r0
        L_0x0165:
            zz3.n$c r0 = zz3.C26802n.C26805c.f74540b
            if (r0 == 0) goto L_0x016a
            return r0
        L_0x016a:
            zz3.C26802n.C26805c.m35272a(r9)
            throw r2
        L_0x016e:
            r7 = r17
            r0 = 31
            m35251a(r0)
            throw r2
        L_0x0176:
            r7 = r17
            r0 = 30
            m35251a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zz3.C26802n.mo53766n(wy3.a, wy3.a, boolean):zz3.n$c");
    }
}
