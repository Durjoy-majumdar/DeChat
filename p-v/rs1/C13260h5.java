package rs1;

import android.view.View;
import as1.C0201a;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.h5 */
public final class C13260h5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderHorizontalVideoDrawerUIC f37634d;

    public C13260h5(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        this.f37634d = finderHorizontalVideoDrawerUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$startVideoAnim$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0201a e3 = this.f37634d.mo5141e3();
        e3.mo4919k(e3.f18132i, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$startVideoAnim$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
