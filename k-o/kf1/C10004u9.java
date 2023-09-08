package kf1;

import android.view.View;
import android.widget.TextView;
import cm1.C0716c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: kf1.u9 */
public final class C10004u9 extends C87413o implements C32226l<IResponse<C0716c>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9957r9 f30695d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10004u9(C9957r9 r9Var) {
        super(1);
        this.f30695d = r9Var;
    }

    public Object invoke(Object obj) {
        View loadMoreFooter;
        View loadMoreFooter2;
        View loadMoreFooter3;
        TextView textView;
        View loadMoreFooter4;
        TextView textView2;
        C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
        if (this.f30695d.mo10459q().getDataListJustForAdapter().size() > 4) {
            RefreshLoadMoreLayout c = this.f30695d.mo10460t().mo10293c();
            View view = null;
            View loadMoreFooter5 = c != null ? c.getLoadMoreFooter() : null;
            if (loadMoreFooter5 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(loadMoreFooter5, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadMoreFooter5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(loadMoreFooter5, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RefreshLoadMoreLayout c2 = this.f30695d.mo10460t().mo10293c();
            if (!(c2 == null || (loadMoreFooter4 = c2.getLoadMoreFooter()) == null || (textView2 = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView2.setText(C0966R.string.eat);
            }
            RefreshLoadMoreLayout c3 = this.f30695d.mo10460t().mo10293c();
            if (!(c3 == null || (loadMoreFooter3 = c3.getLoadMoreFooter()) == null || (textView = (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setTextColor(this.f30695d.f30606d.getResources().getColor(C0966R.color.FG_2));
            }
            RefreshLoadMoreLayout c4 = this.f30695d.mo10460t().mo10293c();
            TextView textView3 = (c4 == null || (loadMoreFooter2 = c4.getLoadMoreFooter()) == null) ? null : (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            RefreshLoadMoreLayout c5 = this.f30695d.mo10460t().mo10293c();
            if (!(c5 == null || (loadMoreFooter = c5.getLoadMoreFooter()) == null)) {
                view = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return C13598b0.f38549a;
    }
}
