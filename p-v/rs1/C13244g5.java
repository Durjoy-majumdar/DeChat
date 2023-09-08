package rs1;

import android.view.View;
import as1.C0201a;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.g5 */
public final class C13244g5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderHorizontalVideoDrawerUIC f37604d;

    public C13244g5(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        this.f37604d = finderHorizontalVideoDrawerUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$initRecommendDrawer$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("FinderHorizontalVideoDrawerUIC", "onClick: isPeek=" + this.f37604d.f18676f);
        FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f37604d;
        if (finderHorizontalVideoDrawerUIC.f18676f) {
            finderHorizontalVideoDrawerUIC.f18676f = false;
            C0201a e3 = finderHorizontalVideoDrawerUIC.mo5141e3();
            e3.mo4919k(-e3.f18132i, false);
            ((C13298k5) C39818r.f106831a.mo62444c(this.f37604d.getActivity()).mo75002a(C13298k5.class)).f37738e = 3;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$initRecommendDrawer$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
