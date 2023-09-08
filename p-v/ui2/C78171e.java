package ui2;

import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitMoneyInputUI;

/* renamed from: ui2.e */
public class C78171e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f229019d;

    /* renamed from: e */
    public final /* synthetic */ BankRemitMoneyInputUI f229020e;

    public C78171e(BankRemitMoneyInputUI bankRemitMoneyInputUI, int i) {
        this.f229020e = bankRemitMoneyInputUI;
        this.f229019d = i;
    }

    public void run() {
        this.f229020e.f203810i.scrollBy(0, this.f229019d);
    }
}
