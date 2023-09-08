package oz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import e04.C24469d;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import j04.C24733b;
import j04.C24736c0;
import j04.C24746f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m04.C24959e;
import oz3.C21909t;
import oz3.C25356a;
import oz3.C25366c.C25367a;
import oz3.C25395q;
import qz3.C26009b;
import qz3.C26019c;
import qz3.C26023d;
import qz3.C26034g;
import qz3.C26041i;
import qz3.C26052n;
import qz3.C26065q;
import qz3.C26075s;
import sx3.C36907w;
import sx3.C64186f0;
import sy3.C22416a;
import sy3.C26237b;
import sz3.C26238b;
import sz3.C26243c;
import sz3.C26245e;
import sz3.C26247g;
import tz3.C26349a;
import uz3.C22709b;
import uz3.C22710d;
import uz3.C26380h;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26521y0;
import xz3.C26593h;
import xz3.C26607p;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: oz3.c */
public abstract class C25366c<A, S extends C25367a<? extends A>> implements C24746f<A> {

    /* renamed from: a */
    public final C25390o f71884a;

    /* renamed from: oz3.c$a */
    public static abstract class C25367a<A> {
    }

    /* renamed from: oz3.c$b */
    public enum C25368b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: oz3.c$c */
    public static final class C25369c implements C25395q.C25398c {

        /* renamed from: a */
        public final /* synthetic */ C25366c<A, S> f71889a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList<A> f71890b;

        public C25369c(C25366c<A, S> cVar, ArrayList<A> arrayList) {
            this.f71889a = cVar;
            this.f71890b = arrayList;
        }

        /* renamed from: a */
        public void mo35570a() {
        }

        /* renamed from: c */
        public C25395q.C25396a mo35571c(C26408b bVar, C26521y0 y0Var) {
            C87412m.m108594g(bVar, "classId");
            C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
            return this.f71889a.mo52558u(bVar, y0Var, this.f71890b);
        }
    }

    public C25366c(C25390o oVar) {
        C87412m.m108594g(oVar, "kotlinClassFinder");
        this.f71884a = oVar;
    }

