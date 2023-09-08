package p191l2;

import a14.C0000n0;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p175j0.C108497e2;
import p175j0.C108499f1;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C108513w;
import p175j0.C24665d;
import p175j0.C33489x1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60667k2;
import p246u1.C111082p;
import p415q0.C110261c;
import p415q0.C25518a;
import p415q0.C35747b;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109850l0;
import p631o1.C109854n0;
import p631o1.C109857o;
import p631o1.C109863q;
import p631o1.C109893x;
import p631o1.C109895y;
import p631o1.C109899z;
import p658q1.C110269a;
import p721v0.C65503j;
import p868x0.C111976a;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: l2.a */
public final class C109132a {

    /* renamed from: a */
    public static final C108499f1<String> f326780a = C108513w.m147057b((C108497e2) null, C61188a.f174199d, 1, (Object) null);

    /* renamed from: l2.a$a */
    public static final class C61188a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C61188a f174199d = new C61188a();

        public C61188a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", mo125469f = "AndroidPopup.android.kt", mo125470l = {303}, mo125471m = "invokeSuspend")
    /* renamed from: l2.a$e */
    public static final class C61189e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174200d;

        /* renamed from: e */
        public /* synthetic */ Object f174201e;

        /* renamed from: f */
        public final /* synthetic */ C109148j f174202f;

        /* renamed from: l2.a$e$a */
        public static final class C34164a extends C87413o implements C32226l<Long, C13598b0> {

            /* renamed from: d */
            public static final C34164a f92158d = new C34164a();

