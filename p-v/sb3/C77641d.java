package sb3;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditChangeAmountUI;

/* renamed from: sb3.d */
public class C77641d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletWXCreditChangeAmountUI f226360d;

    public C77641d(WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f226360d = walletWXCreditChangeAmountUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f226360d.showVKB();
    }
}
