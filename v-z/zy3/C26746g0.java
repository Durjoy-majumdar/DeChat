package zy3;

import b04.C23649g;
import com.google.firebase.analytics.FirebaseAnalytics;
import d04.C24442a;
import fy3.C32224a;
import h04.C24600c;
import h04.C24601d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m04.C24976j;
import n04.C25143j0;
import n04.C25167p1;
import n04.C25180t1;
import n04.C25192x;
import n04.C25202z1;
import vz3.C22830f;
import w04.C22850f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26490q0;
import wy3.C26491r;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26506s0;
import wy3.C26507t0;
import wy3.C26508u;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.g0 */
public class C26746g0 extends C26776r0 implements C26504r0 {

    /* renamed from: A */
    public C26509u0 f74361A;

    /* renamed from: B */
    public C26509u0 f74362B;

    /* renamed from: C */
    public List<C26446d1> f74363C;

    /* renamed from: D */
    public C26749h0 f74364D;

    /* renamed from: E */
    public C26507t0 f74365E;

    /* renamed from: F */
    public C26508u f74366F;

    /* renamed from: G */
    public C26508u f74367G;

    /* renamed from: o */
    public final C26442c0 f74368o;

    /* renamed from: p */
    public C26505s f74369p;

    /* renamed from: q */
    public Collection<? extends C26504r0> f74370q;

    /* renamed from: r */
    public final C26504r0 f74371r;

    /* renamed from: s */
    public final C26436b.C26437a f74372s;

    /* renamed from: t */
    public final boolean f74373t;

    /* renamed from: u */
    public final boolean f74374u;

    /* renamed from: v */
    public final boolean f74375v;

    /* renamed from: w */
    public final boolean f74376w;

    /* renamed from: x */
    public final boolean f74377x;

    /* renamed from: y */
    public final boolean f74378y;

    /* renamed from: z */
    public List<C26509u0> f74379z;

    /* renamed from: zy3.g0$a */
    public class C26747a {

        /* renamed from: a */
        public C26469k f74380a;

        /* renamed from: b */
        public C26442c0 f74381b;

        /* renamed from: c */
        public C26505s f74382c;

        /* renamed from: d */
        public C26504r0 f74383d = null;

        /* renamed from: e */
        public C26436b.C26437a f74384e;

        /* renamed from: f */
        public C25167p1 f74385f;

        /* renamed from: g */
        public boolean f74386g;

        /* renamed from: h */
        public C26509u0 f74387h;

        /* renamed from: i */
        public C22830f f74388i;

        /* renamed from: j */
        public C25143j0 f74389j;

        public C26747a() {
            this.f74380a = C26746g0.this.mo51892b();
            this.f74381b = C26746g0.this.mo51802j();
            this.f74382c = C26746g0.this.getVisibility();
            this.f74384e = C26746g0.this.mo52634f();
            this.f74385f = C25167p1.f71619a;
            this.f74386g = true;
            this.f74387h = C26746g0.this.f74361A;
            this.f74388i = C26746g0.this.getName();
            this.f74389j = C26746g0.this.getType();
        }

