package p435a0;

import fy3.C32226l;
import fy3.C32227p;
import fy3.C32230s;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.List;
import java.util.Map;
import p560i2.C108319b;
import p560i2.C108321c;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109895y;
import p631o1.C109899z;
import rx3.C13598b0;

/* renamed from: a0.q0 */
public final class C103185q0 {

    /* renamed from: a0.q0$a */
    public static final class C103186a implements C109895y {

        /* renamed from: a */
        public final /* synthetic */ C103154h0 f304353a;

        /* renamed from: b */
        public final /* synthetic */ float f304354b;

        /* renamed from: c */
        public final /* synthetic */ C27720z0 f304355c;

        /* renamed from: d */
        public final /* synthetic */ C32230s<Integer, int[], C33183o, C108322d, int[], C13598b0> f304356d;

        /* renamed from: e */
        public final /* synthetic */ C103167m f304357e;

        /* renamed from: a0.q0$a$a */
        public static final class C103187a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ List<C109893x> f304358d;

            /* renamed from: e */
            public final /* synthetic */ C109854n0[] f304359e;

            /* renamed from: f */
            public final /* synthetic */ C32230s<Integer, int[], C33183o, C108322d, int[], C13598b0> f304360f;

            /* renamed from: g */
            public final /* synthetic */ int f304361g;

            /* renamed from: h */
            public final /* synthetic */ C109827a0 f304362h;

            /* renamed from: i */
            public final /* synthetic */ int[] f304363i;

            /* renamed from: j */
            public final /* synthetic */ C103154h0 f304364j;

            /* renamed from: n */
            public final /* synthetic */ C103189r0[] f304365n;

            /* renamed from: o */
            public final /* synthetic */ C103167m f304366o;

            /* renamed from: p */
            public final /* synthetic */ int f304367p;

            /* renamed from: q */
            public final /* synthetic */ C8478d0 f304368q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C103187a(List<? extends C109893x> list, C109854n0[] n0VarArr, C32230s<? super Integer, ? super int[], ? super C33183o, ? super C108322d, ? super int[], C13598b0> sVar, int i, C109827a0 a0Var, int[] iArr, C103154h0 h0Var, C103189r0[] r0VarArr, C103167m mVar, int i2, C8478d0 d0Var) {
                super(1);
                this.f304358d = list;
                this.f304359e = n0VarArr;
                this.f304360f = sVar;
                this.f304361g = i;
                this.f304362h = a0Var;
                this.f304363i = iArr;
                this.f304364j = h0Var;
                this.f304365n = r0VarArr;
                this.f304366o = mVar;
                this.f304367p = i2;
                this.f304368q = d0Var;
            }

