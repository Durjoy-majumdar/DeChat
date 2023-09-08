package il1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p671qy.C63344h;
import qj1.C62660c;
import qj1.C63144yg;
import rx3.C13598b0;

/* renamed from: il1.d8 */
public final class C60387d8 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f172192d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60387d8(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget) {
        super(1);
        this.f172192d = finderLiveVisitorGameTogetherWidget;
    }

    public Object invoke(Object obj) {
        String str;
        if (!((Boolean) obj).booleanValue()) {
            View view = this.f172192d.f160113g;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$initContentView$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$initContentView$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f172192d.f160109c.mo10792g(8);
                C62660c cVar = this.f172192d.f160109c;
                C63144yg ygVar = cVar instanceof C63144yg ? (C63144yg) cVar : null;
                if (ygVar != null) {
                    Class cls = C63344h.class;
                    Log.m105924i(ygVar.f179179q, "releaseDynamicCardEnv");
                    C87667c<?, ?>.a aVar2 = ygVar.f179182t;
                    if (!(aVar2 == null || (str = aVar2.f253930e) == null)) {
                        ((C63344h) C86312j.m106911c(cls)).mo88242Eu(str);
                    }
                    ygVar.f179182t = null;
                    ((C63344h) C86312j.m106911c(cls)).mo88244Pc((C63344h.C63346b) null);
                    ((C63344h) C86312j.m106911c(cls)).mo88248t();
                }
            } else {
                C87412m.m108603p("rootView");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
