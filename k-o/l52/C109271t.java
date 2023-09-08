package l52;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54209k0;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import i70.C87667c;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import ky3.C88334c;
import n70.C47167a;
import o52.C61943d;
import o52.C61944e;
import o52.C61945f;
import o52.C61946g;
import p004b0.C103937e;
import p004b0.C103953l0;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60690y0;
import p190l1.C109099h0;
import p257w.C37903i;
import p267x.C111885b;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103141f;
import p435a0.C103166l0;
import p435a0.C103177n0;
import p435a0.C103214y0;
import p436a1.C103266t0;
import p436a1.C103272w;
import p436a1.C103276y;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108322d;
import p560i2.C33181m;
import p560i2.C33183o;
import p583k2.C108846c;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p720v.C111255f;
import p721v0.C111294a;
import p721v0.C111299g;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import p759y.C112195b0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: l52.t */
public final class C109271t extends UIComponent {

    /* renamed from: d */
    public final C61944e f327143d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.component.MagicBrushSclListDemoUIC$onCreate$1", mo125469f = "MagicBrushSclListDemoUIC.kt", mo125470l = {65}, mo125471m = "invokeSuspend")
    /* renamed from: l52.t$a */
    public static final class C61238a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174304d;

        /* renamed from: e */
        public final /* synthetic */ C109271t f174305e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61238a(C109271t tVar, C15601d<? super C61238a> dVar) {
            super(2, dVar);
            this.f174305e = tVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61238a(this.f174305e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61238a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174304d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f174304d = 1;
                ((C61217a) C39818r.f106831a.mo62444c(this.f174305e.getActivity()).mo75002a(C61217a.class)).mo86194d3(this);
                return aVar;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.component.MagicBrushSclListDemoUIC$onCreate$2", mo125469f = "MagicBrushSclListDemoUIC.kt", mo125470l = {68}, mo125471m = "invokeSuspend")
    /* renamed from: l52.t$b */
    public static final class C61239b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174306d;

        /* renamed from: e */
        public final /* synthetic */ C109271t f174307e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61239b(C109271t tVar, C15601d<? super C61239b> dVar) {
            super(2, dVar);
            this.f174307e = tVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61239b(this.f174307e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61239b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174306d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C61944e eVar = this.f174307e.f327143d;
                this.f174306d = 1;
                if (eVar.mo86858d3("frames", "", this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C54219z<List<C61943d>> zVar = this.f174307e.f327143d.f176076e;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 20; i2++) {
                arrayList.add(new C61946g());
            }
            zVar.setValue(arrayList);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109271t(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39629l0.m42233a(appCompatActivity, (C54209k0.C54210b) null).mo75002a(C61944e.class);
        C87412m.m108593f(a, "of(activity).get(MagicBr…emoViewModel::class.java)");
        this.f327143d = (C61944e) a;
    }

    /* renamed from: c3 */
    public static final void m148384c3(C109271t tVar, List list, C108504h hVar, int i) {
        C109271t tVar2 = tVar;
        List list2 = list;
        tVar.getClass();
        C108504h z = hVar.mo51623z(-587334653);
        int i2 = C65503j.f188489K0;
        C103937e.m138656a(C111299g.m151786a(C65503j.C65504a.f188490d, C103612c1.f306063a, new C111255f((C32227p<? super C33181m, ? super C33181m, C13598b0>) null, C37903i.m41594b(0.0f, 0.0f, (Object) null, 7, (Object) null))), (C103953l0) null, (C103177n0) null, false, (C103111a.C103123l) null, (C111294a.C37633b) null, (C112195b0) null, false, new C61231k(list2, tVar), z, 0, 254);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C109270l(tVar, list2, i));
        }
    }

    /* renamed from: d3 */
    public static final void m148385d3(C109271t tVar, C61945f fVar, C108504h hVar, int i) {
        C109271t tVar2 = tVar;
        C61945f fVar2 = fVar;
        tVar.getClass();
        C108504h z = hVar.mo51623z(569777430);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c(Integer.valueOf(C47167a.m52445b(1)), (C108497e2) null, 2, (Object) null);
            z.mo51553F(q);
        }
        z.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        int i3 = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        C65503j h = C103214y0.m136592h(C103214y0.m136591g(C111885b.m152607c(aVar, tVar.mo160505f3(), (C103266t0) null, 2, (Object) null), 0.0f, 1, (Object) null), (float) C47167a.m52444a(Integer.valueOf(((Number) y0Var.getValue()).intValue())));
        z.mo51557H(733328855);
        int i4 = C111294a.f333218a;
        C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, z, 0);
        z.mo51557H(-1323940314);
        C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
        C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
        C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
        C110269a.f329831D0.getClass();
        C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(h);
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
            C108846c.m147713a(new C61233n(fVar2, y0Var), C103214y0.m136590f(aVar, 0.0f, 1, (Object) null), new C61235p(tVar2, fVar2), z, 48, 0);
            z.mo51565P();
            z.mo51565P();
            z.mo51610s();
            z.mo51565P();
            z.mo51565P();
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C61236q(tVar2, fVar2, i));
                return;
            }
            return;
        }
        C108501g.m147000a();
        throw null;
    }

    /* renamed from: e3 */
    public static final void m148386e3(C109271t tVar, int i, C108504h hVar, int i2) {
        C109271t tVar2 = tVar;
        int i3 = i;
        tVar.getClass();
        C108504h z = hVar.mo51623z(-2064261125);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        int i4 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c(new C103272w(tVar.mo160505f3()), (C108497e2) null, 2, (Object) null);
            z.mo51553F(q);
        }
        z.mo51565P();
        int i5 = C65503j.f188489K0;
        C65503j g = C103166l0.m136523g(C109099h0.m148137a(C103214y0.m136592h(C103214y0.m136591g(C111885b.m152607c(C65503j.C65504a.f188490d, ((C103272w) ((C60690y0) q).getValue()).f304517a, (C103266t0) null, 2, (Object) null), 0.0f, 1, (Object) null), (float) 128), C13598b0.f38549a, new C88383r(tVar2, (C15601d<? super C88383r>) null)), (float) 8, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        int i6 = C111294a.f333218a;
        C111294a aVar = C111294a.C111295a.f333221c;
        z.mo51557H(733328855);
        C109895y c = C103141f.m136472c(aVar, false, z, 6);
        z.mo51557H(-1323940314);
        C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
        C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
        C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
        C110269a.f329831D0.getClass();
        C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(g);
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
            C107944f0.m146242c("普通卡片(" + i3 + ')', (C65503j) null, 0, 0, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, 0, 0, 65534);
            z.mo51565P();
            z.mo51565P();
            z.mo51610s();
            z.mo51565P();
            z.mo51565P();
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C61237s(tVar2, i3, i2));
                return;
            }
            return;
        }
        C108501g.m147000a();
        throw null;
    }

    /* renamed from: f3 */
    public final long mo160505f3() {
        C88334c.C88335a aVar = C88334c.f255322d;
        int g = aVar.mo122718g(256);
        int g2 = aVar.mo122718g(256);
        return C103276y.m136791b((aVar.mo122718g(256) & 255) | -16777216 | ((g & 255) << 16) | ((g2 & 255) << 8));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C61238a(this, (C15601d<? super C61238a>) null), 3, (Object) null);
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C61239b(this, (C15601d<? super C61239b>) null), 3, (Object) null);
    }

    public void onDestroy() {
        super.onDestroy();
        C61217a aVar = (C61217a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C61217a.class);
        C87667c<?, ?>.a aVar2 = aVar.f174260d;
        if (aVar2 != null) {
            aVar.f174262f.mo122097y0(aVar2.f253930e);
            aVar.f174262f.mo118861j0();
        }
    }
}
