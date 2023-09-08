package p720v;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p257w.C111656m1;
import p257w.C111669n;
import p257w.C37906k1;
import p436a1.C103272w;
import p450b1.C103979c;

/* renamed from: v.j */
public final class C111263j {

    /* renamed from: a */
    public static final C32226l<C103979c, C37906k1<C103272w, C111669n>> f333147a = C111264a.f333150d;

    /* renamed from: b */
    public static final float[] f333148b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* renamed from: c */
    public static final float[] f333149c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    /* renamed from: v.j$a */
    public static final class C111264a extends C87413o implements C32226l<C103979c, C37906k1<C103272w, C111669n>> {

        /* renamed from: d */
        public static final C111264a f333150d = new C111264a();

        public C111264a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C103979c cVar = (C103979c) obj;
            C87412m.m108594g(cVar, "colorSpace");
            return C111656m1.m152187a(C111258h.f333140d, new C111260i(cVar));
        }
    }

    /* renamed from: a */
    public static final float m151770a(int i, float f, float f2, float f3, float[] fArr) {
        return (f * fArr[i]) + (f2 * fArr[i + 3]) + (f3 * fArr[i + 6]);
    }
}
