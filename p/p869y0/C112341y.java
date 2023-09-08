package p869y0;

import androidx.compose.p002ui.platform.C103612c1;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110097c;
import p1140p1.C110100f;
import p175j0.C108504h;
import p721v0.C111299g;
import p721v0.C65503j;

/* renamed from: y0.y */
public final class C112341y {

    /* renamed from: a */
    public static final C110100f<C112344z> f336370a = C110097c.m149686a(C112342a.f336371d);

    /* renamed from: y0.y$a */
    public static final class C112342a extends C87413o implements C32224a<C112344z> {

        /* renamed from: d */
        public static final C112342a f336371d = new C112342a();

        public C112342a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* renamed from: y0.y$b */
    public static final class C112343b extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

        /* renamed from: d */
        public final /* synthetic */ C112339w f336372d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112343b(C112339w wVar) {
            super(3);
            this.f336372d = wVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
            if (r0 == p175j0.C108504h.C60656a.f172772a) goto L_0x002c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                v0.j r2 = (p721v0.C65503j) r2
                j0.h r3 = (p175j0.C108504h) r3
                java.lang.Number r4 = (java.lang.Number) r4
                r4.intValue()
                java.lang.String r4 = "$this$composed"
                gy3.C87412m.m108594g(r2, r4)
                r2 = -307396750(0xffffffffedad7f72, float:-6.7118723E27)
                r3.mo51557H(r2)
                y0.w r2 = r1.f336372d
                r4 = 1157296644(0x44faf204, float:2007.563)
                r3.mo51557H(r4)
                boolean r4 = r3.mo51619x(r2)
                java.lang.Object r0 = r3.mo51606q()
                if (r4 != 0) goto L_0x002c
                int r4 = p175j0.C108504h.f324828a
                java.lang.Object r4 = p175j0.C108504h.C60656a.f172772a
                if (r0 != r4) goto L_0x0034
            L_0x002c:
                y0.z r0 = new y0.z
                r0.<init>(r2)
                r3.mo51553F(r0)
            L_0x0034:
                r3.mo51565P()
                y0.z r0 = (p869y0.C112344z) r0
                r3.mo51565P()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p869y0.C112341y.C112343b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final C65503j m153266a(C65503j jVar, C112339w wVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(wVar, "focusRequester");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C112343b(wVar));
    }
}
