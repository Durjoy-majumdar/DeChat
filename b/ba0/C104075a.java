package ba0;

import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import ca0.C54683f0;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p246u1.C111072h;
import p257w.C37903i;
import p257w.C37950z;
import p267x.C111897d1;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103138e;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103161k;
import p435a0.C103165l;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103203t0;
import p435a0.C103206u0;
import p435a0.C103214y0;
import p436a1.C103272w;
import p436a1.C103274x;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109836f;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p720v.C111239a0;
import p720v.C111247c;
import p720v.C111278o;
import p720v.C111292y;
import p720v.C65500d;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import ta0.C110954a;
import va0.C111494a;
import va0.C111498c;
import va0.C111501d;

/* renamed from: ba0.a */
public final class C104075a {

    /* renamed from: ba0.a$a */
    public static final class C54430a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f152670d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f152671e;

        /* renamed from: f */
        public final /* synthetic */ int f152672f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54430a(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, int i) {
            super(2);
            this.f152670d = aVar;
            this.f152671e = aVar2;
            this.f152672f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104075a.m138823a(this.f152670d, this.f152671e, (C108504h) obj, this.f152672f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ba0.a$c */
    public static final class C54431c extends C87413o implements C32226l<Integer, Integer> {

        /* renamed from: d */
        public static final C54431c f152673d = new C54431c();

        public C54431c() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue());
        }
    }

    /* renamed from: ba0.a$d */
    public static final class C54432d extends C87413o implements C32226l<Integer, Integer> {

        /* renamed from: d */
        public static final C54432d f152674d = new C54432d();

