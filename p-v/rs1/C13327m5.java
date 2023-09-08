package rs1;

import android.view.View;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: rs1.m5 */
public final class C13327m5 extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13298k5 f37801d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13327m5(C13298k5 k5Var) {
        super(1);
        this.f37801d = k5Var;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
        if (!iResponse.getHasMore()) {
            View loadMoreFooter = this.f37801d.mo12750i3().getLoadMoreFooter();
            View view = null;
            View findViewById = loadMoreFooter != null ? loadMoreFooter.findViewById(C0966R.C0970id.ive) : null;
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View loadMoreFooter2 = this.f37801d.mo12750i3().getLoadMoreFooter();
            if (loadMoreFooter2 != null) {
                view = loadMoreFooter2.findViewById(C0966R.C0970id.g2q);
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return C13598b0.f38549a;
    }
}
