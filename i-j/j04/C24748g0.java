package j04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l04.C24921o;
import n04.C25120f1;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25176s0;
import ny3.C109824f;
import qz3.C26065q;
import qz3.C26075s;
import r04.C26094c;
import sx3.C110818d0;
import sx3.C36903g0;
import sx3.C36907w;
import sx3.C64186f0;
import sz3.C26246f;
import sz3.C26247g;
import ty3.C26335g;
import ty3.C26336h;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26469k;
import wy3.C26510v;
import xy3.C26566c;
import xy3.C26571h;
import y04.C112349m;
import y04.C112354s;

/* renamed from: j04.g0 */
public final class C24748g0 {

    /* renamed from: a */
    public final C24766m f70599a;

    /* renamed from: b */
    public final C24748g0 f70600b;

    /* renamed from: c */
    public final String f70601c;

    /* renamed from: d */
    public final String f70602d;

    /* renamed from: e */
    public final C32226l<Integer, C22935h> f70603e;

    /* renamed from: f */
    public final C32226l<Integer, C22935h> f70604f;

    /* renamed from: g */
    public final Map<Integer, C26446d1> f70605g;

    /* renamed from: j04.g0$a */
    public static final class C24749a extends C87413o implements C32226l<Integer, C22935h> {

        /* renamed from: d */
        public final /* synthetic */ C24748g0 f70606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24749a(C24748g0 g0Var) {
            super(1);
            this.f70606d = g0Var;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C24748g0 g0Var = this.f70606d;
            C26408b a = C24732a0.m31109a(g0Var.f70599a.f70644b, intValue);
            return a.f73646c ? g0Var.f70599a.f70643a.mo51743b(a) : C26510v.m34217b(g0Var.f70599a.f70643a.f70623b, a);
        }
    }

    /* renamed from: j04.g0$b */
    public static final class C24750b extends C87413o implements C32224a<List<? extends C26566c>> {

        /* renamed from: d */
        public final /* synthetic */ C24748g0 f70607d;

        /* renamed from: e */
        public final /* synthetic */ C26065q f70608e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24750b(C24748g0 g0Var, C26065q qVar) {
            super(0);
            this.f70607d = g0Var;
            this.f70608e = qVar;
        }

        public Object invoke() {
            C24766m mVar = this.f70607d.f70599a;
            return mVar.f70643a.f70626e.mo51716c(this.f70608e, mVar.f70644b);
        }
    }

    /* renamed from: j04.g0$c */
    public static final class C24751c extends C87413o implements C32226l<Integer, C22935h> {

        /* renamed from: d */
        public final /* synthetic */ C24748g0 f70609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24751c(C24748g0 g0Var) {
            super(1);
            this.f70609d = g0Var;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C24748g0 g0Var = this.f70609d;
            C26408b a = C24732a0.m31109a(g0Var.f70599a.f70644b, intValue);
            if (a.f73646c) {
                return null;
            }
            C26448e0 e0Var = g0Var.f70599a.f70643a.f70623b;
            C87412m.m108594g(e0Var, "<this>");
            C22935h b = C26510v.m34217b(e0Var, a);
            if (b instanceof C26443c1) {
                return (C26443c1) b;
            }
            return null;
        }
    }

    /* renamed from: j04.g0$d */
    public /* synthetic */ class C24752d extends C24563k implements C32226l<C26408b, C26408b> {

        /* renamed from: d */
        public static final C24752d f70610d = new C24752d();

        public C24752d() {
            super(1);
        }

        public final String getName() {
            return "getOuterClassId";
        }

        public final C109824f getOwner() {
            return C24560g0.m30725a(C26408b.class);
        }

        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        public Object invoke(Object obj) {
            C26408b bVar = (C26408b) obj;
            C87412m.m108594g(bVar, "p0");
            return bVar.mo53391g();
        }
    }

    /* renamed from: j04.g0$e */
    public static final class C24753e extends C87413o implements C32226l<C26065q, C26065q> {

        /* renamed from: d */
        public final /* synthetic */ C24748g0 f70611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24753e(C24748g0 g0Var) {
            super(1);
            this.f70611d = g0Var;
        }

        public Object invoke(Object obj) {
            C26065q qVar = (C26065q) obj;
            C87412m.m108594g(qVar, LocaleUtil.ITALIAN);
            return C26246f.m33735a(qVar, this.f70611d.f70599a.f70646d);
        }
    }

