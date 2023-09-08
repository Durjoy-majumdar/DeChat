package ui2;

import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitMoneyInputUI;
import kg3.C76577a;

/* renamed from: ui2.f */
public class C78172f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BankRemitMoneyInputUI f229021d;

    public C78172f(BankRemitMoneyInputUI bankRemitMoneyInputUI) {
        this.f229021d = bankRemitMoneyInputUI;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f229021d.f203819u.getLayoutParams();
        if (this.f229021d.f203822x.isShown()) {
            layoutParams.width = this.f229021d.f203822x.getRight() + C76577a.m92151b(this.f229021d.getContext(), 8);
        } else {
            layoutParams.width = this.f229021d.f203820v.getRight() + C76577a.m92151b(this.f229021d.getContext(), 8);
        }
        layoutParams.height = C76577a.m92151b(this.f229021d.getContext(), 36);
        this.f229021d.f203819u.setLayoutParams(layoutParams);
        if (this.f229021d.f203822x.isShown()) {
            BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f229021d;
            bankRemitMoneyInputUI.f203820v.setMaxWidth((((bankRemitMoneyInputUI.f203818t.getWidth() - C76577a.m92151b(this.f229021d.getContext(), 20)) - C76577a.m92151b(this.f229021d.getContext(), 8)) - C76577a.m92151b(this.f229021d.getContext(), 12)) - C76577a.m92151b(this.f229021d.getContext(), 16));
            return;
        }
        BankRemitMoneyInputUI bankRemitMoneyInputUI2 = this.f229021d;
        bankRemitMoneyInputUI2.f203820v.setMaxWidth(((bankRemitMoneyInputUI2.f203818t.getWidth() - C76577a.m92151b(this.f229021d.getContext(), 20)) - C76577a.m92151b(this.f229021d.getContext(), 8)) - C76577a.m92151b(this.f229021d.getContext(), 12));
    }
}
