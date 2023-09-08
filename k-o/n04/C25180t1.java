package n04;

import gy3.C8480h;
import gy3.C87412m;
import p04.C25416i;
import p04.C25417j;
import s04.C22293b;
import s04.C26156c;
import s04.C26157d;
import w04.C118711c;
import wy3.C26446d1;

/* renamed from: n04.t1 */
public class C25180t1 {

    /* renamed from: b */
    public static final C25180t1 f71631b = m32044e(C25167p1.f71619a);

    /* renamed from: a */
    public final C25167p1 f71632a;

    /* renamed from: n04.t1$a */
    public static final class C21584a extends Exception {
        public C21584a(String str) {
            super(str);
        }
    }

    /* renamed from: n04.t1$b */
    public enum C25181b {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public C25180t1(C25167p1 p1Var) {
        if (p1Var != null) {
            this.f71632a = p1Var;
        } else {
            m32040a(7);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m32040a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
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
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
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
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i != 34) {
            if (i != 37) {
                switch (i) {
                    case 11:
                    case 12:
                    case 13:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
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
    public static C25202z1 m32041b(C25202z1 z1Var, C25202z1 z1Var2) {
        if (z1Var == null) {
            m32040a(38);
            throw null;
        } else if (z1Var2 != null) {
            C25202z1 z1Var3 = C25202z1.INVARIANT;
            if (z1Var == z1Var3) {
                if (z1Var2 != null) {
                    return z1Var2;
                }
                m32040a(40);
                throw null;
            } else if (z1Var2 == z1Var3) {
                if (z1Var != null) {
                    return z1Var;
                }
                m32040a(41);
                throw null;
            } else if (z1Var != z1Var2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + z1Var + "' and " + "projection kind '" + z1Var2 + "' cannot be combined");
            } else if (z1Var2 != null) {
                return z1Var2;
            } else {
                m32040a(42);
                throw null;
            }
        } else {
            m32040a(39);
            throw null;
        }
    }

    /* renamed from: c */
    public static C25181b m32042c(C25202z1 z1Var, C25202z1 z1Var2) {
        C25202z1 z1Var3 = C25202z1.OUT_VARIANCE;
        C25202z1 z1Var4 = C25202z1.IN_VARIANCE;
        return (z1Var == z1Var4 && z1Var2 == z1Var3) ? C25181b.OUT_IN_IN_POSITION : (z1Var == z1Var3 && z1Var2 == z1Var4) ? C25181b.IN_IN_OUT_POSITION : C25181b.NO_CONFLICT;
    }

    /* renamed from: d */
    public static C25180t1 m32043d(C25143j0 j0Var) {
        if (j0Var != null) {
            return m32044e(C25154l1.f71605b.mo52293b(j0Var.mo37081K0(), j0Var.mo37079I0()));
        }
        m32040a(6);
        throw null;
    }

    /* renamed from: e */
    public static C25180t1 m32044e(C25167p1 p1Var) {
        if (p1Var != null) {
            return new C25180t1(p1Var);
        }
        m32040a(0);
        throw null;
    }

    /* renamed from: f */
    public static C25180t1 m32045f(C25167p1 p1Var, C25167p1 p1Var2) {
        if (p1Var == null) {
            m32040a(3);
            throw null;
        } else if (p1Var2 != null) {
            int i = C25195y.f71648d;
            C87412m.m108594g(p1Var, "first");
            C87412m.m108594g(p1Var2, "second");
            if (p1Var.mo52261e()) {
                p1Var = p1Var2;
            } else if (!p1Var2.mo52261e()) {
                p1Var = new C25195y(p1Var, p1Var2, (C8480h) null);
            }
            return m32044e(p1Var);
        } else {
            m32040a(4);
            throw null;
        }
    }

    /* renamed from: j */
    public static String m32046j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C118711c.m167394a(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* renamed from: g */
    public C25167p1 mo52311g() {
        C25167p1 p1Var = this.f71632a;
        if (p1Var != null) {
            return p1Var;
        }
        m32040a(8);
        throw null;
    }

    /* renamed from: h */
    public boolean mo52312h() {
        return this.f71632a.mo52261e();
    }

    /* renamed from: i */
    public C25143j0 mo52313i(C25143j0 j0Var, C25202z1 z1Var) {
        if (j0Var == null) {
            m32040a(9);
            throw null;
        } else if (z1Var == null) {
            m32040a(10);
            throw null;
        } else if (!mo52312h()) {
            try {
                C25143j0 type = mo52315l(new C25164o1(z1Var, j0Var), (C26446d1) null, 0).getType();
                if (type != null) {
                    return type;
                }
                m32040a(12);
                throw null;
            } catch (C21584a e) {
                return C25417j.m32698c(C25416i.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            }
        } else if (j0Var != null) {
            return j0Var;
        } else {
            m32040a(11);
            throw null;
        }
    }

    /* renamed from: k */
    public C25143j0 mo52314k(C25143j0 j0Var, C25202z1 z1Var) {
        C25164o1 o1Var;
        if (j0Var == null) {
            m32040a(14);
            throw null;
        } else if (z1Var != null) {
            C25164o1 o1Var2 = new C25164o1(z1Var, mo52311g().mo52306f(j0Var, z1Var));
            if (!mo52312h()) {
                try {
                    o1Var2 = mo52315l(o1Var2, (C26446d1) null, 0);
                } catch (C21584a unused) {
                    o1Var2 = null;
                }
            }
            if (this.f71632a.mo52289a() || this.f71632a.mo37098b()) {
                boolean b = this.f71632a.mo37098b();
                if (o1Var2 != null) {
                    if (!o1Var2.mo52296b()) {
                        C25143j0 type = o1Var2.getType();
                        C87412m.m108593f(type, "typeProjection.type");
                        if (C25187v1.m32083c(type, C22293b.f63202d)) {
                            C25202z1 a = o1Var2.mo52295a();
                            C87412m.m108593f(a, "typeProjection.projectionKind");
                            if (a == C25202z1.OUT_VARIANCE) {
                                o1Var = new C25164o1(a, (C25143j0) C26157d.m33577a(type).f97347b);
                            } else if (b) {
                                o1Var = new C25164o1(a, (C25143j0) C26157d.m33577a(type).f97346a);
                            } else {
                                C25180t1 e = m32044e(new C26156c());
                                if (!e.mo52312h()) {
                                    try {
                                        o1Var2 = e.mo52315l(o1Var2, (C26446d1) null, 0);
                                    } catch (C21584a unused2) {
                                    }
                                }
                            }
                            o1Var2 = o1Var;
                        }
                    }
                }
                o1Var2 = null;
            }
            if (o1Var2 == null) {
                return null;
            }
            return o1Var2.getType();
        } else {
            m32040a(15);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0298, code lost:
        if (r1 != 2) goto L_0x02b8;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n04.C25158m1 mo52315l(n04.C25158m1 r17, wy3.C26446d1 r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = 0
            if (r17 == 0) goto L_0x0320
            n04.p1 r4 = r0.f71632a
            r5 = 100
            if (r2 > r5) goto L_0x02f9
            boolean r4 = r17.mo52296b()
            if (r4 == 0) goto L_0x0016
            return r17
        L_0x0016:
            n04.j0 r4 = r17.getType()
            boolean r5 = r4 instanceof n04.C25191w1
            r6 = 1
            if (r5 == 0) goto L_0x005c
            n04.w1 r4 = (n04.C25191w1) r4
            n04.y1 r3 = r4.getOrigin()
            n04.j0 r4 = r4.mo52254N()
            n04.o1 r5 = new n04.o1
            n04.z1 r7 = r17.mo52295a()
            r5.<init>(r7, r3)
            int r2 = r2 + r6
            n04.m1 r1 = r0.mo52315l(r5, r1, r2)
            boolean r2 = r1.mo52296b()
            if (r2 == 0) goto L_0x003e
            return r1
        L_0x003e:
            n04.z1 r2 = r17.mo52295a()
            n04.j0 r2 = r0.mo52314k(r4, r2)
            n04.j0 r3 = r1.getType()
            n04.y1 r3 = r3.mo52229N0()
            n04.y1 r2 = n04.C25194x1.m32122c(r3, r2)
            n04.o1 r3 = new n04.o1
            n04.z1 r1 = r1.mo52295a()
            r3.<init>(r1, r2)
            return r3
        L_0x005c:
            boolean r5 = n04.C25102a0.m31816a(r4)
            if (r5 != 0) goto L_0x02f8
            n04.y1 r5 = r4.mo52229N0()
            boolean r5 = r5 instanceof n04.C25173r0
            if (r5 == 0) goto L_0x006c
            goto L_0x02f8
        L_0x006c:
            n04.p1 r5 = r0.f71632a
            n04.m1 r5 = r5.mo37099d(r4)
            if (r5 == 0) goto L_0x00c3
            xy3.h r7 = r4.getAnnotations()
            vz3.c r8 = ty3.C26343l.C26344a.f73436z
            boolean r7 = r7.mo51479q(r8)
            if (r7 != 0) goto L_0x0081
            goto L_0x00c4
        L_0x0081:
            n04.j0 r7 = r5.getType()
            n04.j1 r7 = r7.mo37081K0()
            boolean r8 = r7 instanceof o04.C25327i
            if (r8 != 0) goto L_0x008e
            goto L_0x00c4
        L_0x008e:
            o04.i r7 = (o04.C25327i) r7
            n04.m1 r7 = r7.f71831a
            n04.z1 r8 = r7.mo52295a()
            n04.z1 r9 = r17.mo52295a()
            n04.t1$b r9 = m32042c(r9, r8)
            n04.t1$b r10 = n04.C25180t1.C25181b.OUT_IN_IN_POSITION
            if (r9 != r10) goto L_0x00ac
            n04.o1 r5 = new n04.o1
            n04.j0 r7 = r7.getType()
            r5.<init>(r7)
            goto L_0x00c4
        L_0x00ac:
            if (r1 != 0) goto L_0x00af
            goto L_0x00c4
        L_0x00af:
            n04.z1 r9 = r18.mo53423o()
            n04.t1$b r8 = m32042c(r9, r8)
            if (r8 != r10) goto L_0x00c4
            n04.o1 r5 = new n04.o1
            n04.j0 r7 = r7.getType()
            r5.<init>(r7)
            goto L_0x00c4
        L_0x00c3:
            r5 = r3
        L_0x00c4:
            n04.z1 r7 = r17.mo52295a()
            r8 = 0
            if (r5 != 0) goto L_0x0131
            boolean r9 = n04.C25119f0.m31892b(r4)
            if (r9 == 0) goto L_0x0131
            n04.y1 r9 = r4.mo52229N0()
            boolean r10 = r9 instanceof n04.C25172r
            if (r10 == 0) goto L_0x00dc
            n04.r r9 = (n04.C25172r) r9
            goto L_0x00dd
        L_0x00dc:
            r9 = r3
        L_0x00dd:
            if (r9 == 0) goto L_0x00e4
            boolean r9 = r9.mo52249U()
            goto L_0x00e5
        L_0x00e4:
            r9 = 0
        L_0x00e5:
            if (r9 != 0) goto L_0x0131
            n04.c0 r3 = n04.C25119f0.m31891a(r4)
            n04.o1 r4 = new n04.o1
            n04.s0 r5 = r3.f71540e
            r4.<init>(r7, r5)
            int r2 = r2 + r6
            n04.m1 r4 = r0.mo52315l(r4, r1, r2)
            n04.o1 r5 = new n04.o1
            n04.s0 r6 = r3.f71541f
            r5.<init>(r7, r6)
            n04.m1 r1 = r0.mo52315l(r5, r1, r2)
            n04.z1 r2 = r4.mo52295a()
            n04.j0 r5 = r4.getType()
            n04.s0 r6 = r3.f71540e
            if (r5 != r6) goto L_0x0117
            n04.j0 r5 = r1.getType()
            n04.s0 r3 = r3.f71541f
            if (r5 != r3) goto L_0x0117
            return r17
        L_0x0117:
            n04.j0 r3 = r4.getType()
            n04.s0 r3 = n04.C25174r1.m32014a(r3)
            n04.j0 r1 = r1.getType()
            n04.s0 r1 = n04.C25174r1.m32014a(r1)
            n04.y1 r1 = n04.C25146k0.m31957c(r3, r1)
            n04.o1 r3 = new n04.o1
            r3.<init>(r2, r1)
            return r3
        L_0x0131:
            boolean r1 = ty3.C26336h.m33829F(r4)
            if (r1 != 0) goto L_0x02f8
            boolean r1 = n04.C25153l0.m31968a(r4)
            if (r1 == 0) goto L_0x013f
            goto L_0x02f8
        L_0x013f:
            r1 = 2
            if (r5 == 0) goto L_0x0201
            n04.z1 r2 = r5.mo52295a()
            n04.t1$b r2 = m32042c(r7, r2)
            n04.j1 r9 = r4.mo37081K0()
            boolean r9 = r9 instanceof a04.C23605b
            if (r9 != 0) goto L_0x0177
            int r9 = r2.ordinal()
            if (r9 == r6) goto L_0x0163
            if (r9 == r1) goto L_0x015b
            goto L_0x0177
        L_0x015b:
            n04.t1$a r1 = new n04.t1$a
            java.lang.String r2 = "Out-projection in in-position"
            r1.<init>(r2)
            throw r1
        L_0x0163:
            n04.o1 r1 = new n04.o1
            n04.z1 r2 = n04.C25202z1.OUT_VARIANCE
            n04.j1 r3 = r4.mo37081K0()
            ty3.h r3 = r3.mo37092m()
            n04.s0 r3 = r3.mo53324p()
            r1.<init>(r2, r3)
            return r1
        L_0x0177:
            n04.y1 r9 = r4.mo52229N0()
            boolean r10 = r9 instanceof n04.C25172r
            if (r10 == 0) goto L_0x0182
            n04.r r9 = (n04.C25172r) r9
            goto L_0x0183
        L_0x0182:
            r9 = r3
        L_0x0183:
            if (r9 == 0) goto L_0x018c
            boolean r10 = r9.mo52249U()
            if (r10 == 0) goto L_0x018c
            goto L_0x018d
        L_0x018c:
            r9 = r3
        L_0x018d:
            boolean r10 = r5.mo52296b()
            if (r10 == 0) goto L_0x0194
            return r5
        L_0x0194:
            if (r9 == 0) goto L_0x019f
            n04.j0 r10 = r5.getType()
            n04.j0 r9 = r9.mo52247D(r10)
            goto L_0x01ab
        L_0x019f:
            n04.j0 r9 = r5.getType()
            boolean r10 = r4.mo37082L0()
            n04.j0 r9 = n04.C25187v1.m32091k(r9, r10)
        L_0x01ab:
            xy3.h r10 = r4.getAnnotations()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x01ef
            n04.p1 r10 = r0.f71632a
            xy3.h r4 = r4.getAnnotations()
            xy3.h r4 = r10.mo52305c(r4)
            if (r4 == 0) goto L_0x01e9
            vz3.c r3 = ty3.C26343l.C26344a.f73436z
            boolean r3 = r4.mo51479q(r3)
            if (r3 != 0) goto L_0x01ca
            goto L_0x01d5
        L_0x01ca:
            xy3.m r3 = new xy3.m
            n04.s1 r10 = new n04.s1
            r10.<init>()
            r3.<init>(r4, r10)
            r4 = r3
        L_0x01d5:
            xy3.l r3 = new xy3.l
            xy3.h[] r1 = new xy3.C26571h[r1]
            xy3.h r10 = r9.getAnnotations()
            r1[r8] = r10
            r1[r6] = r4
            r3.<init>((xy3.C26571h[]) r1)
            n04.j0 r9 = r04.C26094c.m33431k(r9, r3)
            goto L_0x01ef
        L_0x01e9:
            r1 = 33
            m32040a(r1)
            throw r3
        L_0x01ef:
            n04.t1$b r1 = n04.C25180t1.C25181b.NO_CONFLICT
            if (r2 != r1) goto L_0x01fb
            n04.z1 r1 = r5.mo52295a()
            n04.z1 r7 = m32041b(r7, r1)
        L_0x01fb:
            n04.o1 r1 = new n04.o1
            r1.<init>(r7, r9)
            return r1
        L_0x0201:
            n04.z1 r4 = n04.C25202z1.INVARIANT
            n04.j0 r9 = r17.getType()
            n04.z1 r5 = r17.mo52295a()
            n04.j1 r7 = r9.mo37081K0()
            wy3.h r7 = r7.mo37094o()
            boolean r7 = r7 instanceof wy3.C26446d1
            if (r7 == 0) goto L_0x021b
            r2 = r17
            goto L_0x02f7
        L_0x021b:
            n04.y1 r7 = r9.mo52229N0()
            boolean r10 = r7 instanceof n04.C25101a
            if (r10 == 0) goto L_0x0226
            n04.a r7 = (n04.C25101a) r7
            goto L_0x0227
        L_0x0226:
            r7 = r3
        L_0x0227:
            if (r7 == 0) goto L_0x022c
            n04.s0 r7 = r7.f71534f
            goto L_0x022d
        L_0x022c:
            r7 = r3
        L_0x022d:
            if (r7 == 0) goto L_0x0254
            n04.p1 r3 = r0.f71632a
            boolean r10 = r3 instanceof n04.C25121g0
            if (r10 == 0) goto L_0x024f
            boolean r3 = r3.mo37098b()
            if (r3 != 0) goto L_0x023c
            goto L_0x024f
        L_0x023c:
            n04.t1 r3 = new n04.t1
            n04.g0 r10 = new n04.g0
            n04.p1 r11 = r0.f71632a
            n04.g0 r11 = (n04.C25121g0) r11
            wy3.d1[] r12 = r11.f71554b
            n04.m1[] r11 = r11.f71555c
            r10.<init>(r12, r11, r8)
            r3.<init>(r10)
            goto L_0x0250
        L_0x024f:
            r3 = r0
        L_0x0250:
            n04.j0 r3 = r3.mo52314k(r7, r4)
        L_0x0254:
            n04.j1 r7 = r9.mo37081K0()
            java.util.List r7 = r7.getParameters()
            java.util.List r10 = r9.mo37079I0()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r7.size()
            r11.<init>(r12)
            r12 = 0
        L_0x026a:
            int r13 = r7.size()
            if (r8 >= r13) goto L_0x02c3
            java.lang.Object r13 = r7.get(r8)
            wy3.d1 r13 = (wy3.C26446d1) r13
            java.lang.Object r14 = r10.get(r8)
            n04.m1 r14 = (n04.C25158m1) r14
            int r15 = r2 + 1
            n04.m1 r15 = r0.mo52315l(r14, r13, r15)
            n04.z1 r1 = r13.mo53423o()
            n04.z1 r6 = r15.mo52295a()
            n04.t1$b r1 = m32042c(r1, r6)
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x02a1
            r6 = 1
            if (r1 == r6) goto L_0x029b
            r6 = 2
            if (r1 == r6) goto L_0x029c
            goto L_0x02b8
        L_0x029b:
            r6 = 2
        L_0x029c:
            n04.m1 r15 = n04.C25187v1.m32093m(r13)
            goto L_0x02b8
        L_0x02a1:
            r6 = 2
            n04.z1 r1 = r13.mo53423o()
            if (r1 == r4) goto L_0x02b8
            boolean r1 = r15.mo52296b()
            if (r1 != 0) goto L_0x02b8
            n04.o1 r1 = new n04.o1
            n04.j0 r13 = r15.getType()
            r1.<init>(r4, r13)
            r15 = r1
        L_0x02b8:
            if (r15 == r14) goto L_0x02bb
            r12 = 1
        L_0x02bb:
            r11.add(r15)
            int r8 = r8 + 1
            r1 = 2
            r6 = 1
            goto L_0x026a
        L_0x02c3:
            if (r12 != 0) goto L_0x02c6
            goto L_0x02c7
        L_0x02c6:
            r10 = r11
        L_0x02c7:
            n04.p1 r1 = r0.f71632a
            xy3.h r2 = r9.getAnnotations()
            xy3.h r11 = r1.mo52305c(r2)
            java.lang.String r1 = "newArguments"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "newAnnotations"
            gy3.C87412m.m108594g(r11, r1)
            r12 = 0
            r13 = 4
            r14 = 0
            n04.j0 r1 = n04.C25174r1.m32016c(r9, r10, r11, r12, r13, r14)
            boolean r2 = r1 instanceof n04.C25176s0
            if (r2 == 0) goto L_0x02f2
            boolean r2 = r3 instanceof n04.C25176s0
            if (r2 == 0) goto L_0x02f2
            n04.s0 r1 = (n04.C25176s0) r1
            n04.s0 r3 = (n04.C25176s0) r3
            n04.s0 r1 = n04.C25190w0.m32112c(r1, r3)
        L_0x02f2:
            n04.o1 r2 = new n04.o1
            r2.<init>(r5, r1)
        L_0x02f7:
            return r2
        L_0x02f8:
            return r17
        L_0x02f9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Recursion too deep. Most likely infinite loop while substituting "
            r2.append(r3)
            java.lang.String r3 = m32046j(r17)
            r2.append(r3)
            java.lang.String r3 = "; substitution: "
            r2.append(r3)
            java.lang.String r3 = m32046j(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0320:
            r1 = 18
            m32040a(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25180t1.mo52315l(n04.m1, wy3.d1, int):n04.m1");
    }
}
