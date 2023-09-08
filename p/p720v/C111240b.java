package p720v;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109895y;
import rx3.C13598b0;
import sx3.C110818d0;
import y04.C112354s;

/* renamed from: v.b */
public final class C111240b implements C109895y {

    /* renamed from: a */
    public final C111254e f333110a;

    /* renamed from: v.b$a */
    public static final class C111241a extends C87413o implements C32226l<C109846j, Integer> {

        /* renamed from: d */
        public final /* synthetic */ int f333111d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111241a(int i) {
            super(1);
            this.f333111d = i;
        }

        public Object invoke(Object obj) {
            C109846j jVar = (C109846j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            return Integer.valueOf(jVar.mo161156S(this.f333111d));
        }
    }

    /* renamed from: v.b$b */
    public static final class C111242b extends C87413o implements C32226l<C109846j, Integer> {

        /* renamed from: d */
        public final /* synthetic */ int f333112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111242b(int i) {
            super(1);
            this.f333112d = i;
        }

        public Object invoke(Object obj) {
            C109846j jVar = (C109846j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            return Integer.valueOf(jVar.mo161158Y(this.f333112d));
        }
    }

    /* renamed from: v.b$c */
    public static final class C111243c extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C109854n0> f333113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111243c(List<? extends C109854n0> list) {
            super(1);
            this.f333113d = list;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            List<C109854n0> list = this.f333113d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C109854n0.C109855a.m149304c(aVar, list.get(i), 0, 0, 0.0f, 4, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v.b$d */
    public static final class C111244d extends C87413o implements C32226l<C109846j, Integer> {

        /* renamed from: d */
        public final /* synthetic */ int f333114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111244d(int i) {
            super(1);
            this.f333114d = i;
        }

        public Object invoke(Object obj) {
            C109846j jVar = (C109846j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            return Integer.valueOf(jVar.mo161157V(this.f333114d));
        }
    }

    /* renamed from: v.b$e */
    public static final class C111245e extends C87413o implements C32226l<C109846j, Integer> {

        /* renamed from: d */
        public final /* synthetic */ int f333115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111245e(int i) {
            super(1);
            this.f333115d = i;
        }

        public Object invoke(Object obj) {
            C109846j jVar = (C109846j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            return Integer.valueOf(jVar.mo161154G(this.f333115d));
        }
    }

    public C111240b(C111254e eVar) {
        C87412m.m108594g(eVar, "scope");
        this.f333110a = eVar;
    }

    /* renamed from: a */
    public int mo142884a(C109848k kVar, List<? extends C109846j> list, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(list, "measurables");
        Integer num = (Integer) C112354s.m153292o(C112354s.m153290m(C110818d0.m150897A(list), new C111244d(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo142885b(C109848k kVar, List<? extends C109846j> list, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(list, "measurables");
        Integer num = (Integer) C112354s.m153292o(C112354s.m153290m(C110818d0.m150897A(list), new C111242b(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo142886c(C109848k kVar, List<? extends C109846j> list, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(list, "measurables");
        Integer num = (Integer) C112354s.m153292o(C112354s.m153290m(C110818d0.m150897A(list), new C111241a(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: o1.n0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p631o1.C109899z mo142887d(p631o1.C109827a0 r10, java.util.List<? extends p631o1.C109893x> r11, long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$measure"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "measurables"
            gy3.C87412m.m108594g(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x0019:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r11.next()
            o1.x r1 = (p631o1.C109893x) r1
            o1.n0 r1 = r1.mo161155K(r12)
            r0.add(r1)
            goto L_0x0019
        L_0x002d:
            boolean r11 = r0.isEmpty()
            r12 = 0
            r13 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0038
            r11 = r12
            goto L_0x005a
        L_0x0038:
            java.lang.Object r11 = r0.get(r1)
            r2 = r11
            o1.n0 r2 = (p631o1.C109854n0) r2
            int r2 = r2.f328779d
            int r3 = sx3.C64197v.m75536e(r0)
            if (r13 > r3) goto L_0x005a
            r4 = 1
        L_0x0048:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            o1.n0 r6 = (p631o1.C109854n0) r6
            int r6 = r6.f328779d
            if (r2 >= r6) goto L_0x0055
            r11 = r5
            r2 = r6
        L_0x0055:
            if (r4 == r3) goto L_0x005a
            int r4 = r4 + 1
            goto L_0x0048
        L_0x005a:
            o1.n0 r11 = (p631o1.C109854n0) r11
            if (r11 == 0) goto L_0x0062
            int r11 = r11.f328779d
            r3 = r11
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x006a
            goto L_0x008c
        L_0x006a:
            java.lang.Object r11 = r0.get(r1)
            r12 = r11
            o1.n0 r12 = (p631o1.C109854n0) r12
            int r12 = r12.f328780e
            int r2 = sx3.C64197v.m75536e(r0)
            if (r13 > r2) goto L_0x008b
        L_0x0079:
            java.lang.Object r4 = r0.get(r13)
            r5 = r4
            o1.n0 r5 = (p631o1.C109854n0) r5
            int r5 = r5.f328780e
            if (r12 >= r5) goto L_0x0086
            r11 = r4
            r12 = r5
        L_0x0086:
            if (r13 == r2) goto L_0x008b
            int r13 = r13 + 1
            goto L_0x0079
        L_0x008b:
            r12 = r11
        L_0x008c:
            o1.n0 r12 = (p631o1.C109854n0) r12
            if (r12 == 0) goto L_0x0094
            int r1 = r12.f328780e
            r4 = r1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            v.e r11 = r9.f333110a
            j0.y0<i2.m> r11 = r11.f333133a
            long r12 = p560i2.C108329n.m146743a(r3, r4)
            i2.m r1 = new i2.m
            r1.<init>(r12)
            j0.d2 r11 = (p175j0.C108494d2) r11
            r11.setValue(r1)
            r5 = 0
            v.b$c r6 = new v.b$c
            r6.<init>(r0)
            r7 = 4
            r8 = 0
            r2 = r10
            o1.z r10 = p631o1.C109827a0.C109828a.m149247b(r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p720v.C111240b.mo142887d(o1.a0, java.util.List, long):o1.z");
    }

    /* renamed from: e */
    public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(list, "measurables");
        Integer num = (Integer) C112354s.m153292o(C112354s.m153290m(C110818d0.m150897A(list), new C111245e(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
