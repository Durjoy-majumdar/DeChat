package f63;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72362a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f63.c */
public class C75715c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Bankcard f222311d;

    /* renamed from: e */
    public final /* synthetic */ C72362a f222312e;

    public C75715c(C72362a aVar, Bankcard bankcard) {
        this.f222312e = aVar;
        this.f222311d = bankcard;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierBankcardDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        Log.m105925i("MicroMsg.WcPayCashierBankcardDialog", "go to url %s", this.f222311d.field_forbid_url);
        intent.putExtra("rawUrl", this.f222311d.field_forbid_url);
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        intent.putExtra("pay_channel", 1);
        C75228t.m90218K(this.f222312e.f210488i, intent, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierBankcardDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
