package f63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72362a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f63.b */
public class C75714b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72362a f222310d;

    public C75714b(C72362a aVar) {
        this.f222310d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierBankcardDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f222310d.cancel();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierBankcardDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
