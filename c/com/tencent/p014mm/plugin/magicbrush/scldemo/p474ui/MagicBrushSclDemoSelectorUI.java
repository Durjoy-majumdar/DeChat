package com.tencent.p014mm.plugin.magicbrush.scldemo.p474ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p175j0.C60655g0;
import p175j0.C60690y0;
import p267x.C111885b;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103141f;
import p435a0.C103214y0;
import p436a1.C103266t0;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p720v.C111239a0;
import p720v.C111247c;
import p720v.C111292y;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import ta0.C110954a;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/scldemo/ui/MagicBrushSclDemoSelectorUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "mb-samples_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.scldemo.ui.MagicBrushSclDemoSelectorUI */
public final class MagicBrushSclDemoSelectorUI extends MMComposeActivity {

    /* renamed from: com.tencent.mm.plugin.magicbrush.scldemo.ui.MagicBrushSclDemoSelectorUI$a */
    public static final class C56872a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMComposeView f162917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56872a(MMComposeView mMComposeView) {
            super(2);
            this.f162917d = mMComposeView;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                hVar.mo51557H(-492369756);
                Object q = hVar.mo51606q();
                int i = C108504h.f324828a;
                Object obj3 = C108504h.C60656a.f172772a;
                if (q == obj3) {
                    q = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
                    hVar.mo51553F(q);
                }
                hVar.mo51565P();
                C60690y0 y0Var = (C60690y0) q;
                int i2 = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                C65503j f = C103214y0.m136590f(C111885b.m152607c(aVar, C110954a.m151254b(C0966R.color.f2927a, context), (C103266t0) null, 2, (Object) null), 0.0f, 1, (Object) null);
                int i3 = C111294a.f333218a;
                C65503j n = C103214y0.m136598n(f, C111294a.C111295a.f333222d, false, 2, (Object) null);
                MMComposeView mMComposeView = this.f162917d;
                hVar.mo51557H(733328855);
                C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
                hVar.mo51557H(-1323940314);
                C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(n);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar2);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C108508o2.m147049a(hVar, c, C110269a.C110270a.f329836e);
                    C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                    C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                    C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                    hVar.mo51590i();
                    ((C35747b) a).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-2137368960);
                    C111247c.m151758b(((Boolean) y0Var.getValue()).booleanValue(), (C65503j) null, (C111292y) null, (C111239a0) null, (String) null, C110261c.m149878b(hVar, -693452133, true, new C105451c(mMComposeView)), hVar, 196608, 30);
                    hVar.mo51565P();
                    hVar.mo51565P();
                    hVar.mo51610s();
                    hVar.mo51565P();
                    hVar.mo51565P();
                    C13598b0 b0Var = C13598b0.f38549a;
                    hVar.mo51557H(1157296644);
                    boolean x = hVar.mo51619x(y0Var);
                    Object q2 = hVar.mo51606q();
                    if (x || q2 == obj3) {
                        q2 = new C56873d(y0Var, (C15601d<? super C56873d>) null);
                        hVar.mo51553F(q2);
                    }
                    hVar.mo51565P();
                    C60655g0.m70932c(b0Var, (C32227p) q2, hVar, 64);
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

    public int getLayoutId() {
        return 1;
    }

    public View getLayoutView() {
        MMComposeView mMComposeView = new MMComposeView(this, (AttributeSet) null, 2, (C8480h) null);
        mMComposeView.setContent(C110261c.m149879c(2097957817, true, new C56872a(mMComposeView)));
        return mMComposeView;
    }
}
