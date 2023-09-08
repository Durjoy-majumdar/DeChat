package p869y0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112541g;
import p410k0.C108793e;
import p631o1.C109831c;
import rx3.C13603j;

/* renamed from: y0.f0 */
public final class C112314f0 {

    /* renamed from: y0.f0$a */
    public static final class C112315a extends C87413o implements C32226l<C109831c.C109832a, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C112321l f336317d;

        /* renamed from: e */
        public final /* synthetic */ C112321l f336318e;

        /* renamed from: f */
        public final /* synthetic */ int f336319f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<C112321l, Boolean> f336320g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112315a(C112321l lVar, C112321l lVar2, int i, C32226l<? super C112321l, Boolean> lVar3) {
            super(1);
            this.f336317d = lVar;
            this.f336318e = lVar2;
            this.f336319f = i;
            this.f336320g = lVar3;
        }

        public Object invoke(Object obj) {
            C109831c.C109832a aVar = (C109831c.C109832a) obj;
            C87412m.m108594g(aVar, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(C112314f0.m153210g(this.f336317d, this.f336318e, this.f336319f, this.f336320g));
            if (valueOf.booleanValue() || !aVar.mo145568a()) {
                return valueOf;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r9.f336961a >= r11.f336963c) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r9.f336963c <= r11.f336961a) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r9.f336962b >= r11.f336964d) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r9.f336964d <= r11.f336962b) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        r3 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m153204a(p1166z0.C112541g r9, p1166z0.C112541g r10, p1166z0.C112541g r11, int r12) {
        /*
            boolean r0 = m153205b(r11, r12, r9)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00ff
            boolean r0 = m153205b(r10, r12, r9)
            if (r0 != 0) goto L_0x0010
            goto L_0x00ff
        L_0x0010:
            r0 = 3
            if (r12 != r0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r5 = 6
            r6 = 5
            r7 = 4
            if (r3 == 0) goto L_0x0026
            float r3 = r9.f336961a
            float r8 = r11.f336963c
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0057
            goto L_0x0055
        L_0x0026:
            if (r12 != r7) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            if (r3 == 0) goto L_0x0036
            float r3 = r9.f336963c
            float r8 = r11.f336961a
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0057
            goto L_0x0055
        L_0x0036:
            if (r12 != r6) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 == 0) goto L_0x0046
            float r3 = r9.f336962b
            float r8 = r11.f336964d
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0057
            goto L_0x0055
        L_0x0046:
            if (r12 != r5) goto L_0x004a
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x00f5
            float r3 = r9.f336964d
            float r8 = r11.f336962b
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0057
        L_0x0055:
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            if (r3 != 0) goto L_0x005d
        L_0x005a:
            r1 = 1
            goto L_0x00ff
        L_0x005d:
            if (r12 != r0) goto L_0x0061
            r3 = 1
            goto L_0x0062
        L_0x0061:
            r3 = 0
        L_0x0062:
            if (r3 != 0) goto L_0x005a
            if (r12 != r7) goto L_0x0068
            r3 = 1
            goto L_0x0069
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 == 0) goto L_0x006c
            goto L_0x005a
        L_0x006c:
            if (r12 != r0) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 == 0) goto L_0x0078
            float r3 = r9.f336961a
            float r10 = r10.f336963c
            goto L_0x008f
        L_0x0078:
            if (r12 != r7) goto L_0x007c
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            if (r3 == 0) goto L_0x0084
            float r10 = r10.f336961a
            float r3 = r9.f336963c
            goto L_0x009c
        L_0x0084:
            if (r12 != r6) goto L_0x0088
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            if (r3 == 0) goto L_0x0091
            float r3 = r9.f336962b
            float r10 = r10.f336964d
        L_0x008f:
            float r3 = r3 - r10
            goto L_0x009e
        L_0x0091:
            if (r12 != r5) goto L_0x0095
            r3 = 1
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            if (r3 == 0) goto L_0x00eb
            float r10 = r10.f336962b
            float r3 = r9.f336964d
        L_0x009c:
            float r3 = r10 - r3
        L_0x009e:
            r10 = 0
            float r10 = java.lang.Math.max(r10, r3)
            if (r12 != r0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00af
            float r9 = r9.f336961a
            float r11 = r11.f336961a
            goto L_0x00c6
        L_0x00af:
            if (r12 != r7) goto L_0x00b3
            r0 = 1
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            if (r0 == 0) goto L_0x00bb
            float r11 = r11.f336963c
            float r9 = r9.f336963c
            goto L_0x00d3
        L_0x00bb:
            if (r12 != r6) goto L_0x00bf
            r0 = 1
            goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 == 0) goto L_0x00c8
            float r9 = r9.f336962b
            float r11 = r11.f336962b
        L_0x00c6:
            float r9 = r9 - r11
            goto L_0x00d5
        L_0x00c8:
            if (r12 != r5) goto L_0x00cc
            r12 = 1
            goto L_0x00cd
        L_0x00cc:
            r12 = 0
        L_0x00cd:
            if (r12 == 0) goto L_0x00e1
            float r11 = r11.f336964d
            float r9 = r9.f336964d
        L_0x00d3:
            float r9 = r11 - r9
        L_0x00d5:
            r11 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.max(r11, r9)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ff
            goto L_0x005a
        L_0x00e1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r4.toString()
            r9.<init>(r10)
            throw r9
        L_0x00eb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r4.toString()
            r9.<init>(r10)
            throw r9
        L_0x00f5:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r4.toString()
            r9.<init>(r10)
            throw r9
        L_0x00ff:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112314f0.m153204a(z0.g, z0.g, z0.g, int):boolean");
    }

    /* renamed from: b */
    public static final boolean m153205b(C112541g gVar, int i, C112541g gVar2) {
        if (!((i == 3) || i == 4)) {
            if (!((i == 5) || i == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else if (gVar.f336963c <= gVar2.f336961a || gVar.f336961a >= gVar2.f336963c) {
                return false;
            }
        } else if (gVar.f336964d <= gVar2.f336962b || gVar.f336962b >= gVar2.f336964d) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final C112321l m153206c(C108793e<C112321l> eVar, C112541g gVar, int i) {
        C112541g gVar2;
        if (i == 3) {
            gVar2 = gVar.mo164262c((gVar.f336963c - gVar.f336961a) + ((float) 1), 0.0f);
        } else {
            if (i == 4) {
                gVar2 = gVar.mo164262c(-((gVar.f336963c - gVar.f336961a) + ((float) 1)), 0.0f);
            } else {
                if (i == 5) {
                    gVar2 = gVar.mo164262c(0.0f, (gVar.f336964d - gVar.f336962b) + ((float) 1));
                } else {
                    if (i == 6) {
                        gVar2 = gVar.mo164262c(0.0f, -((gVar.f336964d - gVar.f336962b) + ((float) 1)));
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        C112321l lVar = null;
        int i2 = eVar.f325786f;
        if (i2 > 0) {
            T[] tArr = eVar.f325784d;
            int i3 = 0;
            do {
                C112321l lVar2 = (C112321l) tArr[i3];
                if (C112310d0.m153200e(lVar2)) {
                    C112541g d = C112310d0.m153199d(lVar2);
                    if (m153208e(d, i, gVar) && (!m153208e(gVar2, i, gVar) || m153204a(gVar, d, gVar2, i) || (!m153204a(gVar, gVar2, d, i) && m153209f(i, gVar, d) < m153209f(i, gVar, gVar2)))) {
                        lVar = lVar2;
                        gVar2 = d;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return lVar;
    }

    /* renamed from: d */
    public static final boolean m153207d(C112321l lVar, C112321l lVar2, int i, C32226l<? super C112321l, Boolean> lVar3) {
        Object obj;
        int i2 = 1;
        if (m153210g(lVar, lVar2, i, lVar3)) {
            return true;
        }
        C112315a aVar = new C112315a(lVar, lVar2, i, lVar3);
        C109831c cVar = lVar.f336337n;
        if (cVar != null) {
            if (i == 5) {
                i2 = 5;
            } else {
                if (i == 6) {
                    i2 = 6;
                } else {
                    if (i == 3) {
                        i2 = 3;
                    } else {
                        if (i == 4) {
                            i2 = 4;
                        } else {
                            if (i == 1) {
                                i2 = 2;
                            } else {
                                if (!(i == 2)) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                                }
                            }
                        }
                    }
                }
            }
            obj = cVar.mo145566b(i2, aVar);
        } else {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m153208e(C112541g gVar, int i, C112541g gVar2) {
        if (i == 3) {
            float f = gVar2.f336963c;
            float f2 = gVar.f336963c;
            if ((f > f2 || gVar2.f336961a >= f2) && gVar2.f336961a > gVar.f336961a) {
                return true;
            }
        } else {
            if (i == 4) {
                float f3 = gVar2.f336961a;
                float f4 = gVar.f336961a;
                if ((f3 < f4 || gVar2.f336963c <= f4) && gVar2.f336963c < gVar.f336963c) {
                    return true;
                }
            } else {
                if (i == 5) {
                    float f5 = gVar2.f336964d;
                    float f6 = gVar.f336964d;
                    if ((f5 > f6 || gVar2.f336962b >= f6) && gVar2.f336962b > gVar.f336962b) {
                        return true;
                    }
                } else {
                    if (i == 6) {
                        float f7 = gVar2.f336962b;
                        float f8 = gVar.f336962b;
                        if ((f7 < f8 || gVar2.f336964d <= f8) && gVar2.f336964d < gVar.f336964d) {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final long m153209f(int i, C112541g gVar, C112541g gVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z = false;
        boolean z2 = true;
        if (i == 3) {
            f2 = gVar.f336961a;
            f = gVar2.f336963c;
        } else {
            if (i == 4) {
                f2 = gVar2.f336961a;
                f = gVar.f336963c;
            } else {
                if (i == 5) {
                    f2 = gVar.f336962b;
                    f = gVar2.f336964d;
                } else {
                    if (i == 6) {
                        f2 = gVar2.f336962b;
                        f = gVar.f336964d;
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        long abs = (long) Math.abs(Math.max(0.0f, f2 - f));
        if ((i == 3) || i == 4) {
            float f7 = gVar.f336962b;
            f6 = (float) 2;
            f5 = f7 + ((gVar.f336964d - f7) / f6);
            f4 = gVar2.f336962b;
            f3 = gVar2.f336964d;
        } else {
            if (!(i == 5)) {
                if (i == 6) {
                    z = true;
                }
                z2 = z;
            }
            if (z2) {
                float f8 = gVar.f336961a;
                f6 = (float) 2;
                f5 = f8 + ((gVar.f336963c - f8) / f6);
                f4 = gVar2.f336961a;
                f3 = gVar2.f336963c;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        long abs2 = (long) Math.abs(f5 - (f4 + ((f3 - f4) / f6)));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: g */
    public static final boolean m153210g(C112321l lVar, C112321l lVar2, int i, C32226l<? super C112321l, Boolean> lVar3) {
        C112321l c;
        C108793e eVar = new C108793e(new C112321l[lVar.f336332f.f325786f], 0);
        eVar.mo159862d(eVar.f325786f, lVar.f336332f);
        while (eVar.mo159868j() && (c = m153206c(eVar, C112310d0.m153199d(lVar2), i)) != null) {
            if (!c.f336333g.mo164040b()) {
                return lVar3.invoke(c).booleanValue();
            }
            if (m153210g(c, lVar2, i, lVar3)) {
                return true;
            }
            eVar.mo159869k(c);
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m153211h(C112321l lVar, int i, C32226l<? super C112321l, Boolean> lVar2) {
        C112541g gVar;
        C87412m.m108594g(lVar, "$this$twoDimensionalFocusSearch");
        C87412m.m108594g(lVar2, "onFound");
        int ordinal = lVar.f336333g.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return false;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return lVar2.invoke(lVar).booleanValue();
                        }
                        throw new C13603j();
                    }
                }
            }
            C112321l lVar3 = lVar.f336334h;
            if (lVar3 != null) {
                int ordinal2 = lVar3.f336333g.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    if (ordinal2 != 5) {
                                        throw new C13603j();
                                    }
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    }
                    if (!m153211h(lVar3, i, lVar2)) {
                        C112306b0 b0Var = lVar3.f336333g;
                        if (b0Var == C112306b0.ActiveParent || b0Var == C112306b0.DeactivatedParent) {
                            C112321l b = C112310d0.m153197b(lVar3);
                            if (b != null) {
                                return m153207d(lVar, b, i, lVar2);
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                return m153207d(lVar, lVar3, i, lVar2);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        C108793e<C112321l> a = C112310d0.m153196a(lVar);
        if (a.f325786f <= 1) {
            C112321l lVar4 = (C112321l) (a.mo159867i() ? null : a.f325784d[0]);
            if (lVar4 != null) {
                return lVar2.invoke(lVar4).booleanValue();
            }
            return false;
        }
        if ((i == 4) || i == 6) {
            C112541g d = C112310d0.m153199d(lVar);
            float f = d.f336961a;
            float f2 = d.f336962b;
            gVar = new C112541g(f, f2, f, f2);
        } else {
            if (!(i == 3) && i != 5) {
                z = false;
            }
            if (z) {
                C112541g d2 = C112310d0.m153199d(lVar);
                float f3 = d2.f336963c;
                float f4 = d2.f336964d;
                gVar = new C112541g(f3, f4, f3, f4);
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        C112321l c = m153206c(a, gVar, i);
        if (c != null) {
            return lVar2.invoke(c).booleanValue();
        }
        return false;
    }
}