            public Object invoke(Object obj) {
                C8478d0 d0Var;
                int[] iArr;
                int i;
                C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
                C103154h0 h0Var = C103154h0.Horizontal;
                C87412m.m108594g(aVar, "$this$layout");
                int size = this.f304358d.size();
                int[] iArr2 = new int[size];
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C109854n0 n0Var = this.f304359e[i3];
                    C87412m.m108591d(n0Var);
                    iArr2[i3] = this.f304364j == h0Var ? n0Var.f328779d : n0Var.f328780e;
                }
                this.f304360f.mo237D(Integer.valueOf(this.f304361g), iArr2, this.f304362h.getLayoutDirection(), this.f304362h, this.f304363i);
                C109854n0[] n0VarArr = this.f304359e;
                C103189r0[] r0VarArr = this.f304365n;
                C103167m mVar = this.f304366o;
                int i4 = this.f304367p;
                C103154h0 h0Var2 = this.f304364j;
                C109827a0 a0Var = this.f304362h;
                C8478d0 d0Var2 = this.f304368q;
                int[] iArr3 = this.f304363i;
                int length = n0VarArr.length;
                int i5 = 0;
                while (i2 < length) {
                    C109854n0 n0Var2 = n0VarArr[i2];
                    int i6 = i5 + 1;
                    C87412m.m108591d(n0Var2);
                    C103189r0 r0Var = r0VarArr[i5];
                    C103167m mVar2 = r0Var != null ? r0Var.f304372c : null;
                    if (mVar2 == null) {
                        mVar2 = mVar;
                    }
                    int i7 = i4 - (h0Var2 == h0Var ? n0Var2.f328780e : n0Var2.f328779d);
                    int i8 = length;
                    C109827a0 a0Var2 = a0Var;
                    int a = mVar2.mo142916a(i7, h0Var2 == h0Var ? C33183o.Ltr : a0Var.getLayoutDirection(), n0Var2, d0Var2.f27483d);
                    if (h0Var2 == h0Var) {
                        i = i8;
                        iArr = iArr3;
                        d0Var = d0Var2;
                        C109854n0.C109855a.m149304c(aVar, n0Var2, iArr3[i5], a, 0.0f, 4, (Object) null);
                    } else {
                        i = i8;
                        iArr = iArr3;
                        d0Var = d0Var2;
                        C109854n0.C109855a.m149304c(aVar, n0Var2, a, iArr[i5], 0.0f, 4, (Object) null);
                    }
                    i2++;
                    i5 = i6;
                    a0Var = a0Var2;
                    length = i;
                    iArr3 = iArr;
                    d0Var2 = d0Var;
                }
                return C13598b0.f38549a;
            }
        }

        public C103186a(C103154h0 h0Var, float f, C27720z0 z0Var, C32230s<? super Integer, ? super int[], ? super C33183o, ? super C108322d, ? super int[], C13598b0> sVar, C103167m mVar) {
            this.f304353a = h0Var;
            this.f304354b = f;
            this.f304355c = z0Var;
            this.f304356d = sVar;
            this.f304357e = mVar;
        }

        /* renamed from: a */
        public int mo142884a(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return (this.f304353a == C103154h0.Horizontal ? C103190s.f304375c : C103190s.f304376d).invoke(list, Integer.valueOf(i), Integer.valueOf(kVar.mo143032M(this.f304354b))).intValue();
        }

        /* renamed from: b */
        public int mo142885b(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return (this.f304353a == C103154h0.Horizontal ? C103190s.f304377e : C103190s.f304378f).invoke(list, Integer.valueOf(i), Integer.valueOf(kVar.mo143032M(this.f304354b))).intValue();
        }

        /* renamed from: c */
        public int mo142886c(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return (this.f304353a == C103154h0.Horizontal ? C103190s.f304379g : C103190s.f304380h).invoke(list, Integer.valueOf(i), Integer.valueOf(kVar.mo143032M(this.f304354b))).intValue();
        }

        /* renamed from: d */
        public C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
            C103189r0[] r0VarArr;
            int i;
            int i2;
            C103189r0[] r0VarArr2;
            int i3;
            int i4;
            C109827a0 a0Var2 = a0Var;
            List<? extends C109893x> list2 = list;
            C103154h0 h0Var = C103154h0.Horizontal;
            C87412m.m108594g(a0Var2, "$this$measure");
            C87412m.m108594g(list2, "measurables");
            C103154h0 h0Var2 = this.f304353a;
            int j2 = h0Var2 == h0Var ? C108319b.m146699j(j) : C108319b.m146698i(j);
            int h = h0Var2 == h0Var ? C108319b.m146697h(j) : C108319b.m146696g(j);
            int i5 = h0Var2 == h0Var ? C108319b.m146698i(j) : C108319b.m146699j(j);
            int g = h0Var2 == h0Var ? C108319b.m146696g(j) : C108319b.m146697h(j);
            int M = a0Var2.mo143032M(this.f304354b);
            C109854n0[] n0VarArr = new C109854n0[list.size()];
            int size = list.size();
            C103189r0[] r0VarArr3 = new C103189r0[size];
            for (int i6 = 0; i6 < size; i6++) {
                r0VarArr3[i6] = C103185q0.m136571b((C109846j) list2.get(i6));
            }
            int size2 = list.size();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            float f = 0.0f;
            int i15 = 0;
            int i16 = 0;
            while (i7 < size2) {
                C109893x xVar = (C109893x) list2.get(i7);
                float c = C103185q0.m136572c(r0VarArr3[i7]);
                if (c > 0.0f) {
                    f += c;
                    i9++;
                    i4 = size2;
                } else {
                    i4 = size2;
                    int i17 = h == Integer.MAX_VALUE ? Integer.MAX_VALUE : h - i15;
                    C103154h0 h0Var3 = this.f304353a;
                    C87412m.m108594g(h0Var3, "orientation");
                    C109854n0 K = xVar.mo161155K(h0Var3 == h0Var ? C108321c.m146704a(0, i17, 0, g) : C108321c.m146704a(0, g, 0, i17));
                    i16 = Math.min(M, (h - i15) - (this.f304353a == h0Var ? K.f328779d : K.f328780e));
                    C103154h0 h0Var4 = this.f304353a;
                    i15 += (h0Var4 == h0Var ? K.f328779d : K.f328780e) + i16;
                    i8 = Math.max(i8, h0Var4 == h0Var ? K.f328780e : K.f328779d);
                    n0VarArr[i7] = K;
                }
                i7++;
                C109827a0 a0Var3 = a0Var;
                size2 = i4;
            }
            int i18 = i8;
            if (i9 == 0) {
                i15 -= i16;
                r0VarArr = r0VarArr3;
                i = i18;
                i2 = 0;
            } else {
                int i19 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                int i25 = M * (i9 - 1);
                int i26 = (((i19 <= 0 || h == Integer.MAX_VALUE) ? j2 : h) - i15) - i25;
                float f2 = i19 > 0 ? ((float) i26) / f : 0.0f;
                int i27 = 0;
                for (int i28 = 0; i28 < size; i28++) {
                    i27 += C60641c.m70921b(C103185q0.m136572c(r0VarArr3[i28]) * f2);
                }
                int size3 = list.size();
                int i29 = i26 - i27;
                i = i18;
                int i35 = 0;
                int i36 = 0;
                while (i35 < size3) {
                    if (n0VarArr[i35] == null) {
                        C109893x xVar2 = (C109893x) list2.get(i35);
                        i3 = size3;
                        C103189r0 r0Var = r0VarArr3[i35];
                        float c2 = C103185q0.m136572c(r0Var);
                        boolean z = true;
                        if (c2 > 0.0f) {
                            int i37 = i29 < 0 ? -1 : i29 > 0 ? 1 : 0;
                            int i38 = i29 - i37;
                            int b = C60641c.m70921b(c2 * f2) + i37;
                            r0VarArr2 = r0VarArr3;
                            int max = Math.max(0, b);
                            if (r0Var != null) {
                                z = r0Var.f304371b;
                            }
                            int i39 = (!z || max == Integer.MAX_VALUE) ? 0 : max;
                            C103154h0 h0Var5 = this.f304353a;
                            C87412m.m108594g(h0Var5, "orientation");
                            C109854n0 K2 = xVar2.mo161155K(h0Var5 == h0Var ? C108321c.m146704a(i39, max, 0, g) : C108321c.m146704a(0, g, i39, max));
                            C103154h0 h0Var6 = this.f304353a;
                            i36 += h0Var6 == h0Var ? K2.f328779d : K2.f328780e;
                            i = Math.max(i, h0Var6 == h0Var ? K2.f328780e : K2.f328779d);
                            n0VarArr[i35] = K2;
                            i29 = i38;
                        } else {
                            throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                        }
                    } else {
                        i3 = size3;
                        r0VarArr2 = r0VarArr3;
                    }
                    i35++;
                    list2 = list;
                    size3 = i3;
                    r0VarArr3 = r0VarArr2;
                }
                r0VarArr = r0VarArr3;
                i2 = i36 + i25;
                int i44 = h - i15;
                if (i2 > i44) {
                    i2 = i44;
                }
            }
            C8478d0 d0Var = new C8478d0();
            int max2 = Math.max(i15 + i2, j2);
            int max3 = (g == Integer.MAX_VALUE || this.f304355c != C27720z0.Expand) ? Math.max(i, Math.max(i5, d0Var.f27483d + 0)) : g;
            C103154h0 h0Var7 = this.f304353a;
            int i45 = h0Var7 == h0Var ? max2 : max3;
            int i46 = h0Var7 == h0Var ? max3 : max2;
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i47 = 0; i47 < size4; i47++) {
                iArr[i47] = 0;
            }
            return C109827a0.C109828a.m149247b(a0Var, i45, i46, (Map) null, new C103187a(list, n0VarArr, this.f304356d, max2, a0Var, iArr, this.f304353a, r0VarArr, this.f304357e, max3, d0Var), 4, (Object) null);
        }

        /* renamed from: e */
        public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return (this.f304353a == C103154h0.Horizontal ? C103190s.f304373a : C103190s.f304374b).invoke(list, Integer.valueOf(i), Integer.valueOf(kVar.mo143032M(this.f304354b))).intValue();
        }
    }

    /* renamed from: a */
    public static final int m136570a(List list, C32227p pVar, C32227p pVar2, int i, int i2, C103154h0 h0Var, C103154h0 h0Var2) {
        boolean z = true;
        if (h0Var == h0Var2) {
            int size = list.size();
            int i3 = 0;
            float f = 0.0f;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C109846j jVar = (C109846j) list.get(i5);
                float c = m136572c(m136571b(jVar));
                int intValue = ((Number) pVar.invoke(jVar, Integer.valueOf(i))).intValue();
                if (c == 0.0f) {
                    i4 += intValue;
                } else if (c > 0.0f) {
                    f += c;
                    i3 = Math.max(i3, C60641c.m70921b(((float) intValue) / c));
                }
            }
            return C60641c.m70921b(((float) i3) * f) + i4 + ((list.size() - 1) * i2);
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        float f2 = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            C109846j jVar2 = (C109846j) list.get(i7);
            float c2 = m136572c(m136571b(jVar2));
            if (c2 == 0.0f) {
                int min2 = Math.min(((Number) pVar2.invoke(jVar2, Integer.MAX_VALUE)).intValue(), i - min);
                min += min2;
                i6 = Math.max(i6, ((Number) pVar.invoke(jVar2, Integer.valueOf(min2))).intValue());
            } else if (c2 > 0.0f) {
                f2 += c2;
            }
        }
        if (f2 != 0.0f) {
            z = false;
        }
        int b = z ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : C60641c.m70921b(((float) Math.max(i - min, 0)) / f2);
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            C109846j jVar3 = (C109846j) list.get(i8);
            float c3 = m136572c(m136571b(jVar3));
            if (c3 > 0.0f) {
                i6 = Math.max(i6, ((Number) pVar.invoke(jVar3, Integer.valueOf(b != Integer.MAX_VALUE ? C60641c.m70921b(((float) b) * c3) : Integer.MAX_VALUE))).intValue());
            }
        }
        return i6;
    }

    /* renamed from: b */
    public static final C103189r0 m136571b(C109846j jVar) {
        Object c = jVar.mo161159c();
        if (c instanceof C103189r0) {
            return (C103189r0) c;
        }
        return null;
    }

    /* renamed from: c */
    public static final float m136572c(C103189r0 r0Var) {
        if (r0Var != null) {
            return r0Var.f304370a;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public static final C109895y m136573d(C103154h0 h0Var, C32230s<? super Integer, ? super int[], ? super C33183o, ? super C108322d, ? super int[], C13598b0> sVar, float f, C27720z0 z0Var, C103167m mVar) {
        C87412m.m108594g(h0Var, "orientation");
        C87412m.m108594g(sVar, "arrangement");
        C87412m.m108594g(z0Var, "crossAxisSize");
        C87412m.m108594g(mVar, "crossAxisAlignment");
        return new C103186a(h0Var, f, z0Var, sVar, mVar);
    }
}
