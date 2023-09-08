package wg1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p140cw.C7138g;
import qo3.C77407n;

/* renamed from: wg1.t2 */
public final class C15353t2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41705d;

    public C15353t2(C15370z1 z1Var) {
        this.f41705d = z1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f41705d.f41737L;
        if (str == null || str.length() == 0) {
            ((C7138g) C86312j.m106911c(C7138g.class)).mo8317di(this.f41705d.getContext(), 1000, 9, 0, (Intent) null, false);
        } else {
            C15370z1 z1Var = this.f41705d;
            C77407n nVar = new C77407n((Context) z1Var.getContext(), 1, false);
            nVar.f225771i = new C15347r2(z1Var);
            nVar.f225782p = new C15351s2(z1Var, nVar);
            nVar.mo107573q();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
