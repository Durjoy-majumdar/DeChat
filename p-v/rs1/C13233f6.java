package rs1;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.f6 */
public final class C13233f6 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<ViewGroup> f37582d;

    /* renamed from: e */
    public final /* synthetic */ FinderLikeGuideUIC f37583e;

    public C13233f6(C8479f0<ViewGroup> f0Var, FinderLikeGuideUIC finderLikeGuideUIC) {
        this.f37582d = f0Var;
        this.f37583e = finderLikeGuideUIC;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLikeGuideUIC$checkShow$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            ((ViewGroup) this.f37582d.f27484d).removeView(this.f37583e.f18758d);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLikeGuideUIC$checkShow$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
