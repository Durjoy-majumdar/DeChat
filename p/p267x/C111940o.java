package p267x;

import android.view.View;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C103691v;
import androidx.compose.p002ui.platform.C54160b1;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110100f;
import p1165z.C112527l;
import p1165z.C112530o;
import p175j0.C108497e2;
import p175j0.C108499f1;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p190l1.C109099h0;
import p246u1.C111072h;
import p246u1.C111082p;
import p721v0.C111299g;
import p721v0.C65503j;
import p904j1.C108524d;
import p904j1.C108525e;
import p904j1.C76379b;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: x.o */
public final class C111940o {

    /* renamed from: x.o$a */
    public static final class C111941a extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<C112530o> f335121d;

        /* renamed from: e */
        public final /* synthetic */ C112527l f335122e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111941a(C60690y0<C112530o> y0Var, C112527l lVar) {
            super(1);
            this.f335121d = y0Var;
            this.f335122e = lVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            return new C111937n(this.f335121d, this.f335122e);
        }
    }

    /* renamed from: x.o$b */
    public static final class C111942b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112527l f335123d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<C112530o> f335124e;

        /* renamed from: f */
        public final /* synthetic */ int f335125f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111942b(C112527l lVar, C60690y0<C112530o> y0Var, int i) {
            super(2);
            this.f335123d = lVar;
            this.f335124e = y0Var;
            this.f335125f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C111940o.m152648a(this.f335123d, this.f335124e, (C108504h) obj, this.f335125f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: x.o$c */
    public static final class C111943c extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f335126d;

        /* renamed from: e */
        public final /* synthetic */ boolean f335127e;

        /* renamed from: f */
        public final /* synthetic */ C112527l f335128f;

        /* renamed from: g */
        public final /* synthetic */ C111907e1 f335129g;

        /* renamed from: h */
        public final /* synthetic */ String f335130h;

        /* renamed from: i */
        public final /* synthetic */ C111072h f335131i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111943c(C32224a<C13598b0> aVar, boolean z, C112527l lVar, C111907e1 e1Var, String str, C111072h hVar) {
            super(3);
            this.f335126d = aVar;
            this.f335127e = z;
            this.f335128f = lVar;
            this.f335129g = e1Var;
            this.f335130h = str;
            this.f335131i = hVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g((C65503j) obj, "$this$composed");
            hVar.mo51557H(92076020);
            C60667k2<T> e = C108500f2.m146998e(this.f335126d, hVar, 0);
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            Object obj4 = C108504h.C60656a.f172772a;
            if (q == obj4) {
                q = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            C60690y0 y0Var = (C60690y0) q;
            hVar.mo51557H(1841981204);
            if (this.f335127e) {
                C111940o.m152648a(this.f335128f, y0Var, hVar, 48);
            }
            hVar.mo51565P();
            int i = C111972z.f335219b;
            hVar.mo51557H(-1990508712);
            C53276y yVar = new C53276y((View) hVar.mo51598m(C103691v.f306272f));
            hVar.mo51565P();
            hVar.mo51557H(-492369756);
            Object q2 = hVar.mo51606q();
            if (q2 == obj4) {
                q2 = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);
                hVar.mo51553F(q2);
            }
            hVar.mo51565P();
            C60690y0 y0Var2 = (C60690y0) q2;
            C60667k2 e2 = C108500f2.m146998e(new C66226r(y0Var2, yVar), hVar, 0);
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C112527l lVar = this.f335128f;
            Boolean valueOf = Boolean.valueOf(this.f335127e);
            C111954s sVar = r4;
            C111954s sVar2 = new C111954s(this.f335127e, this.f335128f, y0Var, e2, e, (C15601d<? super C111954s>) null);
            C65503j b = C109099h0.m148138b(aVar, lVar, valueOf, sVar);
            hVar.mo51557H(-492369756);
            Object q3 = hVar.mo51606q();
            if (q3 == obj4) {
                q3 = new C111949q(y0Var2);
                hVar.mo51553F(q3);
            }
            hVar.mo51565P();
            C65503j jVar = (C65503j) q3;
            C87412m.m108594g(jVar, "other");
            C112527l lVar2 = this.f335128f;
            C111907e1 e1Var = this.f335129g;
            boolean z = this.f335127e;
            String str = this.f335130h;
            C111072h hVar2 = this.f335131i;
            C32224a<C13598b0> aVar2 = this.f335126d;
            C87412m.m108594g(b, "gestureModifiers");
            C87412m.m108594g(lVar2, "interactionSource");
            C87412m.m108594g(aVar2, "onClick");
            C65503j b2 = C111082p.m151476b(jVar, true, new C111961v(hVar2, str, (C32224a<C13598b0>) null, (String) null, z, aVar2));
            C111963w wVar = new C111963w(z, aVar2);
            C110100f<C108524d> fVar = C108525e.f324865a;
            C87412m.m108594g(b2, "<this>");
            C32226l<C103618e1, C13598b0> lVar3 = C103612c1.f306063a;
            C65503j a = C103612c1.m137790a(b2, lVar3, new C108524d(wVar, (C32226l<? super C76379b, Boolean>) null));
            C108499f1<C111907e1> f1Var = C111912g1.f335027a;
            C87412m.m108594g(a, "<this>");
            C65503j a2 = C111299g.m151786a(a, lVar3, new C111916h1(e1Var, lVar2));
            C87412m.m108594g(a2, "<this>");
            C65503j a3 = C111299g.m151786a(a2, lVar3, new C111892c1(lVar2, z));
            C54160b1 b1Var = C111952r0.f335147a;
            C87412m.m108594g(a3, "<this>");
            C65503j i0 = C111299g.m151786a(a3, lVar3, new C111950q0(z, lVar2)).mo74972i0(b);
            hVar.mo51565P();
            return i0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r2 == p175j0.C108504h.C60656a.f172772a) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m152648a(p1165z.C112527l r3, p175j0.C60690y0<p1165z.C112530o> r4, p175j0.C108504h r5, int r6) {
        /*
            java.lang.String r0 = "interactionSource"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "pressedInteraction"
            gy3.C87412m.m108594g(r4, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = 1761107222(0x68f85d16, float:9.382912E24)
            j0.h r5 = r5.mo51623z(r0)
            r0 = r6 & 14
            if (r0 != 0) goto L_0x0022
            boolean r0 = r5.mo51619x(r3)
            if (r0 == 0) goto L_0x001f
            r0 = 4
            goto L_0x0020
        L_0x001f:
            r0 = 2
        L_0x0020:
            r0 = r0 | r6
            goto L_0x0023
        L_0x0022:
            r0 = r6
        L_0x0023:
            r1 = r6 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0033
            boolean r1 = r5.mo51619x(r4)
            if (r1 == 0) goto L_0x0030
            r1 = 32
            goto L_0x0032
        L_0x0030:
            r1 = 16
        L_0x0032:
            r0 = r0 | r1
        L_0x0033:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L_0x0044
            boolean r1 = r5.mo51575a()
            if (r1 != 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            r5.mo51581d()
            goto L_0x0071
        L_0x0044:
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.mo51557H(r1)
            boolean r1 = r5.mo51619x(r4)
            boolean r2 = r5.mo51619x(r3)
            r1 = r1 | r2
            java.lang.Object r2 = r5.mo51606q()
            if (r1 != 0) goto L_0x005f
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r1) goto L_0x0067
        L_0x005f:
            x.o$a r2 = new x.o$a
            r2.<init>(r4, r3)
            r5.mo51553F(r2)
        L_0x0067:
            r5.mo51565P()
            fy3.l r2 = (fy3.C32226l) r2
            r0 = r0 & 14
            p175j0.C60655g0.m70930a(r3, r2, r5, r0)
        L_0x0071:
            j0.v1 r5 = r5.mo51596l()
            if (r5 != 0) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            x.o$b r0 = new x.o$b
            r0.<init>(r3, r4, r6)
            r5.mo51650a(r0)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p267x.C111940o.m152648a(z.l, j0.y0, j0.h, int):void");
    }

    /* renamed from: b */
    public static final C65503j m152649b(C65503j jVar, C112527l lVar, C111907e1 e1Var, boolean z, String str, C111072h hVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(jVar, "$this$clickable");
        C87412m.m108594g(lVar, "interactionSource");
        C87412m.m108594g(aVar, "onClick");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C111943c(aVar, z, lVar, e1Var, str, hVar));
    }

    /* renamed from: c */
    public static /* synthetic */ C65503j m152650c(C65503j jVar, C112527l lVar, C111907e1 e1Var, boolean z, String str, C111072h hVar, C32224a aVar, int i, Object obj) {
        return m152649b(jVar, lVar, e1Var, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : hVar, aVar);
    }

    /* renamed from: d */
    public static C65503j m152651d(C65503j jVar, boolean z, String str, C111072h hVar, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            hVar = null;
        }
        C87412m.m108594g(jVar, "$this$clickable");
        C87412m.m108594g(aVar, "onClick");
        return C111299g.m151786a(jVar, C103612c1.f306063a, new C111946p(z, str, hVar, aVar));
    }
}
