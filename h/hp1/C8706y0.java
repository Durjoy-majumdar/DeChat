package hp1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderTopicSearchUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hp1.y0 */
public final class C8706y0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicSearchUI f27935d;

    public C8706y0(FinderTopicSearchUI finderTopicSearchUI) {
        this.f27935d = finderTopicSearchUI;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        FTSSearchView fTSSearchView = this.f27935d.f16606d;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70335c();
            this.f27935d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
