package fa0;

import android.content.Context;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import ca0.C104344e0;
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
import p1104d1.C106969c;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60686v;
import p246u1.C111072h;
import p267x.C111885b;
import p267x.C111897d1;
import p267x.C111940o;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103140e1;
import p435a0.C103141f;
import p435a0.C103161k;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p436a1.C103266t0;
import p436a1.C103274x;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p502e0.C107074g;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109836f;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import p868x0.C111979d;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: fa0.d */
public final class C107536d {

    /* renamed from: fa0.d$a */
    public static final class C58933a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103161k f168635d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f168636e;

        /* renamed from: f */
        public final /* synthetic */ int f168637f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58933a(C103161k kVar, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f168635d = kVar;
            this.f168636e = aVar;
            this.f168637f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107536d.m145665a(this.f168635d, this.f168636e, (C108504h) obj, this.f168637f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m145665a(C103161k kVar, C32224a<C13598b0> aVar, C108504h hVar, int i) {
        int i2;
        C108504h hVar2;
        C103161k kVar2 = kVar;
        C32224a<C13598b0> aVar2 = aVar;
        int i3 = i;
        C87412m.m108594g(kVar2, "<this>");
        C87412m.m108594g(aVar2, "onClick");
        C108504h z = hVar.mo51623z(585774603);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(kVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= z.mo51619x(aVar2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !z.mo51575a()) {
            int i4 = C65503j.f188489K0;
            C65503j.C65504a aVar3 = C65503j.C65504a.f188490d;
            C104344e0 e0Var = C104344e0.f308940k;
            C65503j a = C111979d.m152690a(C103166l0.m136523g(aVar3, C104344e0.f308941l.f308949h, 0.0f, 0.0f, 0.0f, 14, (Object) null), C107074g.m144958a(((float) 2) * ((float) 8)));
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C65503j d = C111940o.m152651d(C111885b.m152607c(a, C110954a.m151254b(C0966R.color.BW_100_Alpha_0_0_5, context), (C103266t0) null, 2, (Object) null), false, (String) null, (C111072h) null, aVar, 7, (Object) null);
            int i5 = C111294a.f333218a;
            C65503j b = kVar2.mo142912b(d, C111294a.C111295a.f333228j);
            z.mo51557H(733328855);
            C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, z, 0);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C60686v vVar2 = C103645l0.f306130k;
            C33183o oVar = (C33183o) z.mo51598m(vVar2);
            C60686v vVar3 = C103645l0.f306134o;
            C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
            C110269a.C110270a aVar4 = C110269a.f329831D0;
            aVar4.getClass();
            C32224a<C110269a> aVar5 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(b);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar5);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar4.getClass();
                C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                C108508o2.m147049a(z, c, pVar);
                aVar4.getClass();
                C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                C108508o2.m147049a(z, dVar, pVar2);
                aVar4.getClass();
                C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                C108508o2.m147049a(z, oVar, pVar3);
                aVar4.getClass();
                C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
                C108508o2.m147049a(z, i2Var, pVar4);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-2137368960);
                C65503j c2 = C103166l0.m136519c(aVar3, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3623g)));
                C111294a.C37634c cVar = C111294a.C111295a.f333227i;
                z.mo51557H(693286680);
                C103111a aVar6 = C103111a.f304234a;
                C109895y a3 = C103199s0.m136579a(C103111a.f304235b, cVar, z, 48);
                z.mo51557H(-1323940314);
                C108322d dVar2 = (C108322d) z.mo51598m(vVar);
                C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
                C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar3);
                aVar4.getClass();
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a4 = C109863q.m149330a(c2);
                C60686v vVar4 = vVar;
                if (z.mo51543A() instanceof C24665d) {
                    z.mo51615v();
                    if (z.mo51621y()) {
                        z.mo51612t(aVar5);
                    } else {
                        z.mo51579c();
                    }
                    z.mo51561L();
                    aVar4.getClass();
                    C108508o2.m147049a(z, a3, pVar);
                    aVar4.getClass();
                    C108508o2.m147049a(z, dVar2, pVar2);
                    aVar4.getClass();
                    C108508o2.m147049a(z, oVar2, pVar3);
                    aVar4.getClass();
                    C108508o2.m147049a(z, i2Var2, pVar4);
                    z.mo51590i();
                    ((C35747b) a4).invoke(new C33489x1(z), z, 0);
                    z.mo51557H(2058660585);
                    z.mo51557H(-678309503);
                    Context context2 = MMApplicationContext.getContext();
                    C87412m.m108593f(context2, "getContext()");
                    C106969c a5 = C110954a.m151253a(C0966R.raw.icons_filled_search, C110954a.m151254b(C0966R.color.aeo, context2), z, 0);
                    C65503j g = C103166l0.m136523g(aVar3, 0.0f, 0.0f, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3956le)), 0.0f, 11, (Object) null);
                    C87412m.m108594g(g, "<this>");
                    hVar2 = z;
                    C111897d1.m152617a(a5, "", g.mo74972i0(new C103140e1(cVar, C103612c1.f306063a)), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar2, 56, 120);
                    String string = MMApplicationContext.getString(C0966R.string.f361416jq1);
                    long F = ((C108322d) hVar2.mo51598m(vVar4)).mo143031F((float) 14);
                    Context context3 = MMApplicationContext.getContext();
                    C87412m.m108593f(context3, "getContext()");
                    long b2 = C110954a.m151254b(C0966R.color.BW_100_Alpha_0_5, context3);
                    C65503j g2 = C103166l0.m136523g(aVar3, 0.0f, 0.0f, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3623g)), 0.0f, 11, (Object) null);
                    C87412m.m108593f(string, "str");
                    C107944f0.m146242c(string, g2, b2, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, LVBuffer.MAX_STRING_LENGTH, 0, 65520);
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    hVar2.mo51610s();
                    hVar2.mo51565P();
                    hVar2.mo51565P();
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
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
            hVar2 = z;
        }
        C33487v1 l = hVar2.mo51596l();
        if (l != null) {
            l.mo51650a(new C58933a(kVar, aVar, i));
        }
    }
}
