package j63;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import te3.C50396mf3;
import yq3.C79148e;

/* renamed from: j63.b */
public class C76395b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C50396mf3 f223701d;

    /* renamed from: e */
    public final /* synthetic */ WalletBaseUI f223702e;

    public C76395b(C50396mf3 mf32, WalletBaseUI walletBaseUI) {
        this.f223701d = mf32;
        this.f223702e = walletBaseUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f223701d.f138010h;
        if (i2 == 14586999) {
            Log.m105924i("MicroMsg.ECardUtil", "do end process");
            C79148e process = this.f223702e.getProcess();
            if (process != null) {
                process.mo91259f(this.f223702e, new Bundle());
            } else {
                this.f223702e.finish();
            }
        } else if (i2 == 14586996) {
            Log.m105924i("MicroMsg.ECardUtil", "back bank list");
            C79148e process2 = this.f223702e.getProcess();
            if (process2 != null) {
                process2.mo91257c(this.f223702e, 100);
            } else {
                this.f223702e.finish();
            }
        }
        dialogInterface.dismiss();
    }
}
