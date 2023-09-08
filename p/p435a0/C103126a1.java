package p435a0;

import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import my3.C61595o;
import p560i2.C108319b;
import p560i2.C108321c;
import p560i2.C108325f;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.a1 */
public final class C103126a1 extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final float f304253e;

    /* renamed from: f */
    public final float f304254f;

    /* renamed from: g */
    public final float f304255g;

    /* renamed from: h */
    public final float f304256h;

    /* renamed from: i */
    public final boolean f304257i;

    /* renamed from: a0.a1$a */
    public static final class C103127a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f304258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103127a(C109854n0 n0Var) {
            super(1);
            this.f304258d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149306f(aVar, this.f304258d, 0, 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C103126a1(float f, float f2, float f3, float f4, boolean z, C32226l lVar, int i, C8480h hVar) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z, lVar, (C8480h) null);
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        long b = mo142879b(kVar);
        return C108319b.m146695f(b) ? C108319b.m146697h(b) : C108321c.m146708e(b, jVar.mo161158Y(i));
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        long b = mo142879b(a0Var);
        if (this.f304257i) {
            j2 = C108321c.m146704a(C61595o.m72297e(C108319b.m146699j(b), C108319b.m146699j(j), C108319b.m146697h(j)), C61595o.m72297e(C108319b.m146697h(b), C108319b.m146699j(j), C108319b.m146697h(j)), C61595o.m72297e(C108319b.m146698i(b), C108319b.m146698i(j), C108319b.m146696g(j)), C61595o.m72297e(C108319b.m146696g(b), C108319b.m146698i(j), C108319b.m146696g(j)));
        } else {
            if (!C108325f.m146734a(this.f304253e, Float.NaN)) {
                i = C108319b.m146699j(b);
            } else {
                i = C108319b.m146699j(j);
                int h = C108319b.m146697h(b);
                if (i > h) {
                    i = h;
                }
            }
            if (!C108325f.m146734a(this.f304255g, Float.NaN)) {
                i2 = C108319b.m146697h(b);
            } else {
                i2 = C108319b.m146697h(j);
                int j3 = C108319b.m146699j(b);
                if (i2 < j3) {
                    i2 = j3;
                }
            }
            if (!C108325f.m146734a(this.f304254f, Float.NaN)) {
                i3 = C108319b.m146698i(b);
            } else {
                i3 = C108319b.m146698i(j);
                int g = C108319b.m146696g(b);
                if (i3 > g) {
                    i3 = g;
                }
            }
            if (!C108325f.m146734a(this.f304256h, Float.NaN)) {
                i4 = C108319b.m146696g(b);
            } else {
                i4 = C108319b.m146696g(j);
                int i5 = C108319b.m146698i(b);
                if (i4 < i5) {
                    i4 = i5;
                }
            }
            j2 = C108321c.m146704a(i, i2, i3, i4);
        }
        C109854n0 K = xVar.mo161155K(j2);
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C103127a(K), 4, (Object) null);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: Y */
    public int mo142878Y(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        long b = mo142879b(kVar);
        return C108319b.m146694e(b) ? C108319b.m146696g(b) : C108321c.m146707d(b, jVar.mo161157V(i));
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r5 != Integer.MAX_VALUE) goto L_0x006a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo142879b(p560i2.C108322d r8) {
        /*
            r7 = this;
            float r0 = r7.f304255g
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = p560i2.C108325f.m146734a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L_0x0029
            float r0 = r7.f304255g
            i2.f r4 = new i2.f
            r4.<init>(r0)
            float r0 = (float) r3
            i2.f r5 = new i2.f
            r5.<init>(r0)
            int r0 = r4.compareTo(r5)
            if (r0 >= 0) goto L_0x0022
            r4 = r5
        L_0x0022:
            float r0 = r4.f324346d
            int r0 = r8.mo143032M(r0)
            goto L_0x002c
        L_0x0029:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x002c:
            float r4 = r7.f304256h
            boolean r4 = p560i2.C108325f.m146734a(r4, r1)
            if (r4 != 0) goto L_0x004f
            float r4 = r7.f304256h
            i2.f r5 = new i2.f
            r5.<init>(r4)
            float r4 = (float) r3
            i2.f r6 = new i2.f
            r6.<init>(r4)
            int r4 = r5.compareTo(r6)
            if (r4 >= 0) goto L_0x0048
            r5 = r6
        L_0x0048:
            float r4 = r5.f324346d
            int r4 = r8.mo143032M(r4)
            goto L_0x0052
        L_0x004f:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0052:
            float r5 = r7.f304253e
            boolean r5 = p560i2.C108325f.m146734a(r5, r1)
            if (r5 != 0) goto L_0x0069
            float r5 = r7.f304253e
            int r5 = r8.mo143032M(r5)
            if (r5 <= r0) goto L_0x0063
            r5 = r0
        L_0x0063:
            if (r5 >= 0) goto L_0x0066
            r5 = 0
        L_0x0066:
            if (r5 == r2) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            float r6 = r7.f304254f
            boolean r1 = p560i2.C108325f.m146734a(r6, r1)
            if (r1 != 0) goto L_0x0081
            float r1 = r7.f304254f
            int r8 = r8.mo143032M(r1)
            if (r8 <= r4) goto L_0x007b
            r8 = r4
        L_0x007b:
            if (r8 >= 0) goto L_0x007e
            r8 = 0
        L_0x007e:
            if (r8 == r2) goto L_0x0081
            r3 = r8
        L_0x0081:
            long r0 = p560i2.C108321c.m146704a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p435a0.C103126a1.mo142879b(i2.d):long");
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C103126a1)) {
            return false;
        }
        C103126a1 a1Var = (C103126a1) obj;
        return C108325f.m146734a(this.f304253e, a1Var.f304253e) && C108325f.m146734a(this.f304254f, a1Var.f304254f) && C108325f.m146734a(this.f304255g, a1Var.f304255g) && C108325f.m146734a(this.f304256h, a1Var.f304256h) && this.f304257i == a1Var.f304257i;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f304253e) * 31) + Float.floatToIntBits(this.f304254f)) * 31) + Float.floatToIntBits(this.f304255g)) * 31) + Float.floatToIntBits(this.f304256h)) * 31;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: s0 */
    public int mo142882s0(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        long b = mo142879b(kVar);
        return C108319b.m146695f(b) ? C108319b.m146697h(b) : C108321c.m146708e(b, jVar.mo161154G(i));
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        long b = mo142879b(kVar);
        return C108319b.m146694e(b) ? C108319b.m146696g(b) : C108321c.m146707d(b, jVar.mo161156S(i));
    }

    public C103126a1(float f, float f2, float f3, float f4, boolean z, C32226l lVar, C8480h hVar) {
        super(lVar);
        this.f304253e = f;
        this.f304254f = f2;
        this.f304255g = f3;
        this.f304256h = f4;
        this.f304257i = z;
    }
}