            public C34164a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).longValue();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61189e(C109148j jVar, C15601d<? super C61189e> dVar) {
            super(2, dVar);
            this.f174202f = jVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C61189e eVar = new C61189e(this.f174202f, dVar);
            eVar.f174201e = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61189e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f174200d
                r2 = 1
                if (r1 == 0) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                java.lang.Object r1 = r9.f174201e
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
                goto L_0x0051
            L_0x0012:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001a:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f174201e
                a14.n0 r10 = (a14.C0000n0) r10
                r1 = r10
                r10 = r9
            L_0x0023:
                boolean r3 = a14.C53930o0.m60560g(r1)
                if (r3 == 0) goto L_0x006d
                l2.a$e$a r3 = p191l2.C109132a.C61189e.C34164a.f92158d
                r10.f174201e = r1
                r10.f174200d = r2
                wx3.f r4 = r10.getContext()
                int r5 = androidx.compose.p002ui.platform.C54197z0.f152158c0
                androidx.compose.ui.platform.z0$a r5 = androidx.compose.p002ui.platform.C54197z0.C54198a.f152159d
                wx3.f$b r4 = r4.get(r5)
                androidx.compose.ui.platform.z0 r4 = (androidx.compose.p002ui.platform.C54197z0) r4
                if (r4 != 0) goto L_0x0044
                java.lang.Object r3 = p175j0.C60685u0.m70964b(r3, r10)
                goto L_0x004e
            L_0x0044:
                androidx.compose.ui.platform.a1 r5 = new androidx.compose.ui.platform.a1
                r6 = 0
                r5.<init>(r3, r6)
                java.lang.Object r3 = r4.mo74987L(r5, r10)
            L_0x004e:
                if (r3 != r0) goto L_0x0051
                return r0
            L_0x0051:
                l2.j r3 = r10.f174202f
                int[] r4 = r3.f326809D
                r5 = 0
                r6 = r4[r5]
                r7 = r4[r2]
                android.view.View r8 = r3.f326813q
                r8.getLocationOnScreen(r4)
                int[] r4 = r3.f326809D
                r5 = r4[r5]
                if (r6 != r5) goto L_0x0069
                r4 = r4[r2]
                if (r7 == r4) goto L_0x0023
            L_0x0069:
                r3.mo160381l()
                goto L_0x0023
            L_0x006d:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p191l2.C109132a.C61189e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: l2.a$h */
    public static final class C61190h extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C34165o f174203d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f174204e;

        /* renamed from: f */
        public final /* synthetic */ C109153p f174205f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f174206g;

        /* renamed from: h */
        public final /* synthetic */ int f174207h;

        /* renamed from: i */
        public final /* synthetic */ int f174208i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61190h(C34165o oVar, C32224a<C13598b0> aVar, C109153p pVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar2, int i, int i2) {
            super(2);
            this.f174203d = oVar;
            this.f174204e = aVar;
            this.f174205f = pVar;
            this.f174206g = pVar2;
            this.f174207h = i;
            this.f174208i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C109132a.m148171a(this.f174203d, this.f174204e, this.f174205f, this.f174206g, (C108504h) obj, this.f174207h | 1, this.f174208i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l2.a$i */
    public static final class C61191i extends C87413o implements C32224a<UUID> {

        /* renamed from: d */
        public static final C61191i f174209d = new C61191i();

        public C61191i() {
            super(0);
        }

        public Object invoke() {
            return UUID.randomUUID();
        }
    }

    /* renamed from: l2.a$b */
    public static final class C109133b extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C109148j f326781d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f326782e;

        /* renamed from: f */
        public final /* synthetic */ C109153p f326783f;

        /* renamed from: g */
        public final /* synthetic */ String f326784g;

        /* renamed from: h */
        public final /* synthetic */ C33183o f326785h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109133b(C109148j jVar, C32224a<C13598b0> aVar, C109153p pVar, String str, C33183o oVar) {
            super(1);
            this.f326781d = jVar;
            this.f326782e = aVar;
            this.f326783f = pVar;
            this.f326784g = str;
            this.f326785h = oVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            C109148j jVar = this.f326781d;
            jVar.f326815s.addView(jVar, jVar.f326816t);
            this.f326781d.mo160380k(this.f326782e, this.f326783f, this.f326784g, this.f326785h);
            return new C109140b(this.f326781d);
        }
    }

    /* renamed from: l2.a$c */
    public static final class C109134c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109148j f326786d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f326787e;

        /* renamed from: f */
        public final /* synthetic */ C109153p f326788f;

        /* renamed from: g */
        public final /* synthetic */ String f326789g;

        /* renamed from: h */
        public final /* synthetic */ C33183o f326790h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109134c(C109148j jVar, C32224a<C13598b0> aVar, C109153p pVar, String str, C33183o oVar) {
            super(0);
            this.f326786d = jVar;
            this.f326787e = aVar;
            this.f326788f = pVar;
            this.f326789g = str;
            this.f326790h = oVar;
        }

        public Object invoke() {
            this.f326786d.mo160380k(this.f326787e, this.f326788f, this.f326789g, this.f326790h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l2.a$d */
    public static final class C109135d extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C109148j f326791d;

        /* renamed from: e */
        public final /* synthetic */ C34165o f326792e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109135d(C109148j jVar, C34165o oVar) {
            super(1);
            this.f326791d = jVar;
            this.f326792e = oVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            this.f326791d.setPositionProvider(this.f326792e);
            this.f326791d.mo160383n();
            return new C109141c();
        }
    }

    /* renamed from: l2.a$f */
    public static final class C109136f extends C87413o implements C32226l<C109857o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109148j f326793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109136f(C109148j jVar) {
            super(1);
            this.f326793d = jVar;
        }

        public Object invoke(Object obj) {
            C109857o oVar = (C109857o) obj;
            C87412m.m108594g(oVar, "childCoordinates");
            C109857o a = oVar.mo161180a();
            C87412m.m108591d(a);
            this.f326793d.mo160382m(a);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l2.a$g */
    public static final class C109137g implements C109895y {

        /* renamed from: a */
        public final /* synthetic */ C109148j f326794a;

        /* renamed from: b */
        public final /* synthetic */ C33183o f326795b;

        /* renamed from: l2.a$g$a */
        public static final class C109138a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

            /* renamed from: d */
            public static final C109138a f326796d = new C109138a();

            public C109138a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C109854n0.C109855a) obj, "$this$layout");
                return C13598b0.f38549a;
            }
        }

        public C109137g(C109148j jVar, C33183o oVar) {
            this.f326794a = jVar;
            this.f326795b = oVar;
        }

        /* renamed from: a */
        public int mo142884a(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149387c(this, kVar, list, i);
        }

        /* renamed from: b */
        public int mo142885b(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149386b(this, kVar, list, i);
        }

        /* renamed from: c */
        public int mo142886c(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149385a(this, kVar, list, i);
        }

        /* renamed from: d */
        public final C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
            C87412m.m108594g(a0Var, "$this$Layout");
            C87412m.m108594g(list, "<anonymous parameter 0>");
            this.f326794a.setParentLayoutDirection(this.f326795b);
            return C109827a0.C109828a.m149247b(a0Var, 0, 0, (Map) null, C109138a.f326796d, 4, (Object) null);
        }

