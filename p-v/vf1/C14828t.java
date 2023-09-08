package vf1;

import android.view.View;
import android.widget.TextView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFavTimelineUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9993u1;
import rx3.C13598b0;

/* renamed from: vf1.t */
public final class C14828t extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFavTimelineUI f40825d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14828t(FinderFavTimelineUI finderFavTimelineUI) {
        super(1);
        this.f40825d = finderFavTimelineUI;
    }

    public Object invoke(Object obj) {
        TextView textView;
        TextView textView2;
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
        if (!iResponse.getHasMore()) {
            C9993u1 u1Var = this.f40825d.f14271t;
            View view = null;
            if (u1Var != null) {
                View loadMoreFooter = u1Var.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C9993u1 u1Var2 = this.f40825d.f14271t;
                if (u1Var2 != null) {
                    View loadMoreFooter2 = u1Var2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(this.f40825d.getResources().getColor(C0966R.color.FG_2));
                    }
                    C9993u1 u1Var3 = this.f40825d.f14271t;
                    if (u1Var3 != null) {
                        View loadMoreFooter3 = u1Var3.mo10308D().getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        C9993u1 u1Var4 = this.f40825d.f14271t;
                        if (u1Var4 != null) {
                            View loadMoreFooter4 = u1Var4.mo10308D().getLoadMoreFooter();
                            if (loadMoreFooter4 != null) {
                                view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                            }
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$createFeedLoader$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$createFeedLoader$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
