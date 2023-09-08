package oh3;

import android.content.Context;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tav.core.ExportErrorStatus;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60686v;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103140e1;
import p435a0.C103157j;
import p435a0.C103166l0;
import p435a0.C103181p;
import p435a0.C103199s0;
import p435a0.C103214y0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p543h0.C107944f0;
import p543h0.C107969n;
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
import um0.C22657f;

/* renamed from: oh3.f */
public final class C110043f {

    /* renamed from: oh3.f$a */
    public static final class C62019a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f176304d;

        /* renamed from: e */
        public final /* synthetic */ long f176305e;

        /* renamed from: f */
        public final /* synthetic */ long f176306f;

        /* renamed from: g */
        public final /* synthetic */ int f176307g;

        /* renamed from: h */
        public final /* synthetic */ int f176308h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62019a(String str, long j, long j2, int i, int i2) {
            super(2);
            this.f176304d = str;
            this.f176305e = j;
            this.f176306f = j2;
            this.f176307g = i;
            this.f176308h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C110043f.m149552a(this.f176304d, this.f176305e, this.f176306f, (C108504h) obj, this.f176307g | 1, this.f176308h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m149552a(String str, long j, long j2, C108504h hVar, int i, int i2) {
        int i3;
        String str2;
        long j3;
        long j4;
        long j5;
        long j6;
        String str3;
        String str4;
        int i4 = i;
        C108504h z = hVar.mo51623z(-2023128502);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i4 | 6;
            str2 = str;
        } else if ((i4 & 14) == 0) {
            str2 = str;
            i3 = (z.mo51619x(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i3 = i4;
        }
        if ((i4 & 112) == 0) {
            j3 = j;
            i3 |= ((i2 & 2) != 0 || !z.mo51594k(j3)) ? 16 : 32;
        } else {
            j3 = j;
        }
        if ((i4 & C22657f.CTRL_INDEX) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) != 0 || !z.mo51594k(j4)) ? 128 : 256;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) != 146 || !z.mo51575a()) {
            z.mo51559J();
            if ((i4 & 1) == 0 || z.mo51582e()) {
                str4 = i5 != 0 ? "•" : str2;
                if ((i2 & 2) != 0) {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    j3 = C110954a.m151254b(C0966R.color.BW_0_Alpha_0_3, context);
                    i3 &= ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS;
                }
                if ((i2 & 4) != 0) {
                    Context context2 = MMApplicationContext.getContext();
                    C87412m.m108593f(context2, "getContext()");
                    j4 = C110954a.m151254b(C0966R.color.BW_0_Alpha_0_1_5, context2);
                    i3 &= -897;
                }
            } else {
                z.mo51581d();
                if ((i2 & 2) != 0) {
                    i3 &= ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                str4 = str2;
            }
            int i6 = i3;
            long j7 = j3;
            long j8 = j4;
            z.mo51555G();
            int i7 = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            C65503j g = C103214y0.m136591g(aVar, 0.0f, 1, (Object) null);
            z.mo51557H(-483455358);
            C103111a aVar2 = C103111a.f304234a;
            C103111a.C103123l lVar = C103111a.f304237d;
            int i8 = C111294a.f333218a;
            C109895y a = C103157j.m136499a(lVar, C111294a.C111295a.f333228j, z, 0);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C60686v vVar2 = C103645l0.f306130k;
            C33183o oVar = (C33183o) z.mo51598m(vVar2);
            C60686v vVar3 = C103645l0.f306134o;
            C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
            C110269a.C110270a aVar3 = C110269a.f329831D0;
            aVar3.getClass();
            C32224a<C110269a> aVar4 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar4);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar3.getClass();
                C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                C108508o2.m147049a(z, a, pVar);
                aVar3.getClass();
                C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                C108508o2.m147049a(z, dVar, pVar2);
                aVar3.getClass();
                C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                C108508o2.m147049a(z, oVar, pVar3);
                aVar3.getClass();
                C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
                C108508o2.m147049a(z, i2Var, pVar4);
                z.mo51590i();
                long j9 = j7;
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-1163856341);
                C103181p pVar5 = new C103181p(C111294a.C111295a.f333229k, C103612c1.f306063a);
                aVar.mo74972i0(pVar5);
                float f = (float) 8;
                String str5 = str4;
                C65503j h = C103214y0.m136592h(C103166l0.m136523g(pVar5, 0.0f, ((float) 6) * f, 0.0f, ((float) 4) * f, 5, (Object) null), ((float) 8.5d) * f);
                z.mo51557H(693286680);
                C109895y a3 = C103199s0.m136579a(C103111a.f304235b, C111294a.C111295a.f333226h, z, 0);
                z.mo51557H(-1323940314);
                C108322d dVar2 = (C108322d) z.mo51598m(vVar);
                C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
                C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar3);
                aVar3.getClass();
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a4 = C109863q.m149330a(h);
                if (z.mo51543A() instanceof C24665d) {
                    z.mo51615v();
                    if (z.mo51621y()) {
                        z.mo51612t(aVar4);
                    } else {
                        z.mo51579c();
                    }
                    z.mo51561L();
                    aVar3.getClass();
                    C108508o2.m147049a(z, a3, pVar);
                    aVar3.getClass();
                    C108508o2.m147049a(z, dVar2, pVar2);
                    aVar3.getClass();
                    C108508o2.m147049a(z, oVar2, pVar3);
                    aVar3.getClass();
                    C108508o2.m147049a(z, i2Var2, pVar4);
                    z.mo51590i();
                    ((C35747b) a4).invoke(new C33489x1(z), z, 0);
                    z.mo51557H(2058660585);
                    z.mo51557H(-678309503);
                    float f2 = ((float) 6.88d) * f;
                    C103129b1.m136432a(C103214y0.m136596l(aVar, f2), z, 6);
                    float f3 = ((float) 3) * f;
                    float f4 = (float) 1;
                    C65503j h2 = C103214y0.m136592h(C103214y0.m136596l(aVar, f3), f4);
                    C111294a.C37634c cVar = C111294a.C111295a.f333227i;
                    C87412m.m108594g(h2, "<this>");
                    int i9 = (i6 >> 3) & 112;
                    C111294a.C37634c cVar2 = cVar;
                    float f5 = f4;
                    float f6 = f2;
                    C107969n.m146258a(h2.mo74972i0(new C103140e1(cVar, C103612c1.f306063a)), j8, 0.0f, 0.0f, z, i9, 12);
                    long F = ((C108322d) z.mo51598m(vVar)).mo143031F(((float) 1.75d) * f);
                    C103140e1 e1Var = new C103140e1(cVar2, C103612c1.f306063a);
                    aVar.mo74972i0(e1Var);
                    float f7 = f5 * f;
                    C65503j g2 = C103166l0.m136523g(e1Var, f7, 0.0f, f7, 0.0f, 10, (Object) null);
                    C32659e eVar = new C32659e(3);
                    int i15 = (i6 & 14) | LVBuffer.MAX_STRING_LENGTH | ((i6 << 3) & C22657f.CTRL_INDEX);
                    C65503j.C65504a aVar5 = aVar;
                    C107944f0.m146242c(str5, g2, j9, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, eVar, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, i15, 0, 65008);
                    int i16 = C65503j.f188489K0;
                    C65503j h3 = C103214y0.m136592h(C103214y0.m136596l(aVar5, f3), f5);
                    C87412m.m108594g(h3, "<this>");
                    C107969n.m146258a(h3.mo74972i0(new C103140e1(cVar2, C103612c1.f306063a)), j8, 0.0f, 0.0f, z, i9, 12);
                    C103129b1.m136432a(C103214y0.m136596l(aVar5, f6), z, 6);
                    z.mo51565P();
                    z.mo51565P();
                    z.mo51610s();
                    z.mo51565P();
                    z.mo51565P();
                    z.mo51565P();
                    z.mo51565P();
                    z.mo51610s();
                    z.mo51565P();
                    z.mo51565P();
                    str3 = str5;
                    j5 = j8;
                    j6 = j9;
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
            str3 = str2;
            j6 = j3;
            j5 = j4;
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C62019a(str3, j6, j5, i, i2));
        }
    }
}
