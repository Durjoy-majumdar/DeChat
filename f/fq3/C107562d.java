package fq3;

import android.content.Context;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gq3.C59629h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p157gk.C32466a;
import p157gk.C59480d;
import p157gk.C59491j;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p267x.C111885b;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103138e;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103166l0;
import p435a0.C103214y0;
import p436a1.C103266t0;
import p502e0.C107074g;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import p868x0.C111979d;
import rx3.C13598b0;
import ta0.C110954a;
import um0.C22657f;

/* renamed from: fq3.d */
public final class C107562d {

    /* renamed from: fq3.d$a */
    public static final class C107563a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f321841d;

        /* renamed from: e */
        public final /* synthetic */ int f321842e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList<C59480d> f321843f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<String, C13598b0> f321844g;

        /* renamed from: h */
        public final /* synthetic */ int f321845h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107563a(C65503j jVar, int i, ArrayList<C59480d> arrayList, C32226l<? super String, C13598b0> lVar, int i2) {
            super(2);
            this.f321841d = jVar;
            this.f321842e = i;
            this.f321843f = arrayList;
            this.f321844g = lVar;
            this.f321845h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107562d.m145730a(this.f321841d, this.f321842e, this.f321843f, this.f321844g, (C108504h) obj, this.f321845h | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.d$b */
    public static final class C107564b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f321846d;

        /* renamed from: e */
        public final /* synthetic */ int f321847e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107564b(String str, int i) {
            super(2);
            this.f321846d = str;
            this.f321847e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107562d.m145731b(this.f321846d, (C108504h) obj, this.f321847e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.d$c */
    public static final class C107565c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f321848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107565c(C32224a<C13598b0> aVar) {
            super(0);
            this.f321848d = aVar;
        }

        public Object invoke() {
            Log.m105924i("BuildPeopleDetailTitleBar", "onBackClick");
            this.f321848d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.d$d */
    public static final class C107566d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f321849d;

        /* renamed from: e */
        public final /* synthetic */ int f321850e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107566d(C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f321849d = aVar;
            this.f321850e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107562d.m145732c(this.f321849d, (C108504h) obj, this.f321850e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m145730a(C65503j jVar, int i, ArrayList<C59480d> arrayList, C32226l<? super String, C13598b0> lVar, C108504h hVar, int i2) {
        C87412m.m108594g(jVar, "modifier");
        C87412m.m108594g(arrayList, "data");
        C87412m.m108594g(lVar, "onDetailClick");
        C108504h z = hVar.mo51623z(-405252879);
        int i3 = i2 & 14;
        z.mo51557H(-483455358);
        C103111a aVar = C103111a.f304234a;
        C103111a.C103123l lVar2 = C103111a.f304237d;
        int i4 = C111294a.f333218a;
        int i5 = i3 >> 3;
        C109895y a = C103157j.m136499a(lVar2, C111294a.C111295a.f333228j, z, (i5 & 112) | (i5 & 14));
        z.mo51557H(-1323940314);
        C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
        C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
        C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
        C110269a.C110270a aVar2 = C110269a.f329831D0;
        aVar2.getClass();
        C32224a<C110269a> aVar3 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(jVar);
        int i6 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar3);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            aVar2.getClass();
            C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
            aVar2.getClass();
            C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
            aVar2.getClass();
            C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
            aVar2.getClass();
            C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
            z.mo51590i();
            ((C35747b) a2).invoke(new C33489x1(z), z, Integer.valueOf((i6 >> 3) & 112));
            z.mo51557H(2058660585);
            z.mo51557H(-1163856341);
            if (((i6 >> 9) & 14 & 11) == 2 && z.mo51575a()) {
                z.mo51581d();
            } else if (((((i3 >> 6) & 112) | 6) & 81) != 16 || !z.mo51575a()) {
                C107569j.m145738b((C59629h) null, arrayList, i, lVar, (C32226l<? super C32466a, C13598b0>) null, z, ((i2 << 3) & C22657f.CTRL_INDEX) | 64 | (i2 & 7168), 17);
            } else {
                z.mo51581d();
            }
            z.mo51565P();
            z.mo51565P();
            z.mo51610s();
            z.mo51565P();
            z.mo51565P();
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C107563a(jVar, i, arrayList, lVar, i2));
                return;
            }
            return;
        }
        C108501g.m147000a();
        throw null;
    }

    /* renamed from: b */
    public static final void m145731b(String str, C108504h hVar, int i) {
        int i2;
        String str2 = str;
        int i3 = i;
        C87412m.m108594g(str2, "imagePath");
        C108504h z = hVar.mo51623z(-325852159);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            int i4 = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            int i5 = C59491j.f169996a ? C0966R.color.f2927a : C0966R.color.f2947a4;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            float f = (float) 8;
            C65503j g = C103166l0.m136523g(C103214y0.m136592h(C103214y0.m136591g(C111885b.m152607c(aVar, C110954a.m151254b(i5, context), (C103266t0) null, 2, (Object) null), 0.0f, 1, (Object) null), ((float) 17) * f), 0.0f, ((float) 3) * f, 0.0f, 0.0f, 13, (Object) null);
            z.mo51557H(733328855);
            int i6 = C111294a.f333218a;
            C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, z, 0);
            z.mo51557H(-1323940314);
            C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar2 = C110269a.f329831D0;
            aVar2.getClass();
            C32224a<C110269a> aVar3 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(g);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar3);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar2.getClass();
                C108508o2.m147049a(z, c, C110269a.C110270a.f329836e);
                aVar2.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar2.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar2.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-2137368960);
                C65503j a2 = C111979d.m152690a(C103214y0.m136594j(aVar, ((float) 10) * f), C107074g.m144958a(((float) 1) * f));
                C111294a aVar4 = C111294a.C111295a.f333220b;
                C87412m.m108594g(a2, "<this>");
                C107569j.m145739c(a2.mo74972i0(new C103138e(aVar4, false, C103612c1.f306063a)), str2, z, (i2 << 3) & 112);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107564b(str2, i3));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: fy3.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x016a, code lost:
        if (r5 == p175j0.C108504h.C60656a.f172772a) goto L_0x016c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145732c(fy3.C32224a<rx3.C13598b0> r27, p175j0.C108504h r28, int r29) {
        /*
            r0 = r27
            r1 = r29
            java.lang.String r2 = "onBackClick"
            gy3.C87412m.m108594g(r0, r2)
            r2 = -2035019039(0xffffffff86b412e1, float:-6.7736215E-35)
            r3 = r28
            j0.h r2 = r3.mo51623z(r2)
            r3 = r1 & 14
            r4 = 2
            if (r3 != 0) goto L_0x0022
            boolean r3 = r2.mo51619x(r0)
            if (r3 == 0) goto L_0x001f
            r3 = 4
            goto L_0x0020
        L_0x001f:
            r3 = 2
        L_0x0020:
            r3 = r3 | r1
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            r3 = r3 & 11
            if (r3 != r4) goto L_0x0033
            boolean r3 = r2.mo51575a()
            if (r3 != 0) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            r2.mo51581d()
            goto L_0x020b
        L_0x0033:
            int r3 = p721v0.C65503j.f188489K0
            v0.j$a r9 = p721v0.C65503j.C65504a.f188490d
            r3 = 0
            r4 = 1
            r5 = 0
            v0.j r3 = p435a0.C103214y0.m136591g(r9, r3, r4, r5)
            r6 = 4617878467915022336(0x4016000000000000, double:5.5)
            float r4 = (float) r6
            r6 = 8
            float r6 = (float) r6
            float r4 = r4 * r6
            v0.j r10 = p435a0.C103214y0.m136592h(r3, r4)
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            float r3 = (float) r3
            float r3 = r3 * r6
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            r11 = r3
            v0.j r17 = p435a0.C103166l0.m136523g(r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = p157gk.C59491j.f169996a
            if (r4 == 0) goto L_0x0062
            r4 = 2131099648(0x7f060000, float:1.7811655E38)
            goto L_0x0065
        L_0x0062:
            r4 = 2131099792(0x7f060090, float:1.7811947E38)
        L_0x0065:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r10 = "getContext()"
            gy3.C87412m.m108593f(r7, r10)
            long r18 = ta0.C110954a.m151254b(r4, r7)
            r20 = 0
            r21 = 2
            r22 = 0
            v0.j r4 = p267x.C111885b.m152607c(r17, r18, r20, r21, r22)
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo51557H(r7)
            int r7 = p721v0.C111294a.f333218a
            v0.a r7 = p721v0.C111294a.C111295a.f333219a
            r11 = 0
            o1.y r7 = p435a0.C103141f.m136472c(r7, r11, r2, r11)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo51557H(r8)
            j0.f1<i2.d> r12 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r8 = r2.mo51598m(r12)
            i2.d r8 = (p560i2.C108322d) r8
            j0.f1<i2.o> r13 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r13 = r2.mo51598m(r13)
            i2.o r13 = (p560i2.C33183o) r13
            j0.f1<androidx.compose.ui.platform.i2> r14 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r14 = r2.mo51598m(r14)
            androidx.compose.ui.platform.i2 r14 = (androidx.compose.p002ui.platform.C103633i2) r14
            q1.a$a r15 = p658q1.C110269a.f329831D0
            r15.getClass()
            fy3.a<q1.a> r5 = p658q1.C110269a.C110270a.f329833b
            fy3.q r4 = p631o1.C109863q.m149330a(r4)
            j0.d r11 = r2.mo51543A()
            boolean r11 = r11 instanceof p175j0.C24665d
            if (r11 == 0) goto L_0x021b
            r2.mo51615v()
            boolean r11 = r2.mo51621y()
            if (r11 == 0) goto L_0x00c9
            r2.mo51612t(r5)
            goto L_0x00cc
        L_0x00c9:
            r2.mo51579c()
        L_0x00cc:
            r2.mo51561L()
            r15.getClass()
            fy3.p<q1.a, o1.y, rx3.b0> r5 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r2, r7, r5)
            r15.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r5 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r2, r8, r5)
            r15.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r5 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r2, r13, r5)
            r15.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r5 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r2, r14, r5)
            r2.mo51590i()
            j0.x1 r5 = new j0.x1
            r5.<init>(r2)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            q0.b r4 = (p415q0.C35747b) r4
            r4.invoke(r5, r2, r8)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo51557H(r4)
            r4 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.mo51557H(r4)
            r4 = 2131756226(0x7f1004c2, float:1.9143354E38)
            boolean r5 = p157gk.C59491j.f169996a
            r11 = 2131100168(0x7f060208, float:1.781271E38)
            r13 = 2131099940(0x7f060124, float:1.7812247E38)
            if (r5 == 0) goto L_0x011e
            r5 = 2131100168(0x7f060208, float:1.781271E38)
            goto L_0x0121
        L_0x011e:
            r5 = 2131099940(0x7f060124, float:1.7812247E38)
        L_0x0121:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r7, r10)
            long r7 = ta0.C110954a.m151254b(r5, r7)
            r5 = 0
            d1.c r4 = ta0.C110954a.m151253a(r4, r7, r2, r5)
            r5 = 3
            float r5 = (float) r5
            float r5 = r5 * r6
            v0.j r5 = p435a0.C103214y0.m136592h(r9, r5)
            v0.j r3 = p435a0.C103214y0.m136596l(r5, r3)
            v0.a r5 = p721v0.C111294a.C111295a.f333221c
            java.lang.String r6 = "<this>"
            gy3.C87412m.m108594g(r3, r6)
            a0.e r6 = new a0.e
            fy3.l<androidx.compose.ui.platform.e1, rx3.b0> r7 = androidx.compose.p002ui.platform.C103612c1.f306063a
            r8 = 0
            r6.<init>(r5, r8, r7)
            v0.j r17 = r3.mo74972i0(r6)
            r18 = 0
            r19 = 0
            r20 = 0
            r3 = 1157296644(0x44faf204, float:2007.563)
            r2.mo51557H(r3)
            boolean r3 = r2.mo51619x(r0)
            java.lang.Object r5 = r2.mo51606q()
            if (r3 != 0) goto L_0x016c
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r5 != r3) goto L_0x0174
        L_0x016c:
            fq3.d$c r5 = new fq3.d$c
            r5.<init>(r0)
            r2.mo51553F(r5)
        L_0x0174:
            r2.mo51565P()
            r21 = r5
            fy3.a r21 = (fy3.C32224a) r21
            r22 = 7
            r23 = 0
            v0.j r5 = p267x.C111940o.m152651d(r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            r7 = 8
            r8 = 4
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r2
            fq3.C107559c.m145728a(r3, r4, r5, r6, r7, r8)
            r3 = 2131831380(0x7f112a54, float:1.9295784E38)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r3)
            boolean r4 = p157gk.C59491j.f169996a
            if (r4 == 0) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
        L_0x019d:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r4, r10)
            long r5 = ta0.C110954a.m151254b(r11, r4)
            r4 = 2131165591(0x7f070197, float:1.7945403E38)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r4 = kg3.C76577a.m92155f(r7, r4)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r4 = kg3.C76577a.m92152c(r7, r4)
            float r4 = (float) r4
            java.lang.Object r7 = r2.mo51598m(r12)
            i2.d r7 = (p560i2.C108322d) r7
            long r7 = r7.mo143031F(r4)
            v0.a r4 = p721v0.C111294a.C111295a.f333222d
            a0.e r15 = new a0.e
            fy3.l<androidx.compose.ui.platform.e1, rx3.b0> r10 = androidx.compose.p002ui.platform.C103612c1.f306063a
            r11 = 0
            r15.<init>(r4, r11, r10)
            r9.mo74972i0(r15)
            java.lang.String r4 = "str"
            gy3.C87412m.m108593f(r3, r4)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r4 = 0
            r23 = r15
            r15 = r4
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 65520(0xfff0, float:9.1813E-41)
            r4 = r23
            r23 = r2
            va0.C111504g.m152005a(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.mo51565P()
            r2.mo51565P()
            r2.mo51610s()
            r2.mo51565P()
            r2.mo51565P()
        L_0x020b:
            j0.v1 r2 = r2.mo51596l()
            if (r2 != 0) goto L_0x0212
            goto L_0x021a
        L_0x0212:
            fq3.d$d r3 = new fq3.d$d
            r3.<init>(r0, r1)
            r2.mo51650a(r3)
        L_0x021a:
            return
        L_0x021b:
            p175j0.C108501g.m147000a()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fq3.C107562d.m145732c(fy3.a, j0.h, int):void");
    }
}
