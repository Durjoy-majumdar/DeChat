package s63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery;
import com.tencent.p014mm.plugin.wallet_payu.bind.p892ui.WalletPayUCardElementUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: s63.b */
public class C77622b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUCardElementUI f226285d;

    public C77622b(WalletPayUCardElementUI walletPayUCardElementUI) {
        this.f226285d = walletPayUCardElementUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WalletPayUCardElementUI walletPayUCardElementUI = this.f226285d;
        NetScenePayUElementQuery.PayUBankcardElement payUBankcardElement = walletPayUCardElementUI.f211150p.get(walletPayUCardElementUI.f211141d.getText());
        if (payUBankcardElement == null) {
            Log.m105920e("MicroMsg.WalletPayUCardElementUI", "hy: should not be NULL!!!");
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f226285d.f211141d.setEncryptType(50);
        this.f226285d.getInput().putParcelable("key_card_element", payUBankcardElement);
        this.f226285d.getInput().putString("key_card_id", this.f226285d.f211141d.getText());
        this.f226285d.getInput().putString("key_cvv", this.f226285d.f211143f.getText());
        this.f226285d.getInput().putString("key_expire_data", this.f226285d.f211142e.getText());
        this.f226285d.getNetController().mo91271d(new Object[0]);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
