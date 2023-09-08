package z90;

import a14.C0000n0;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import androidx.compose.p002ui.platform.C54195x1;
import ca0.C54683f0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fa0.C107530a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p004b0.C103953l0;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60690y0;
import p246u1.C111072h;
import p257w.C37892b0;
import p267x.C111897d1;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103153h;
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
import p720v.C111265k;
import p720v.C65500d;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import ta0.C110954a;
import va0.C111494a;
import va0.C111498c;
import va0.C111501d;

/* renamed from: z90.o */
public final class C112615o {

    /* renamed from: z90.o$b */
    public static final class C66763b extends C87413o implements C32226l<Integer, Integer> {

        /* renamed from: d */
        public static final C66763b f191837d = new C66763b();

        public C66763b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue());
        }
    }

    /* renamed from: z90.o$c */
    public static final class C66764c extends C87413o implements C32226l<Integer, Integer> {

        /* renamed from: d */
        public static final C66764c f191838d = new C66764c();

        public C66764c() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Integer.valueOf(((Number) obj).intValue());
        }
    }

    /* renamed from: z90.o$d */
    public static final class C66765d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f191839d;

        /* renamed from: e */
        public final /* synthetic */ C54195x1 f191840e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<C66737a> f191841f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66765d(C32224a<C13598b0> aVar, C54195x1 x1Var, C60690y0<C66737a> y0Var) {
            super(0);
            this.f191839d = aVar;
            this.f191840e = x1Var;
            this.f191841f = y0Var;
        }

        public Object invoke() {
            if (this.f191841f.getValue() != C66737a.MusicSearchPanel) {
                this.f191839d.invoke();
            } else {
                C54195x1 x1Var = this.f191840e;
                if (x1Var != null) {
                    x1Var.hide();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: z90.o$e */
    public static final class C66766e extends C87413o implements C32228q<C65500d, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ float f191842d;

        /* renamed from: e */
        public final /* synthetic */ int f191843e;

        /* renamed from: f */
        public final /* synthetic */ boolean f191844f;

        /* renamed from: g */
        public final /* synthetic */ C0000n0 f191845g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f191846h;

        /* renamed from: i */
        public final /* synthetic */ C60690y0<C66737a> f191847i;

        /* renamed from: j */
        public final /* synthetic */ C60690y0<Boolean> f191848j;

        /* renamed from: n */
        public final /* synthetic */ C54683f0 f191849n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66766e(float f, int i, boolean z, C0000n0 n0Var, C32224a<C13598b0> aVar, C60690y0<C66737a> y0Var, C60690y0<Boolean> y0Var2, C54683f0 f0Var) {
            super(3);
            this.f191842d = f;
            this.f191843e = i;
            this.f191844f = z;
            this.f191845g = n0Var;
            this.f191846h = aVar;
            this.f191847i = y0Var;
            this.f191848j = y0Var2;
            this.f191849n = f0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g((C65500d) obj, "$this$AnimatedVisibility");
            C107530a.m145660a(this.f191842d, C110261c.m149878b(hVar, 748702110, true, new C112617u(this.f191844f, this.f191845g, this.f191846h, this.f191847i, this.f191848j, this.f191849n)), hVar, ((this.f191843e >> 6) & 14) | 48);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: z90.o$f */
    public static final class C66767f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f191850d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f191851e;

        /* renamed from: f */
        public final /* synthetic */ float f191852f;

        /* renamed from: g */
        public final /* synthetic */ float f191853g;

        /* renamed from: h */
        public final /* synthetic */ C55366y1 f191854h;

        /* renamed from: i */
        public final /* synthetic */ C54683f0 f191855i;

        /* renamed from: j */
        public final /* synthetic */ boolean f191856j;

        /* renamed from: n */
        public final /* synthetic */ C0000n0 f191857n;

        /* renamed from: o */
        public final /* synthetic */ boolean f191858o;

        /* renamed from: p */
        public final /* synthetic */ List<String> f191859p;

        /* renamed from: q */
        public final /* synthetic */ C66759i f191860q;

        /* renamed from: r */
        public final /* synthetic */ int f191861r;

        /* renamed from: s */
        public final /* synthetic */ int f191862s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66767f(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, float f, float f2, C55366y1 y1Var, C54683f0 f0Var, boolean z, C0000n0 n0Var, boolean z2, List<String> list, C66759i iVar, int i, int i2) {
            super(2);
            this.f191850d = aVar;
            this.f191851e = aVar2;
            this.f191852f = f;
            this.f191853g = f2;
            this.f191854h = y1Var;
            this.f191855i = f0Var;
            this.f191856j = z;
            this.f191857n = n0Var;
            this.f191858o = z2;
            this.f191859p = list;
            this.f191860q = iVar;
            this.f191861r = i;
            this.f191862s = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C112615o.m153996a(this.f191850d, this.f191851e, this.f191852f, this.f191853g, this.f191854h, this.f191855i, this.f191856j, this.f191857n, this.f191858o, this.f191859p, this.f191860q, (C108504h) obj, this.f191861r | 1, this.f191862s);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: z90.o$g */
    public static final class C66768g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Boolean> f191863d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<C66737a> f191864e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66768g(C60690y0<Boolean> y0Var, C60690y0<C66737a> y0Var2) {
            super(0);
            this.f191863d = y0Var;
            this.f191864e = y0Var2;
        }

        public Object invoke() {
            this.f191863d.setValue(Boolean.FALSE);
            this.f191864e.setValue(C66737a.None);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: z90.o$a */
    public static final class C112616a extends C87413o implements C32228q<C65500d, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ float f337253d;

        /* renamed from: e */
        public final /* synthetic */ C55366y1 f337254e;

        /* renamed from: f */
        public final /* synthetic */ C103953l0 f337255f;

        /* renamed from: g */
        public final /* synthetic */ C60690y0<Integer> f337256g;

        /* renamed from: h */
        public final /* synthetic */ float f337257h;

        /* renamed from: i */
        public final /* synthetic */ C32224a<C13598b0> f337258i;

        /* renamed from: j */
        public final /* synthetic */ C32224a<C13598b0> f337259j;

        /* renamed from: n */
        public final /* synthetic */ int f337260n;

        /* renamed from: o */
        public final /* synthetic */ C54683f0 f337261o;

        /* renamed from: p */
        public final /* synthetic */ C60690y0<Boolean> f337262p;

        /* renamed from: q */
        public final /* synthetic */ boolean f337263q;

        /* renamed from: r */
        public final /* synthetic */ C66759i f337264r;

        /* renamed from: s */
        public final /* synthetic */ C60690y0<C66737a> f337265s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112616a(float f, C55366y1 y1Var, C103953l0 l0Var, C60690y0<Integer> y0Var, float f2, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, int i, C54683f0 f0Var, C60690y0<Boolean> y0Var2, boolean z, C66759i iVar, C60690y0<C66737a> y0Var3) {
            super(3);
            this.f337253d = f;
            this.f337254e = y1Var;
            this.f337255f = l0Var;
            this.f337256g = y0Var;
            this.f337257h = f2;
            this.f337258i = aVar;
            this.f337259j = aVar2;
            this.f337260n = i;
            this.f337261o = f0Var;
            this.f337262p = y0Var2;
            this.f337263q = z;
            this.f337264r = iVar;
            this.f337265s = y0Var3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x01e4, code lost:
            if (r5 == p175j0.C108504h.C60656a.f172772a) goto L_0x01e6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                v.d r1 = (p720v.C65500d) r1
                r8 = r28
                j0.h r8 = (p175j0.C108504h) r8
                r2 = r29
                java.lang.Number r2 = (java.lang.Number) r2
                r2.intValue()
                java.lang.String r2 = "$this$AnimatedVisibility"
                gy3.C87412m.m108594g(r1, r2)
                int r1 = p721v0.C111294a.f333218a
                v0.a$b r1 = p721v0.C111294a.C111295a.f333229k
                int r2 = p721v0.C65503j.f188489K0
                v0.j$a r7 = p721v0.C65503j.C65504a.f188490d
                float r11 = r0.f337253d
                r10 = 0
                r12 = 0
                r13 = 0
                r14 = 13
                r15 = 0
                r9 = r7
                v0.j r2 = p435a0.C103166l0.m136523g(r9, r10, r11, r12, r13, r14, r15)
                r3 = 0
                r4 = 1
                r5 = 0
                v0.j r2 = p435a0.C103214y0.m136590f(r2, r3, r4, r5)
                com.tencent.mm.mj_template.sns.compose.widget.y1 r15 = r0.f337254e
                b0.l0 r14 = r0.f337255f
                j0.y0<java.lang.Integer> r13 = r0.f337256g
                float r12 = r0.f337257h
                fy3.a<rx3.b0> r3 = r0.f337258i
                fy3.a<rx3.b0> r6 = r0.f337259j
                int r9 = r0.f337260n
                ca0.f0 r10 = r0.f337261o
                j0.y0<java.lang.Boolean> r11 = r0.f337262p
                boolean r4 = r0.f337263q
                z90.i r5 = r0.f337264r
                r29 = r12
                j0.y0<z90.a> r12 = r0.f337265s
                r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
                r8.mo51557H(r0)
                a0.a$l r0 = p435a0.C103111a.f304237d
                r16 = r13
                r13 = 48
                o1.y r0 = p435a0.C103157j.m136499a(r0, r1, r8, r13)
                r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                r8.mo51557H(r1)
                j0.f1<i2.d> r13 = androidx.compose.p002ui.platform.C103645l0.f306124e
                java.lang.Object r17 = r8.mo51598m(r13)
                r1 = r17
                i2.d r1 = (p560i2.C108322d) r1
                r17 = r14
                j0.f1<i2.o> r14 = androidx.compose.p002ui.platform.C103645l0.f306130k
                java.lang.Object r18 = r8.mo51598m(r14)
                r19 = r15
                r15 = r18
                i2.o r15 = (p560i2.C33183o) r15
                r18 = r4
                j0.f1<androidx.compose.ui.platform.i2> r4 = androidx.compose.p002ui.platform.C103645l0.f306134o
                java.lang.Object r20 = r8.mo51598m(r4)
                r21 = r5
                r5 = r20
                androidx.compose.ui.platform.i2 r5 = (androidx.compose.p002ui.platform.C103633i2) r5
                q1.a$a r20 = p658q1.C110269a.f329831D0
                r20.getClass()
                r20 = r12
                fy3.a<q1.a> r12 = p658q1.C110269a.C110270a.f329833b
                fy3.q r2 = p631o1.C109863q.m149330a(r2)
                r22 = r11
                j0.d r11 = r8.mo51543A()
                boolean r11 = r11 instanceof p175j0.C24665d
                if (r11 == 0) goto L_0x0226
                r8.mo51615v()
                boolean r11 = r8.mo51621y()
                if (r11 == 0) goto L_0x00ac
                r8.mo51612t(r12)
                goto L_0x00af
            L_0x00ac:
                r8.mo51579c()
            L_0x00af:
                r8.mo51561L()
                fy3.p<q1.a, o1.y, rx3.b0> r11 = p658q1.C110269a.C110270a.f329836e
                p175j0.C108508o2.m147049a(r8, r0, r11)
                fy3.p<q1.a, i2.d, rx3.b0> r0 = p658q1.C110269a.C110270a.f329835d
                p175j0.C108508o2.m147049a(r8, r1, r0)
                fy3.p<q1.a, i2.o, rx3.b0> r1 = p658q1.C110269a.C110270a.f329837f
                p175j0.C108508o2.m147049a(r8, r15, r1)
                fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r15 = p658q1.C110269a.C110270a.f329838g
                p175j0.C108508o2.m147049a(r8, r5, r15)
                r8.mo51590i()
                j0.x1 r5 = new j0.x1
                r5.<init>(r8)
                r23 = r10
                r10 = 0
                r24 = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                q0.b r2 = (p415q0.C35747b) r2
                r2.invoke(r5, r8, r3)
                r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                r8.mo51557H(r2)
                r3 = -1163856341(0xffffffffbaa0f62b, float:-0.0012280395)
                r8.mo51557H(r3)
                a0.l r25 = p435a0.C103165l.f304321a
                r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
                r8.mo51557H(r3)
                v0.a r3 = p721v0.C111294a.C111295a.f333219a
                o1.y r3 = p435a0.C103141f.m136472c(r3, r10, r8, r10)
                r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                r8.mo51557H(r5)
                java.lang.Object r5 = r8.mo51598m(r13)
                i2.d r5 = (p560i2.C108322d) r5
                java.lang.Object r13 = r8.mo51598m(r14)
                i2.o r13 = (p560i2.C33183o) r13
                java.lang.Object r4 = r8.mo51598m(r4)
                androidx.compose.ui.platform.i2 r4 = (androidx.compose.p002ui.platform.C103633i2) r4
                fy3.q r14 = p631o1.C109863q.m149330a(r7)
                j0.d r2 = r8.mo51543A()
                boolean r2 = r2 instanceof p175j0.C24665d
                if (r2 == 0) goto L_0x0221
                r8.mo51615v()
                boolean r2 = r8.mo51621y()
                if (r2 == 0) goto L_0x0127
                r8.mo51612t(r12)
                goto L_0x012a
            L_0x0127:
                r8.mo51579c()
            L_0x012a:
                r8.mo51561L()
                p175j0.C108508o2.m147049a(r8, r3, r11)
                p175j0.C108508o2.m147049a(r8, r5, r0)
                p175j0.C108508o2.m147049a(r8, r13, r1)
                p175j0.C108508o2.m147049a(r8, r4, r15)
                r8.mo51590i()
                j0.x1 r0 = new j0.x1
                r0.<init>(r8)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                q0.b r14 = (p415q0.C35747b) r14
                r14.invoke(r0, r8, r1)
                r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                r8.mo51557H(r0)
                r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
                r8.mo51557H(r0)
                a0.i r2 = p435a0.C103155i.f304309a
                r0 = r9 & 14
                r1 = r9 & 112(0x70, float:1.57E-43)
                r0 = r0 | r1
                r1 = r24
                z90.C112615o.m153998c(r1, r6, r8, r0)
                r0 = -1652728331(0xffffffff9d7d5df5, float:-3.3532846E-21)
                r8.mo51557H(r0)
                r0 = r23
                j0.k2<com.tencent.maas.model.MJMusicInfo> r1 = r0.f153250b
                java.lang.Object r1 = r1.getValue()
                com.tencent.maas.model.MJMusicInfo r1 = (com.tencent.maas.model.MJMusicInfo) r1
                java.lang.String r1 = r1.getMusicID()
                java.lang.String r3 = "musicState.musicInfoState.value.musicID"
                gy3.C87412m.m108593f(r1, r3)
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0183
                r4 = 1
                goto L_0x0184
            L_0x0183:
                r4 = 0
            L_0x0184:
                if (r4 == 0) goto L_0x01a7
                java.lang.Object r1 = r22.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r4 = r1.booleanValue()
                z90.m r5 = new z90.m
                r3 = r18
                r9 = r20
                r6 = r21
                r1 = r22
                r5.<init>(r1, r3, r6, r9)
                r1 = 70
                r3 = r0
                r6 = r8
                r0 = r7
                r7 = r1
                z90.C112615o.m153997b(r2, r3, r4, r5, r6, r7)
                goto L_0x01a8
            L_0x01a7:
                r0 = r7
            L_0x01a8:
                r8.mo51565P()
                r8.mo51565P()
                r8.mo51565P()
                r8.mo51610s()
                r8.mo51565P()
                r8.mo51565P()
                r11 = 1065353216(0x3f800000, float:1.0)
                r12 = 0
                r13 = 2
                r14 = 0
                r9 = r25
                r1 = 0
                r10 = r0
                r15 = r29
                r2 = r16
                r3 = r17
                v0.j r4 = p435a0.C103161k.C103162a.m136505a(r9, r10, r11, r12, r13, r14)
                p435a0.C103129b1.m136432a(r4, r8, r1)
                r4 = 1157296644(0x44faf204, float:2007.563)
                r8.mo51557H(r4)
                boolean r4 = r8.mo51619x(r2)
                java.lang.Object r5 = r8.mo51606q()
                if (r4 != 0) goto L_0x01e6
                int r4 = p175j0.C108504h.f324828a
                java.lang.Object r4 = p175j0.C108504h.C60656a.f172772a
                if (r5 != r4) goto L_0x01ee
            L_0x01e6:
                z90.n r5 = new z90.n
                r5.<init>(r2)
                r8.mo51553F(r5)
            L_0x01ee:
                r8.mo51565P()
                fy3.l r5 = (fy3.C32226l) r5
                v0.j r4 = p631o1.C109845i0.m149273a(r0, r5)
                r6 = 8
                r7 = 0
                r2 = r19
                r5 = r8
                com.tencent.p014mm.mj_template.sns.compose.widget.C104674o1.m140307g(r2, r3, r4, r5, r6, r7)
                r2 = 3
                float r2 = (float) r2
                r3 = 8
                float r3 = (float) r3
                float r2 = r2 * r3
                float r2 = r2 + r15
                v0.j r0 = p435a0.C103214y0.m136592h(r0, r2)
                p435a0.C103129b1.m136432a(r0, r8, r1)
                r8.mo51565P()
                r8.mo51565P()
                r8.mo51610s()
                r8.mo51565P()
                r8.mo51565P()
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0221:
                p175j0.C108501g.m147000a()
                r0 = 0
                throw r0
            L_0x0226:
                r0 = 0
                p175j0.C108501g.m147000a()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z90.C112615o.C112616a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x016f, code lost:
        if (r2 == r1) goto L_0x0174;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153996a(fy3.C32224a<rx3.C13598b0> r29, fy3.C32224a<rx3.C13598b0> r30, float r31, float r32, com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1 r33, ca0.C54683f0 r34, boolean r35, a14.C0000n0 r36, boolean r37, java.util.List<java.lang.String> r38, z90.C66759i r39, p175j0.C108504h r40, int r41, int r42) {
        /*
            java.lang.String r0 = "onNextClick"
            r14 = r29
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "onBackClick"
            r15 = r30
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "templateState"
            r13 = r33
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "musicState"
            r12 = r34
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "scope"
            r11 = r36
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "imagePathList"
            r10 = r38
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "reporter"
            r9 = r39
            gy3.C87412m.m108594g(r9, r0)
            r0 = 1870850690(0x6f82ea82, float:8.103311E28)
            r1 = r40
            j0.h r8 = r1.mo51623z(r0)
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo51557H(r7)
            java.lang.Object r0 = r8.mo51606q()
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r6 = p175j0.C108504h.C60656a.f172772a
            r1 = 2
            r5 = 0
            if (r0 != r6) goto L_0x0055
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            j0.y0 r0 = p175j0.C108500f2.m146996c(r0, r5, r1, r5)
            r8.mo51553F(r0)
        L_0x0055:
            r8.mo51565P()
            j0.y0 r0 = (p175j0.C60690y0) r0
            r8.mo51557H(r7)
            java.lang.Object r2 = r8.mo51606q()
            r4 = 0
            if (r2 != r6) goto L_0x006f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            j0.y0 r2 = p175j0.C108500f2.m146996c(r2, r5, r1, r5)
            r8.mo51553F(r2)
        L_0x006f:
            r8.mo51565P()
            r16 = r2
            j0.y0 r16 = (p175j0.C60690y0) r16
            r8.mo51557H(r7)
            java.lang.Object r2 = r8.mo51606q()
            if (r2 != r6) goto L_0x0088
            z90.a r2 = z90.C66737a.None
            j0.y0 r2 = p175j0.C108500f2.m146996c(r2, r5, r1, r5)
            r8.mo51553F(r2)
        L_0x0088:
            r8.mo51565P()
            r3 = r2
            j0.y0 r3 = (p175j0.C60690y0) r3
            r2 = 3
            b0.l0 r17 = p004b0.C103960n0.m138697a(r4, r4, r8, r4, r2)
            androidx.compose.ui.platform.j1 r1 = androidx.compose.p002ui.platform.C103636j1.f306094a
            r2 = 8
            androidx.compose.ui.platform.x1 r2 = r1.mo144746a(r8, r2)
            r1 = 2003826817(0x776ff881, float:4.8671844E33)
            r8.mo51557H(r1)
            r1 = 0
            r18 = r6
            r6 = 1
            if (r35 != 0) goto L_0x00e2
            int r19 = p721v0.C65503j.f188489K0
            v0.j$a r4 = p721v0.C65503j.C65504a.f188490d
            v0.j r20 = p435a0.C103214y0.m136590f(r4, r1, r6, r5)
            int r4 = p436a1.C103272w.f304516h
            long r21 = p436a1.C103272w.f304510b
            r23 = 0
            r24 = 2
            r25 = 0
            v0.j r4 = p267x.C111885b.m152607c(r20, r21, r23, r24, r25)
            java.lang.Object r20 = r16.getValue()
            java.lang.Number r20 = (java.lang.Number) r20
            int r20 = r20.intValue()
            r21 = 8
            r22 = 0
            r7 = 0
            r1 = r38
            r26 = r2
            r2 = r4
            r4 = r3
            r3 = r20
            r40 = r4
            r4 = r8
            r14 = r5
            r5 = r21
            r27 = r18
            r6 = r22
            fa0.C107532c.m145661a(r1, r2, r3, r4, r5, r6)
            goto L_0x00ea
        L_0x00e2:
            r26 = r2
            r40 = r3
            r14 = r5
            r27 = r18
            r7 = 0
        L_0x00ea:
            r8.mo51565P()
            if (r37 != 0) goto L_0x00ff
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r18 = 0
            goto L_0x0101
        L_0x00ff:
            r18 = 1
        L_0x0101:
            r19 = 0
            r1 = 3
            v.y r20 = p720v.C111278o.m151774a(r14, r7, r1, r14)
            v.a0 r21 = p720v.C111278o.m151775b(r14, r7, r1, r14)
            r22 = 0
            r7 = -1755169446(0xffffffff97623d5a, float:-7.3101975E-25)
            z90.o$a r6 = new z90.o$a
            r5 = r0
            r0 = r6
            r1 = r32
            r2 = r33
            r3 = r17
            r4 = r16
            r16 = r5
            r5 = r31
            r14 = r6
            r6 = r29
            r15 = -1755169446(0xffffffff97623d5a, float:-7.3101975E-25)
            r7 = r30
            r28 = r8
            r8 = r41
            r9 = r34
            r10 = r16
            r11 = r37
            r12 = r39
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r28
            r10 = 1
            q0.a r6 = p415q0.C110261c.m149878b(r0, r15, r10, r14)
            r8 = 200064(0x30d80, float:2.8035E-40)
            r9 = 18
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r7 = r0
            p720v.C111247c.m151758b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo51557H(r1)
            r8 = r16
            boolean r1 = r0.mo51619x(r8)
            r7 = r40
            boolean r2 = r0.mo51619x(r7)
            r1 = r1 | r2
            java.lang.Object r2 = r0.mo51606q()
            if (r1 != 0) goto L_0x0172
            r1 = r27
            if (r2 != r1) goto L_0x017c
            goto L_0x0174
        L_0x0172:
            r1 = r27
        L_0x0174:
            z90.o$g r2 = new z90.o$g
            r2.<init>(r8, r7)
            r0.mo51553F(r2)
        L_0x017c:
            r0.mo51565P()
            r6 = r2
            fy3.a r6 = (fy3.C32224a) r6
            java.lang.Object r2 = r8.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0192
            if (r37 != 0) goto L_0x0192
            r11 = 1
            goto L_0x0193
        L_0x0192:
            r11 = 0
        L_0x0193:
            r2 = 300(0x12c, float:4.2E-43)
            r3 = 6
            r4 = 0
            r5 = 0
            w.j1 r9 = p257w.C37903i.m41595c(r2, r4, r5, r3, r5)
            z90.o$b r12 = z90.C112615o.C66763b.f191837d
            v.y r12 = p720v.C111278o.m151776c(r9, r12)
            w.j1 r2 = p257w.C37903i.m41595c(r2, r4, r5, r3, r5)
            z90.o$c r3 = z90.C112615o.C66764c.f191838d
            v.a0 r13 = p720v.C111278o.m151777d(r2, r3)
            int r2 = p721v0.C65503j.f188489K0
            v0.j$a r14 = p721v0.C65503j.C65504a.f188490d
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r2)
            java.lang.Object r2 = r0.mo51606q()
            if (r2 != r1) goto L_0x01c4
            z.m r2 = new z.m
            r2.<init>()
            r0.mo51553F(r2)
        L_0x01c4:
            r0.mo51565P()
            r15 = r2
            z.l r15 = (p1165z.C112527l) r15
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r2 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.mo51557H(r2)
            boolean r2 = r0.mo51619x(r7)
            boolean r3 = r0.mo51619x(r6)
            r2 = r2 | r3
            r3 = r26
            boolean r4 = r0.mo51619x(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r0.mo51606q()
            if (r2 != 0) goto L_0x01f0
            if (r4 != r1) goto L_0x01f8
        L_0x01f0:
            z90.o$d r4 = new z90.o$d
            r4.<init>(r6, r3, r7)
            r0.mo51553F(r4)
        L_0x01f8:
            r0.mo51565P()
            r20 = r4
            fy3.a r20 = (fy3.C32224a) r20
            r21 = 28
            r22 = 0
            v0.j r14 = p267x.C111940o.m152650c(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = 2001350097(0x774a2dd1, float:4.1006767E33)
            z90.o$e r5 = new z90.o$e
            r1 = r5
            r2 = r31
            r3 = r41
            r4 = r35
            r15 = r5
            r5 = r36
            r16 = r13
            r13 = 2001350097(0x774a2dd1, float:4.1006767E33)
            r9 = r34
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            q0.a r6 = p415q0.C110261c.m149878b(r0, r13, r10, r15)
            r8 = 200064(0x30d80, float:2.8035E-40)
            r9 = 16
            r1 = r11
            r2 = r14
            r3 = r12
            r4 = r16
            r5 = 0
            r7 = r0
            p720v.C111247c.m151758b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            j0.v1 r14 = r0.mo51596l()
            if (r14 != 0) goto L_0x023a
            goto L_0x025d
        L_0x023a:
            z90.o$f r15 = new z90.o$f
            r0 = r15
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.mo51650a(r15)
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z90.C112615o.m153996a(fy3.a, fy3.a, float, float, com.tencent.mm.mj_template.sns.compose.widget.y1, ca0.f0, boolean, a14.n0, boolean, java.util.List, z90.i, j0.h, int, int):void");
    }

    /* renamed from: b */
    public static final void m153997b(C103153h hVar, C54683f0 f0Var, boolean z, C32224a aVar, C108504h hVar2, int i) {
        C108504h z2 = hVar2.mo51623z(-1559169851);
        Boolean valueOf = Boolean.valueOf(!z);
        int i2 = C65503j.f188489K0;
        C65503j.C65504a aVar2 = C65503j.C65504a.f188490d;
        int i3 = C111294a.f333218a;
        C111265k.m151771a(valueOf, hVar.mo142907a(aVar2, C111294a.C111295a.f333222d), (C37892b0<Float>) null, C110261c.m149878b(z2, 340111525, true, new C66760j(f0Var, aVar, i)), z2, LVBuffer.MAX_STRING_LENGTH, 4);
        C33487v1 l = z2.mo51596l();
        if (l != null) {
            l.mo51650a(new C112613k(hVar, f0Var, z, aVar, i));
        }
    }

    /* renamed from: c */
    public static final void m153998c(C32224a aVar, C32224a aVar2, C108504h hVar, int i) {
        int i2;
        C108504h hVar2;
        C32224a aVar3 = aVar;
        C32224a aVar4 = aVar2;
        int i3 = i;
        C108504h z = hVar.mo51623z(-1981627299);
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
            C109895y a = C103199s0.m136579a(C103111a.f304235b, cVar, z, 48);
            z.mo51557H(-1323940314);
            C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar6 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(e);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar6);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-678309503);
                C103206u0 u0Var = C103206u0.f304394a;
                float f2 = ((float) 3) * f;
                C111897d1.m152617a(C110954a.m151253a(C0966R.raw.icons_filled_close, C103272w.f304511c, z, 48), "close_icon", C111940o.m152651d(C103214y0.m136595k(C103166l0.m136519c(aVar5, ((float) 1) * f), f2, f2), false, (String) null, (C111072h) null, aVar2, 7, (Object) null), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, z, 56, 120);
                C103129b1.m136432a(C103203t0.C103204a.m136583a(u0Var, aVar5, 1.0f, false, 2, (Object) null), z, 0);
                C111498c.C111499a aVar7 = C111498c.C111499a.f333809e;
                String string = MMApplicationContext.getString(C0966R.string.f360089a13);
                C87412m.m108593f(string, "app_nextstep.str");
                hVar2 = z;
                C111494a.m152003a(aVar, (C65503j) null, aVar7, (C111501d) null, false, string, (C32227p<? super C108504h, ? super Integer, C13598b0>) null, z, (i4 & 14) | 512, 90);
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
            l.mo51650a(new C66761l(aVar3, aVar4, i3));
        }
    }
}
