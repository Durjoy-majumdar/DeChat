package ui2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitMoneyInputUI;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: ui2.h */
public class C78173h implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ int f229022a;

    /* renamed from: b */
    public final /* synthetic */ BankRemitMoneyInputUI f229023b;

    /* renamed from: ui2.h$a */
    public class C78174a implements RemittanceRemarkInputHalfPage.C70829c {
        public C78174a() {
        }

        public void onResult(boolean z, String str, String str2) {
            if (!z) {
                if (!Util.isNullOrNil(str)) {
                    C78173h.this.f229023b.f203796G = str;
                } else {
                    C78173h.this.f229023b.f203796G = "";
                }
                BankRemitMoneyInputUI bankRemitMoneyInputUI = C78173h.this.f229023b;
                int i = BankRemitMoneyInputUI.f203789R;
                bankRemitMoneyInputUI.mo97189N7();
            }
        }
    }

    public C78173h(BankRemitMoneyInputUI bankRemitMoneyInputUI, int i) {
        this.f229023b = bankRemitMoneyInputUI;
        this.f229022a = i;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f229023b;
        if (bankRemitMoneyInputUI.f203804P == null) {
            bankRemitMoneyInputUI.f203804P = new RemittanceRemarkInputHalfPage(bankRemitMoneyInputUI, 10, "", RemittanceRemarkInputHalfPage.C70828b.BankRemit);
        }
        BankRemitMoneyInputUI bankRemitMoneyInputUI2 = this.f229023b;
        String string = bankRemitMoneyInputUI2.getString(C0966R.string.aig, new Object[]{"" + this.f229022a});
        BankRemitMoneyInputUI bankRemitMoneyInputUI3 = this.f229023b;
        bankRemitMoneyInputUI3.f203804P.mo97491a(bankRemitMoneyInputUI3.f203796G, string, new C78174a());
        C115669n.INSTANCE.mo160131h(14673, 4);
    }
}
