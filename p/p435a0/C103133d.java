package p435a0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import p560i2.C108319b;
import p560i2.C108321c;
import p560i2.C108329n;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.d */
public final class C103133d extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final float f304263e;

    /* renamed from: f */
    public final boolean f304264f;

    /* renamed from: a0.d$a */
    public static final class C103134a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f304265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103134a(C109854n0 n0Var) {
            super(1);
            this.f304265d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149306f(aVar, this.f304265d, 0, 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103133d(float f, boolean z, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f304263e = f;
        this.f304264f = z;
        if (!(f > 0.0f)) {
            throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
        }
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        return i != Integer.MAX_VALUE ? C60641c.m70921b(((float) i) * this.f304263e) : jVar.mo161158Y(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (p560i2.C33181m.m39965a(r5, 0) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (p560i2.C33181m.m39965a(r5, 0) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p631o1.C109899z mo142877G(p631o1.C109827a0 r8, p631o1.C109893x r9, long r10) {
        /*
            r7 = this;
            java.lang.String r0 = "$this$measure"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "measurable"
            gy3.C87412m.m108594g(r9, r0)
            boolean r0 = r7.f304264f
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0071
            long r5 = r7.mo142890d(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x001e
            goto L_0x00ca
        L_0x001e:
            long r5 = r7.mo142889b(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x002a
            goto L_0x00ca
        L_0x002a:
            long r5 = r7.mo142893f(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x0036
            goto L_0x00ca
        L_0x0036:
            long r5 = r7.mo142891e(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x0042
            goto L_0x00ca
        L_0x0042:
            long r5 = r7.mo142890d(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x004e
            goto L_0x00ca
        L_0x004e:
            long r5 = r7.mo142889b(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x005a
            goto L_0x00ca
        L_0x005a:
            long r5 = r7.mo142893f(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x0066
            goto L_0x00ca
        L_0x0066:
            long r5 = r7.mo142891e(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x00c9
            goto L_0x00ca
        L_0x0071:
            long r5 = r7.mo142889b(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x007c
            goto L_0x00ca
        L_0x007c:
            long r5 = r7.mo142890d(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x0087
            goto L_0x00ca
        L_0x0087:
            long r5 = r7.mo142891e(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x0092
            goto L_0x00ca
        L_0x0092:
            long r5 = r7.mo142893f(r10, r2)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x009d
            goto L_0x00ca
        L_0x009d:
            long r5 = r7.mo142889b(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x00a8
            goto L_0x00ca
        L_0x00a8:
            long r5 = r7.mo142890d(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x00b3
            goto L_0x00ca
        L_0x00b3:
            long r5 = r7.mo142891e(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x00be
            goto L_0x00ca
        L_0x00be:
            long r5 = r7.mo142893f(r10, r1)
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r5 = r3
        L_0x00ca:
            boolean r0 = p560i2.C33181m.m39965a(r5, r3)
            if (r0 != 0) goto L_0x00df
            i2.b$a r10 = p560i2.C108319b.f324339b
            r11 = 32
            long r0 = r5 >> r11
            int r11 = (int) r0
            int r0 = p560i2.C33181m.m39966b(r5)
            long r10 = r10.mo158785c(r11, r0)
        L_0x00df:
            o1.n0 r9 = r9.mo161155K(r10)
            int r1 = r9.f328779d
            int r2 = r9.f328780e
            r3 = 0
            a0.d$a r4 = new a0.d$a
            r4.<init>(r9)
            r5 = 4
            r6 = 0
            r0 = r8
            o1.z r8 = p631o1.C109827a0.C109828a.m149247b(r0, r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p435a0.C103133d.mo142877G(o1.a0, o1.x, long):o1.z");
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
        return i != Integer.MAX_VALUE ? C60641c.m70921b(((float) i) / this.f304263e) : jVar.mo161157V(i);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final long mo142889b(long j, boolean z) {
        int b;
        int g = C108319b.m146696g(j);
        if (g == Integer.MAX_VALUE || (b = C60641c.m70921b(((float) g) * this.f304263e)) <= 0) {
            return 0;
        }
        long a = C108329n.m146743a(b, g);
        if (!z || C108321c.m146709f(j, a)) {
            return a;
        }
        return 0;
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d */
    public final long mo142890d(long j, boolean z) {
        int b;
        int h = C108319b.m146697h(j);
        if (h == Integer.MAX_VALUE || (b = C60641c.m70921b(((float) h) / this.f304263e)) <= 0) {
            return 0;
        }
        long a = C108329n.m146743a(h, b);
        if (!z || C108321c.m146709f(j, a)) {
            return a;
        }
        return 0;
    }

    /* renamed from: e */
    public final long mo142891e(long j, boolean z) {
        int i = C108319b.m146698i(j);
        int b = C60641c.m70921b(((float) i) * this.f304263e);
        if (b <= 0) {
            return 0;
        }
        long a = C108329n.m146743a(b, i);
        if (!z || C108321c.m146709f(j, a)) {
            return a;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C103133d dVar = obj instanceof C103133d ? (C103133d) obj : null;
        if (dVar == null) {
            return false;
        }
        return ((this.f304263e > dVar.f304263e ? 1 : (this.f304263e == dVar.f304263e ? 0 : -1)) == 0) && this.f304264f == ((C103133d) obj).f304264f;
    }

    /* renamed from: f */
    public final long mo142893f(long j, boolean z) {
        int j2 = C108319b.m146699j(j);
        int b = C60641c.m70921b(((float) j2) / this.f304263e);
        if (b <= 0) {
            return 0;
        }
        long a = C108329n.m146743a(j2, b);
        if (!z || C108321c.m146709f(j, a)) {
            return a;
        }
        return 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f304263e) * 31) + (this.f304264f ? 1231 : 1237);
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
        return i != Integer.MAX_VALUE ? C60641c.m70921b(((float) i) * this.f304263e) : jVar.mo161154G(i);
    }

    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.f304263e + ')';
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        return i != Integer.MAX_VALUE ? C60641c.m70921b(((float) i) / this.f304263e) : jVar.mo161156S(i);
    }
}
