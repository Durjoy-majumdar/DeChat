package sb3;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditChangeAmountUI;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: sb3.c */
public class C77640c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletWXCreditChangeAmountUI f226359d;

    public C77640c(WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f226359d = walletWXCreditChangeAmountUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C79148e g = C79143a.m95768g(this.f226359d);
        if (g != null) {
            WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f226359d;
            g.mo91259f(walletWXCreditChangeAmountUI, walletWXCreditChangeAmountUI.getInput());
            return;
        }
        this.f226359d.finish();
    }
}
