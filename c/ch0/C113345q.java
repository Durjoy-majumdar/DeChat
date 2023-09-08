package ch0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.address.p879ui.WalletSelectAddrUI;

/* renamed from: ch0.q */
public class C113345q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletSelectAddrUI f339120d;

    public C113345q(WalletSelectAddrUI walletSelectAddrUI) {
        this.f339120d = walletSelectAddrUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        WalletSelectAddrUI walletSelectAddrUI = this.f339120d;
        walletSelectAddrUI.mo174981H7(walletSelectAddrUI.f345289e.f338614d);
    }
}
