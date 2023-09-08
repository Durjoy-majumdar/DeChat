package il1;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.view.View;
import bl3.C39818r;
import c30.C104289g;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import di3.C7335d;
import di3.C86312j;
import er1.C58777u0;
import gy3.C87412m;
import ht1.C8777j5;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49188dt1;
import te3.C50169kr1;
import te3.C51613uy0;
import xk1.C66355w;
import zp3.C23555k;

/* renamed from: il1.a0 */
public final class C60339a0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f171995a;

    public C60339a0(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget) {
        this.f171995a = finderLiveAnchorGameTogetherWidget;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        Class cls = C54991o.class;
        View view2 = view;
        C87412m.m108594g(view, "view");
        if (z) {
            int i = 0;
            String str = null;
            if (!this.f171995a.mo78218c()) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f171995a.f160036a.getContext();
                C87412m.m108593f(context, "root.context");
                C50169kr1 kr12 = ((C66355w) rVar.mo62443b(context).mo75002a(C66355w.class)).f191042x;
                C58777u0 u0Var = C58777u0.f168283a;
                C104289g gVar = new C104289g();
                gVar.mo145953n("result", 2);
                if (kr12 != null) {
                    str = kr12.f137001d;
                }
                gVar.put("appid", str);
                if (kr12 != null) {
                    i = kr12.f137014t;
                }
                gVar.mo145953n("game_type", 2 - i);
                C13598b0 b0Var = C13598b0.f38549a;
                u0Var.mo83834c(22, gVar);
                return;
            }
            C51613uy0 uy02 = ((C54991o) this.f171995a.f160038c.mo87684A0().mo71262a(cls)).f154363s1;
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C0073g0 g0Var = C0073g0.ANCHOR_GAME_TOGETHER;
            C104289g gVar2 = new C104289g();
            FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget = this.f171995a;
            gVar2.mo145953n("result", 2);
            if (uy02 != null) {
                str = uy02.f143182f;
            }
            gVar2.put("appid", str);
            C62042e eVar = C62042e.f176370a;
            C49188dt1 dt12 = ((C54991o) finderLiveAnchorGameTogetherWidget.f160038c.mo87696x0(cls)).f154298b4;
            if (dt12 != null) {
                i = dt12.f132523f;
            }
            gVar2.mo145953n("game_type", eVar.mo87052W1(i));
            C13598b0 b0Var2 = C13598b0.f38549a;
            C8777j5.C8778a.m8605f(j5Var, g0Var, gVar2.toString(), (String) null, 4, (Object) null);
        }
    }
}