        public C54432d() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue());
        }
    }

    /* renamed from: ba0.a$e */
    public static final class C54433e extends C87413o implements C32228q<C65500d, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Boolean> f152675d;

        /* renamed from: e */
        public final /* synthetic */ C54683f0 f152676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54433e(C60690y0<Boolean> y0Var, C54683f0 f0Var) {
            super(3);
            this.f152675d = y0Var;
            this.f152676e = f0Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: fy3.a} */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
            if (r10 == p175j0.C108504h.C60656a.f172772a) goto L_0x0027;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            /*
                r7 = this;
                v.d r8 = (p720v.C65500d) r8
                r4 = r9
                j0.h r4 = (p175j0.C108504h) r4
                java.lang.Number r10 = (java.lang.Number) r10
                r10.intValue()
                java.lang.String r9 = "$this$AnimatedVisibility"
                gy3.C87412m.m108594g(r8, r9)
                j0.y0<java.lang.Boolean> r8 = r7.f152675d
                r9 = 1157296644(0x44faf204, float:2007.563)
                r4.mo51557H(r9)
                boolean r9 = r4.mo51619x(r8)
                java.lang.Object r10 = r4.mo51606q()
                if (r9 != 0) goto L_0x0027
                int r9 = p175j0.C108504h.f324828a
                java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
                if (r10 != r9) goto L_0x002f
            L_0x0027:
                ba0.c r10 = new ba0.c
                r10.<init>(r8)
                r4.mo51553F(r10)
            L_0x002f:
                r4.mo51565P()
                r0 = r10
                fy3.a r0 = (fy3.C32224a) r0
                ca0.f0 r1 = r7.f152676e
                ca0.e0 r2 = ca0.C104344e0.f308940k
                r3 = 0
                r5 = 448(0x1c0, float:6.28E-43)
                r6 = 8
                ca0.C104353p.m139326e(r0, r1, r2, r3, r4, r5, r6)
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ba0.C104075a.C54433e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ba0.a$f */
    public static final class C54434f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54683f0 f152677d;

        /* renamed from: e */
        public final /* synthetic */ int f152678e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54434f(C54683f0 f0Var, int i) {
            super(2);
            this.f152677d = f0Var;
            this.f152678e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104075a.m138824b(this.f152677d, (C108504h) obj, this.f152678e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ba0.a$g */
    public static final class C54435g extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f152679d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f152680e;

        /* renamed from: f */
        public final /* synthetic */ C54683f0 f152681f;

        /* renamed from: g */
        public final /* synthetic */ int f152682g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54435g(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C54683f0 f0Var, int i) {
            super(2);
            this.f152679d = aVar;
            this.f152680e = aVar2;
            this.f152681f = f0Var;
            this.f152682g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104075a.m138825c(this.f152679d, this.f152680e, this.f152681f, (C108504h) obj, this.f152682g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ba0.a$b */
    public static final class C104076b extends C87413o implements C32228q<C65500d, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Boolean> f307810d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<MJMusicInfo> f307811e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104076b(C60690y0<Boolean> y0Var, C60667k2<? extends MJMusicInfo> k2Var) {
            super(3);
            this.f307810d = y0Var;
            this.f307811e = k2Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b8, code lost:
            if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x00ba;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            /*
                r9 = this;
                v.d r10 = (p720v.C65500d) r10
                j0.h r11 = (p175j0.C108504h) r11
                java.lang.Number r12 = (java.lang.Number) r12
                r12.intValue()
                java.lang.String r12 = "$this$AnimatedVisibility"
                gy3.C87412m.m108594g(r10, r12)
                j0.y0<java.lang.Boolean> r10 = r9.f307810d
                j0.k2<com.tencent.maas.model.MJMusicInfo> r12 = r9.f307811e
                r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
                r11.mo51557H(r0)
                int r0 = p721v0.C65503j.f188489K0
                v0.j$a r0 = p721v0.C65503j.C65504a.f188490d
                a0.a$l r1 = p435a0.C103111a.f304237d
                int r2 = p721v0.C111294a.f333218a
                v0.a$b r2 = p721v0.C111294a.C111295a.f333228j
                r3 = 0
                o1.y r1 = p435a0.C103157j.m136499a(r1, r2, r11, r3)
                r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                r11.mo51557H(r2)
                j0.f1<i2.d> r2 = androidx.compose.p002ui.platform.C103645l0.f306124e
                java.lang.Object r2 = r11.mo51598m(r2)
                i2.d r2 = (p560i2.C108322d) r2
                j0.f1<i2.o> r4 = androidx.compose.p002ui.platform.C103645l0.f306130k
                java.lang.Object r4 = r11.mo51598m(r4)
                i2.o r4 = (p560i2.C33183o) r4
                j0.f1<androidx.compose.ui.platform.i2> r5 = androidx.compose.p002ui.platform.C103645l0.f306134o
                java.lang.Object r5 = r11.mo51598m(r5)
                androidx.compose.ui.platform.i2 r5 = (androidx.compose.p002ui.platform.C103633i2) r5
                q1.a$a r6 = p658q1.C110269a.f329831D0
                r6.getClass()
                fy3.a<q1.a> r6 = p658q1.C110269a.C110270a.f329833b
                fy3.q r7 = p631o1.C109863q.m149330a(r0)
                j0.d r8 = r11.mo51543A()
                boolean r8 = r8 instanceof p175j0.C24665d
                if (r8 == 0) goto L_0x00eb
                r11.mo51615v()
                boolean r8 = r11.mo51621y()
                if (r8 == 0) goto L_0x0065
                r11.mo51612t(r6)
                goto L_0x0068
            L_0x0065:
                r11.mo51579c()
            L_0x0068:
                r11.mo51561L()
                fy3.p<q1.a, o1.y, rx3.b0> r6 = p658q1.C110269a.C110270a.f329836e
                p175j0.C108508o2.m147049a(r11, r1, r6)
                fy3.p<q1.a, i2.d, rx3.b0> r1 = p658q1.C110269a.C110270a.f329835d
                p175j0.C108508o2.m147049a(r11, r2, r1)
                fy3.p<q1.a, i2.o, rx3.b0> r1 = p658q1.C110269a.C110270a.f329837f
                p175j0.C108508o2.m147049a(r11, r4, r1)
                fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r1 = p658q1.C110269a.C110270a.f329838g
                p175j0.C108508o2.m147049a(r11, r5, r1)
                r11.mo51590i()
                j0.x1 r1 = new j0.x1
                r1.<init>(r11)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                q0.b r7 = (p415q0.C35747b) r7
                r7.invoke(r1, r11, r2)
                r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                r11.mo51557H(r1)
                r1 = -1163856341(0xffffffffbaa0f62b, float:-0.0012280395)
                r11.mo51557H(r1)
                java.lang.Object r12 = r12.getValue()
                com.tencent.maas.model.MJMusicInfo r12 = (com.tencent.maas.model.MJMusicInfo) r12
                ca0.e0 r1 = ca0.C104344e0.f308940k
                r2 = 1157296644(0x44faf204, float:2007.563)
                r11.mo51557H(r2)
                boolean r2 = r11.mo51619x(r10)
                java.lang.Object r3 = r11.mo51606q()
                if (r2 != 0) goto L_0x00ba
                int r2 = p175j0.C108504h.f324828a
                java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
                if (r3 != r2) goto L_0x00c2
            L_0x00ba:
                ba0.b r3 = new ba0.b
                r3.<init>(r10)
                r11.mo51553F(r3)
            L_0x00c2:
                r11.mo51565P()
                fy3.a r3 = (fy3.C32224a) r3
                r10 = 56
                ca0.C104353p.m139327f(r12, r1, r3, r11, r10)
                r10 = 8
                float r10 = (float) r10
                float r10 = r10 * r10
                v0.j r10 = p435a0.C103214y0.m136592h(r0, r10)
                r12 = 6
                p435a0.C103129b1.m136432a(r10, r11, r12)
                r11.mo51565P()
                r11.mo51565P()
                r11.mo51610s()
                r11.mo51565P()
                r11.mo51565P()
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            L_0x00eb:
                p175j0.C108501g.m147000a()
                r10 = 0
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ba0.C104075a.C104076b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m138823a(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C108504h hVar, int i) {
        int i2;
        C108504h hVar2;
        C32224a<C13598b0> aVar3 = aVar;
        C32224a<C13598b0> aVar4 = aVar2;
        int i3 = i;
        C108504h z = hVar.mo51623z(1107773194);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(aVar3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= z.mo51619x(aVar4) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) != 18 || !z.mo51575a()) {
            int i5 = C111294a.f333218a;
            C111294a.C37634c cVar = C111294a.C111295a.f333227i;
            int i6 = C65503j.f188489K0;
            C65503j.C65504a aVar5 = C65503j.C65504a.f188490d;
            float f = (float) 8;
            C65503j e = C103166l0.m136521e(C103214y0.m136591g(aVar5, 0.0f, 1, (Object) null), ((float) 2) * f, 0.0f, 2, (Object) null);
            z.mo51557H(693286680);
            C103111a aVar6 = C103111a.f304234a;
            C109895y a = C103199s0.m136579a(C103111a.f304235b, cVar, z, 48);
            z.mo51557H(-1323940314);
            C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar7 = C110269a.f329831D0;
            aVar7.getClass();
            C32224a<C110269a> aVar8 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(e);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar8);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar7.getClass();
                C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
                aVar7.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar7.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar7.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-678309503);
                C103206u0 u0Var = C103206u0.f304394a;
                int i7 = C103272w.f304516h;
                C111897d1.m152617a(C110954a.m151253a(C0966R.raw.icons_filled_back, C103272w.f304511c, z, 48), "close_icon", C111940o.m152651d(C103214y0.m136595k(C103166l0.m136519c(aVar5, ((float) 1) * f), ((float) 1.5d) * f, ((float) 3) * f), false, (String) null, (C111072h) null, aVar2, 7, (Object) null), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, z, 56, 120);
                C103129b1.m136432a(C103203t0.C103204a.m136583a(u0Var, aVar5, 1.0f, false, 2, (Object) null), z, 0);
                C111498c.C111500b bVar = C111498c.C111500b.f333810e;
                String string = MMApplicationContext.getString(C0966R.string.f360089a13);
                C87412m.m108593f(string, "app_nextstep.str");
                hVar2 = z;
                C111494a.m152003a(aVar, (C65503j) null, bVar, (C111501d) null, false, string, (C32227p<? super C108504h, ? super Integer, C13598b0>) null, z, (i4 & 14) | 512, 90);
                hVar2.mo51565P();
                hVar2.mo51565P();
                hVar2.mo51610s();
                hVar2.mo51565P();
                hVar2.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
            hVar2 = z;
        }
        C33487v1 l = hVar2.mo51596l();
        if (l != null) {
            l.mo51650a(new C54430a(aVar3, aVar4, i3));
        }
    }

    /* renamed from: b */
    public static final void m138824b(C54683f0 f0Var, C108504h hVar, int i) {
        C108504h z = hVar.mo51623z(-754435983);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
            z.mo51553F(q);
        }
        z.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        z.mo51557H(733328855);
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, z, 0);
        z.mo51557H(-1323940314);
        C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
        C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
        C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
        C110269a.f329831D0.getClass();
        C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(aVar);
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar2);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            C108508o2.m147049a(z, c, C110269a.C110270a.f329836e);
            C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
            C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
            C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
            z.mo51590i();
            ((C35747b) a).invoke(new C33489x1(z), z, 0);
            z.mo51557H(2058660585);
            z.mo51557H(-2137368960);
            C60667k2<MJMusicInfo> k2Var = f0Var.f153250b;
            C111247c.m151758b(!((Boolean) y0Var.getValue()).booleanValue(), new C103138e(C111294a.C111295a.f333224f, false, C103612c1.f306063a), (C111292y) null, (C111239a0) null, (String) null, C110261c.m149878b(z, 61315795, true, new C104076b(y0Var, k2Var)), z, 196608, 28);
            C111247c.m151758b(((Boolean) y0Var.getValue()).booleanValue(), (C65503j) null, C111278o.m151776c(C37903i.m41595c(300, 0, (C37950z) null, 6, (Object) null), C54431c.f152673d), C111278o.m151777d(C37903i.m41595c(300, 0, (C37950z) null, 6, (Object) null), C54432d.f152674d), (String) null, C110261c.m149878b(z, 2014691452, true, new C54433e(y0Var, f0Var)), z, 200064, 18);
            z.mo51565P();
            z.mo51565P();
            z.mo51610s();
            z.mo51565P();
            z.mo51565P();
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C54434f(f0Var, i));
                return;
            }
            return;
        }
        C108501g.m147000a();
        throw null;
    }

    /* renamed from: c */
    public static final void m138825c(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C54683f0 f0Var, C108504h hVar, int i) {
        C87412m.m108594g(aVar, "onNextClick");
        C87412m.m108594g(aVar2, "onBackClick");
        C87412m.m108594g(f0Var, "musicState");
        C108504h z = hVar.mo51623z(1950322086);
        int i2 = C111294a.f333218a;
        C111294a.C37633b bVar = C111294a.C111295a.f333229k;
        int i3 = C65503j.f188489K0;
        C65503j.C65504a aVar3 = C65503j.C65504a.f188490d;
        C65503j f = C103214y0.m136590f(aVar3, 0.0f, 1, (Object) null);
        z.mo51557H(-483455358);
        C103111a aVar4 = C103111a.f304234a;
        C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
        z.mo51557H(-1323940314);
        C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
        C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
        C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
        C110269a.C110270a aVar5 = C110269a.f329831D0;
        aVar5.getClass();
        C32224a<C110269a> aVar6 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(f);
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar6);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            aVar5.getClass();
            C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
            aVar5.getClass();
            C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
            aVar5.getClass();
            C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
            aVar5.getClass();
            C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
            z.mo51590i();
            ((C35747b) a2).invoke(new C33489x1(z), z, 0);
            z.mo51557H(2058660585);
            z.mo51557H(-1163856341);
            C103165l lVar = C103165l.f304321a;
            m138823a(aVar, aVar2, z, (i & 14) | (i & 112));
            C103129b1.m136432a(C103161k.C103162a.m136505a(lVar, aVar3, 1.0f, false, 2, (Object) null), z, 0);
            m138824b(f0Var, z, 8);
            z.mo51565P();
            z.mo51565P();
            z.mo51610s();
            z.mo51565P();
            z.mo51565P();
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C54435g(aVar, aVar2, f0Var, i));
                return;
            }
            return;
        }
        C108501g.m147000a();
        throw null;
    }
}
