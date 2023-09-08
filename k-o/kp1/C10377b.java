package kp1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.search.p055ui.FinderSearchBaseUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kp1.b */
public final class C10377b implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSearchBaseUI f31586d;

    public C10377b(FinderSearchBaseUI finderSearchBaseUI) {
        this.f31586d = finderSearchBaseUI;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f31586d.mo3960Q7().getFtsEditText().mo70335c();
        this.f31586d.hideVKB();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
