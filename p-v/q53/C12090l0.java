package q53;

import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import r53.C12953c;

/* renamed from: q53.l0 */
public final class C12090l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12062e0 f35177d;

    public C12090l0(C12062e0 e0Var) {
        this.f35177d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f35177d.mo11909a();
        WalletFormView walletFormView = this.f35177d.f35143f;
        if (walletFormView != null) {
            String text = walletFormView.getText();
            C87412m.m108593f(text, "inputArea.text");
            this.f35177d.f35139b.f35192c.mo11921a((long) C12953c.m12401j(text, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("inputArea");
        throw null;
    }
}
