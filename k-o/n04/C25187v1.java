package n04;

import fy3.C32226l;
import g04.C20770i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o04.C25323e;
import o04.C25333m;
import p04.C25416i;
import p04.C25417j;
import sx3.C110818d0;
import w04.C22850f;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26447e;

/* renamed from: n04.v1 */
public class C25187v1 {

    /* renamed from: a */
    public static final C25176s0 f71641a = C25417j.m32698c(C25416i.DONT_CARE, new String[0]);

    /* renamed from: b */
    public static final C25176s0 f71642b = C25417j.m32698c(C25416i.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c */
    public static final C25176s0 f71643c = new C25188a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final C25176s0 f71644d = new C25188a("UNIT_EXPECTED_TYPE");

    /* renamed from: n04.v1$a */
    public static class C25188a extends C25185v {

        /* renamed from: e */
        public final String f71645e;

        public C25188a(String str) {
            this.f71645e = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* renamed from: W0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void m32097W0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = 3
                goto L_0x0014
            L_0x0013:
                r5 = 2
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: n04.C25187v1.C25188a.m32097W0(int):void");
        }

        /* renamed from: M0 */
        public C25143j0 mo37083M0(C25323e eVar) {
            if (eVar != null) {
                return this;
            }
            m32097W0(3);
            throw null;
        }

        /* renamed from: O0 */
        public /* bridge */ /* synthetic */ C25198y1 mo37084O0(boolean z) {
            mo37086R0(z);
            throw null;
        }

        /* renamed from: P0 */
        public C25198y1 mo37085P0(C25323e eVar) {
            if (eVar != null) {
                return this;
            }
            m32097W0(3);
            throw null;
        }

        /* renamed from: Q0 */
        public /* bridge */ /* synthetic */ C25198y1 mo51873Q0(C25122g1 g1Var) {
            mo37087S0(g1Var);
            throw null;
        }

        /* renamed from: R0 */
        public C25176s0 mo37086R0(boolean z) {
            throw new IllegalStateException(this.f71645e);
        }

        /* renamed from: S0 */
        public C25176s0 mo37087S0(C25122g1 g1Var) {
            if (g1Var == null) {
                m32097W0(0);
                throw null;
            }
            throw new IllegalStateException(this.f71645e);
        }

        /* renamed from: T0 */
        public C25176s0 mo52223T0() {
            throw new IllegalStateException(this.f71645e);
        }

        /* renamed from: U0 */
        public C25176s0 mo52224U0(C25323e eVar) {
            if (eVar != null) {
                return this;
            }
            m32097W0(3);
            throw null;
        }

        /* renamed from: V0 */
        public C25185v mo52225V0(C25176s0 s0Var) {
            if (s0Var == null) {
                m32097W0(2);
                throw null;
            }
            throw new IllegalStateException(this.f71645e);
        }

        public String toString() {
            String str = this.f71645e;
            if (str != null) {
                return str;
            }
            m32097W0(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m32081a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
                objArr[0] = "parameterDescriptor";
                break;
            case 46:
            case 50:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 48:
            case 49:
                objArr[0] = "supertypes";
                break;
            case 51:
            case 54:
                objArr[0] = "expectedType";
                break;
            case 53:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 11 || i3 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i3 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 47) {
                    if (i3 != 52) {
                        if (!(i3 == 6 || i3 == 7)) {
                            switch (i3) {
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
                objArr[2] = "makeStarProjection";
                break;
            case 46:
            case 48:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 49:
                objArr[2] = "findByFqName";
                break;
            case 50:
            case 51:
            case 53:
            case 54:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 59:
                objArr[2] = "isTypeParameter";
                break;
            case 60:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 61:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static boolean m32082b(C25143j0 j0Var) {
        if (j0Var == null) {
            m32081a(28);
            throw null;
        } else if (j0Var.mo37082L0()) {
            return true;
        } else {
            return C25119f0.m31892b(j0Var) && m32082b(C25119f0.m31891a(j0Var).f71541f);
        }
    }

    /* renamed from: c */
    public static boolean m32083c(C25143j0 j0Var, C32226l<C25198y1, Boolean> lVar) {
        if (lVar != null) {
            return m32084d(j0Var, lVar, (C22850f<C25143j0>) null);
        }
        m32081a(43);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [n04.y1, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32084d(n04.C25143j0 r5, fy3.C32226l<n04.C25198y1, java.lang.Boolean> r6, w04.C22850f<n04.C25143j0> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x00b4
            r1 = 0
            if (r5 != 0) goto L_0x0007
            return r1
        L_0x0007:
            n04.y1 r2 = r5.mo52229N0()
            boolean r3 = m32096p(r5)
            if (r3 == 0) goto L_0x001c
            java.lang.Object r5 = r6.invoke(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            if (r7 == 0) goto L_0x0025
            boolean r3 = r7.contains(r5)
            if (r3 == 0) goto L_0x0025
            return r1
        L_0x0025:
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1
            if (r3 == 0) goto L_0x0033
            return r4
        L_0x0033:
            if (r7 != 0) goto L_0x003b
            w04.f$b r7 = w04.C22850f.f65674f
            w04.f r7 = r7.mo36008a()
        L_0x003b:
            r7.add(r5)
            boolean r3 = r2 instanceof n04.C25109c0
            if (r3 == 0) goto L_0x0045
            r0 = r2
            n04.c0 r0 = (n04.C25109c0) r0
        L_0x0045:
            if (r0 == 0) goto L_0x0058
            n04.s0 r3 = r0.f71540e
            boolean r3 = m32084d(r3, r6, r7)
            if (r3 != 0) goto L_0x0057
            n04.s0 r0 = r0.f71541f
            boolean r0 = m32084d(r0, r6, r7)
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            return r4
        L_0x0058:
            boolean r0 = r2 instanceof n04.C25177t
            if (r0 == 0) goto L_0x0067
            n04.t r2 = (n04.C25177t) r2
            n04.s0 r0 = r2.f71624e
            boolean r0 = m32084d(r0, r6, r7)
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            n04.j1 r0 = r5.mo37081K0()
            boolean r2 = r0 instanceof n04.C25124h0
            if (r2 == 0) goto L_0x008b
            n04.h0 r0 = (n04.C25124h0) r0
            java.util.LinkedHashSet<n04.j0> r5 = r0.f71561b
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r5.next()
            n04.j0 r0 = (n04.C25143j0) r0
            boolean r0 = m32084d(r0, r6, r7)
            if (r0 == 0) goto L_0x0077
            return r4
        L_0x008a:
            return r1
        L_0x008b:
            java.util.List r5 = r5.mo37079I0()
            java.util.Iterator r5 = r5.iterator()
        L_0x0093:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r5.next()
            n04.m1 r0 = (n04.C25158m1) r0
            boolean r2 = r0.mo52296b()
            if (r2 == 0) goto L_0x00a6
            goto L_0x0093
        L_0x00a6:
            n04.j0 r0 = r0.getType()
            boolean r0 = m32084d(r0, r6, r7)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0093
            return r4
        L_0x00b1:
            r5 = move-exception
            throw r5
        L_0x00b3:
            return r1
        L_0x00b4:
            r5 = 44
            m32081a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25187v1.m32084d(n04.j0, fy3.l, w04.f):boolean");
    }

    /* renamed from: e */
    public static List<C25158m1> m32085e(List<C26446d1> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C26446d1 s : list) {
                arrayList.add(new C25164o1(s.mo36111s()));
            }
            return C110818d0.m150953y0(arrayList);
        }
        m32081a(16);
        throw null;
    }

    /* renamed from: f */
    public static boolean m32086f(C25143j0 j0Var) {
        if (j0Var == null) {
            m32081a(29);
            throw null;
        } else if (j0Var.mo37081K0().mo37094o() instanceof C26447e) {
            return false;
        } else {
            C25180t1 d = C25180t1.m32043d(j0Var);
            Collection<C25143j0> r = j0Var.mo37081K0().mo37096r();
            ArrayList arrayList = new ArrayList(r.size());
            for (C25143j0 next : r) {
                if (next != null) {
                    C25143j0 k = d.mo52314k(next, C25202z1.INVARIANT);
                    C25143j0 k2 = k != null ? m32091k(k, j0Var.mo37082L0()) : null;
                    if (k2 != null) {
                        arrayList.add(k2);
                    }
                } else {
                    m32081a(21);
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (m32087g((C25143j0) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m32087g(C25143j0 j0Var) {
        if (j0Var == null) {
            m32081a(27);
            throw null;
        } else if (j0Var.mo37082L0()) {
            return true;
        } else {
            if (C25119f0.m31892b(j0Var) && m32087g(C25119f0.m31891a(j0Var).f71541f)) {
                return true;
            }
            if (j0Var.mo52229N0() instanceof C25177t) {
                return false;
            }
            if (m32088h(j0Var)) {
                return m32086f(j0Var);
            }
            if (j0Var instanceof C25116e) {
                C26446d1 a = ((C25116e) j0Var).f71549e.mo52424a();
                return a == null || m32086f(a.mo36111s());
            }
            C25144j1 K0 = j0Var.mo37081K0();
            if (K0 instanceof C25124h0) {
                for (C25143j0 g : K0.mo37096r()) {
                    if (m32087g(g)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m32088h(C25143j0 j0Var) {
        C26446d1 d1Var = null;
        if (j0Var == null) {
            m32081a(59);
            throw null;
        } else if (j0Var != null) {
            if (j0Var.mo37081K0().mo37094o() instanceof C26446d1) {
                d1Var = (C26446d1) j0Var.mo37081K0().mo37094o();
            }
            return d1Var != null || (j0Var.mo37081K0() instanceof C25333m);
        } else {
            m32081a(62);
            throw null;
        }
    }

    /* renamed from: i */
    public static C25143j0 m32089i(C25143j0 j0Var) {
        if (j0Var != null) {
            return m32090j(j0Var, false);
        }
        m32081a(2);
        throw null;
    }

    /* renamed from: j */
    public static C25143j0 m32090j(C25143j0 j0Var, boolean z) {
        if (j0Var != null) {
            C25198y1 O0 = j0Var.mo52229N0().mo37084O0(z);
            if (O0 != null) {
                return O0;
            }
            m32081a(4);
            throw null;
        }
        m32081a(3);
        throw null;
    }

    /* renamed from: k */
    public static C25143j0 m32091k(C25143j0 j0Var, boolean z) {
        if (j0Var != null) {
            return z ? m32090j(j0Var, true) : j0Var;
        }
        m32081a(8);
        throw null;
    }

    /* renamed from: l */
    public static C25176s0 m32092l(C25176s0 s0Var, boolean z) {
        if (s0Var == null) {
            m32081a(5);
            throw null;
        } else if (z) {
            C25176s0 R0 = s0Var.mo37084O0(true);
            if (R0 != null) {
                return R0;
            }
            m32081a(6);
            throw null;
        } else if (s0Var != null) {
            return s0Var;
        } else {
            m32081a(7);
            throw null;
        }
    }

    /* renamed from: m */
    public static C25158m1 m32093m(C26446d1 d1Var) {
        if (d1Var != null) {
            return new C25196y0(d1Var);
        }
        m32081a(45);
        throw null;
    }

    /* renamed from: n */
    public static C25176s0 m32094n(C25144j1 j1Var, C20770i iVar, C32226l<C25323e, C25176s0> lVar) {
        if (j1Var == null) {
            m32081a(12);
            throw null;
        } else if (iVar == null) {
            m32081a(13);
            throw null;
        } else if (lVar != null) {
            List<C25158m1> e = m32085e(j1Var.getParameters());
            C25122g1.f71557e.getClass();
            return C25146k0.m31963i(C25122g1.f71558f, j1Var, e, false, iVar, lVar);
        } else {
            m32081a(14);
            throw null;
        }
    }

    /* renamed from: o */
    public static C25176s0 m32095o(C22935h hVar, C20770i iVar, C32226l<C25323e, C25176s0> lVar) {
        if (!C25417j.m32699f(hVar)) {
            return m32094n(hVar.mo36110l(), iVar, lVar);
        }
        return C25417j.m32698c(C25416i.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
    }

    /* renamed from: p */
    public static boolean m32096p(C25143j0 j0Var) {
        if (j0Var != null) {
            return j0Var == f71643c || j0Var == f71644d;
        }
        m32081a(0);
        throw null;
    }
}
