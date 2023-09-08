package p257w;

import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import java.util.Map;
import my3.C61595o;
import p257w.C37919o;
import p257w.C37931s1;
import rx3.C13604l;

/* renamed from: w.w1 */
public final class C37945w1<V extends C37919o> implements C37931s1<V> {

    /* renamed from: a */
    public final Map<Integer, C13604l<V, C37950z>> f100395a;

    /* renamed from: b */
    public final int f100396b;

    /* renamed from: c */
    public final int f100397c;

    /* renamed from: d */
    public V f100398d;

    /* renamed from: e */
    public V f100399e;

    public C37945w1(Map<Integer, ? extends C13604l<? extends V, ? extends C37950z>> map, int i, int i2) {
        C87412m.m108594g(map, "keyframes");
        this.f100395a = map;
        this.f100396b = i;
        this.f100397c = i2;
    }

    /* renamed from: a */
    public boolean mo61417a() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r9v13, types: [A] */
    /* JADX WARNING: type inference failed for: r13v9, types: [A] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V mo61418b(long r9, V r11, V r12, V r13) {
        /*
            r8 = this;
            java.lang.String r0 = "initialValue"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "targetValue"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "initialVelocity"
            gy3.C87412m.m108594g(r13, r0)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 / r0
            int r13 = r8.mo61431e()
            long r0 = (long) r13
            long r2 = r9 - r0
            int r9 = r8.mo61432f()
            long r6 = (long) r9
            r4 = 0
            long r9 = my3.C61595o.m72298f(r2, r4, r6)
            int r10 = (int) r9
            java.util.Map<java.lang.Integer, rx3.l<V, w.z>> r9 = r8.f100395a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r9 = r9.containsKey(r13)
            if (r9 == 0) goto L_0x0043
            java.util.Map<java.lang.Integer, rx3.l<V, w.z>> r9 = r8.f100395a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r9 = sx3.C90364q0.m113145d(r9, r10)
            rx3.l r9 = (rx3.C13604l) r9
            A r9 = r9.f38555d
            w.o r9 = (p257w.C37919o) r9
            return r9
        L_0x0043:
            int r9 = r8.f100396b
            if (r10 < r9) goto L_0x0048
            return r12
        L_0x0048:
            if (r10 > 0) goto L_0x004b
            return r11
        L_0x004b:
            w.a0$a r13 = p257w.C37890a0.C37891a.f100294a
            java.util.Map<java.lang.Integer, rx3.l<V, w.z>> r0 = r8.f100395a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r11
            r2 = 0
        L_0x005a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0090
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r4.getValue()
            rx3.l r4 = (rx3.C13604l) r4
            if (r10 <= r5) goto L_0x0085
            if (r5 < r2) goto L_0x0085
            A r13 = r4.f38555d
            r3 = r13
            w.o r3 = (p257w.C37919o) r3
            B r13 = r4.f38556e
            w.z r13 = (p257w.C37950z) r13
            r2 = r5
            goto L_0x005a
        L_0x0085:
            if (r10 >= r5) goto L_0x005a
            if (r5 > r9) goto L_0x005a
            A r9 = r4.f38555d
            r12 = r9
            w.o r12 = (p257w.C37919o) r12
            r9 = r5
            goto L_0x005a
        L_0x0090:
            int r10 = r10 - r2
            float r10 = (float) r10
            int r9 = r9 - r2
            float r9 = (float) r9
            float r10 = r10 / r9
            float r9 = r13.mo61380a(r10)
            V r10 = r8.f100398d
            if (r10 != 0) goto L_0x00a9
            w.o r10 = r11.mo61403c()
            r8.f100398d = r10
            w.o r10 = r11.mo61403c()
            r8.f100399e = r10
        L_0x00a9:
            int r10 = r3.mo61402b()
        L_0x00ad:
            java.lang.String r11 = "valueVector"
            r13 = 0
            if (r1 >= r10) goto L_0x00d2
            V r0 = r8.f100398d
            if (r0 == 0) goto L_0x00ce
            float r11 = r3.mo61401a(r1)
            float r13 = r12.mo61401a(r1)
            w.k1<java.lang.Float, w.l> r2 = p257w.C111656m1.f334256a
            r2 = 1
            float r2 = (float) r2
            float r2 = r2 - r9
            float r11 = r11 * r2
            float r13 = r13 * r9
            float r11 = r11 + r13
            r0.mo61405e(r1, r11)
            int r1 = r1 + 1
            goto L_0x00ad
        L_0x00ce:
            gy3.C87412m.m108603p(r11)
            throw r13
        L_0x00d2:
            V r9 = r8.f100398d
            if (r9 == 0) goto L_0x00d7
            return r9
        L_0x00d7:
            gy3.C87412m.m108603p(r11)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C37945w1.mo61418b(long, w.o, w.o, w.o):w.o");
    }

    /* renamed from: c */
    public V mo61419c(long j, V v, V v2, V v3) {
        V v4 = v3;
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v4, "initialVelocity");
        long f = C61595o.m72298f((j / TimeUtil.SECOND_TO_US) - ((long) mo61431e()), 0, (long) mo61432f());
        if (f <= 0) {
            return v4;
        }
        V v5 = v;
        V v6 = v2;
        V v7 = v3;
        C37919o a = C37925q1.m41620a(this, f - 1, v5, v6, v7);
        C37919o a2 = C37925q1.m41620a(this, f, v5, v6, v7);
        if (this.f100398d == null) {
            this.f100398d = v.mo61403c();
            this.f100399e = v.mo61403c();
        }
        int i = 0;
        int b = a.mo61402b();
        while (i < b) {
            V v8 = this.f100399e;
            if (v8 != null) {
                v8.mo61405e(i, (a.mo61401a(i) - a2.mo61401a(i)) * 1000.0f);
                i++;
            } else {
                C87412m.m108603p("velocityVector");
                throw null;
            }
        }
        V v9 = this.f100399e;
        if (v9 != null) {
            return v9;
        }
        C87412m.m108603p("velocityVector");
        throw null;
    }

    /* renamed from: d */
    public long mo61420d(V v, V v2, V v3) {
        return C37931s1.C37932a.m41629a(this, v, v2, v3);
    }

    /* renamed from: e */
    public int mo61431e() {
        return this.f100397c;
    }

    /* renamed from: f */
    public int mo61432f() {
        return this.f100396b;
    }

    /* renamed from: g */
    public V mo61421g(V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        return mo61419c(mo61420d(v, v2, v3), v, v2, v3);
    }
}
