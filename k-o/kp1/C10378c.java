package kp1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.search.p055ui.FinderSearchBaseUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: kp1.c */
public final class C10378c extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderSearchBaseUI f31587a;

    public C10378c(FinderSearchBaseUI finderSearchBaseUI) {
        this.f31587a = finderSearchBaseUI;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        TextView textView;
        TextView textView2;
        Log.m105924i(this.f31587a.f16668o, "onLoadMoreBegin");
        this.f31587a.getClass();
        FinderSearchBaseUI finderSearchBaseUI = this.f31587a;
        View view = null;
        if (finderSearchBaseUI.mo3104N7().hasMore()) {
            String str = finderSearchBaseUI.f16668o;
            Log.m105924i(str, "startSearchNextPage: " + finderSearchBaseUI.f16670q);
            finderSearchBaseUI.mo3104N7().mo3944a();
            Log.m105924i(finderSearchBaseUI.f16668o, "showLoadMoreFooter");
            View loadMoreFooter = finderSearchBaseUI.mo3959P7().getLoadMoreFooter();
            if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView2.setText(C0966R.string.eas);
            }
            View loadMoreFooter2 = finderSearchBaseUI.mo3959P7().getLoadMoreFooter();
            TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            View loadMoreFooter3 = finderSearchBaseUI.mo3959P7().getLoadMoreFooter();
            if (loadMoreFooter3 != null) {
                view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
            }
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        Log.m105924i(finderSearchBaseUI.f16668o, "showNoMoreFooter");
        View loadMoreFooter4 = finderSearchBaseUI.mo3959P7().getLoadMoreFooter();
        if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
            textView.setText(C0966R.string.eat);
        }
        View loadMoreFooter5 = finderSearchBaseUI.mo3959P7().getLoadMoreFooter();
        TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        View loadMoreFooter6 = finderSearchBaseUI.mo3959P7().getLoadMoreFooter();
        if (loadMoreFooter6 != null) {
            view = loadMoreFooter6.findViewById(C0966R.C0970id.g2s);
        }
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
