package q53;

import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gy3.C87412m;

/* renamed from: q53.m0 */
public final class C12094m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12062e0 f35181d;

    public C12094m0(C12062e0 e0Var) {
        this.f35181d = e0Var;
    }

    public final void run() {
        WalletFormView walletFormView = this.f35181d.f35143f;
        if (walletFormView != null) {
            walletFormView.mo105095m();
        } else {
            C87412m.m108603p("inputArea");
            throw null;
        }
    }
}
