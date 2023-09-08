package v82;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.r0 */
public final class C111486r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111456j0 f333780d;

    public C111486r0(C111456j0 j0Var) {
        this.f333780d = j0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111456j0 j0Var = this.f333780d;
        if (j0Var.f333711u) {
            j0Var.mo163162m();
        } else {
            j0Var.mo163166q();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
