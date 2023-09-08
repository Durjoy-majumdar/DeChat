package vf1;

import android.view.View;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizSearchUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.w1 */
public final class C65736w1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizSearchUI f189101d;

    public C65736w1(FinderLiveBizSearchUI finderLiveBizSearchUI) {
        this.f189101d = finderLiveBizSearchUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveBizSearchUI finderLiveBizSearchUI = this.f189101d;
        FTSSearchView fTSSearchView = finderLiveBizSearchUI.f158972q;
        if (fTSSearchView != null) {
            finderLiveBizSearchUI.mo77425O7(fTSSearchView.getFtsEditText().getEditText().getText().toString());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
