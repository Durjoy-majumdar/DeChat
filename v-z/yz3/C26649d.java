package yz3;

import b04.C23641a;
import b04.C23643b;
import b04.C23649g;
import b04.C23663s;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jy3.C117370c;
import jy3.C88045a;
import n04.C25101a;
import n04.C25103a1;
import n04.C25124h0;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25158m1;
import n04.C25187v1;
import n04.C25198y1;
import ny3.C25235d;
import ny3.C89104m;
import p04.C25417j;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13603j;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64197v;
import ty3.C26336h;
import ty3.C26343l;
import u04.C90591a;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;
import vz3.C26409h;
import wy3.C22935h;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26438b0;
import wy3.C26442c0;
import wy3.C26443c1;
import wy3.C26444d;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26453f;
import wy3.C26463h1;
import wy3.C26464i;
import wy3.C26465i0;
import wy3.C26466i1;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26483n;
import wy3.C26484n0;
import wy3.C26488p0;
import wy3.C26490q0;
import wy3.C26491r;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26506s0;
import wy3.C26507t0;
import wy3.C26508u;
import wy3.C26509u0;
import wy3.C26516w;
import xy3.C26564a;
import xy3.C26566c;
import xy3.C26568e;
import yz3.C23393c;
import z04.C112550d0;
import z04.C112551y;
import zz3.C26794h;

/* renamed from: yz3.d */
public final class C26649d extends C23393c implements C23413j {

    /* renamed from: c */
    public final C26653k f74154c;

    /* renamed from: d */
    public final C13601g f74155d = C36568h.m40985a(new C23407b(this));

    /* renamed from: yz3.d$b */
    public static final class C23407b extends C87413o implements C32224a<C26649d> {

        /* renamed from: d */
        public final /* synthetic */ C26649d f67165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23407b(C26649d dVar) {
            super(0);
            this.f67165d = dVar;
        }

