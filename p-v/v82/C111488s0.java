package v82;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.C0120a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;
import x82.C112113q;
import z82.C112612a;

/* renamed from: v82.s0 */
public final class C111488s0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111456j0 f333783d;

    public C111488s0(C111456j0 j0Var) {
        this.f333783d = j0Var;
    }

    public final void onClick(View view) {
        C112113q qVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111456j0 j0Var = this.f333783d;
        j0Var.f333708r = "";
        j0Var.mo163161l().f314941n.removeObserver((C0120a0) ((C36570n) j0Var.f333713w).getValue());
        j0Var.mo163158i().mo150946f();
        j0Var.mo163152c().setVisibility(0);
        j0Var.mo163152c().mo150985a();
        j0Var.mo163158i().setVisibility(8);
        C112612a aVar = j0Var.f333710t;
        if (!(aVar == null || (qVar = aVar.f337244f) == null)) {
            qVar.mo163847g();
        }
        C112612a aVar2 = j0Var.f333710t;
        if (aVar2 != null) {
            RelativeLayout relativeLayout = (RelativeLayout) ((C36570n) j0Var.f333705o).getValue();
            C87412m.m108593f(relativeLayout, "screenCasePluginLayout");
            aVar2.mo164385f(relativeLayout);
        }
        j0Var.f333710t = null;
        j0Var.mo163155f().setOnClickListener(new C111479m0(j0Var));
        j0Var.mo163167r(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$openScreenCastBigVideo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
