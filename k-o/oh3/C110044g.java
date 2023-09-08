package oh3;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import p004b0.C103953l0;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p175j0.C60686v;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103214y0;
import p436a1.C103224b0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: oh3.g */
public final class C110044g {

    /* renamed from: oh3.g$a */
    public static final class C110045a extends C87413o implements C32226l<C103224b0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110049h f329304d;

        /* renamed from: e */
        public final /* synthetic */ C103953l0 f329305e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110045a(C110049h hVar, C103953l0 l0Var) {
            super(1);
            this.f329304d = hVar;
            this.f329305e = l0Var;
        }

        public Object invoke(Object obj) {
            C103224b0 b0Var = (C103224b0) obj;
            C87412m.m108594g(b0Var, "$this$graphicsLayer");
            C110049h hVar = this.f329304d;
            C103953l0 l0Var = this.f329305e;
            hVar.getClass();
            C87412m.m108594g(l0Var, "lazyListState");
            if (l0Var.mo145571e() == 0) {
                int f = l0Var.mo145572f() - hVar.f329316a;
                if (f >= 0) {
                    float f2 = ((float) f) / hVar.f329317b;
                    if (((double) f2) > 1.0d) {
                        hVar.f329318c.setValue(Float.valueOf(1.0f));
                    } else {
                        hVar.f329318c.setValue(Float.valueOf(f2));
                    }
                } else {
                    hVar.f329318c.setValue(Float.valueOf(0.0f));
                }
            }
            Float value = hVar.f329318c.getValue();
            C87412m.m108591d(value);
            b0Var.setAlpha(value.floatValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oh3.g$b */
    public static final class C110046b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f329306d;

        /* renamed from: e */
        public final /* synthetic */ String f329307e;

        /* renamed from: f */
        public final /* synthetic */ int f329308f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110046b(C65503j jVar, String str, int i) {
            super(2);
            this.f329306d = jVar;
            this.f329307e = str;
            this.f329308f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                float f = (float) 8;
                C65503j g = C103214y0.m136591g(C103214y0.m136592h(C103166l0.m136523g(this.f329306d, ((float) 1) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3618a))), 0.0f, 1, (Object) null);
                int i = C111294a.f333218a;
                C111294a.C37634c cVar = C111294a.C111295a.f333227i;
                String str = this.f329307e;
                int i2 = this.f329308f;
                hVar.mo51557H(693286680);
                C109895y a = C103199s0.m136579a(C103111a.f304235b, cVar, hVar, 48);
                hVar.mo51557H(-1323940314);
                C60686v vVar = C103645l0.f306124e;
                C108322d dVar = (C108322d) hVar.mo51598m(vVar);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C108508o2.m147049a(hVar, a, C110269a.C110270a.f329836e);
                    C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                    C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                    C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                    hVar.mo51590i();
                    ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-678309503);
                    int i3 = C65503j.f188489K0;
                    C103129b1.m136432a(C103214y0.m136596l(C65503j.C65504a.f188490d, ((float) 3) * f), hVar, 6);
                    long F = ((C108322d) hVar.mo51598m(vVar)).mo143031F((float) 17);
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    long b = C110954a.m151254b(C0966R.color.f3021cg, context);
                    C32659e eVar = r2;
                    C32659e eVar2 = new C32659e(3);
                    C108504h hVar2 = hVar;
                    C107944f0.m146242c(str, (C65503j) null, b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, eVar, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, (i2 & 14) | LVBuffer.MAX_STRING_LENGTH, 0, 65010);
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
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oh3.g$c */
    public static final class C110047c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f329309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110047c(Context context) {
            super(0);
            this.f329309d = context;
        }

        public Object invoke() {
            Context context = this.f329309d;
            if (context instanceof AppCompatActivity) {
                ((AppCompatActivity) context).finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oh3.g$d */
    public static final class C110048d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f329310d;

        /* renamed from: e */
        public final /* synthetic */ C103953l0 f329311e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f329312f;

        /* renamed from: g */
        public final /* synthetic */ long f329313g;

        /* renamed from: h */
        public final /* synthetic */ int f329314h;

        /* renamed from: i */
        public final /* synthetic */ int f329315i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110048d(String str, C103953l0 l0Var, C65503j jVar, long j, int i, int i2) {
            super(2);
            this.f329310d = str;
            this.f329311e = l0Var;
            this.f329312f = jVar;
            this.f329313g = j;
            this.f329314h = i;
            this.f329315i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C110044g.m149553a(this.f329310d, this.f329311e, this.f329312f, this.f329313g, (C108504h) obj, this.f329314h | 1, this.f329315i);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m149553a(java.lang.String r37, p004b0.C103953l0 r38, p721v0.C65503j r39, long r40, p175j0.C108504h r42, int r43, int r44) {
        /*
            r1 = r37
            r2 = r38
            r6 = r43
            java.lang.String r0 = "title"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "lazyListState"
            gy3.C87412m.m108594g(r2, r0)
            r0 = 1497151829(0x593cb955, float:3.3200669E15)
            r3 = r42
            j0.h r0 = r3.mo51623z(r0)
            r3 = r44 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r6 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x002f
            boolean r3 = r0.mo51619x(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r6
            goto L_0x0030
        L_0x002f:
            r3 = r6
        L_0x0030:
            r4 = r44 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0047
            boolean r4 = r0.mo51619x(r2)
            if (r4 == 0) goto L_0x0044
            r4 = 32
            goto L_0x0046
        L_0x0044:
            r4 = 16
        L_0x0046:
            r3 = r3 | r4
        L_0x0047:
            r4 = r44 & 4
            if (r4 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0061
            r5 = r39
            boolean r7 = r0.mo51619x(r5)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r7
            goto L_0x0063
        L_0x0061:
            r5 = r39
        L_0x0063:
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r44 & 8
            if (r7 != 0) goto L_0x0076
            r7 = r40
            boolean r9 = r0.mo51594k(r7)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r7 = r40
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r9
            goto L_0x007e
        L_0x007c:
            r7 = r40
        L_0x007e:
            r9 = r3 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0092
            boolean r9 = r0.mo51575a()
            if (r9 != 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            r0.mo51581d()
            r3 = r5
            r4 = r7
            goto L_0x032c
        L_0x0092:
            r0.mo51559J()
            r9 = r6 & 1
            java.lang.String r15 = "getContext()"
            if (r9 == 0) goto L_0x00ad
            boolean r9 = r0.mo51582e()
            if (r9 == 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a2:
            r0.mo51581d()
            r4 = r44 & 8
            if (r4 == 0) goto L_0x00ab
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ab:
            r4 = r5
            goto L_0x00c8
        L_0x00ad:
            if (r4 == 0) goto L_0x00b4
            int r4 = p721v0.C65503j.f188489K0
            v0.j$a r4 = p721v0.C65503j.C65504a.f188490d
            goto L_0x00b5
        L_0x00b4:
            r4 = r5
        L_0x00b5:
            r5 = r44 & 8
            if (r5 == 0) goto L_0x00c8
            r5 = 2131099648(0x7f060000, float:1.7811655E38)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r7, r15)
            long r7 = ta0.C110954a.m151254b(r5, r7)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c8:
            r23 = r7
            r0.mo51555G()
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r5)
            java.lang.Object r5 = r0.mo51606q()
            int r7 = p175j0.C108504h.f324828a
            java.lang.Object r7 = p175j0.C108504h.C60656a.f172772a
            if (r5 != r7) goto L_0x00fe
            oh3.h r5 = new oh3.h
            r7 = 40
            float r7 = (float) r7
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r7 = kg3.C76577a.m92150a(r8, r7)
            float r7 = (float) r7
            int r7 = (int) r7
            r8 = 20
            float r8 = (float) r8
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r8 = kg3.C76577a.m92150a(r9, r8)
            float r8 = (float) r8
            r5.<init>(r7, r8)
            r0.mo51553F(r5)
        L_0x00fe:
            r0.mo51565P()
            oh3.h r5 = (oh3.C110049h) r5
            j0.f1<android.content.Context> r7 = androidx.compose.p002ui.platform.C103691v.f306268b
            java.lang.Object r7 = r0.mo51598m(r7)
            r14 = r7
            android.content.Context r14 = (android.content.Context) r14
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo51557H(r7)
            int r7 = p721v0.C65503j.f188489K0
            v0.j$a r13 = p721v0.C65503j.C65504a.f188490d
            int r7 = p721v0.C111294a.f333218a
            v0.a r7 = p721v0.C111294a.C111295a.f333219a
            r11 = 0
            o1.y r7 = p435a0.C103141f.m136472c(r7, r11, r0, r11)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r12)
            j0.f1<i2.d> r9 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r8 = r0.mo51598m(r9)
            i2.d r8 = (p560i2.C108322d) r8
            j0.f1<i2.o> r10 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r16 = r0.mo51598m(r10)
            r12 = r16
            i2.o r12 = (p560i2.C33183o) r12
            r40 = r14
            j0.f1<androidx.compose.ui.platform.i2> r14 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r16 = r0.mo51598m(r14)
            r11 = r16
            androidx.compose.ui.platform.i2 r11 = (androidx.compose.p002ui.platform.C103633i2) r11
            q1.a$a r25 = p658q1.C110269a.f329831D0
            r25.getClass()
            r42 = r14
            fy3.a<q1.a> r14 = p658q1.C110269a.C110270a.f329833b
            fy3.q r16 = p631o1.C109863q.m149330a(r13)
            j0.d r6 = r0.mo51543A()
            boolean r6 = r6 instanceof p175j0.C24665d
            r17 = r15
            if (r6 == 0) goto L_0x0349
            r0.mo51615v()
            boolean r6 = r0.mo51621y()
            if (r6 == 0) goto L_0x0167
            r0.mo51612t(r14)
            goto L_0x016a
        L_0x0167:
            r0.mo51579c()
        L_0x016a:
            r0.mo51561L()
            r25.getClass()
            fy3.p<q1.a, o1.y, rx3.b0> r6 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r0, r7, r6)
            r25.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r7 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r0, r8, r7)
            r25.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r8 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r0, r12, r8)
            r25.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r12 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r0, r11, r12)
            r0.mo51590i()
            j0.x1 r11 = new j0.x1
            r11.<init>(r0)
            r18 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r18)
            r19 = r7
            r7 = r16
            q0.b r7 = (p415q0.C35747b) r7
            r7.invoke(r11, r0, r15)
            r15 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r15)
            r7 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r0.mo51557H(r7)
            oh3.g$a r7 = new oh3.g$a
            r7.<init>(r5, r2)
            v0.j r7 = p436a1.C103221a0.m136602a(r13, r7)
            r5 = 0
            r20 = 0
            r16 = 0
            r22 = 0
            r11 = 2033122771(0x792efdd3, float:5.678799E34)
            oh3.g$b r15 = new oh3.g$b
            r15.<init>(r4, r1, r3)
            r26 = r14
            r14 = 1
            q0.a r15 = p415q0.C110261c.m149878b(r0, r11, r14, r15)
            r11 = 1572864(0x180000, float:2.204052E-39)
            r14 = 3
            int r3 = r3 >> r14
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | r11
            r27 = 58
            r11 = r19
            r28 = r8
            r8 = r5
            r5 = r9
            r29 = r10
            r9 = r23
            r30 = r11
            r31 = r12
            r39 = 0
            r11 = r20
            r32 = r13
            r13 = r16
            r33 = r40
            r34 = r42
            r35 = r26
            r14 = r22
            r36 = r17
            r16 = r0
            r17 = r3
            r18 = r27
            p543h0.C107927c0.m146232a(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            r3 = 1
            float r7 = (float) r3
            r8 = 8
            float r8 = (float) r8
            float r17 = r7 * r8
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r16 = r4
            v0.j r7 = p435a0.C103166l0.m136523g(r16, r17, r18, r19, r20, r21, r22)
            r9 = 2131165184(0x7f070000, float:1.7944578E38)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r9 = kg3.C76577a.m92155f(r10, r9)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r9 = kg3.C76577a.m92152c(r10, r9)
            float r9 = (float) r9
            v0.j r7 = p435a0.C103214y0.m136592h(r7, r9)
            r9 = 0
            r10 = 0
            v0.j r3 = p435a0.C103214y0.m136591g(r7, r9, r3, r10)
            v0.a$c r7 = p721v0.C111294a.C111295a.f333227i
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r0.mo51557H(r9)
            a0.a r9 = p435a0.C103111a.f304234a
            a0.a$d r9 = p435a0.C103111a.f304235b
            r11 = 48
            o1.y r7 = p435a0.C103199s0.m136579a(r9, r7, r0, r11)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r9)
            java.lang.Object r5 = r0.mo51598m(r5)
            i2.d r5 = (p560i2.C108322d) r5
            r9 = r29
            java.lang.Object r9 = r0.mo51598m(r9)
            i2.o r9 = (p560i2.C33183o) r9
            r11 = r34
            java.lang.Object r11 = r0.mo51598m(r11)
            androidx.compose.ui.platform.i2 r11 = (androidx.compose.p002ui.platform.C103633i2) r11
            r25.getClass()
            fy3.q r3 = p631o1.C109863q.m149330a(r3)
            j0.d r12 = r0.mo51543A()
            boolean r12 = r12 instanceof p175j0.C24665d
            if (r12 == 0) goto L_0x0345
            r0.mo51615v()
            boolean r10 = r0.mo51621y()
            if (r10 == 0) goto L_0x0281
            r10 = r35
            r0.mo51612t(r10)
            goto L_0x0284
        L_0x0281:
            r0.mo51579c()
        L_0x0284:
            r0.mo51561L()
            r25.getClass()
            p175j0.C108508o2.m147049a(r0, r7, r6)
            r25.getClass()
            r6 = r30
            p175j0.C108508o2.m147049a(r0, r5, r6)
            r25.getClass()
            r5 = r28
            p175j0.C108508o2.m147049a(r0, r9, r5)
            r25.getClass()
            r5 = r31
            p175j0.C108508o2.m147049a(r0, r11, r5)
            r0.mo51590i()
            j0.x1 r5 = new j0.x1
            r5.<init>(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r39)
            q0.b r3 = (p415q0.C35747b) r3
            r3.invoke(r5, r0, r6)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r3)
            r3 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r0.mo51557H(r3)
            r3 = 2131755028(0x7f100014, float:1.9140924E38)
            r5 = 0
            d1.c r7 = ta0.C110954a.m151256d(r3, r0, r5)
            r3 = 2131100168(0x7f060208, float:1.781271E38)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = r36
            gy3.C87412m.m108593f(r5, r6)
            long r10 = ta0.C110954a.m151254b(r3, r5)
            int r3 = p721v0.C65503j.f188489K0
            r17 = 0
            r18 = 0
            r19 = 0
            oh3.g$c r3 = new oh3.g$c
            r5 = r33
            r3.<init>(r5)
            r21 = 7
            r22 = 0
            r16 = r32
            r20 = r3
            v0.j r3 = p267x.C111940o.m152651d(r16, r17, r18, r19, r20, r21, r22)
            r5 = 3
            float r5 = (float) r5
            float r5 = r5 * r8
            v0.j r9 = p435a0.C103214y0.m136594j(r3, r5)
            r3 = 2131820948(0x7f110194, float:1.9274625E38)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r3)
            r13 = 8
            r14 = 0
            r12 = r0
            p543h0.C107974r.m146260a(r7, r8, r9, r10, r12, r13, r14)
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
            r3 = r4
            r4 = r23
        L_0x032c:
            j0.v1 r8 = r0.mo51596l()
            if (r8 != 0) goto L_0x0333
            goto L_0x0344
        L_0x0333:
            oh3.g$d r9 = new oh3.g$d
            r0 = r9
            r1 = r37
            r2 = r38
            r6 = r43
            r7 = r44
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.mo51650a(r9)
        L_0x0344:
            return
        L_0x0345:
            p175j0.C108501g.m147000a()
            throw r10
        L_0x0349:
            r10 = 0
            p175j0.C108501g.m147000a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oh3.C110044g.m149553a(java.lang.String, b0.l0, v0.j, long, j0.h, int, int):void");
    }
}
