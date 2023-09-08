package il1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: il1.q3 */
public final class C9096q3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9048l3 f28674d;

    public C9096q3(C9048l3 l3Var) {
        this.f28674d = l3Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9048l3 l3Var = this.f28674d;
        Set<Integer> set = C9048l3.f28561G;
        l3Var.mo9873e();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
