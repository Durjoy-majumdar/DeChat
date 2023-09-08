package wg1;

import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: wg1.d3 */
public final class C65990d3 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65982b3 f189726d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65990d3(C65982b3 b3Var) {
        super(1);
        this.f189726d = b3Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C66009f4 f4Var = this.f189726d.f189712h;
        C87412m.m108592e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.FinderLiveVisitorMusicSingSongViewCallback");
        WxRecyclerView wxRecyclerView = ((C66002f3) f4Var).f189763s;
        if (wxRecyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(intValue));
            WxRecyclerView wxRecyclerView2 = wxRecyclerView;
            C117292a.m165358d(wxRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongPresenter$onAttach$1$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongPresenter$onAttach$1$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
