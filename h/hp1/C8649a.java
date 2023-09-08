package hp1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchIncludeFollowUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hp1.a */
public final class C8649a implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FinderContactSearchIncludeFollowUI f27804d;

    public C8649a(FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI) {
        this.f27804d = finderContactSearchIncludeFollowUI;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        FTSSearchView fTSSearchView = this.f27804d.f16402d;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70335c();
            this.f27804d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
