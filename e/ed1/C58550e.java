package ed1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ed1.e */
public final class C58550e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58551f f167589d;

    public C58550e(C58551f fVar) {
        this.f167589d = fVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$onClickSwitch$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104428a aVar = this.f167589d.f167591e;
        if (aVar != null) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$onClickSwitch$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
