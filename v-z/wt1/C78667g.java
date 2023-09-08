package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wt1.g */
public class C78667g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230367d;

    public C78667g(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230367d = fingerPrintAuthTransparentUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "try fingerprint auth again!");
        FingerPrintAuthTransparentUI.m81240J7(this.f230367d);
        this.f230367d.mo94923M7();
        dialogInterface.dismiss();
    }
}
