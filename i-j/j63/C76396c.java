package j63;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import te3.C50396mf3;
import yq3.C79148e;

/* renamed from: j63.c */
public class C76396c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C50396mf3 f223703d;

    /* renamed from: e */
    public final /* synthetic */ WalletBaseUI f223704e;

    public C76396c(C50396mf3 mf32, WalletBaseUI walletBaseUI) {
        this.f223703d = mf32;
        this.f223704e = walletBaseUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f223703d.f138010h;
        if (i2 == 14586999) {
            Log.m105924i("MicroMsg.ECardUtil", "do end process");
            C79148e process = this.f223704e.getProcess();
            if (process != null) {
                process.mo91259f(this.f223704e, new Bundle());
            } else {
                this.f223704e.finish();
            }
        } else if (i2 == 14586996) {
            Log.m105924i("MicroMsg.ECardUtil", "back bank list");
            C79148e process2 = this.f223704e.getProcess();
            if (process2 != null) {
                process2.mo91257c(this.f223704e, 100);
            } else {
                this.f223704e.finish();
            }
        }
        dialogInterface.dismiss();
    }
}