    /* renamed from: j04.g0$f */
    public static final class C24754f extends C87413o implements C32226l<C26065q, Integer> {

        /* renamed from: d */
        public static final C24754f f70612d = new C24754f();

        public C24754f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26065q qVar = (C26065q) obj;
            C87412m.m108594g(qVar, LocaleUtil.ITALIAN);
            return Integer.valueOf(qVar.f72766g.size());
        }
    }

    public C24748g0(C24766m mVar, C24748g0 g0Var, List<C26075s> list, String str, String str2) {
        Map<Integer, C26446d1> map;
        C87412m.m108594g(mVar, "c");
        C87412m.m108594g(list, "typeParameterProtos");
        C87412m.m108594g(str, "debugName");
        C87412m.m108594g(str2, "containerPresentableName");
        this.f70599a = mVar;
        this.f70600b = g0Var;
        this.f70601c = str;
        this.f70602d = str2;
        this.f70603e = mVar.f70643a.f70622a.mo52004e(new C24749a(this));
        this.f70604f = mVar.f70643a.f70622a.mo52004e(new C24751c(this));
        if (list.isEmpty()) {
            map = C36903g0.f97931d;
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (C26075s next : list) {
                map.put(Integer.valueOf(next.f72845g), new C24921o(this.f70599a, next, i));
                i++;
            }
        }
        this.f70605g = map;
    }

    /* renamed from: e */
    public static final List<C26065q.C26067b> m31143e(C26065q qVar, C24748g0 g0Var) {
        List<C26065q.C26067b> list = qVar.f72766g;
        C87412m.m108593f(list, "argumentList");
        C26065q a = C26246f.m33735a(qVar, g0Var.f70599a.f70646d);
        Iterable e = a != null ? m31143e(a, g0Var) : null;
        if (e == null) {
            e = C64186f0.f181907d;
        }
        return C110818d0.m150933e0(list, e);
    }

    /* renamed from: h */
    public static final C26447e m31144h(C24748g0 g0Var, C26065q qVar, int i) {
        C26408b a = C24732a0.m31109a(g0Var.f70599a.f70644b, i);
        List t = C112354s.m153297t(C112354s.m153290m(C112349m.m153281d(qVar, new C24753e(g0Var)), C24754f.f70612d));
        int f = C112354s.m153283f(C112349m.m153281d(a, C24752d.f70610d));
        while (t.size() < f) {
            t.add(0);
        }
        return g0Var.f70599a.f70643a.f70633l.mo53433a(a, t);
    }

    /* renamed from: a */
    public final C25176s0 mo51731a(C25143j0 j0Var, C25143j0 j0Var2) {
        C26336h e = C26094c.m33425e(j0Var);
        C26571h annotations = j0Var.getAnnotations();
        C25143j0 f = C26335g.m33820f(j0Var);
        List<C25143j0> d = C26335g.m33818d(j0Var);
        List<T> G = C110818d0.m150909G(C26335g.m33821g(j0Var), 1);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(G, 10));
        for (T type : G) {
            arrayList.add(type.getType());
        }
        return C26335g.m33816b(e, annotations, f, d, arrayList, (List<C22830f>) null, j0Var2, true).mo37084O0(j0Var.mo37082L0());
    }

    /* renamed from: b */
    public final List<C26446d1> mo51732b() {
        return C110818d0.m150953y0(this.f70605g.values());
    }

    /* renamed from: c */
    public final C26446d1 mo51733c(int i) {
        C26446d1 d1Var = this.f70605g.get(Integer.valueOf(i));
        if (d1Var != null) {
            return d1Var;
        }
        C24748g0 g0Var = this.f70600b;
        if (g0Var != null) {
            return g0Var.mo51733c(i);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: n04.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: p04.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v95, resolved type: n04.s0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: n04.s0} */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0346, code lost:
        if (gy3.C87412m.m108589b(r7, j04.C24756h0.f70613a) == false) goto L_0x0382;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n04.C25176s0 mo51734d(qz3.C26065q r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "proto"
            gy3.C87412m.m108594g(r1, r2)
            boolean r2 = r17.mo52919l()
            r3 = 128(0x80, float:1.794E-43)
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x002c
            int r2 = r1.f72771o
            j04.m r7 = r0.f70599a
            sz3.c r7 = r7.f70644b
            vz3.b r2 = j04.C24732a0.m31109a(r7, r2)
            boolean r2 = r2.f73646c
            if (r2 == 0) goto L_0x004f
            j04.m r2 = r0.f70599a
            j04.k r2 = r2.f70643a
            j04.v r2 = r2.f70628g
            n04.s0 r2 = r2.mo51755a()
            goto L_0x0050
        L_0x002c:
            int r2 = r1.f72765f
            r2 = r2 & r3
            if (r2 != r3) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x004f
            int r2 = r1.f72774r
            j04.m r7 = r0.f70599a
            sz3.c r7 = r7.f70644b
            vz3.b r2 = j04.C24732a0.m31109a(r7, r2)
            boolean r2 = r2.f73646c
            if (r2 == 0) goto L_0x004f
            j04.m r2 = r0.f70599a
            j04.k r2 = r2.f70643a
            j04.v r2 = r2.f70628g
            n04.s0 r2 = r2.mo51755a()
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x0053
            return r2
        L_0x0053:
            boolean r2 = r17.mo52919l()
            r7 = 2
            if (r2 == 0) goto L_0x0072
            fy3.l<java.lang.Integer, wy3.h> r2 = r0.f70603e
            int r3 = r1.f72771o
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.invoke(r3)
            wy3.h r2 = (wy3.C22935h) r2
            if (r2 != 0) goto L_0x0115
            int r2 = r1.f72771o
            wy3.e r2 = m31144h(r0, r1, r2)
            goto L_0x0115
        L_0x0072:
            int r2 = r1.f72765f
            r8 = 32
            r9 = r2 & 32
            if (r9 != r8) goto L_0x007c
            r8 = 1
            goto L_0x007d
        L_0x007c:
            r8 = 0
        L_0x007d:
            if (r8 == 0) goto L_0x009f
            int r2 = r1.f72772p
            wy3.d1 r2 = r0.mo51733c(r2)
            if (r2 != 0) goto L_0x0115
            p04.j r2 = p04.C25417j.f72000a
            p04.i r3 = p04.C25416i.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER
            java.lang.String[] r8 = new java.lang.String[r7]
            int r9 = r1.f72772p
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8[r6] = r9
            java.lang.String r9 = r0.f70602d
            r8[r5] = r9
            p04.h r2 = r2.mo52647d(r3, r8)
            goto L_0x011e
        L_0x009f:
            r8 = 64
            r9 = r2 & 64
            if (r9 != r8) goto L_0x00a7
            r8 = 1
            goto L_0x00a8
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            if (r8 == 0) goto L_0x00f7
            j04.m r2 = r0.f70599a
            sz3.c r2 = r2.f70644b
            int r3 = r1.f72773q
            java.lang.String r2 = r2.getString(r3)
            java.util.List r3 = r16.mo51732b()
            java.util.Iterator r3 = r3.iterator()
        L_0x00bc:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00d8
            java.lang.Object r8 = r3.next()
            r9 = r8
            wy3.d1 r9 = (wy3.C26446d1) r9
            vz3.f r9 = r9.getName()
            java.lang.String r9 = r9.mo35995b()
            boolean r9 = gy3.C87412m.m108589b(r9, r2)
            if (r9 == 0) goto L_0x00bc
            goto L_0x00d9
        L_0x00d8:
            r8 = 0
        L_0x00d9:
            r3 = r8
            wy3.d1 r3 = (wy3.C26446d1) r3
            if (r3 != 0) goto L_0x00f5
            p04.j r3 = p04.C25417j.f72000a
            p04.i r8 = p04.C25416i.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME
            java.lang.String[] r9 = new java.lang.String[r7]
            r9[r6] = r2
            j04.m r2 = r0.f70599a
            wy3.k r2 = r2.f70645c
            java.lang.String r2 = r2.toString()
            r9[r5] = r2
            p04.h r2 = r3.mo52647d(r8, r9)
            goto L_0x011e
        L_0x00f5:
            r2 = r3
            goto L_0x0115
        L_0x00f7:
            r2 = r2 & r3
            if (r2 != r3) goto L_0x00fc
            r2 = 1
            goto L_0x00fd
        L_0x00fc:
            r2 = 0
        L_0x00fd:
            if (r2 == 0) goto L_0x0120
            fy3.l<java.lang.Integer, wy3.h> r2 = r0.f70604f
            int r3 = r1.f72774r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.invoke(r3)
            wy3.h r2 = (wy3.C22935h) r2
            if (r2 != 0) goto L_0x0115
            int r2 = r1.f72774r
            wy3.e r2 = m31144h(r0, r1, r2)
        L_0x0115:
            n04.j1 r2 = r2.mo36110l()
            java.lang.String r3 = "classifier.typeConstructor"
            gy3.C87412m.m108593f(r2, r3)
        L_0x011e:
            r9 = r2
            goto L_0x012b
        L_0x0120:
            p04.j r2 = p04.C25417j.f72000a
            p04.i r3 = p04.C25416i.UNKNOWN_TYPE
            java.lang.String[] r8 = new java.lang.String[r6]
            p04.h r2 = r2.mo52647d(r3, r8)
            goto L_0x011e
        L_0x012b:
            wy3.h r2 = r9.mo37094o()
            boolean r2 = p04.C25417j.m32699f(r2)
            if (r2 == 0) goto L_0x014e
            p04.j r1 = p04.C25417j.f72000a
            p04.i r2 = p04.C25416i.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r4 = r9.toString()
            r3[r6] = r4
            sx3.f0 r4 = sx3.C64186f0.f181907d
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            p04.g r1 = r1.mo52648e(r2, r4, r9, r3)
            return r1
        L_0x014e:
            l04.a r2 = new l04.a
            j04.m r3 = r0.f70599a
            j04.k r3 = r3.f70643a
            m04.n r3 = r3.f70622a
            j04.g0$b r8 = new j04.g0$b
            r8.<init>(r0, r1)
            r2.<init>(r3, r8)
            j04.m r3 = r0.f70599a
            j04.k r8 = r3.f70643a
            java.util.List<n04.f1> r8 = r8.f70640s
            wy3.k r3 = r3.f70645c
            n04.g1 r8 = r0.mo51735f(r8, r2, r9, r3)
            java.util.List r3 = m31143e(r1, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = sx3.C36907w.m41090l(r3, r11)
            r10.<init>(r11)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
            r11 = 0
        L_0x0180:
            boolean r12 = r3.hasNext()
            java.lang.String r15 = "typeTable"
            if (r12 == 0) goto L_0x024b
            java.lang.Object r12 = r3.next()
            int r13 = r11 + 1
            if (r11 < 0) goto L_0x0246
            qz3.q$b r12 = (qz3.C26065q.C26067b) r12
            java.util.List r14 = r9.getParameters()
            java.lang.String r4 = "constructor.parameters"
            gy3.C87412m.m108593f(r14, r4)
            java.lang.Object r4 = sx3.C110818d0.m150917O(r14, r11)
            wy3.d1 r4 = (wy3.C26446d1) r4
            qz3.q$b$c r11 = r12.f72786f
            qz3.q$b$c r14 = qz3.C26065q.C26067b.C26070c.STAR
            if (r11 != r14) goto L_0x01c2
            if (r4 != 0) goto L_0x01ba
            n04.x0 r4 = new n04.x0
            j04.m r11 = r0.f70599a
            j04.k r11 = r11.f70643a
            wy3.e0 r11 = r11.f70623b
            ty3.h r11 = r11.mo52623m()
            r4.<init>(r11)
            goto L_0x0240
        L_0x01ba:
            n04.y0 r11 = new n04.y0
            r11.<init>(r4)
            r4 = r11
            goto L_0x0240
        L_0x01c2:
            java.lang.String r4 = "typeArgumentProto.projection"
            gy3.C87412m.m108593f(r11, r4)
            int r4 = r11.ordinal()
            if (r4 == 0) goto L_0x01f7
            if (r4 == r5) goto L_0x01f4
            if (r4 == r7) goto L_0x01f1
            r1 = 3
            if (r4 == r1) goto L_0x01da
            rx3.j r1 = new rx3.j
            r1.<init>()
            throw r1
        L_0x01da:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Only IN, OUT and INV are supported. Actual argument: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01f1:
            n04.z1 r4 = n04.C25202z1.INVARIANT
            goto L_0x01f9
        L_0x01f4:
            n04.z1 r4 = n04.C25202z1.OUT_VARIANCE
            goto L_0x01f9
        L_0x01f7:
            n04.z1 r4 = n04.C25202z1.IN_VARIANCE
        L_0x01f9:
            j04.m r11 = r0.f70599a
            sz3.g r11 = r11.f70646d
            gy3.C87412m.m108594g(r11, r15)
            int r14 = r12.f72785e
            r15 = r14 & 2
            if (r15 != r7) goto L_0x0208
            r15 = 1
            goto L_0x0209
        L_0x0208:
            r15 = 0
        L_0x0209:
            if (r15 == 0) goto L_0x020e
            qz3.q r11 = r12.f72787g
            goto L_0x0220
        L_0x020e:
            r15 = 4
            r14 = r14 & 4
            if (r14 != r15) goto L_0x0215
            r14 = 1
            goto L_0x0216
        L_0x0215:
            r14 = 0
        L_0x0216:
            if (r14 == 0) goto L_0x021f
            int r14 = r12.f72788h
            qz3.q r11 = r11.mo53147a(r14)
            goto L_0x0220
        L_0x021f:
            r11 = 0
        L_0x0220:
            if (r11 != 0) goto L_0x0236
            n04.o1 r4 = new n04.o1
            p04.i r11 = p04.C25416i.NO_RECORDED_TYPE
            java.lang.String[] r14 = new java.lang.String[r5]
            java.lang.String r12 = r12.toString()
            r14[r6] = r12
            p04.g r11 = p04.C25417j.m32698c(r11, r14)
            r4.<init>(r11)
            goto L_0x0240
        L_0x0236:
            n04.o1 r12 = new n04.o1
            n04.j0 r11 = r0.mo51736g(r11)
            r12.<init>(r4, r11)
            r4 = r12
        L_0x0240:
            r10.add(r4)
            r11 = r13
            goto L_0x0180
        L_0x0246:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x024b:
            java.util.List r10 = sx3.C110818d0.m150953y0(r10)
            wy3.h r3 = r9.mo37094o()
            if (r18 == 0) goto L_0x02a2
            boolean r4 = r3 instanceof wy3.C26443c1
            if (r4 == 0) goto L_0x02a2
            n04.k0 r4 = n04.C25146k0.f71590a
            wy3.c1 r3 = (wy3.C26443c1) r3
            n04.s0 r3 = n04.C25146k0.m31956b(r3, r10)
            j04.m r4 = r0.f70599a
            j04.k r4 = r4.f70643a
            java.util.List<n04.f1> r4 = r4.f70640s
            xy3.h r7 = r3.getAnnotations()
            java.util.List r2 = sx3.C110818d0.m150931c0(r2, r7)
            r7 = r2
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x027b
            xy3.h r2 = xy3.C26571h.C26572a.f73937a
            goto L_0x0281
        L_0x027b:
            xy3.i r7 = new xy3.i
            r7.<init>(r2)
            r2 = r7
        L_0x0281:
            j04.m r7 = r0.f70599a
            wy3.k r7 = r7.f70645c
            n04.g1 r2 = r0.mo51735f(r4, r2, r9, r7)
            boolean r4 = n04.C25187v1.m32087g(r3)
            if (r4 != 0) goto L_0x0296
            boolean r4 = r1.f72767h
            if (r4 == 0) goto L_0x0294
            goto L_0x0296
        L_0x0294:
            r4 = 0
            goto L_0x0297
        L_0x0296:
            r4 = 1
        L_0x0297:
            n04.s0 r3 = r3.mo37084O0(r4)
            n04.s0 r2 = r3.mo51873Q0(r2)
            r4 = 0
            goto L_0x03d7
        L_0x02a2:
            sz3.b$b r2 = sz3.C26238b.f73151a
            int r3 = r1.f72779w
            java.lang.Boolean r2 = r2.mo53140c(r3)
            java.lang.String r3 = "SUSPEND_TYPE.get(proto.flags)"
            gy3.C87412m.m108593f(r2, r3)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x038f
            boolean r2 = r1.f72767h
            java.util.List r3 = r9.getParameters()
            int r3 = r3.size()
            int r4 = r10.size()
            int r3 = r3 - r4
            if (r3 == 0) goto L_0x02eb
            if (r3 == r5) goto L_0x02c9
            goto L_0x02e8
        L_0x02c9:
            int r3 = r10.size()
            int r3 = r3 - r5
            if (r3 < 0) goto L_0x02e8
            ty3.h r4 = r9.mo37092m()
            wy3.e r3 = r4.mo53329w(r3)
            n04.j1 r3 = r3.mo36110l()
            java.lang.String r4 = "functionTypeConstructor.…on(arity).typeConstructor"
            gy3.C87412m.m108593f(r3, r4)
            r4 = 0
            n04.s0 r2 = n04.C25146k0.m31960f(r8, r3, r10, r2, r4)
            goto L_0x0382
        L_0x02e8:
            r4 = 0
            goto L_0x0381
        L_0x02eb:
            r4 = 0
            n04.s0 r2 = n04.C25146k0.m31960f(r8, r9, r10, r2, r4)
            n04.j1 r3 = r2.mo37081K0()
            wy3.h r3 = r3.mo37094o()
            if (r3 == 0) goto L_0x02ff
            uy3.c r3 = ty3.C26335g.m33819e(r3)
            goto L_0x0300
        L_0x02ff:
            r3 = r4
        L_0x0300:
            uy3.c r7 = uy3.C26371c.f73566g
            if (r3 != r7) goto L_0x0306
            r3 = 1
            goto L_0x0307
        L_0x0306:
            r3 = 0
        L_0x0307:
            if (r3 != 0) goto L_0x030b
            goto L_0x0381
        L_0x030b:
            java.util.List r3 = ty3.C26335g.m33821g(r2)
            java.lang.Object r3 = sx3.C110818d0.m150925W(r3)
            n04.m1 r3 = (n04.C25158m1) r3
            if (r3 == 0) goto L_0x0381
            n04.j0 r3 = r3.getType()
            if (r3 != 0) goto L_0x031e
            goto L_0x0381
        L_0x031e:
            n04.j1 r7 = r3.mo37081K0()
            wy3.h r7 = r7.mo37094o()
            if (r7 == 0) goto L_0x032d
            vz3.c r7 = d04.C24442a.m30540g(r7)
            goto L_0x032e
        L_0x032d:
            r7 = r4
        L_0x032e:
            java.util.List r8 = r3.mo37079I0()
            int r8 = r8.size()
            if (r8 != r5) goto L_0x0382
            vz3.c r8 = ty3.C26343l.f73371e
            boolean r8 = gy3.C87412m.m108589b(r7, r8)
            if (r8 != 0) goto L_0x0349
            vz3.c r8 = j04.C24756h0.f70613a
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 != 0) goto L_0x0349
            goto L_0x0382
        L_0x0349:
            java.util.List r3 = r3.mo37079I0()
            java.lang.Object r3 = sx3.C110818d0.m150938j0(r3)
            n04.m1 r3 = (n04.C25158m1) r3
            n04.j0 r3 = r3.getType()
            java.lang.String r7 = "continuationArgumentType.arguments.single().type"
            gy3.C87412m.m108593f(r3, r7)
            j04.m r7 = r0.f70599a
            wy3.k r7 = r7.f70645c
            boolean r8 = r7 instanceof wy3.C26434a
            if (r8 != 0) goto L_0x0365
            r7 = r4
        L_0x0365:
            wy3.a r7 = (wy3.C26434a) r7
            if (r7 == 0) goto L_0x036e
            vz3.c r7 = d04.C24442a.m30536c(r7)
            goto L_0x036f
        L_0x036e:
            r7 = r4
        L_0x036f:
            vz3.c r8 = j04.C21149f0.f59797a
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x037c
            n04.s0 r2 = r0.mo51731a(r2, r3)
            goto L_0x0382
        L_0x037c:
            n04.s0 r2 = r0.mo51731a(r2, r3)
            goto L_0x0382
        L_0x0381:
            r2 = r4
        L_0x0382:
            if (r2 != 0) goto L_0x03d7
            p04.j r2 = p04.C25417j.f72000a
            p04.i r3 = p04.C25416i.INCONSISTENT_SUSPEND_FUNCTION
            java.lang.String[] r7 = new java.lang.String[r6]
            p04.g r2 = r2.mo52648e(r3, r10, r9, r7)
            goto L_0x03d7
        L_0x038f:
            r4 = 0
            boolean r11 = r1.f72767h
            r12 = 0
            r13 = 16
            r14 = 0
            n04.s0 r2 = n04.C25146k0.m31961g(r8, r9, r10, r11, r12, r13, r14)
            sz3.b$b r3 = sz3.C26238b.f73152b
            int r7 = r1.f72779w
            java.lang.Boolean r3 = r3.mo53140c(r7)
            java.lang.String r7 = "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)"
            gy3.C87412m.m108593f(r3, r7)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x03d7
            n04.t$a r3 = n04.C25177t.f71623g
            n04.t r3 = r3.mo52310a(r2, r6)
            if (r3 == 0) goto L_0x03b7
            r2 = r3
            goto L_0x03d7
        L_0x03b7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "null DefinitelyNotNullType for '"
            r3.append(r4)
            r3.append(r2)
            r2 = 39
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03d7:
            j04.m r3 = r0.f70599a
            sz3.g r3 = r3.f70646d
            gy3.C87412m.m108594g(r3, r15)
            int r7 = r1.f72765f
            r8 = 1024(0x400, float:1.435E-42)
            r9 = r7 & 1024(0x400, float:1.435E-42)
            if (r9 != r8) goto L_0x03e8
            r8 = 1
            goto L_0x03e9
        L_0x03e8:
            r8 = 0
        L_0x03e9:
            if (r8 == 0) goto L_0x03ee
            qz3.q r4 = r1.f72777u
            goto L_0x03fd
        L_0x03ee:
            r8 = 2048(0x800, float:2.87E-42)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x03f4
            goto L_0x03f5
        L_0x03f4:
            r5 = 0
        L_0x03f5:
            if (r5 == 0) goto L_0x03fd
            int r4 = r1.f72778v
            qz3.q r4 = r3.mo53147a(r4)
        L_0x03fd:
            if (r4 == 0) goto L_0x0407
            n04.s0 r3 = r0.mo51734d(r4, r6)
            n04.s0 r2 = n04.C25190w0.m32112c(r2, r3)
        L_0x0407:
            boolean r3 = r17.mo52919l()
            if (r3 == 0) goto L_0x0422
            j04.m r3 = r0.f70599a
            sz3.c r3 = r3.f70644b
            int r1 = r1.f72771o
            vz3.b r1 = j04.C24732a0.m31109a(r3, r1)
            j04.m r3 = r0.f70599a
            j04.k r3 = r3.f70643a
            yy3.e r3 = r3.f70639r
            n04.s0 r1 = r3.mo53647a(r1, r2)
            return r1
        L_0x0422:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j04.C24748g0.mo51734d(qz3.q, boolean):n04.s0");
    }

    /* renamed from: f */
    public final C25122g1 mo51735f(List<? extends C25120f1> list, C26571h hVar, C25144j1 j1Var, C26469k kVar) {
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C25120f1 a : list) {
            arrayList.add(a.mo52260a(hVar, j1Var, kVar));
        }
        return C25122g1.f71557e.mo33818c(C36907w.m41091m(arrayList));
    }

    /* renamed from: g */
    public final C25143j0 mo51736g(C26065q qVar) {
        C26065q qVar2;
        C87412m.m108594g(qVar, TPReportKeys.Common.COMMON_PROTO);
        boolean z = false;
        if (!((qVar.f72765f & 2) == 2)) {
            return mo51734d(qVar, true);
        }
        String string = this.f70599a.f70644b.getString(qVar.f72768i);
        C25176s0 d = mo51734d(qVar, true);
        C26247g gVar = this.f70599a.f70646d;
        C87412m.m108594g(gVar, "typeTable");
        int i = qVar.f72765f;
        if ((i & 4) == 4) {
            qVar2 = qVar.f72769j;
        } else {
            if ((i & 8) == 8) {
                z = true;
            }
            qVar2 = z ? gVar.mo53147a(qVar.f72770n) : null;
        }
        C87412m.m108591d(qVar2);
        return this.f70599a.f70643a.f70631j.mo51754a(qVar, string, d, mo51734d(qVar2, true));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f70601c);
        if (this.f70600b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f70600b.f70601c;
        }
        sb.append(str);
        return sb.toString();
    }
}
