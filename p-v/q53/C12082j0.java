package q53;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.j0 */
public final class C12082j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12062e0 f35166d;

    public C12082j0(C12062e0 e0Var) {
        this.f35166d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f35166d.mo11909a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
