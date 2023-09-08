package kf1;

import android.view.View;
import android.widget.TextView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
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

/* renamed from: kf1.c8 */
public final class C9672c8 extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30046d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9672c8(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        super(1);
        this.f30046d = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    public Object invoke(Object obj) {
        TextView textView;
        C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
        C9745g8 g8Var = this.f30046d.f13143n;
        if (g8Var != null) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = g8Var.f30200g;
            View view = null;
            if (refreshLoadMoreLayout != null) {
                View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = g8Var.f30200g;
                if (refreshLoadMoreLayout2 != null) {
                    View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                    TextView textView2 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = g8Var.f30200g;
                    if (refreshLoadMoreLayout3 != null) {
                        View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                        if (loadMoreFooter3 != null) {
                            view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
                        }
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