        /* renamed from: a */
        public static /* synthetic */ void m34902a(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setReturnType";
            } else if (i2 == 7) {
                objArr[1] = "setModality";
            } else if (i2 == 9) {
                objArr[1] = "setVisibility";
            } else if (i2 == 11) {
                objArr[1] = "setKind";
            } else if (i2 == 19) {
                objArr[1] = "setName";
            } else if (i2 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public C26504r0 mo53727b() {
            C26509u0 u0Var;
            C26753j0 j0Var;
            C26749h0 h0Var;
            C26751i0 i0Var;
            C32224a<C24976j<C23649g<?>>> aVar;
            C26436b.C26437a aVar2 = C26436b.C26437a.FAKE_OVERRIDE;
            C26746g0 g0Var = C26746g0.this;
            g0Var.getClass();
            C25202z1 z1Var = C25202z1.IN_VARIANCE;
            C25202z1 z1Var2 = C25202z1.OUT_VARIANCE;
            C26746g0 K0 = g0Var.mo51324K0(this.f74380a, this.f74381b, this.f74382c, this.f74383d, this.f74384e, this.f74388i, C26521y0.f73808a);
            List<C26446d1> typeParameters = g0Var.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            C25180t1 b = C25192x.m32115b(typeParameters, this.f74385f, K0, arrayList);
            C25143j0 j0Var2 = this.f74389j;
            C25143j0 k = b.mo52314k(j0Var2, z1Var2);
            if (k != null) {
                C25143j0 k2 = b.mo52314k(j0Var2, z1Var);
                if (k2 != null) {
                    K0.mo51325N0(k2);
                }
                C26509u0 u0Var2 = this.f74387h;
                if (u0Var2 != null) {
                    C26509u0 c = u0Var2.mo51921c(b);
                    if (c != null) {
                        u0Var = c;
                    }
                } else {
                    u0Var = null;
                }
                C26509u0 u0Var3 = g0Var.f74362B;
                if (u0Var3 != null) {
                    C25143j0 k3 = b.mo52314k(u0Var3.getType(), z1Var);
                    j0Var = k3 == null ? null : new C26753j0(K0, new C24601d(K0, k3, u0Var3.getValue()), u0Var3.getAnnotations());
                } else {
                    j0Var = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (C26509u0 next : g0Var.f74379z) {
                    C25143j0 k4 = b.mo52314k(next.getType(), z1Var);
                    C26753j0 j0Var3 = k4 == null ? null : new C26753j0(K0, new C24600c(K0, k4, next.getValue()), next.getAnnotations());
                    if (j0Var3 != null) {
                        arrayList2.add(j0Var3);
                    }
                }
                K0.mo53726O0(k, arrayList, u0Var, j0Var, arrayList2);
                C26749h0 h0Var2 = g0Var.f74364D;
                if (h0Var2 == null) {
                    h0Var = null;
                } else {
                    C26571h annotations = h0Var2.getAnnotations();
                    C26442c0 c0Var = this.f74381b;
                    C26505s visibility = g0Var.f74364D.getVisibility();
                    if (this.f74384e == aVar2 && C26491r.m34182e(visibility.mo53465d())) {
                        visibility = C26491r.f73785h;
                    }
                    C26505s sVar = visibility;
                    C26749h0 h0Var3 = g0Var.f74364D;
                    boolean z = h0Var3.f74340h;
                    boolean z2 = h0Var3.f74341i;
                    boolean z3 = h0Var3.f74344o;
                    C26436b.C26437a aVar3 = this.f74384e;
                    C26504r0 r0Var = this.f74383d;
                    h0Var = new C26749h0(K0, annotations, c0Var, sVar, z, z2, z3, aVar3, r0Var == null ? null : r0Var.mo52635g(), C26521y0.f73808a);
                }
                if (h0Var != null) {
                    C26749h0 h0Var4 = g0Var.f74364D;
                    C25143j0 j0Var4 = h0Var4.f74392s;
                    h0Var.f74347r = C26746g0.m34869L0(b, h0Var4);
                    h0Var.mo53729L0(j0Var4 != null ? b.mo52314k(j0Var4, z1Var2) : null);
                }
                C26507t0 t0Var = g0Var.f74365E;
                if (t0Var == null) {
                    i0Var = null;
                } else {
                    C26571h annotations2 = t0Var.getAnnotations();
                    C26442c0 c0Var2 = this.f74381b;
                    C26505s visibility2 = g0Var.f74365E.getVisibility();
                    C26505s sVar2 = (this.f74384e != aVar2 || !C26491r.m34182e(visibility2.mo53465d())) ? visibility2 : C26491r.f73785h;
                    boolean r0 = g0Var.f74365E.mo53466r0();
                    boolean isExternal = g0Var.f74365E.isExternal();
                    boolean isInline = g0Var.f74365E.isInline();
                    C26436b.C26437a aVar4 = this.f74384e;
                    C26504r0 r0Var2 = this.f74383d;
                    i0Var = new C26751i0(K0, annotations2, c0Var2, sVar2, r0, isExternal, isInline, aVar4, r0Var2 == null ? null : r0Var2.mo52640i(), C26521y0.f73808a);
                }
                if (i0Var != null) {
                    List<C26463h1> L0 = C26777s.m35098L0(i0Var, g0Var.f74365E.mo52639h(), b, false, false, (boolean[]) null);
                    if (L0 == null) {
                        L0 = Collections.singletonList(C26751i0.m34942K0(i0Var, C24442a.m30538e(this.f74380a).mo53323o(), g0Var.f74365E.mo52639h().get(0).getAnnotations()));
                    }
                    if (L0.size() == 1) {
                        i0Var.f74347r = C26746g0.m34869L0(b, g0Var.f74365E);
                        C26463h1 h1Var = L0.get(0);
                        if (h1Var != null) {
                            i0Var.f74395s = h1Var;
                        } else {
                            C26751i0.m34941D(6);
                            throw null;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                C26775r rVar = null;
                C26508u uVar = g0Var.f74366F;
                C26775r rVar2 = uVar == null ? null : new C26775r(uVar.getAnnotations(), K0);
                C26508u uVar2 = g0Var.f74367G;
                if (uVar2 != null) {
                    rVar = new C26775r(uVar2.getAnnotations(), K0);
                }
                K0.mo53725M0(h0Var, i0Var, rVar2, rVar);
                if (this.f74386g) {
                    C22850f a = C22850f.f65674f.mo36008a();
                    for (C26504r0 c2 : g0Var.mo52633e()) {
                        a.add(c2.mo51921c(b));
                    }
                    K0.mo52596n0(a);
                }
                if (!g0Var.mo51327i0() || (aVar = g0Var.f74447n) == null) {
                    return K0;
                }
                K0.mo53748I0(g0Var.f74446j, aVar);
                return K0;
            }
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [wy3.r0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26746g0(wy3.C26469k r13, wy3.C26504r0 r14, xy3.C26571h r15, wy3.C26442c0 r16, wy3.C26505s r17, boolean r18, vz3.C22830f r19, wy3.C26436b.C26437a r20, wy3.C26521y0 r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r12 = this;
            r7 = r12
            r8 = r16
            r9 = r17
            r10 = r20
            r11 = 0
            if (r13 == 0) goto L_0x006f
            if (r15 == 0) goto L_0x006a
            if (r8 == 0) goto L_0x0065
            if (r9 == 0) goto L_0x0060
            if (r19 == 0) goto L_0x005b
            if (r10 == 0) goto L_0x0056
            if (r21 == 0) goto L_0x0051
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r19
            r5 = r18
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f74370q = r11
            java.util.List r0 = java.util.Collections.emptyList()
            r7.f74379z = r0
            r7.f74368o = r8
            r7.f74369p = r9
            if (r14 != 0) goto L_0x0033
            r0 = r7
            goto L_0x0034
        L_0x0033:
            r0 = r14
        L_0x0034:
            r7.f74371r = r0
            r7.f74372s = r10
            r0 = r22
            r7.f74373t = r0
            r0 = r23
            r7.f74374u = r0
            r0 = r24
            r7.f74375v = r0
            r0 = r25
            r7.f74376w = r0
            r0 = r26
            r7.f74377x = r0
            r0 = r27
            r7.f74378y = r0
            return
        L_0x0051:
            r0 = 6
            m34868D(r0)
            throw r11
        L_0x0056:
            r0 = 5
            m34868D(r0)
            throw r11
        L_0x005b:
            r0 = 4
            m34868D(r0)
            throw r11
        L_0x0060:
            r0 = 3
            m34868D(r0)
            throw r11
        L_0x0065:
            r0 = 2
            m34868D(r0)
            throw r11
        L_0x006a:
            r0 = 1
            m34868D(r0)
            throw r11
        L_0x006f:
            r0 = 0
            m34868D(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zy3.C26746g0.<init>(wy3.k, wy3.r0, xy3.h, wy3.c0, wy3.s, boolean, vz3.f, wy3.b$a, wy3.y0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: D */
    public static /* synthetic */ void m34868D(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: L0 */
    public static C26516w m34869L0(C25180t1 t1Var, C26490q0 q0Var) {
        if (t1Var == null) {
            m34868D(30);
            throw null;
        } else if (q0Var == null) {
            m34868D(31);
            throw null;
        } else if (q0Var.mo53473D0() != null) {
            return q0Var.mo53473D0().mo51921c(t1Var);
        } else {
            return null;
        }
    }

    /* renamed from: F0 */
    public boolean mo52625F0() {
        return this.f74373t;
    }

    /* renamed from: H */
    public C26509u0 mo52626H() {
        return this.f74361A;
    }

    /* renamed from: I */
    public C26509u0 mo52627I() {
        return this.f74362B;
    }

    /* renamed from: J0 */
    public C26504r0 mo52598y(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26436b.C26437a aVar, boolean z) {
        C26747a aVar2 = new C26747a();
        if (kVar != null) {
            aVar2.f74380a = kVar;
            aVar2.f74383d = null;
            if (c0Var != null) {
                aVar2.f74381b = c0Var;
                if (sVar != null) {
                    aVar2.f74382c = sVar;
                    if (aVar != null) {
                        aVar2.f74384e = aVar;
                        aVar2.f74386g = z;
                        C26504r0 b = aVar2.mo53727b();
                        if (b != null) {
                            return b;
                        }
                        m34868D(42);
                        throw null;
                    }
                    C26747a.m34902a(10);
                    throw null;
                }
                C26747a.m34902a(8);
                throw null;
            }
            C26747a.m34902a(6);
            throw null;
        }
        C26747a.m34902a(0);
        throw null;
    }

    /* renamed from: K0 */
    public C26746g0 mo51324K0(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26504r0 r0Var, C26436b.C26437a aVar, C22830f fVar, C26521y0 y0Var) {
        if (kVar == null) {
            m34868D(32);
            throw null;
        } else if (c0Var == null) {
            m34868D(33);
            throw null;
        } else if (sVar == null) {
            m34868D(34);
            throw null;
        } else if (aVar == null) {
            m34868D(35);
            throw null;
        } else if (fVar == null) {
            m34868D(36);
            throw null;
        } else if (y0Var != null) {
            return new C26746g0(kVar, r0Var, getAnnotations(), c0Var, sVar, this.f74445i, fVar, aVar, y0Var, this.f74373t, mo51327i0(), this.f74375v, this.f74376w, isExternal(), this.f74378y);
        } else {
            m34868D(37);
            throw null;
        }
    }

    /* renamed from: M0 */
    public void mo53725M0(C26749h0 h0Var, C26507t0 t0Var, C26508u uVar, C26508u uVar2) {
        this.f74364D = h0Var;
        this.f74365E = t0Var;
        this.f74366F = uVar;
        this.f74367G = uVar2;
    }

    /* renamed from: N0 */
    public void mo51325N0(C25143j0 j0Var) {
        if (j0Var == null) {
            m34868D(14);
            throw null;
        }
    }

    /* renamed from: O0 */
    public void mo53726O0(C25143j0 j0Var, List<? extends C26446d1> list, C26509u0 u0Var, C26509u0 u0Var2, List<C26509u0> list2) {
        if (j0Var == null) {
            m34868D(17);
            throw null;
        } else if (list == null) {
            m34868D(18);
            throw null;
        } else if (list2 != null) {
            this.f74443h = j0Var;
            this.f74363C = new ArrayList(list);
            this.f74362B = u0Var2;
            this.f74361A = u0Var;
            this.f74379z = list2;
        } else {
            m34868D(19);
            throw null;
        }
    }

    /* renamed from: P */
    public boolean mo51792P() {
        return this.f74375v;
    }

    /* renamed from: T */
    public List<C26509u0> mo52629T() {
        List<C26509u0> list = this.f74379z;
        if (list != null) {
            return list;
        }
        m34868D(22);
        throw null;
    }

    /* renamed from: V */
    public <V> V mo51326V(C26434a.C22933a<V> aVar) {
        return null;
    }

    /* renamed from: X */
    public List<C26490q0> mo52630X() {
        ArrayList arrayList = new ArrayList(2);
        C26749h0 h0Var = this.f74364D;
        if (h0Var != null) {
            arrayList.add(h0Var);
        }
        C26507t0 t0Var = this.f74365E;
        if (t0Var != null) {
            arrayList.add(t0Var);
        }
        return arrayList;
    }

    /* renamed from: d0 */
    public C26508u mo52632d0() {
        return this.f74367G;
    }

    /* renamed from: e */
    public Collection<? extends C26504r0> mo52633e() {
        Collection<? extends C26504r0> collection = this.f74370q;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        m34868D(41);
        throw null;
    }

    /* renamed from: f */
    public C26436b.C26437a mo52634f() {
        C26436b.C26437a aVar = this.f74372s;
        if (aVar != null) {
            return aVar;
        }
        m34868D(39);
        throw null;
    }

    /* renamed from: g */
    public C26506s0 mo52635g() {
        return this.f74364D;
    }

    public C25143j0 getReturnType() {
        C25143j0 type = getType();
        if (type != null) {
            return type;
        }
        m34868D(23);
        throw null;
    }

    public List<C26446d1> getTypeParameters() {
        List<C26446d1> list = this.f74363C;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + C23594m.m28176N(this));
    }

    public C26505s getVisibility() {
        C26505s sVar = this.f74369p;
        if (sVar != null) {
            return sVar;
        }
        m34868D(25);
        throw null;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return mVar.mo52798m(this, d);
    }

    /* renamed from: i */
    public C26507t0 mo52640i() {
        return this.f74365E;
    }

    /* renamed from: i0 */
    public boolean mo51327i0() {
        return this.f74374u;
    }

    public boolean isExternal() {
        return this.f74377x;
    }

    /* renamed from: j */
    public C26442c0 mo51802j() {
        C26442c0 c0Var = this.f74368o;
        if (c0Var != null) {
            return c0Var;
        }
        m34868D(24);
        throw null;
    }

    /* renamed from: l0 */
    public C26508u mo52641l0() {
        return this.f74366F;
    }

    /* renamed from: n0 */
    public void mo52596n0(Collection<? extends C26436b> collection) {
        if (collection != null) {
            this.f74370q = collection;
        } else {
            m34868D(40);
            throw null;
        }
    }

    /* renamed from: q0 */
    public boolean mo52642q0() {
        return this.f74378y;
    }

    /* renamed from: v0 */
    public boolean mo51808v0() {
        return this.f74376w;
    }

    /* renamed from: c */
    public C26504r0 m34888c(C25180t1 t1Var) {
        if (t1Var == null) {
            m34868D(27);
            throw null;
        } else if (t1Var.mo52312h()) {
            return this;
        } else {
            C26747a aVar = new C26747a();
            C25167p1 g = t1Var.mo52311g();
            if (g != null) {
                aVar.f74385f = g;
                aVar.f74383d = m34885a();
                return aVar.mo53727b();
            }
            C26747a.m34902a(15);
            throw null;
        }
    }

    /* renamed from: a */
    public C26504r0 m34886a() {
        C26504r0 r0Var = this.f74371r;
        C26504r0 a = r0Var == this ? this : r0Var.mo36109a();
        if (a != null) {
            return a;
        }
        m34868D(38);
        throw null;
    }
}
