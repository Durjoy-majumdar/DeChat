package p267x;

import gy3.C87412m;
import p1165z.C112519f;
import p1165z.C112523i;
import p1165z.C112526k;
import p1165z.C112532q;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p436a1.C103272w;
import p436a1.C103274x;
import p835c1.C104231f;
import p835c1.C104233g;
import p835c1.C54601d;
import wx3.C15601d;

/* renamed from: x.a0 */
public final class C111881a0 implements C111907e1 {

    /* renamed from: a */
    public static final C111881a0 f334970a = new C111881a0();

    /* renamed from: x.a0$a */
    public static final class C111882a implements C111909f1 {

        /* renamed from: d */
        public final C60667k2<Boolean> f334971d;

        /* renamed from: e */
        public final C60667k2<Boolean> f334972e;

        /* renamed from: f */
        public final C60667k2<Boolean> f334973f;

        public C111882a(C60667k2<Boolean> k2Var, C60667k2<Boolean> k2Var2, C60667k2<Boolean> k2Var3) {
            C87412m.m108594g(k2Var, "isPressed");
            C87412m.m108594g(k2Var2, "isHovered");
            C87412m.m108594g(k2Var3, "isFocused");
            this.f334971d = k2Var;
            this.f334972e = k2Var2;
            this.f334973f = k2Var3;
        }

        /* renamed from: a */
        public void mo149521a(C54601d dVar) {
            C87412m.m108594g(dVar, "<this>");
            dVar.mo75508h0();
            if (this.f334971d.getValue().booleanValue()) {
                int i = C103272w.f304516h;
                C104231f.C104232a.m139087f(dVar, C103272w.m136780b(C103272w.f304510b, 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, dVar.mo145819e(), 0.0f, (C104233g) null, (C103274x) null, 0, 122, (Object) null);
            } else if (this.f334972e.getValue().booleanValue() || this.f334973f.getValue().booleanValue()) {
                int i2 = C103272w.f304516h;
                C104231f.C104232a.m139087f(dVar, C103272w.m136780b(C103272w.f304510b, 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, dVar.mo145819e(), 0.0f, (C104233g) null, (C103274x) null, 0, 122, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public C111909f1 mo149520a(C112526k kVar, C108504h hVar, int i) {
        C87412m.m108594g(kVar, "interactionSource");
        hVar.mo51557H(1683566979);
        int i2 = i & 14;
        C60667k2<Boolean> a = C112532q.m153726a(kVar, hVar, i2);
        hVar.mo51557H(1206586544);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i3 = C108504h.f324828a;
        Object obj = C108504h.C60656a.f172772a;
        if (q == obj) {
            q = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        int i4 = i2 & 14;
        C60655g0.m70932c(kVar, new C112523i(kVar, y0Var, (C15601d<? super C112523i>) null), hVar, i4);
        hVar.mo51565P();
        hVar.mo51557H(-1805515472);
        hVar.mo51557H(-492369756);
        Object q2 = hVar.mo51606q();
        if (q2 == obj) {
            q2 = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q2);
        }
        hVar.mo51565P();
        C60690y0 y0Var2 = (C60690y0) q2;
        C60655g0.m70932c(kVar, new C112519f(kVar, y0Var2, (C15601d<? super C112519f>) null), hVar, i4);
        hVar.mo51565P();
        hVar.mo51557H(1157296644);
        boolean x = hVar.mo51619x(kVar);
        Object q3 = hVar.mo51606q();
        if (x || q3 == obj) {
            q3 = new C111882a(a, y0Var, y0Var2);
            hVar.mo51553F(q3);
        }
        hVar.mo51565P();
        C111882a aVar = (C111882a) q3;
        hVar.mo51565P();
        return aVar;
    }
}
