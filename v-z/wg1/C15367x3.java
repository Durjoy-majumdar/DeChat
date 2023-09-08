package wg1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wg1.x3 */
public final class C15367x3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15278g3 f41723d;

    public C15367x3(C15278g3 g3Var) {
        this.f41723d = g3Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f41723d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
