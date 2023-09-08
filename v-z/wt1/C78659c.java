package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;

/* renamed from: wt1.c */
public class C78659c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230358d;

    public C78659c(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230358d = fingerPrintAuthTransparentUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f230358d;
        int i = FingerPrintAuthTransparentUI.f198183q;
        fingerPrintAuthTransparentUI.mo94926P7();
        this.f230358d.finish();
    }
}