        public Object invoke() {
            C26649d dVar = this.f67165d;
            C23410f fVar = C23410f.f67168d;
            dVar.getClass();
            C87412m.m108594g(fVar, "changeOptions");
            C26653k kVar = dVar.f74154c;
            kVar.getClass();
            Class<C26653k> cls = C26653k.class;
            C26653k kVar2 = new C26653k();
            Field[] declaredFields = cls.getDeclaredFields();
            C87412m.m108593f(declaredFields, "this::class.java.declaredFields");
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(kVar);
                    C88045a aVar = obj instanceof C88045a ? (C88045a) obj : null;
                    if (aVar != null) {
                        String name = field.getName();
                        C87412m.m108593f(name, "field.name");
                        C112551y.m153819s(name, "is", z);
                        C25235d a = C24560g0.m30725a(cls);
                        String name2 = field.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("get");
                        String name3 = field.getName();
                        C87412m.m108593f(name3, "field.name");
                        if (name3.length() > 0) {
                            char upperCase = Character.toUpperCase(name3.charAt(z ? 1 : 0));
                            String substring = name3.substring(1);
                            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                            name3 = upperCase + substring;
                        }
                        sb.append(name3);
                        new C24575y(a, name2, sb.toString());
                        field.set(kVar2, new C23416l(aVar.f254677a, kVar2));
                    }
                }
                i++;
                z = false;
            }
            fVar.invoke(kVar2);
            kVar2.f74199a = true;
            return new C26649d(kVar2);
        }
    }

    /* renamed from: yz3.d$c */
    public static final class C23408c extends C87413o implements C32226l<C23649g<?>, CharSequence> {

        /* renamed from: d */
        public final /* synthetic */ C26649d f67166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23408c(C26649d dVar) {
            super(1);
            this.f67166d = dVar;
        }

        public Object invoke(Object obj) {
            C23649g gVar = (C23649g) obj;
            C87412m.m108594g(gVar, LocaleUtil.ITALIAN);
            return this.f67166d.mo53656J(gVar);
        }
    }

    /* renamed from: yz3.d$a */
    public final class C26650a implements C26482m<C13598b0, StringBuilder> {
        public C26650a() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo52797a(C26516w wVar, Object obj) {
            mo53691n(wVar, (StringBuilder) obj);
            return C13598b0.f38549a;
        }

        /* renamed from: b */
        public Object mo53448b(C26484n0 n0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(n0Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d dVar = C26649d.this;
            dVar.getClass();
            dVar.mo53671Y(n0Var.mo53460d(), "package", sb);
            if (dVar.mo36877h()) {
                sb.append(" in context of ");
                dVar.mo53667U(n0Var.mo53459G0(), sb, false);
            }
            return C13598b0.f38549a;
        }

        /* renamed from: c */
        public Object mo53449c(C26507t0 t0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(t0Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            mo53692o(t0Var, sb, "setter");
            return C13598b0.f38549a;
        }

        /* renamed from: d */
        public Object mo53450d(C26463h1 h1Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(h1Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d.this.mo53682j0(h1Var, true, sb, true);
            return C13598b0.f38549a;
        }

        /* renamed from: e */
        public Object mo53451e(C26448e0 e0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(e0Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d.this.mo53667U(e0Var, sb, true);
            return C13598b0.f38549a;
        }

        /* renamed from: f */
        public Object mo53452f(C26446d1 d1Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(d1Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d.this.mo53678f0(d1Var, sb, true);
            return C13598b0.f38549a;
        }

        /* renamed from: g */
        public Object mo53453g(C26509u0 u0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(u0Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            sb.append(u0Var.getName());
            return C13598b0.f38549a;
        }

        /* renamed from: h */
        public Object mo53454h(C26465i0 i0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(i0Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d dVar = C26649d.this;
            dVar.getClass();
            dVar.mo53671Y(i0Var.mo53444d(), "package-fragment", sb);
            if (dVar.mo36877h()) {
                sb.append(" in ");
                dVar.mo53667U(i0Var.mo51892b(), sb, false);
            }
            return C13598b0.f38549a;
        }

        /* renamed from: i */
        public Object mo53455i(C26443c1 c1Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(c1Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d dVar = C26649d.this;
            dVar.mo53654G(sb, c1Var, (C26568e) null);
            C26505s visibility = c1Var.getVisibility();
            C87412m.m108593f(visibility, "typeAlias.visibility");
            dVar.mo53684l0(visibility, sb);
            dVar.mo53663Q(c1Var, sb);
            sb.append(dVar.mo53661O("typealias"));
            sb.append(" ");
            dVar.mo53667U(c1Var, sb, true);
            List<C26446d1> t = c1Var.mo51805t();
            C87412m.m108593f(t, "typeAlias.declaredTypeParameters");
            dVar.mo53680h0(t, sb, false);
            dVar.mo53655I(c1Var, sb);
            sb.append(" = ");
            sb.append(dVar.mo36863u(c1Var.mo51919E0()));
            return C13598b0.f38549a;
        }

        /* renamed from: j */
        public Object mo53456j(C26447e eVar, Object obj) {
            C26444d v;
            String str;
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(eVar, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d dVar = C26649d.this;
            dVar.getClass();
            boolean z = eVar.mo51796f() == C26453f.ENUM_ENTRY;
            if (!dVar.mo53649B()) {
                dVar.mo53654G(sb, eVar, (C26568e) null);
                List<C26509u0> w0 = eVar.mo51894w0();
                C87412m.m108593f(w0, "klass.contextReceivers");
                dVar.mo53657K(w0, sb);
                if (!z) {
                    C26505s visibility = eVar.getVisibility();
                    C87412m.m108593f(visibility, "klass.visibility");
                    dVar.mo53684l0(visibility, sb);
                }
                if (!(eVar.mo51796f() == C26453f.INTERFACE && eVar.mo51802j() == C26442c0.ABSTRACT) && (!eVar.mo51796f().mo53431a() || eVar.mo51802j() != C26442c0.FINAL)) {
                    C26442c0 j = eVar.mo51802j();
                    C87412m.m108593f(j, "klass.modality");
                    dVar.mo53664R(j, sb, dVar.mo53653F(eVar));
                }
                dVar.mo53663Q(eVar, sb);
                dVar.mo53666T(sb, dVar.mo53648A().contains(C26652i.INNER) && eVar.mo51795Y(), "inner");
                dVar.mo53666T(sb, dVar.mo53648A().contains(C26652i.DATA) && eVar.mo51794W(), "data");
                dVar.mo53666T(sb, dVar.mo53648A().contains(C26652i.INLINE) && eVar.isInline(), "inline");
                dVar.mo53666T(sb, dVar.mo53648A().contains(C26652i.VALUE) && eVar.mo51791O(), "value");
                dVar.mo53666T(sb, dVar.mo53648A().contains(C26652i.FUN) && eVar.mo51810z0(), "fun");
                if (eVar instanceof C26443c1) {
                    str = "typealias";
                } else if (eVar.mo51809x0()) {
                    str = "companion object";
                } else {
                    int ordinal = eVar.mo51796f().ordinal();
                    if (ordinal == 0) {
                        str = "class";
                    } else if (ordinal == 1) {
                        str = "interface";
                    } else if (ordinal == 2) {
                        str = "enum class";
                    } else if (ordinal == 3) {
                        str = "enum entry";
                    } else if (ordinal == 4) {
                        str = "annotation class";
                    } else if (ordinal == 5) {
                        str = "object";
                    } else {
                        throw new C13603j();
                    }
                }
                sb.append(dVar.mo53661O(str));
            }
            if (!C26794h.m35225m(eVar)) {
                if (!dVar.mo53649B()) {
                    dVar.mo53675c0(sb);
                }
                dVar.mo53667U(eVar, sb, true);
            } else {
                C26653k kVar = dVar.f74154c;
                if (((Boolean) ((C88045a) kVar.f74182F).mo122486c(kVar, C26653k.f74176W[30])).booleanValue()) {
                    if (dVar.mo53649B()) {
                        sb.append("companion object");
                    }
                    dVar.mo53675c0(sb);
                    C26469k b = eVar.mo51892b();
                    if (b != null) {
                        sb.append("of ");
                        C22830f name = b.getName();
                        C87412m.m108593f(name, "containingDeclaration.name");
                        sb.append(dVar.mo36862t(name, false));
                    }
                }
                if (dVar.mo53652E() || !C87412m.m108589b(eVar.getName(), C26409h.f73648b)) {
                    if (!dVar.mo53649B()) {
                        dVar.mo53675c0(sb);
                    }
                    C22830f name2 = eVar.getName();
                    C87412m.m108593f(name2, "descriptor.name");
                    sb.append(dVar.mo36862t(name2, true));
                }
            }
            if (!z) {
                List<C26446d1> t = eVar.mo51805t();
                C87412m.m108593f(t, "klass.declaredTypeParameters");
                dVar.mo53680h0(t, sb, false);
                dVar.mo53655I(eVar, sb);
                if (!eVar.mo51796f().mo53431a()) {
                    C26653k kVar2 = dVar.f74154c;
                    if (((Boolean) ((C88045a) kVar2.f74207i).mo122486c(kVar2, C26653k.f74176W[7])).booleanValue() && (v = eVar.mo51807v()) != null) {
                        sb.append(" ");
                        dVar.mo53654G(sb, v, (C26568e) null);
                        C26505s visibility2 = v.getVisibility();
                        C87412m.m108593f(visibility2, "primaryConstructor.visibility");
                        dVar.mo53684l0(visibility2, sb);
                        sb.append(dVar.mo53661O("constructor"));
                        List<C26463h1> h = v.mo52639h();
                        C87412m.m108593f(h, "primaryConstructor.valueParameters");
                        dVar.mo53683k0(h, v.mo51317M(), sb);
                    }
                }
                C26653k kVar3 = dVar.f74154c;
                if (!((Boolean) ((C88045a) kVar3.f74221w).mo122486c(kVar3, C26653k.f74176W[21])).booleanValue() && !C26336h.m33829F(eVar.mo36111s())) {
                    Collection<C25143j0> r = eVar.mo36110l().mo37096r();
                    C87412m.m108593f(r, "klass.typeConstructor.supertypes");
                    if (!r.isEmpty() && (r.size() != 1 || !C26336h.m33841y(r.iterator().next()))) {
                        dVar.mo53675c0(sb);
                        sb.append(": ");
                        C110818d0.m150920R(r, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C23412h(dVar), 60, (Object) null);
                    }
                }
                dVar.mo53685m0(t, sb);
            }
            return C13598b0.f38549a;
        }

        /* renamed from: k */
        public Object mo53457k(C26506s0 s0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(s0Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            mo53692o(s0Var, sb, "getter");
            return C13598b0.f38549a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0163  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo35276l(wy3.C26467j r22, java.lang.Object r23) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
                java.lang.String r2 = "constructorDescriptor"
                gy3.C87412m.m108594g(r0, r2)
                java.lang.String r2 = "builder"
                gy3.C87412m.m108594g(r1, r2)
                r2 = r21
                yz3.d r3 = yz3.C26649d.this
                r4 = 0
                r3.mo53654G(r1, r0, r4)
                yz3.k r4 = r3.f74154c
                jy3.c r5 = r4.f74213o
                ny3.m<java.lang.Object>[] r6 = yz3.C26653k.f74176W
                r7 = 13
                r7 = r6[r7]
                jy3.a r5 = (jy3.C88045a) r5
                java.lang.Object r4 = r5.mo122486c(r4, r7)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r5 = 0
                r7 = 1
                if (r4 != 0) goto L_0x003e
                wy3.e r4 = r22.mo53446j0()
                wy3.c0 r4 = r4.mo51802j()
                wy3.c0 r8 = wy3.C26442c0.SEALED
                if (r4 == r8) goto L_0x004f
            L_0x003e:
                wy3.s r4 = r22.getVisibility()
                java.lang.String r8 = "constructor.visibility"
                gy3.C87412m.m108593f(r4, r8)
                boolean r4 = r3.mo53684l0(r4, r1)
                if (r4 == 0) goto L_0x004f
                r4 = 1
                goto L_0x0050
            L_0x004f:
                r4 = 0
            L_0x0050:
                r3.mo53662P(r0, r1)
                yz3.k r8 = r3.f74154c
                jy3.c r9 = r8.f74191O
                r10 = 39
                r10 = r6[r10]
                jy3.a r9 = (jy3.C88045a) r9
                java.lang.Object r8 = r9.mo122486c(r8, r10)
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x0074
                boolean r8 = r22.mo53445L()
                if (r8 == 0) goto L_0x0074
                if (r4 == 0) goto L_0x0072
                goto L_0x0074
            L_0x0072:
                r4 = 0
                goto L_0x0075
            L_0x0074:
                r4 = 1
            L_0x0075:
                if (r4 == 0) goto L_0x0080
                java.lang.String r8 = "constructor"
                java.lang.String r8 = r3.mo53661O(r8)
                r1.append(r8)
            L_0x0080:
                wy3.i r8 = r22.mo51892b()
                java.lang.String r9 = "constructor.containingDeclaration"
                gy3.C87412m.m108593f(r8, r9)
                yz3.k r9 = r3.f74154c
                jy3.c r10 = r9.f74224z
                r11 = 24
                r12 = r6[r11]
                jy3.a r10 = (jy3.C88045a) r10
                java.lang.Object r9 = r10.mo122486c(r9, r12)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                java.lang.String r10 = "constructor.typeParameters"
                if (r9 == 0) goto L_0x00b5
                if (r4 == 0) goto L_0x00a8
                java.lang.String r4 = " "
                r1.append(r4)
            L_0x00a8:
                r3.mo53667U(r8, r1, r7)
                java.util.List r4 = r22.getTypeParameters()
                gy3.C87412m.m108593f(r4, r10)
                r3.mo53680h0(r4, r1, r5)
            L_0x00b5:
                java.util.List r4 = r22.mo52639h()
                java.lang.String r9 = "constructor.valueParameters"
                gy3.C87412m.m108593f(r4, r9)
                boolean r9 = r22.mo51317M()
                r3.mo53683k0(r4, r9, r1)
                yz3.k r4 = r3.f74154c
                jy3.c r9 = r4.f74215q
                r12 = 15
                r6 = r6[r12]
                jy3.a r9 = (jy3.C88045a) r9
                java.lang.Object r4 = r9.mo122486c(r4, r6)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x014d
                boolean r4 = r22.mo53445L()
                if (r4 != 0) goto L_0x014d
                boolean r4 = r8 instanceof wy3.C26447e
                if (r4 == 0) goto L_0x014d
                wy3.e r8 = (wy3.C26447e) r8
                wy3.d r4 = r8.mo51807v()
                if (r4 == 0) goto L_0x014d
                java.util.List r4 = r4.mo52639h()
                java.lang.String r6 = "primaryConstructor.valueParameters"
                gy3.C87412m.m108593f(r4, r6)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x00ff:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0121
                java.lang.Object r6 = r4.next()
                r8 = r6
                wy3.h1 r8 = (wy3.C26463h1) r8
                boolean r9 = r8.mo53442m0()
                if (r9 != 0) goto L_0x011a
                n04.j0 r8 = r8.mo53440S()
                if (r8 != 0) goto L_0x011a
                r8 = 1
                goto L_0x011b
            L_0x011a:
                r8 = 0
            L_0x011b:
                if (r8 == 0) goto L_0x00ff
                r12.add(r6)
                goto L_0x00ff
            L_0x0121:
                boolean r4 = r12.isEmpty()
                r4 = r4 ^ r7
                if (r4 == 0) goto L_0x014d
                java.lang.String r4 = " : "
                r1.append(r4)
                java.lang.String r4 = "this"
                java.lang.String r4 = r3.mo53661O(r4)
                r1.append(r4)
                r16 = 0
                r17 = 0
                yz3.g r18 = yz3.C23411g.f67169d
                r19 = 24
                r20 = 0
                java.lang.String r13 = ", "
                java.lang.String r14 = "("
                java.lang.String r15 = ")"
                java.lang.String r4 = sx3.C110818d0.m150921S(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r1.append(r4)
            L_0x014d:
                yz3.k r4 = r3.f74154c
                jy3.c r5 = r4.f74224z
                ny3.m<java.lang.Object>[] r6 = yz3.C26653k.f74176W
                r6 = r6[r11]
                jy3.a r5 = (jy3.C88045a) r5
                java.lang.Object r4 = r5.mo122486c(r4, r6)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x016d
                java.util.List r0 = r22.getTypeParameters()
                gy3.C87412m.m108593f(r0, r10)
                r3.mo53685m0(r0, r1)
            L_0x016d:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.C26650a.mo35276l(wy3.j, java.lang.Object):java.lang.Object");
        }

        /* renamed from: m */
        public Object mo52798m(C26504r0 r0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            C87412m.m108594g(r0Var, "descriptor");
            C87412m.m108594g(sb, "builder");
            C26649d.m34535w(C26649d.this, r0Var, sb);
            return C13598b0.f38549a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c5, code lost:
            if (((java.lang.Boolean) ((jy3.C88045a) r1.f74190N).mo122486c(r1, yz3.C26653k.f74176W[38])).booleanValue() != false) goto L_0x00c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x010d, code lost:
            if (((java.lang.Boolean) ((jy3.C88045a) r5.f74190N).mo122486c(r5, yz3.C26653k.f74176W[38])).booleanValue() != false) goto L_0x010f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c7, code lost:
            if (ty3.C26336h.m33828E(r1, ty3.C26343l.C26344a.f73415e) == false) goto L_0x01c9;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53691n(wy3.C26516w r11, java.lang.StringBuilder r12) {
            /*
                r10 = this;
                java.lang.String r0 = "descriptor"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.String r0 = "builder"
                gy3.C87412m.m108594g(r12, r0)
                yz3.d r0 = yz3.C26649d.this
                boolean r1 = r0.mo53649B()
                r2 = 1
                java.lang.String r3 = "function.typeParameters"
                if (r1 != 0) goto L_0x0175
                yz3.k r1 = r0.f74154c
                jy3.c r4 = r1.f74205g
                ny3.m<java.lang.Object>[] r5 = yz3.C26653k.f74176W
                r6 = 5
                r6 = r5[r6]
                jy3.a r4 = (jy3.C88045a) r4
                java.lang.Object r1 = r4.mo122486c(r1, r6)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x015a
                r1 = 0
                r0.mo53654G(r12, r11, r1)
                java.util.List r1 = r11.mo52629T()
                java.lang.String r4 = "function.contextReceiverParameters"
                gy3.C87412m.m108593f(r1, r4)
                r0.mo53657K(r1, r12)
                wy3.s r1 = r11.getVisibility()
                java.lang.String r4 = "function.visibility"
                gy3.C87412m.m108593f(r1, r4)
                r0.mo53684l0(r1, r12)
                r0.mo53665S(r11, r12)
                yz3.k r1 = r0.f74154c
                jy3.c r4 = r1.f74194R
                r6 = 42
                r7 = r5[r6]
                jy3.a r4 = (jy3.C88045a) r4
                java.lang.Object r1 = r4.mo122486c(r1, r7)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x0064
                r0.mo53663Q(r11, r12)
            L_0x0064:
                r0.mo53670X(r11, r12)
                yz3.k r1 = r0.f74154c
                jy3.c r4 = r1.f74194R
                r5 = r5[r6]
                jy3.a r4 = (jy3.C88045a) r4
                java.lang.Object r1 = r4.mo122486c(r1, r5)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                java.lang.String r4 = "suspend"
                if (r1 == 0) goto L_0x0134
                boolean r1 = r11.isOperator()
                java.lang.String r5 = "functionDescriptor.overriddenDescriptors"
                r6 = 38
                r7 = 0
                if (r1 == 0) goto L_0x00c9
                java.util.Collection r1 = r11.mo52633e()
                gy3.C87412m.m108593f(r1, r5)
                boolean r8 = r1.isEmpty()
                if (r8 == 0) goto L_0x0096
                goto L_0x00ae
            L_0x0096:
                java.util.Iterator r1 = r1.iterator()
            L_0x009a:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L_0x00ae
                java.lang.Object r8 = r1.next()
                wy3.w r8 = (wy3.C26516w) r8
                boolean r8 = r8.isOperator()
                if (r8 == 0) goto L_0x009a
                r1 = 0
                goto L_0x00af
            L_0x00ae:
                r1 = 1
            L_0x00af:
                if (r1 != 0) goto L_0x00c7
                yz3.k r1 = r0.f74154c
                jy3.c r8 = r1.f74190N
                ny3.m<java.lang.Object>[] r9 = yz3.C26653k.f74176W
                r9 = r9[r6]
                jy3.a r8 = (jy3.C88045a) r8
                java.lang.Object r1 = r8.mo122486c(r1, r9)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x00c9
            L_0x00c7:
                r1 = 1
                goto L_0x00ca
            L_0x00c9:
                r1 = 0
            L_0x00ca:
                boolean r8 = r11.isInfix()
                if (r8 == 0) goto L_0x0110
                java.util.Collection r8 = r11.mo52633e()
                gy3.C87412m.m108593f(r8, r5)
                boolean r5 = r8.isEmpty()
                if (r5 == 0) goto L_0x00de
                goto L_0x00f6
            L_0x00de:
                java.util.Iterator r5 = r8.iterator()
            L_0x00e2:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x00f6
                java.lang.Object r8 = r5.next()
                wy3.w r8 = (wy3.C26516w) r8
                boolean r8 = r8.isInfix()
                if (r8 == 0) goto L_0x00e2
                r5 = 0
                goto L_0x00f7
            L_0x00f6:
                r5 = 1
            L_0x00f7:
                if (r5 != 0) goto L_0x010f
                yz3.k r5 = r0.f74154c
                jy3.c r8 = r5.f74190N
                ny3.m<java.lang.Object>[] r9 = yz3.C26653k.f74176W
                r6 = r9[r6]
                jy3.a r8 = (jy3.C88045a) r8
                java.lang.Object r5 = r8.mo122486c(r5, r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0110
            L_0x010f:
                r7 = 1
            L_0x0110:
                boolean r5 = r11.mo51885Z()
                java.lang.String r6 = "tailrec"
                r0.mo53666T(r12, r5, r6)
                boolean r5 = r11.isSuspend()
                r0.mo53666T(r12, r5, r4)
                boolean r4 = r11.isInline()
                java.lang.String r5 = "inline"
                r0.mo53666T(r12, r4, r5)
                java.lang.String r4 = "infix"
                r0.mo53666T(r12, r7, r4)
                java.lang.String r4 = "operator"
                r0.mo53666T(r12, r1, r4)
                goto L_0x013b
            L_0x0134:
                boolean r1 = r11.isSuspend()
                r0.mo53666T(r12, r1, r4)
            L_0x013b:
                r0.mo53662P(r11, r12)
                boolean r1 = r0.mo53652E()
                if (r1 == 0) goto L_0x015a
                boolean r1 = r11.mo53474H0()
                if (r1 == 0) goto L_0x014f
                java.lang.String r1 = "/*isHiddenToOvercomeSignatureClash*/ "
                r12.append(r1)
            L_0x014f:
                boolean r1 = r11.mo53472C()
                if (r1 == 0) goto L_0x015a
                java.lang.String r1 = "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "
                r12.append(r1)
            L_0x015a:
                java.lang.String r1 = "fun"
                java.lang.String r1 = r0.mo53661O(r1)
                r12.append(r1)
                java.lang.String r1 = " "
                r12.append(r1)
                java.util.List r1 = r11.getTypeParameters()
                gy3.C87412m.m108593f(r1, r3)
                r0.mo53680h0(r1, r12, r2)
                r0.mo53673a0(r11, r12)
            L_0x0175:
                r0.mo53667U(r11, r12, r2)
                java.util.List r1 = r11.mo52639h()
                java.lang.String r2 = "function.valueParameters"
                gy3.C87412m.m108593f(r1, r2)
                boolean r2 = r11.mo51317M()
                r0.mo53683k0(r1, r2, r12)
                r0.mo53674b0(r11, r12)
                n04.j0 r1 = r11.getReturnType()
                yz3.k r2 = r0.f74154c
                jy3.c r4 = r2.f74210l
                ny3.m<java.lang.Object>[] r5 = yz3.C26653k.f74176W
                r6 = 10
                r6 = r5[r6]
                jy3.a r4 = (jy3.C88045a) r4
                java.lang.Object r2 = r4.mo122486c(r2, r6)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x01da
                yz3.k r2 = r0.f74154c
                jy3.c r4 = r2.f74209k
                r6 = 9
                r5 = r5[r6]
                jy3.a r4 = (jy3.C88045a) r4
                java.lang.Object r2 = r4.mo122486c(r2, r5)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x01c9
                if (r1 == 0) goto L_0x01c9
                vz3.f r2 = ty3.C26336h.f73354e
                vz3.d r2 = ty3.C26343l.C26344a.f73415e
                boolean r2 = ty3.C26336h.m33828E(r1, r2)
                if (r2 != 0) goto L_0x01da
            L_0x01c9:
                java.lang.String r2 = ": "
                r12.append(r2)
                if (r1 != 0) goto L_0x01d3
                java.lang.String r1 = "[NULL]"
                goto L_0x01d7
            L_0x01d3:
                java.lang.String r1 = r0.mo36863u(r1)
            L_0x01d7:
                r12.append(r1)
            L_0x01da:
                java.util.List r11 = r11.getTypeParameters()
                gy3.C87412m.m108593f(r11, r3)
                r0.mo53685m0(r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.C26650a.mo53691n(wy3.w, java.lang.StringBuilder):void");
        }

        /* renamed from: o */
        public final void mo53692o(C26490q0 q0Var, StringBuilder sb, String str) {
            C26653k kVar = C26649d.this.f74154c;
            int ordinal = ((C39294q) ((C88045a) kVar.f74183G).mo122486c(kVar, C26653k.f74176W[31])).ordinal();
            if (ordinal == 0) {
                C26649d.this.mo53663Q(q0Var, sb);
                sb.append(str + " for ");
                C26649d dVar = C26649d.this;
                C26504r0 u0 = q0Var.mo53467u0();
                C87412m.m108593f(u0, "descriptor.correspondingProperty");
                C26649d.m34535w(dVar, u0, sb);
            } else if (ordinal == 1) {
                mo53691n(q0Var, sb);
            }
        }
    }

    /* renamed from: yz3.d$d */
    public static final class C26651d extends C87413o implements C32226l<C25143j0, Object> {

        /* renamed from: d */
        public static final C26651d f74157d = new C26651d();

        public C26651d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C25143j0 j0Var = (C25143j0) obj;
            C87412m.m108594g(j0Var, LocaleUtil.ITALIAN);
            return j0Var instanceof C25103a1 ? ((C25103a1) j0Var).f71549e : j0Var;
        }
    }

    public C26649d(C26653k kVar) {
        C87412m.m108594g(kVar, "options");
        this.f74154c = kVar;
    }

    /* renamed from: H */
    public static /* synthetic */ void m34534H(C26649d dVar, StringBuilder sb, C26564a aVar, C26568e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        dVar.mo53654G(sb, aVar, eVar);
    }

    /* renamed from: w */
    public static final void m34535w(C26649d dVar, C26504r0 r0Var, StringBuilder sb) {
        if (!dVar.mo53649B()) {
            C26653k kVar = dVar.f74154c;
            C117370c cVar = kVar.f74205g;
            C89104m<Object>[] mVarArr = C26653k.f74176W;
            if (!((Boolean) ((C88045a) cVar).mo122486c(kVar, mVarArr[5])).booleanValue()) {
                if (dVar.mo53648A().contains(C26652i.ANNOTATIONS)) {
                    dVar.mo53654G(sb, r0Var, (C26568e) null);
                    C26508u l0 = r0Var.mo52641l0();
                    if (l0 != null) {
                        dVar.mo53654G(sb, l0, C26568e.FIELD);
                    }
                    C26508u d0 = r0Var.mo52632d0();
                    if (d0 != null) {
                        dVar.mo53654G(sb, d0, C26568e.PROPERTY_DELEGATE_FIELD);
                    }
                    C26653k kVar2 = dVar.f74154c;
                    if (((C39294q) ((C88045a) kVar2.f74183G).mo122486c(kVar2, mVarArr[31])) == C39294q.NONE) {
                        C26506s0 g = r0Var.mo52635g();
                        if (g != null) {
                            dVar.mo53654G(sb, g, C26568e.PROPERTY_GETTER);
                        }
                        C26507t0 i = r0Var.mo52640i();
                        if (i != null) {
                            dVar.mo53654G(sb, i, C26568e.PROPERTY_SETTER);
                            List<C26463h1> h = i.mo52639h();
                            C87412m.m108593f(h, "setter.valueParameters");
                            C26463h1 h1Var = (C26463h1) C110818d0.m150938j0(h);
                            C87412m.m108593f(h1Var, LocaleUtil.ITALIAN);
                            dVar.mo53654G(sb, h1Var, C26568e.SETTER_PARAMETER);
                        }
                    }
                }
                List<C26509u0> T = r0Var.mo52629T();
                C87412m.m108593f(T, "property.contextReceiverParameters");
                dVar.mo53657K(T, sb);
                C26505s visibility = r0Var.getVisibility();
                C87412m.m108593f(visibility, "property.visibility");
                dVar.mo53684l0(visibility, sb);
                dVar.mo53666T(sb, dVar.mo53648A().contains(C26652i.CONST) && r0Var.mo51327i0(), "const");
                dVar.mo53663Q(r0Var, sb);
                dVar.mo53665S(r0Var, sb);
                dVar.mo53670X(r0Var, sb);
                dVar.mo53666T(sb, dVar.mo53648A().contains(C26652i.LATEINIT) && r0Var.mo52625F0(), "lateinit");
                dVar.mo53662P(r0Var, sb);
            }
            dVar.mo53681i0(r0Var, sb, false);
            List<C26446d1> typeParameters = r0Var.getTypeParameters();
            C87412m.m108593f(typeParameters, "property.typeParameters");
            dVar.mo53680h0(typeParameters, sb, true);
            dVar.mo53673a0(r0Var, sb);
        }
        dVar.mo53667U(r0Var, sb, true);
        sb.append(": ");
        C25143j0 type = r0Var.getType();
        C87412m.m108593f(type, "property.type");
        sb.append(dVar.mo36863u(type));
        dVar.mo53674b0(r0Var, sb);
        dVar.mo53660N(r0Var, sb);
        List<C26446d1> typeParameters2 = r0Var.getTypeParameters();
        C87412m.m108593f(typeParameters2, "property.typeParameters");
        dVar.mo53685m0(typeParameters2, sb);
    }

    /* renamed from: A */
    public Set<C26652i> mo53648A() {
        C26653k kVar = this.f74154c;
        return (Set) ((C88045a) kVar.f74203e).mo122486c(kVar, C26653k.f74176W[3]);
    }

    /* renamed from: B */
    public boolean mo53649B() {
        C26653k kVar = this.f74154c;
        return ((Boolean) ((C88045a) kVar.f74204f).mo122486c(kVar, C26653k.f74176W[4])).booleanValue();
    }

    /* renamed from: C */
    public C23419r mo53650C() {
        C26653k kVar = this.f74154c;
        return (C23419r) ((C88045a) kVar.f74179C).mo122486c(kVar, C26653k.f74176W[27]);
    }

    /* renamed from: D */
    public C23393c.C23405l mo53651D() {
        C26653k kVar = this.f74154c;
        return (C23393c.C23405l) ((C88045a) kVar.f74178B).mo122486c(kVar, C26653k.f74176W[26]);
    }

    /* renamed from: E */
    public boolean mo53652E() {
        C26653k kVar = this.f74154c;
        return ((Boolean) ((C88045a) kVar.f74208j).mo122486c(kVar, C26653k.f74176W[8])).booleanValue();
    }

    /* renamed from: F */
    public final C26442c0 mo53653F(C26438b0 b0Var) {
        C26442c0 c0Var = C26442c0.OPEN;
        C26442c0 c0Var2 = C26442c0.ABSTRACT;
        C26453f fVar = C26453f.INTERFACE;
        C26442c0 c0Var3 = C26442c0.FINAL;
        if (b0Var instanceof C26447e) {
            return ((C26447e) b0Var).mo51796f() == fVar ? c0Var2 : c0Var3;
        }
        C26469k b = b0Var.mo51892b();
        C26447e eVar = b instanceof C26447e ? (C26447e) b : null;
        if (eVar == null || !(b0Var instanceof C26436b)) {
            return c0Var3;
        }
        C26436b bVar = (C26436b) b0Var;
        Collection<? extends C26436b> e = bVar.mo52633e();
        C87412m.m108593f(e, "this.overriddenDescriptors");
        return (!(e.isEmpty() ^ true) || eVar.mo51802j() == c0Var3) ? (eVar.mo51796f() != fVar || C87412m.m108589b(bVar.getVisibility(), C26491r.f73778a)) ? c0Var3 : bVar.mo51802j() == c0Var2 ? c0Var2 : c0Var : c0Var;
    }

    /* renamed from: G */
    public final void mo53654G(StringBuilder sb, C26564a aVar, C26568e eVar) {
        Set<C22826c> set;
        if (mo53648A().contains(C26652i.ANNOTATIONS)) {
            if (aVar instanceof C25143j0) {
                set = mo36876g();
            } else {
                C26653k kVar = this.f74154c;
                set = (Set) ((C88045a) kVar.f74186J).mo122486c(kVar, C26653k.f74176W[34]);
            }
            C26653k kVar2 = this.f74154c;
            C32226l lVar = (C32226l) ((C88045a) kVar2.f74188L).mo122486c(kVar2, C26653k.f74176W[36]);
            for (C26566c cVar : aVar.getAnnotations()) {
                if (!C110818d0.m150903D(set, cVar.mo51298d()) && !C87412m.m108589b(cVar.mo51298d(), C26343l.C26344a.f73429s)) {
                    if (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue()) {
                        sb.append(mo36859p(cVar, eVar));
                        C26653k kVar3 = this.f74154c;
                        if (((Boolean) ((C88045a) kVar3.f74185I).mo122486c(kVar3, C26653k.f74176W[33])).booleanValue()) {
                            sb.append(10);
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo53655I(C26464i iVar, StringBuilder sb) {
        List<C26446d1> t = iVar.mo51805t();
        C87412m.m108593f(t, "classifier.declaredTypeParameters");
        List<C26446d1> parameters = iVar.mo36110l().getParameters();
        C87412m.m108593f(parameters, "classifier.typeConstructor.parameters");
        if (mo53652E() && iVar.mo51795Y() && parameters.size() > t.size()) {
            sb.append(" /*captured type parameters: ");
            mo53679g0(sb, parameters.subList(t.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* renamed from: J */
    public final String mo53656J(C23649g<?> gVar) {
        if (gVar instanceof C23643b) {
            return C110818d0.m150921S((Iterable) ((C23643b) gVar).f67839a, ", ", "{", "}", 0, (CharSequence) null, new C23408c(this), 24, (Object) null);
        }
        if (gVar instanceof C23641a) {
            return C112550d0.m153777M(C23393c.m27911q(this, (C26566c) ((C23641a) gVar).f67839a, (C26568e) null, 2, (Object) null), "@");
        }
        if (!(gVar instanceof C23663s)) {
            return gVar.toString();
        }
        C23663s.C23664a aVar = (C23663s.C23664a) ((C23663s) gVar).f67839a;
        if (aVar instanceof C23663s.C23664a.C23665a) {
            return ((C23663s.C23664a.C23665a) aVar).f67852a + "::class";
        } else if (aVar instanceof C23663s.C23664a.C23666b) {
            C23663s.C23664a.C23666b bVar = (C23663s.C23664a.C23666b) aVar;
            String b = bVar.f67853a.f67837a.mo53387b().mo35973b();
            C87412m.m108593f(b, "classValue.classId.asSingleFqName().asString()");
            for (int i = 0; i < bVar.f67853a.f67838b; i++) {
                b = "kotlin.Array<" + b + '>';
            }
            return b + "::class";
        } else {
            throw new C13603j();
        }
    }

    /* renamed from: K */
    public final void mo53657K(List<? extends C26509u0> list, StringBuilder sb) {
        if (!list.isEmpty()) {
            sb.append("context(");
            int i = 0;
            for (C26509u0 u0Var : list) {
                int i2 = i + 1;
                mo53654G(sb, u0Var, C26568e.RECEIVER);
                C25143j0 type = u0Var.getType();
                C87412m.m108593f(type, "contextReceiver.type");
                sb.append(mo53659M(type));
                if (i == C64197v.m75536e(list)) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [wy3.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53658L(java.lang.StringBuilder r6, n04.C25143j0 r7) {
        /*
            r5 = this;
            r0 = 0
            r5.mo53654G(r6, r7, r0)
            boolean r1 = r7 instanceof n04.C25177t
            if (r1 == 0) goto L_0x000c
            r1 = r7
            n04.t r1 = (n04.C25177t) r1
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            if (r1 == 0) goto L_0x0012
            n04.s0 r1 = r1.f71624e
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            boolean r2 = n04.C25153l0.m31968a(r7)
            r3 = 0
            if (r2 == 0) goto L_0x0085
            boolean r0 = r7 instanceof p04.C25414g
            if (r0 == 0) goto L_0x0028
            r1 = r7
            p04.g r1 = (p04.C25414g) r1
            p04.i r1 = r1.f71960g
            boolean r1 = r1.f71999e
            if (r1 == 0) goto L_0x0028
            r3 = 1
        L_0x0028:
            if (r3 == 0) goto L_0x004b
            yz3.k r1 = r5.f74154c
            jy3.c r2 = r1.f74196T
            ny3.m<java.lang.Object>[] r3 = yz3.C26653k.f74176W
            r4 = 45
            r3 = r3[r4]
            jy3.a r2 = (jy3.C88045a) r2
            java.lang.Object r1 = r2.mo122486c(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x004b
            r0 = r7
            p04.g r0 = (p04.C25414g) r0
            java.lang.String r0 = r0.f71964n
            r6.append(r0)
            goto L_0x0079
        L_0x004b:
            if (r0 == 0) goto L_0x006e
            yz3.k r0 = r5.f74154c
            jy3.c r1 = r0.f74198V
            ny3.m<java.lang.Object>[] r2 = yz3.C26653k.f74176W
            r3 = 47
            r2 = r2[r3]
            jy3.a r1 = (jy3.C88045a) r1
            java.lang.Object r0 = r1.mo122486c(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x006e
            r0 = r7
            p04.g r0 = (p04.C25414g) r0
            java.lang.String r0 = r0.f71964n
            r6.append(r0)
            goto L_0x0079
        L_0x006e:
            n04.j1 r0 = r7.mo37081K0()
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L_0x0079:
            java.util.List r0 = r7.mo37079I0()
            java.lang.String r0 = r5.mo53676d0(r0)
            r6.append(r0)
            goto L_0x00d5
        L_0x0085:
            boolean r2 = r7 instanceof n04.C25103a1
            if (r2 == 0) goto L_0x0096
            r0 = r7
            n04.a1 r0 = (n04.C25103a1) r0
            o04.m r0 = r0.f71549e
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            goto L_0x00d5
        L_0x0096:
            boolean r2 = r1 instanceof n04.C25103a1
            if (r2 == 0) goto L_0x00a6
            n04.a1 r1 = (n04.C25103a1) r1
            o04.m r0 = r1.f71549e
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            goto L_0x00d5
        L_0x00a6:
            n04.j1 r1 = r7.mo37081K0()
            n04.j1 r2 = r7.mo37081K0()
            wy3.h r2 = r2.mo37094o()
            boolean r4 = r2 instanceof wy3.C26464i
            if (r4 == 0) goto L_0x00b9
            r0 = r2
            wy3.i r0 = (wy3.C26464i) r0
        L_0x00b9:
            wy3.p0 r0 = wy3.C26449e1.m34099a(r7, r0, r3)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = r5.mo53677e0(r1)
            r6.append(r0)
            java.util.List r0 = r7.mo37079I0()
            java.lang.String r0 = r5.mo53676d0(r0)
            r6.append(r0)
            goto L_0x00d5
        L_0x00d2:
            r5.mo53672Z(r6, r0)
        L_0x00d5:
            boolean r0 = r7.mo37082L0()
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = "?"
            r6.append(r0)
        L_0x00e0:
            n04.y1 r7 = r7.mo52229N0()
            boolean r7 = r7 instanceof n04.C25177t
            if (r7 == 0) goto L_0x00ed
            java.lang.String r7 = " & Any"
            r6.append(r7)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.mo53658L(java.lang.StringBuilder, n04.j0):void");
    }

    /* renamed from: M */
    public final String mo53659M(C25143j0 j0Var) {
        String u = mo36863u(j0Var);
        if (!mo53687p0(j0Var) || C25187v1.m32087g(j0Var)) {
            return u;
        }
        return '(' + u + ')';
    }

    /* renamed from: N */
    public final void mo53660N(C26466i1 i1Var, StringBuilder sb) {
        C23649g<?> R;
        C26653k kVar = this.f74154c;
        if (((Boolean) ((C88045a) kVar.f74219u).mo122486c(kVar, C26653k.f74176W[19])).booleanValue() && (R = i1Var.mo52628R()) != null) {
            sb.append(" = ");
            sb.append(mo53689y(mo53656J(R)));
        }
    }

    /* renamed from: O */
    public final String mo53661O(String str) {
        int ordinal = mo53650C().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            C26653k kVar = this.f74154c;
            if (((Boolean) ((C88045a) kVar.f74197U).mo122486c(kVar, C26653k.f74176W[46])).booleanValue()) {
                return str;
            }
            return "<b>" + str + "</b>";
        }
        throw new C13603j();
    }

    /* renamed from: P */
    public final void mo53662P(C26436b bVar, StringBuilder sb) {
        if (mo53648A().contains(C26652i.MEMBER_KIND) && mo53652E() && bVar.mo52634f() != C26436b.C26437a.DECLARATION) {
            sb.append("/*");
            sb.append(C90591a.m113489c(bVar.mo52634f().name()));
            sb.append("*/ ");
        }
    }

    /* renamed from: Q */
    public final void mo53663Q(C26438b0 b0Var, StringBuilder sb) {
        mo53666T(sb, b0Var.isExternal(), "external");
        boolean z = true;
        mo53666T(sb, mo53648A().contains(C26652i.EXPECT) && b0Var.mo51792P(), "expect");
        if (!mo53648A().contains(C26652i.ACTUAL) || !b0Var.mo51808v0()) {
            z = false;
        }
        mo53666T(sb, z, "actual");
    }

    /* renamed from: R */
    public final void mo53664R(C26442c0 c0Var, StringBuilder sb, C26442c0 c0Var2) {
        C26653k kVar = this.f74154c;
        if (((Boolean) ((C88045a) kVar.f74214p).mo122486c(kVar, C26653k.f74176W[14])).booleanValue() || c0Var != c0Var2) {
            mo53666T(sb, mo53648A().contains(C26652i.MODALITY), C90591a.m113489c(c0Var.name()));
        }
    }

    /* renamed from: S */
    public final void mo53665S(C26436b bVar, StringBuilder sb) {
        if (!C26794h.m35233u(bVar) || bVar.mo51802j() != C26442c0.FINAL) {
            C26653k kVar = this.f74154c;
            if (((C39293o) ((C88045a) kVar.f74177A).mo122486c(kVar, C26653k.f74176W[25])) != C39293o.RENDER_OVERRIDE || bVar.mo51802j() != C26442c0.OPEN || !(!bVar.mo52633e().isEmpty())) {
                C26442c0 j = bVar.mo51802j();
                C87412m.m108593f(j, "callable.modality");
                mo53664R(j, sb, mo53653F(bVar));
            }
        }
    }

    /* renamed from: T */
    public final void mo53666T(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(mo53661O(str));
            sb.append(" ");
        }
    }

    /* renamed from: U */
    public final void mo53667U(C26469k kVar, StringBuilder sb, boolean z) {
        C22830f name = kVar.getName();
        C87412m.m108593f(name, "descriptor.name");
        sb.append(mo36862t(name, z));
    }

    /* renamed from: V */
    public final void mo53668V(StringBuilder sb, C25143j0 j0Var) {
        C25198y1 N0 = j0Var.mo52229N0();
        C25101a aVar = N0 instanceof C25101a ? (C25101a) N0 : null;
        if (aVar != null) {
            C26653k kVar = this.f74154c;
            C117370c cVar = kVar.f74193Q;
            C89104m<Object>[] mVarArr = C26653k.f74176W;
            if (((Boolean) ((C88045a) cVar).mo122486c(kVar, mVarArr[41])).booleanValue()) {
                mo53669W(sb, aVar.f71533e);
                return;
            }
            mo53669W(sb, aVar.f71534f);
            C26653k kVar2 = this.f74154c;
            if (((Boolean) ((C88045a) kVar2.f74192P).mo122486c(kVar2, mVarArr[40])).booleanValue()) {
                C23419r C = mo53650C();
                C23419r rVar = C23419r.f67180e;
                if (C == rVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* = ");
                mo53669W(sb, aVar.f71533e);
                sb.append(" */");
                if (mo53650C() == rVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        mo53669W(sb, j0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53669W(java.lang.StringBuilder r18, n04.C25143j0 r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r18
            r1 = r19
            boolean r2 = r1 instanceof n04.C25104a2
            if (r2 == 0) goto L_0x001f
            boolean r2 = r17.mo36877h()
            if (r2 == 0) goto L_0x001f
            r2 = r1
            n04.a2 r2 = (n04.C25104a2) r2
            boolean r2 = r2.mo52231P0()
            if (r2 != 0) goto L_0x001f
            java.lang.String r1 = "<Not computed yet>"
            r7.append(r1)
            return
        L_0x001f:
            n04.y1 r1 = r19.mo52229N0()
            boolean r2 = r1 instanceof n04.C25109c0
            if (r2 == 0) goto L_0x0032
            n04.c0 r1 = (n04.C25109c0) r1
            java.lang.String r1 = r1.mo51875S0(r0, r0)
            r7.append(r1)
            goto L_0x029a
        L_0x0032:
            boolean r2 = r1 instanceof n04.C25176s0
            if (r2 == 0) goto L_0x029a
            r8 = r1
            n04.s0 r8 = (n04.C25176s0) r8
            n04.s0 r1 = n04.C25187v1.f71642b
            boolean r1 = gy3.C87412m.m108589b(r8, r1)
            java.lang.String r9 = "???"
            if (r1 != 0) goto L_0x0297
            r10 = 1
            r11 = 0
            if (r8 == 0) goto L_0x0055
            n04.j1 r1 = r8.mo37081K0()
            n04.s0 r2 = n04.C25187v1.f71641a
            p04.g r2 = (p04.C25414g) r2
            n04.j1 r2 = r2.f71958e
            if (r1 != r2) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005a
            goto L_0x0297
        L_0x005a:
            if (r8 != 0) goto L_0x005d
            goto L_0x006f
        L_0x005d:
            n04.j1 r1 = r8.mo37081K0()
            boolean r2 = r1 instanceof p04.C25415h
            if (r2 == 0) goto L_0x006f
            p04.h r1 = (p04.C25415h) r1
            p04.i r1 = r1.f71965a
            p04.i r2 = p04.C25416i.UNINFERRED_TYPE_VARIABLE
            if (r1 != r2) goto L_0x006f
            r1 = 1
            goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            if (r1 == 0) goto L_0x00cc
            yz3.k r1 = r0.f74154c
            jy3.c r2 = r1.f74218t
            ny3.m<java.lang.Object>[] r3 = yz3.C26653k.f74176W
            r4 = 18
            r3 = r3[r4]
            jy3.a r2 = (jy3.C88045a) r2
            java.lang.Object r1 = r2.mo122486c(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c7
            n04.j1 r1 = r8.mo37081K0()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"
            gy3.C87412m.m108592e(r1, r2)
            p04.h r1 = (p04.C25415h) r1
            java.lang.String[] r1 = r1.f71966b
            r1 = r1[r11]
            yz3.r r2 = r17.mo53650C()
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x00c2
            if (r2 != r10) goto L_0x00bc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "<font color=red><b>"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "</b></font>"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x00c2
        L_0x00bc:
            rx3.j r1 = new rx3.j
            r1.<init>()
            throw r1
        L_0x00c2:
            r7.append(r1)
            goto L_0x029a
        L_0x00c7:
            r7.append(r9)
            goto L_0x029a
        L_0x00cc:
            boolean r1 = n04.C25153l0.m31968a(r8)
            if (r1 == 0) goto L_0x00d7
            r0.mo53658L(r7, r8)
            goto L_0x029a
        L_0x00d7:
            boolean r1 = r0.mo53687p0(r8)
            if (r1 == 0) goto L_0x0293
            int r12 = r18.length()
            rx3.g r1 = r0.f74155d
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            yz3.d r1 = (yz3.C26649d) r1
            r4 = 0
            r5 = 2
            r6 = 0
            r2 = r18
            r3 = r8
            m34534H(r1, r2, r3, r4, r5, r6)
            int r1 = r18.length()
            if (r1 == r12) goto L_0x00fc
            r1 = 1
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            n04.j0 r2 = ty3.C26335g.m33820f(r8)
            java.util.List r3 = ty3.C26335g.m33818d(r8)
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r10
            java.lang.String r5 = ", "
            java.lang.String r6 = ") "
            if (r4 == 0) goto L_0x0140
            java.lang.String r4 = "context("
            r7.append(r4)
            int r4 = sx3.C64197v.m75536e(r3)
            java.util.List r4 = r3.subList(r11, r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0121:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0134
            java.lang.Object r13 = r4.next()
            n04.j0 r13 = (n04.C25143j0) r13
            r0.mo53668V(r7, r13)
            r7.append(r5)
            goto L_0x0121
        L_0x0134:
            java.lang.Object r3 = sx3.C110818d0.m150923U(r3)
            n04.j0 r3 = (n04.C25143j0) r3
            r0.mo53668V(r7, r3)
            r7.append(r6)
        L_0x0140:
            boolean r3 = ty3.C26335g.m33823i(r8)
            boolean r4 = r8.mo37082L0()
            if (r4 != 0) goto L_0x0151
            if (r1 == 0) goto L_0x014f
            if (r2 == 0) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            r13 = 0
            goto L_0x0152
        L_0x0151:
            r13 = 1
        L_0x0152:
            java.lang.String r14 = "("
            if (r13 == 0) goto L_0x0180
            if (r3 == 0) goto L_0x015e
            r1 = 40
            r7.insert(r12, r1)
            goto L_0x0180
        L_0x015e:
            if (r1 == 0) goto L_0x017d
            char r1 = z04.C91602g0.m114945m0(r18)
            z04.C66713a.m78713b(r1)
            int r1 = z04.C112550d0.m153765A(r18)
            int r1 = r1 - r10
            char r1 = r7.charAt(r1)
            r12 = 41
            if (r1 == r12) goto L_0x017d
            int r1 = z04.C112550d0.m153765A(r18)
            java.lang.String r12 = "()"
            r7.insert(r1, r12)
        L_0x017d:
            r7.append(r14)
        L_0x0180:
            java.lang.String r1 = "suspend"
            r0.mo53666T(r7, r3, r1)
            java.lang.String r1 = ")"
            if (r2 == 0) goto L_0x01c0
            boolean r3 = r0.mo53687p0(r2)
            if (r3 == 0) goto L_0x0195
            boolean r3 = r2.mo37082L0()
            if (r3 == 0) goto L_0x01ab
        L_0x0195:
            boolean r3 = ty3.C26335g.m33823i(r2)
            if (r3 != 0) goto L_0x01a8
            xy3.h r3 = r2.getAnnotations()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x01a6
            goto L_0x01a8
        L_0x01a6:
            r3 = 0
            goto L_0x01a9
        L_0x01a8:
            r3 = 1
        L_0x01a9:
            if (r3 == 0) goto L_0x01ad
        L_0x01ab:
            r3 = 1
            goto L_0x01ae
        L_0x01ad:
            r3 = 0
        L_0x01ae:
            if (r3 == 0) goto L_0x01b3
            r7.append(r14)
        L_0x01b3:
            r0.mo53668V(r7, r2)
            if (r3 == 0) goto L_0x01bb
            r7.append(r1)
        L_0x01bb:
            java.lang.String r2 = "."
            r7.append(r2)
        L_0x01c0:
            r7.append(r14)
            boolean r2 = ty3.C26335g.m33822h(r8)
            if (r2 == 0) goto L_0x01dc
            xy3.h r2 = r8.getAnnotations()
            vz3.c r3 = ty3.C26343l.C26344a.f73427q
            xy3.c r2 = r2.mo51476b(r3)
            if (r2 == 0) goto L_0x01d7
            r2 = 1
            goto L_0x01d8
        L_0x01d7:
            r2 = 0
        L_0x01d8:
            if (r2 == 0) goto L_0x01dc
            r2 = 1
            goto L_0x01dd
        L_0x01dc:
            r2 = 0
        L_0x01dd:
            if (r2 == 0) goto L_0x01ed
            java.util.List r2 = r8.mo37079I0()
            int r2 = r2.size()
            if (r2 > r10) goto L_0x01ed
            r7.append(r9)
            goto L_0x0247
        L_0x01ed:
            java.util.List r2 = ty3.C26335g.m33821g(r8)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x01f6:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0247
            int r9 = r3 + 1
            java.lang.Object r12 = r2.next()
            n04.m1 r12 = (n04.C25158m1) r12
            if (r3 <= 0) goto L_0x0209
            r7.append(r5)
        L_0x0209:
            yz3.k r3 = r0.f74154c
            jy3.c r14 = r3.f74195S
            ny3.m<java.lang.Object>[] r15 = yz3.C26653k.f74176W
            r16 = 43
            r15 = r15[r16]
            jy3.a r14 = (jy3.C88045a) r14
            java.lang.Object r3 = r14.mo122486c(r3, r15)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x022f
            n04.j0 r3 = r12.getType()
            java.lang.String r14 = "typeProjection.type"
            gy3.C87412m.m108593f(r3, r14)
            vz3.f r3 = ty3.C26335g.m33817c(r3)
            goto L_0x0230
        L_0x022f:
            r3 = 0
        L_0x0230:
            if (r3 == 0) goto L_0x023e
            java.lang.String r3 = r0.mo36862t(r3, r11)
            r7.append(r3)
            java.lang.String r3 = ": "
            r7.append(r3)
        L_0x023e:
            java.lang.String r3 = r0.mo36864v(r12)
            r7.append(r3)
            r3 = r9
            goto L_0x01f6
        L_0x0247:
            r7.append(r6)
            yz3.r r2 = r17.mo53650C()
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x025f
            if (r2 != r10) goto L_0x0259
            java.lang.String r2 = "&rarr;"
            goto L_0x0265
        L_0x0259:
            rx3.j r1 = new rx3.j
            r1.<init>()
            throw r1
        L_0x025f:
            java.lang.String r2 = "->"
            java.lang.String r2 = r0.mo53689y(r2)
        L_0x0265:
            r7.append(r2)
            java.lang.String r2 = " "
            r7.append(r2)
            ty3.C26335g.m33822h(r8)
            java.util.List r2 = r8.mo37079I0()
            java.lang.Object r2 = sx3.C110818d0.m150923U(r2)
            n04.m1 r2 = (n04.C25158m1) r2
            n04.j0 r2 = r2.getType()
            java.lang.String r3 = "arguments.last().type"
            gy3.C87412m.m108593f(r2, r3)
            r0.mo53668V(r7, r2)
            if (r13 == 0) goto L_0x028b
            r7.append(r1)
        L_0x028b:
            if (r4 == 0) goto L_0x029a
            java.lang.String r1 = "?"
            r7.append(r1)
            goto L_0x029a
        L_0x0293:
            r0.mo53658L(r7, r8)
            goto L_0x029a
        L_0x0297:
            r7.append(r9)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.mo53669W(java.lang.StringBuilder, n04.j0):void");
    }

    /* renamed from: X */
    public final void mo53670X(C26436b bVar, StringBuilder sb) {
        if (mo53648A().contains(C26652i.OVERRIDE) && (!bVar.mo52633e().isEmpty())) {
            C26653k kVar = this.f74154c;
            if (((C39293o) ((C88045a) kVar.f74177A).mo122486c(kVar, C26653k.f74176W[25])) != C39293o.RENDER_OPEN) {
                mo53666T(sb, true, "override");
                if (mo53652E()) {
                    sb.append("/*");
                    sb.append(bVar.mo52633e().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* renamed from: Y */
    public final void mo53671Y(C22826c cVar, String str, StringBuilder sb) {
        sb.append(mo53661O(str));
        C22827d i = cVar.mo35982i();
        C87412m.m108593f(i, "fqName.toUnsafe()");
        String s = mo36861s(i);
        if (s.length() > 0) {
            sb.append(" ");
            sb.append(s);
        }
    }

    /* renamed from: Z */
    public final void mo53672Z(StringBuilder sb, C26488p0 p0Var) {
        C26488p0 p0Var2 = p0Var.f73777c;
        if (p0Var2 != null) {
            mo53672Z(sb, p0Var2);
            sb.append('.');
            C22830f name = p0Var.f73775a.getName();
            C87412m.m108593f(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(mo36862t(name, false));
        } else {
            C25144j1 l = p0Var.f73775a.mo36110l();
            C87412m.m108593f(l, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(mo53677e0(l));
        }
        sb.append(mo53676d0(p0Var.f73776b));
    }

    /* renamed from: a */
    public boolean mo36870a() {
        return this.f74154c.mo36870a();
    }

    /* renamed from: a0 */
    public final void mo53673a0(C26434a aVar, StringBuilder sb) {
        C26509u0 I = aVar.mo52627I();
        if (I != null) {
            mo53654G(sb, I, C26568e.RECEIVER);
            C25143j0 type = I.getType();
            C87412m.m108593f(type, "receiver.type");
            sb.append(mo53659M(type));
            sb.append(".");
        }
    }

    /* renamed from: b */
    public void mo36871b(C23418p pVar) {
        C87412m.m108594g(pVar, "<set-?>");
        this.f74154c.mo36871b(pVar);
    }

    /* renamed from: b0 */
    public final void mo53674b0(C26434a aVar, StringBuilder sb) {
        C26509u0 I;
        C26653k kVar = this.f74154c;
        if (((Boolean) ((C88045a) kVar.f74181E).mo122486c(kVar, C26653k.f74176W[29])).booleanValue() && (I = aVar.mo52627I()) != null) {
            sb.append(" on ");
            C25143j0 type = I.getType();
            C87412m.m108593f(type, "receiver.type");
            sb.append(mo36863u(type));
        }
    }

    /* renamed from: c */
    public void mo36872c(boolean z) {
        this.f74154c.mo36872c(z);
    }

    /* renamed from: c0 */
    public final void mo53675c0(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: d */
    public void mo36873d(boolean z) {
        this.f74154c.mo36873d(z);
    }

    /* renamed from: d0 */
    public String mo53676d0(List<? extends C25158m1> list) {
        C87412m.m108594g(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo53689y("<"));
        C110818d0.m150920R(list, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C23409e(this), 60, (Object) null);
        sb.append(mo53689y(">"));
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: e */
    public void mo36874e(boolean z) {
        this.f74154c.mo36874e(z);
    }

    /* renamed from: e0 */
    public String mo53677e0(C25144j1 j1Var) {
        C87412m.m108594g(j1Var, "typeConstructor");
        C22935h o = j1Var.mo37094o();
        boolean z = true;
        if (!(o instanceof C26446d1 ? true : o instanceof C26447e)) {
            z = o instanceof C26443c1;
        }
        if (z) {
            C87412m.m108594g(o, "klass");
            return C25417j.m32699f(o) ? o.mo36110l().toString() : mo53690z().mo36856a(o, this);
        } else if (o == null) {
            return j1Var instanceof C25124h0 ? ((C25124h0) j1Var).mo52270c(C26651d.f74157d) : j1Var.toString();
        } else {
            throw new IllegalStateException(("Unexpected classifier: " + o.getClass()).toString());
        }
    }

    /* renamed from: f */
    public void mo36875f(boolean z) {
        this.f74154c.mo36875f(z);
    }

    /* renamed from: f0 */
    public final void mo53678f0(C26446d1 d1Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(mo53689y("<"));
        }
        if (mo53652E()) {
            sb.append("/*");
            sb.append(d1Var.getIndex());
            sb.append("*/ ");
        }
        mo53666T(sb, d1Var.mo53426u(), "reified");
        String str = d1Var.mo53423o().f71660d;
        boolean z2 = false;
        mo53666T(sb, str.length() > 0, str);
        mo53654G(sb, d1Var, (C26568e) null);
        mo53667U(d1Var, sb, z);
        int size = d1Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            C25143j0 next = d1Var.getUpperBounds().iterator().next();
            if (next != null) {
                if (C26336h.m33841y(next) && next.mo37082L0()) {
                    z2 = true;
                }
                if (!z2) {
                    sb.append(" : ");
                    sb.append(mo36863u(next));
                }
            } else {
                C26336h.m33836a(141);
                throw null;
            }
        } else if (z) {
            boolean z3 = true;
            for (C25143j0 next2 : d1Var.getUpperBounds()) {
                if (next2 != null) {
                    if (!(C26336h.m33841y(next2) && next2.mo37082L0())) {
                        if (z3) {
                            sb.append(" : ");
                        } else {
                            sb.append(" & ");
                        }
                        sb.append(mo36863u(next2));
                        z3 = false;
                    }
                } else {
                    C26336h.m33836a(141);
                    throw null;
                }
            }
        }
        if (z) {
            sb.append(mo53689y(">"));
        }
    }

    /* renamed from: g */
    public Set<C22826c> mo36876g() {
        return this.f74154c.mo36876g();
    }

    /* renamed from: g0 */
    public final void mo53679g0(StringBuilder sb, List<? extends C26446d1> list) {
        Iterator<? extends C26446d1> it = list.iterator();
        while (it.hasNext()) {
            mo53678f0((C26446d1) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: h */
    public boolean mo36877h() {
        return this.f74154c.mo36877h();
    }

    /* renamed from: h0 */
    public final void mo53680h0(List<? extends C26446d1> list, StringBuilder sb, boolean z) {
        C26653k kVar = this.f74154c;
        if (!((Boolean) ((C88045a) kVar.f74220v).mo122486c(kVar, C26653k.f74176W[20])).booleanValue() && (!list.isEmpty())) {
            sb.append(mo53689y("<"));
            mo53679g0(sb, list);
            sb.append(mo53689y(">"));
            if (z) {
                sb.append(" ");
            }
        }
    }

    /* renamed from: i */
    public void mo36878i(Set<C22826c> set) {
        C87412m.m108594g(set, "<set-?>");
        this.f74154c.mo36878i(set);
    }

    /* renamed from: i0 */
    public final void mo53681i0(C26466i1 i1Var, StringBuilder sb, boolean z) {
        if (z || !(i1Var instanceof C26463h1)) {
            sb.append(mo53661O(i1Var.mo52631c0() ? "var" : TPReportParams.JSON_KEY_VAL));
            sb.append(" ");
        }
    }

    /* renamed from: j */
    public void mo36879j(Set<? extends C26652i> set) {
        C87412m.m108594g(set, "<set-?>");
        this.f74154c.mo36879j(set);
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [wy3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53682j0(wy3.C26463h1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.mo53661O(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.mo53652E()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r0 = 0
            r9.mo53654G(r12, r10, r0)
            boolean r1 = r10.mo53439C0()
            java.lang.String r2 = "crossinline"
            r9.mo53666T(r12, r1, r2)
            boolean r1 = r10.mo53438B0()
            java.lang.String r2 = "noinline"
            r9.mo53666T(r12, r1, r2)
            yz3.k r1 = r9.f74154c
            jy3.c r2 = r1.f74216r
            ny3.m<java.lang.Object>[] r3 = yz3.C26653k.f74176W
            r4 = 16
            r4 = r3[r4]
            jy3.a r2 = (jy3.C88045a) r2
            java.lang.Object r1 = r2.mo122486c(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0071
            wy3.a r1 = r10.mo51892b()
            boolean r5 = r1 instanceof wy3.C26444d
            if (r5 == 0) goto L_0x0062
            r0 = r1
            wy3.d r0 = (wy3.C26444d) r0
        L_0x0062:
            if (r0 == 0) goto L_0x006c
            boolean r0 = r0.mo53445L()
            if (r0 != r4) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 == 0) goto L_0x0071
            r0 = 1
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            if (r0 == 0) goto L_0x008d
            yz3.k r1 = r9.f74154c
            jy3.c r5 = r1.f74217s
            r6 = 17
            r6 = r3[r6]
            jy3.a r5 = (jy3.C88045a) r5
            java.lang.Object r1 = r5.mo122486c(r1, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r5 = "actual"
            r9.mo53666T(r12, r1, r5)
        L_0x008d:
            n04.j0 r1 = r10.getType()
            java.lang.String r5 = "variable.type"
            gy3.C87412m.m108593f(r1, r5)
            n04.j0 r5 = r10.mo53440S()
            if (r5 != 0) goto L_0x009e
            r6 = r1
            goto L_0x009f
        L_0x009e:
            r6 = r5
        L_0x009f:
            if (r5 == 0) goto L_0x00a3
            r7 = 1
            goto L_0x00a4
        L_0x00a3:
            r7 = 0
        L_0x00a4:
            java.lang.String r8 = "vararg"
            r9.mo53666T(r12, r7, r8)
            if (r0 != 0) goto L_0x00b3
            if (r13 == 0) goto L_0x00b6
            boolean r7 = r9.mo53649B()
            if (r7 != 0) goto L_0x00b6
        L_0x00b3:
            r9.mo53681i0(r10, r12, r0)
        L_0x00b6:
            if (r11 == 0) goto L_0x00c0
            r9.mo53667U(r10, r12, r13)
            java.lang.String r11 = ": "
            r12.append(r11)
        L_0x00c0:
            java.lang.String r11 = r9.mo36863u(r6)
            r12.append(r11)
            r9.mo53660N(r10, r12)
            boolean r11 = r9.mo53652E()
            if (r11 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00e3
            java.lang.String r11 = " /*"
            r12.append(r11)
            java.lang.String r11 = r9.mo36863u(r1)
            r12.append(r11)
            java.lang.String r11 = "*/"
            r12.append(r11)
        L_0x00e3:
            yz3.k r11 = r9.f74154c
            jy3.c r13 = r11.f74223y
            r0 = 23
            r1 = r3[r0]
            jy3.a r13 = (jy3.C88045a) r13
            java.lang.Object r11 = r13.mo122486c(r11, r1)
            fy3.l r11 = (fy3.C32226l) r11
            if (r11 == 0) goto L_0x0107
            boolean r11 = r9.mo36877h()
            if (r11 == 0) goto L_0x0100
            boolean r11 = r10.mo53442m0()
            goto L_0x0104
        L_0x0100:
            boolean r11 = d04.C24442a.m30534a(r10)
        L_0x0104:
            if (r11 == 0) goto L_0x0107
            r2 = 1
        L_0x0107:
            if (r2 == 0) goto L_0x0134
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            yz3.k r13 = r9.f74154c
            jy3.c r1 = r13.f74223y
            r0 = r3[r0]
            jy3.a r1 = (jy3.C88045a) r1
            java.lang.Object r13 = r1.mo122486c(r13, r0)
            fy3.l r13 = (fy3.C32226l) r13
            gy3.C87412m.m108591d(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.mo53682j0(wy3.h1, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* renamed from: k */
    public void mo36880k(boolean z) {
        this.f74154c.mo36880k(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r8 == false) goto L_0x002a;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53683k0(java.util.Collection<? extends wy3.C26463h1> r7, boolean r8, java.lang.StringBuilder r9) {
        /*
            r6 = this;
            yz3.k r0 = r6.f74154c
            jy3.c r1 = r0.f74180D
            ny3.m<java.lang.Object>[] r2 = yz3.C26653k.f74176W
            r3 = 28
            r2 = r2[r3]
            jy3.a r1 = (jy3.C88045a) r1
            java.lang.Object r0 = r1.mo122486c(r0, r2)
            yz3.p r0 = (yz3.C23418p) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002a
            if (r0 == r1) goto L_0x0026
            r8 = 2
            if (r0 != r8) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            rx3.j r7 = new rx3.j
            r7.<init>()
            throw r7
        L_0x0026:
            if (r8 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            int r8 = r7.size()
            yz3.c$l r0 = r6.mo53651D()
            r0.mo36868c(r8, r9)
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L_0x003a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005b
            int r3 = r0 + 1
            java.lang.Object r4 = r7.next()
            wy3.h1 r4 = (wy3.C26463h1) r4
            yz3.c$l r5 = r6.mo53651D()
            r5.mo36866a(r4, r0, r8, r9)
            r6.mo53682j0(r4, r1, r9, r2)
            yz3.c$l r5 = r6.mo53651D()
            r5.mo36867b(r4, r0, r8, r9)
            r0 = r3
            goto L_0x003a
        L_0x005b:
            yz3.c$l r7 = r6.mo53651D()
            r7.mo36869d(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.mo53683k0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    /* renamed from: l */
    public void mo36881l(boolean z) {
        this.f74154c.mo36881l(z);
    }

    /* renamed from: l0 */
    public final boolean mo53684l0(C26505s sVar, StringBuilder sb) {
        if (!mo53648A().contains(C26652i.VISIBILITY)) {
            return false;
        }
        C26653k kVar = this.f74154c;
        C117370c cVar = kVar.f74212n;
        C89104m<Object>[] mVarArr = C26653k.f74176W;
        if (((Boolean) ((C88045a) cVar).mo122486c(kVar, mVarArr[12])).booleanValue()) {
            sVar = sVar.mo53465d();
        }
        C26653k kVar2 = this.f74154c;
        if (!((Boolean) ((C88045a) kVar2.f74213o).mo122486c(kVar2, mVarArr[13])).booleanValue() && C87412m.m108589b(sVar, C26491r.f73789l)) {
            return false;
        }
        sb.append(mo53661O(sVar.mo53464b()));
        sb.append(" ");
        return true;
    }

    /* renamed from: m */
    public void mo36882m(C23419r rVar) {
        C87412m.m108594g(rVar, "<set-?>");
        this.f74154c.mo36882m(rVar);
    }

    /* renamed from: m0 */
    public final void mo53685m0(List<? extends C26446d1> list, StringBuilder sb) {
        C26653k kVar = this.f74154c;
        if (!((Boolean) ((C88045a) kVar.f74220v).mo122486c(kVar, C26653k.f74176W[20])).booleanValue()) {
            ArrayList arrayList = new ArrayList(0);
            for (C26446d1 d1Var : list) {
                List<C25143j0> upperBounds = d1Var.getUpperBounds();
                C87412m.m108593f(upperBounds, "typeParameter.upperBounds");
                for (T t : C110818d0.m150907F(upperBounds, 1)) {
                    StringBuilder sb4 = new StringBuilder();
                    C22830f name = d1Var.getName();
                    C87412m.m108593f(name, "typeParameter.name");
                    sb4.append(mo36862t(name, false));
                    sb4.append(" : ");
                    C87412m.m108593f(t, LocaleUtil.ITALIAN);
                    sb4.append(mo36863u(t));
                    arrayList.add(sb4.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(mo53661O("where"));
                sb.append(" ");
                C110818d0.m150920R(arrayList, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 124, (Object) null);
            }
        }
    }

    /* renamed from: n */
    public void mo36883n(C23389b bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.f74154c.mo36883n(bVar);
    }

    /* renamed from: n0 */
    public void mo36884n0(boolean z) {
        this.f74154c.mo36884n0(z);
    }

    /* renamed from: o */
    public String mo36858o(C26469k kVar) {
        C26469k b;
        String str;
        C87412m.m108594g(kVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        kVar.mo52621h0(new C26650a(), sb);
        C26653k kVar2 = this.f74154c;
        C117370c cVar = kVar2.f74201c;
        C89104m<Object>[] mVarArr = C26653k.f74176W;
        if (((Boolean) ((C88045a) cVar).mo122486c(kVar2, mVarArr[1])).booleanValue() && !(kVar instanceof C26465i0) && !(kVar instanceof C26484n0) && (b = kVar.mo51892b()) != null && !(b instanceof C26448e0)) {
            sb.append(" ");
            int ordinal = mo53650C().ordinal();
            if (ordinal == 0) {
                str = "defined in";
            } else if (ordinal == 1) {
                str = "<i>defined in</i>";
            } else {
                throw new C13603j();
            }
            sb.append(str);
            sb.append(" ");
            C22827d g = C26794h.m35219g(b);
            C87412m.m108593f(g, "getFqName(containingDeclaration)");
            sb.append(g.mo35987e() ? "root package" : mo36861s(g));
            C26653k kVar3 = this.f74154c;
            if (((Boolean) ((C88045a) kVar3.f74202d).mo122486c(kVar3, mVarArr[2])).booleanValue() && (b instanceof C26465i0) && (kVar instanceof C26483n)) {
                ((C26483n) kVar).getSource().mo37215a().getClass();
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: o0 */
    public final String mo53686o0(String str, String str2, String str3, String str4, String str5) {
        if (!C112551y.m153819s(str, str2, false) || !C112551y.m153819s(str3, str4, false)) {
            return null;
        }
        String substring = str.substring(str2.length());
        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
        String substring2 = str3.substring(str4.length());
        C87412m.m108593f(substring2, "this as java.lang.String).substring(startIndex)");
        String str6 = str5 + substring;
        if (C87412m.m108589b(substring, substring2)) {
            return str6;
        }
        if (!mo53688x(substring, substring2)) {
            return null;
        }
        return str6 + '!';
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo36859p(xy3.C26566c r12, xy3.C26568e r13) {
        /*
            r11 = this;
            java.lang.String r0 = "annotation"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 64
            r0.append(r1)
            if (r13 == 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = r13.f73929d
            r1.append(r13)
            r13 = 58
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.append(r13)
        L_0x0027:
            n04.j0 r13 = r12.getType()
            java.lang.String r1 = r11.mo36863u(r13)
            r0.append(r1)
            yz3.k r1 = r11.f74154c
            yz3.a r1 = r1.mo53693o()
            boolean r1 = r1.f105655d
            if (r1 == 0) goto L_0x018a
            java.util.Map r1 = r12.mo51296a()
            yz3.k r2 = r11.f74154c
            jy3.c r3 = r2.f74184H
            ny3.m<java.lang.Object>[] r4 = yz3.C26653k.f74176W
            r5 = 32
            r4 = r4[r5]
            jy3.a r3 = (jy3.C88045a) r3
            java.lang.Object r2 = r3.mo122486c(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L_0x005e
            wy3.e r12 = d04.C24442a.m30537d(r12)
            goto L_0x005f
        L_0x005e:
            r12 = r3
        L_0x005f:
            r2 = 10
            if (r12 == 0) goto L_0x00b1
            wy3.d r12 = r12.mo51807v()
            if (r12 == 0) goto L_0x00b1
            java.util.List r12 = r12.mo52639h()
            if (r12 == 0) goto L_0x00b1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0078:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x008f
            java.lang.Object r4 = r12.next()
            r5 = r4
            wy3.h1 r5 = (wy3.C26463h1) r5
            boolean r5 = r5.mo53442m0()
            if (r5 == 0) goto L_0x0078
            r3.add(r4)
            goto L_0x0078
        L_0x008f:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r4 = sx3.C36907w.m41090l(r3, r2)
            r12.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x009c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00b0
            java.lang.Object r4 = r3.next()
            wy3.h1 r4 = (wy3.C26463h1) r4
            vz3.f r4 = r4.getName()
            r12.add(r4)
            goto L_0x009c
        L_0x00b0:
            r3 = r12
        L_0x00b1:
            if (r3 != 0) goto L_0x00b5
            sx3.f0 r3 = sx3.C64186f0.f181907d
        L_0x00b5:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r4 = r3.iterator()
        L_0x00be:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00dc
            java.lang.Object r5 = r4.next()
            r6 = r5
            vz3.f r6 = (vz3.C22830f) r6
            java.lang.String r7 = "it"
            gy3.C87412m.m108593f(r6, r7)
            boolean r6 = r1.containsKey(r6)
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x00be
            r12.add(r5)
            goto L_0x00be
        L_0x00dc:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = sx3.C36907w.m41090l(r12, r2)
            r4.<init>(r5)
            java.util.Iterator r12 = r12.iterator()
        L_0x00e9:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x010e
            java.lang.Object r5 = r12.next()
            vz3.f r5 = (vz3.C22830f) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.mo35995b()
            r6.append(r5)
            java.lang.String r5 = " = ..."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.add(r5)
            goto L_0x00e9
        L_0x010e:
            java.util.Set r12 = r1.entrySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = sx3.C36907w.m41090l(r12, r2)
            r1.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
        L_0x011f:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0160
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getKey()
            vz3.f r5 = (vz3.C22830f) r5
            java.lang.Object r2 = r2.getValue()
            b04.g r2 = (b04.C23649g) r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.mo35995b()
            r6.append(r7)
            java.lang.String r7 = " = "
            r6.append(r7)
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L_0x0153
            java.lang.String r2 = r11.mo53656J(r2)
            goto L_0x0155
        L_0x0153:
            java.lang.String r2 = "..."
        L_0x0155:
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r1.add(r2)
            goto L_0x011f
        L_0x0160:
            java.util.List r12 = sx3.C110818d0.m150933e0(r4, r1)
            java.util.List r1 = sx3.C110818d0.m150942n0(r12)
            yz3.k r12 = r11.f74154c
            yz3.a r12 = r12.mo53693o()
            boolean r12 = r12.f105656e
            if (r12 != 0) goto L_0x017a
            boolean r12 = r1.isEmpty()
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x018a
        L_0x017a:
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 112(0x70, float:1.57E-43)
            r10 = 0
            java.lang.String r3 = ", "
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r2 = r0
            sx3.C110818d0.m150920R(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x018a:
            boolean r12 = r11.mo53652E()
            if (r12 == 0) goto L_0x01a7
            boolean r12 = n04.C25153l0.m31968a(r13)
            if (r12 != 0) goto L_0x01a2
            n04.j1 r12 = r13.mo37081K0()
            wy3.h r12 = r12.mo37094o()
            boolean r12 = r12 instanceof wy3.C26458h0.C26459b
            if (r12 == 0) goto L_0x01a7
        L_0x01a2:
            java.lang.String r12 = " /* annotation class not found */"
            r0.append(r12)
        L_0x01a7:
            java.lang.String r12 = r0.toString()
            java.lang.String r13 = "StringBuilder().apply(builderAction).toString()"
            gy3.C87412m.m108593f(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.mo36859p(xy3.c, xy3.e):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53687p0(n04.C25143j0 r4) {
        /*
            r3 = this;
            boolean r0 = ty3.C26335g.m33822h(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r4 = r4.mo37079I0()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = 1
            goto L_0x002f
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            n04.m1 r0 = (n04.C25158m1) r0
            boolean r0 = r0.mo52296b()
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.mo53687p0(n04.j0):boolean");
    }

    /* renamed from: r */
    public String mo36860r(String str, String str2, C26336h hVar) {
        C87412m.m108594g(str, "lowerRendered");
        C87412m.m108594g(str2, "upperRendered");
        C87412m.m108594g(hVar, "builtIns");
        if (!mo53688x(str, str2)) {
            C23389b z = mo53690z();
            C26447e j = hVar.mo53318j(C26343l.C26344a.f73383C);
            if (j != null) {
                String a = z.mo36856a(j, this);
                String e0 = C112550d0.m153795e0(a, "Collection", a);
                String o0 = mo53686o0(str, e0 + "Mutable", str2, e0, e0 + '(' + "Mutable" + ')');
                if (o0 != null) {
                    return o0;
                }
                String o05 = mo53686o0(str, e0 + "MutableMap.MutableEntry", str2, e0 + "Map.Entry", e0 + "(Mutable)Map.(Mutable)Entry");
                if (o05 != null) {
                    return o05;
                }
                C23389b z2 = mo53690z();
                C26447e k = hVar.mo53319k("Array");
                C87412m.m108593f(k, "builtIns.array");
                String a2 = z2.mo36856a(k, this);
                String e05 = C112550d0.m153795e0(a2, "Array", a2);
                String o06 = mo53686o0(str, e05 + mo53689y("Array<"), str2, e05 + mo53689y("Array<out "), e05 + mo53689y("Array<(out) "));
                if (o06 != null) {
                    return o06;
                }
                return '(' + str + ".." + str2 + ')';
            }
            C26336h.m33836a(34);
            throw null;
        } else if (C112551y.m153819s(str2, "(", false)) {
            return '(' + str + ")!";
        } else {
            return str + '!';
        }
    }

    /* renamed from: s */
    public String mo36861s(C22827d dVar) {
        C87412m.m108594g(dVar, "fqName");
        List<C22830f> g = dVar.mo35990g();
        C87412m.m108593f(g, "fqName.pathSegments()");
        return mo53689y(C119026s.m167775b(g));
    }

    /* renamed from: t */
    public String mo36862t(C22830f fVar, boolean z) {
        C87412m.m108594g(fVar, "name");
        String y = mo53689y(C119026s.m167774a(fVar));
        C26653k kVar = this.f74154c;
        if (!((Boolean) ((C88045a) kVar.f74197U).mo122486c(kVar, C26653k.f74176W[46])).booleanValue() || mo53650C() != C23419r.f67180e || !z) {
            return y;
        }
        return "<b>" + y + "</b>";
    }

    /* renamed from: u */
    public String mo36863u(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "type");
        StringBuilder sb = new StringBuilder();
        C26653k kVar = this.f74154c;
        mo53668V(sb, (C25143j0) ((C32226l) ((C88045a) kVar.f74222x).mo122486c(kVar, C26653k.f74176W[22])).invoke(j0Var));
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: v */
    public String mo36864v(C25158m1 m1Var) {
        C87412m.m108594g(m1Var, "typeProjection");
        StringBuilder sb = new StringBuilder();
        C110818d0.m150920R(C26236u.m33719b(m1Var), sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C23409e(this), 60, (Object) null);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (gy3.C87412m.m108589b(r5 + '?', r6) == false) goto L_0x002e;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53688x(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "?"
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r6, r0, r1, r2)
            boolean r1 = gy3.C87412m.m108589b(r5, r1)
            if (r1 != 0) goto L_0x004a
            r1 = 2
            r3 = 0
            boolean r0 = z04.C112551y.m153808h(r6, r0, r2, r1, r3)
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = gy3.C87412m.m108589b(r0, r6)
            if (r0 != 0) goto L_0x004a
        L_0x002e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ")?"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x004b
        L_0x004a:
            r2 = 1
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yz3.C26649d.mo53688x(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: y */
    public final String mo53689y(String str) {
        return mo53650C().mo36886a(str);
    }

    /* renamed from: z */
    public C23389b mo53690z() {
        C26653k kVar = this.f74154c;
        return (C23389b) ((C88045a) kVar.f74200b).mo122486c(kVar, C26653k.f74176W[0]);
    }
}
