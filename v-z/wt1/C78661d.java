package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wt1.d */
public class C78661d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230360d;

    public C78661d(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230360d = fingerPrintAuthTransparentUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "showSuccessAlert, finish ui!");
        this.f230360d.finish();
    }
}
