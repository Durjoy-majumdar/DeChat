package wg1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wg1.v2 */
public final class C15357v2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41709d;

    public C15357v2(C15370z1 z1Var) {
        this.f41709d = z1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f41709d.mo14195j3(4);
        this.f41709d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
