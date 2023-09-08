package gr3;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: gr3.i */
public class C76045i extends NumberKeyListener {
    public C76045i(WalletFormView walletFormView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    public int getInputType() {
        return 3;
    }
}
