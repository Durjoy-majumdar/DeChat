package kp1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import com.tencent.p014mm.plugin.finder.search.p055ui.FinderMixSearchFeedFragment;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import oq3.C21804c;
import qq3.C63318b;
import rx3.C13604l;

/* renamed from: kp1.a */
public final class C10376a implements C63318b {

    /* renamed from: a */
    public final /* synthetic */ FinderMixSearchFeedFragment f31585a;

    public C10376a(FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
        this.f31585a = finderMixSearchFeedFragment;
    }

    /* renamed from: a */
    public void mo3374a(boolean z) {
    }

    public void onLoadMore() {
        C13604l<Boolean, Boolean> lVar;
        View view;
        View view2;
        View view3;
        TextView textView;
        View view4;
        View view5;
        View view6;
        TextView textView2;
        FinderMixSearchFeedFragment finderMixSearchFeedFragment = this.f31585a;
        FinderMixSearchPresenter finderMixSearchPresenter = finderMixSearchFeedFragment.f16655r;
        if (finderMixSearchPresenter != null) {
            lVar = finderMixSearchPresenter.mo3907R0(finderMixSearchFeedFragment.f17334o);
        } else {
            Boolean bool = Boolean.FALSE;
            lVar = new C13604l<>(bool, bool);
        }
        boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
        if (((Boolean) lVar.f38556e).booleanValue()) {
            View view7 = null;
            if (booleanValue) {
                C21804c loadMoreFooter = this.f31585a.mo3952X().getLoadMoreFooter();
                View view8 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
                if (view8 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view8, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C21804c loadMoreFooter2 = this.f31585a.mo3952X().getLoadMoreFooter();
                if (!(loadMoreFooter2 == null || (view6 = loadMoreFooter2.getView()) == null || (textView2 = (TextView) view6.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eas);
                }
                C21804c loadMoreFooter3 = this.f31585a.mo3952X().getLoadMoreFooter();
                TextView textView3 = (loadMoreFooter3 == null || (view5 = loadMoreFooter3.getView()) == null) ? null : (TextView) view5.findViewById(C0966R.C0970id.g2t);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                C21804c loadMoreFooter4 = this.f31585a.mo3952X().getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (view4 = loadMoreFooter4.getView()) == null)) {
                    view7 = view4.findViewById(C0966R.C0970id.g2s);
                }
                if (view7 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view9 = view7;
                    C117292a.m165358d(view9, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            C21804c loadMoreFooter5 = this.f31585a.mo3952X().getLoadMoreFooter();
            View view10 = loadMoreFooter5 != null ? loadMoreFooter5.getView() : null;
            if (view10 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                C117292a.m165358d(view10, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C21804c loadMoreFooter6 = this.f31585a.mo3952X().getLoadMoreFooter();
            if (!(loadMoreFooter6 == null || (view3 = loadMoreFooter6.getView()) == null || (textView = (TextView) view3.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setText(C0966R.string.eat);
            }
            C21804c loadMoreFooter7 = this.f31585a.mo3952X().getLoadMoreFooter();
            TextView textView4 = (loadMoreFooter7 == null || (view2 = loadMoreFooter7.getView()) == null) ? null : (TextView) view2.findViewById(C0966R.C0970id.g2t);
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            C21804c loadMoreFooter8 = this.f31585a.mo3952X().getLoadMoreFooter();
            if (!(loadMoreFooter8 == null || (view = loadMoreFooter8.getView()) == null)) {
                view7 = view.findViewById(C0966R.C0970id.g2s);
            }
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view11 = view7;
                C117292a.m165358d(view11, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
