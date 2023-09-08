package u63;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.wallet_payu.create.p807ui.WalletPayUStartOpenUI;

/* renamed from: u63.b */
public class C78133b implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUStartOpenUI f228976d;

    public C78133b(WalletPayUStartOpenUI walletPayUStartOpenUI) {
        this.f228976d = walletPayUStartOpenUI;
    }

    public void afterTextChanged(Editable editable) {
        WalletPayUStartOpenUI walletPayUStartOpenUI = this.f228976d;
        int i = WalletPayUStartOpenUI.f211165j;
        walletPayUStartOpenUI.mo99984H7();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