    /* renamed from: m */
    public static /* synthetic */ List m32490m(C25366c cVar, C24736c0 c0Var, C21909t tVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return cVar.mo52552l(c0Var, tVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: o */
    public static /* synthetic */ C21909t m32491o(C25366c cVar, C26607p pVar, C26243c cVar2, C26247g gVar, C24733b bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            return cVar.mo52553n(pVar, cVar2, gVar, bVar, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: q */
    public static /* synthetic */ C21909t m32492q(C25366c cVar, C26052n nVar, C26243c cVar2, C26247g gVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return cVar.mo52554p(nVar, cVar2, gVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    /* renamed from: a */
    public List<A> mo51715a(C24736c0 c0Var, C26052n nVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        return mo52559v(c0Var, nVar, C25368b.BACKING_FIELD);
    }

    /* renamed from: c */
    public List<A> mo51716c(C26065q qVar, C26243c cVar) {
        C87412m.m108594g(qVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        Object f = qVar.mo53571f(C26349a.f73458f);
        C87412m.m108593f(f, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C26009b> iterable = (Iterable) f;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b bVar : iterable) {
            C87412m.m108593f(bVar, LocaleUtil.ITALIAN);
            arrayList.add(((C25370d) this).f71893e.mo51725a(bVar, cVar));
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<A> mo51717d(C24736c0 c0Var, C26607p pVar, C24733b bVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(pVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(bVar, "kind");
        C21909t o = m32491o(this, pVar, c0Var.f70576a, c0Var.f70577b, bVar, false, 16, (Object) null);
        if (o == null) {
            return C64186f0.f181907d;
        }
        return m32490m(this, c0Var, new C21909t(o.f61966a + '@' + 0, (C8480h) null), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: e */
    public List<A> mo51718e(C24736c0.C24737a aVar) {
        C87412m.m108594g(aVar, "container");
        C26521y0 y0Var = aVar.f70578c;
        C25402s sVar = y0Var instanceof C25402s ? (C25402s) y0Var : null;
        C25395q qVar = sVar != null ? sVar.f71941b : null;
        if (qVar != null) {
            ArrayList arrayList = new ArrayList(1);
            qVar.mo37225c(new C25369c(this, arrayList), (byte[]) null);
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.mo51713a()).toString());
    }

    /* renamed from: f */
    public List<A> mo51719f(C24736c0 c0Var, C26607p pVar, C24733b bVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(pVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(bVar, "kind");
        if (bVar == C24733b.PROPERTY) {
            return mo52559v(c0Var, (C26052n) pVar, C25368b.PROPERTY);
        }
        C21909t o = m32491o(this, pVar, c0Var.f70576a, c0Var.f70577b, bVar, false, 16, (Object) null);
        return o == null ? C64186f0.f181907d : m32490m(this, c0Var, o, false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: g */
    public List<A> mo51720g(C26075s sVar, C26243c cVar) {
        C87412m.m108594g(sVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        Object f = sVar.mo53571f(C26349a.f73460h);
        C87412m.m108593f(f, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C26009b> iterable = (Iterable) f;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b bVar : iterable) {
            C87412m.m108593f(bVar, LocaleUtil.ITALIAN);
            arrayList.add(((C25370d) this).f71893e.mo51725a(bVar, cVar));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<A> mo51721h(C24736c0 c0Var, C26034g gVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(gVar, TPReportKeys.Common.COMMON_PROTO);
        String string = c0Var.f70576a.getString(gVar.f72589g);
        String c = ((C24736c0.C24737a) c0Var).f70581f.mo53388c();
        C87412m.m108593f(c, "container as ProtoContai…Class).classId.asString()");
        String b = C22709b.m26584b(c);
        C87412m.m108594g(string, "name");
        C87412m.m108594g(b, "desc");
        return m32490m(this, c0Var, new C21909t(string + '#' + b, (C8480h) null), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r12 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r12 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        if (r12.f70583h != false) goto L_0x007e;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<A> mo51722j(j04.C24736c0 r11, xz3.C26607p r12, j04.C24733b r13, int r14, qz3.C26082u r15) {
        /*
            r10 = this;
            java.lang.String r0 = "container"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "callableProto"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "kind"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "proto"
            gy3.C87412m.m108594g(r15, r0)
            sz3.c r3 = r11.f70576a
            sz3.g r4 = r11.f70577b
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r10
            r2 = r12
            r5 = r13
            oz3.t r13 = m32491o(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 == 0) goto L_0x00c3
            boolean r15 = r12 instanceof qz3.C26041i
            r0 = 64
            r1 = 32
            r2 = 0
            r3 = 1
            if (r15 == 0) goto L_0x004b
            qz3.i r12 = (qz3.C26041i) r12
            int r12 = r12.f72623f
            r15 = r12 & 32
            if (r15 != r1) goto L_0x0039
            r15 = 1
            goto L_0x003a
        L_0x0039:
            r15 = 0
        L_0x003a:
            if (r15 != 0) goto L_0x0047
            r12 = r12 & r0
            if (r12 != r0) goto L_0x0041
            r12 = 1
            goto L_0x0042
        L_0x0041:
            r12 = 0
        L_0x0042:
            if (r12 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r12 = 0
            goto L_0x0048
        L_0x0047:
            r12 = 1
        L_0x0048:
            if (r12 == 0) goto L_0x007f
            goto L_0x007e
        L_0x004b:
            boolean r15 = r12 instanceof qz3.C26052n
            if (r15 == 0) goto L_0x006b
            qz3.n r12 = (qz3.C26052n) r12
            int r12 = r12.f72695f
            r15 = r12 & 32
            if (r15 != r1) goto L_0x0059
            r15 = 1
            goto L_0x005a
        L_0x0059:
            r15 = 0
        L_0x005a:
            if (r15 != 0) goto L_0x0067
            r12 = r12 & r0
            if (r12 != r0) goto L_0x0061
            r12 = 1
            goto L_0x0062
        L_0x0061:
            r12 = 0
        L_0x0062:
            if (r12 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r12 = 0
            goto L_0x0068
        L_0x0067:
            r12 = 1
        L_0x0068:
            if (r12 == 0) goto L_0x007f
            goto L_0x007e
        L_0x006b:
            boolean r15 = r12 instanceof qz3.C26023d
            if (r15 == 0) goto L_0x00a8
            r12 = r11
            j04.c0$a r12 = (j04.C24736c0.C24737a) r12
            qz3.c$c r15 = r12.f70582g
            qz3.c$c r1 = qz3.C26019c.C26022c.ENUM_CLASS
            if (r15 != r1) goto L_0x007a
            r2 = 2
            goto L_0x007f
        L_0x007a:
            boolean r12 = r12.f70583h
            if (r12 == 0) goto L_0x007f
        L_0x007e:
            r2 = 1
        L_0x007f:
            int r14 = r14 + r2
            oz3.t r3 = new oz3.t
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.f61966a
            r12.append(r13)
            r12.append(r0)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r13 = 0
            r3.<init>(r12, r13)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            r1 = r10
            r2 = r11
            java.util.List r11 = m32490m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L_0x00a8:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unsupported message: "
            r13.append(r14)
            java.lang.Class r12 = r12.getClass()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c3:
            sx3.f0 r11 = sx3.C64186f0.f181907d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.C25366c.mo51722j(j04.c0, xz3.p, j04.b, int, qz3.u):java.util.List");
    }

    /* renamed from: k */
    public List<A> mo51723k(C24736c0 c0Var, C26052n nVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        return mo52559v(c0Var, nVar, C25368b.DELEGATE_FIELD);
    }

    /* renamed from: l */
    public final List<A> mo52552l(C24736c0 c0Var, C21909t tVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        C25395q r = mo52555r(c0Var, z, z2, bool, z3);
        if (r == null) {
            if (c0Var instanceof C24736c0.C24737a) {
                C26521y0 y0Var = ((C24736c0.C24737a) c0Var).f70578c;
                C25402s sVar = y0Var instanceof C25402s ? (C25402s) y0Var : null;
                if (sVar != null) {
                    r = sVar.f71941b;
                }
            }
            r = null;
        }
        if (r == null) {
            return C64186f0.f181907d;
        }
        List<A> list = ((C25356a.C25357a) ((C24959e.C24972m) ((C25356a) this).f71857b).invoke(r)).f71858a.get(tVar);
        return list == null ? C64186f0.f181907d : list;
    }

    /* renamed from: n */
    public final C21909t mo52553n(C26607p pVar, C26243c cVar, C26247g gVar, C24733b bVar, boolean z) {
        C21909t tVar;
        C87412m.m108594g(pVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(gVar, "typeTable");
        C87412m.m108594g(bVar, "kind");
        if (pVar instanceof C26023d) {
            C21909t.C21910a aVar = C21909t.f61965b;
            C22710d.C22712b a = C26380h.f73581a.mo53363a((C26023d) pVar, cVar, gVar);
            if (a == null) {
                return null;
            }
            return aVar.mo34952a(a);
        } else if (pVar instanceof C26041i) {
            C21909t.C21910a aVar2 = C21909t.f61965b;
            C22710d.C22712b c = C26380h.f73581a.mo53365c((C26041i) pVar, cVar, gVar);
            if (c == null) {
                return null;
            }
            return aVar2.mo34952a(c);
        } else if (!(pVar instanceof C26052n)) {
            return null;
        } else {
            C26593h.C26600f<C26052n, C26349a.C26357d> fVar = C26349a.f73456d;
            C87412m.m108593f(fVar, "propertySignature");
            C26349a.C26357d dVar = (C26349a.C26357d) C26245e.m33733a((C26593h.C26597d) pVar, fVar);
            if (dVar == null) {
                return null;
            }
            int ordinal = bVar.ordinal();
            boolean z2 = true;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if ((dVar.f73492e & 4) != 4) {
                        z2 = false;
                    }
                    if (!z2) {
                        return null;
                    }
                    C26349a.C26354c cVar2 = dVar.f73495h;
                    C87412m.m108593f(cVar2, "signature.getter");
                    String string = cVar.getString(cVar2.f73482f);
                    String string2 = cVar.getString(cVar2.f73483g);
                    C87412m.m108594g(string, "name");
                    C87412m.m108594g(string2, "desc");
                    tVar = new C21909t(string + string2, (C8480h) null);
                } else if (ordinal != 3) {
                    return null;
                } else {
                    if ((dVar.f73492e & 8) != 8) {
                        z2 = false;
                    }
                    if (!z2) {
                        return null;
                    }
                    C26349a.C26354c cVar3 = dVar.f73496i;
                    C87412m.m108593f(cVar3, "signature.setter");
                    String string3 = cVar.getString(cVar3.f73482f);
                    String string4 = cVar.getString(cVar3.f73483g);
                    C87412m.m108594g(string3, "name");
                    C87412m.m108594g(string4, "desc");
                    tVar = new C21909t(string3 + string4, (C8480h) null);
                }
                return tVar;
            }
            return mo52554p((C26052n) pVar, cVar, gVar, true, true, z);
        }
    }

    /* renamed from: p */
    public final C21909t mo52554p(C26052n nVar, C26243c cVar, C26247g gVar, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(gVar, "typeTable");
        C26593h.C26600f<C26052n, C26349a.C26357d> fVar = C26349a.f73456d;
        C87412m.m108593f(fVar, "propertySignature");
        C26349a.C26357d dVar = (C26349a.C26357d) C26245e.m33733a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (z) {
            C22710d.C22711a b = C26380h.f73581a.mo53364b(nVar, cVar, gVar, z3);
            if (b == null) {
                return null;
            }
            return C21909t.f61965b.mo34952a(b);
        }
        if (z2) {
            if ((dVar.f73492e & 2) == 2) {
                C26349a.C26354c cVar2 = dVar.f73494g;
                C87412m.m108593f(cVar2, "signature.syntheticMethod");
                String string = cVar.getString(cVar2.f73482f);
                String string2 = cVar.getString(cVar2.f73483g);
                C87412m.m108594g(string, "name");
                C87412m.m108594g(string2, "desc");
                return new C21909t(string + string2, (C8480h) null);
            }
        }
        return null;
    }

    /* renamed from: r */
    public final C25395q mo52555r(C24736c0 c0Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        C24736c0.C24737a aVar;
        C26019c.C26022c cVar;
        C26019c.C26022c cVar2 = C26019c.C26022c.INTERFACE;
        C87412m.m108594g(c0Var, "container");
        if (z) {
            if (bool != null) {
                if (c0Var instanceof C24736c0.C24737a) {
                    C24736c0.C24737a aVar2 = (C24736c0.C24737a) c0Var;
                    if (aVar2.f70582g == cVar2) {
                        return C25394p.m32569a(this.f71884a, aVar2.f70581f.mo53389d(C22830f.m26794f("DefaultImpls")));
                    }
                }
                if (bool.booleanValue() && (c0Var instanceof C24736c0.C24738b)) {
                    C26521y0 y0Var = c0Var.f70578c;
                    C25383k kVar = y0Var instanceof C25383k ? (C25383k) y0Var : null;
                    C24469d dVar = kVar != null ? kVar.f71925c : null;
                    if (dVar != null) {
                        C25390o oVar = this.f71884a;
                        String e = dVar.mo51171e();
                        C87412m.m108593f(e, "facadeClassName.internalName");
                        return C25394p.m32569a(oVar, C26408b.m33992l(new C22826c(C112551y.m153815o(e, XVFSFile.SEPARATOR_CHAR, '.', false, 4, (Object) null))));
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + c0Var + ')').toString());
            }
        }
        if (z2 && (c0Var instanceof C24736c0.C24737a)) {
            C24736c0.C24737a aVar3 = (C24736c0.C24737a) c0Var;
            if (aVar3.f70582g == C26019c.C26022c.COMPANION_OBJECT && (aVar = aVar3.f70580e) != null && ((cVar = aVar.f70582g) == C26019c.C26022c.CLASS || cVar == C26019c.C26022c.ENUM_CLASS || (z3 && (cVar == cVar2 || cVar == C26019c.C26022c.ANNOTATION_CLASS)))) {
                C26521y0 y0Var2 = aVar.f70578c;
                C25402s sVar = y0Var2 instanceof C25402s ? (C25402s) y0Var2 : null;
                if (sVar != null) {
                    return sVar.f71941b;
                }
                return null;
            }
        }
        if (c0Var instanceof C24736c0.C24738b) {
            C26521y0 y0Var3 = c0Var.f70578c;
            if (y0Var3 instanceof C25383k) {
                C87412m.m108592e(y0Var3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                C25383k kVar2 = (C25383k) y0Var3;
                C25395q qVar = kVar2.f71926d;
                return qVar == null ? C25394p.m32569a(this.f71884a, kVar2.mo52578d()) : qVar;
            }
        }
        return null;
    }

    /* renamed from: s */
    public final boolean mo52556s(C26408b bVar) {
        C25395q a;
        C87412m.m108594g(bVar, "classId");
        if (bVar.mo53391g() == null || !C87412m.m108589b(bVar.mo53395j().mo35995b(), "Container") || (a = C25394p.m32569a(this.f71884a, bVar)) == null) {
            return false;
        }
        Set<C26408b> set = C26237b.f73136a;
        C8477a0 a0Var = new C8477a0();
        a.mo37225c(new C22416a(a0Var), (byte[]) null);
        return a0Var.f27482d;
    }

    /* renamed from: t */
    public abstract C25395q.C25396a mo52557t(C26408b bVar, C26521y0 y0Var, List<A> list);

    /* renamed from: u */
    public final C25395q.C25396a mo52558u(C26408b bVar, C26521y0 y0Var, List<A> list) {
        C87412m.m108594g(bVar, "annotationClassId");
        C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(list, "result");
        Set<C26408b> set = C26237b.f73136a;
        if (C26237b.f73136a.contains(bVar)) {
            return null;
        }
        return mo52557t(bVar, y0Var, list);
    }

    /* renamed from: v */
    public final List<A> mo52559v(C24736c0 c0Var, C26052n nVar, C25368b bVar) {
        C24736c0 c0Var2 = c0Var;
        C25368b bVar2 = bVar;
        Boolean d = C26238b.f73138A.mo53140c(nVar.f72696g);
        C87412m.m108593f(d, "IS_CONST.get(proto.flags)");
        boolean booleanValue = d.booleanValue();
        boolean d2 = C26380h.m33951d(nVar);
        if (bVar2 == C25368b.PROPERTY) {
            C21909t q = m32492q(this, nVar, c0Var2.f70576a, c0Var2.f70577b, false, true, false, 40, (Object) null);
            if (q == null) {
                return C64186f0.f181907d;
            }
            return m32490m(this, c0Var, q, true, false, Boolean.valueOf(booleanValue), d2, 8, (Object) null);
        }
        C21909t q2 = m32492q(this, nVar, c0Var2.f70576a, c0Var2.f70577b, true, false, false, 48, (Object) null);
        if (q2 == null) {
            return C64186f0.f181907d;
        }
        boolean z = false;
        boolean w = C112550d0.m153803w(q2.f61966a, "$delegate", false, 2, (Object) null);
        if (bVar2 == C25368b.DELEGATE_FIELD) {
            z = true;
        }
        if (w != z) {
            return C64186f0.f181907d;
        }
        return mo52552l(c0Var, q2, true, true, Boolean.valueOf(booleanValue), d2);
    }
}
