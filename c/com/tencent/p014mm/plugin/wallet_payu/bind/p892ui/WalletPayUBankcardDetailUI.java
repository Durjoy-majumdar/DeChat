package com.tencent.p014mm.plugin.wallet_payu.bind.p892ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardDetailUI;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardDetailUI */
public class WalletPayUBankcardDetailUI extends WalletBankcardDetailUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (1 == this.f208430d.field_bankcardState) {
            mo99038J7();
            View findViewById = findViewById(C0966R.C0970id.lex);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.lew);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mo99037I7(false);
        }
        View findViewById3 = findViewById(C0966R.C0970id.lez);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view = findViewById3;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUBankcardDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) findViewById(C0966R.C0970id.f359542lf1)).setText(C0966R.string.kmt);
    }
}