        /* renamed from: e */
        public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149388d(this, kVar, list, i);
        }
    }

    /* renamed from: l2.a$j */
    public static final class C109139j extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109148j f326797d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<C32227p<C108504h, Integer, C13598b0>> f326798e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109139j(C109148j jVar, C60667k2<? extends C32227p<? super C108504h, ? super Integer, C13598b0>> k2Var) {
            super(2);
            this.f326797d = jVar;
            this.f326798e = k2Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C65503j b = C111082p.m151476b(C65503j.C65504a.f188490d, false, C109142d.f326800d);
                C109143e eVar = new C109143e(this.f326797d);
                C87412m.m108594g(b, "<this>");
                C65503j a = C111976a.m152678a(b.mo74972i0(new C109850l0(eVar, C103612c1.f306063a)), this.f326797d.getCanCalculatePosition() ? 1.0f : 0.0f);
                C25518a b2 = C110261c.m149878b(hVar, 606497925, true, new C61192f(this.f326798e));
                hVar.mo51557H(1406149896);
                C109144g gVar = C109144g.f326802a;
                hVar.mo51557H(-1323940314);
                C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(a);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C108508o2.m147049a(hVar, gVar, C110269a.C110270a.f329836e);
                    C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                    C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                    C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                    hVar.mo51590i();
                    ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    ((C35747b) b2).invoke(hVar, 6);
                    hVar.mo51565P();
                    hVar.mo51610s();
                    hVar.mo51565P();
                    hVar.mo51565P();
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m148171a(p191l2.C34165o r28, fy3.C32224a<rx3.C13598b0> r29, p191l2.C109153p r30, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r31, p175j0.C108504h r32, int r33, int r34) {
        /*
            r11 = r28
            r12 = r31
            r13 = r33
            java.lang.String r0 = "popupPositionProvider"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r12, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r32
            j0.h r14 = r1.mo51623z(r0)
            r0 = r34 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r14.mo51619x(r11)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r13
            goto L_0x0032
        L_0x0031:
            r0 = r13
        L_0x0032:
            r1 = r34 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r29
            boolean r3 = r14.mo51619x(r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
            goto L_0x004e
        L_0x004c:
            r2 = r29
        L_0x004e:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0067
            r3 = r34 & 4
            if (r3 != 0) goto L_0x0061
            r3 = r30
            boolean r4 = r14.mo51619x(r3)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r3 = r30
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r4
            goto L_0x0069
        L_0x0067:
            r3 = r30
        L_0x0069:
            r4 = r34 & 8
            if (r4 == 0) goto L_0x0070
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0080
            boolean r4 = r14.mo51619x(r12)
            if (r4 == 0) goto L_0x007d
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r0 = r0 | r4
        L_0x0080:
            r4 = r0 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0092
            boolean r4 = r14.mo51575a()
            if (r4 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r14.mo51581d()
            goto L_0x0257
        L_0x0092:
            r14.mo51559J()
            r4 = r13 & 1
            if (r4 == 0) goto L_0x00aa
            boolean r4 = r14.mo51582e()
            if (r4 == 0) goto L_0x00a0
            goto L_0x00aa
        L_0x00a0:
            r14.mo51581d()
            r1 = r34 & 4
            if (r1 == 0) goto L_0x00d1
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00d1
        L_0x00aa:
            if (r1 == 0) goto L_0x00ad
            r2 = 0
        L_0x00ad:
            r1 = r34 & 4
            if (r1 == 0) goto L_0x00d1
            l2.p r1 = new l2.p
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 63
            r24 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            r18 = r0
            r17 = r1
            r16 = r2
            goto L_0x00d7
        L_0x00d1:
            r18 = r0
            r16 = r2
            r17 = r3
        L_0x00d7:
            r14.mo51555G()
            j0.f1<android.view.View> r0 = androidx.compose.p002ui.platform.C103691v.f306272f
            java.lang.Object r0 = r14.mo51598m(r0)
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            j0.f1<i2.d> r10 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r0 = r14.mo51598m(r10)
            r9 = r0
            i2.d r9 = (p560i2.C108322d) r9
            j0.f1<java.lang.String> r0 = f326780a
            java.lang.Object r0 = r14.mo51598m(r0)
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            j0.f1<i2.o> r0 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r1 = r14.mo51598m(r0)
            r7 = r1
            i2.o r7 = (p560i2.C33183o) r7
            r6 = 0
            j0.r r5 = p175j0.C108501g.m147001b(r14, r6)
            int r1 = r18 >> 9
            r1 = r1 & 14
            j0.k2 r4 = p175j0.C108500f2.m146998e(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r2 = 0
            r3 = 0
            l2.a$i r20 = p191l2.C109132a.C61191i.f174209d
            r21 = 3080(0xc08, float:4.316E-42)
            r22 = 6
            r15 = r4
            r4 = r20
            r25 = r5
            r5 = r14
            r6 = r21
            r29 = r7
            r7 = r22
            java.lang.Object r1 = p683s0.C110676d.m150647a(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo51557H(r1)
            java.lang.Object r1 = r14.mo51606q()
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r1 != r2) goto L_0x017b
            l2.j r6 = new l2.j
            java.lang.String r1 = "popupId"
            gy3.C87412m.m108593f(r7, r1)
            r20 = 0
            r21 = 128(0x80, float:1.794E-43)
            r22 = 0
            r5 = r0
            r0 = r6
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r8
            r8 = r5
            r5 = r9
            r9 = r6
            r6 = r28
            r26 = r8
            r8 = r20
            r27 = r9
            r9 = r21
            r12 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1302892335(0x4da88f2f, float:3.53494496E8)
            l2.a$j r1 = new l2.a$j
            r2 = r27
            r1.<init>(r2, r15)
            r3 = 1
            q0.a r0 = p415q0.C110261c.m149879c(r0, r3, r1)
            r1 = r25
            r2.mo160379j(r1, r0)
            r14.mo51553F(r2)
            r1 = r2
            goto L_0x017e
        L_0x017b:
            r26 = r0
            r12 = r10
        L_0x017e:
            r14.mo51565P()
            l2.j r1 = (p191l2.C109148j) r1
            l2.a$b r0 = new l2.a$b
            r3 = r0
            r4 = r1
            r5 = r16
            r6 = r17
            r7 = r19
            r8 = r29
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = 8
            p175j0.C60655g0.m70930a(r1, r0, r14, r2)
            l2.a$c r0 = new l2.a$c
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = 0
            p175j0.C60655g0.m70936g(r0, r14, r3)
            l2.a$d r0 = new l2.a$d
            r0.<init>(r1, r11)
            r4 = r18 & 14
            p175j0.C60655g0.m70930a(r11, r0, r14, r4)
            l2.a$e r0 = new l2.a$e
            r4 = 0
            r0.<init>(r1, r4)
            p175j0.C60655g0.m70932c(r1, r0, r14, r2)
            int r0 = p721v0.C65503j.f188489K0
            v0.j$a r0 = p721v0.C65503j.C65504a.f188490d
            l2.a$f r2 = new l2.a$f
            r2.<init>(r1)
            v0.j r0 = p631o1.C109845i0.m149273a(r0, r2)
            l2.a$g r2 = new l2.a$g
            r4 = r29
            r2.<init>(r1, r4)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo51557H(r1)
            java.lang.Object r1 = r14.mo51598m(r12)
            i2.d r1 = (p560i2.C108322d) r1
            r4 = r26
            java.lang.Object r4 = r14.mo51598m(r4)
            i2.o r4 = (p560i2.C33183o) r4
            j0.f1<androidx.compose.ui.platform.i2> r5 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r5 = r14.mo51598m(r5)
            androidx.compose.ui.platform.i2 r5 = (androidx.compose.p002ui.platform.C103633i2) r5
            q1.a$a r6 = p658q1.C110269a.f329831D0
            r6.getClass()
            fy3.a<q1.a> r7 = p658q1.C110269a.C110270a.f329833b
            fy3.q r0 = p631o1.C109863q.m149330a(r0)
            j0.d r8 = r14.mo51543A()
            boolean r8 = r8 instanceof p175j0.C24665d
            if (r8 == 0) goto L_0x0270
            r14.mo51615v()
            boolean r8 = r14.mo51621y()
            if (r8 == 0) goto L_0x0204
            r14.mo51612t(r7)
            goto L_0x0207
        L_0x0204:
            r14.mo51579c()
        L_0x0207:
            r14.mo51561L()
            r6.getClass()
            fy3.p<q1.a, o1.y, rx3.b0> r7 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r14, r2, r7)
            r6.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r2 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r14, r1, r2)
            r6.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r1 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r14, r4, r1)
            r6.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r1 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r14, r5, r1)
            r14.mo51590i()
            j0.x1 r1 = new j0.x1
            r1.<init>(r14)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            q0.b r0 = (p415q0.C35747b) r0
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo51557H(r0)
            r0 = 2085825549(0x7c532c0d, float:4.3858724E36)
            r14.mo51557H(r0)
            r14.mo51565P()
            r14.mo51565P()
            r14.mo51610s()
            r14.mo51565P()
            r2 = r16
            r3 = r17
        L_0x0257:
            j0.v1 r7 = r14.mo51596l()
            if (r7 != 0) goto L_0x025e
            goto L_0x026f
        L_0x025e:
            l2.a$h r8 = new l2.a$h
            r0 = r8
            r1 = r28
            r4 = r31
            r5 = r33
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo51650a(r8)
        L_0x026f:
            return
        L_0x0270:
            p175j0.C108501g.m147000a()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p191l2.C109132a.m148171a(l2.o, fy3.a, l2.p, fy3.p, j0.h, int, int):void");
    }
}
