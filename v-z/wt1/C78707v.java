package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintEntranceUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;

/* renamed from: wt1.v */
public class C78707v implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintEntranceUI f230415d;

    public C78707v(FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f230415d = fingerPrintEntranceUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FingerPrintEntranceUI", "user click the button to open fingerprint pay");
        C88144b.m109789g(this.f230415d, "wallet", ".pwd.ui.WalletPasswordSettingUI");
        this.f230415d.finish();
    }
}
