package vf1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.a0 */
public final class C65687a0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FinderGallerySearchUI f189030d;

    public C65687a0(FinderGallerySearchUI finderGallerySearchUI) {
        this.f189030d = finderGallerySearchUI;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initContentView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        FTSSearchView fTSSearchView = this.f189030d.f158884q;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70335c();
            this.f189030d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initContentView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
