package q53;

import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gy3.C87412m;
import p53.C11844l;
import r53.C12953c;

/* renamed from: q53.g1 */
public final class C47761g1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ WeCoinEncashView f128279a;

    /* renamed from: b */
    public final /* synthetic */ long f128280b;

    public C47761g1(WeCoinEncashView weCoinEncashView, long j) {
        this.f128279a = weCoinEncashView;
        this.f128280b = j;
    }

    public final void onClick(View view) {
        C11844l lVar = this.f128279a.f117270i;
        if (lVar != null) {
            lVar.mo11729e3(4);
            WalletFormView walletFormView = this.f128279a.f117267f;
            if (walletFormView != null) {
                walletFormView.setText(C75228t.m90260n(C12953c.m12393b(this.f128280b + "", "100", 2)));
                WalletFormView walletFormView2 = this.f128279a.f117267f;
                if (walletFormView2 != null) {
                    walletFormView2.getContentEt().requestFocus();
                    this.f128279a.showWcKb();
                    return;
                }
                C87412m.m108603p("mInputMoneyText");
                throw null;
            }
            C87412m.m108603p("mInputMoneyText");
            throw null;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
