package ya0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.ListIterator;
import my3.C61595o;
import p004b0.C103953l0;
import p004b0.C54380k;
import p175j0.C108491a0;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p267x.C38426u1;
import p683s0.C36597a;
import p683s0.C36601l;
import p683s0.C36606n;
import p759y.C112278q0;
import p759y.C112302z0;
import rx3.C13598b0;
import sx3.C26236u;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ya0.i */
public final class C112430i implements C112302z0 {

    /* renamed from: g */
    public static final C36601l<C112430i, ?> f336654g = C36597a.m41001a(C38983a.f105031d, C38984b.f105032d);

    /* renamed from: a */
    public final C103953l0 f336655a;

    /* renamed from: b */
    public final C60690y0 f336656b;

    /* renamed from: c */
    public final C60667k2 f336657c;

    /* renamed from: d */
    public final C60667k2 f336658d;

    /* renamed from: e */
    public final C60690y0 f336659e;

    /* renamed from: f */
    public final C60690y0 f336660f;

    /* renamed from: ya0.i$a */
    public static final class C38983a extends C87413o implements C32227p<C36606n, C112430i, List<? extends Object>> {

        /* renamed from: d */
        public static final C38983a f105031d = new C38983a();

        public C38983a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C112430i iVar = (C112430i) obj2;
            C87412m.m108594g((C36606n) obj, "$this$listSaver");
            C87412m.m108594g(iVar, LocaleUtil.ITALIAN);
            return C26236u.m33719b(Integer.valueOf(iVar.mo164141i()));
        }
    }

    /* renamed from: ya0.i$b */
    public static final class C38984b extends C87413o implements C32226l<List<? extends Object>, C112430i> {

        /* renamed from: d */
        public static final C38984b f105032d = new C38984b();

        public C38984b() {
            super(1);
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, LocaleUtil.ITALIAN);
            Object obj2 = list.get(0);
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.Int");
            return new C112430i(((Integer) obj2).intValue());
        }
    }

    /* renamed from: ya0.i$e */
    public static final class C38985e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C112430i f105033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38985e(C112430i iVar) {
            super(0);
            this.f105033d = iVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f105033d.f336655a.mo145573g().mo55834e());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.pager.PagerState", mo125469f = "PagerState.kt", mo125470l = {201, 211, 218, 230}, mo125471m = "animateScrollToPage")
    /* renamed from: ya0.i$c */
    public static final class C112431c extends C66704d {

        /* renamed from: d */
        public Object f336661d;

        /* renamed from: e */
        public int f336662e;

        /* renamed from: f */
        public int f336663f;

        /* renamed from: g */
        public float f336664g;

        /* renamed from: h */
        public /* synthetic */ Object f336665h;

        /* renamed from: i */
        public final /* synthetic */ C112430i f336666i;

        /* renamed from: j */
        public int f336667j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112431c(C112430i iVar, C15601d<? super C112431c> dVar) {
            super(dVar);
            this.f336666i = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336665h = obj;
            this.f336667j |= Integer.MIN_VALUE;
            return this.f336666i.mo164136d(0, 0.0f, this);
        }
    }

    /* renamed from: ya0.i$d */
    public static final class C112432d extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C112430i f336668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112432d(C112430i iVar) {
            super(0);
            this.f336668d = iVar;
        }

        public Object invoke() {
            C54380k e = this.f336668d.mo164137e();
            float f = 0.0f;
            if (e != null) {
                C112430i iVar = this.f336668d;
                float index = (float) e.getIndex();
                C54380k e2 = iVar.mo164137e();
                if (e2 != null) {
                    f = C61595o.m72296d(((float) (-e2.getOffset())) / ((float) e2.getSize()), 0.0f, 1.0f);
                }
                f = (index + f) - ((float) iVar.mo164141i());
            }
            return Float.valueOf(f);
        }
    }

    public C112430i(int i) {
        this.f336655a = new C103953l0(i, 0, 2, (C8480h) null);
        this.f336656b = C108500f2.m146996c(Integer.valueOf(i), (C108497e2) null, 2, (Object) null);
        this.f336657c = C108500f2.m146994a(new C38985e(this));
        this.f336658d = C108500f2.m146994a(new C112432d(this));
        this.f336659e = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
        this.f336660f = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public boolean mo90552a() {
        return this.f336655a.mo90552a();
    }

    /* renamed from: b */
    public float mo90553b(float f) {
        return this.f336655a.mo90553b(f);
    }

    /* renamed from: c */
    public Object mo90554c(C38426u1 u1Var, C32227p<? super C112278q0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C13598b0> dVar) {
        Object c = this.f336655a.mo90554c(u1Var, pVar, dVar);
        return c == C15911a.COROUTINE_SUSPENDED ? c : C13598b0.f38549a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0154 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164136d(int r11, float r12, wx3.C15601d<? super rx3.C13598b0> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ya0.C112430i.C112431c
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ya0.i$c r0 = (ya0.C112430i.C112431c) r0
            int r1 = r0.f336667j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336667j = r1
            goto L_0x0018
        L_0x0013:
            ya0.i$c r0 = new ya0.i$c
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f336665h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f336667j
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0059
            if (r2 == r7) goto L_0x004b
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            int r11 = r0.f336663f
            float r12 = r0.f336664g
            int r2 = r0.f336662e
            java.lang.Object r4 = r0.f336661d
            ya0.i r4 = (ya0.C112430i) r4
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0048 }
            r13 = r11
            r11 = r2
            goto L_0x0140
        L_0x0048:
            r11 = move-exception
            goto L_0x01b5
        L_0x004b:
            java.lang.Object r11 = r0.f336661d
            ya0.i r11 = (ya0.C112430i) r11
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0054 }
            goto L_0x0187
        L_0x0054:
            r12 = move-exception
            r4 = r11
            r11 = r12
            goto L_0x01b5
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r13)
            int r13 = r10.mo164139g()
            if (r13 != 0) goto L_0x0076
            if (r11 != 0) goto L_0x0066
            r13 = 1
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            if (r13 == 0) goto L_0x006a
            goto L_0x0083
        L_0x006a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "page must be 0 when pageCount is 0"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0076:
            if (r11 < 0) goto L_0x0080
            int r13 = r10.mo164139g()
            if (r11 >= r13) goto L_0x0080
            r13 = 1
            goto L_0x0081
        L_0x0080:
            r13 = 0
        L_0x0081:
            if (r13 == 0) goto L_0x01e4
        L_0x0083:
            int r13 = r10.mo164139g()
            r2 = 0
            if (r13 != 0) goto L_0x00a0
            int r13 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0090
            r13 = 1
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            if (r13 == 0) goto L_0x0094
            goto L_0x00af
        L_0x0094:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "pageOffset must be 0f when pageCount is 0"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00a0:
            int r13 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r13 > 0) goto L_0x00ac
            r13 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x00ac
            r13 = 1
            goto L_0x00ad
        L_0x00ac:
            r13 = 0
        L_0x00ad:
            if (r13 == 0) goto L_0x01d8
        L_0x00af:
            java.lang.Integer r13 = new java.lang.Integer     // Catch:{ all -> 0x00d1 }
            r13.<init>(r11)     // Catch:{ all -> 0x00d1 }
            j0.y0 r2 = r10.f336659e     // Catch:{ all -> 0x00d1 }
            j0.d2 r2 = (p175j0.C108494d2) r2     // Catch:{ all -> 0x00d1 }
            r2.setValue(r13)     // Catch:{ all -> 0x00d1 }
            r13 = 1000593162(0x3ba3d70a, float:0.005)
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x00d4
            b0.l0 r12 = r10.f336655a     // Catch:{ all -> 0x00d1 }
            r0.f336661d = r10     // Catch:{ all -> 0x00d1 }
            r0.f336667j = r7     // Catch:{ all -> 0x00d1 }
            s0.l<b0.l0, ?> r13 = p004b0.C103953l0.f307415r     // Catch:{ all -> 0x00d1 }
            java.lang.Object r11 = r12.mo145570d(r11, r8, r0)     // Catch:{ all -> 0x00d1 }
            if (r11 != r1) goto L_0x0118
            return r1
        L_0x00d1:
            r11 = move-exception
            goto L_0x01b4
        L_0x00d4:
            b0.l0 r13 = r10.f336655a     // Catch:{ all -> 0x00d1 }
            b0.x r13 = r13.mo145573g()     // Catch:{ all -> 0x00d1 }
            java.util.List r13 = r13.mo55835f()     // Catch:{ all -> 0x00d1 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x00d1 }
        L_0x00e2:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r13.next()     // Catch:{ all -> 0x00d1 }
            r9 = r2
            b0.k r9 = (p004b0.C54380k) r9     // Catch:{ all -> 0x00d1 }
            int r9 = r9.getIndex()     // Catch:{ all -> 0x00d1 }
            if (r9 != r11) goto L_0x00f7
            r9 = 1
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            if (r9 == 0) goto L_0x00e2
            goto L_0x00fc
        L_0x00fb:
            r2 = r6
        L_0x00fc:
            b0.k r2 = (p004b0.C54380k) r2     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x011a
            b0.l0 r13 = r10.f336655a     // Catch:{ all -> 0x00d1 }
            int r2 = r2.getSize()     // Catch:{ all -> 0x00d1 }
            float r2 = (float) r2     // Catch:{ all -> 0x00d1 }
            float r2 = r2 * r12
            int r12 = iy3.C60641c.m70921b(r2)     // Catch:{ all -> 0x00d1 }
            r0.f336661d = r10     // Catch:{ all -> 0x00d1 }
            r0.f336667j = r5     // Catch:{ all -> 0x00d1 }
            java.lang.Object r11 = r13.mo145570d(r11, r12, r0)     // Catch:{ all -> 0x00d1 }
            if (r11 != r1) goto L_0x0118
            return r1
        L_0x0118:
            r11 = r10
            goto L_0x0187
        L_0x011a:
            b0.k r13 = r10.mo164137e()     // Catch:{ all -> 0x00d1 }
            gy3.C87412m.m108591d(r13)     // Catch:{ all -> 0x00d1 }
            int r13 = r13.getSize()     // Catch:{ all -> 0x00d1 }
            b0.l0 r2 = r10.f336655a     // Catch:{ all -> 0x00d1 }
            float r5 = (float) r13     // Catch:{ all -> 0x00d1 }
            float r5 = r5 * r12
            int r5 = iy3.C60641c.m70921b(r5)     // Catch:{ all -> 0x00d1 }
            r0.f336661d = r10     // Catch:{ all -> 0x00d1 }
            r0.f336662e = r11     // Catch:{ all -> 0x00d1 }
            r0.f336664g = r12     // Catch:{ all -> 0x00d1 }
            r0.f336663f = r13     // Catch:{ all -> 0x00d1 }
            r0.f336667j = r4     // Catch:{ all -> 0x00d1 }
            java.lang.Object r2 = r2.mo145570d(r11, r5, r0)     // Catch:{ all -> 0x00d1 }
            if (r2 != r1) goto L_0x013f
            return r1
        L_0x013f:
            r4 = r10
        L_0x0140:
            b0.l0 r2 = r4.f336655a     // Catch:{ all -> 0x0048 }
            b0.x r2 = r2.mo145573g()     // Catch:{ all -> 0x0048 }
            java.util.List r2 = r2.mo55835f()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0048 }
        L_0x014e:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x01ac
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0048 }
            r9 = r5
            b0.k r9 = (p004b0.C54380k) r9     // Catch:{ all -> 0x0048 }
            int r9 = r9.getIndex()     // Catch:{ all -> 0x0048 }
            if (r9 != r11) goto L_0x0163
            r9 = 1
            goto L_0x0164
        L_0x0163:
            r9 = 0
        L_0x0164:
            if (r9 == 0) goto L_0x014e
            b0.k r5 = (p004b0.C54380k) r5     // Catch:{ all -> 0x0048 }
            int r2 = r5.getSize()     // Catch:{ all -> 0x0048 }
            if (r2 == r13) goto L_0x0186
            b0.l0 r13 = r4.f336655a     // Catch:{ all -> 0x0048 }
            int r2 = r5.getSize()     // Catch:{ all -> 0x0048 }
            float r2 = (float) r2     // Catch:{ all -> 0x0048 }
            float r2 = r2 * r12
            int r12 = iy3.C60641c.m70921b(r2)     // Catch:{ all -> 0x0048 }
            r0.f336661d = r4     // Catch:{ all -> 0x0048 }
            r0.f336667j = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r11 = r13.mo145570d(r11, r12, r0)     // Catch:{ all -> 0x0048 }
            if (r11 != r1) goto L_0x0186
            return r1
        L_0x0186:
            r11 = r4
        L_0x0187:
            b0.k r12 = r11.mo164137e()
            if (r12 == 0) goto L_0x0191
            int r8 = r12.getIndex()
        L_0x0191:
            int r12 = r11.mo164141i()
            if (r8 == r12) goto L_0x01a2
            j0.y0 r12 = r11.f336656b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            j0.d2 r12 = (p175j0.C108494d2) r12
            r12.setValue(r13)
        L_0x01a2:
            j0.y0 r11 = r11.f336659e
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r6)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x01ac:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0048 }
            java.lang.String r12 = "Collection contains no element matching the predicate."
            r11.<init>(r12)     // Catch:{ all -> 0x0048 }
            throw r11     // Catch:{ all -> 0x0048 }
        L_0x01b4:
            r4 = r10
        L_0x01b5:
            b0.k r12 = r4.mo164137e()
            if (r12 == 0) goto L_0x01bf
            int r8 = r12.getIndex()
        L_0x01bf:
            int r12 = r4.mo164141i()
            if (r8 == r12) goto L_0x01d0
            j0.y0 r12 = r4.f336656b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            j0.d2 r12 = (p175j0.C108494d2) r12
            r12.setValue(r13)
        L_0x01d0:
            j0.y0 r12 = r4.f336659e
            j0.d2 r12 = (p175j0.C108494d2) r12
            r12.setValue(r6)
            throw r11
        L_0x01d8:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "pageOffset must be >= 0 and <= 1"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x01e4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "page"
            r12.append(r13)
            r13 = 91
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = "] must be >= 0 and < pageCount"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ya0.C112430i.mo164136d(int, float, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public final C54380k mo164137e() {
        C54380k kVar;
        boolean z;
        List<C54380k> f = this.f336655a.mo145573g().mo55835f();
        ListIterator<C54380k> listIterator = f.listIterator(f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                kVar = null;
                break;
            }
            kVar = listIterator.previous();
            if (kVar.getOffset() <= 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return kVar;
    }

    /* renamed from: f */
    public final float mo164138f() {
        return ((Number) ((C108491a0) this.f336658d).getValue()).floatValue();
    }

    /* renamed from: g */
    public final int mo164139g() {
        return ((Number) ((C108491a0) this.f336657c).getValue()).intValue();
    }

    /* renamed from: h */
    public final int mo164140h() {
        Integer num = (Integer) ((C108494d2) this.f336659e).getValue();
        if (num == null) {
            C32224a aVar = (C32224a) ((C108494d2) this.f336660f).getValue();
            num = aVar != null ? (Integer) aVar.invoke() : null;
            if (num == null) {
                if (!mo90552a()) {
                    return mo164141i();
                }
                if (Math.abs(mo164138f()) < 0.001f) {
                    return mo164141i();
                }
                if (mo164138f() < 0.0f) {
                    int i = mo164141i() - 1;
                    if (i < 0) {
                        return 0;
                    }
                    return i;
                }
                int i2 = mo164141i() + 1;
                int g = mo164139g() - 1;
                return i2 > g ? g : i2;
            }
        }
        return num.intValue();
    }

    /* renamed from: i */
    public final int mo164141i() {
        return ((Number) this.f336656b.getValue()).intValue();
    }

    public String toString() {
        return "PagerState(pageCount=" + mo164139g() + ", currentPage=" + mo164141i() + ", currentPageOffset=" + mo164138f() + ')';
    }

    public C112430i() {
        this(0);
    }
}
