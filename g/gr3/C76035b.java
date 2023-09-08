package gr3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gr3.C76024a;

/* renamed from: gr3.b */
public class C76035b extends C76024a.C76034j {
    public C76035b() {
        super((C76024a.C76026b) null);
    }

    /* renamed from: d */
    public boolean mo99320d(WalletFormView walletFormView) {
        return Util.isValidEmail(walletFormView.getText());
    }
}
