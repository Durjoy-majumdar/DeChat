package u63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_payu.create.p807ui.WalletPayUStartOpenUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: u63.c */
public class C78134c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUStartOpenUI f228977d;

    public C78134c(WalletPayUStartOpenUI walletPayUStartOpenUI) {
        this.f228977d = walletPayUStartOpenUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_payu/create/ui/WalletPayUStartOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f228977d.f211166d.getVisibility() == 0) {
            this.f228977d.getInput().putString("key_mobile", this.f228977d.f211170h);
            this.f228977d.getInput().putString("dial_code", this.f228977d.f211171i);
        }
        this.f228977d.getNetController().mo91271d(new Object[0]);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_payu/create/ui/WalletPayUStartOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
