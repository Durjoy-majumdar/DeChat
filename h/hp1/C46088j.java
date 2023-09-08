package hp1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderFansSearchUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hp1.j */
public final class C46088j implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFansSearchUI f124244d;

    public C46088j(FinderFansSearchUI finderFansSearchUI) {
        this.f124244d = finderFansSearchUI;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        FTSSearchView fTSSearchView = this.f124244d.f111710o;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70335c();
            this.f124244d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
